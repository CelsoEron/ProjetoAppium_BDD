package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {

	WebDriver driver;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement btnMenu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement btnLogin;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewSingUpToday")
	private WebElement btnCreateAccount;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView")
	private WebElement bxCategorySpeaker;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement bxUser;
	
	public void clickMenu() {
		btnMenu.click();
	}

	public void clickBtnLogin() {
		btnLogin.click();
	}

	public void clickCreateAccount() {
		btnCreateAccount.click();
	}

	public void clickCategorySpeaker() {
		bxCategorySpeaker.click();
	}
	
	public boolean checkUser() {
		return bxUser.getText().contains("");
	}

}
