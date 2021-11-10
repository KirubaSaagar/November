package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	
	public WebDriver driver;
	
	@FindBy(id="cgv")
	private WebElement terms;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement ptc3;

	public Shipping(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getPtc3() {
		return ptc3;
	}

}
