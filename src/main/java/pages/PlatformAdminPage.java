package pages;

import managers.WebDriverManager;
import org.openqa.selenium.WebElement;

public class PlatformAdminPage {


    private WebDriverManager app;
    private WebElement text;

    public PlatformAdminPage(WebDriverManager app) {
        this.app = app;
    }


    public void clickingonprojects() {
        app.log("Clicking on client management button");
        app.click("clickingonprojects_xpath", true);
        app.wait(2000);
        app.explicitWaitTill();
    }

    public void enteringprojectname(String projectname) {
        app.log("Entering valid project name - " + projectname);
        app.type("projectsearch_xpath", projectname, false);

    }


    public void clickingoncreditypefilter() {
        app.log("Clicking on credit-type filter option in projects page");
        app.click("clickingoncredittypefilter_xpath", true);


    }


    public void searchcredittype(String credittype) {
        app.log("Entering valid credit type - " + credittype);
        app.type("credittypesearch_xpath", credittype, false);

    }

    public void selectcredittype(String credittype) {
        app.log("selecting registry from dropdown" + credittype);
        app.click("selectcredittype_xpath", false);
    }


    public void clickingonregistryfilter() {
        app.log("Clicking on registry filter option in projects page");
        app.click("clickingonregistryfilter_xpath", true);


    }


    public void searchregistry(String RegistryName) {
        app.log("Entering valid Registry name - " + RegistryName);
        app.type("Registrysearch_xpath", RegistryName, false);

    }

    public void selectregistry(String registry) {
        app.log("selecting registry from dropdown" + registry);
        app.click("selectregistry_xpath", false);
    }


    public void clickingonprojectfilter() {
        app.log("Clicking on project filter option in projects page");
        app.click("clickingonprojectfilter_xpath", true);


    }


    public void searchproject(String project) {
        app.log("Entering valid project- " + project);
        app.type("projectnamesearch_xpath", project, false);

    }

    public void selectprojectname(String projectname) {
        app.log("selecting projectname from dropdown" + projectname);
        app.click("projectnamechecbox_xpath", false);
    }


    public void clickonexport() {
        app.log("Clicking on export to csv icon");
        app.click("export_xpath", true);
    }


    public void clickingonsettingsicon() {
        app.log("clicking on settings option to open");
        app.click("settingsicon_xpath", true);
    }

    public void clickingonregistry() {
        app.log("clicking on registry checkbox");
        app.click("registry_xpath", true);
    }

    public void clickingonprojectname() {
        app.log("clicking on projectname checkbox");
        app.click("project_xpath", true);
    }

    public void clickingoncredittype() {
        app.log("clicking on credit type checkbox");
        app.click("credittype_xpath", true);
    }

    public void clickingonstatus() {
        app.log("clicking on status checkbox");
        app.click("status_xpath", true);
    }

    public void clickingoncreditsonramp() {
        app.log("clicking on credits on ramp checkbox");
        app.click("creditsonramp_xpath", true);
    }

    public void clickingonsavebutton() {
        app.log("clicking on save button");
        app.click("save_xpath", true);
    }


    public void clickingallfiltersbutton() {
        app.log("clicking on all filters button");
        app.click("allfiltersbutton_xpath", true);
    }


    public void clickingonviewresultsbutton() {
        app.log("clicking on all view results button");
        app.click("viewreultsbutton_xpath", true);
    }

    public void clickingonclearfilters() {
        app.log("clicking on clear filters option");
        app.click("clearfilters_xpath", true);
    }

    public void clickingonviewproject() {
        app.log("clicking on view project button");
        app.click("viewproject_xpath", true);
    }


    public void verifyingprojectssummary(String text) {
        app.log("Verifying " + text + " and webelement is present or not");
        app.isElementPresent("projectsummaryverify_xpath", false);
        app.verifyTextinPage(text, false);
    }


    public void clickingordermanagement() {
        app.log("Clicking on Order management Menu Item");
        app.mouseOver("ordermangementmenuitem_xpath");
        app.click("ordermangementmenuitem_xpath", true);
    }

    public void verfyingpendingorderspage(String text) {
        app.wait(20000);
        app.log("Verifying whether" + text + "is present in order management page or not");
        app.verifyTextinPage(text, true);
    }


    public void clickingonvintagefilter() {
        app.log("Clicking on vintage filter option in projects page");
        app.click("clickingonvintagefilter_xpath", true);


    }


    public void searchvinatge(String Vintage) {
        app.log("Entering valid Vintage- " + Vintage);
        app.type("vinatgesearch_xpath", Vintage, false);

    }


    public void selectvintage(String vintage) {
        app.log("selecting vinatge " + vintage);
        app.click("vintagecheckbox_xpath", false);
    }


    public void selectingcIX() {
        app.log("selecting CIX option on marketplace");
        app.click("selectCIXOption_xpath", true);

    }

    public void selectingcarbonplace() {
        app.log("selecting Carbonplace option on marketplace");
        app.click("selectcarbonplace_xpath", true);

    }

    public void clickingonMarketplace() {
        app.log("Clicking on Marketplace filter option");
        app.click("clickingonMarketplacefilter_xpath", true);

    }


    public void clickonmanagelisting() {
        app.log("Clicking on mange listing button");
        app.click("clickonmanagelisting_xpath", true);

    }

    public void clickingonCPMarketPlace() {
        app.log("Clicking on CIX Market Place banner");
        app.click("CPmarketolaceclick_xpath", true);
    }


    public void enteringDatainCreatnewListPage(String price, String salesquantity) {
      //  app.pageRefesh();
        app.log("Entering " + price + " and " + salesquantity + " in respective Price and Sales Quantity fields");
        app.type("Price_xpath", price, true);
        app.type("Salesquantiy_xpath", salesquantity, true);
    }


    public void retirementrequired(String retirement) {
        app.log("selecting retirement required as no");
        app.click("retirementrequired_xpath", true);
    }

    public void selectingpurchasepreferences(String preferences) {
        app.log("selecting purchase preferences");
        app.click("preferences_xpath", true);
    }

    public void selectingConfirmCheckBox() {
        app.log("Clicking on confirm check-box");
        app.click("confirmcheckboxfield_xpath", true);
    }

    public void clickingonCreateNewListing() {
        app.log("Clicking on create new listing button");
        app.click("newlistingbutton_xpath", true);
    }

    public void verifyingConfirmNewLinstingPopup(String text) {
        app.log("Verify confirm new listing pop-up window");
        app.verifyText("confirm_xpath", text, true);

    }

    public void clickingonCreateNewListinginpopup() {
        app.log("Clicking on create new listing button");
        app.click("createnewlistingbuttoninpopup_xpath", true);
    }


    public void verifyingListingConfirmation(String text) {
        app.log("Verify Listing Confirmation Page");
        app.verifyText("verifylistingconfirmationpage_xpath", text, true);

    }

    public void clickingMarketPlace() {
        app.mouseOver("Marketplacemenu_xpath");
        app.log("Clicking on Market Place Menu Item");
        app.click("Marketplacemenu_xpath", true);
    }




    public void clickingonpurchasenowbutton() {
        app.log("Clicking on purchase now button");
        app.click("purchasenowbutton_xpath", true);
    }

    public void verifypurchasepage(String text) {
        app.log("Verify Purchase Page");
        app.verifyText("verifypurchasepage_xpath", text, true);

    }


    public void enterquantity(String Quantity) {
        app.log("Entering valid Quantity- " + Quantity);
        app.type("enterQuantity_xpath", Quantity, false);

    }

    public void selectingconfirmcheckBox() {
        app.log("Clicking on confirm check-box");
        app.click("confirmcheckboxfield_xpath", true);
    }

    public void clickingonConfirmpurchase() {
        app.log("Clicking on confirm purchase  button");
        app.click("confirmpurchasebutton_xpath", true);
    }


    public void verifyingConfirmpurchase(String text) {
        app.log("Verify confirm new purchase pop-up window");
        app.verifyText("confirmpurchase_xpath", text, false);

    }

    public void clickingonConfirmpurchaseonpopup() {
        app.log("Clicking on confirm purchase  button on pop-up window");
        app.click("confirmpurchasebuttononpopup_xpath", true);
    }

    public void verifyingConfirmation(String text) {
        app.log("Verify Purchase Confirmation Page");
        app.verifyText("purchaseconfirmationpage_xpath", text, true);

    }

    public void verifyordermangementpage(String text) {
        app.log("Verify order management  Page");
        app.verifyText("verifyordermanagementpage_xpath", text, true);

    }


    public void clickingonthreedots() {
        app.log("clicking on three dots icon");
        app.click("threedots_xpath", true);
    }

    public void clickingonapprovetransaction() {
        app.log("clicking on approve transaction button");
        app.click("approvetransaction_xpath", true);
    }


    public void verifyPurchasepage(String text) {
        app.log("Verify Purchase  Page");
        app.verifyText("verifypurchasepage_xpath", text, true);

    }

    public void clickingonapprovetransactionbutton() {
        app.log("clicking on approve transaction button");
        app.click("approvetransactionbutton_xpath", true);
    }


    public void verifyapprovetransactionpopup(String text) {
        app.log("Verify approve transaction pop-up window");
        app.verifyText("verifyapprovetransaction_xpath", text, false);

    }

    public void clickingonapprovetransactionbuttononpopup() {
        app.log("clicking on approve transaction button on pop-up window");
        app.click("approvetransactionbuttononpopup_xpath", true);
    }

    public void verifyorderpage(String text) {
        app.log("Verify Order  Page");
        app.verifyText("verifyorderpage_xpath", text, true);

    }


    public void verifyingcarbonplacepage(String text) {
        app.log("Verify carbonplace marketplace Page");
        app.verifyText("verifycarbonplacepage_xpath", text, true);

    }

    public void verifyinglistingpage(String text) {
        app.log("Verify listing management Page");
        app.verifyText("verifylistingmanagement_xpath", text, true);

    }


    public void verifycaneloption(String price, String marketplace) {
        app.log("verifying cancel button is present under the projects" + price + "and" + marketplace);
        app.isElementPresent("Price_xpath", true);
        app.isElementPresent("CPmarketplace_xpath", true);
        app.isElementPresent("updateButton_xpath", true);
        app.isEnabled("updateButton_xpath", true);
    }


    public void verifyingProjectDetails(String projectid, String marketplace) {
        app.log("Verifying " + projectid + " and " + marketplace + " are displaying");
        app.isElementPresent("Projectidtext_xpath", true);
        app.verifyText("marketplace_xpath", marketplace, true);
    }


    public void verifyingProjectdetails(String projectid, String status) {
        app.log("Verifying " + projectid + " and " + status + " are displaying");
        app.isElementPresent("Projectidtext_xpath", true);
        app.verifyText("Status_xpath", status, true);
    }




    public void verifyapprovetransaction(String text) {
        app.log("Verify approve transaction pop-up window");
        app.verifyText("verifyapprovetransactionpopup_xpath", text, true);

    }




    public void verifyingregistry(String ProjectID, String Registry) {
        app.log("Verifying " + ProjectID + " and " + Registry + " are displaying");
        app.isElementPresent("projectidtext_xpath", true);
        app.verifyText("Registry_xpath", Registry, true);
    }





}



