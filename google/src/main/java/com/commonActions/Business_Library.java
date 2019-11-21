package com.commonActions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Business_Library {
	
	public static WebDriver dr;
	public static WebElement element;
	
	//opening a browser
	public static void openBrowser (String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\ConfigDrivers\\chromedriver.exe");
				dr = new ChromeDriver();
			} 
			else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\ConfigDrivers\\IEDriverServer.exe");
				dr = new InternetExplorerDriver();
			} 
			else if (browser.equalsIgnoreCase("gecko")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\ConfigDrivers\\geckodriver.exe");
		        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		        capabilities.setCapability("marionette", true);
		        dr = new FirefoxDriver(capabilities);
			}
			else {
				System.out.println("Invalid browser selection");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//launching the application
	public static void launchApp (String url) {
		try {
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			dr.get(url);
		} catch (Exception a) {
			a.printStackTrace();
		}
	}
	
	//mouse click
	public static void moouseClick () {
		try {
			element = dr.findElement(By.xpath("//span[text()='Phones']"));
	        Actions action = new Actions(dr);
	        action.moveToElement(element).build().perform();
	        
	        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        dr.findElement(By.xpath("//a[@id='fourthLevel03']")).click();
		}catch (Exception a) {
			a.printStackTrace();
		}
	}
	
	//click on radio button
	public static void radioButton (String values) {
		try {
			dr.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			List<WebElement> ele = dr.findElements(By.xpath("//input[@name='colors']"));
			String h;
			for (WebElement a : ele) {
				h = a.getAttribute("value");
				if (h.equalsIgnoreCase(values)) {
					a.click();
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	//close browser
	public static void closeBrowser () {
		try {
			dr.close();
			dr.quit();
		}catch (Exception a) {
			a.printStackTrace();
		}
	}
	
	//enter a text value
	public static void enterText (String xpathValue, String enetrValue) {
		try {
			dr.findElement(By.xpath(xpathValue)).sendKeys(enetrValue);
		}catch (Exception a) {
			a.printStackTrace();
		}
	}
	
	//click a button
	public static void clickButton (String xpathValue) {
		try {
			dr.findElement(By.xpath(xpathValue)).click();
		}catch (Exception a) {
			a.printStackTrace();
		}
	}
	
	//select a drop down list
	public static void selectItem (String xpathValue, String seelctItem) {
		try {
			WebElement el = dr.findElement(By.xpath(xpathValue));
			Select sele = new Select (el);
			sele.selectByVisibleText(seelctItem);
		}catch (Exception a) {
			a.printStackTrace();
		}
	}
	
	
	
	
}
