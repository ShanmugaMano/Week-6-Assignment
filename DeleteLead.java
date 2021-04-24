package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setFileName() {
		excelFileName = "DeleteLead";
	}

	@Test(dataProvider ="fetchData")
	public void runDeleteLead(String username,String password,String company,String fName,String lName,String number,String cname)  throws InterruptedException {
		new LoginPage(driver).enterUsername(username).enterPassword(password).clickLoginButton().clickCrmsfaLink().clickLeadsLink().clickCreateLeadLink()
		.clickPhoneTab()
		.enterPhoneNumber(number).clickFindLead().clickLead().clickDelete();
}}


