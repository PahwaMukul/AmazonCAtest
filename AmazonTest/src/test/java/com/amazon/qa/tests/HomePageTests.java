package com.amazon.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.pages.LoginScreen;
import com.amazon.pages.OrderPage;
import com.amazon.qa.base.AmazonBase;
import com.beust.jcommander.Parameter;
import com.amazon.pages.*;

public class HomePageTests extends AmazonBase{
	LoginScreen loginscreen;
	OrderPage orderpage;
	HomePage homepage;
	
	public HomePageTests() {
		super();
	}
	
	
	@BeforeMethod()
		public void setup() {
			initialization();
			homepage =new HomePage();
		}
		
	@Test(priority=1)
	  public void DeviceSelectionTest() {
		orderpage= homepage.SelectDevice();
		loginscreen=orderpage.Buy_Click();
		String label= loginscreen.LoginLabel();
		Assert.assertEquals(label, prop.getProperty("loginlabeltest"));
	}
	@Test(priority=2)
	public void titleTest() {
		driver.getTitle();
		Assert.assertEquals(driver.getTitle(),"Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
	

  

