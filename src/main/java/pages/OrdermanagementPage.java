package pages;

import managers.WebDriverManager;
import org.openqa.selenium.WebElement;

public class OrdermanagementPage {

    private WebDriverManager app;
    private WebElement viewoncix;

    private WebElement text;

    public OrdermanagementPage(WebDriverManager app) {
        this.app = app;
    }


    public void verifyOrderManagementPage(String text) {
        app.log("Verify order management  Page");
        app.verifyText("verifyordermanagementpage_xpath", text, true);

    }


    public void verifyPurchaseNowOption(String price, String verification) {
        app.log("verifying the price " + price + "and" + verification + "is present");
        text = app.getWebelementfromWebTable(price, 7);
        if (!text.getText().equals(verification)) {
            System.out.println("verification is failed");
        } else {
            System.out.println("verification is passed");
        }


    }



    public void clickingOnThreeDots() {
        app.log("clicking on three dots icon");
        app.click("threedots_xpath", true);
    }


    public void clickingOnApproveTransaction() {
        app.log("clicking on approve transaction button");
        app.click("approvetransaction_xpath", true);
    }


    public void verifyApproveTransaction(String text) {
        app.log("Verify approve transaction pop-up window");
        app.verifyTextinPage(text,true);

    }


    public void clickingOnApproveTransactionButton() {
        app.log("clicking on approve transaction button");
        app.click("Approvetransactionbutton_xpath", true);
    }




    public void clickingOnOrderManagementPage() {
        app.mouseOver("menuitemmouseover_xpath");
        app.log("Clicking on order management  Menu Item");
        app.click("ordermanagementmenuitem_xpath", true);
    }



    public void verifyingProjectDetails(String ProjectID, String vintage, String quantity, String text) {
        app.log("Verifying " + ProjectID + " and " + vintage + " and "+ quantity +" and"+text+" are displaying");
        app.isElementPresent("Projectidtext_xpath", true);
        app.isElementPresent("vintagetext_xpath", true);
        app.isElementPresent("quantitytext_xpath", true);
        app.verifyText("vieworderbutton_xpath", text, true);

    }




    public void verifyOrderStatus(String price, String status) {
        app.log("verifying the price " + price + "and" + status + "is present");
        text = app.getWebelementfromWebTable(price, 7);
        if (!text.getText().equals(status)) {
            System.out.println("verification is failed");
        } else {
            System.out.println("verification is passed");
        }


    }


    public void verifyOrderCreatedInBuyerBank(String price,String quantity) {
        app.log("verifying the price " + price + "and" + quantity + "is present");
        text = app.getWebelementfromWebTable(price, 9);
        if (!text.getText().equals(quantity)) {
            System.out.println("verification is failed");
        } else {
            System.out.println("verification is passed");
        }


    }


    public void verifyOrderCreated(String price, String verification) {
        app.log("verifying the price " + price + "and" + verification + "is present");
        text = app.getWebelementfromWebTable(price, 11);
        if (!text.getText().equals(verification)) {
            System.out.println("verification is failed");
        } else {
            System.out.println("verification is passed");
        }


    }







    public void clickingOnViewOrder() {
        app.log("Clicking on view order button");
        app.click("vieworderbutton_xpath", true);
    }



    public void verifyingOrderTimeline(String text) {
        app.log("Verify order timeline status");
        app.verifyText("ordertimeline_xpath", text, true);

    }


    public void verifyingOrderManagementPage(String text) {
        app.log("Verify user navigate to order page");
        app.verifyText("orderpage_xpath", text, true);

    }

    public void verifyingInvoiceButtonIsEnabled(){
        app.log("verifying Download Invoice button is enabled or not");
        app.isElementPresent("downloadinvoice_xpath",true);
        app.isEnabled("downloadinvoice_xpath",true);
    }

    public void clickingOnDownloadInvoice(){
        app.log("clicking on download invoice button");
        app.click("downloadinvoice_xpath",true);
    }



    public void verifyingInvoiceButtonIsEnabledInBuyerAccount(){
        app.log("verifying Download Invoice button is enabled or not");
        app.isElementPresent("downloadinvoicebuyer_xpath",true);
        app.isEnabled("downloadinvoicebuyer_xpath",true);
    }

    public void clickingOnDownloadInvoiceInBuyerAccount(){
        app.log("clicking on download invoice button");
        app.click("downloadinvoicebuyer_xpath",true);
    }

    public void verifyingPaymentTimeline(String text) {
        app.log("Verify order timeline status");
        app.verifyText("paymenttimeline_xpath", text, true);

    }

    public void verifyingPaymentStatus(String text){
        app.log("verifying status");
        app.verifyText("paymentstatus_xpath",text,true);
    }


    public void clickingOnViewOrderOption(){
        app.log("clicking on view order option");
        app.click("vieworderoption_xpath",true);
    }


    public void viewOrder() {
        app.log("Clicking on view order button");
        app.click("vieworderoption_xpath", true);
    }

    public void clickingOnThreeDotsIcon() {
        app.log("clicking on three dots icon");
        app.click("threedotsicon_xpath", true);
    }

    public void clickingOnOrderHistoryTab(){
        app.log("clicking on order history tab");
        app.click("orderhistory_xpath",true);
    }

    public void verifyOrderHistory(String text){
        app.log("verifying order histoy page");
        app.verifyText("orderhistorytext_xpath",text, true);
    }

    public void clickingOnViewOrderInOrderHistory() {
        app.log("Clicking on view order button of project");
        app.click("vieworderbuttoninorderhistory_xpath", true);
    }

    public void verifyingTimeline(String text) {
        app.log("Verify order timeline status");
        app.verifyText("paymenttimelinestatus_xpath", text, false);

    }

    public void searchingProjectWithId(String projectID) {
        app.log("Tying " + projectID + " in search box");
        app.type("projectordersearch_xpath", projectID, false);
    }



    public void clickingOnViewOrderInHistory() {
        app.log("Clicking on view order button of project");
        app.click("vieworderbuttoninhistory_xpath", true);
    }



    public void verifyPurchasePage(String text) {
        app.log("Verify Purchase  Page");
        app.verifyText("verifypurchasepage_xpath", text, true);

    }

    public void clickingOnApproveTransactionButtons() {
        app.log("clicking on approve transaction button");
        app.click("approvetransactionbutton_xpath", true);
    }


    public void verifyApproveTransactionPopup(String text) {
        app.log("Verify approve transaction pop-up window");
        app.verifyText("verifyapprovetransaction_xpath", text, false);

    }


    public void clickingOnApproveTransactionButtonOnPopup() {
        app.log("clicking on approve transaction button on pop-up window");
        app.click("approvetransactionbuttononpopup_xpath", true);
    }

    public void verifyOrderPage(String text) {
        app.log("Verify Order  Page");
        app.verifyText("verifyorderpage_xpath", text, true);

    }

}
