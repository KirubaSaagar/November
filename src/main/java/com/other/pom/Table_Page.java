package com.other.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Table_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//h5[text()='Table']")
	private WebElement tabl;
	
	@FindBy(xpath="//td[text()='Week 2']/preceding-sibling::td/input[@type='checkbox']")
	private WebElement check1;
	
	@FindBy(xpath="(//input[@name='vital'])[4]")
	private WebElement check4;
	
	@FindBy(xpath="//td[text()='80%']/following-sibling::td/input[@name='vital']")
	private WebElement neww;
	
	public WebElement getNeww() {
		return neww;
	}

	public Table_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getTabl() {
		return tabl;
	}

	public WebElement getCheck1() {
		return check1;
	}

	public WebElement getCheck4() {
		return check4;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	@FindBy(xpath="//td[text()='Gopi']/preceding-sibling::td[2]/child::input")
	private WebElement checkbox;
	
}
