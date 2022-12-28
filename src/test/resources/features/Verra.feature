Feature: Verra Registry flow

  Background:
    Given  I open a 'Chrome' Browser
    And    I go to URL
    Then   I validate landing page title
    And    I verify CP Landing page - 'Welcome'
    When   I Click on Log in button in Landing Page
    Then   I verify Cp Login page - 'Sign up'


  Scenario Outline:verify user is able to on ramp the project of verra registry
    Given  I enter '<Email Address>' and '<Password>' in Cp Login Page
    When   I click on Continue button
    Then   I verify Home Page - 'Portfolio'
    When   I click on On-Ramp Credits
    Then   I verify page navigates to the 'On-Ramp Carbon Credits' page
    When   I click on '<Typeof>' registry
    Then   I verify it navigates to '<Typeof>' registry page
    And    I click on I have completed the transfer request button
    And    I enter the serial number-'<serialNo>'
    And    I click on confirm serial number
    Then   I verify the transfer status as 'setteld'
    When   I click on projects
    Then   I verify Home Page - 'Projects'
    When   I search with Project Id-'902'
    Then   I verify verra project with '<qty>' and '<status>'
    Examples:
      | Email Address | Password |Typeof| serialNo |qty|status|
      |producer_seller@yopmail.com|Codefi2020!|Climate Action Reserve (CAR)|123|20|Ready for Listing|