package stepDefinition;

import PageObjects.RegisterScreen;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;
import managers.TestContext;

public class RegisterScreenSteps {

	RegisterScreen register;
	AndroidDriver driver;
	TestContext testContext;

	public RegisterScreenSteps(TestContext context) {
		testContext = context;
		register = testContext.getPageObjectManager().getRegisterScreen();
	}

	@Quando("^eu preencho todos os campos obrigatorios$")
	public void eu_preencho_todos_os_campos_obrigatorios() {
		register.enterUsername(username);
		register.enterEmail(email);
		register.enterPassword(password);
		register.enterConfirmPassword(confirmPassword);
		register.enterFirstName(firstName);
		register.enterLastName(lastName);
		register.enterPhone(phone);
		register.scrollDown();
		register.slcCountry(country);
		register.enterState(state);
		register.enterAddress(address);
		register.enterCity(city);
		register.enterZIP(zip);
		register.clickBtnRegister(true);
	}

	String username = "CelsoRon";
	String email = "celso.silva@rsinet.com.br";
	String password = "Test1234";
	String confirmPassword = password;
	String firstName = "Celso Eron";
	String lastName = "de Almeida";
	String country = "Brazil";
	String phone = "1199999999";
	String state = "SP";
	String address = "Rua da rua";
	String city = "Osasco";
	String zip = "0000000";
}