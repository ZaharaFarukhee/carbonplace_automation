package teststeps;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class Login {

	private TestContext context;
	private HomePage homepage;
	private LandingPage landingpage;
	private LoginPage loginpage;

	public Login(TestContext context) {
		this.context = context;
		this.homepage = context.getPageObjectManager().getHomePage();
		this.landingpage = context.getPageObjectManager().getLandingPage();
		this.loginpage = context.getPageObjectManager().getLoginPage();
	}

	@Before
	public void before(Scenario scenario) {
		context.createScenario(scenario.getName());
		context.log("Starting scenario " + scenario.getName());
		System.out.println("test");
	}

//	@After
//	public void after(Scenario scenario) {
//		context.log("Ending scenario " + scenario.getName());
//		context.endScenario();
//		context.getPageObjectManager().getWebDriverManager().quit();
//		System.out.println("-------------------------------------------------");
//	}

	@Given("I open a {string} Browser")
	public void launchBrowser(String browser) {
		landingpage.load(browser);
	}

	@And("I go to URL")
	public void openUrl() {
		landingpage.url();
	}

	@Then("I validate landing page title")
	public void verifyTitle() {
		landingpage.verifyingPageTitle();
	}

	@And("I verify CP Landing page - {string}")
	public void verifyLandingPage(String text) {
		landingpage.verifyingLandingPage(text);
	}

	@When("I Click on Log in button in Landing Page")
	public void clickLogin() {
		landingpage.clickingLoginButton();
	}

	@Then("I verify Cp Login page - {string}")
	public void verifyLoginPage(String text) {
		loginpage.verifyingLoginPage(text);
	}

	@Given("I enter {string} and {string} in Cp Login Page")
	public void loginDetails(String emailAddress, String password) {
		loginpage.enteringLoginDetails(emailAddress, password);
	}

	@And("I click on Continue button")
	public void clickContinue() {
		loginpage.clickingonContinue();
	}

	@Then("I verify Home Page - {string}")
	public void verifyHomePage(String text) {
		homepage.verifyingHomePage(text);
	}

	@And("I click on {string} password button")
	public void clickshowPassword(String buttonname) {
		loginpage.clickingonShowPassword(buttonname);
	}

	@Then("I verify {string} {string}")
	public void verifyPasswordVisibility(String password, String visibilitycheck) {
		String visibility = null;
		if (visibilitycheck == visibility) {
			loginpage.verifyShowPassword(password);
		} else {
			loginpage.verifyHidePassword(password);
		}
	}

	@Then("I verify for {string} error message")
	public void verifyInvlaidLogin(String errormessage) {
		loginpage.invalidLoginErrorMessVerification(errormessage);
	}

	@Given("I dont enter Email Address and Password in Cp Login Page and I click on Conitune button")
	public void verifyValidMessage(String message) {

	}





















}
