package pages;

import java.awt.AWTException;

import managers.WebDriverManager;

public class PortfolioPage {

	private WebDriverManager app;

	public PortfolioPage(WebDriverManager app) {
		this.app = app;
	}

	public void verifyingPortfolioPage(String text) {
		app.log("Verifying " + text + " and webelement is present in Portfolio Page");
		app.isElementPresent("portfoliopageverify_xpath", false);
		app.verifyTextinPage(text, false);
	}

	public void searchingProjectID(String projectID) {
		app.log("Tying " + projectID + " in search box");
		app.type("projectsearchbar_xpath", projectID, false);
	}

	public void verifyingProjectDetails(String projectid, String projectname) {
		app.log("Verifying " + projectid + " and " + projectname + " are displaying");
		app.isElementPresent("projectidtext_xpath", true);
		app.verifyText("projectname_xpath", projectname, true);
	}

	public void clickingonManageListingButton() {
		app.log("Clicking on Manage Listings button");
		app.click("managelistingbutton_xpath", true);
	}

	public void verifyingManageListingPage(String text) throws AWTException {
		app.isElementPresent("onrampcredits_xpath", false);
		app.pageDown();
		app.log("Verify " + text + " and webelemt is present");
		app.isElementPresent("managelistingpageverify_xpath", true);
		app.verifyTextinPage(text, true);
	}

	public void verifyingCIXMarketPlaceDis() {
		app.log("Verify CIXMarketPlace weblement is present");
		app.isElementPresent("CIXmarketplace_xpath", true);
	}

	public void clickingonCIXMarketPlace() {
		app.log("Clicking on CIX Market Place banner");
		app.click("CIXmarketolaceclick_xpath", true);
	}

	public void verifyingCIXMarkPlaNotDisplaying() {
		app.log("Verify CIXMarketPlace weblement is not present");
		app.isElementnotPresent("CIXmarketplace_xpath", false);
	}





	public void verifyingupdatebutton(String updatebutton) {
		app.log("verfying update button webelement is present or not");
		app.isElementPresent("updatebutton_xpath", false);
	//	app.verifyTextinPage(text, false);
		app.verifyText("updatebutton_xpath", updatebutton, true);

	}

	public void updateclick(){
		app.log("verfyong whether update button is clickable or not");
		app.click("updatebutton_xpath",true);
	}

	public void verfyingupdatepage(String text) {
		app.log("Verifying whether" +text+ "is present or not");
		app.verifyText("updatetext_xpath",text,true);

	}

   public void enterprice(String price){
		app.log("enter the price other than string");
		//app.clearText("updateprice_xpath",true);
		app.doubleClick("updateprice_xpath",true);

		  // app.type("updateprice_xpath",price,true);
   }


//general flow
public void verifyingRegistry(String ProjectID, String Registry) {
	app.log("Verifying " + ProjectID + " and " + Registry + " are displaying");
	app.isElementPresent("projectidtext_xpath", true);
	app.verifyText("Registry_xpath", Registry, true);
}



	public void clickOnManageListing() {
		app.log("Clicking on mange listing button");
		app.click("clickonmanagelisting_xpath", true);

	}


	public void searchingProjectWithId(String projectID) {
		app.log("Tying " + projectID + " in search box");
		app.type("projectordersearchbar_xpath", projectID, false);
	}




}
