package PageObjects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;

public class ProductsScreen {

	AndroidDriver driver;
	static TouchAction action;

	public ProductsScreen(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Speakers\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]/android.widget.ImageView")
	private WebElement productBose;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement checkBose;
	
	public void clickProduct() {
		action = new TouchAction(driver);
		action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000))).perform();
		productBose.click();
	}
	
	public void checkProduct() {
		Assert.assertTrue(checkBose.getText().contains("BOSE"));
	}
	
	
}
