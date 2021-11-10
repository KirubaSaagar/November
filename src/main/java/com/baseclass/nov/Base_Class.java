package com.baseclass.nov;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	//public static TakesScreenshot ts; -->if we declare this and use,we have to use takesscreenshot twice so we dont use this and we put in that screenshotname section and call it only once
	
	public static JavascriptExecutor js;
	
	public static Actions a;
	
	public static WebDriver driver; //--->Null
	
	public static WebDriver getBrowser(String type) {
		
	try {
		
	if (type.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		 driver = new ChromeDriver();
		
	}
	
	else if (type.equalsIgnoreCase("firefox")) {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");
		
		 driver = new ChromeDriver();
		
	}
	
	driver.manage().window().maximize();
	
	} 
	
	catch (Exception e) {
		
		System.out.println("webdriver error"+e.getMessage());
		
	}
		
	return driver;
		
	}
	
//	public static void windowMaximise() {
//	
//		 driver.manage().window().maximize();
//
//	}
		
 public static void ClickOnElement(WebElement element) {
	 
	 try {

	 element.click();
	 
	 }catch (Exception e) {
		 
		 System.out.println("click error "+ e.getMessage());
		
	}
	 
}
 
 public static void inputValueElement(WebElement element, String value) {
	 
	 try {
	
	 element.sendKeys(value);
	 
	 }catch (Exception e) {
		
		 System.out.println("sendkeys exception "+e.getMessage());
	}
	 

}
 
 public static void getURL(String url) {
	 
	 try {
	
    driver.get(url);
    
	 }catch (Exception e) {
		 
		System.out.println("url error "+e.getMessage());
	}
	 
}
 
// public static void screenShot() {
//
//	  ts = (TakesScreenshot) driver;
//
//}
 
 public static void screenShotName(String imgName) throws IOException {
	 
	 try {
		 
		 TakesScreenshot ts = (TakesScreenshot) driver;
	
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\Saagar\\eclipse-workspace\\Selenium_Testing\\Screenshots\\"+imgName+".png");
		
		FileHandler.copy(src, des);
		
	 }catch (Exception e) {
		
		 System.out.println("screenshot error "+e.getMessage());
	}
	 	 
}
 
 public static void javaScriptExe() {

	  js = (JavascriptExecutor) driver;
	  
}
 
 public static void jseScrollIntoView(WebElement element) {
	 
	 js.executeScript("arguments[0].scrollIntoView();", element);
	
}
 
 public static void jseScrollBy(int range) {
	
	 js.executeScript("window.scrollBy(0,"+range+");");
}
 
 public static void jseClick(WebElement element) {

    js.executeScript("arguments[0].click();", element);

}
 
 public static void jseSendKeys(String value, WebElement element) {
	 
	 js.executeScript("arguments[0].value="+value+"';", element);

}
 
 public static void scrollUpAndDown(WebElement element) {
	 
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	jse.executeScript("arguments[0].scrollIntoView();", element); 

}
 
 public static void threadSleep(int milliseconds) throws InterruptedException {
	
	 Thread.sleep(milliseconds);

}
 
 public static void refresh() {

 driver.navigate().refresh();

}
 
 public static void dropDownCheck(WebElement element) {
	 
	 try {
	
	 Select s = new Select(element);
	 
	 List<WebElement> options = s.getOptions();
	 
	 System.out.println("All the available options are");
	 
	 for (WebElement opt : options) {
		 
		 System.out.println(opt.getText());
		
	}
	 
	 boolean multiple = s.isMultiple();
	 
	 if (multiple==true) {
		 
		 System.out.println("Multiple Dropdown");
		
	} else {
		
		System.out.println("Single Dropdown");

	}
	 
	 int size = options.size();
	 
	 System.out.println("Index to be selected between 0 & "+ (size-1));

}catch (Exception e) {
	
	System.out.println("error in dropdowncheck element "+ e.getMessage());

}
}
 
 public static void dropDownSelectByValue(WebElement element, String value) {
	
	 Select s = new Select(element);
	 
	 s.selectByValue(value);

}
 
 public static void dropDownSelectByVisibleText(WebElement element, String text) {
	 
	 Select s = new Select(element);
	 
	 s.selectByVisibleText(text);

}
 
 public static void dropDownSelectByIndex(WebElement element, int index) {
	
	 Select s = new Select(element);
	 
	 s.selectByIndex(index);

}
 
 public static void alertAccept() {
	
	 driver.switchTo().alert().accept();

}
 
 public static void alertDismiss() {
	
	 driver.switchTo().alert().dismiss();

}
 
 public static void parentFrame() {
	
	 driver.switchTo().parentFrame();

}
 
 public static void defaultContent() {
	
	 driver.switchTo().defaultContent();

}
 
 public static void switchToFrame(String id) {
	
	 driver.switchTo().frame(id);

}
 
 public static void switchToFrame(int index) {
	
	 driver.switchTo().frame(index);

}
 
 public static void switchToFrame(WebElement element) {
	
	 driver.switchTo().frame(element);

}
 
 public static void mouseActions() {
	
	 a = new Actions(driver);

}
 
 public static void moveToElement(WebElement element) {
	
	 a.moveToElement(element).build().perform();

}
 
 public static void rightClick(WebElement element) {
	
	 a.contextClick(element).build().perform();

}
 public static void mouseClick(WebElement element) {
	
	 a.click(element).build().perform();

}
 
 public static void mouseActionsSelect(String options, WebElement element) {
	 
	 try {
	
	 Actions ac = new Actions(driver);
	 
	 if (options.equalsIgnoreCase("moveto")) {
		 
		 ac.moveToElement(element).build().perform();
		
	}
	 
	 else if (options.equalsIgnoreCase("rightclick")) {
		 
		 ac.contextClick(element).build().perform();
		
	}
	 
	 else if (options.equalsIgnoreCase("click")) {
		 
		 ac.click(element).build().perform();
		
	}
	}catch (Exception e) {
	
		System.out.println("actions exception "+e.getMessage());
	}

}
 
 public static void explicitWait(int seconds, WebElement element) {
	
	 WebDriverWait wait = new WebDriverWait(driver, seconds);
	 
	 wait.until(ExpectedConditions.visibilityOf(element));

}
 
 public static void allWindowsId() {
	 
	 try {

	 Set<String> allwindowsid = driver.getWindowHandles();

	 for (String id : allwindowsid) {
		 
		 String ids = driver.switchTo().window(id).getTitle();
		 
		 System.out.println(ids);
		
	}
	}catch (Exception e) {
		
		System.out.println("error in windowsid "+e.getMessage());
		
	}
}
 
 public static void switchToWindow(String window) {
	 
	 try {
	 
      Set<String> allwindowsid = driver.getWindowHandles();	 
	 
      for (String id : allwindowsid) {
    	  
    	  String ids = driver.switchTo().window(id).getTitle();
		
	}
 
      String title = window;
      
      for (String id : allwindowsid) {
    	  
    	  if (driver.switchTo().window(id).getTitle().equals(title)) {
    		  
    		  break;
			
		}
		
	}
	}catch (Exception e) {
		
		System.out.println("error in switching between windows"+ e.getMessage());
	}  
    
 
 
 }
 
 public static void particularWindowClose(String window) {
	 
	 try {
		 
	      Set<String> allwindowsid = driver.getWindowHandles();	 
		 
	      for (String id : allwindowsid) {
	    	  
	    	  String ids = driver.switchTo().window(id).getTitle();
			
		}
	 
	      String title = window;
	      
	      for (String id : allwindowsid) {
	    	  
	    	  if (driver.switchTo().window(id).getTitle().equals(title)) {
	    		  
	    		  driver.close();
				
			}
			
		}
		}catch (Exception e) {
			
			System.out.println("error in closing windows"+ e.getMessage());
		}  
	

}
 
 public static void quit() {
	
    driver.quit();
	 
}
 
 public static void close() {

     driver.close();
}
 
 public static void implicitWait(int time ) {
	
	 driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

}

 public static void tableAllData() {
	 
	 try {
	
	 List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
	 
	 for (WebElement data : alldata) {
		 
		 System.out.println(data.getText());
		
	}
	}catch (Exception e) {
		
		System.out.println("error in getting all table data "+e.getMessage());
		
	} 
	 

}
 
 public static void tableRowData(int row) {
	 
	 try {
	
	 List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr["+row+"]/td"));
	 
	 for (WebElement data : rowdata) {
		 
		 System.out.println(data.getText());
		
	}
	}catch (Exception e) {
	
		System.out.println("error in getting all row data "+e.getMessage());
		
	} 

}
 
public static void tableColumnData(int column) {
	
	try {
	
	List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td["+column+"]"));
	
    for (WebElement data : columndata) {
    	
    	System.out.println(data.getText());
		
	}
	}catch (Exception e) {
		
		System.out.println("error in getting all column data "+e.getMessage());
		
	}

} 

public static void tableparticulardata(int row, int column) {
	
	try {
	
	WebElement data = driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td["+column+"]"));

	String text = data.getText();
	
	System.out.println(text);

}catch (Exception e) {
	
	System.out.println("error in tableparticular data"+e.getMessage());
	
	e.printStackTrace();
  	}
}

public static void tableheader() {
	
	try {
	
		WebElement header = driver.findElement(By.tagName("th"));	
		
		System.out.println(header.getText());	
		
	}catch (Exception e) {
		
		System.out.println("error in header"+e.getMessage());
		
		e.printStackTrace();
	}
}

public static void printnewline() {

	System.out.println();
}

public static void tableColumnsSize() {
	
	try
	{
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		
		int columnsize = columns.size();
			
		System.out.println("The column size of table is "+columnsize);	
	
	}catch (Exception e) {
		
		e.getMessage();
		
		e.printStackTrace();
	
	}

}

public static void printData(String data) {
	
	System.out.println(data);

}

public static void tableRowsSize() {
	
	try {

	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	
	int rowsize = rows.size();
		
	System.out.println("The row size of table is "+rowsize);	
	
	}catch (Exception e) {
	
		e.getMessage();
		
		e.printStackTrace();
	}

}


 public static void dropdown(WebElement element, String type, String value) {
	 
	 try {
	
	 Select s = new Select(element);
	 
	 if (type.equalsIgnoreCase("byvalue")) {
		 
		 s.selectByValue(value);
		
	}
	 
	 else if (type.equalsIgnoreCase("byvisibletext")) {
		 
		 s.selectByVisibleText(value);
		 
	}
	 
	 else if (type.equalsIgnoreCase("byindex")) {
		 
		 int data = Integer.parseInt(value);
		 
		 s.selectByIndex(data);
		
	}
	}catch (Exception e) {
		
		System.out.println("error in select "+e.getMessage());
		
	} 
	 
}
 
 public static void robotDown() throws AWTException {
	
	 Robot r = new Robot();
	 
	 r.keyPress(KeyEvent.VK_DOWN);
	 
	 r.keyRelease(KeyEvent.VK_DOWN);

}
 
 public static void robotEnter() throws AWTException {
	
	 Robot r = new Robot();
	 
	 r.keyPress(KeyEvent.VK_ENTER);
	 
	 r.keyRelease(KeyEvent.VK_ENTER);

}
 
 public static void robotoptions(int keycode) throws AWTException {
	 
	 try {
	
	Robot r = new Robot(); 
	
	r.keyPress(keycode);
	
	r.keyRelease(keycode);
	
	 }catch (Exception e) {
		
		 System.out.println("robot class error "+ e.getMessage());
	}

}
 
 public static void displayedOrNot(WebElement element) {

	 boolean displayed = element.isDisplayed();
	 
	 try {
	 
	 if (displayed==true) {
		 
		 System.out.println("Element is displayed");
		
	} else {
		
		System.out.println("Element is not displayed");

	}
	}catch (Exception e) {
		 
		e.getMessage();
		e.printStackTrace();
	} 
	 
}
 
 public static void selectedOrNot(WebElement element) {

	 boolean selected = element.isSelected();
	 
	 try {
	 
	 if (selected==true) {
		 
		 System.out.println("Element is selected");
		
	} else {
		
		System.out.println("Element is not selected");
		
	}
	}catch (Exception e) {
		
		e.getMessage();
		e.printStackTrace();
	}
	 
}
 
 public static void EnabledOrNot(WebElement element) {
	 
	 boolean enabled = element.isEnabled();
	 
	 try {
	 
	 if (enabled==true) {
		
		 System.out.println("Element is enabled");
		 
	} else {
		
		System.out.println("Element is not enabled");

	}
	}catch (Exception e) {
		
		e.getMessage();
		e.printStackTrace();
	}

}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	
	
}
