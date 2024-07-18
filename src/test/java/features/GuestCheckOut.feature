@Guest_Check_Out
Feature: Guest_Check_Out

  @P11270-12091 @iOSRegression @iOSRegressionSet1
  Scenario:Check whether the user is able to verify the Terms & Conditions screen for the Guest user
    When user log out from the app if logged in
    Then Tap on FUEL AS GUEST Button in the NLID
    Then verify user is able to view Terms and Condition Screen

  @P11270-15038 @iOSRegression @iOSRegressionSet1 @Sprint2322_23__ @SprintiOS2322
  Scenario: Verify if System navigate the user to non logged-in dashboard from the Geolocation based site check-in screen after 300 seconds of inactivityThen Tap on FUEL AS GUEST Button in the NLID
    Given user log out from the app if logged in
    Then Tap on FUEL AS GUEST Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    Then wait for session timeout five minutes and verify FUEL AS GUEST Button in the NLID
#    Then user verifies the app redirects back to NLID
    Then Tap on FUEL AS GUEST Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin

  @P11270-12092  @iOSRegression @iOSRegressionSet1
  Scenario:Check whether the user is able to view the Terms and Conditions page
    When user log out from the app if logged in
    Then Tap on FUEL AS GUEST Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    And Tap on Terms And Conditons link
    And user lands in the Terms and Condition screen
#    Then Verify The user should see the Terms and conditions document with the heading Terms and Conditions

  @P11270-12093  @iOSRegression @iOSRegressionSet1
  Scenario:Check whether the user is able to view the Terms and Conditions page
    When user log out from the app if logged in
    Then Tap on FUEL AS GUEST Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    And Tap on Privacy Policy link
    And user lands in the Privacy Policy screen
#    Then Verify the user should see the Privacy Policy document with the heading Privacy Policy

  @P11270-12098  @iOSRegression @iOSRegressionSet1
  Scenario: Check whether the user is able to view the error message for submitting the Terms and condition screen without accepting the PP and TC
    When user log out from the app if logged in
    Then Tap on FUEL AS GUEST Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    And Tap on continue button
    Then Verify user is able to view the copy text appears in the popup for not selecting the checkbox for accepting PP and TC

  @P11270-12124  @iOSRegression @iOSRegressionSet1
  Scenario: Check whether the user is able to verify the elements in Select your Payment screen
    When user log out from the app if logged in
    Then Tap on FUEL AS GUEST Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    Then user verify the MFA screen in GCO flow
    When user tap on Continue button in MFA screen
    Then Verify the Elements present in the Add Payment Method screen

  @P11270-12089 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Check whether the user is able to verify he dont see the account details from NLID
    When user log out from the app if logged in
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then Verify the popup message to login into app for seeing the feature

  @P11270-14226 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify if System navigate the user to logged-in dashboard from the Scan QR-Code screen after 300 seconds of inactivity
    When user is on NLID screen
    And user clicks on Login Icon
    When I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user tap on scan QR code button
    And Verify user doesn't navigate to LID untill five minutes
    Then user able to view Fuel, Station, Offers

  @P11270-14797 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Verify if System navigate the user to logged-in dashboard from the Change Payment Details screen after 300 seconds of inactivity
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And Click on Change payment link
    Then verify if the user lands on Payment Details Screen
    Then Verify user navigated back to LID screen

  @P11270-14224 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Verify if System navigate the user to logged-in dashboard from the Geolocation based site check-in screen after 300 seconds of inactivity
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    Then Verify user navigated back to LID screen

  @P11270-14810 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Verify if System navigate the user to logged-in dashboard from Confirm Payment screen after 300 seconds of inactivity
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    Then Verify user navigated back to LID screen

#  ====================================================================

#  @P11270-12130  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to verify all the card details info in the Add Debit/Credit card screen
#    When user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#
#  @P11270-12137  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to verify all the card details info in the Add Debit/Credit card screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And Tap on Done button with scroll
#    Then Verify the inline error message for Name On Card
#    And enter name on the card
#    Then Verify the inline error message for Card Number
#    And enter Card Number
#    Then Verify the inline error message for Expiry Date
#    And enter Expiry Date
#    Then Verify the inline error message for Security Code
#    And enter Security Code
#
#  @P11270-12140  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to edit the post code entered in the Add Debit/Credit card screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And enter the postcode
#    And tap on search icon
#    Then verify user is navigated to postcode lookup screen
#    And validate the fields displayed in the screen are as expected
#    And tap on clear search
#    And enter the postcode after clearing the search text
#
#  @P11270-12144  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to scan the Debit/Credit card on Add Debit/Credit card screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    And verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Verify user is able to see the Scan your card link in Add Card screen
#    And click on the Scan your card link
#
#  @P11270-12148  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to navigate to the Payement Authorising Screen after How to fuel screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    And verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter the Card Name and Details
#    Then Enter the address of Customer
#    Then Click on the Done button
#    And Verify that Please wait screen is displayed
#
#  @P11270-12149  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to view the frictionless response from 3DS modirum when user does fueling with a Frictionless payment card added
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify the Elements present in the Select your pump screen
#    And Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Verify the Elements present in the Add Payment Method screen
#    And Click on Add Debit or Credit Card
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#
#  @P11270-12222  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to view the Send Reciepts screen from the Transaction details screen
#    And user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    And verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter the Card Name and Details
#    Then Enter the address of Customer
#    Then Click on the Done button
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#
#  @P11270-12234  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to send the receipt successfully for the transaction completed
#    And user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    And verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Click on Send receipt button
#    And Click on ok button present in the receipt sent Success message screen
#    And Verify the thank you screen should be displayed
#
#  @P11270-12239  @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to see the notification permission in the thank you screen when the notification permission is denied in the app start up
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify the Elements present in the Select your pump screen
#    And Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Verify the Elements present in the Add Payment Method screen
##    Then Verify whether the user is able to view the Select your pump screen displayed with all the elements
#    And Click on Add Debit or Credit Card
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    And Enter email and Click on send receipt
#    And Verify Receipt success message
#    And Verify that thank you screen is displayed
#    When User click on remind me later link in thank you screen
#    Then Verify the CT text displayed with Cancel button
#
#  @P11270-16020  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether updated copy text on the confirmation pop-up is displayed when user tap on the ‘Skip' button on GCO Send Receipt screen
#    When user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
##    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Verify that Skip button is displayed in send reciept screen
#
#  @P11270-16021  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether updated copy text on the confirmation pop-up is displayed when user tap on the ‘Skip' button on GCO Send Receipt screen
#    When user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Click on the Skip button in Send receipt screen
#    Then Verify that confirmation popup for skip send receipt
#    And Verify that thank you screen is displayed
#    And Click on Close button in Thank you screen
#
#  @P11270-12108 @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to view the Select your Pump variation screen through Site checkin
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#
#  @P11270-12237 @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to see the Thank you screen after tapping the send my receipts button
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter the Card Name and Details
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on the Done button
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Click on Send receipt button
#    And Click on ok button present in the receipt sent Success message screen
#    And Verify the thank you screen should be displayed
#    And Click on Close button in Thank you screen
#    Then Verify that User is navigate back to NLID screen
#
#  @P11270-12094 @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario:Check whether the user is able to view the Logical screen after tapping the "CONTINUE" button
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#
#  @P11270-12095 @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario:Check whether the user is able to view the NLID screen after tapping the "Cancel" button
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    And Tap on cancel button
#    Then verify whether user is navigated back to NLID screen
#
#  @P11270-12096 @AndroidRegression @AndroidRegressionSet11
#  Scenario:Check whether the user is able to navigate back to NLID screen in Taping back button (Android Specific)
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    And Tap on the back button in navigation panel
#    Then verify whether user is navigated back to NLID screen
#
#  @P11270-12099 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to view the error message for submitting the Terms and condition screen without accepting the PP and TC
#    When user log out from the app if logged in
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    And Tap on continue button
#    Then Verify user is able to view the copy text appears in the popup for not selecting the checkbox for accepting PP and TC
#
#
#  @P11270-12220 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to navigate to Transaction complete screen adn verify all the fields are displayed in the transaction complete screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Tap on Add Debit or Credit card details
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    Then Tap on continue button in how to fuel screen
#    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
##    Then Verify user is navigated to Now Fuelling screen
#    Then Verify all the fields and elements in the Transaction complete screen are available
#
#  @P11270-12231 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check wehther the user is able to view the popup displayed while tapping cancel button in Send reciept screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Tap on Add Debit or Credit card details
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    Then Tap on continue button in how to fuel screen
#    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
#    Then verify user navigates to Transaction Complete screen
#    When user tap on Done button in Transaction Complete screen
#    Then Verify user is navigated to Send Reciept screen
#    When user Tap on Send my Reciept button with the checkbox checked with out entering the email field
#    Then Verify the inline error message for Email Validation
#    When user Tap on Send my Reciept button with checkbox checked with entering wrong email id
#    Then verify the inline error message for Incorrect Email Format
#    When User Tap on skip button
#    Then Verify user should see the prompt message and buttons listed below
#
#  @P11270-12221 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to navigate to Transaction details screen when tapped on the 'Transaction Details' link
#    When user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Tap on Add Debit or Credit card details
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    Then Tap on continue button in how to fuel screen
#    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
#    Then verify user navigates to Transaction Complete screen
#    When Tap on Transaction Details link in Transaction Complete Screen
#    Then Verify user is navigated to Transaction Details screen
#    Then Verify all the fields are present in Transaction Details screen
#    When user taps on back Arrow from transaction details
#    Then verify user navigates to Transaction Complete screen
#
#  @P11270-12132 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to verify the elements in Add Payment Method screen (Android Only)
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Verify user is navigated to Add Payment Method screen
#
#  @P11270-12134 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is navigated to the Add Debit or Credit Card Screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    Then Verify the Add Debit or Credit card screen
#
#  @P11270-12135 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to go back to the next logical sceen on tapping the cancel button in Add Debit or Credit Card screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And Tap on Cancel button in Add Debit or Credit card screen
#    Then Verify user is navigated to Add Payment Method screen
#
#  @P11270-12138 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to verify all the Billing details info in the Add Debit/Credit card screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And Tap on Done button with scroll
#    Then Verify Billing Details
#    And Tap on Billing info icon
#    Then Verify the Billing pop up
#    And tap on Ok Button
#    Then Verify inline error message for post code
#    And enter the postcode
#    Then Verify search icon is present
#    Then Verify inline error message for Address1
#    And enter data in Address one after validating error message
##    And enter data in Address1
#    And enter data in Address2
#    Then Verify the inline error message for city
#    And enter city after validating the error message
##    And Enter city
#
#  @P11270-12139 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to navigate to the Post Code Lookup screen while tapping on the search icon next to the Post code field
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And enter the postcode
#    And tap on search icon
#    Then verify user is navigated to postcode lookup screen
#    And validate the fields displayed in the screen are as expected
#
#  @P11270-12141 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to search a new postcode in the post code search screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And enter the postcode
#    And tap on search icon
#    Then verify user is navigated to postcode lookup screen
#    And validate the fields displayed in the screen are as expected
#    And tap on clear search
#    And enter the postcode after clearing the search text
#    Then user selects a postcode from the list
#    And tap on select
#
#  @P11270-12142 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to see the error message is displayed for tapping done button without filling the card details in the corresponding fields
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And enter name on the card
#    And enter Expiry Date
##    And tap on Ok Button
#    And enter Security Code
#    And enter the postcode
#    And tap on search icon
#    Then verify user is navigated to postcode lookup screen
#    Then user selects a postcode from the list
#    And tap on select
#    And Tap on Done button with scroll
#    Then Verify the inline error message for Card Number
#
#  @P11270-12151 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to view the Start Fueling screen after the payment authentication
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    And verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter the Card Name and Details
#    Then Enter the address of Customer
#    Then Click on the Done button
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Verify the all elements are displayed in Start fueling screen
#
#  @P11270-12156 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to navigate to Now Fueling screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Tap on Add Debit or Credit card details
#    Then Add Card Details
#    Then Tap on done button
#    Then Tap on continue button in how to fuel screen
#    Then Verify user is navigated to Authorising your payment screen
#    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
#    Then Verify user is navigated to Now Fuelling screen
#
#  @P11270-14814  @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Verify if System navigate the user to non logged-in dashboard from add payment method screen (GCO) after 300 seconds of inactivity
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Verify user is navigated to NLID screen from Add Payment method screen after 300 seconds of in activity
#
#
#  @P11270-15033 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Verify if System navigate the user to non logged-in dashboard from Add Payment Method scan card screen (GCO) after 300 seconds of inactivity
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    When user tap on Continue button in MFA screen
#    And Click on Add Debit or Credit Card
#    And Verify that Card details screen is displayed
#    Then wait for more than five minutes user should navigate back to NLID screen
#
#  @P11270-12238 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to view the NLID screen after Thank you screen if the notification permission is allowed
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter the Card Name and Details
#    Then Enter the address of Customer
#    Then Click on the Done button
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Click on Send receipt button
#    And Click on ok button present in the receipt sent Success message screen
#    And Click on remind me later button
#    Then Verify that User is navigate back to NLID screen
#
#  @P11270-12111 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to view all elements are displayed in the Select your ppump screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify the Elements present in the Select your pump screen
#
#  @P11270-12128 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to verify the elements in Select your Payment screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify the Elements present in the Select your pump screen
#    And Click on Continue button in Select pumpscreen
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Verify the Elements present in the Add Payment Method screen

#  ====================================================================


#  ===================================================================================
#  @GCOErrorValidation @iOSRegression @GCO_iOS
#  Scenario: Check whether the user is able to verify all the card details info in the Add Debit/Credit card screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And Tap on Done button with scroll
#    Then Verify the inline error message for Name On Card
#    And enter name on the card
#    Then Verify the inline error message for Card Number
#    And enter Card Number
#    Then Verify the inline error message for Expiry Date
#    And enter Expiry Date
#    Then Verify the inline error message for Security Code
#    And enter Security Code
#
#  @P11270-12140  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to edit the post code entered in the Add Debit/Credit card screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And enter the postcode
#    And tap on search icon
#    Then verify user is navigated to postcode lookup screen
#    And validate the fields displayed in the screen are as expected
#    And tap on clear search
#    And enter the postcode after clearing the search text
#
#  @P11270-12144  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to scan the Debit/Credit card on Add Debit/Credit card screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    And verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Verify user is able to see the Scan your card link in Add Card screen
#    And click on the Scan your card link
#
#  @P11270-12148  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to navigate to the Payement Authorising Screen after How to fuel screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    And verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter the Card Name and Details
#    Then Enter the address of Customer
#    Then Click on the Done button
#    And Verify that Please wait screen is displayed
#
#  @P11270-12149  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to view the frictionless response from 3DS modirum when user does fueling with a Frictionless payment card added
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify the Elements present in the Select your pump screen
#    And Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Verify the Elements present in the Add Payment Method screen
#    And Click on Add Debit or Credit Card
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#
#  @P11270-12222  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to view the Send Reciepts screen from the Transaction details screen
#    And user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    And verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter the Card Name and Details
#    Then Enter the address of Customer
#    Then Click on the Done button
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#
#  @P11270-12234  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to send the receipt successfully for the transaction completed
#    And user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    And verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Click on Send receipt button
#    And Click on ok button present in the receipt sent Success message screen
#    And Verify the thank you screen should be displayed
#
#  @P11270-12239  @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to see the notification permission in the thank you screen when the notification permission is denied in the app start up
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify the Elements present in the Select your pump screen
#    And Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Verify the Elements present in the Add Payment Method screen
##    Then Verify whether the user is able to view the Select your pump screen displayed with all the elements
#    And Click on Add Debit or Credit Card
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    And Enter email and Click on send receipt
#    And Verify Receipt success message
#    And Verify that thank you screen is displayed
#    When User click on remind me later link in thank you screen
#    Then Verify the CT text displayed with Cancel button
#
#  @P11270-16020  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether updated copy text on the confirmation pop-up is displayed when user tap on the ‘Skip' button on GCO Send Receipt screen
#    When user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
##    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Verify that Skip button is displayed in send reciept screen
#
#  @P11270-16021  @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether updated copy text on the confirmation pop-up is displayed when user tap on the ‘Skip' button on GCO Send Receipt screen
#    When user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Click on the Skip button in Send receipt screen
#    Then Verify that confirmation popup for skip send receipt
#    And Verify that thank you screen is displayed
#    And Click on Close button in Thank you screen
#
#  @P11270-12108 @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to view the Select your Pump variation screen through Site checkin
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#
#  @P11270-12237 @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to see the Thank you screen after tapping the send my receipts button
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter the Card Name and Details
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on the Done button
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Click on Send receipt button
#    And Click on ok button present in the receipt sent Success message screen
#    And Verify the thank you screen should be displayed
#    And Click on Close button in Thank you screen
#    Then Verify that User is navigate back to NLID screen
#
#  @P11270-12094 @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario:Check whether the user is able to view the Logical screen after tapping the "CONTINUE" button
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#
#  @P11270-12095 @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario:Check whether the user is able to view the NLID screen after tapping the "Cancel" button
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    And Tap on cancel button
#    Then verify whether user is navigated back to NLID screen
#
#  @P11270-12096 @AndroidRegression @AndroidRegressionSet11
#  Scenario:Check whether the user is able to navigate back to NLID screen in Taping back button (Android Specific)
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    And Tap on the back button in navigation panel
#    Then verify whether user is navigated back to NLID screen
#
#  @P11270-12099 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to view the error message for submitting the Terms and condition screen without accepting the PP and TC
#    When user log out from the app if logged in
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    And Tap on continue button
#    Then Verify user is able to view the copy text appears in the popup for not selecting the checkbox for accepting PP and TC
#
#
#  @P11270-12220 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to navigate to Transaction complete screen adn verify all the fields are displayed in the transaction complete screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Tap on Add Debit or Credit card details
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    Then Tap on continue button in how to fuel screen
#    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
##    Then Verify user is navigated to Now Fuelling screen
#    Then Verify all the fields and elements in the Transaction complete screen are available
#
#  @P11270-12231 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check wehther the user is able to view the popup displayed while tapping cancel button in Send reciept screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Tap on Add Debit or Credit card details
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    Then Tap on continue button in how to fuel screen
#    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
#    Then verify user navigates to Transaction Complete screen
#    When user tap on Done button in Transaction Complete screen
#    Then Verify user is navigated to Send Reciept screen
#    When user Tap on Send my Reciept button with the checkbox checked with out entering the email field
#    Then Verify the inline error message for Email Validation
#    When user Tap on Send my Reciept button with checkbox checked with entering wrong email id
#    Then verify the inline error message for Incorrect Email Format
#    When User Tap on skip button
#    Then Verify user should see the prompt message and buttons listed below
#
#  @P11270-12221 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to navigate to Transaction details screen when tapped on the 'Transaction Details' link
#    When user log out from the app if logged in
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Tap on Add Debit or Credit card details
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on Done button in Add Card Screen
#    Then Tap on continue button in how to fuel screen
#    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
#    Then verify user navigates to Transaction Complete screen
#    When Tap on Transaction Details link in Transaction Complete Screen
#    Then Verify user is navigated to Transaction Details screen
#    Then Verify all the fields are present in Transaction Details screen
#    When user taps on back Arrow from transaction details
#    Then verify user navigates to Transaction Complete screen
#
#  @P11270-12089 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to verify he dont see the account details from NLID
#    Given user is on NLID screen
#    When Tap on More button
#    And Tap on Account
#    Then Verify the popup message to login into app for seeing the feature
#
#  @P11270-12132 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Check whether the user is able to verify the elements in Add Payment Method screen (Android Only)
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Verify user is navigated to Add Payment Method screen
#
#  @P11270-12134 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is navigated to the Add Debit or Credit Card Screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    Then Verify the Add Debit or Credit card screen
#
#  @P11270-12135 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to go back to the next logical sceen on tapping the cancel button in Add Debit or Credit Card screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And Tap on Cancel button in Add Debit or Credit card screen
#    Then Verify user is navigated to Add Payment Method screen
#
#  @P11270-12138 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to verify all the Billing details info in the Add Debit/Credit card screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And Tap on Done button with scroll
#    Then Verify Billing Details
#    And Tap on Billing info icon
#    Then Verify the Billing pop up
#    And tap on Ok Button
#    Then Verify inline error message for post code
#    And enter the postcode
#    Then Verify search icon is present
#    Then Verify inline error message for Address1
#    And enter data in Address one after validating error message
##    And enter data in Address1
#    And enter data in Address2
#    Then Verify the inline error message for city
#    And enter city after validating the error message
##    And Enter city
#
#  @P11270-12139 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to navigate to the Post Code Lookup screen while tapping on the search icon next to the Post code field
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And enter the postcode
#    And tap on search icon
#    Then verify user is navigated to postcode lookup screen
#    And validate the fields displayed in the screen are as expected
#
#  @P11270-12141 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to search a new postcode in the post code search screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And enter the postcode
#    And tap on search icon
#    Then verify user is navigated to postcode lookup screen
#    And validate the fields displayed in the screen are as expected
#    And tap on clear search
#    And enter the postcode after clearing the search text
#    Then user selects a postcode from the list
#    And tap on select
#
#  @P11270-12142 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to see the error message is displayed for tapping done button without filling the card details in the corresponding fields
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Tap on Add Debit or Credit card details
#    Then Verify user is navigated to Add Debit or Credit card screen
#    And enter name on the card
#    And enter Expiry Date
##    And tap on Ok Button
#    And enter Security Code
#    And enter the postcode
#    And tap on search icon
#    Then verify user is navigated to postcode lookup screen
#    Then user selects a postcode from the list
#    And tap on select
#    And Tap on Done button with scroll
#    Then Verify the inline error message for Card Number
#
#  @P11270-12151 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to view the Start Fueling screen after the payment authentication
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    And verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter the Card Name and Details
#    Then Enter the address of Customer
#    Then Click on the Done button
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Verify the all elements are displayed in Start fueling screen
#
#  @P11270-12156 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to navigate to Now Fueling screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Tap on Add Debit or Credit card details
#    Then Add Card Details
#    Then Tap on done button
#    Then Tap on continue button in how to fuel screen
#    Then Verify user is navigated to Authorising your payment screen
#    Then User should be able to view start fueling screen with all the mandatory fields and images as expected
#    Then Verify user is navigated to Now Fuelling screen
#
#  @P11270-14814  @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Verify if System navigate the user to non logged-in dashboard from add payment method screen (GCO) after 300 seconds of inactivity
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Selectpump screen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Verify user is navigated to NLID screen from Add Payment method screen after 300 seconds of in activity
#
#  @P11270-15038 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Verify if System navigate the user to non logged-in dashboard from the Geolocation based site check-in screen after 300 seconds of inactivityThen Tap on FUEL AS GUEST Button in the NLID
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then wait for session timeout five minutes and Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
#    Then wait for more than five minutes user should navigate back to NLID screen
#
#  @P11270-15033 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Verify if System navigate the user to non logged-in dashboard from Add Payment Method scan card screen (GCO) after 300 seconds of inactivity
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    When user tap on Continue button in MFA screen
#    And Click on Add Debit or Credit Card
#    And Verify that Card details screen is displayed
#    Then wait for more than five minutes user should navigate back to NLID screen
#
#  @P11270-12238 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to view the NLID screen after Thank you screen if the notification permission is allowed
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Click on Continue button in Select pumpscreen
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And Enter the Card Name and Details
#    Then Enter the address of Customer
#    Then Click on the Done button
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Click on Send receipt button
#    And Click on ok button present in the receipt sent Success message screen
#    And Click on remind me later button
#    Then Verify that User is navigate back to NLID screen
#
#  @P11270-12111 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to view all elements are displayed in the Select your ppump screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify the Elements present in the Select your pump screen
#
#  @P11270-12128 @iOSRegression @iOSRegressionSet11
#  Scenario: Check whether the user is able to verify the elements in Select your Payment screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify the Elements present in the Select your pump screen
#    And Click on Continue button in Select pumpscreen
#    When user tap on Continue button in MFA screen
##    Then Verify user is navigated to Add Payment Method screen
#    Then Verify the Elements present in the Add Payment Method screen
#
#  @P11270-14226 @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#  Scenario: Verify if System navigate the user to logged-in dashboard from the Scan QR-Code screen after 300 seconds of inactivity
#    When user is on NLID screen
#    And user clicks on Login Icon
#    When I enter "regressioncredentials12" in login details
#    And user taps login button in login screen
#    And Click on start fuel button in LID
#    Then user navigated to select pump screen
#    And user tap on scan QR code button
#    And Verify user doesn't navigate to LID untill five minutes
#    Then user able to view Fuel, Station, Offers
#
#  @P11270-14797 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet111
#  Scenario: Verify if System navigate the user to logged-in dashboard from the Change Payment Details screen after 300 seconds of inactivity
#    Given user is on NLID screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user selects the pump from 'Select your Pump' page and taps on continue button
##    And user taps on continue if there is redemption screen
#    And user verify the MFA screen
#    When user tap on Continue button in MFA screen
#    Then the user is navigated to Confirm payment screen
#    And Tap on Payment method edit button
#    Then verify if the user lands on Payment Details Screen
#    Then Verify user navigated back to LID screen
#
#  @P11270-14224  @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Verify if System navigate the user to logged-in dashboard from the Geolocation based site check-in screen after 300 seconds of inactivity
#    Given user is on NLID screen
#    And Click on start fuel button in LID
#    Then user navigated to select pump screen
#    Then Verify user navigated back to LID screen
#
#  @P11270-14810 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Verify if System navigate the user to logged-in dashboard from Confirm Payment screen after 300 seconds of inactivity
#    Given user is on NLID screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user selects the pump from 'Select your Pump' page and taps on continue button
##    And user taps on continue if there is redemption screen
#    And user verify the MFA screen
#    When user tap on Continue button in MFA screen
#    Then the user is navigated to Confirm payment screen
#    Then Verify user navigated back to LID screen
#
#  @P11270-14798 @iOSRegression @iOSRegressionSet11  @AndroidRegression @AndroidRegressionSet11
#  Scenario: Verify if System navigate the user to logged-in dashboard from the Add Nectar Card screen after 300 seconds of inactivity
#    When user log out from the app if logged in
#    And user clicks on Login Icon
#    When I enter "cofPaypalcredentials" in login details
#    And user taps login button in login screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user verify the MFA screen
#    When user tap on Continue button in MFA screen
#    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    And Verify that Payment details screen
#    And user taps on add nectar card
#    Then Verify user navigated back to LID screen
#
##  @P11270-14796 @AndroidRegression1
##  Scenario: Verify if System navigate the user to logged-in dashboard from the Scan QR-Code camera screen after 300 seconds of inactivity
###    Then click on the login link in dashboard
####    When Enter "TestUser1" Login to ESSO app
####    And user clicks on Login Icon
###    When I enter "smokecredentials4" in login details
###    And user taps login button in login screen
##    And Click on start fuel button in LID
##    Then Verify user is navigated to Scan QR Code screen when you deny the location
##    When Tap on Scan QR Code button
##    Then Verify user is navigated to Scan QR Code Camera screen
##    And Verify user is navigated to LID screen from Scan QR Code Camera screen after 300 seconds of in activity
#
#  @P11270-14800 @iOSRegression @iOSRegressionSet11  @AndroidRegression @AndroidRegressionSet11
#  Scenario: Verify if System navigate the user to logged-in dashboard from the Change Payment Details screen after 300 seconds of inactivity
#
##    When user log out from the app if logged in
##    Then user is in login screen
##    When I enter "cofPaypalcredentials" in login details
##    And user taps login button in login screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user verify the MFA screen
#    When user tap on Continue button in MFA screen
#    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    And Verify that Payment details screen
#    And user taps on add nectar card
#    And user taps on scan barcode
#    Then Verify user navigated back to LID screen
#
##  @GCOErrorValidation @iOSRegression @GCO_iOS
##  Scenario: Check whether the user is able to verify all the card details info in the Add Debit/Credit card screen
##    Then Tap on FUEL AS GUEST Button in the NLID
##    Then user should opt out Verify the Terms and condition checkbox
##    And Tap on continue button
##    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
##    And Tap on Confirm Button
##    Then Verify user is navigated to Add Payment Method screen
##    Then Tap on Add Debit or Credit card details
##    Then Verify user is navigated to Add Debit or Credit card screen
##    And Tap on Done button with scroll
##    Then Verify the inline error message for Name On Card
##    And enter name on the card
##    Then Verify the inline error message for Card Number
##    And enter Card Number
##    Then Verify the inline error message for Expiry Date
##    And enter Expiry Date
##    Then Verify the inline error message for Security Code
##    And enter Security Code
##    Then Verify inline error message for post code
##    And enter the postcode
##    Then Verify search icon is present
##    Then Verify inline error message for Address1
##    And enter data in Address1
##    And enter data in Address2
##    Then Verify the inline error message for city
##    And Enter city
##    Then Click on the Done button
##    Then Tap on continue button in how to fuel screen
##    And Verify that Please wait screen is displayed
##    When user lands on card verification screen GCO
##    And enter valid password and click on submit button GCO
##    And Verify that Please wait screen is displayed
##    Then Start fuelling screen now is displayed
##    And Now fuelling displayed
##    And Transaction Complete screen is displayed for the user
##    And Click on done button in transaction complete screen
##    Then Verify Send receipt screen is displayed
##    And Click on Send receipt button
##    And Click on ok button present in the receipt sent Success message screen
##    And Verify the thank you screen should be displayed
##    And Click on Close button in Thank you screen
##    Then Verify that User is navigate back to NLID screen
##
##  @DemoTestCase2 @iOSRegression @GCO_iOSDemoTesCase
##  Scenario: User should be able to Perform Fuelling with PayPal account Click on Done button in Transaction Complete screen
##    Then click on the login link in dashboard
###    When Enter "TestUser1" Login to ESSO app
###    Then Click on login button
##    When I enter "smokecredentials4" in login details
##    And user taps login button in login screen
##    And Click on start fuel button in LID
##    Then Click on Continue button in Select pumpscreen
##    And Verify that Confirm Payment screen with all the elements details
##    Then Click on Confirm Payment with PayPal
##    And Verify that Please wait screen is displayed
##    Then Start fuelling screen now is displayed
##    And Now fuelling displayed
##    Then user taps on done button after finishing fuelling
##    And Verify the Use should be navigated to Thank you Screen

  #  @P11270-14796 @AndroidRegression1
#  Scenario: Verify if System navigate the user to logged-in dashboard from the Scan QR-Code camera screen after 300 seconds of inactivity
##    Then click on the login link in dashboard
###    When Enter "TestUser1" Login to ESSO app
###    Then Click on login button
##    When I enter "smokecredentials4" in login details
##    And user taps login button in login screen
#    And Click on start fuel button in LID
#    Then Verify user is navigated to Scan QR Code screen when you deny the location
#    When Tap on Scan QR Code button
#    Then Verify user is navigated to Scan QR Code Camera screen
#    And Verify user is navigated to LID screen from Scan QR Code Camera screen after 300 seconds of in activity

