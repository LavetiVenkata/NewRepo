package com.stepDefinitions;


import com.pageWise.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePageStepsDefinitions extends HomePage{
	
	@Given ("^Launch \"(.*)\" on \"(.*)\" browser$")
	public void book_hotel (String url, String browser) throws Throwable {
		openBrowser(browser);
		launchApp(url);
		Thread.sleep(1000);		
	}
	
	@When ("^I want to enter into shopping page$")
	public void google_shopping_click () {
		enter_shop();
	}

	@And ("^I navigate to Cart page$")
	public void cart_page () {
		navigate_CartPage();
	}
	
	@Then ("^I want to close the browser$")
	public void close_browsers () {
		closeBrowser();
	}
	
	@And ("^I navigate to Help page$")
	public void navigate_help_page () {
		navigate_help_page();
	}
	
	
	
	
	
}
