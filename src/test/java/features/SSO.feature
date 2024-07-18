@SSO
Feature: SSO

#    @P11270-15743 @iOSRegression @iOSRegressionSet21 @AndroidRegression @AndroidRegressionSet21
#    Scenario: Verify if SSO Twitter based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from confirm payment screen
#      Given user log out from the app if logged in
#      And user taps on "Twitter" icon in the NLID
#      And I enter SSO login details for "Twitter"
#      Given user is on NLID screen
#      When user taps on start button in LID
#      And user is navigated to Select your pump screen
#      And user selects pump number "2" to start fuelling
#      And user selects the pump from 'Select your Pump' page and taps on continue button
#      When user tap on Continue button in MFA screen
#      Then the user is navigated to Confirm payment screen
#      And user confirms card payment
#      When user taps on Forgot your pin link
#      Then user is navigated to Forgot Pin Screen
#      And Veirfy all the elements are present in Forgot Pin Screen
#      And user taps on send button in Forgot Pin Screen
#      Then verify the confirmation pop up is displayed
#      And tap on Ok Button
#      Then the user is navigated to Confirm payment screen
#
#    @P11270-15739 @iOSRegression @iOSRegressionSet21 @AndroidRegression @AndroidRegressionSet21
#    Scenario: Verify if SSO Twitter based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email
#      Given user is on NLID screen
#      And user taps on More button in tab bar
#      When user navigates to Account screen
#      Then user clicks on edit in the pin without phone
#      When user taps on Forgot your pin link
#      Then user is navigated to Forgot Pin Screen
#      And Veirfy all the elements are present in Forgot Pin Screen
#      And user taps on send button in Forgot Pin Screen
#      Then verify the confirmation pop up is displayed
#      And tap on Ok Button
#      Then user verifies the user redirected to Account screen
#
#    @P11270-28448 @iOSRegression @iOSRegressionSet21 @AndroidRegression @AndroidRegressionSet21 @Sprintandroid2322 @SprintiOS2321
#    Scenario:App should allow the Twitter user to register again with the deleted account
#      When user is on NLID screen
#      And user taps on More button in tab bar
#      When user navigates to Account screen
#      And user verifies the Account title in the account section
#      And user taps on delete your account in account screen
#      And user verifies the delete your account screen
#      And user taps on delete in delete your account screen
#      And user verifies the delete your account popup
#      And tap on Ok Button
#      Then user verifies the app redirects back to NLID
#      And user taps on "Twitter" icon in the NLID
#      And I enter SSO login details for "Twitter"
#      Then user navigates to the SSO registration screen
#
#    @P11270-30671 @iOSRegression @iOSRegressionSet21 @AndroidRegression @AndroidRegressionSet21 @Sprint2321_22 @SprintiOS2321
#    Scenario: Verify whether application is not displaying add mobile number task in Twitter registraion flow
#      Given user log out from the app if logged in
#      And user taps on "Twitter" icon in the NLID
#      And I enter SSO login details for "Twitter"
#      Then user navigates to the SSO registration screen
#      Then user verifies the mobile number field is not present in the SSO registraion flow
#      Then user registers the SSO user by accepting the terms and conditions screen
#      When user is on NLID screen

  @P11270-15744 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprint2321_22
  Scenario: Verify if SSO Linked In based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from confirm payment screen
    Given user log out from the app if logged in
    And user taps on "LinkedIn" icon in the NLID
    And I enter SSO login details for "LinkedIn"
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button
    Then the user is navigated to Confirm payment screen

  @P11270-15740 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify if SSO Linked in based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user clicks on edit in the pin without phone
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button
    Then user verifies the user redirected to Account screen

#  Uncomment it when this issue is fixed -  P11270-48218
  @P11270-28449 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprint2321_22 @SprintiOS2321
  Scenario: App should allow the LinkedIn user to register again with the deleted account
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user verifies the delete your account screen
    And user taps on delete in delete your account screen
    And user verifies the delete your account popup
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
#    And user taps on "LinkedIn" icon in the NLID
#    And I enter SSO login details for "LinkedIn"
#    Then user navigates to the SSO registration screen

  @P11270-30649 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322 @SprintiOS2321
  Scenario: Verify whether application is not displaying add mobile number task in Linked-in registraion flow
    Given user log out from the app if logged in
    And user taps on "LinkedIn" icon in the NLID
    And I enter SSO login details for "LinkedIn"
    Then user navigates to the SSO registration screen
    Then user verifies the mobile number field is not present in the SSO registraion flow
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen

  @P11270-30650 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2323
  Scenario: Verify whether application is not displaying add mobile number task in Linked-in Profile completion Screen
    Given user is on NLID screen
    And user taps on the complete profile
    Then user confirms the mobile number field is not present in the Completes your profile screen

  @P11270-35389 @iOSRegression @iOSRegressionSet2 @Sprint2321_22 @SprintiOS2322
  Scenario: SSO User [iOS-only] - Verify that whether the app is displaying the updated design of the Add Payment Method screen
    When user is on NLID screen
    And user validates the add payment link present in LID screen
    When user taps on add payment link present in LID screen
    Then user verifies the Add Payment method screen
    Then validate the cancel button displayed in add payment method
    Then verify the applepay displayed as first payment in add payment method
    Then verify the credit/debit card displayed as second payment in add payment method
    Then verify the paypal is displayed as third payment in add payment method

  @P11270-38745 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322 @SprintiOS2322
  Scenario: Linked-In user - Verify the user is able to see the updated Esso logo in the "LID" screen
    Then verify the updated esso logo is displayed

  @P11270-15741 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprint2321_22
  Scenario: Verify if SSO Facebook based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from confirm payment screen
    Given user log out from the app if logged in
    And user taps on "Facebook" icon in the NLID
    And I enter SSO login details for "Facebook"
#    Then accept terms and conditions
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button
    Then the user is navigated to Confirm payment screen

  @P11270-15737 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify if SSO Facebook based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user clicks on edit in the pin without phone
    When user taps on Forgot your pin link
    Then user is navigated to Forgot Pin Screen
    And Veirfy all the elements are present in Forgot Pin Screen
    And user taps on send button in Forgot Pin Screen
    Then verify the confirmation pop up is displayed
    And tap on Ok Button
    Then user verifies the user redirected to Account screen

  @P11270-12909 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check Whether System displays the confirmation for the transaction
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the frictionless flow card and tap on update button
    Then user verify the confirms the payment screen
    When user confirms card payment
    And Enter pin in the fuelling flow
    And Verify that Please wait screen is displayed
    Then Start fuelling screen now is displayed

  @P11270-28444 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322 @SprintiOS2324
  Scenario: App should allow the Facebook user to register again with the deleted account
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user verifies the delete your account screen
    And user taps on delete in delete your account screen
    And user verifies the delete your account popup
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Facebook" icon in the NLID
    And I enter SSO login details for "Facebook"
    Then user navigates to the SSO registration screen
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen

  @P11270-35391 @iOSRegression @iOSRegressionSet2 @SprintiOS2324
  Scenario: SSO User [iOS-only] - Verify that whether the app is displaying the updated design of the Add Payment Method screen
    Given user is on NLID screen
    When user taps on start button in LID
    And user validates the add payment popup title and ct once taps on start fuel
    Then user taps on ok button from add payment popup
    Then user verifies the Add Payment method screen
    Then validate the cancel button displayed in add payment method
    Then verify the applepay displayed as first payment in add payment method
    Then verify the credit/debit card displayed as second payment in add payment method
    Then verify the paypal is displayed as third payment in add payment method

  @P11270-35384 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322 @SprintiOS2322
  Scenario: SSO User - Verify whether app is displaying the Credit/Debit Card info icon pop-up on the Add Payment Method screen
    Given user is on NLID screen
    And user validates the add payment link present in LID screen
    When user taps on add payment link present in LID screen
    Then user verifies the Add Payment method screen
    Then user verifies the info icon present and taps on the button
    When user verifies the text present under info icon and taps on ok button
    Then user verifies the Add Payment method screen

  @P11270-12801 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @SprintiOS2324
  Scenario: Dismiss the Identify Confirmation prompt as per ‘Requirement 1.e’  if the user has tapped on the button(Social) > Social Login)
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user lands on Add debit/credit card screen
    Then enter name of the card
    Then enter "5426 0640 0042 5174" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
#    Then user verifies the completed popup message for card added
#    And user clicks on ok button in card added message
    Then validate identity confirmation title
    Then validate if user is on 3ds password screen

  @P11270-12895 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322 @SprintiOS2324
  Scenario: System to display ‘Custom UI’ if the challenge flow is issued for the COF onboarding(Registration (Social) > Social Login)
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user lands on Add debit/credit card screen
    Then enter name of the card
    Then enter "5426 0640 0042 5174" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then validate identity confirmation title
    Then validate if user is on 3ds password screen

  @P11270-38596 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322 @SprintiOS2322
  Scenario: LID -SSO Facebook user- Verify that whether App is app displaying a broadcast banner on the LID
    When user verifies the broadcast banner

  @P11270-38712 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322 @SprintiOS2322
  Scenario: FB user - Verify the user is able to see the updated Esso logo in the "LID" screen
    Then verify the updated esso logo is displayed

#    Uncomment it when this issue is resolved - P11270-48218
#  @P11270-38723 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322 @SprintiOS2322
#  Scenario: Google user - Verify the user is able to see the updated Esso logo in the "LID" screen
#    Given user log out from the app if logged in
#    And user taps on "Google" icon in the NLID
#    And I enter SSO login details for "Google"
#    Given user is on NLID screen
#    Then verify the updated esso logo is displayed

  @P11270-35170 @iOSRegression @iOSRegressionSet2 @Sprint2322_23
  Scenario: Verify whether App displays the' CLICK HERE TO FUEL' button CT on the LID screen. ( Google Registered user)
    When user is on NLID screen
    Then user verifies the updated CT in the start button

  @P11270-30651 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify whether application is not displaying add mobile number task in Linked-in Profile completion on LID
    Given user log out from the app if logged in
    And user taps on "LinkedIn" icon in the NLID
    And I enter SSO login details for "LinkedIn"
    When user is on NLID screen
    And user taps on the complete profile
    Then user confirms the mobile number field is not present in the Completes your profile screen

  @P11270-35379 @iOSRegression @iOSRegressionSet2 @SprintiOS2322
    Scenario: SSO User [iOS-only] - Verify that whether the app is displaying the updated design of the Add Payment Method screen
     Given user is on NLID screen
     When user taps on Add Payment button in LID
     Then user verifies the Add Payment method screen
     Then validate the cancel button displayed in add payment method
     Then verify the applepay displayed as first payment in add payment method
     Then verify the credit/debit card displayed as second payment in add payment method
     Then verify the paypal is displayed as third payment in add payment method

  @P11270-35387 @iOSRegression @iOSRegressionSet2 @SprintiOS2322
    Scenario: "SSO User [iOS-only] - Verify that whether the app is displaying the updated design of the Add Payment Method screen"
     Given user is on NLID screen
     And user taps on the complete profile
     And user taps on add payment method
     Then user verifies the Add Payment method screen
     Then validate the cancel button displayed in add payment method
     Then verify the applepay displayed as first payment in add payment method
     Then verify the credit/debit card displayed as second payment in add payment method
     Then verify the paypal is displayed as third payment in add payment method

#  ================================================================
#  @P11270-SSO1
#  Scenario: Verify the all SSO logins are working fine
#    Given user is on NLID Screen
#    When user taps on Facebook icon in NLID
#    Then user is on Facebook Login Screen
#    When I enter SSO login details for Facebook
#    And user taps login button in Facebook login screen
#    Then verify user is on LID Screen
#    And user taps on More button in tab bar
#    Then user navigates to Account screen
#    When user taps on logout button
#    Then user is navigated to NLID Screen
#    When user taps on Twitter icon in the NLID
#    Then user is on Twitter Login screen
#    When I enter SSO login details for Twitter
#    And user taps login button in Twitter login screen
#    Then verify user is on LID Screen
#    And user taps on More button in tab bar
#    Then user navigates to Account screen
#    When user taps on logout button
#    Then user is navigated to NLID Screen
#    When user taps on Linkedin icon in the NLID
#    Then user is on Linkedin Login screen
#    When I enter SSO login details for Linkedin
#    And user taps login button in Linkedin login screen
#    Then verify user is on LID Screen
#    And user taps on More button in tab bar
#    Then user navigates to Account screen
#    When user taps on logout button
#    Then user is navigated to NLID Screen
#
#  @P11270-SSO2
#  Scenario: Verify if SSO Facebook based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email from Account and Confirm Payment Screen
#    Then user is on Facebook Login
#    When I enter SSO login details for Facebook
#    And user taps login button in Facebook login screen
#    Then verify user is on LID Screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And tap on Edit pin from account screen
#    When user taps on Forgot your pin link
#    Then user is navigated to Forgot Pin Screen
#    And Veirfy all the elements are present in Forgot Pin Screen
#    And user taps on send button in Forgot Pin Screen
#    Then verify the confirmation pop up is displayed
#    And tap on Ok Button
#    Then verify the user is navigated to the Account screen
#    When user taps on fuel icon and start fuelling button
#    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
#    And Tap on Confirm Button
#    And user enter the confirms the payment button
#    When user taps on Forgot your pin link
#    Then user is navigated to Forgot Pin Screen
#    And Veirfy all the elements are present in Forgot Pin Screen
#    And user taps on send button in Forgot Pin Screen
#    Then verify the confirmation pop up is displayed
#    And tap on Ok Button
#
#  @P11270-SSO3
#  Scenario: Check whether System to display tab bar only in landing screen of following features For SSO Login
#    Given user is on NLID screen
#    Then verify the Tab bar at the bottom of App UI screen
#    When user taps on Twitter icon in the NLID
#    Then user is on Twitter Login screen
#    When I enter SSO login details for Twitter
#    And user taps login button in Twitter login screen
#    Then verify user is on LID Screen
#    Then verify the Tab bar at the bottom of App UI screen
#    When user navigates to Fuel Finder screen and Verify
#    Then verify the Tab bar at the bottom of App UI screen
#    When user taps on More button in tab bar
#    Then verify the Tab bar at the bottom of App UI screen
#    Then user taps on Tell a Friend
#    Then verify the Tab bar at the bottom of App UI screen
#    And verify system navigating to Refer a Friend screen
#    Then user tabs on back button
#    When user navigates to Products and Information screen
#    Then verify the about Esso fuel products & Information
#    Then verify the Tab bar at the bottom of App UI screen
#    Then user tabs on back button
#    When user navigates to Account screen
#    And Verify all the sections in the account screen
#    Then verify the Tab bar at the bottom of App UI screen
#    Then user tabs on back button
#    When user navigates to Help screen
#    Then verify the Tab bar at the bottom of App UI screen
#    Then user tabs on back button
#
#
#  @P11270-SSO4
#  Scenario: To verify that system to display a prompt, when user has given feedback or blank feedback For SSO Login.
#    Given user is on NLID screen
#    When user taps on Linkedin icon in the NLID
#    Then user is on Linkedin Login screen
#    When I enter SSO login details for Linkedin
#    And user taps login button in Linkedin login screen
#    Then verify user is on LID Screen
#    And user taps on More button in tab bar
#    And user navigates to Help screen
#    When User click on the Esso App Feedback
#    Then User taps on Give Us more feedback
#    And user give stars for First Statement
#    Then user give stars for Second Statement
#    And user give stars for Third Statement
#    Then user give stars for Fourth Statement
#    Then click on the SEND FEEDBACK button
#    And verify the prompt message as "Thanks for your feedback."
#    Then Tap on OK button
#    And verify promt id getting closed and user navigated back to Help Screen
#
#  @P11270-SSO5
#  Scenario: check whethe user is able to complete the fuelling transaction using SSO Login with Challengeflow passphrase card
#    When user taps on login with facebook
#    And the user enters the login details for "facebook"
#    And user taps on the login button in the facebook login
#    Then user lands on LID screen after successful Login
#    When user taps on start button in LID
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms card payment
#    Then user land on enter PIN screen
#    When user enters four digit PIN
#    Then user tap on continue button in enter PIN screen
#    When user lands on authorize payment screen
#    Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
#    When user lands on Modirum screen
#    And enter valid password and click on submit button
#    Then user is navigated to start fueling now screen
#    And then to now fueling
#    Then verify user navigates to Transaction Complete screen
#    And Click on done button in transaction complete screen
#    Then Verify the thank you screen should be displayed



