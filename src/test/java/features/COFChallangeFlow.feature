@COFChallengeFlow
Feature: COFChallengeFlow

  @P11270-12836 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether system able to perform the 3DS SDK verification on selecting the COF for the payment method on successfully verifying the  PIN, TouchID, FaceId
    When user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "FrictEssoPsword" in login details
    And user taps login button in login screen
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "10" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate 3DS passphrase prompt for logged in user
    Then validate if user is on 3ds password screen

  @P11270-12810 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether when user is on �Verify your Password� screen and entered password is incorrect then 3DS SDK response is declined and navigate user to the �Transaction Declined� screen
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "5" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate if user is on 3ds password screen
    And enter invalid password and click on submit button
    And tap on done Button
    Then validate the error message displayed in modirum screen

  @P11270-36754 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1  @R123
  Scenario: Verify that the application should not display a ‘Cancel’ button on the pump selection screen. (selected pump -Edit)
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    When user taps on edit button in the selected pump field in the Confirm payment screen
    Then user should not see cancel button at the bottom of the screen

  @P11270-36753 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1  @R123
  Scenario: Verify that the application should not display a ‘Cancel’ button on the Payment Details screen. (Payment Method -Edit)
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And Click on Change payment link
    Then user should not see cancel button at the bottom of the screen

  @P11270-36752 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1  @R123
  Scenario: Verify that the application should not display a ‘Cancel’ button on the Maximum Fuelling Amount screen. (MFA -Edit)
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And Tap on Maximum Fuelling amount edit button
    Then user should not see cancel button at the bottom of the screen


  @P11270-15918- @P11270-12845 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether user is navigating to start fueling screen when entered password is correct and 3DS SDK response is success
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
#    Then validate 3DS passphrase prompt for logged in user
    When user lands on card verification screen
    And enter valid password and click on submit button
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then user tap on Done button in Transaction Complete screen

  @P11270-12850 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether user able to navigate user to the 3DS SDK driven screen and allowing user to enter the password,when user has set-up password at the payment method level
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "3" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
#    Then validate 3DS passphrase prompt for logged in user
#    When user lands on authorize payment screen
    And enter valid password and click on submit button

  @P11270-12887 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: System to display ‘Custom UI’ if the challenge flow is issued for the COF based fuelling-authorization request(Fueling Flow)
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate 3DS passphrase prompt for logged in user

  @P11270-12870 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Display the Identify Confirmation prompt as per ‘Requirement 1.e’  for 5 seconds [Note: 5 seconds should be configurable] (Fueling Flow)
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate 3DS passphrase prompt for logged in user
#    When user lands on authorize payment screen

  @P11270-12862 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether system able to perform the 3DS SDK verification on selecting the COF for payment method on successfully verifying the  PIN, TouchID, FaceId
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
#    Then validate 3DS passphrase prompt for logged in user
    Then validate if user is on 3ds password screen

  @P11270-12785 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether user able to navigate user to the 3DS SDK driven screen and allowing user to enter the password,when user has set-up password at the payment method level
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user verify the MFA screen
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    And Verify Payment details screen
#    And user selects the Challenge flow card and tap on update button
    And user confirms card payment
    Then user land on enter PIN screen
    Then user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen

  @P11270-12790 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether user is navigating to start fueling screen when entered password is correct and 3DS SDK response is success
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "4" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user verify the MFA screen
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    And Verify Payment details screen
#    And user selects the Challenge flow card and tap on update button
    And user confirms card payment
    Then user land on enter PIN screen
    Then user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
#    Then validate identity confirmation title
    Then validate if user is on 3ds password screen
    And enter valid password and click on submit button
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then user tap on Done button in Transaction Complete screen


  @P11270-12794 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether user able to see  webpage controlled by 3DS SDK, when the user has successfully authenticated the transaction, then 3DS SDK has responded back with the success response (A-Res) and 3DS SDK responded back with Challenge-response
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    And Verify Payment details screen
#    And user selects the Challenge flow card and tap on update button
    And user confirms card payment
    Then user land on enter PIN screen
    Then user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate if user is on 3ds password screen

  @P11270-12799 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
  Scenario: Dismiss the Fraud Prevention prompt as per Requirement if the user has tapped on the button(Fueling Flow)
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user verify the MFA screen
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    And Verify Payment details screen
#    And user selects the Challenge flow card and tap on update button
    And user confirms card payment
    Then user land on enter PIN screen
    Then user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then verify 3ds and tap on Got it button
    Then validate if user is on 3ds password screen

  @P11270-12860 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether user able to see  webpage controlled by 3DS SDK, when user has successfully authenticated the transaction,then 3DS SDK has responded back with the success response (A-Res) and 3DS SDK responded back with Challenge response
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    Then user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate if user is on 3ds password screen

  @P11270-12842 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether system to navigate user to ‘Start-Fuelling now’ screen as per current functionality post approved response
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "5" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    Then user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    Then validate if user is on 3ds password screen
    And enter valid password and click on submit button

  @P11270-23833 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2320 @SprintiOS2320
  Scenario: Verify weather System is displaying the mentioned details on the Maximum Fuelling Amount screen as per requirement.
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    Then user verify the MFA screen
    Then the user taps "140" in the ruler in the Mfa screen and validates the continue button is updated

  @P11270-23848 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2319 @SprintiOS2319
  Scenario: Verify that system should not display the 'Cancel' button on the Payment details screen
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And Click on Change payment link
    Then verify if the user lands on Payment Details Screen
    Then user should not see cancel button at the bottom of the screen

  @P11270-21548 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2319 @SprintiOS2319
  Scenario: Verify the user should able to navigate the logged-in dashboard from Thank You screen.
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "4" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When the user taps "140" in the ruler in the Mfa screen and validates the continue button is updated
    And user tap on Save for next time checkbox in MFA screen
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    Then user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
#    Then validate identity confirmation title
    Then validate if user is on 3ds password screen
    And enter valid password and click on submit button
    And user verify the Transaction Complete screen
    Then user tap on Done button in Transaction Complete screen
    And close the thank you screen if displayed
    Then user is on NLID screen

  @P11270-23838 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2320 @SprintiOS2320
  Scenario: Verify that system should not display the MFA screen when user has already selected the checkbox for 'Save for next time'
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    Then the user validates MFA screen is not displayed during the fuelling flow
    And the user validates the confirm payment screen and validates the pump number "1"
    Then the user validates whether "140" is updated in the Confirm Payment screen

  @P11270-23844 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2320 @SprintiOS2320
  Scenario: Verify that user should be able to see the updated Confirm  Pump number
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    When the user taps on edit pump number from the Confirm payment screen
    Then user validates the Select your Pump screen when cancel button is not present
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And the user validates the confirm payment screen and validates the pump number "1"

  @P11270-23840 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2320 @SprintiOS2320
  Scenario: Verify that system should untick the 'Save for next time' checkbox
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    Then the user is navigated to Confirm payment screen
    When the user taps on edit button in the Mfa section
    Then user verify the MFA screen without cancel button and "140" as already selected value
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen

  @P11270-23845 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2321 @SprintiOS2320
  Scenario: Verify that user  should allow the user to update the payment method
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And Click on Change payment link
    Then verify if the user lands on Payment Details Screen
    When the user taps on continue button in the Payment Details Screen
    Then the user validates the confirm payment screen and validates the pump number "1"

  @P11270-23842 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2321 @SprintiOS2320
  Scenario: Verify that system should navigate the user back to the site check-in screen from the MFA screen
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    Then user verify the MFA screen
    When the user taps on back button in the MFA screen
    Then user validates the Select your Pump screen when cancel button is not present
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And the user is navigated to the Redemption screen
    And user tap on Continue button in MFA screen
    And the user validates the confirm payment screen and validates the pump number "1"

  @P11270-23973 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprint2319_20 @SprintiOS2320
  Scenario: Verify that System should display 100£ as the default MFA ruler unit and do not display the previous set MFA when User log out and log in to the same device after saving the MFA value for next time.
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When the user taps "140" in the ruler in the Mfa screen and validates the continue button is updated
    And user tap on Save for next time checkbox in MFA screen
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    When user kill and relaunch the app
    And user log out from the app if logged in
    When user clicks on Login Icon
    And I enter "FrictEssoPsword" in login details
    And user taps login button in login screen
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    Then user verify the MFA screen

  @P11270-23846 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2320 @SprintiOS2320
  Scenario: Verify that system should allow the user to update the selected MFA unit
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    #And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    When the user taps on edit button in the Mfa section
    When the user taps "140" in the ruler in the Mfa screen and validates the continue button is updated
    When user tap on Continue button in MFA screen
    Then the user validates the confirm payment screen and validates the pump number "1"
    Then the user validates whether "140" is updated in the Confirm Payment screen

  @P11270-12806 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
  Scenario: System to display Custom UI if the challenge flow is issued for the COF onboarding(Manual Registration)
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user lands on Add debit/credit card screen
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
#    Then validate identity confirmation title
    Then validate if user is on modirum password screen

  @P11270-12805 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
  Scenario: Dismiss the Identify Confirmation prompt as per �Requirement 1.e�  if the user has tapped on the button(Manual Registration)
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user lands on Add debit/credit card screen
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then verify 3ds and tap on Got it button
    Then validate if user is on modirum password screen

  @P11270-12890 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether system able to perform the 3DS SDK verification System to display error message pop up based on the error response from SDK
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user lands on Add debit/credit card screen
    Then enter name of the card
    Then enter "5520 9050 1002 2051" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
#    Then validate identity confirmation title
    Then validate if user is on OTP password screen
    And tap on cancel button navigate to payment screen

  @P11270-12892 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Check whether system able to perform the 3DS SDK verification System to display error message pop up based on the error response from SDK
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user lands on Add debit/credit card screen
    Then enter name of the card
    Then enter "5520 9050 1002 2051" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
#    Then validate identity confirmation title
    Then validate if user is on OTP password screen
    And tap on cancel button navigate to payment screen

  @P11270-12897 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether User cancels the Challenge Scenario.
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user lands on Add debit/credit card screen
    Then enter name of the card
    Then enter "5520 9050 1002 2051" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
#    Then validate identity confirmation title
    Then validate if user is on OTP password screen
    And tap on cancel button navigate to payment screen

  @P11270-12888 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether User clicks on DONE again, based on 3DS SDK status, the app will display the challenge flow. (repeat the flow until the user complete the challenge flow or cancels the step or try with another card
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user lands on Add debit/credit card screen
    Then enter name of the card
    Then enter "5520 9050 1002 2051" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
#    Then validate identity confirmation title
    Then validate if user is on OTP password screen
    And tap on cancel button navigate to payment screen
    Then all fields on Add debit card screen should be cleared


#      #This is for OTP card
#  @P11270-12809 @AndroidRegression1 @IosRegression
#  Scenario: App should perform 3DS verification for Card Onboarding confirmation
#    When user taps on register button from Login screen
#    Then user should be navigated to Manual Register screen
#    Then enter First Name
#    Then enter Last Name
#    Then enter "testessoapp2021+" Email address
#    Then enter password
#    And confirm password
#    Then click the check box for accept
#    When click on continue button from register screen
#    When user tap on Skip button
#    Then the system should display Skip warning popup
#    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then user tap on add card button in account
#    When user is on setup PIN screen
#    When user enters four digit PIN
#    Then user tap on continue button in enter PIN screen
#    Then tap on ok button and close location copy text
#    Then enter name of the card
#    Then enter "5520 9050 1002 2051" card number
#    Then enter expiry date
#    Then enter CVV
#    Then enter postal code
#    Then enter address line1
#    Then enter Address line2
#    Then enter city
#    Then check consent checkbox
#    And tap on continue button in add payment screen
#    Then validate 3DS passphrase prompt
#    Then validate if user is on 3ds password screen
#
#  @P11270-12895 @AndroidRegression1 @IosRegression @FirstRun
#  Scenario: Display ‘Custom UI’ if the challenge flow is issued for the COF onboarding(Registration (Social) > Social Login )
#    Then user is in Linked in Login
#    When I enter SSO in login details for "LinkedIn"
#    And user taps login button in SSO login screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then user tap on add card button in account
#    Then enter name of the card
#    Then enter "4012 0000 0001 2003 001" card number
#    Then enter expiry date
#    Then enter CVV
#    Then enter postal code
#    Then enter address line1
#    Then enter Address line2
#    Then enter city
#    Then check consent checkbox
#    And tap on continue button in add payment screen
#    Then validate 3DS passphrase prompt
#
#  @P11270-12800 @AndroidRegression1 @IosRegression @FirstRun
#  Scenario: Display the Identify Confirmation prompt as per Requirement for 5 seconds [Note: 5 seconds should be configurable](Social) > Social Login )
#    Then user is in Linked in Login
#    When I enter SSO in login details for "LinkedIn"
#    And user taps login button in SSO login screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then user tap on add card button in account
#    Then enter name of the card
#    Then enter "4012 0000 0001 2003 001" card number
#    Then enter expiry date
#    Then enter CVV
#    Then enter postal code
#    Then enter address line1
#    Then enter Address line2
#    Then enter city
#    Then check consent checkbox
#    And tap on continue button in add payment screen
#    Then validate passphrase prompt and tap on got it button
#    Then validate if user is on 3ds password screen
#
#  @P11270-12801 @AndroidRegression1 @IosRegression @FirstRun
#  Scenario: Dismiss the Identify Confirmation prompt as per �Requirement 1.e�  if the user has tapped on the button(Social) > Social Login )
#    When user taps on Linkedin icon in the NLID
#    When I enter SSO in login details for "LinkedIn"
#    And user taps login button in SSO login screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then user tap on add card button in account
#    Then enter name of the card
#    Then enter "4012 0000 0001 2003 001" card number
#    Then enter expiry date
#    Then enter CVV
#    Then enter postal code
#    Then enter address line1
#    Then enter Address line2
#    Then enter city
#    Then check consent checkbox
#    And tap on continue button in add payment screen
#    Then validate 3DS passphrase prompt
#    Then validate if user is on 3ds password screen
#
#  @P11270-12894 @AndroidRegression1 @IosRegression @FirstRun
#  Scenario: Check whether system able to perform the 3DS SDK verification on selecting the COF for payment method on successfully verifying the  PIN, TouchID, FaceId
#    When user Tap on facebook button
#    And  user enter the mobile number
#    When user enter the password
#    And user click on continue button
#    And validate the facebook prompt
#    Then user is on NLID screen
#
#  @P11270-12807 @AndroidRegression1 @IosRegression
#  Scenario: Check whether when user is on Verify your Password screen and entered password is incorrect then 3DS SDK response is declined and navigate user to the �Transaction Declined� screen
#    Then user is in login screen
#    When I enter "Offer1" in login details
#    And user taps login button in login screen
#    When user taps on start button in LID
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms card payment
#    Then user land on enter PIN screen
#    When user enters four digit PIN
#    Then user tap on continue button in enter PIN screen
#    When user lands on authorize payment screen
#    Then validate 3DS passphrase prompt for logged in user
#    Then validate if user is on 3ds password screen
#    And enter invalid password and click on submit button
#    Then validate error message displayed in modirum screen
#
#  @P11270-12808 @AndroidRegression1 @IosRegression @FirstRun
#  Scenario: Check whether Navigate the user to Add Payment Method screen with a pop up saying: Card added successfully.  screen as per current functionality.
#    When user taps on register button from Login screen
#    Then user should be navigated to Manual Register screen
#    Then enter First Name
#    Then enter Last Name
#    Then enter "testessoapp2021+" Email address
#    Then enter password
#    And confirm password
#    Then click the check box for accept
#    When click on continue button from register screen
#    When user tap on Skip button
#    Then the system should display Skip warning popup
#    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then user tap on add card button in account
#    When user is on setup PIN screen
#    When user enters four digit PIN
#    Then user tap on continue button in enter PIN screen
#    Then tap on ok button and close location copy text
#    Then enter name of the card
#    Then enter "4012 0000 0001 2003 001" card number
#    Then enter expiry date
#    Then enter CVV
#    Then enter postal code
#    Then enter address line1
#    Then enter Address line2
#    Then enter city
#    Then check consent checkbox
#    And tap on continue button in add payment screen
#    Then validate 3DS passphrase prompt
#    Then validate if user is on 3ds password screen
#    And enter valid password and click on submit button
#    Then validate success screen for added card

#  @P11270-12918 @iOSResgressionR221-
#  Scenario: Check whether 3DS SDK will control on which Challenge Flow to display for the user
#    When user log out from the app if logged in
#    When user taps on register button from Login screen
#    Then user should be navigated to Manual Register screen
#    Then enter First Name
#    Then enter Last Name
#    Then enter Email address as "chibisakkrava.d+"
#    Then enter password
#    And confirm password
#    Then click the check box for accept
#    When click on continue button from register screen
#    When user tap on Skip button
#    Then the system should display Skip warning popup
#    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
#    And user taps on the complete profile
#    When user taps on add payment method
#    Then Verify user is navigated to Add Payment Method screen
#    And Tap on Add Debit or Credit card details
#    When user is on setup PIN screen
#    When user enters four digit PIN
#    Then user tap on continue button in enter PIN screen
#    Then tap on ok button and close location copy text
#    Then enter name of the card
#    Then enter "4012 0000 0001 2003 001" card number
#    Then enter expiry date
#    Then enter CVV
#    Then enter postal code
#    Then enter address line1
#    Then enter Address line2
#    Then enter city
#    Then check consent checkbox
#    And tap on continue button in add payment screen
#    Then validate 3DS passphrase prompt
#    Then validate if user is on 3ds password screen
#    And enter valid password and click on submit button

#  @P11270-12803 @iOSRegresssionR221sd -10 @AndrsoidRegressionR221
#  Scenario: Check whether to Navigate the user to the next respective screen.
#    When user log out from the app if logged in
#    Then user is in login screen
#    When I enter "cofPaypalcredentials" in login details
#    And user taps login button in login screen
#    When user is on LID Screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then user tap on add card button in account
#    When user is on setup PIN screen
#    When user enters four digit PIN
#    Then user tap on continue button in enter PIN screen
#    Then tap on ok button and close location copy text
#    When user lands on Add debit/credit card screen
#    Then enter name of the card
#    Then enter "4012 0000 0001 2003 001" card number
#    Then enter expiry date
#    Then enter CVV
#    Then enter postal code
#    Then enter address line1
#    Then enter Address line2
#    Then enter city
#    Then check consent checkbox
#    And tap on continue button in add payment screen
#    Then verify 3ds prompt
#    Then validate if user is on 3ds password screen
#    And enter valid password and click on submit button
#    Then validate success screen for added card COF
#
#
#  @P11270-16364 @AndroidRegresOsionR221
#  Scenario: Check whether system able to perform the 3DS SDK verification on selecting the COF for the payment method on successfully verifying the  PIN, TouchID, FaceId
#    When user is on NLID screen
#    And user taps on More button in tab bar
#    And navigate to the account screen
#    And verify the payment method order

#  @P11270-12804 @AndroidRegression @AndroidRegressionSet11 @iOSRegression @iOSRegressionSet11
#  Scenario: Display the Identify Confirmation prompt as per Requirement 1.e�  for 5 seconds [Note: 5 seconds should be configurable](Manual Registration)
#    When user log out from the app if logged in
#    When user taps on register button from Login screen
#    Then user should be navigated to Manual Register screen
#    Then enter First Name
#    Then enter Last Name
#    Then enter "chibisakkrava.d+" Email address
#    Then enter password
#    And confirm password
#    Then click the check box for accept
#    When click on continue button from register screen
#    When user tap on Skip button
#    Then the system should display Skip warning popup
#    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then user tap on add card button in account
#    When user taps on Credit Debit card in Add Payment Method screen
#    When user enters four digit PIN
#    Then user tap on continue button in enter PIN screen
#    Then tap on ok button and close location copy text
#    Then user lands on Add debit/credit card screen
#    Then enter name of the card
#    Then enter "5520 9050 1002 2051" card number
#    Then enter expiry date
#    Then enter CVV
#    Then enter postal code
#    Then enter address line1
#    Then enter Address line2
#    Then enter city
#    Then check consent checkbox
#    And tap on continue button in add payment screen
#    Then validate 3ds prompt exists for not more than 5 seconds

  @P11270-22567 @AndroidRegression @Sprintandroid2414
  Scenario: Verify the Payment cards adding (iOS/Android)
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user lands on Add debit/credit card screen
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
#    Then validate identity confirmation title
    Then validate if user is on modirum password screen
    And enter valid password and click on submit button
    When user tap on payment method added successfully screen continue button
    #Then user lands on Add debit/credit card screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then enter name of the card
    Then enter "4147 4630 1111 0083" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
