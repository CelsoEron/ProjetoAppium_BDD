package managers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.remote.DesiredCapabilities;

import dataProviders.ReadProperties;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DriverManager {
	private String apkFile;
	private String deviceName;
	private static String URL = "http://127.0.0.1:4723/wd/hub";
	private AndroidDriver<AndroidElement> driver;
	private String port;
	private Logger logger = Logger.getLogger("ReadProperties.class");

	public AndroidDriver<AndroidElement> getDriver() {
		if (driver == null)
			driver = createDriver();
		return driver;
	}

	private AndroidDriver<AndroidElement> createDriver() {
		ReadProperties prop = new ReadProperties("mobile");
		Properties props = prop.getProperty();
		deviceName = props.getProperty("deviceName");
		String platformVersion = props.getProperty("platformVersion");
		String platformName = props.getProperty("platformName");
		String appPackage = props.getProperty("appPackage");
		String appActivity = props.getProperty("appActivity");
		port = props.getProperty("port");
		String apkFilePath = props.getProperty("apkFilePath");
//		int waitTime = Integer.parseInt(props.getProperty("waitTime"));

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", deviceName);
		capabilities.setCapability("platformName", platformName);
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);
		try {
			driver = new AndroidDriver<AndroidElement>(new URL(URL), capabilities);
		} catch (MalformedURLException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver;
	}

	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}