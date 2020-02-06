package managers;

import org.openqa.selenium.WebDriver;

import PageObjects.HomeScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PageObjectManager {
	private WebDriver driver;
	private HomeScreen home;

	public PageObjectManager(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public HomeScreen getHomeScreen() {
		return (home == null) ? home = new HomeScreen(driver) : home;
	}

}