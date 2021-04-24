package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setFileName() {
		excelFileName = "CreateLead";
	}

	@Test(dataProvider ="fetchData")
	public void runeditLead(String username,String password,String company,String fName,String lName,String number,String cname)  throws InterruptedException {
	new LoginPage(driver).enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(company)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()	
		.verifyFirstName();
}}
