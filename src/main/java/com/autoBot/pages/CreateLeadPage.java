package com.autoBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoBot.testng.api.base.Annotations;

public class CreateLeadPage extends Annotations{ 

	public CreateLeadPage() {
		PageFactory.initElements(driver, this); 
	}
@CacheLookup
@FindBy(how=How.ID, using="createLeadForm_companyName")
WebElement eleCompanyName;
@FindBy(how=How.ID, using="createLeadForm_firstName")
WebElement eleFirstName;
@FindBy(how=How.ID, using="createLeadForm_lastName")
WebElement eleLastName;
@FindBy(how=How.XPATH, using="//input[@value='Create Lead']")
WebElement eleSubmitCreateLead;

	
public CreateLeadPage enterCompanyName() {
		click(eleCompanyName);
		eleCompanyName.sendKeys("HCL Dabba");
		return this;	
	}
public CreateLeadPage enterFirstName() {
	click(eleFirstName);
	eleFirstName.sendKeys("Basha");
	return this;
}
public CreateLeadPage enterLastName() {
	click(eleLastName);
	eleFirstName.sendKeys("Maanik Basha");
	return this;
}
public ViewLeadsPage enterSubmitButton() {
	click(eleSubmitCreateLead);
	return new ViewLeadsPage();
}



	
	}
	



