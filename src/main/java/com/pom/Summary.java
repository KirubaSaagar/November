package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title=\"Proceed to checkout\"])[2]")
	private WebElement ptc1;

	public Summary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPtc1() {
		return ptc1;
	}
	
	

}
