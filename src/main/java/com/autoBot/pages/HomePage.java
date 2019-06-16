package com.autoBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoBot.testng.api.base.Annotations;

public class HomePage extends Annotations {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(how = How.TAG_NAME, using = "h2")
	WebElement eleverifyLoginName;
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement eleLogout;
	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA")
	WebElement clickCrmSfaPage;

	public HomePage verifyLoginName(String Data) {
		verifyExactText(eleverifyLoginName, Data);
		return this;
	}

	public LoginPage clickLogout() {
		click(eleLogout);
		return new LoginPage();
	}
	
	public MyHomePage clickCrmSfaPage() {
		click(clickCrmSfaPage);
		return new MyHomePage();
	}

}
