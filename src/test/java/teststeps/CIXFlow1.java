package teststeps;

import java.awt.AWTException;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class CIXFlow1 {

	private TestContext context;
	private PortfolioPage portfoliopage;
	private CreateNewListing createnewListing;
	private MarketPlacePage marketplace;
	private CixPages cixpages;

	private PlatformAdminPage platformadminpage;
	private InvoicesPage invociespage;



	public CIXFlow1(TestContext context) {
		this.context = context;
		portfoliopage = this.context.getPageObjectManager().getPortfolioPage();
		createnewListing = this.context.getPageObjectManager().getCreateNewListingPage();
		marketplace = this.context.getPageObjectManager().getMarketPlacePage();
		cixpages = this.context.getPageObjectManager().getCixPages();
		platformadminpage=this.context.getPageObjectManager().getplatformadminpage();
	}

//	@Then("I verify Portfolio Page- {string}")
//	public void verifyPortfoliPage(String text) {
//		portfoliopage.verifyingPortfolioPage(text);
//	}

//	@When("I search with Project Id-{string}")
//	public void searchProjectID(String projectid) {
//		portfoliopage.searchingProjectID(projectid);
//	}

	@Then("I verify Project Details in Portfolio Page -{string},{string}")
	public void verifyProjectDetails(String projectid, String projectname) {
		portfoliopage.verifyingProjectDetails(projectid, projectname);
	}

	@And("I click on Manage Listing button")
	public void clickManageListing() {
		portfoliopage.clickingonManageListingButton();
	}

	@Then("I verify Manage Listing Page -{string}")
	public void verifyManageListingPage(String text) throws AWTException {
		portfoliopage.verifyingManageListingPage(text);
	}

	@Then("I verify CIX Market Place is dispalying or not")
	public void verifyCIXMarketPlaceDis() {
		portfoliopage.verifyingCIXMarketPlaceDis();
	}

	@And("I click on CIX market place button")
	public void clickonCIXMarketPlace() {
		portfoliopage.clickingonCIXMarketPlace();
	}

	@Given("I click on New Listing button without entering data in Mandatory fields")
	public void clickonNewListButtwithoutData() {
		createnewListing.clickingonNewListButtwithoutData();
	}

	@Then("I verify mandatory validation messages-{string},{string},{string}")
	public void verifyMandatoryValidations(String pricevaldiationmessage, String quantityvaldiationmessage,
			String confirmvaldiationmessage) {
		createnewListing.verifyingMandatoryValidations(pricevaldiationmessage, quantityvaldiationmessage,
				confirmvaldiationmessage);
	}

	@Given("I enter sales quantity value greater than Total quantity-{string}")
	public void enterSalQuantGretTotQuant(String salesvalue) {
		createnewListing.enteringSalQuantGretTotQuant(salesvalue);
	}

	@Then("I verify validation message for sales quantity-{string}")
	public void verifyValidMessSalesQuant(String message) {
		createnewListing.verifyingValidMessSalesQuant(message);
	}

	@Then("I verify create new listing page- {string}")
	public void verifyCreatingnewListingPage(String text) {
		createnewListing.verifyingCreatingnewListingPage(text);
	}

	@Given("I enter {string} and {string} in create new listing page")
	public void enterDatainCreatnewListPage(String price, String quantity) {
		createnewListing.enteringDatainCreatnewListPage(price, quantity);
	}

	@And("I select the confirm check box")
	public void selectConfirmCheckBox() {
		createnewListing.selectingConfirmCheckBox();
	}

	@When("I click on Create New Listing button")
	public void clickonCreateNewListing() {
		createnewListing.clickingonCreateNewListing();
	}

	@Then("I verify Confirm new listing pop up window-{string},{string},{string} and {string}")
	public void verifyConfirmNewLinstingPopup(String text, String vinatge, String price, String quantity) {
		createnewListing.verifyingConfirmNewLinstingPopup(text, vinatge, price, quantity);
	}

	@When("I click Create New listing button on pop up window")
	public void clickonCreateNewListinginpopup() {
		createnewListing.clickingonCreateNewListinginpopup();
	}

	@Then("I verify whether application is navigating to Listing confirmation page or not-{string},{string},{string} and {string}")
	public void verifyListingConfirmation(String text, String vinatge, String price, String quantity) {
		createnewListing.verifyingListingConfirmation(text, vinatge, price, quantity);
	}

	@Then("I verify CIX Market Place is not displaying")
	public void verifyCIXMarkPlaNotDisplaying() {
		portfoliopage.verifyingCIXMarkPlaNotDisplaying();
	}

	@And("I click on Market Place")
	public void clickMarketPlace() {
		marketplace.clickingMarketPlace();
	}

	@Then("I verify project {string} and {string} option is dipalying aganist {string}")
	public void verifyProjectidMarketPlace(String price,String viewoncix, String projectid) {
		marketplace.verifyingProjectidMarketPlace(price,viewoncix, projectid);
	}

	@Given("I click on view on CIX option against {string} and {string}")
	public void clickonViewinCIX(String price,String projectid) {
		marketplace.clickingonViewonCIX(price,projectid);
	}

	@Then("I verify whether user is naviagted to CIX UI-{string}")
	public void verifyCIXLoginPage(String text) {
		cixpages.verifyingCIXLoginPage(text);
	}

	@Given("I enter {string} and {string} in CIX Login Page and click on login button")
	public void loginintoCIX(String username, String password) {
		cixpages.logingintoCIX(username, password);
	}

	@And("I click on Project details button and click on See More Vinatges button")
	public void clickProjectDetailsbutton() {
		cixpages.clickingProjectDetailsbutton();
	}

	@Then("I verify Project details:{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void verifyOrderSumCIX(String vinatge, String price,String Amount,String CIXfees,String subtotal,String carbonfees, String GST,
			String totaltonnes, String totalprice) {
		cixpages.verifyingOrderSumCIX(vinatge, price, Amount, CIXfees, subtotal, carbonfees,GST,totaltonnes,totalprice);
	}

	@Given("I  Enter {string} in amount field,click on add button and then click on see order summary")
	public void enterQuantityClickAddButton(String amount) {
		cixpages.enteringQuantityClickingAddButton(amount);
	}
	
	@Then("I verify project {string} and Update Listing option is dipalying aganist '1218' project")
	public void verifyUpdateListingLink(String price)
	{
		marketplace.verifingUpdateListingLink(price);
	}
	
	@And("I click on Add Cart button")
	public void clickAddCartButton() {
		cixpages.clickingAddCartButton();
	}
	
	@Then("I verify payment cart:{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void verifyReviewPaymentCIX(String vinatge, String price,String Amount,String CIXfees,String subtotal,String carbonfees, String GST,
			String totaltonnes, String totalprice,String projectstotal) {
		cixpages.verifyingReviewPaymentCIX(vinatge, price, Amount, CIXfees, subtotal, carbonfees,GST,totaltonnes,totalprice,projectstotal);
	}
	
	@And("I click on confirm check and click on click on settle via carbon place")
	public void clickconfirmchecknsettlecarboncredits() throws AWTException {
		cixpages.clickingconfirmchecknsettlecarboncredits();
	}
	
//	@When("I click on Invoices Menu Item")
//	public void clickonInvoiceMenuItem() {
//		invociespage.clickingonInvoiceMenuItem();
//	}
	
	@Then("I verify Invocies Page-{string}")
	public void verifyInvoicePageTitle(String expectedtitle) {
		invociespage.verifyingInvoicePageTitle(expectedtitle);
	}
	
	@And("I verify Invoice record has been created with {string} price and status as {string}")
	public void verifyInvoicerecord(String price,String status) {
		invociespage.verifyingInvoicerecord(price,status);
	}
	
	@When("I click on Download Invoice menu item aganist {string} invoice record")
	public void clickonDownloadInvoice(String price) {
		invociespage.clickingonDownloadInvoice(price);
	}
	
	@And("I click on View Invoice menu item")
	public void clickonViewInvoice(String price) {
		invociespage.clickingonViewInvoice(price);
	}
	
	
	@And("I click on MarketPlace")
	public void clickonmarketplace()
	{
		marketplace.clickingMarketPlace();
	}

	@Then("I verify {string} option is displaying against the {string} project or not")
	public void viewcix(String ViewonCIX,String Projectid)
	{
		marketplace.verifyingviewcixoption(ViewonCIX,Projectid);
	}


	@Then("I verify Active listings projects have {string} button")
	public void updatelisting(String updatebutton)
	{
    portfoliopage.verifyingupdatebutton(updatebutton);
	}


 @When("I click on update button")
	public void updateclick(){
		portfoliopage.updateclick();
 }

 @Then("I verify whether application is navigating to {string}")
	public void verfyingupdatepage(String text){
		portfoliopage.verfyingupdatepage(text);
 }


 @Given("I enter {string}  other than integers")
	public void enterprince(String price){
		portfoliopage.enterprice(price);
 }



	@And("I click on projects page")
	public void i_click_on_projects_page() {
		platformadminpage.clickingonprojects();

	}

	@Given("I search for project {string}")
	public void projectsearch(String projectname) {
		platformadminpage.enteringprojectname(projectname);
	}










	@When("I click on Credit Type dropdown to open")
	public void clickonCredit_Type(){
		platformadminpage.clickingoncreditypefilter();
	}

	@And("I search for Credit Type  {string} in search-box")
	public void searchcredittype(String credittype){
		platformadminpage.searchcredittype(credittype);
	}

	@And("I select the Credit Type as {string}")
	public void credittypecheckbox(String credittype){
		platformadminpage.selectcredittype(credittype);
	}

	@When("I click on Credit Type dropdown to close")
	public void clickoncrditypeclose(){
		platformadminpage.clickingoncreditypefilter();
	}









	@When("I click on Project dropdown to open")
	public void clickonproject(){
		platformadminpage.clickingonprojectfilter();
	}

	@And("I search for Project  {string} in search-box")
	public void searchproject(String project){
		platformadminpage.searchproject(project);
	}

	@And("I select the Project as {string}")
	public void projectnamecheckbox(String projectname){
		platformadminpage.selectprojectname(projectname);
	}

	@When("I click on Project dropdown to close")
	public void clickonprojectclose(){
		platformadminpage.clickingonprojectfilter();
	}





	@And("I click on Export to CSV button to download")
	public void i_click_export(){
		platformadminpage.clickonexport();
	}


	@When("I click on settings icon to open")
	public void clickonsettings(){
		platformadminpage.clickingonsettingsicon();
	}

	@And("I de-select Registry checkbox")
	public void clickonregistry(){
		platformadminpage.clickingonregistry();
	}

	@And("I de-select Project Name checkbox")
	public void clickonprojectname(){
		platformadminpage.clickingonprojectname();
	}

	@And("I de-select Credit Type checkbox")
	public void clickoncredittype(){
		platformadminpage.clickingoncredittype();
	}

	@And("I de-select status checkbox")
	public void clickonstatus(){
		platformadminpage.clickingonstatus();
	}

	@And("I de-select Credits On-Ramped checkbox")
	public void clickoncreditsonramp(){
		platformadminpage.clickingoncreditsonramp();
	}

	@And("I click on save button")
	public void clickonsave(){
		platformadminpage.clickingonsavebutton();
	}




	@When("I click on All filters button")
	public void allfiltersbutton(){
		platformadminpage.clickingallfiltersbutton();
	}


	@When("I click on View Results button")
    public void clickonviewresultsbutton(){
		platformadminpage.clickingonviewresultsbutton();
	}


	@And("I click on Clear filters option")
	public void clickonclearfilters(){
		platformadminpage.clickingonclearfilters();
	}


    @And("I click on View Project button")
	public void clickonviewproject(){
		platformadminpage.clickingonviewproject();
	}

	@Then("I verify {string} page is displaying or not")
	public void verifyHomePage(String text) {
		platformadminpage.verifyingprojectssummary(text);
	}


	@And("I click on order management")
	public void clickonordermanagement()
	{
		platformadminpage.clickingordermanagement();
	}

  @Then("I verify  {string} page is displaying or not")
	public void verifypendingorderspage(String text)
  {
	  platformadminpage.verfyingpendingorderspage(text);
  }



	@When("I click on Vintage dropdown to open")
	public void clickonvintage(){
		platformadminpage.clickingonvintagefilter();
	}


	@And("I search for Vintage  {string} in search-box")
	public void searchvintage(String Vintage){
		platformadminpage.searchvinatge(Vintage);
	}

	@And("I select the Vintage {string}")
	public void vintagecheckbox(String vintage){
		platformadminpage.selectvintage(vintage);
	}

	@When("I click on Vintage dropdown to close")
	public void clickonvintagetoclose(){
		platformadminpage.clickingonvintagefilter();
	}



	@When("I click on Marketplace dropdown to open")
	public void clickonMarketplace(){
		platformadminpage.clickingonMarketplace();
	}


	@And("I select Climate Impact option")
	public void selectCIX(){
		platformadminpage.selectingcIX();
	}
	@And("I select Carbonplace option")
	public void selectcarbonplace(){
		platformadminpage.selectingcarbonplace();
	}

	@When("I click on Marketplace dropdown to close")
	public void clickonMarketplacetoclose(){
		platformadminpage.clickingonMarketplace();
	}

	@When("I click  on Manage Listing button")
	public void clickonmanagelisting(){
		platformadminpage.clickonmanagelisting();
	}

	@Then("I verify Listing management page-{string}")
	public void verifylistingmangementpage(String text) {
		platformadminpage.verifyinglistingpage(text);
	}


	@Then("I verify project {string} and cancel listing option is displaying against {string} project")
	public void verifycancelOption(String price,String marketplace){
		platformadminpage.verifycaneloption(price, marketplace);
	}

//	@And("I click on Carbonplace market place button")
//	public void clickonCPMarketPlace() {
//		platformadminpage.clickingonCPMarketPlace();
//	}


//	@Then("I verify carbonplace marketplace page-{string}")
//	public void verifycarbonplacepage(String text) {
//		platformadminpage.verifyingcarbonplacepage(text);
//	}


//	@Given("I enter  {string} and {string} in create new listing page")
//	public void enterData(String price, String quantity) {
//		platformadminpage.enteringDatainCreatnewListPage(price, quantity);
//	}


//    @And("I select Retirement required? as {string}")
//	public void retirementrequired(String retirement){
//		platformadminpage.retirementrequired(retirement);
//	}

	@And("I select Purchase Preferences as {string}")
	public void PurchasePreferences(String preferences){
		platformadminpage.selectingpurchasepreferences(preferences);
	}

//	@And("I select the  confirm check box")
//	public void selectconfirmcheckBox() {
//		platformadminpage.selectingConfirmCheckBox();
//	}

//	@When("I click on  Create New Listing button")
//	public void clickoncreatenewListing() {
//		platformadminpage.clickingonCreateNewListing();
//	}


//	@Then("I verify  Confirm new listing pop up window-{string}")
//	public void verifyconfirmnewlinstingPopup(String text) {
//		platformadminpage.verifyingConfirmNewLinstingPopup(text);
//	}


//	@When("I click  Create New listing button on pop up window")
//	public void clickoncreatNewListinginpopup() {
//		platformadminpage.clickingonCreateNewListinginpopup();
//	}


//	@Then("I verify whether application is navigating to Listing confirmation page or not-{string}")
//	public void verifylistingconfirmation(String text) {
//		platformadminpage.verifyingListingConfirmation(text);
//	}









	@Then("I verify Project Details in Marketplace  Page -{string},{string}")
	public void verifyprojectdetails(String projectid, String marketplace) {
		platformadminpage.verifyingProjectDetails(projectid, marketplace);
	}

























//	@Then("I verify Purchase Page- {string}")
//	public void verifyPurchasepage(String text){
//		platformadminpage.verifyPurchasepage(text);
//	}












	@Then("I verify  Project Details in order management Page -{string},{string}")
	public void verifyProjectdetails(String projectid, String status) {
		platformadminpage.verifyingProjectdetails(projectid, status);
	}


	@Then(" I verify Project Details in Portfolio Page -{string},{string}")
	public void verifyProjectregistry(String projectid, String status) {
		platformadminpage.verifyingProjectdetails(projectid, status);
	}







//	@Then("I verify  Project Details in Portfolio Page -{string},{string}")
//	public void verifyregistry(String ProjectID, String Registry) {
//		portfoliopage.Verifyingregistry(ProjectID, Registry);
//	}

}


