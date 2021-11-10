package com.Runner;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.nov.Base_Class;
import com.pom.Account_Page;
import com.pom.Address;
import com.pom.Dress_Page;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Payment;
import com.pom.Shipping;
import com.pom.Summary;

public class Test_Runner extends Base_Class {
	
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	
	public static Home_Page hp = new Home_Page(driver);
	
	public static Login_Page login = new Login_Page(driver);
	
	public static Account_Page ap = new Account_Page(driver);
	
	public static Dress_Page dp = new Dress_Page(driver);
	
	public static Summary sum = new Summary(driver);
	
	public static Address add = new Address(driver);
	
	public static Shipping sh = new Shipping(driver);
	
	public static Payment pay = new Payment(driver);
	
public static void main(String[] args) throws IOException {
	
	getURL("http://automationpractice.com/index.php");
	
	implicitWait(30);
	
	ClickOnElement(hp.getSignin_btn()); 
		
	inputValueElement(login.getEmail(), "walterwhitesr07@gmail.com"); 
		
	inputValueElement(login.getPassword(), "whitesr07"); 
		
	ClickOnElement(login.getLogin_btn()); 
		
	mouseActionsSelect("moveto", ap.getWomen()); 
		
	ClickOnElement(ap.getTshirt()); 
		
	scrollUpAndDown(dp.getDress());
		
	mouseActionsSelect("moveto", dp.getImage()); 
		
	mouseActionsSelect("click", dp.getQuickview()); 
		
    switchToFrame(dp.getFrame());
        
    dropdown(dp.getSize(), "byvalue", "2"); 
        
    ClickOnElement(dp.getColor()); 
        
    ClickOnElement(dp.getAddtocart()); 
    
    defaultContent(); 
    	
	ClickOnElement(dp.getPtc()); 
		
	ClickOnElement(sum.getPtc1()); 
		
	ClickOnElement(add.getPtc2()); 
		
	ClickOnElement(sh.getTerms()); 
		
	ClickOnElement(sh.getPtc3()); 
		
	ClickOnElement(pay.getPayment()); 
		
	ClickOnElement(pay.getFinalcheckout());
		
	scrollUpAndDown(pay.getBack());
	
	screenShotName("min");
	
	quit();
		
}

}
