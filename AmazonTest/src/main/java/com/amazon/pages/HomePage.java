package com.amazon.pages;

import org.openqa.selenium.WebElement;

import com.amazon.qa.base.AmazonBase;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AmazonBase {

	@FindBy(id="nav-hamburger-menu")
	WebElement hamburger;
	
	@FindBy(xpath="//a[@data-menu-id='4']//div")
	WebElement device_kindle;
	
	@FindBy(xpath="//a[@class='hmenu-item' and text()='Kindle']")
	WebElement kindle;
	
	
	
	public HomePage() {
	PageFactory.initElements(driver,this);
		}
	

	public String validateHomePageTitle() {
	return driver.getTitle();
	}
	
	public OrderPage SelectDevice() {
		hamburger.click();
		device_kindle.click();
		kindle.click();
		return new OrderPage();
		
	}
}
