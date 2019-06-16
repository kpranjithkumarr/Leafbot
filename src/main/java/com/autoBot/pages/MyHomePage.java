package com.autoBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoBot.testng.api.base.Annotations;

public class MyHomePage extends Annotations{ 

	public MyHomePage() {
		PageFactory.initElements(driver, this); 
	}
	@CacheLookup
	@FindBy(how=How.LINK_TEXT, using="Leads") 
	WebElement eleMyLeadsPage;

	public MyLeadsPage ClickOnLeadPage() {
		click(eleMyLeadsPage);
		return new MyLeadsPage();
	}
	
}


