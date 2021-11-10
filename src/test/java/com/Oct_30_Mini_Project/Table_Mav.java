package com.Oct_30_Mini_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.nov.Base_Class;
import com.other.pom.Table_Page;

public class Table_Mav extends Base_Class{
	
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	
	public static Table_Page tp = new Table_Page(driver);
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		getURL("http://www.leafground.com/");
		
		implicitWait(30);
					
		mouseActionsSelect("rightclick", tp.getTabl());
		
		robotDown();
		
		robotoptions(KeyEvent.VK_ENTER);
		
		screenShotName("table");
		
		threadSleep(10000);
			
		allWindowsId();
		
		switchToWindow("TestLeaf - Interact with Tables");
		
		printData("---------ALL DATA-------------");
						
		tableAllData();	
			
		printData("-----------ROW DATA----------------");
		
		tableRowData(3);
					
		printData("----------COLUMN DATA--------------");
		
		tableColumnData(6);
						
		printData("----------PARTICULAR DATA-----------");
		
		ClickOnElement(tp.getCheck1());
				
		ClickOnElement(tp.getNeww());
	    
	    selectedOrNot(tp.getCheck1());
		
		ClickOnElement(tp.getCheck4());
		
		tableparticulardata(5, 5);
		
		tableheader();
			
		printnewline();	
					
		ClickOnElement(tp.getCheckbox());
		
		printData("---------------COLUMN SIZE---------------------");
		
		tableColumnsSize();
			
		printData("------------ROW SIZE-------------------------");		
		
		tableRowsSize();
		
		screenShotName("tabl");
			
		particularWindowClose("TestLeaf - Selenium Playground");	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}

}
