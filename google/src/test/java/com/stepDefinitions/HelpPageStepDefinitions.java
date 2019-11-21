package com.stepDefinitions;

import com.pageWise.HelpPage;

import cucumber.api.java.en.And;

public class HelpPageStepDefinitions extends HelpPage{
	
	@And ("^i want to start shopping$")
	public void stat_Shopping () {
		start_shoppingHelp();
	}

}
