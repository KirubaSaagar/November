package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	private WebElement payment;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement finalcheckout;
	
	@FindBy(xpath="//li[@class=\"step_done second\"]")
	private WebElement back;

	public WebElement getBack() {
		return back;
	}

	public Payment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getFinalcheckout() {
		return finalcheckout;
	}

}
