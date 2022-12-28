package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;


import managers.WebDriverManager;

public class MarketPlacePage {

	private WebDriverManager app;
	private WebElement viewoncix;

	private WebElement text;


	public MarketPlacePage(WebDriverManager app) {
		this.app = app;
	}

	public void clickingMarketplace() {
		app.mouseOver("menuitemmouseover_xpath");
		app.log("Clicking on Market Place Menu Item");
		app.click("marketplacemenuitem_xpath", true);
	}

	public void verifyingProjectidMarketPlace(String price, String text, String projectid) {
		app.log("Verifying " + projectid + " , " + price + " and view in CIX option are displaying in Market Place");
		viewoncix = app.getWebelementfromWebTable(price, 9);
		if (!viewoncix.getText().equals(text)) {
			app.reportFailure(text + " is not present in webpage", true);
		} else {
			app.reportPass(text + " is present in webpage");
		}
	}

	public void clickingonViewonCIX(String price, String projectid) {
		app.log("Clicking in View in CIX link againist " + price + " and " + projectid);
		viewoncix = app.getWebelementfromWebTable(price, 9);
		viewoncix.click();
	}

	public void verifingUpdateListingLink(String price) {

		app.isElementnotPresent("x", false);
		app.click("x", false);
	}


	public void verifyingviewcixoption(String ViewonCIX, String Projectid) {
		app.log("Verifying " + ViewonCIX + " and " + Projectid + "are displaying");
		app.isElementPresent("projectid1218_xpath", true);
		app.isElementPresent("ViewonCIX_xpath", true);
		app.verifyText("projectid1218_xpath", ViewonCIX, true);
		//app.verifyText("ViewonCIX_xpath", ViewonCIX, true);
	}


	//general flow

	public void clickingMarketPlace() {
		app.mouseOver("Marketplacemenu_xpath");
		app.log("Clicking on Market Place Menu Item");
		app.click("Marketplacemenu_xpath", true);
	}

	public void verifyPurchaseNowOption(String price, String verification) {
		app.log("verifying the price " + price + "and" + verification + "is present");
		text = app.getWebelementfromWebTable(price, 9);
		if (!text.getText().equals(verification)) {
			System.out.println("verification is failed");
		} else {
			System.out.println("verification is passed");
		}


	}


	public void clickingOnPurchaseNowButton() {
		app.log("Clicking on purchase now button");
		app.click("purchasenowbutton_xpath", true);
	}


	public void verifyPurchasePage(String text) {
		app.log("Verify Purchase Page");
		app.verifyText("verifypurchasepage_xpath", text, true);

	}

	public void enterQuantity(String Quantity) {
		app.log("Entering valid Quantity- " + Quantity);
		app.type("enterQuantity_xpath", Quantity, false);

	}

	public void selectingConfirmCheckBox() {
		app.log("Clicking on confirm check-box");
		app.click("confirmcheckboxfield_xpath", true);
	}


	public void clickingOnConfirmPurchase() {
		app.log("Clicking on confirm purchase  button");
		app.click("confirmpurchasebutton_xpath", true);
	}


	public void verifyingConfirmPurchase(String text) {
		app.log("Verify confirm new purchase pop-up window");
		app.verifyTextinPage(text, false);

	}


	public void clickingOnConfirmPurchaseOnPopup() {
		app.log("Clicking on confirm purchase  button on pop-up window");
		app.click("confirmpurchasebuttononpopup_xpath", true);
	}


	public void verifyingConfirmation(String text) {
		app.log("Verify Purchase Confirmation Page");
		app.verifyText("purchaseconfirmationpage_xpath", text, true);

	}

	public void verifyTotalQuantityAvailable(String text) {
		app.log("verfying total quantity available");
		app.verifyText("totalquantity_xpath", text, true);

	}


	public void clickingOnVintageFilter() {
		app.log("Clicking on vintage filter option in projects page");
		app.click("clickingvintagefilter_xpath", true);
	}

	public void selectingVintage(String Vintage) {
		app.log("selecting the vintage from dropdown " + Vintage);
		app.click("vintage_xpath", true);
		app.click("clickingvintagefilter_xpath", true);
	}


	public void clickingOnMarketplaceFilter() {
		app.log("Clicking on marketplace filter option in projects page");
		app.click("clickingmarketplacefilter_xpath", true);
	}

	public void selectingMarketplace(String marketplace) {
		app.log("selecting the marketplace from dropdown " + marketplace);
		app.click("CPmarketplace_xpath", true);
		app.click("clickingmarketplacefilter_xpath", true);
	}


	public void verifyingProject(String text) {
		app.log("verifying project available in marketplace or not" + text);
		app.verifyText("projectnotavailtext_xpath", text, true);
	}


	//downforce
	public void ClickingOnRamp() {
		app.mouseOver("menuitemmouseover_xpath");
		app.log("Clicking on On-Ramp  Menu Item");
		app.click("onrampmenuitem_xpath", true);
	}


	public void verifyOnRampPage(String text) {
		app.log("verifying on-ramp page");
		app.verifyText("onramptext_xpath", text, true);
	}

	public void verifyingDownforceRegistry(String registry) {
		app.log("verifying downforce registry");
		app.verifyText("downforceregistry_xpath", registry, true);
	}


	public void clickingOnAccountSettings() {
		app.log("clicking on account settings");
		app.click("accountsettings_xpath", true);
	}


	public void verifyAccountSettings(String text) {
		app.log("verifying  account settings page");
		app.verifyText("accountsettingstext_xpath", text, true);

	}


    public void clickingOnUpdateButton(){
		app.log("clicking on update button");
		app.click("updatebuttonaccount_xpath",true);
	}


   public void clickingOnPlatformDropdown(){
		app.log("clicking on platform dropdown");
		app.click("platformdropdown_xpath",true);
   }

  public void selectingDownforce(){
		app.log("selecting downforce option from dropdown");
		app.click("downforce_xpath",true);
  }


   public void enteringUserId(String userID) {
	   app.log("entering downforce userID");
	   app.getElement("downforceuserid_xpath", true).clear();
	   app.type("downforceuserid_xpath",userID,true);


   }


	public void clickingOnSave(){
		app.log("click on save button");
		app.click("savebutton_xpath",true);
	}


	public void verifyingUserId(String  text){
		app.log("verifying whether user id added or not");
		app.verifyText("useridtext_xpath",text,true);

	}


	public void clickingOnRegistryFilter() {
		app.log("Clicking on registry filter option in projects page");
		app.click("clickingonregistryfilter_xpath", true);


	}


	public void searchRegistry(String RegistryName) {
		app.log("Entering valid Registry name - " + RegistryName);
		app.type("Registrysearch_xpath", RegistryName, false);

	}

	public void selectRegistry(String registry) {
		app.log("selecting registry from dropdown" + registry);
		app.click("selectregistry_xpath", false);
	}



    public void verifyingProjectsPage(String text){
		app.log("verifying projects page");
		app.verifyText("projectstext_xpath",text,true);
	}







}