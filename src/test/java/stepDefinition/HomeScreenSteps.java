package stepDefinition;

import org.junit.Assert;

import PageObjects.HomeScreen;
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

	@Dado("^que estou na tela de cadastro$")
	public void que_estou_na_tela_de_cadastro() throws Throwable {
		home.clickMenu();
		home.clickBtnLogin();
		home.clickCreateAccount();
	}

	@Entao("^deve retornar para a pagina inicial logado na conta criada$")
	public void deve_retornar_para_a_pagina_inicial_logado_na_conta_criada() {
		home.clickMenu();
		Assert.assertTrue(home.checkUser());

	}

	@Dado("^que estou na tela principal$")
	public void que_estou_na_tela_principal() {

	}

	@Quando("^escolho a categoria desejado$")
	public void escolho_a_categoria_desejado() {
		home.clickCategorySpeaker();
	}

}
