package teststeps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class CPFlow {


    private TestContext context;
    private PortfolioPage portfoliopage;
    private CreateNewListing createnewListing;
    private MarketPlacePage marketplace;
    private CixPages cixpages;

    private PlatformAdminPage platformadminpage;
    private InvoicesPage invociespage;

    private OrdermanagementPage ordermanagementpage;


    public CPFlow(TestContext context) {
        this.context = context;
        portfoliopage = this.context.getPageObjectManager().getPortfolioPage();
        createnewListing = this.context.getPageObjectManager().getCreateNewListingPage();
        marketplace = this.context.getPageObjectManager().getMarketPlacePage();
        cixpages = this.context.getPageObjectManager().getCixPages();
        platformadminpage = this.context.getPageObjectManager().getplatformadminpage();
        ordermanagementpage = this.context.getPageObjectManager().getordermanagementpage();
        invociespage = this.context.getPageObjectManager().getInvoicesPage();
    }

    @Then("I verify Portfolio Page- {string}")
    public void verifyPortfolioPage(String text) {
        portfoliopage.verifyingPortfolioPage(text);
    }


    @When("I search with Project Id-{string}")
    public void searchProjectID(String projectID) {
        portfoliopage.searchingProjectID(projectID);
    }

    @Then("I verify  Project Details in Portfolio Page -{string},{string}")
    public void verifyRegistry(String ProjectID, String Registry) {
        portfoliopage.verifyingRegistry(ProjectID, Registry);
    }

    @When("I click  on Manage  Listing button")
    public void clickOnManageListing() {
        portfoliopage.clickOnManageListing();
    }


    @Then("I verify Listing management page- {string}")
    public void verifyListingManagementPage(String text) {
        createnewListing.verifyingListingPage(text);
    }


    @And("I click on Carbonplace market place button")
    public void clickOnCPMarketPlace() {
        createnewListing.clickingOnCpMarketPlace();
    }


    @Then("I verify carbonplace marketplace page-{string}")
    public void verifyCarbonPlacePage(String text) {
        createnewListing.verifyingCarbonplacePage(text);
    }


    @Given("I enter  {string} and {string} in create new listing page")
    public void enterData(String price, String quantity) {
        createnewListing.enteringDataInCreateNewListPage(price, quantity);
    }


    @And("I select Retirement required? as {string}")
    public void retirementRequired(String retirement) {
        createnewListing.retirementRequired(retirement);
    }


    @And("I select  Purchase Preferences as {string}")
    public void purchasePreferences(String preferences) {
        createnewListing.selectingPurchasePreferences(preferences);
    }


    @And("I select the  confirm check box")
    public void selectConfirmCheckBox() {
        createnewListing.selectingConfirmCheckBox();
    }


    @When("I click on  Create New Listing button")
    public void clickOnCreateNewListing() {
        createnewListing.clickingOnCreateNewListing();
    }

    @Then("I verify  Confirm new listing pop up window-{string}")
    public void verifyConfirmNewListingPopupText(String text) {
        createnewListing.verifyingConfirmNewLinstingPopup(text);
    }

    @When("I click  Create New listing button on pop up window")
    public void clickOnCreateNewListingInPopup() {
        createnewListing.clickingOnCreateNewListinginpopup();
    }

    @Then("I verify whether application is navigating to Listing confirmation page or not-{string}")
    public void verifyListingConfirmation(String text) {
        createnewListing.verifyingListingConfirmation(text);
    }


    @And("I click  on MarketPlace")
    public void clickOnMarketplace() {
        marketplace.clickingMarketplace();
    }


    @Then("I verify the project with  {string} having {string} option")
    public void verifyPurchaseNowOption(String price, String verification) {
        marketplace.verifyPurchaseNowOption(price, verification);
    }


    @When("I click on Purchase Now button")
    public void clickOnPurchaseNow() {
        marketplace.clickingOnPurchaseNowButton();
    }

    @Then("I verify Purchase page - {string}")
    public void verifyPurchasePage(String text) {
        marketplace.verifyPurchasePage(text);
    }


    @And("I enter {string}")
    public void enterQuantity(String Quantity) {
        marketplace.enterQuantity(Quantity);
    }


    @And("I  select confirm checkbox")
    public void selectConfirmCheck() {
        marketplace.selectingConfirmCheckBox();
    }


    @When("I click on  Confirm Purchase button")
    public void clickOnConfirmPurchase() {
        marketplace.clickingOnConfirmPurchase();
    }

    @Then("I  verify  Confirm Purchase pop up window-{string}")
    public void verifyConfirmNewListingPopup(String text) {
        marketplace.verifyingConfirmPurchase(text);
    }


    @When("I click on confirm purchase button on pop-up window")
    public void clickOnConfirmPurchaseOnPopup() {
        marketplace.clickingOnConfirmPurchaseOnPopup();
    }

    @Then("I verify whether application is navigating to Purchase Confirmation page or not-{string}")
    public void verifyPurchaseConfirmationPage(String text) {
        marketplace.verifyingConfirmation(text);
    }


    @Then("I verify Order Management Page- {string}")
    public void verifyOrderManagementPage(String text) {
        ordermanagementpage.verifyOrderManagementPage(text);
    }


    @Then("I verify  the project with  {string} having {string} option")
    public void verifyBankApproveTransaction(String price, String verification) {
        ordermanagementpage.verifyPurchaseNowOption(price, verification);
    }


    @When("I click on three dots icon")
    public void clickOnThreeDotsIcon() {
        ordermanagementpage.clickingOnThreeDots();
    }


    @And("I click  on View order button")
    public void clickingOnViewOrderOption() {
        ordermanagementpage.clickingOnViewOrderOption();
    }

    @And("I click on Approve Transaction option")
    public void clickingOnApproveTransaction() {
        ordermanagementpage.clickingOnApproveTransaction();
    }


    @Then("I verify Approve Transaction pop-up window-{string}")
    public void verifyApproveTransaction(String text) {
        ordermanagementpage.verifyApproveTransaction(text);
    }


    @And("I click on Approve Transaction  button")
    public void clickOnApproveTransactionButton() {
        ordermanagementpage.clickingOnApproveTransactionButton();
    }


    @And("I click on order management page")
    public void clickOnOrderManagementPage() {
        ordermanagementpage.clickingOnOrderManagementPage();
    }


    @Then("I verify the project under Pending orders--{string},{string},{string},{string}")
    public void verifyProjectDetailsUnderOrderManagement(String ProjectID, String vintage, String quantity, String text) {
        ordermanagementpage.verifyingProjectDetails(ProjectID, vintage, quantity, text);
    }


    @Then("I verify the project with {string} having {string} option")
    public void verifyOrderStatus(String price, String status) {
        ordermanagementpage.verifyOrderStatus(price, status);
    }


    @Then("I verify the  project with {string} having {string} option")
    public void verifyOrderCreated(String price, String verification) {
        ordermanagementpage.verifyOrderCreated(price, verification);
    }

    @And("I click on View order button of project")
    public void clickingOnViewOrder() {
        ordermanagementpage.clickingOnViewOrder();
    }


    @Then("I verify Project Timeline status in order page is displayed as {string} pending or not")
    public void verifyOrderTimeline(String text) {
        ordermanagementpage.verifyingOrderTimeline(text);
    }

    @Then("I verify user is navigated to order page or not -{string}")
    public void verifyingNavigatingToOrderPage(String text) {
        ordermanagementpage.verifyingOrderManagementPage(text);
    }


    @Then("I verify Download Invoice button is enabled or not")
    public void verifyInvoiceButton() {
        ordermanagementpage.verifyingInvoiceButtonIsEnabled();
    }

    @And("I click on Download Invoice button")
    public void clickingOnDownloadInvoiceButton() {
        ordermanagementpage.clickingOnDownloadInvoice();
    }


    @Then("I verify Download  Invoice button is enabled or not")
    public void verifyInvoiceButtonInBuyerAccount() {
        ordermanagementpage.verifyingInvoiceButtonIsEnabledInBuyerAccount();
    }

    @And("I click on Download  Invoice button")
    public void clickingOnDownloadInvoiceButtonInBuyerAccount() {
        ordermanagementpage.clickingOnDownloadInvoiceInBuyerAccount();
    }


    @Then("I verify Number of credits available: {string}")
    public void verifyTotalQuantityAvailable(String text) {
        marketplace.verifyTotalQuantityAvailable(text);
    }

    @When("I click on  Marketplace dropdown to open")
    public void clickOnMarketplaces() {
        marketplace.clickingOnMarketplaceFilter();
    }

    @And("I select the  {string}")
    public void selectingTheMarketplace(String Marketplace) {
        marketplace.selectingMarketplace(Marketplace);
    }

    @When("I click on  Vintage dropdown to open")
    public void clickOnVintage() {
        marketplace.clickingOnVintageFilter();
    }

    @And("I select the {string}")
    public void selectingTheVintage(String Vintage) {
        marketplace.selectingVintage(Vintage);
    }

    @Then("I verify the message-{string}")
    public void verifyingProjectAvailableOrNot(String text) {
        marketplace.verifyingProject(text);

    }

    @Then("I verify the  project with  {string} having {string} option")
    public void verifyOrderCreatedInBuyerBank(String price, String quantity) {
        ordermanagementpage.verifyOrderCreatedInBuyerBank(price, quantity);
    }


    @Then("I verify  Payment completed status in order page is displayed as {string} pending or not")
    public void verifyPaymentTimeline(String text) {
        ordermanagementpage.verifyingPaymentTimeline(text);
    }

    @Then("I verify status is displayed as {string} or not")
    public void verifyingPaymentStatus(String text) {
        ordermanagementpage.verifyingPaymentStatus(text);
    }

    @Then("I verify the   project with {string} having {string} option")
    public void verifyOrderCreate(String price, String verification) {
        ordermanagementpage.verifyOrderStatus(price, verification);
    }

    @And("I click on View order button of  project")
    public void clickingOnViewOrders() {
        ordermanagementpage.viewOrder();
    }

    @When("I click on three  dots icon")
    public void clickOnThreeDots() {
        ordermanagementpage.clickingOnThreeDotsIcon();
    }

    @When("I click on order History tab")
    public void clickOnHistoryTab() {
        ordermanagementpage.clickingOnOrderHistoryTab();
    }

    @Then("I verify user able to navigate to Order history -{string}")
    public void verifyOrderHistoryTab(String text) {
        ordermanagementpage.verifyOrderHistory(text);
    }

    @When("I search with Project Id -{string}")
    public void searchProjectWithId(String projectID) {
        portfoliopage.searchingProjectWithId(projectID);
    }

    @And("I click on  View order button of project")
    public void clickingOnViewOrderInOrderHistory() {
        ordermanagementpage.clickingOnViewOrderInOrderHistory();
    }

    @Then("I verify  Timeline status in order page is displayed as {string} pending or not")
    public void verifyTimeline(String text) {
        ordermanagementpage.verifyingTimeline(text);
    }


    @When("I search with Project  Id -{string}")
    public void searchProjectWithID(String projectID) {
        ordermanagementpage.searchingProjectWithId(projectID);
    }

    @And("I click on  View order  button of project")
    public void clickingViewOrderInOrderHistory() {
        ordermanagementpage.clickingOnViewOrderInHistory();
    }


    @And("I click on invoices page")
    public void clickOnInvoicesPage() {
        invociespage.clickingOnInvoiceMenuItem();
    }

    @Then("I verify invoices page - {string}")
    public void verifyInvoicesPage(String text) {
        invociespage.verifyInvoicesPage(text);
    }

    @Then("I  verify the project with {string} having {string} option")
    public void verifyInvoiceStatus(String price, String verification) {
        invociespage.verifyInvoicesStatus(price, verification);
    }

    @And("I click on View Invoices option")
    public void clickOnInvoices() {
        invociespage.clickingOnViewInvoice();
    }

    @Then("I verify whether user is able to navigate to {string}")
    public void verifyViewInvoice(String text) {
        invociespage.verifyingViewInvoice(text);
    }

    @And("I click  on invoices page")
    public void clickInvoicesPage() {
        invociespage.clickingOnInvoiceMenu();
    }


    @Then("I verify {string},{string},{string},{string},{string} are displayed correctly or not")
    public void verifyingProject(String ProjectID, String ProjectName, String Qty, String Amount, String Fee) {
        invociespage.verifyingProject(ProjectID, ProjectName, Qty, Amount, Fee);
    }


    @And("I  click  on invoices page")
    public void clickingOnInvoicesPage() {
        invociespage.clickOnInvoiceMenu();
    }

    @Then("I verify Purchase Page- {string}")
    public void verifyingPurchasePage(String text) {
        ordermanagementpage.verifyPurchasePage(text);
    }


    @And("I click on Approve Transaction button")
    public void clickingOnApproveTransactionButton() {
        ordermanagementpage.clickingOnApproveTransactionButtons();
    }


    @Then("I verify Approve Transaction pop-up window- {string}")
    public void verifyApprovePopup(String text) {
        ordermanagementpage.verifyApproveTransactionPopup(text);
    }


    @And("I click on Approve Transaction button on pop-up window")
    public void clickOnApproveTransactionButtonOnPopup() {
        ordermanagementpage.clickingOnApproveTransactionButtonOnPopup();
    }


    @Then("I verify Order Page- {string}")
    public void verifyOrderPage(String text) {
        ordermanagementpage.verifyOrderPage(text);
    }

    //downforce


    @And("I click on On-Ramp Credits page")
    public void ClickOnRamp() {
        marketplace.ClickingOnRamp();
    }

    @Then("I verify On-Ramp Credits page-{string}")
     public void verifyOnRamp(String text)
    {
        marketplace.verifyOnRampPage(text);
    }

   @Then("I verify {string} is available or not")
    public void verifyDownforceRegistry(String registry)
   {
       marketplace.verifyingDownforceRegistry(registry);
   }


   @And("I click on Account settings")
    public void clickOnAccountSettings()
   {
       marketplace.clickingOnAccountSettings();
   }

   @Then("I verify Account settings page-{string}")
    public void verifyAccountSettings(String text)
   {
       marketplace.verifyAccountSettings(text);
   }

   @When("I click on update button of linked Accounts")
    public void clickOnUpdateButton(){
        marketplace.clickingOnUpdateButton();
   }

   @And("I click on Platform dropdown to open")
    public void clickPlatformDropdown(){
        marketplace.clickingOnPlatformDropdown();
   }


  @And("I select on Downforce")
    public void selectDownforce(){
        marketplace.selectingDownforce();
  }



  @And("I enter the  userId-{string}")
    public void enterUserid(String userID){
        marketplace.enteringUserId(userID);
  }


  @And("I click on  save button")
    public void clickOnSaveButton(){
        marketplace.clickingOnSave();
  }



  @Then("I verify downforce registry id is added or not-{string}")
    public void verifyUserid(String text){
        marketplace.verifyingUserId(text);
  }



    @When("I click on Registry dropdown to open")
    public void clickOnRegistry(){
        marketplace.clickingOnRegistryFilter();
    }


    @And("I search for registry  {string} in search-box")
    public void searchRegistry(String RegistryName){
        marketplace.searchRegistry(RegistryName);
    }


    @And("I select the registry as {string}")
    public void registryCheckbox(String registry){
        marketplace.selectRegistry(registry);
    }

    @When("I click on Registry dropdown to close")
    public void clickOnRegistryClose(){
        marketplace.clickingOnRegistryFilter();
    }



    @Then("I verify home page-{string}")
    public void verifyProjectPage(String text){
        marketplace.verifyingProjectsPage(text);
    }



}
