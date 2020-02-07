package stepDefinition;

import PageObjects.HomeScreen;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;
import managers.TestContext;

public class HomeScreenSteps {

	HomeScreen home;
	AndroidDriver driver;
	TestContext testContext;

	public HomeScreenSteps(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomeScreen();
	}

	@Dado("^que estou com o aplicativo aberto$")
	public void que_estou_com_o_aplicativo_aberto() throws Throwable {
		home.clickMenu();
		home.clickBtnLogin();
		home.clickCreateAccount();
	}

	@Quando("^clico no bot?o de registrar$")
	public void clico_no_bot_o_de_registrar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^deve retornar para a pagina inicial logado na conta criada$")
	public void deve_retornar_para_a_pagina_inicial_logado_na_conta_criada() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^eu preencho todos os campos obrigatorios, exceto o email$")
	public void eu_preencho_todos_os_campos_obrigatorios_exceto_o_email() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^o bot?o de registrar deve estar indisponivel para cliques$")
	public void o_bot_o_de_registrar_deve_estar_indisponivel_para_cliques() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
