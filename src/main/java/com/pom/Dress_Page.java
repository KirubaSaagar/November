package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//span[@itemprop='price'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="//img[@width='250']")
	private WebElement image;
	
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement quickview;

	@FindBy(xpath="//iframe[@vspace='0']")
	private WebElement frame;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(name="Blue")
	private WebElement color;
	
	@FindBy(name="Submit")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement ptc;

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getPtc() {
		return ptc;
	}

	public WebElement getQuickview() {
		return quickview;
	}


	public Dress_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getImage() {
		return image;
	}
	
	

}
