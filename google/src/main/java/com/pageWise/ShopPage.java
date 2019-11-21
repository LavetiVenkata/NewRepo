package com.pageWise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.commonActions.Business_Library;


public class ShopPage extends Business_Library {

	public static String add_Button = "//button[@class='button expanded']";
	public static String item_Size = "//span[text()='S']";
	public static String keep_Shopping = "//a[text()='Keep Shopping']";
	public static String delete_item = "//a[text()='Delete']/preceding::td[@id='btn']";
	
	
	public static void add_ShopItem (String ShopItems, String itemSize, int itemsCount) {
		try {
			dr.findElement(By.xpath("//div[@id='feat-prod']/h4[text()='" + ShopItems + "']")).click();
			clickButton(add_Button);
			
			element = dr.findElement(By.xpath("//span[text()='" + itemSize + "']"));		
			JavascriptExecutor executor = (JavascriptExecutor)dr;
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(5000);
			//element.sendKeys(itemsCount);
			clickButton(keep_Shopping);
			Thread.sleep(500);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void verifying_addedItem (String expectedTitle) {
		String actualTitle = dr.getTitle();
		 if (expectedTitle.equals(actualTitle))
         {
                System.out.println("Verification Successful - The item was added on Cart page.");
         }
         else
         {
                System.out.println("Verification Failed - The item was not added on Cart page.");
         }
	}
	
	public static void delte_item () {
		clickButton(delete_item);
	}
}
