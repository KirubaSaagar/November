package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver; //----->null
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin_btn;

	public Home_Page(WebDriver driver2) {
		
		this.driver = driver2;  //this.driver = from test runner driver
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getSignin_btn() {
		return signin_btn;
	}

}
