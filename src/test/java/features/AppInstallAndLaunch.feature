@App_Install_Launch
Feature: App_Install_Launch

  @P11270-13136 @IosRegression @AndroidRegression1
  Scenario: Install& Launch  Esso app Launch 1 Screen UI and Alignment and animation
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens

  @P11270-13131 @IosRegression @AndroidRegression1
  Scenario: Install& Launch Esso app Launch Screen 2 UI and Alignment and animation
    Given reset the app
    Then verify that Welcome screen screen is displayed and Pump in welcome screen
    And Verify Pay securely from your car screen displayed
    And user taps on SKIP button in the tutorial screen
    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens

  @P11270-13128 @P11270-13117 @IosRegression @AndroidRegression1
  Scenario: Install & Launch :  Install& Launch  Esso app Launch Screen 3 UI and Alignment and animation
    Given reset the app
    Then user validates tutorial screen
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user taps on Get Started button in the tutorial screen
    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens

  @TC_02 @AndroidRegression1 @IosRegression
  Scenario: Check whether the system is navigating the user to App tutorial screen after displaying splash screen if user is launching the app for first time after installation.
    Given user validates tutorial screen

  @TC_03 @AndroidRegression1 @IosRegression
  Scenario: Check whether the system is navigating the user to Dashboard screen(Non-logged in state) if user has not registered with the app and user launches a new instance of the application
    Given user validates tutorial screen
    When Validate second screen
    And fourth screen
    When click on Get Started button
    Then Validate tabs for the Global Tab Bar logged in dashboard

  @TC_04 @AndroidRegression1 @IosRegression
  Scenario: Check whether the system is navigating the user to Dashboard Screen(logged in state) if user has registered with the application and user launches a new instance of the app
    Given user validates tutorial screen
    Given user taps on SKIP button
    Then user is in login screen
    And user taps login button in login screen
    Then Validate tabs for the Global Tab Bar logged in dashboard

  @TC_05 @AndroidRegression1 @IosRegression
  Scenario: Check whether the user is able to see the App tutorials screen when user has closed the app before tapping on Done or Skip button from App Tutorial screen and launched the app again
    Given user validates tutorial screen

  @TC_08 @TC_11 @AndroidRegression1 @IosRegression
  Scenario: "Check whether the user is able to see the following components on the App Tutorial screen  a. App tutorial content  b. Dots for page based navigation"
    Given user validates tutorial screen
    When Validate second screen
    And fourth screen
    When click on Get Started button

  @TC_14 @AndroidRegression1 @IosRegression
  Scenario: Check whether the system is able to loop the app tutorial at the first or last screen of  App Tutorial
    Given user validates the tutorial screen
    When Validate swipe app tutorial screen

  @TC_15 @AndroidRegression1 @IosRegression
  Scenario: Check whether system displays NEXT  button on 1st  2nd and 3rd tutorial screens
    Given user validates tutorial screen
    When Validate tap on next button second screen


  @TC_16 @AndroidRegression1 @IosRegression
  Scenario: Check whether user able to move to the next tutorial screen when USER taps on  NEXT
    Given user validates tutorial screen
    Then Validate on next button

  @TC_17 @AndroidRegression1 @IosRegression
  Scenario: Check whether system displays SKIP  button on 1st  2nd and 3rd tutorial screens
    Given user validates tutorial screen
    When Validate the second Skip screen
    When user tap on next button


  @TC_18 @AndroidRegression1 @IosRegression
  Scenario: Check whether user able to navigate to  Non-logged in state  of the Dashboard when USER taps on  SKIP
    Given user validates tutorial screen
    Given user taps on SKIP button
    Then Validate tabs for the Global Tab Bar logged in dashboard

  @TC_19 @AndroidRegression1 @IosRegression
  Scenario: Check whether user able to navigate to  Non-logged in state  of the Dashboard when USER taps on  GET STARTED  button
    Given user validates tutorial screen
    When Validate second screen
    And fourth screen
    Then Validate the Get Started button in fourth screen
    When click on Get Started button

  @TC_21 @AndroidRegression1 @IosRegression
  Scenario: Check whether the device back button is inactive on app tutorial screen  user will not be able to navigate to previous screen by use of device back button
    Given user validates tutorial screen
    Then Validate the device back button is inactive

  @P11270-13131 @IosRegression
  Scenario: Install & Launch :  Install& Launch  Esso app Launch Screen 2 UI and Alignment and animation
    Given reset the app
    Then user validates tutorial screen
    When user tap on next button
    Then Validate second screen

  @P11270-13117 @IosRegression
  Scenario: Install & Launch :  Install& Launch  Esso UK UI and Alignment
    Given reset the app
    Then user validates tutorial screen
    When user tap on next button
#    Then Validate second screen
    When user tap on next button
#    Then Validate third screen
    When click on Get Started button
    Then User validate allow notifications screen

  @P11270-13136 @iOSRegression1
  Scenario: Install& Launch  Esso app Launch 1 Screen UI and Alignment and animation
    Given Install and launch the Esso app
    Then verify that User is able to see Welcome screen

#  @P11270-16359-iOS @iOSRegression
#  Scenario: The system should display the updated copy text for the information pop-up on available moile pay stations
#    Given Install and launch the Esso app
#    Then verify that User is able to see Welcome screen
#    And Click on skipp button in Welcome screen
#    Then Verify the CT text popup text displayed in NLID screen

  @P11270-13111 @iOSRegression1
  Scenario: Pay outside : Contextual Tips: Welcome to Esso app screen - swipe left or right to select Pump
    Given Install and launch the Esso app
    Then verify that User is able to see Welcome screen
    And Swipe left and right from welcome screen

  @P11270-13112-iOS @IosRegression
  Scenario: Esso Daisy Ph2 : Verify the Point Balance on LID screen
    Given user is on NLID screen
    Then user is in login screen
    And User enter "NectarPointValidation" Login credentials
    Then Click on login button
    And Verify the Nectar Card points in LID screen


  @P11270-13113-iOS @IosRegression
  Scenario: Esso Daisy Ph2 : Verify the offer banner on LID screen
    Given user is on NLID screen
    Then user is in login screen
    And User enter "NectarPointValidation" Login credentials
    Then Click on login button
    And Verify the Nectar Card points in LID screen
    And Verify that User should be able to see the tick mark for loaded card

#  @P11270-13117 @iOSRegression121
#  Scenario: Daisy Phase 2 Esso app : App install and launch screen should have - 3 screens
#    Given reset the app
#    Then verify that Welcome screen screen is displayed
#    And Verify Pay securely from your car screen displayed
#    And Verify Collect Nectar points on every fill


  @P11270-13112- @iOSRegression1
  Scenario: Sprint 2: Pay outside : Contextual Tips: Welcome to Esso app screen - swipe left or right to select Pump
    Given reset the app
    Then verify that Welcome screen screen is displayed and Pump in welcome screen

  @P11270-13128 @iOSRegression1
  Scenario: Daisy Phase 2 Esso app : App install and launch screen should have - 3 screens
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And Verify Pay securely from your car screen displayed
    And Verify Collect Nectar points on every fill

  @P11270-13111 @iOSRegression1
  Scenario: Sprint 2: Pay outside : Contextual Tips: Welcome to Esso app screen - swipe left or right to select Pump
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And Verify Pay securely from your car screen displayed
    And Verify Collect Nectar points on every fill










#  @P11270-13135- @IosRegression-
#  Scenario: Offers -UI & alignment for all the New offer screen
#    Given user is on NLID screen
#    Then click on the login link in present in dashboard
#    When Enter the UserName in UN Text field
#    And Enter the Password in PW Text field
#    Then Click on logIn button
#    When user tap on learn more link in LID screen
#    When user taps on Offers
#    Then verify user is able to Navigate Offers screen
#    And user validates offers screen
#    When user taps on "More about collecting points" link from offers page
#    Then user should see How to collect points popup
#    When user tap on add nectar button in offers screen
#    Then user is navigated to add nectar screen
#    And user enters the nectar card number
#    When user navigates to Account screen
#    And delete added nectar card
#    And install open the Esso app



