package com.autoBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.autoBot.testng.api.base.Annotations;

public class ViewLeadsPage extends Annotations{ 

	public ViewLeadsPage() {
	}

	public ViewLeadsPage VerifyFirstame() {
		String text = "Basha Bhai";
				String pageSource = driver.getPageSource();
		if(text.contains(pageSource)) {
			System.out.println("First name" + text + "is present in the webpage");
		}
		else {
			System.out.println("First name" + text + "is present in the webpage");
		}
		return this;
	}
	
	
	
	
	
	
	
	}
	



