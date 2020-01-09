package com.pageWise;

import com.commonActions.Business_Library;

public class HelpPage extends Business_Library {
	
	
	public static String start_Shopping = "//a[text()='Start Shopping']";
	
	
	public static void start_shoppingHelp () {
		clickButton(start_Shopping);
	}
	
	public static void hiMethid () {
		System.out.println("hi");
	}

}
