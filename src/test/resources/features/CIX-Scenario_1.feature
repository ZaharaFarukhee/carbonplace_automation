@CIXflow
Feature: CP-CIX Integrations flow
      
  Background:
    Given I open a 'Chrome' Browser
    And  I go to URL
    Then I validate landing page title
    And I verify CP Landing page - 'Welcome'
    When I Click on Log in button in Landing Page
    Then I verify Cp Login page - 'Sign up'
    
    @skip
  Scenario Outline: Verify CIX market place is display or not
    Given I enter '<seller_Email Address>' and '<seller_Password>' in Cp Login Page
    And I click on Continue button
    Then I verify Portfolio Page- 'Portfolio'
    When I search with Project Id-'1218'
    Then I verify Project Details in Portfolio Page -'1218','Verified Carbon Standard (VCS)'
#    When I click on Manage Listing button
#    Then I verify Manage Listing Page -'Balance Breakdown'
#    Then I verify CIX Market Place is dispalying or not
    
   Examples:
      | seller_Email Address          | seller_Password |
      | axis_seller@mailinator.com    | Test@123 |
      
    @skip
 Scenario Outline: Verify user is able to list the carbon credits in CIX Market Place
   Given I enter '<seller_Email Address>' and '<seller_Password>' in Cp Login Page
   And I click on Continue button
   When I search with Project Id-'1218'
   And I click on Manage Listing button
   And I click on CIX market place button
   Then I verify create new listing page- 'Marketplace'
   Given I click on New Listing button without entering data in Mandatory fields
   Then I verify mandatory validation messages-'Please enter a valid price','Please enter a valid quantity','Please confirm that the price and listing details entered are correct and that this change will have immediate effect.'
   Given I enter sales quantity value greater than Total quantity-'999999'
   Then I verify validation message for sales quantity-'Entered sales quantity is greater than the sales quantity available' 
   Given I enter '<price>' and '<sales quantity>' in create new listing page
   And I select the confirm check box
   When I click on Create New Listing button
   Then I verify Confirm new listing pop up window-'Create New Listing','<vintage>','<price>' and '<sales quantity>'
   When I click Create New listing button on pop up window
   Then I verify whether application is navigating to Listing confirmation page or not-'This listing is now available on Climate Impact X.','<vintage>','<price>' and '<sales quantity>'

    Examples:
      | seller_Email Address             | seller_Password | price | sales quantity | vintage |
      | axis_seller@mailinator.com       | Test@123 | 11.79  | 1        | 2005 |
      
    @skip
  Scenario Outline: CIX market place should not be displayed under listing when already listed
    Given I enter '<seller_Email Address>' and '<seller_Password>' in Cp Login Page
    And I click on Continue button
    When I click on Manage Listing button
    Then I verify CIX Market Place is not displaying
   
    Examples:
      | seller_Email Address              | seller_Password |
      | axis_seller@mailinator.com        | Test@123 |


 #hold
@Scenario-5
Scenario Outline: Verify carbon credits which are listed on CIX should also display in CP  market place with “view CIX” option
  Given I enter '<buyer_Email Address>' and '<buyer_Password>' in Cp Login Page
  And I click on Continue button
  And I click on MarketPlace
  Then I verify 'view on CIX' option is displaying against the '1218' project or not

  Examples:
  |buyer_Email Address|buyer_Password|
  |mohiddin.shaik_buyer@yopmail.com                |   Uat2022!           |


  @Scenario-10
Scenario Outline: Verify seller is able to update the listing on CP UI and same is getting reflected in CIX UI
  Given I enter '<seller_Email_Address>' and '<seller_Password>' in Cp Login Page
  And I click on Continue button
  When I search with Project Id-'1218'
  And I click on Manage Listing button
  #Then I verify Active listings projects have update button for project '',
  Given I click on update button
  #Then  I verify whether application is navigating to 'Update Listing'
  Given I enter '<price>'  other than integers
#  Then I verify validation message for price
#  And I enter '<quantity>'
#  And I select the confirm check box
#  And I click on update listing button
#  Then I verify Confirm update listing pop up window
#  And  I click on update listing button on pop up window
#  Then I verify whether application is navigating to Listing confirmation page or not
#  Then I verify whether credits are displaying on CIX website or not"


    Examples:
      |seller_Email_Address|seller_Password|price|
    |   mohiddin.shaik_seller@yopmail.com                        |    Uat2022!           |zahara|




    @SanityTesting-projects_page

    Scenario Outline: Verify Admin able to Search project in search box
      Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
      And   I click on Continue button
      Then  I verify Home Page - 'Projects'
      And   I search for project '<Project_name>'

      Examples:
        | Admin_Email_Address | Admin_Password | Project_name |
        |cp-cix-uat-jv@yopmail.com|Uat2022!|  1218 |


  Scenario Outline: Verify Admin able to filter by registry option
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
    Then  I verify Home Page - 'Projects'
    When  I click on Registry dropdown to open
    And   I search for registry  '<Registry>' in search-box
    And   I select the registry as 'vcs'
    When  I click on Registry dropdown to close

    Examples:
      | Admin_Email_Address | Admin_Password| Registry |
      |cp-cix-uat-jv@yopmail.com|Uat2022!|  Verified Carbon Standard Registry (VCS) |


  Scenario Outline: Verify Admin able to filter by Credit Type option
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
    Then  I verify Home Page - 'Projects'
    When  I click on Credit Type dropdown to open
    And   I search for Credit Type  '<Credit_Type>' in search-box
    And   I select the Credit Type as 'ver'
    When  I click on Credit Type dropdown to close

    Examples:
      | Admin_Email_Address | Admin_Password | Credit_Type|
      |cp-cix-uat-jv@yopmail.com|Uat2022!|  ver|


#bug in UI
  Scenario Outline: Verify Admin able to filter by Vintage option
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
    Then  I verify Home Page - 'Projects'
    When  I click on Vintage dropdown to open
    And   I search for Vintage  '<Vintage>' in search-box
    And   I select the Vintage 'ver'
    When  I click on Vintage dropdown to close

    Examples:
      | Admin_Email_Address | Admin_Password | Vintage|
      |cp-cix-uat-jv@yopmail.com|Uat2022!|  2000|


  Scenario Outline: Verify Admin able to filter by Project option
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
    Then  I verify Home Page - 'Projects'
    When  I click on Project dropdown to open
    And   I search for Project  '<Project>' in search-box
    And   I select the Project as 'Regenerative farming at Green Meadows'
    When  I click on Project dropdown to close

    Examples:
      | Admin_Email_Address| Admin_Password| Project|
      |cp-cix-uat-jv@yopmail.com|Uat2022!|  Regenerative farming at Green Meadows|



  Scenario Outline: Verify Admin able to Export to CSV  in projects page
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
    Then  I verify Home Page - 'Projects'
    When  I click on Export to CSV button to download


    Examples:
      | Admin_Email_Address         | Admin_Password |
      |cp-cix-uat-jv@yopmail.com|Uat2022! |


#need to write uncheck functionality
  Scenario Outline: Verify Admin able to configure table settings
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
    Then  I verify Home Page - 'Projects'
    When  I click on settings icon to open
    And   I de-select Registry checkbox
    And   I de-select Project Name checkbox
    And   I de-select Credit Type checkbox
    And   I de-select status checkbox
    And   I de-select Credits On-Ramped checkbox
    And   I click on save button


    Examples:
      | Admin_Email_Address         | Admin_Password |
      |cp-cix-uat-jv@yopmail.com|Uat2022! |


  Scenario Outline: Verify Admin able to filter by All Filters option
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
#    Then  I verify Home Page - 'Projects'
    When  I click on All filters button
    And   I select the registry as 'vcs'
    And   I select the Credit Type as 'ver'
    # And   I select the Vintage 'ver'
    And   I select the Project as 'Evio Kuiñaji Ese´Eja Cuana, To Mitigate Climate Change, Madre de Dios - Perú'
    When  I click on View Results button



    Examples:
      | Admin_Email_Address         | Admin_Password |
      |cp-cix-uat-jv@yopmail.com|Uat2022! |



  Scenario Outline: Verify Admin able to clear data in All Filters
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
#    Then  I verify Home Page - 'Projects'
    When  I click on All filters button
    And   I select the registry as 'vcs'
    And   I select the Credit Type as 'ver'
    # And   I select the Vintage 'ver'
    And   I select the Project as 'Evio Kuiñaji Ese´Eja Cuana, To Mitigate Climate Change, Madre de Dios - Perú'
    And   I click on Clear filters option
    When  I click on View Results button


    Examples:
      | Admin_Email_Address         | Admin_Password |
      |cp-cix-uat-jv@yopmail.com|Uat2022! |


  Scenario Outline: Verify Admin able to View project
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
#    Then  I verify Home Page - 'Projects'
    When I search with Project Id-'1218'
    And  I click on View Project button
    Then I verify 'Project Summary' page is displaying or not


    Examples:
      | Admin_Email_Address         | Admin_Password |
      |cp-cix-uat-jv@yopmail.com|Uat2022! |



  Scenario Outline: Verify Admin able to filter Project in order management page
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
#    Then  I verify Home Page - 'Projects'
    When  I click on order management
#    Then  I verify  'All Pending Orders' page is displaying or not
    When  I click on Project dropdown to open
    And   I search for Project  '<Project>' in search-box
    And   I select the Project as 'Evio Kuiñaji Ese´Eja Cuana, To Mitigate Climate Change, Madre de Dios - Perú'
    When  I click on Project dropdown to close



    Examples:
      | Admin_Email_Address         | Admin_Password |Project|
      |cp-cix-uat-jv@yopmail.com|Uat2022! |Evio Kuiñaji Ese´Eja Cuana, To Mitigate Climate Change, Madre de Dios - Perú|




  Scenario Outline: Verify Admin able to filter by Vintage option in order management page
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
#    Then  I verify Home Page - 'Projects'
    When  I click on order management
    And   I click on Vintage dropdown to open
    And   I search for Vintage  '<Vintage>' in search-box
    And   I select the Vintage '2000'
    When  I click on Vintage dropdown to close


    Examples:
      | Admin_Email_Address         | Admin_Password |Vintage|
      |cp-cix-uat-jv@yopmail.com|Uat2022! |              2000    |



  Scenario Outline: Verify Admin able to filter by Marketplace option in order management page
    Given I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And   I click on Continue button
#    Then  I verify Home Page - 'Projects'
    When  I click on order management
    And   I click on Marketplace dropdown to open
    And   I select Climate Impact option
    And   I select Carbonplace option
    When  I click on Marketplace dropdown to close


    Examples:
      | Admin_Email_Address         | Admin_Password |
      |cp-cix-uat-jv@yopmail.com|Uat2022!            |



  Scenario Outline: Verify user is able to list the carbon credits in Carbonplace Market Place
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Portfolio Page- 'Portfolio'
    When   I search with Project Id-'1218'
    Then   I verify Project Details in Portfolio Page -'<ProjectID>','<Registry>'
    When   I click  on Manage Listing button
    Then   I verify Listing management page-'Listings Management'
    And    I click on Carbonplace market place button
    Then   I verify carbonplace marketplace page-'Create New Listing'
    Given  I enter  '<price>' and '<sales quantity>' in create new listing page
    And    I select Retirement required? as 'No'
    And    I select Purchase Preferences as 'Purchase Now'
    And    I select the  confirm check box
    When   I click on  Create New Listing button
#    Then   I verify  Confirm new listing pop up window-'Create New Listing'
    When   I click  Create New listing button on pop up window
    Then   I verify whether application is navigating to Listing confirmation page or not-'This listing is now available on Carbonplace.'





    Examples:
      | Seller_Email_Address             | Seller_Password     |ProjectID     |Registry                      |price|  sales quantity|
      |mohiddin.shaik_seller@yopmail.com |Uat2022!            |1218           |Verified Carbon Standard (VCS)|31.3  |  50|










  Scenario Outline: Verify user is able to purchase carbon credits in marketplace
    Given  I enter '<Buyer_Email_Address>' and '<buyer_Password>' in Cp Login Page
    And    I click on Continue button
    When   I click  on MarketPlace
    And    I search with Project Id-'1218'
#    Then   I verify the project with  '<price>' having '<option>' option
    Then   I verify Project Details in Marketplace  Page -'1218','Carbonplace'
    When  I click on Purchase Now button
    Then  I verify Purchase page - 'Purchase'
    And   I enter '<Quantity>'
    And   I  select confirm checkbox
    When  I click on  Confirm Purchase button
#    #error
#    Then  I  verify  Confirm Purchase pop up window-'Confirm Purchase '
     When  I click on confirm purchase button on pop-up window
     Then   I verify whether application is navigating to Purchase Confirmation page or not-'Purchase Confirmation'


    Examples:
      | Buyer_Email_Address        | buyer_Password |price|option|Quantity|
      |mohiddin.shaik_buyer@yopmail.com| Uat2022!            |$31.30|Purchase Now|1|



  Scenario Outline: Verify whether buyer bank is able to make payment
    Given  I enter '<Buyer_Bank_Email_Address>' and '<buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    And    I search with Project Id-'1218'
    Then   I verify  Project Details in order management Page -'<ProjectID>','<Status>'
    When   I click on three dots icon
    And    I click on Approve Transaction option
    Then   I verify Purchase Page- 'Purchase'
    And    I click on Approve Transaction button
#    #error
#    Then   I verify Approve Transaction pop-up window- 'Order Summary'
    When   I click on Approve Transaction button on pop-up window
    Then   I verify Order Page- 'Order'



    Examples:
      | Buyer_Bank_Email_Address      | buyer_Bank_Password |ProjectID|Status|
      |cp-cix-uat-buyer-bank@yopmail.com| Uat2022!           |1218    |Outstanding|



  Scenario Outline: Verify whether seller bank is able to confirm payment
    Given  I enter '<Seller_Bank_Email_Address>' and '<Seller_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    Then   I verify  Project Details in order management Page -'<ProjectID>','<Status>'
    When   I click on three dots icon
    And    I click on Approve Transaction option
#    Then   I verify Approve Transaction pop-up window-'Approve Transaction'
    When   I click on Approve Transaction  button






    Examples:
      | Seller_Bank_Email_Address      | Seller_Bank_Password |ProjectID|Status|
      | cp-cix-uat-seller-bank@yopmail.com| Uat2022!           |1218    |Payment Commenced|