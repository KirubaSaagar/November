package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement ptc2;

	public Address(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPtc2() {
		return ptc2;
	}

}
