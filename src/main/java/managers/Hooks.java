package managers;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import runners.TestRunner;

public class Hooks {

	AndroidDriver driver;
	TestContext testContext;
	DriverManager manager;

	public Hooks(TestContext context) {
		testContext = context;
		manager = testContext.getDriverManager();
		driver = manager.getDriver();
	}

	@Before
	public void BeforeSteps() {
		manager.getDriver();
	}

	@AfterClass
	public void afterScenario(Scenario scenario) throws IOException, InterruptedException {

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		File sourcePath = ((TakesScreenshot) testContext.getDriverManager().getDriver())
				.getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(TestRunner.folderPath + "/" + screenshotName + ".png");

		Files.copy(sourcePath, destinationPath);

		Reporter.addScreenCaptureFromPath(destinationPath.toString());
	}

	@After()
	public void AfterSteps() {
		testContext.getDriverManager().closeDriver();
	}

}