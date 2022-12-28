package pages;

import managers.WebDriverManager;

public class CreateNewListing {

	private WebDriverManager app;

	public CreateNewListing(WebDriverManager app) {
		this.app = app;
	}
	
	public void verifyingCreatingnewListingPage(String text) {
		app.log("Verify " +text+ " and webelement are present in the Create Listing Page");
		app.isElementPresent("verifycreatenewlistingpage_xpath", true);
		app.verifyTextinPage("Marketplace Overview",  true);
	}
	
	public void clickingonNewListButtwithoutData() {
		app.log("Clicking on New Listing button without entering data in Mandatory ");
		app.click("createnewlistingbutton_xpath", true);
	}
	
	public void verifyingMandatoryValidations(String pricevaldiationmessage,String quantityvaldiationmessage,String confirmvaldiationmessage) {
		app.log("Verifying whether " +pricevaldiationmessage+ " mandatory validation is coming up or not");
		app.verifyTextinPage(pricevaldiationmessage, true);
		app.log("Verifying whether " +quantityvaldiationmessage+ " mandatory validation is coming up or not");
		app.verifyTextinPage(quantityvaldiationmessage, true);
		app.log("Verifying whether " +confirmvaldiationmessage+ " mandatory validation is coming up or not");
		app.verifyTextinPage(confirmvaldiationmessage, true);
	}
	
	public void enteringSalQuantGretTotQuant(String salesvalue) {
		app.log("Entering sales qauntity greater than Total Quantity");
		app.type("salesquantityfield_xpath", salesvalue, true);
	}
	
	public void verifyingValidMessSalesQuant(String message) {
		app.log("Verifying "+message+ " is getting disaplyed when sales quantity is greater than Total Quantity ");
		app.verifyTextinPage(message, true);
	}
	
	public void enteringDatainCreatnewListPage(String price,String salesquantity) {
		app.pageRefesh();
		app.log("Entering " +price+ " and "+salesquantity+ " in respective Price and Sales Quantity fields");
		app.type("pricefield_xpath", price, true);
		app.type("salesquantityfield_xpath", salesquantity, true);
	}
	
	public void selectingConfirmCheckBox() {
		app.log("Clicking on confirm check-box");
		app.click("confirmcheckboxfield_xpath", true);
	}
	
	public void clickingonCreateNewListing() {
		app.log("Clicking on create new listing button");
		app.click("createnewlistingbutton_xpath", true);
	}
	
	public void verifyingConfirmNewLinstingPopup(String text,String vinatge,String price,String quantity ) {
		app.log("Verify confirm new listing pop-up window");
		app.verifyTextinPage(text, false);
		app.verifyText("verifyvinatge_xpath", vinatge, true);
		app.verifyText("verifyprice_xpath", "$"+price, true);
		app.verifyText("verifyquantity_xpath", quantity, true);
	}
	
	public void clickingonCreateNewListinginpopup() {
		app.log("Clicking on create new listing button");
		app.click("createnewlistingbuttoninpopup_xpath", true);
	}
	
	public void verifyingListingConfirmation(String text,String vinatge,String price,String quantity ) {
		app.log("Verify Listing Confirmation Page");
		app.verifyText("verifylistingconfirmationpage_xpath", text, true);
		app.verifyText("verifyvinatgesummary_xpath", vinatge, true);
		app.verifyText("verifypricesummary_xpath", "$"+price, true);
		app.verifyText("verifyquantitysummary_xpath", quantity, true);
	}







	//General flow

	public void verifyingListingPage(String text) {
		app.log("Verify listing management Page");
		app.verifyText("verifylistingmanagement_xpath", text, true);

	}

	public void clickingOnCpMarketPlace() {
		app.log("Clicking on CIX Market Place banner");
		app.click("CPmarketolaceclick_xpath", true);
	}



	public void verifyingCarbonplacePage(String text) {
		app.log("Verify carbonplace marketplace Page");
		app.verifyText("verifycarbonplacepage_xpath", text, true);

	}


	public void enteringDataInCreateNewListPage(String price, String salesquantity) {
		//  app.pageRefesh();
		app.log("Entering " + price + " and " + salesquantity + " in respective Price and Sales Quantity fields");
		app.type("Price_xpath", price, true);
		app.type("Salesquantiy_xpath", salesquantity, true);
	}


	public void retirementRequired(String retirement) {
		app.log("selecting retirement required as no");
		app.click("retirementrequired_xpath", true);
	}


	public void selectingPurchasePreferences(String preferences) {
		app.log("selecting purchase preferences");
		app.click("preferences_xpath", true);
	}



	public void SelectingConfirmCheckBox() {
		app.log("Clicking on confirm check-box");
		app.click("confirmcheckboxfield_xpath", true);
	}


	public void clickingOnCreateNewListing() {
		app.log("Clicking on create new listing button");
		app.click("newlistingbutton_xpath", true);
	}

	public void verifyingConfirmNewLinstingPopup(String text) {
		app.log("Verify confirm new listing pop-up window");
		app.verifyTextinPage("newlistingbuttontext_xpath",true);

	}


	public void clickingOnCreateNewListinginpopup() {
		app.log("Clicking on create new listing button");
		app.click("createnewlistingbuttoninpopup_xpath", true);
	}


	public void verifyingListingConfirmation(String text) {
		app.log("Verify Listing Confirmation Page");
		app.verifyText("verifylistingconfirmationpage_xpath", text, true);

	}




}
