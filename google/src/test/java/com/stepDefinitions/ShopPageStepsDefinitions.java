package com.stepDefinitions;


import com.pageWise.ShopPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ShopPageStepsDefinitions extends ShopPage {

	
	@And ("^Add \"(.*)\" item \"(.*)\" of size \"(.*)\" Shop to Cart page$")
	public void select_shopping_item (int itemCount, String item, String itemSize) {
		add_ShopItem(item, itemSize, itemCount);
	}

	@Then ("^veify the added \"Google Fitted Tee\" item on Cart page$")
	public void verify_added_item (String item) {
		verifying_addedItem(item);
	}
	
	@And ("^Delete the added item$")
	public void delete_add_item () {
		delete_add_item();
	}
}
