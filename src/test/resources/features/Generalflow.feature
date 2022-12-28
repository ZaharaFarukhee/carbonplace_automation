Feature: Carbonplace general flow

  Background:
    Given  I open a 'Chrome' Browser
    And    I go to URL
    Then   I validate landing page title
    And    I verify CP Landing page - 'Welcome'
    When   I Click on Log in button in Landing Page
    Then   I verify Cp Login page - 'Sign up'



Scenario Outline: Verify seller is able to list the carbon credits in Carbonplace Market Place
  Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
  And    I click on Continue button
  Then   I verify Portfolio Page- 'Portfolio'
  When   I search with Project Id-'1218'
  Then   I verify  Project Details in Portfolio Page -'<ProjectID>','<Registry>'
  When   I click  on Manage  Listing button
  Then   I verify Listing management page- 'Listings Management'
  And    I click on Carbonplace market place button
  Then   I verify carbonplace marketplace page-'Create New Listing'
  Given  I enter  '<price>' and '<sales quantity>' in create new listing page
  And    I select Retirement required? as 'No'
  And    I select  Purchase Preferences as 'Purchase Now'
  And    I select the  confirm check box
  When   I click on  Create New Listing button
  When   I click  Create New listing button on pop up window
  Then   I verify whether application is navigating to Listing confirmation page or not-'This listing is now available on Carbonplace.'



  Examples:
    | Seller_Email_Address             | Seller_Password     |ProjectID     |Registry                      |price|  sales quantity|
    |mohiddin.shaik_seller@yopmail.com |Uat2022!            |1218           |Verified Carbon Standard (VCS)|6.30  |  55|




  Scenario Outline: Verify buyer is able to purchase carbon credits in marketplace
    Given  I enter '<Buyer_Email_Address>' and '<buyer_Password>' in Cp Login Page
    And    I click on Continue button
    When   I click  on MarketPlace
    And    I search with Project Id-'<ProjectID>'
    Then   I verify the project with  '<price>' having '<verification>' option
    When   I click on Purchase Now button
    Then   I verify Purchase page - 'Purchase'
    And    I enter '<Quantity>'
    And    I  select confirm checkbox
    When   I click on  Confirm Purchase button
    Then  I  verify  Confirm Purchase pop up window-'Confirm Purchase'
    When   I click on confirm purchase button on pop-up window
    Then   I verify whether application is navigating to Purchase Confirmation page or not-'Purchase Confirmation'


    Examples:
      | Buyer_Email_Address           | buyer_Password       |price|verification|Quantity|ProjectID|
      |mohiddin.shaik_buyer@yopmail.com| Uat2022!            |$6.30|Purchase Now|30|1218|



  Scenario Outline: Verify whether order got created in seller account under order management
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
#     Then   I verify the project under Pending orders--'<projectID>','<vintage>','<quantity>','<button>'
    Then   I verify the  project with '<price>' having '<verification>' option




    Examples:
      | Seller_Email_Address             | Seller_Password     |projectID|vintage|quantity|button|price|verification|
      |mohiddin.shaik_seller@yopmail.com |Uat2022!            |1218      |2020   |30      |View Order|$6.30|View Order|




  Scenario Outline: Verify whether status of the order is displaying as outstanding in seller account
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
    #Then   I verify the project under Pending orders--'<projectID>','<vintage>','<quantity>','<button>'
    Then   I verify the project with '<price>' having '<Status>' option



    Examples:
      | Seller_Email_Address             | Seller_Password     |price|Status|
      |mohiddin.shaik_seller@yopmail.com |Uat2022!            |$6.30|Outstanding|




  Scenario Outline: Verify whether "Order approved" is pending in the timeline of seller account
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
    Then   I verify the  project with '<price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify Project Timeline status in order page is displayed as '<Order_approved>' pending or not



    Examples:
      | Seller_Email_Address             | Seller_Password     |price|verification|Order_approved|
      |mohiddin.shaik_seller@yopmail.com |Uat2022!            |$6.30 |View Order  |Pending...|




  Scenario Outline: Verify whether seller is able to view the order and download the invoice
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
    Then   I verify the  project with '<price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify user is navigated to order page or not -'Order'
    Then   I verify Download Invoice button is enabled or not
    And    I click on Download Invoice button


    Examples:
      | Seller_Email_Address             | Seller_Password     |price|verification|
      |mohiddin.shaik_seller@yopmail.com |Uat2022!            |$6.30 |View Order  |




  Scenario Outline: Verify whether order got created in buyer account under order management in buyer account
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
    Then   I verify the  project with '<price>' having '<verification>' option


    Examples:
      | Buyer_Email_Address             | Buyer_Password      |price                  |verification|
      |mohiddin.shaik_buyer@yopmail.com|Uat2022!            |$6.30               |View Order|




  Scenario Outline: Verify whether status of the order is displaying as outstanding in buyer account
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
    Then   I verify the project with '<price>' having '<Status>' option


    Examples:
      | Buyer_Email_Address             | Buyer_Password     |price|Status|
      |mohiddin.shaik_buyer@yopmail.com |Uat2022!             |$6.30|Outstanding|




  Scenario Outline: Verify whether "Order approved" is pending in the timeline of buyer account
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
    Then   I verify the  project with '<price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify Project Timeline status in order page is displayed as '<Order_approved>' pending or not



    Examples:
      | Buyer_Email_Address             | Buyer_Password     |price|verification|Order_approved|
      |mohiddin.shaik_buyer@yopmail.com|Uat2022!            |$6.30 |View Order  |Pending...|




  Scenario Outline: Verify whether buyer is able to view the order and download the invoice
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
  #  Then   I verify the  project with '<marketplace>' having '<verification>' option
    Then   I verify the  project with '<price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify user is navigated to order page or not -'Order'
    Then   I verify Download  Invoice button is enabled or not
    And    I click on Download  Invoice button



    Examples:
      | Buyer_Email_Address             | Buyer_Password     |price|verification|
      |mohiddin.shaik_buyer@yopmail.com |Uat2022!            |$6.30 |View Order  |





#  Scenario Outline: Verify buyer is able to buy the  complete quantity of carbon credits from CP marketplace
#    Given  I enter '<Buyer_Email_Address>' and '<buyer_Password>' in Cp Login Page
#    And    I click on Continue button
#    When   I click  on MarketPlace
#    And    I search with Project Id-'<ProjectID>'
#    Then   I verify the project with  '<price>' having '<verification>' option
#    When   I click on Purchase Now button
#    Then   I verify Purchase page - 'Purchase'
#    Then   I verify Number of credits available: 'Number of credits (tCO2e) available: 40'
#    And    I enter '<Quantity>'
#    And    I  select confirm checkbox
#    When   I click on  Confirm Purchase button
##    Then  I  verify  Confirm Purchase pop up window-'Confirm Purchase'
#    When   I click on confirm purchase button on pop-up window
#    Then   I verify whether application is navigating to Purchase Confirmation page or not-'Purchase Confirmation'
#
#
#
#
#    Examples:
#      | Buyer_Email_Address           | buyer_Password       |price|verification|Quantity|ProjectID|
#      |mohiddin.shaik_buyer@yopmail.com| Uat2022!            |$32.30|Purchase Now|40|1218|
#
#
#
#
#  Scenario Outline: Verify when buyer purchases total quantity of carbon credits from CP marketpalce the project should not be display in CP UI of seller account
#    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
#    And    I click on Continue button
#    When   I click  on MarketPlace
#    And    I search with Project Id-'<ProjectID>'
#    When   I click on  Marketplace dropdown to open
#    And    I select the  '<Marketplace>'
#    When   I click on  Vintage dropdown to open
#    And    I select the '<Vintage>'
#    Then   I verify the message-'No listings match the selected filters.'
#
#
#
#    Examples:
#      | Seller_Email_Address           | Seller_Password       |ProjectID|Marketplace|Vintage|
#      |mohiddin.shaik_seller@yopmail.com| Uat2022!            |1218     |Carbonplace |2020   |
#
#
#
#  Scenario Outline: Verify when buyer purchases total quantity of carbon credits from CP marketpalce the project should not be display in CP UI of buyer  account
#    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
#    And    I click on Continue button
#    When   I click  on MarketPlace
#    And    I search with Project Id-'<ProjectID>'
#    When   I click on  Marketplace dropdown to open
#    And    I select the  '<Marketplace>'
#    When   I click on  Vintage dropdown to open
#    And    I select the '<Vintage>'
#    Then   I verify the message-'No listings match the selected filters.'
#
#
#
#    Examples:
#      | Buyer_Email_Address           | Buyer_Password       |ProjectID|Marketplace|Vintage|
#      |mohiddin.shaik_buyer@yopmail.com| Uat2022!            |1218     |Carbonplace |2020   |




  Scenario Outline: Verify whether order got created in buyer bank account under order management
    Given  I enter '<Buyer_Bank_Email_Address>' and '<buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    And    I search with Project Id-'1218'
    Then   I verify the  project with  '<price>' having '<Quantity>' option


    Examples:
      | Buyer_Bank_Email_Address      | buyer_Bank_Password |price|Quantity|
      |cp-cix-uat-buyer-bank@yopmail.com| Uat2022!           | $6.30    |30 |





  Scenario Outline: Verify whether status of the order is displaying as "outstanding" under order management in buyer bank account
    Given  I enter '<Buyer_Bank_Email_Address>' and '<buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
    Then   I verify the project with '<price>' having '<Status>' option



    Examples:
      | Buyer_Bank_Email_Address           | buyer_Bank_Password    |price|Status|
      |mohiddin.shaik_seller@yopmail.com |Uat2022!                  |$6.30|Outstanding|




  Scenario Outline: Verify whether buyer bank is able to complete the payment through order management
    Given  I enter '<Buyer_Bank_Email_Address>' and '<buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    And    I search with Project Id-'1218'
    Then   I verify the  project with  '<price>' having '<Quantity>' option
    When   I click on three dots icon
    And    I click on Approve Transaction option
    Then   I verify Purchase Page- 'Purchase'
    And    I click on Approve Transaction button
    Then   I verify Approve Transaction pop-up window- 'Order Summary'
    When   I click on Approve Transaction button on pop-up window
    Then   I verify Order Page- 'Order'



    Examples:
      | Buyer_Bank_Email_Address      | buyer_Bank_Password |price|Quantity|
      |cp-cix-uat-buyer-bank@yopmail.com| Uat2022!           |$6.30|   30  |



  Scenario Outline: Verify whether buyer bank is able to view the order and download the invoice
    Given  I enter '<Buyer_Bank_Email_Address>' and '<buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    When   I search with Project Id-'1218'
    Then   I verify the  project with '<price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify user is navigated to order page or not -'Order'
    Then   I verify Download Invoice button is enabled or not
    And    I click on Download Invoice button


    Examples:
      | Buyer_Bank_Email_Address             | buyer_Bank_Password     |price    |verification|
      |cp-cix-uat-buyer-bank@yopmail.com     |Uat2022!                 | $6.30  |View Order|




  Scenario Outline: Verify whether "Payment completed" is pending in the timeline of buyer bank account
    Given  I enter '<Buyer_Bank_Email_Address>' and '<buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    When   I search with Project Id-'1218'
    Then   I verify the  project with '<price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify  Payment completed status in order page is displayed as '<Payment completed>' pending or not



    Examples:
      | Buyer_Bank_Email_Address             | buyer_Bank_Password     |price|verification|Payment completed|
      |cp-cix-uat-buyer-bank@yopmail.com |Uat2022!            |$6.30 |View Order  |Pending...|



  Scenario Outline: Verify whether status of the order is displaying as "Payment Commenced" in buyer bank account
    Given  I enter '<Buyer_Bank_Email_Address>' and '<buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    When   I search with Project Id-'1218'
    Then   I verify the  project with '<Price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify status is displayed as '<status>' or not




    Examples:
      | Buyer_Bank_Email_Address             | buyer_Bank_Password     |Price|verification|status|
      |cp-cix-uat-buyer-bank@yopmail.com |Uat2022!            |$6.30 |View Order  |Payment Commenced|




  Scenario Outline: Verify whether "Payment completed Pending..." is displaying in the timeline in seller account
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
    Then   I verify the  project with '<Price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify  Payment completed status in order page is displayed as '<Payment completed>' pending or not



    Examples:
      | Seller_Email_Address             | Seller_Password     |Price|verification|Payment completed|
      |mohiddin.shaik_seller@yopmail.com |Uat2022!            |$6.30 |View Order  |Pending...|



  Scenario Outline: Verify whether status of the order is displaying as "Payment Commenced" in seller account
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
    Then   I verify the  project with '<Price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify status is displayed as '<status>' or not



    Examples:
      | Seller_Email_Address             | Seller_Password     |Price|verification|status|
      |mohiddin.shaik_seller@yopmail.com |Uat2022!            |$6.30 |View Order  |Payment Commenced|




  Scenario Outline: Verify whether "Payment completed Pending..." is displaying in the timeline in buyer account
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
    Then   I verify the  project with '<Price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify  Payment completed status in order page is displayed as '<Payment completed>' pending or not



    Examples:
      | Buyer_Email_Address             | Buyer_Password     |Price|verification|Payment completed|
      |mohiddin.shaik_buyer@yopmail.com |Uat2022!            |$6.30 |View Order  |Pending...|






  Scenario Outline: Verify whether status of the order is displaying as "Payment Commenced" in buyer account
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I search with Project Id-'1218'
#    Then   I verify the  project with '<Qty>' having '<verification>' option
    Then   I verify the  project with '<Price>' having '<verification>' option
    And    I click on View order button of project
    Then   I verify status is displayed as '<status>' or not



    Examples:
      | Buyer_Email_Address             | Buyer_Password     |Price|verification|status|
      |mohiddin.shaik_buyer@yopmail.com |Uat2022!            |$6.30 |View Order  |Payment Commenced|



  Scenario Outline: Verify whether order got created in seller bank account under order management
    Given  I enter '<Seller_Bank_Email_Address>' and '<Seller_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    And    I search with Project Id-'1218'
    Then   I verify the  project with  '<price>' having '<Quantity>' option


    Examples:
      | Seller_Bank_Email_Address      | Seller_Bank_Password |price|Quantity|
      |cp-cix-uat-seller-bank@yopmail.com| Uat2022!           | $6.30    |30 |



  Scenario Outline: Verify whether status of the order is displaying as "Payment Commenced" in seller bank account
    Given  I enter '<Seller_Bank_Email_Address>' and '<Seller_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    When   I search with Project Id-'1218'
    Then   I verify the   project with '<Price>' having '<verification>' option




    Examples:
      | Seller_Bank_Email_Address             | Seller_Bank_Password    |Price|verification|
      |cp-cix-uat-seller-bank@yopmail.com |Uat2022!            |$6.30  |Payment Commenced  |



  Scenario Outline: Verify whether "Payment completed Pending..." is displaying in the timeline in order management of seller bank account
    Given  I enter '<Seller_Bank_Email_Address>' and '<Seller_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    When   I search with Project Id-'1218'
    Then   I verify the   project with '<Price>' having '<status>' option
    When   I click on three  dots icon
    And    I click on View order button of  project
    Then   I verify  Payment completed status in order page is displayed as '<Payment completed>' pending or not


    Examples:
      | Seller_Bank_Email_Address             | Seller_Bank_Password    |Price|status|Payment completed|
      |cp-cix-uat-seller-bank@yopmail.com |Uat2022!            |$6.30 |Payment Commenced  |Pending...      |




  Scenario Outline: Verify whether seller bank is able to confirm the receipt of the payment in order management
    Given  I enter '<Seller_Bank_Email_Address>' and '<Seller_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    And    I search with Project Id-'<ProjectID>'
    Then   I verify  the project with  '<price>' having '<verification>' option
    When   I click on three dots icon
    And    I click on Approve Transaction option
    Then   I verify Approve Transaction pop-up window-'Approve Transaction'
    When   I click on Approve Transaction  button




    Examples:
      | Seller_Bank_Email_Address      | Seller_Bank_Password |ProjectID|price|verification|
      | cp-cix-uat-seller-bank@yopmail.com| Uat2022!           |1218    |$6.30|Payment Commenced|



  Scenario Outline: Verify whether status of the order is displaying as "Settled" in order management of seller bank account
    Given  I enter '<Seller_Bank_Email_Address>' and '<Seller_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the   project with '<Price>' having '<status>' option




    Examples:
      | Seller_Bank_Email_Address      | Seller_Bank_Password |Price|status|
      | cp-cix-uat-seller-bank@yopmail.com| Uat2022!           |$6.30|Settled|



  Scenario Outline: Verify whether user is able to download the invoice through order management in Seller bank account
    Given  I enter '<Seller_Bank_Email_Address>' and '<Seller_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the  project with '<Price>' having '<verification>' option
    And    I click on  View order button of project
    Then   I verify user is navigated to order page or not -'Order'
    Then   I verify Download Invoice button is enabled or not
    And    I click on Download Invoice button



    Examples:
      | Seller_Bank_Email_Address            | Seller_Bank_Password    |Price|verification|
      |cp-cix-uat-seller-bank@yopmail.com |Uat2022!            |$6.30 |View Order  |


  Scenario Outline: Verify whether status of the order is displaying as "Settled" in order management of buyer bank account
    Given  I enter '<Buyer_Bank_Email_Address>' and '<Buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the project with '<price>' having '<verification>' option




    Examples:
      | Buyer_Bank_Email_Address     | Buyer_Bank_Password |price|verification|
      | cp-cix-uat-buyer-bank@yopmail.com| Uat2022!           |$6.30|Settled|





  Scenario Outline: Verify whether "Carbon credits released." is displaying in the timeline in order management in buyer bank account
    Given  I enter '<Buyer_Bank_Email_Address>' and '<Buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the project with '<price>' having '<verification>' option
    And    I click on  View order button of project
    Then   I verify  Timeline status in order page is displayed as '<Timeline>' pending or not


    Examples:
      | Buyer_Bank_Email_Address     | Buyer_Bank_Password |price|verification|Timeline|
      | cp-cix-uat-buyer-bank@yopmail.com| Uat2022!           |$6.30|Settled | Carbon credits released    |



  Scenario Outline: Verify whether user is able to download the invoice through order management in buyer bank account
    Given  I enter '<Buyer_Bank_Email_Address>' and '<Buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Order Management Page- 'Order Management'
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the project with '<price>' having '<verification>' option
    And    I click on  View order button of project
    Then   I verify user is navigated to order page or not -'Order'
    Then   I verify Download Invoice button is enabled or not
    And    I click on Download Invoice button



    Examples:
      | Buyer_Bank_Email_Address     | Buyer_Bank_Password |price|verification|
      | cp-cix-uat-buyer-bank@yopmail.com| Uat2022!           |$6.30|Settled |




  Scenario Outline: Verify whether status of the order is displaying as "Settled" in order management in seller account
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the project with '<price>' having '<verification>' option



    Examples:
      | Seller_Email_Address             | Seller_Password     |price|verification|
      |mohiddin.shaik_seller@yopmail.com |Uat2022!            |$6.30|Settled|




  Scenario Outline: Verify whether "Carbon credits released." is displaying in the timeline in order management of seller account
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the project with '<price>' having '<verification>' option
    And    I click on  View order button of project
    Then   I verify  Timeline status in order page is displayed as '<Timeline>' pending or not


    Examples:
      | Seller_Email_Address             | Seller_Password     |price|verification|Timeline|
      | mohiddin.shaik_seller@yopmail.com| Uat2022!           |$6.30|Settled      | Carbon credits released|





  Scenario Outline: Verify whether user is able to download the invoice through order management in seller account
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the project with '<price>' having '<verification>' option
    And    I click on  View order button of project
    Then   I verify user is navigated to order page or not -'Order'
    Then   I verify Download Invoice button is enabled or not
    And    I click on Download Invoice button



    Examples:
      | Seller_Email_Address             | Seller_Password     |price|verification|
      | mohiddin.shaik_seller@yopmail.com| Uat2022!           |$6.30|Settled      |



  Scenario Outline: Verify whether status of the order is displaying as "Settled" in order management in buyer account
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the project with '<price>' having '<verification>' option



    Examples:
      | Buyer_Email_Address             | Buyer_Password     |price|verification|
      |mohiddin.shaik_buyer@yopmail.com |Uat2022!            |$6.30|Settled|



  Scenario Outline: Verify whether "Carbon credits released." is displaying in the timeline in order management of buyer account
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the project with '<price>' having '<verification>' option
    And    I click on  View order button of project
    Then   I verify  Timeline status in order page is displayed as '<Timeline>' pending or not


    Examples:
      | Buyer_Email_Address             | Buyer_Password     |price|verification|Timeline|
      | mohiddin.shaik_buyer@yopmail.com| Uat2022!           |$6.30|Settled      | Carbon credits released|




  Scenario Outline: Verify whether user is able to download the invoice through order management in Buyer account
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    Given  I click on order management page
    When   I click on order History tab
    Then   I verify user able to navigate to Order history -'All Orders'
    When   I search with Project Id -'1218'
    Then   I verify the project with '<price>' having '<verification>' option
    And    I click on  View order button of project
    Then   I verify user is navigated to order page or not -'Order'
    Then   I verify Download  Invoice button is enabled or not
    And    I click on Download  Invoice button


    Examples:
      | Buyer_Email_Address             | Buyer_Password     |price|verification|
      | mohiddin.shaik_buyer@yopmail.com| Uat2022!           |$6.30|Settled      |





  Scenario Outline: Verify whether invoice got created under "Invoices" tab and user is able to view and download the invoice
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    And    I click  on invoices page
    Then   I verify invoices page - 'Invoices'
    When   I search with Project Id-'1218'
    Then   I  verify the project with '<price>' having '<verification>' option
    And    I click on three dots icon
    And    I click on View Invoices option
    Then   I verify whether user is able to navigate to 'Invoice'
    Then   I verify Download Invoice button is enabled or not
    And    I click on Download Invoice button


    Examples:
      | Seller_Email_Address            | Seller_Password     |price|verification|
      | mohiddin.shaik_seller@yopmail.com| Uat2022!           |$6.30|Paid    |



  Scenario Outline: Verify whether price,quantity ,fees and total quality are displaying correctly in “Invoices” tab
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    And    I click  on invoices page
    When   I search with Project Id-'1218'
    Then   I  verify the project with '<price>' having '<verification>' option
    And    I click on three dots icon
    And    I click on View Invoices option
    Then   I verify whether user is able to navigate to 'Invoice'
    Then   I verify '<PROJECT_ID>','<PROJECT_NAME>','<QUANTITY>','<AMOUNT>','<FEES>' are displayed correctly or not

    Examples:
      | Seller_Email_Address            | Seller_Password     |price|verification|PROJECT_ID     |PROJECT_NAME                                                                |QUANTITY|AMOUNT|FEES|
      | mohiddin.shaik_seller@yopmail.com| Uat2022!           |$6.30|Paid         |1218         |Evio Kuiñaji Ese´Eja Cuana, To Mitigate Climate Change, Madre de Dios - Perú|30 (tCO2e)	|$189	|$0|



  Scenario Outline: Verify whether invoice got created under "Invoices" tab and user is able to view and download the invoice in buyer account
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    And    I click  on invoices page
    Then   I verify invoices page - 'Invoices'
    When   I search with Project Id-'1218'
    Then   I  verify the project with '<price>' having '<verification>' option
    And    I click on three dots icon
    And    I click on View Invoices option
    Then   I verify whether user is able to navigate to 'Invoice'
    Then   I verify Download Invoice button is enabled or not
    And    I click on Download Invoice button


    Examples:
      | Buyer_Email_Address            | Buyer_Password     |price|verification|
      | mohiddin.shaik_buyer@yopmail.com| Uat2022!           |$6.30|Paid    |



  Scenario Outline: Verify whether price,quantity ,fees and total quality are displaying correctly in “Invoices” tab in buyer account
    Given  I enter '<Buyer_Email_Address>' and '<Buyer_Password>' in Cp Login Page
    And    I click on Continue button
    And    I click  on invoices page
    When   I search with Project Id-'1218'
    Then   I  verify the project with '<price>' having '<verification>' option
    And    I click on three dots icon
    And    I click on View Invoices option
    Then   I verify whether user is able to navigate to 'Invoice'
    Then   I verify '<PROJECT_ID>','<PROJECT_NAME>','<QUANTITY>','<AMOUNT>','<FEES>' are displayed correctly or not

    Examples:
      | Buyer_Email_Address            | Buyer_Password     |price|verification|PROJECT_ID|PROJECT_NAME|QUANTITY|AMOUNT|FEES|
      | mohiddin.shaik_buyer@yopmail.com| Uat2022!           |$6.30|Paid    |1218         |Evio Kuiñaji Ese´Eja Cuana, To Mitigate Climate Change, Madre de Dios - Perú|30 (tCO2e)	|$189	|$0|


  Scenario Outline: Verify whether invoice got created under “Invoices” tab and user is able to view and download the invoice in buyer bank account
    Given  I enter '<Buyer_Bank_Email_Address>' and '<Buyer_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    And    I  click  on invoices page
    When   I search with Project Id-'1218'
    Then   I  verify the project with '<price>' having '<verification>' option
    And    I click on three dots icon
    And    I click on View Invoices option
    Then   I verify whether user is able to navigate to 'Invoice'
    Then   I verify Download Invoice button is enabled or not
    And    I click on Download Invoice button


    Examples:
      | Buyer_Bank_Email_Address            | Buyer_Bank_Password     |price|verification|
      | cp-cix-uat-buyer-bank@yopmail.com| Uat2022!           |$6.30|Paid    |


  Scenario Outline: Verify whether invoice got created under “Invoices” tab and user is able to view and download the invoice in seller bank account
    Given  I enter '<Seller_Bank_Email_Address>' and '<Seller_Bank_Password>' in Cp Login Page
    And    I click on Continue button
    And    I  click  on invoices page
    When   I search with Project Id-'1218'
    Then   I  verify the project with '<price>' having '<verification>' option
    And    I click on three dots icon
    And    I click on View Invoices option
    Then   I verify whether user is able to navigate to 'Invoice'
    Then   I verify Download Invoice button is enabled or not
    And    I click on Download Invoice button


    Examples:
      | Seller_Bank_Email_Address           | Seller_Bank_Password     |price|verification|
      | cp-cix-uat-seller-bank@yopmail.com| Uat2022!           |$6.30|Paid    |





    #DownForce
  Scenario Outline: Verify Downforce registry is display or not
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    When   I click on On-Ramp Credits page
    Then   I verify On-Ramp Credits page-'On-Ramp Carbon Credits'
    Then   I verify '<registry>' is available or not


    Examples:
      | Seller_Email_Address           | Seller_Password     |registry|
      | mohiddin.shaik_seller@yopmail.com| Uat2022!           |Downforce|


  Scenario Outline: Verify seller is able to link the downforce registry user ID of propendent
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    When   I click on Account settings
    Then   I verify Account settings page-'Account Settings'
    When   I click on update button of linked Accounts
    And    I click on Platform dropdown to open
    And    I select on Downforce
    #error
    And    I enter the  userId-'<UserID>'
    And    I click on  save button
    Then   I verify downforce registry id is added or not-'Remove Downforce User ID'

    Examples:
      | Seller_Email_Address           | Seller_Password     |UserID|
      | mohiddin.shaik_seller@yopmail.com| Uat2022!           |1234|


  Scenario Outline:Verify Whether the projects with  Downforce registry  are available on CP seller account
    Given  I enter '<Seller_Email_Address>' and '<Seller_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify Portfolio Page- 'Portfolio'
    When  I click on Registry dropdown to open
    And   I search for registry  '<Registry>' in search-box
    And   I select the registry as 'Downforce'
    When  I click on Registry dropdown to close


    Examples:
      | Seller_Email_Address           | Seller_Password     |Registry|
      | mohiddin.shaik_seller@yopmail.com| Uat2022!           |Downforce|



  Scenario Outline: Verify admin is able to approve the project
    Given  I enter '<Admin_Email_Address>' and '<Admin_Password>' in Cp Login Page
    And    I click on Continue button
    Then   I verify home page-'Projects'
    When   I search with Project Id-'AUS-VIC-004'

#    And I click on review project
#    And I click on issue carbon credits
#    Then I verify the project is approved or not by status as 'settled'




    Examples:
      | Admin_Email_Address           | Admin_Password|
      | cp-cix-uat-jv@yopmail.com     | Uat2022!      |