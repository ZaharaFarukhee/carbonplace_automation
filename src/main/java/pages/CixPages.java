package pages;

import java.awt.AWTException;
import java.io.File;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import managers.WebDriverManager;

public class CixPages {
	
	private WebDriverManager app;
	public String token;
	public String userid;
	
	public CixPages(WebDriverManager app) {
		this.app=app;
	}
	
	public void verifyingCIXLoginPage(String text) {
        app.windowHandle(1);
		app.log("Verifying whether CIX login Page is displaying or not");
	}
	
	public void logingintoCIX(String username,String password) {
		app.log("Entering "+username+" and "+password+" in CIX Login Page");
		app.type("cixusername_xpath", username, true);
		app.type("cixpassword_xpath", password, true);
		app.click("cixloginbutton_xpath", true);
	}
	
	public void clickingProjectDetailsbutton() {
		app.log("Clicking on Project Details link");
		app.click("projectdetails_xpath", true);
		app.log("Clicking on See More Vinatges & Prices");
		app.click("seemorevinatges_xpath", true);
	}
	
	public void verifyingOrderSumCIX(String vinatge, String price,String Amount,String CIXfees,String subtotal,String carbonfees, String GST,
			String totaltonnes, String totalprice) {
		app.wait(3000);
		app.log("Verifying whether "+vinatge+" vinatge is getting displayed are not");
		app.verifyText("vinatge_xpath", vinatge, true);
		app.log("Verifying whether "+price+" price is getting displayed");
		app.verifyText("price_xpath", price, true);
		app.log("Verifying whether "+Amount+" vinatge is getting displayed are not");
		app.verifyText("amount_xpath", Amount, true);
		app.log("Verifying whether "+subtotal+" price is getting displayed");
		app.verifyText("subtotal_xpath", subtotal, true);
		app.log("Verifying whether "+CIXfees+" vinatge is getting displayed are not");
		app.verifyText("cixfees_xpath", CIXfees, true);
		app.log("Verifying whether "+carbonfees+" price is getting displayed");
		app.verifyText("carbonfees_xpath", carbonfees, true);
		app.log("Verifying whether "+GST+" vinatge is getting displayed are not");
		app.verifyText("gst_xpath", GST, true);
		app.log("Verifying whether "+totaltonnes+" price is getting displayed");
		app.verifyText("totaltonnes_xpath", totaltonnes, true);
		app.log("Verifying whether "+totalprice+" price is getting displayed");
		app.verifyText("totalprice_xpath", totalprice, true);
	}
	
	public void enteringQuantityClickingAddButton(String quantity) {
		app.log("Entering "+quantity+ " value in quantity field");
		app.type("amounttextfield_xpath", quantity, true);
		app.log("Clicking on Add button");
		app.wait(2000);
		app.click("addbutton_xpath", true);
		app.log("Clicking on See Order Summary button");
		app.wait(5000);
		app.click("seeordersummarybutton_xpath", true);
	}
	
	public void clickingAddCartButton() {
		app.log("Clicking on Add Cart button");
		app.wait(10000);
		app.click("addtocart_xpath", true);
	}
	
	public void verifyingPaymentCart() {
		app.log("Clicking on Add Cart button");
		app.wait(10000);
		app.click("addtocart_xpath", true);
	}
	
	public void verifyingReviewPaymentCIX(String vinatge, String price,String Amount,String CIXfees,String subtotal,String carbonfees, String GST,
			String totaltonnes, String totalprice,String projectstotal) {
		app.wait(3000);
		app.log("Verifying whether "+vinatge+" vinatge is getting displayed are not");
		app.verifyText("paymentvinatge_xpath", vinatge, true);
		app.log("Verifying whether "+price+" price is getting displayed");
		app.verifyText("paymentprice_xpath", price, true);
		app.log("Verifying whether "+Amount+" vinatge is getting displayed are not");
		app.verifyText("paymentamount_xpath", Amount, true);
		app.log("Verifying whether "+subtotal+" price is getting displayed");
		app.verifyText("paymentsubtotal_xpath", "$"+subtotal, true);
		app.log("Verifying whether "+projectstotal+" price is getting displayed");
		app.verifyText("paymentprojectstotal_xpath", projectstotal, true);
		app.log("Verifying whether "+CIXfees+" vinatge is getting displayed are not");
		app.verifyText("paymentcixfees_xpath", CIXfees, true);
		app.log("Verifying whether "+carbonfees+" price is getting displayed");
		app.verifyText("paymentcarbonfees_xpath", carbonfees, true);
		app.log("Verifying whether "+GST+" vinatge is getting displayed are not");
		app.verifyText("paymentgst_xpath", GST, true);
		app.log("Verifying whether "+totaltonnes+" price is getting displayed");
		app.verifyText("paymenttotaltonnes_xpath", totaltonnes, true);
		app.log("Verifying whether "+totalprice+" price is getting displayed");
		app.verifyText("paymenttotalprice_xpath", totalprice, true);
	}
	
	public void clickingconfirmchecknsettlecarboncredits() throws AWTException {
//		app.wait(5000);
//		app.pageDown();
//		app.log("Clicking By proceeding with this transaction check box");
//		app.wait(10000);
//		app.mouseOver("byproceedcheckbox_xpath");
//		app.click("byproceedcheckbox_xpath", true);
//		app.log("Clicking on settle via carbon credits");
//		app.wait(20000);
//		app.click("settleviacarboncredits_xpath", true);
//		app.wait(40000);
//		app.takeScreenShot();
		loginPostReq();
		postReq();
		app.wait(5000);
		userPostReq();
	}
	
	public void userPostReq()
	{
		//uat.market.techcix.cloud/api/cppilot-service/api/v1/shopping-cart/06d28d89-fb03-40b7-8617-855bf35a8664
		RestAssured.baseURI = "https://uat.market.techcix.cloud/api/cppilot-service";
		RestAssured.basePath= "/api/v1/shopping-cart/"+userid;
		
		File json = new File("/home/arnandigam/Desktop/withuserid.json");
		Response resp = given().header("Authorization", "Bearer "+token).contentType(ContentType.JSON).log().all().log().body().body(json).post();		
		resp.prettyPrint();
		String transcationid = resp.then().extract().path("transactionId");
		System.out.println(transcationid);
	}
	
	public void postReq()
	{
		//uat.market.techcix.cloud/api/cppilot-service/api/v1/shopping-cart/06d28d89-fb03-40b7-8617-855bf35a8664
		RestAssured.baseURI = "https://uat.market.techcix.cloud/api/cppilot-service";
		RestAssured.basePath= "/api/v1/shopping-cart";
		System.out.println("postreq = "+token);
		File json = new File("/home/arnandigam/Desktop/withoutuserid.json");
		Response resp = given().header("Authorization", "Bearer "+token).contentType(ContentType.JSON).log().all().log().body().body(json).post();		
		//resp.prettyPrint();		
	}
	
		public void loginPostReq()
	{
		//uat.market.techcix.cloud/api/cppilot-service/api/v1/shopping-cart/06d28d89-fb03-40b7-8617-855bf35a8664
		RestAssured.baseURI = "https://uat.market.techcix.cloud";
		RestAssured.basePath= "/api/cppilot-service/api/v1/user/login";
		
		File json = new File("/home/arnandigam/Desktop/login.json");
		Response resp = given().contentType(ContentType.JSON).log().all().log().body().body(json).post();		
		resp.prettyPrint();
		userid = resp.then().extract().path("userId");
		token = resp.then().extract().path("token");
		System.out.println(userid);
		System.out.println(token);
	}
	
	
	
	

}
