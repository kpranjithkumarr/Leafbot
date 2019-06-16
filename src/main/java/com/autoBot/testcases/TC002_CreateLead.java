package com.autoBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.autoBot.pages.LoginPage;
import com.autoBot.testng.api.base.Annotations;
// Annotations == ProjectBase
public class TC002_CreateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_CreateLead";
		testcaseDec = "Create Lead with company name, first name & last name";
		author = "Ranjith";
		category = "smoke";
		excelFileName = "TC002";
	} 

	@Test(dataProvider="fetchData") 
	public void loginAndLogout(String uName, String pwd) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCrmSfaPage()
		.ClickOnLeadPage()
		.ClickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.enterSubmitButton()
		.VerifyFirstame();
	}
	
}






