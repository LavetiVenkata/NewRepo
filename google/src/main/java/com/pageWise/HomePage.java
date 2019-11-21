package com.pageWise;

import com.commonActions.Business_Library;


public class HomePage extends Business_Library{
	

	public static String get_GoogleOn = "//a[text()='Come in and get your Google on']";
	public static String home_page_Btn = "//a[text()='Home']";
	public static String cart_Button = "//a[@class='open-order']";
	public static String help_Button = "//a[@id='hide-mob']";
	
	

	public static void enter_shop () {
			
		clickButton(get_GoogleOn);
	}
	
	public static void navigate_CartPage () {
		
		clickButton(home_page_Btn);
		clickButton(cart_Button);
	}
	
	public static void enter_help () {
		
		clickButton(help_Button);
	}
	
}
