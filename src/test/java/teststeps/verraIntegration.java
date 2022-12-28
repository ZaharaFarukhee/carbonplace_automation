package teststeps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class verraIntegration {
    private TestContext context;
    private PortfolioPage portfoliopage;
    private CreateNewListing createnewListing;
    private MarketPlacePage marketplace;
    private CixPages cixpages;

    private PlatformAdminPage platformadminpage;
    private InvoicesPage invociespage;

    private OrdermanagementPage ordermanagementpage;

    private On_RampPage on_ramppage;




    public verraIntegration(TestContext context) {
        this.context = context;
        portfoliopage = this.context.getPageObjectManager().getPortfolioPage();
        createnewListing = this.context.getPageObjectManager().getCreateNewListingPage();
        marketplace = this.context.getPageObjectManager().getMarketPlacePage();
        cixpages = this.context.getPageObjectManager().getCixPages();
        platformadminpage = this.context.getPageObjectManager().getplatformadminpage();
        ordermanagementpage = this.context.getPageObjectManager().getordermanagementpage();
        invociespage = this.context.getPageObjectManager().getInvoicesPage();
    }
    @When("I click on {string} registry")
    public void clickOnverraRegistry(String registry){
        on_ramppage.clickOnverraRegistry(registry);
    }
    @Then("I verify it navigates to {string} registry page")
    public void verifyingPage(String data){
        on_ramppage.verifyingPage(data);
    }
    @And("I click on I have completed the transfer request button")
    public void clickingonIhavecompletedtransferrwquestbutton(){
        on_ramppage.clickingonIhavecompletedtransferrwquestbutton();
    }
    @And("I enter the serial number-{string}")
    public void enteringSerialNumber(String data){
        on_ramppage.enteringSerialNumber(data);
    }
    @And("I click on confirm serial number")
    public void clickOnConfirmSerialNumberButton(){
        on_ramppage.clickOnConfirmSerialNumberButton();
    }
    @Then("I verify the transfer status as {string}")
    public void verifyTransferStatus(String data){
        on_ramppage.verifyTransferStatus(data);
    }
    @Then("I verify verra project with {string} and {string}")
    public void verifyverraProject(String qty,String status){
        on_ramppage.verifyverraProject(qty,status);
    }

    @When("I click on On-Ramp Credits")
    public void i_click_on_client_management_page() {
        on_ramppage.clickingonon_ramp();

    }



}
