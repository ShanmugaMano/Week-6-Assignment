package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class verifyLoginWithValidData extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setFileName() {
		excelFileName = "Login";
	}
	
	
	
	@Test
	public void loginLogout() throws InterruptedException {
		
		//LoginPage lp = new LoginPage();
		new LoginPage(driver)
		.enterUsername("DemoSalesmanager")
		.enterPassword("crmsfa")
		.clickLoginButton()
		.verifyHomePage();
}
}
