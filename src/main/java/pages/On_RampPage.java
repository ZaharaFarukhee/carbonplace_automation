package pages;

import managers.WebDriverManager;
import org.openqa.selenium.WebElement;

public class On_RampPage {
    private WebDriverManager app;

    private WebElement test;

    public On_RampPage(WebDriverManager app) {
        this.app = app;
    }
    public void clickOnverraRegistry(String registry){
        app.log("clicking on the verra registry");
        app.selectRegistry(registry);
    }
    public void verifyingPage(String data){
        app.log("verifying whether the text"+data+"is present or not");
        app.verifyText("verifyRegistry_xpath",data,true);
    }
    public void clickingonIhavecompletedtransferrwquestbutton(){
        app.log("clickingonIhavecompletedtransferrwquestbutton");
        app.click("verraRegistryiHavecompletedbutton_xpath",true);
    }
    public void enteringSerialNumber(String data){
        app.log("enteringSerialNumber");
        app.type("serialno_xpath",data,true);
    }
    public void clickOnConfirmSerialNumberButton(){
        app.log("clickOnConfirmSerialNumberButton");
        app.click("confirmSerialNo_xpath",true);
    }
    public void verifyTransferStatus(String data){
        app.log("verifying the "+data +"is present or not");
        app.verifyText("",data,true);
    }

    public void clickingonon_ramp() {
        app.log("Clicking on on_Ramp button");
        app.mouseOver("on_Ramp_xpath");
        app.click("on_Ramp_xpath", true);
    }


    public void newprojectID(String NewProjectiD) {
        app.log("Entering valid Project ID - "+NewProjectiD);
        app.type("NewProjectiD_xpath", NewProjectiD, true);
        app.wait(2000);



    }


    public void clickingonregistry() {
        app.log("Clicking on registry button");
        app.click("registry_xpath", true);
    }


    public  void clickonCreatenewproject() {
        app.log("Clicking on Create new project button");

        app.click("Createnewproject_xpath", true);

    }



    public void projectDeatils(String projectname, String projectdescription, String projectlink, String projectdeveloper){
        app.log("Entering valid project details - "+projectname+" and "+projectdescription+" and "+ projectlink+"and"+projectdeveloper);
        app.type("projectName_xpath", projectname, true);
        app.type("projectdescription_xpath", projectdescription, true);
        app.type("projectlink_xpath", projectlink, true);
        app.type("projectdeveloper_xpath", projectdeveloper, true);

    }

    public  void selectcountry() {
        app.log("selecting the project country");
        app.click("Searchdropdown_xpath", true);
        app.click("country_xpath", true);

    }

    public void selectDurability() {
        app.log("selecting the project  durability");
        app.click("Durability_xpath", true);
    }

    public void selectRemoval() {
        app.log("selecting the project  Removel and avoidance");
        app.click("Removal/avoidance_xpath", true);
    }

    public void selectRemovalmethod() {
        app.log("selecting the project  Removel and avoidance method");
        app.click("Removal/avoidanceMethod_xpath", true);
    }

   public void registrylink(String registry){
        app.log("entering registry link - "+registry);
       app.type("registrylink_xpath", registry, true);
   }



    public  void projecttype() {
        app.log("selecting the project type details");
        app.click("projectdropdown_xpath", true);
        app.click("projecttype_xpath", true);

    }


    public  void Accountingmethodologies() {
        app.log("selecting the Accounting methodologies");
        app.click("Accountingdropdown_xpath", true);
        app.click("Accountingmethodolgy_xpath", true);
        app.click("Accounting_xpath", true);


    }

    public  void DevelopmentGoals() {
        app.log("selecting the development goals");
        app.click("goals_xpath", true);

    }

    public  void Certificationstype() {
        app.log("selecting the Certifications type");
        app.click("Certificationstype_xpath", true);

    }

    public  void  NextCarbonebutton() {
        app.log("selecting the next carbon credits button");
        app.click("NextCarbonebutton_xpath", true);

    }


    public void confirmation(String text) {
        app.wait(20000);
        app.log("Verifying whether" +text+ "is present in CP Home Page");
        app.verifyTextinPage(text, false);
//	app.AssertAll();

    }


    public  void selectcredittype() {
        app.log("selecting the credit type");
        app.click("credittypedropdown_xpath", true);
        app.click("credittype_xpath", true);

    }



    public void VinatgeDetails(String vintage, String vintageQuantity, String QuantityonRamp){
        app.log("Entering valid Vinatge details - "+vintage+" and "+vintageQuantity+" and "+ QuantityonRamp);
        app.type("vintage_xpath", vintage, true);
        app.type("vintageQuantity_xpath", vintageQuantity, true);
        app.type("QuantityonRamp_xpath", QuantityonRamp, true);


    }


    public void submissionnotes(String notes) {
        app.log("Entering valid submission noate - " + notes);
        app.type("notes_xpath", notes, true);
    }


    public void nextconfirmation(){
        app.log("clicking on next confirmation button");
        app.click("nextconfirmation_xpath",true);
    }



    public void CarbonCreditinformation(String text) {
        app.wait(20000);
        app.log("Verifying whether" +text+ "is present in CP Home Page");
        app.verifyTextinPage(text, false);

    }


    public void clickonsubmit(){
        app.log("clicking on submit button");
        app.click("submitButton_xpath",true);
    }




    public void verifysubmitpopup(String text) {
        app.wait(20000);
        app.log("Verifying whether" +text+ "is present in CP Home Page");
        app.verifyTextinPage(text, false);
//	app.AssertAll();

    }


    public void submitpopup(){
        app.log("clicking on submit button on pop-up page");
        app.click("submitpopupbutton_xpath",true);
    }



    public void verifyprojects(String text) {
        app.wait(20000);
        app.log("Verifying whether" +text+ "is present in CP Home Page");
        app.verifyTextinPage(text, false);
//	app.AssertAll();

    }



    public void verifyonrampprojectcredits(String text) {
        app.wait(20000);
        app.log("Verifying whether" +text+ "is present in CP Home Page");
        app.verifyTextinPage(text, false);

    }

    public void verifycarboncreditsdetails(String text) {
        app.wait(20000);
        app.log("Verifying whether" +text+ "is present in CP Home Page");
        app.verifyTextinPage(text, false);

    }


    public void searchingProjectID(String projectid) {
        app.log("Tying " + projectid + " in search box");
        app.type("projectsearchbar_xpath", projectid, true);
    }


    public void verifyingProjectDetails(String projectid, String projectname) {
        app.log("Verifying " + projectid + " and " + projectname + " are displaying");
        app.isElementPresent("projectidtext_xpath", false);
        app.verifyText("projectname_xpath", projectname, true);
    }



    public void verifyverraProject(String qty,String status){
        app.log("verify the "+qty+"and"+status+"is present or not");
        test=app.getWebelementfromWebTable(qty,4);
        if(!test.getText().equals(status)){
            app.reportFailure(status+" is not the status of the record", true);
        }else {
            app.reportPass(status + " is the status of the record");
        }
    }


}

