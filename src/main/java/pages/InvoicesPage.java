package pages;

import org.openqa.selenium.WebElement;

import managers.WebDriverManager;

public class InvoicesPage {

	private WebDriverManager app;
	private WebElement tablestatus;
	private WebElement text;
	public InvoicesPage(WebDriverManager app) {
		this.app = app;
	}
	
	public void clickingOnInvoiceMenuItem() {
		app.mouseOver("menuitemmouseover_xpath");
		app.log("Clicking on Invoices Menu Item");
		app.click("invoicemenuitem_xpath", true);
	}
	
	public void verifyingInvoicePageTitle(String expectedtitle) {
		app.log("Verify Title of the page");
		app.validateTitle(expectedtitle, false);
	}
	
	public void verifyingInvoicerecord(String price,String status) {
		app.log("Verify whether "+price+" and "+status+" is displaying aganist the invocie record");
		tablestatus = app.getWebelementfromWebTable(price,7);
		if(!tablestatus.getText().equals(status)) {
			app.reportFailure(status+" is not the status of the record", true);
		}else {
			app.reportPass(status+" is the status of the record");
		}
	}
	
	public void clickingonDownloadInvoice(String price) {
		app.log("clicking on Action link aganist "+price+" record");
		tablestatus = app.getWebelementfromWebTable(price,9);
		tablestatus.click();
		app.log("Clicking on Download Invoice");
		app.click("downloadinvocie_xpath", true);
     }
	
	public void clickingonViewInvoice(String price) {
		app.log("clicking on Action link aganist "+price+" record");
		tablestatus = app.getWebelementfromWebTable(price,9);
		tablestatus.click();
		app.log("Clicking on View Invoice");
		app.click("viewinvoice_xpath", true);
    }

	public void verifyInvoicesPage(String text) {
		app.log("Verify Purchase Page");
		app.verifyText("verifyinvoicespage_xpath", text, true);

	}

	public void verifyInvoicesStatus(String price, String verification) {
		app.log("verifying the price " + price + "and" + verification + "is present");
		text = app.getWebelementfromWebTable(price, 4);
		if (!text.getText().equals(verification)) {
			System.out.println("verification is failed");
		} else {
			System.out.println("verification is passed");
		}


	}

	public void clickingOnViewInvoice(){
		app.log("clicking on invoices option");
		app.click("viewinvoices_xpath",true);
	}

	public void verifyingViewInvoice(String text){
		app.log("verifying view invoices page");
		app.verifyText("viewinvoicetext_xpath",text,true);
	}


	public void clickingOnInvoiceMenu() {
		app.mouseOver("invoicemenuitem_xpath");
		app.log("Clicking on Invoices Menu Item");
		app.click("invoicemenuitem_xpath", true);
	}


	public void verifyingProject(String ProjectID,String ProjectName,String Qty,String Amount,String Fee) {
		app.log("Verifying " + ProjectID + " and " + ProjectName + " and "+ Qty +" and "+Amount+" and"+Fee+"  are displaying");
		app.verifyText("ProjectIDtext_xpath",ProjectID, true);
		app.verifyText("Projectnametext_xpath",ProjectName, true);
		app.verifyText("Qtytext_xpath",Qty, false);

		app.verifyText("Amounttext_xpath",Amount, true);
		app.verifyText("Feetext_xpath", Fee,true);

	}


	public void clickOnInvoiceMenu() {
		app.mouseOver("invoicemenu_xpath");
		app.log("Clicking on Invoices Menu Item");
		app.click("invoicemenu_xpath", true);
	}


}
