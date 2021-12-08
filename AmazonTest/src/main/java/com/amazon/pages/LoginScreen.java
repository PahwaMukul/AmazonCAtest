package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.AmazonBase;

public class LoginScreen extends AmazonBase {
	@FindBy(xpath="//input[@type=\"email\"]//preceding-sibling::label")
	WebElement login_label;

	public LoginScreen() {
		PageFactory.initElements(driver, this);
	}
	public String LoginLabel() {
		String label = login_label.getText();
		return label;
		
	}
	
	
}
