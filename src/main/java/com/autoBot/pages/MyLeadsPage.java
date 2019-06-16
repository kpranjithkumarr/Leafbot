package com.autoBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoBot.testng.api.base.Annotations;

public class MyLeadsPage extends Annotations{ 

	public MyLeadsPage() {
		PageFactory.initElements(driver, this); 
	}
@CacheLookup
@FindBy(how=How.LINK_TEXT, using="Create Lead")
WebElement eleCreateLeadPage;
@FindBy(how=How.LINK_TEXT, using="Find Leads")
WebElement eleFindLeadsPage;
	
public CreateLeadPage ClickCreateLead() {
		click(eleCreateLeadPage);
		return new CreateLeadPage();
	}

public FindLeadsPage clickFindLeads() {
	click(eleFindLeadsPage);
	return new FindLeadsPage();
}
	
	}
	



