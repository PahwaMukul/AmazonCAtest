package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.AmazonBase;

public class OrderPage extends AmazonBase {
	
	@FindBy(id="buy-now-button")
	WebElement buy_now;
	
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
 
	public LoginScreen Buy_Click()  {	
		buy_now.click();
		return new LoginScreen();
	}
}
