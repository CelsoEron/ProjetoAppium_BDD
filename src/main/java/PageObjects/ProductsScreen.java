package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

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

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement checkNotFound;

	public void checkProductNotFound() {
		Assert.assertTrue(checkNotFound.getText().contains("No results"));
	}

	public void clickProduct() {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ "BOSE SOUNDLINK WIRELESS SPEAKER" + "\").instance(0))")
				.click();
	}

	public void checkProduct() {
		Assert.assertTrue(checkBose.getText().contains("BOSE"));
	}

}
