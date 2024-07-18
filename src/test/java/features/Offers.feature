@Offers
Feature: Offers

  @P11270-13122 @P11270-13164 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: LID- Add Nectar Card and verify on Registration flow
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
    When user taps on Offers
    Then verify user is able to Navigate Offers screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    Then enter "NectarCardAddAndVerify" Nectar card number and password
    Then validate nectar card number and point balance in offers screen

#  @P11270-13152
#  Scenario: Offers- Load to Card : View the balance point in offers screen 1 When  points are accumulated
#    When user is on NLID screen
#    And user taps on Offers
#    Then validate nectar card number and point balance in offers screen

  @P11270-37005 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2  @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in Offer screen (Nectar card added and verified)
    When user is on NLID screen
    And user taps on Offers
    Then user validates that the app assistant is not present

  @P11270-37003 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2  @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in Offer screen (Nectar card not added)
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    And user taps on Offers
    Then user validates that the app assistant is not present

  @P11270-13126 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Account :  Account screen UI and Alignment ,Before adding Nectar Card
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then tap on add nectar card from account screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    Then user tap on verify later
    Then Validate skip click on skip button
#    Then validate added nectar card in account
    Then validate added nectar card "NectarCardAddAndVerify" in the account

  @P11270-37004 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2  @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in Offer screen (Nectar card added but verified)
    When user is on NLID screen
    And user taps on Offers
    Then user validates that the app assistant is not present

  @P11270-12008 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2324
  Scenario: Verify if user is able to see the 'Nectar card added successfully' screen from complete your profile screen
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    When enter First Name
    And enter Last Name
    And enter "chibisakkrava.d+" Email address
    And enter password
    And confirm password
    And click the check box for accept
    And click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    And user should see details in contextual registration screen
    When user tap on Skip button
    And user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on the complete profile
    And user clicks on Add nectar
    And user clicks on the get started icon
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    Then the user validates the nectar card added successfully screen

  @P11270-13125 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Accounts - "Add Nectar card" and Verify the Card
    When user log out from the app if logged in
    And user clicks on Login Icon
    And I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    Then tap on add nectar card from account screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    Then enter "NectarCardAddAndVerify" Nectar card number and password
    And navigate to the Nectar card section from account screen
    Then validate added nectar card "NectarCardAddAndVerify" in the account

  @P11270-13177 @iOSRegression @iOSRegressionSet2  @AndroidRegression @AndroidRegressionSet2
  Scenario: Daisy Ph2 -Sprint 2: Verify the Point balance on offers screen
    Given user is on NLID screen
    Then user taps on Offers
    Then verify nectar points comma seperator on offers screen

  @P11270-13174 @iOSRegression @iOSRegressionSet2  @AndroidRegression @AndroidRegressionSet2
  Scenario: Station Finder : "Nectar Points" is selected along with one other filters button  "APPLY 1 FILTER" should be displayed
    Given user is on NLID screen
    Then user taps on Station Finder
    When user tap on filter icon
    Then select Nectar Points filter
    And validate apply filter button

  @P11270-13112 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Esso Daisy Ph2 : Verify the Nectar points balance and offer banner on LID screen
    And user is on NLID screen
    Then Verify the Nectar Card points in LID screen

  @P11270-13113 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Esso Daisy Ph2 : Verify the Nectar points balance and offer banner on LID screen
    And user is on NLID screen
    And Verify that tick mark is displayed on the offers

  @P11270-5061 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check whether User navigates to Offers screen from tab bar
    Given user is on NLID screen
    When user taps on Offers
#    Then verify user is able to Navigate Offers screen
    Then validate nectar card number and point balance in offers screen
    And validate offers displayed in offer screen

  @P11270-13149 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Offers- load to card - Terms & Condition pop up by tapping on T&C link
    Given user is on NLID screen
    Then user taps on Offers
    And validate offers displayed in offer screen
    Then tap on view offers button
    And validate offer details
    Then tap on Terms & conditions link
    And validate Terms & conditions overlay
    Then close the Terms & conditions overlay

  @P11270-13191 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Offers- Load to Card : View the balance point in offers screen 1 When no points are accumulated
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    Then user adds a nectar card and taps verify later
    Then user taps on Offers
    Then validate point balance as nill in offers screen when user has no points

  @P11270-18334 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2323
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link. >Transaction complete > Add and verify nectar card
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    And user taps on fuel icon
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms the payment
    Then validate add nectar card button displayed in transaction complete screen
    And tap on the Add Nectar Card button in Transaction complete Screen
    And verify the Add nectar card screen
    Then tap on Add now button in Add Nectar Card Screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And click on Ok button in the modal popup in the Nectar card page
    Then user lands on Verify Card Screen and taps on skip button
    Then validate verify nectar card link displayed in transaction complete screen

  @P11270-18330 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2323
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link. >Account screen >Add and verify nectar card
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    Then tap on add nectar card from account screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And click on Ok button in the modal popup in the Nectar card page
    Then user lands on Verify Card Screen and taps on skip button
    Then user verifies the user redirected to Account screen after nectar addition

  @P11270-18335 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2323
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link. >Transaction complete > Verify Nectar card added
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms the payment
    Then validate verify nectar card link displayed in transaction complete screen
    When tap on the Verify Nectar Card link in Transaction complete Screen
    When user clicks on Continue button under 'Card Added successfully' alert
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And click on Ok button in the modal popup in the Nectar card page
    Then user lands on Verify Card Screen and taps on skip button
    Then validate verify nectar card link displayed in transaction complete screen

  @P11270-18321 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2323
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link. >LID > Add and verify nectar cards (promotion message on LID)
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    And user taps on fuel icon
    When user tap on learn more link in LID screen
    Then User is navigated to Add Nectar Card screen
    When click on Get Started button on Add Nectar Card screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And click on Ok button in the modal popup in the Nectar card page
    Then user lands on Verify Card Screen and taps on skip button
    Then Verify user navigated back to LID screen

  @P11270-18327 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2323
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link. >Payment details screen > Add and verify nectar card
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    When user taps on fuel icon and start fuelling button
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And Click on Change payment link
    And user adds the Nectar card details by clicking the Add nectar card in Payment details screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And click on Ok button in the modal popup in the Nectar card page
    Then user lands on Verify Card Screen and taps on skip button
    Then verify if the user lands on Payment Details Screen

  @P11270-18326 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2323
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link. >LID > Add and verify nectar cards (promotion message on LID)
    Given user is on NLID screen
    When user taps on fuel icon
    Then verify whether See your Nectar balance link is displayed on LID
    And tap on See your Nectar balance Link
    When user clicks on Continue button under 'Card Added successfully' alert
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And click on Ok button in the modal popup in the Nectar card page
    Then user lands on Verify Card Screen and taps on skip button
    Then verify whether See your Nectar balance link is displayed on LID

  @P11270-18332 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2323
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link. >Offer > Nectar card added - Verify
    Given user is on NLID screen
    When user taps on Offers
    And tap on Verify Nectar button in offers Screen
    When user clicks on Continue button under 'Card Added successfully' alert
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And click on Ok button in the modal popup in the Nectar card page
    Then user lands on Verify Card Screen and taps on skip button
    Then user Verifies the Nectar card button in the Offers Screen

  @P11270-18331 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324  @SprintiOS2323
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the “Cancel and return to Esso” or “back/cancel” link. >Offer > Add and verify nectar card
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    When user taps on Offers
    When user taps on 'Get Exclusive offers' in the offers screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And click on Ok button in the modal popup in the Nectar card page
    Then user lands on Verify Card Screen and taps on skip button
    Then user Verifies the Nectar card button in the Offers Screen

  @P11270-13118 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: LID - Add Nectar card (valid nectar card number) from Dashboard screen
    And user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    And user taps on fuel icon
    And user is on NLID screen
    When user tap on learn more link in LID screen
    Then User is navigated to Add Nectar Card screen
    When click on Get Started button on Add Nectar Card screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    Then enter "NectarCardAddAndVerify" Nectar card number and password
    And user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen

  @P11270-13135 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Offers UI and alignment for all the New offer screen
    And user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And navigate to the Nectar card section
    And Delete the Nectar card if it is present
    And user taps on fuel icon
    When user taps on Offers
    Then verify user is able to Navigate Offers screen
    And user validates offers screen
    When user taps on "More about collecting points" link
    And user sees how to collect points overlay
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    Then user verifies the Nectar Added success pop-up and skips verification
    When Validate skip click on skip button
    And verify if the user is navigated to Verify Offers screen

  @P11270-13124 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Do you have a Nectar card should not be displayed and user navigate to 'Add Nectar Card'
    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer2" in login details
#    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    When user taps on Offers
    Then verify user is able to Navigate Offers screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen

  @P11270-13139 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @Sprintandroid2322 @SprintiOS2322
  Scenario: Daisy Phase 2 Esso app : From LID add nectar card and verify the nectar card
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies Add Nectar card section
    Then Add and verify Nectar card

  @P11270-32308 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2322
  Scenario: Google Sign In Registration->Verify whether the app marks the profile completion task 'Add Nectar Card' as complete when the user skip/cancel adding the Nectar card from the Complete Your Profile->Add Nectar Card launch screen
    Given user log out from the app if logged in
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
#    Then user registers the SSO user by accepting the terms and conditions screen
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user taps on delete in delete your account screen
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen
    And user taps on the complete profile
    And user clicks on Add nectar
    And user taps on cancel button in the add nectar card launch screen from Profile completion
    Then user clicks on Add nectar
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-32310 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2322
  Scenario: Google sign in Registration->Verify whether the app marks the profile completion task 'Add Nectar Card' as complete when the user skip adding the Nectar card from the Complete Your Profile > Add Nectar Card launch screen > Add Nectar Card screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user taps on delete in delete your account screen
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen
    And user taps on the complete profile
    And user clicks on Add nectar
    And user clicks on the get started icon
    And user taps on cancel button in the add nectar card screen from Profile completion
    And user taps on cancel button in the add nectar card launch screen from Profile completion
    Then user clicks on Add nectar
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-33077 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2322
  Scenario: Google SSO Registration->Verify whether the app marks the profile completion task 'Add Nectar Card' as complete when the user skip adding the Nectar card from Offer Screen >Add Nectar Card screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user taps on delete in delete your account screen
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen
    And user clicks on offer icon
    And user clicks Add Nectar Card from offer screen
    And user taps on cancel button in the add nectar card screen from Profile completion
    When user taps on fuel icon and navigate to LID screen
    And user taps on the complete profile
    And user clicks on Add nectar
    Then user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-32911 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2322
  Scenario: Google Signin Registration->Verify whether the app marks the profile completion task 'Add Nectar Card' as complete when the user skip adding the Nectar card from the Offer screen (Add your Nectar card to get exclusive Offers' link)> Add Nectar Card screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user taps on delete in delete your account screen
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen
    And user clicks on offer icon
    When user taps on 'Get Exclusive offers' in the offers screen
    And user taps on cancel button in the add nectar card screen from Profile completion
    When user taps on fuel icon and navigate to LID screen
    And user taps on the complete profile
    And user clicks on Add nectar
    Then user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-32340 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2322
  Scenario: Google Sign In Registration->Verify whether the app marks the profile completion task 'Add Nectar Card' as complete when the user skip/cancel adding the Nectar card from the LID->Add Nectar Card launch screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user taps on delete in delete your account screen
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on add payment method
    Then user verifies the Add Payment method screen
    When user taps on Credit Debit card in Add Payment Method screen
    Then enter name of the card
    Then enter "5232 0500 0019 0003" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    Then user clicks on continue button in Card screen
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    And user taps on back and navigates to LID
    And user is on NLID screen
    And user taps on Add nectar card link in LID
    And user taps on cancel button in the add nectar card launch screen from Profile completion
    And user taps on the complete profile
    And user clicks on Add nectar
    Then user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-32345 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2322
  Scenario: Google Sign In Registration->Verify whether the app marks the profile completion task 'Add Nectar Card'as complete when the user skip adding the Nectar card from the LID > Add Nectar Card launch screen > Add Nectar Card screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user taps on delete in delete your account screen
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on add payment method
    Then user verifies the Add Payment method screen
    When user taps on Credit Debit card in Add Payment Method screen
    Then enter name of the card
    Then enter "5232 0500 0019 0003" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    Then user clicks on continue button in Card screen
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    And user taps on back and navigates to LID
    And user is on NLID screen
    And user taps on Add nectar card link in LID
    And user clicks on the get started icon
    And user taps on cancel button in the add nectar card screen from Profile completion
    And user taps on cancel button in the add nectar card launch screen from Profile completion
    And user taps on the complete profile
    And user clicks on Add nectar
    Then user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-32403 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2323
  Scenario: Google Sign In Registration->Verify whether the app marks the profile completion task 'Add Nectar Card' as complete when the user skip adding the Nectar card from the Payment details Screen>Add Nectar Card screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user taps on delete in delete your account screen
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on add payment method
    Then user verifies the Add Payment method screen
    When user taps on Credit Debit card in Add Payment Method screen
    Then enter name of the card
    Then enter "5232 0500 0019 0003" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    Then user clicks on continue button in Card screen
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    And user taps on back and navigates to LID
    And user is on NLID screen
    When user taps on fuel icon and start fuelling button
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And Click on Change payment link
    And user adds the Nectar card details by clicking the Add nectar card in Payment details screen
    Then user is navigated to add nectar screen
    And user taps on cancel button in the add nectar card screen from Profile completion
    When the user taps on continue button in the Payment Details Screen
    When user taps on cancel button in the bottom of the screen
    Then user validates the cancel transaction popup
    When user taps on cancel trasaction button in the cancel transaction popup
    Then user navigates back to the LID screen
    And user taps on the complete profile
    And user clicks on Add nectar
    Then user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-33092 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprint2322_23__ @SprintiOS2323
  Scenario: Google Sign in Registration->Verify whether the app marks the profile completion task 'Add Nectar Card' as complete when the user skip adding the Nectar card from the Transaction Complete screen > Do you have a Nectar Card?->Add Nectar Card screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user taps on delete in delete your account screen
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on add payment method
    Then user verifies the Add Payment method screen
    When user taps on Credit Debit card in Add Payment Method screen
    Then enter name of the card
    Then enter "5232 0500 0019 0003" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    Then user clicks on continue button in Card screen
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    And user taps on back and navigates to LID
    And user is on NLID screen
    When user taps on fuel icon and start fuelling button
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
#    When user lands on card verification screen
#    And enter valid password and click on submit button
#    Then user is navigated to start fueling now screen
#    And then to now fueling
    And user verify the Transaction Complete screen
    Then validate add nectar card button displayed in transaction complete screen
    And user adds the Nectar card details by clicking the Add nectar card in Transaction Complete screen
    Then verify the Add nectar card screen
    And user taps on cancel button in the Do you have a Nectar card screen
    Then user tap on Done button in Transaction Complete screen
    And close the thank you screen if displayed
    And user taps on the complete profile
    And user clicks on Add nectar
    Then user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-33160 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2324
  Scenario: GoogleSSO Registration->Verify whether the app marks the profile completion task 'Add Nectar Card' as complete when the user skip adding the Nectar card from the Transaction Complete screen > Do you have a Nectar Card?->Add Nectar Card screen>Yes, Add Now
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user taps on delete in delete your account screen
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on add payment method
    Then user verifies the Add Payment method screen
    When user taps on Credit Debit card in Add Payment Method screen
    Then enter name of the card
    Then enter "5232 0500 0019 0003" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    Then user clicks on continue button in Card screen
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    And user taps on back and navigates to LID
    And user is on NLID screen
    When user taps on fuel icon and start fuelling button
    And user is navigated to Select your pump screen
    And user selects pump number "3" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
#    When user lands on card verification screen
#    And enter valid password and click on submit button
#    Then user is navigated to start fueling now screen
#    And then to now fueling
    And user verify the Transaction Complete screen
    Then validate add nectar card button displayed in transaction complete screen
    And user adds the Nectar card details by clicking the Add nectar card in Transaction Complete screen
    Then verify the Add nectar card screen
    And user taps on Yes add now button from add nectar card screen
    And user taps on cancel button in the Do you have a Nectar card screen
    Then user tap on Done button in Transaction Complete screen
    And close the thank you screen if displayed
    And user taps on the complete profile
    And user clicks on Add nectar
    Then user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-13105 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Verify Account screen UI and Alignment ,after adding Nectar Card
    And user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "chibisakkrava.d+"
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
    And user verifies Add Nectar card section
    Then Add and verify Nectar card

#=======================================================================
#  @P11270-14157 @AndroidRegressionR2211 @iOSRegressionR2211 1
#  Scenario: Verify correct CT is displayed on modal pop up on station details page with site specific offer when customer is logged in and nectar card is added but not verified
#    Given user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And navigate to the Nectar card section
#    And Delete the Nectar card if it is present
#    And Add the Nectar card
#    Then user taps on Station Finder
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the Got it popup before the Station details screen
#    And user should see the copy text displayed on the modal pop"Verify your Nectar card to see exclusive offers!" up in station finder for logged in user with non verified nectar
#    Then tap on close
  #
#  @P11270-14217 @AndroidRegressionR2211 @iOSRegressionR2211 1
#  Scenario: Verify correct CT is displayed on modal pop up on station details page with site specific offer when customer is logged in but nectar card not added or verified
#    Given user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And navigate to the Nectar card section
#    And Delete the Nectar card if it is present
#    Then user taps on Station Finder
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the Got it popup before the Station details screen
#    And user should see the copy text displayed on the modal pop"Add your Nectar card to see exclusive offers and collect points with every fill!" up in station finder for logged in user with non verified nectar
#    Then tap on close
#
#  @P11270-14143 @AndroidRegressionR2211 @iOSRegressionR2211 1
#  Scenario: Verify the frequency of the modal pop up on the site station finder detail screen
#    When user log out from the app if logged in
#    Then user taps on Station Finder
##    Then user clicks on continue button in station screen
##    And allow location access
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the Got it popup before the Station details screen
#    And user should see the copy text displayed on the modal pop"See current promotions and rewards when you log into the app!" up in station finder for logged in user with non verified nectar
#    Then tap on Got It
#    When navigate back to "station list" page
#    Then user selects a station from the list
#    And user should not see the Model popup in station detais
#    When navigate back to "station list" page
#    Then user selects a station from the list
#    And user should not see the Model popup in station detais
#    When navigate back to "station list" page
#    Then user selects a station from the list
#    And user should not see the Model popup in station detais
#    When navigate back to "station list" page
#    Then user selects a station from the list
#    And user should not see the Model popup in station detais
#    When navigate back to "station list" page
#    Then user selects a station from the list
#    And user should see the copy text displayed on the modal pop"See current promotions and rewards when you log into the app!" up in station finder for logged in user with non verified nectar
##    And user should see the copy text displayed on the modal pop"Verify your Nectar card to see exclusive offers!" up in station finder for logged in user with non verified nectar
#    Then tap on Got It
#
  #
#  #Prerequisite:user should already visited 5 times the modal pop up
#  @P11270-12436 @iOSRegressionR2211 @AndroidRegressionR2211 1
#  Scenario: Verify Logged in user every visit counted after 5 time visiting the modal pop up
#    When user is on NLID screen
#    When user navigates to LID screen for the 5nth time
#    Then verify if a modal pop with the Nectar logo and Static firework image is displayed
#
#  @P11270-14139 @AndroidRegressionR2211 @iOSRegressionR2211 1
#  Scenario: Verify user able to see a modal pop up on station details page with site specific offer when user has loyalty added and verified in his account
#    When user is on NLID screen
#    Then user taps on Station Finder
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the popup before the Station details screen
#    And user should see the copy text displayed on the modal pop and the View Details Button
#    Then tap on close
#
#
  #  @P11270-14219 @iOSRegressionR2211 @AndroidRegressionR2211 1
#  Scenario: Verify user should be able to see a modal pop up on station details page with site specific offer
#    When user log out from the app if logged in
#    Then user taps on Station Finder
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the Got it popup before the Station details screen
#    And user should see the copy text displayed on the modal pop"See current promotions and rewards when you log into the app!" up in station finder for logged in user with non verified nectar
#    Then tap on Got It
#    Then verify user is in the Station details screen
#
#  @P11270-14218 @iOSRegressionR2211 @AndroidRegressionR2211 1
#  Scenario: Verify correct CT is displayed on modal pop up on station details page with site specific offer when customer is not logged in
#    When user log out from the app if logged in
#    Then user taps on Station Finder
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the Got it popup before the Station details screen
#    And user should see the copy text displayed on the modal pop"See current promotions and rewards when you log into the app!" up in station finder for logged in user with non verified nectar
#    Then tap on close
#    Then verify user is in the Station details screen
#
  #   @P11270-13126 @AndroidRegressionR221d
#  Scenario: Account :  Account screen UI and Alignment ,Before adding Nectar Card
##    Given user is on NLID screen
##    Then user is in login screen
##    When I enter "Offer3" in login details
##    And user taps login button in login screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then tap on add nectar card from account screen
#    Then user is navigated to add nectar screen
#    And enter nectar card value and tap on next button
#    Then user tap on verify later
##    And validate Verify later screen
###    Then Validate skip click on skip button
#    And validate added nectar card in account
#    Then delete added nectar card

#  @P11270-13176 @AndroidRegressionR221d @iOSRegressionR2i21
#  Scenario: LID -Add Nectar card from LID and verify Nectar card get rewards
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer1" in login details
#    Then user taps login button in login screen
#    When user tap on learn more link in LID screen
#    Then user is navigated to add nectar screen
#    And enter random nectar card value and tap on next button
#    Then user is navigated to Verify nectar screen
#    Then user enters valid nectar details in verify nectar screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And delete added nectar card

#  @P11270-13151 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Sprint 2 - Payoutside : Verify Transaction Complete screen for "Added nectar card.. " message
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer2" in login details
#    And user taps login button in login screen
#    When user lands on LID screen after successful Login
#    When user taps on start button in LID
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms the payment
#    Then user lands on authorize payment screen
#    Then user is navigated to start fueling now screen
#    And then to now fueling
#    Then validate add nectar card button displayed in transaction complete screen

#  @P11270-13152 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Offers- Load to Card : View the balance point in offers screen 1 When  points are accumulated
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "StationOffer3" in login details
#    And user taps login button in login screen
#    When user lands on LID screen after successful Login
#    When user taps on Offers
#    Then validate nectar card number and point balance in offers screen

#  @P11270-13164 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Daisy Phase 2 Esso App: From Offers screen " Add Nectar Card" and Verify card
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer2" in login details
#    And user taps login button in login screen
#    When user taps on Offers
#    And validate offer details in offers screen
#    When user tap on add nectar button in offers screen
#    Then user is navigated to add nectar screen
#    And enter nectar card value and tap on next button
#    Then user is navigated to Verify nectar screen
#    Then user enters valid nectar details in verify nectar screen
#    Then validate nectar card number and point balance in offers screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And delete added nectar card

#  @P11270-13167 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: LID- Nectar Card not verified /Vaulted to the account
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer1" in login details
#    Then user taps login button in login screen
#    When user tap on learn more link in LID screen
#    Then user is navigated to add nectar screen
#    And enter nectar card value and tap on next button
#    Then user is navigated to Verify nectar screen
#    Then user enters valid nectar details in verify nectar screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And delete added nectar card

#  @P11270-13170 @AndroidRegression1 @iOSRegressionv @Offers_Android
#  Scenario: Esso Daisy Phase 2 : Offers enabled  for Daisy
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "StationOffer3" in login details
#    And user taps login button in login screen
#    When user lands on LID screen after successful Login
#    Then user taps on Offers
#    Then tap on your nectar card link in offers screen
#    And user should see the digital nectar card

#  @P11270-13172 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Esso Daisy Ph2 : Offers screen Verify the Digital Card
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "StationOffer3" in login details
#    And user taps login button in login screen
#    When user lands on LID screen after successful Login
#    Then user taps on Offers
#    Then tap on your nectar card link in offers screen
#    And user should see the digital nectar card
#    Then close the digital nectar card

#  @P11270-13174 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Station Finder : "Nectar Points" is selected along with one other filters button  "APPLY 1 FILTER" should be displayed
#    Given user is on NLID screen
#    Then user taps on Station Finder
#    Then user clicks on continue button in station screen
#    When user tap on filter icon
#    Then select a filter option
#    And validate apply filter button

#  @P11270-13177 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Daisy Ph2 -Sprint 2: Verify the Point balance on offers screen
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "StationOffer3" in login details
#    And user taps login button in login screen
#    When user lands on LID screen after successful Login
#    Then user taps on Offers
#    Then validate nectar card number and point balance in offers screen

#  @P11270-13189 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Offers- Load to card - Latest Offers & coupons Screen
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer3" in login details
#    And user taps login button in login screen
#    When user lands on LID screen after successful Login
#    Then user taps on Offers
#    And validate offers displayed in offer screen

#  @P11270-13191 @AndroidRegression1 @iOSRegression
#  Scenario: Offers- Load to Card : View the balance point in offers screen 1 When no points are accumulated
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "StationOffer2" in login details
#    And user taps login button in login screen
#    When user lands on LID screen after successful Login
#    Then user taps on Offers
#    Then validate point balance as nill in offers screen when user has no points

#  @P11270-15916 @P11270-13134 @iOSRegression @Offers_Android
#  Scenario: Offers - Newly added and verify the Nectar card
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer1" in login details
#    And user taps login button in login screen
#    When user taps on Offers
#    And validate offer details in offers screen
#    When user tap on add nectar button in offers screen
#    Then user is navigated to add nectar screen
#    And enter nectar card value and tap on next button
#    Then user is navigated to Verify nectar screen
#    Then user enters valid nectar details in verify nectar screen
#    Then validate nectar card number and point balance in offers screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And delete added nectar card


#  @P11270-13132 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Account :  Account- Add nectar Card from account screen ( User enters wrong and then correct card number while verifying nectar card)
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer3" in login details
#    And user taps login button in login screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then tap on add nectar card from account screen
#    Then user is navigated to add nectar screen
#    And enter nectar card value and tap on next button
#    Then user is navigated to Verify nectar screen
#    Then user enters valid nectar details in verify nectar screen
#    And validate added nectar card in account
#    Then delete added nectar card
#    And validate if user sees add nectar card button after deleting nectar

#  @P11270-13133 @AndroidRegression1 @iOSRegression -er
#  Scenario: Offers - Verify the nectar card on existing card number
#    When user log out from the app if logged in
#    When user taps on register button from Login screen
#    And user enters "Testessoapp2021+" in the registration details
#    And click the check box for accept
#    And click on continue button from register screen
#    When user tap on Skip button
#    Then the system should display Skip warning popup
#    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
#    When user taps on Offers
#    And user check whether find more about nectar link is available in the offers details screen
#    When user tap on add nectar button in offers screen
#    Then user is navigated to add nectar screen
#    When user taps on the next button in 'Add Nectar Card' screen without entering the nectar card
##    Then user verifies the inline error message for empty nectar card number field
#    And enter nectar card value and tap on next button
#    And click the continue button under 'Nectar card added successfully' screen
##    Then user is navigated to Verify nectar screen
#    Then user enters valid nectar details in verify nectar screen
#    Then validate nectar card number and point balance in offers screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And delete added nectar card

#  @P11270-13119 @AndroidRegression1 @iOSRegression -er
#  Scenario: Verify Nectar card when user enters incorrect card id and later enters valid card id on verifying process
#    Given user is on NLID screen
#    Then user is in login screen
#    And I enter "smokecredentials1" in login details
#    And user taps login button in login screen
#    When user tap on learn more link in LID screen
#    Then user is navigated to add nectar screen
#    And enter random nectar card value and tap on next button
#    Then user is navigated to Verify nectar screen
#    Then user enters valid nectar details in verify nectar screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And delete added nectar card

#  @P11270-13142 @AndroidRegression1 @iOSRegression -duplicatw
#  Scenario: Sprint 2 Pay outside : Complete the fuelling transaction without verifying nectar card and Verify the Transaction complete screen
#    Given user is on NLID screen
##    Then user is in login screen
##    When I enter "Offer2" in login details
##    And user taps login button in login screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And navigate to the Nectar card section
#    And Delete the Nectar card if it is present
#    Then tap on add nectar card from account screen
##    Then user is navigated to add nectar screen
#    And enter nectar card value and tap on next button
#    Then user tap on verify later
#    And validate Verify later screen
#    Then Validate skip click on skip button
#    And validate added nectar card in account
#    And user taps on More button in tab bar
#    When user tap on LID screen
#    When user taps on start button in LID
#    Then user clicks on continue button in station screen
#    And allow location access
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms the payment
#    Then user lands on authorize payment screen
#    Then user is navigated to start fueling now screen
#    And then to now fueling
#    Then tap on verify nectar screen from transaction complete screen
#    Then user is navigated to Verify nectar screen
#    Then user enters valid nectar details in verify nectar screen
#    Then user taps on done button after finishing fuelling
#    And close the thank you screen if displayed
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then delete added nectar card



#  @P11270-13152 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Offers- Load to Card : View the balance point in offers screen 1 When  points are accumulated
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "StationOffer3" in login details
#    And user taps login button in login screen
#    When user lands on LID screen after successful Login
#    When user taps on Offers
#    Then validate nectar card number and point balance in offers screen

#  @P11270-13170 @AndroidRegression1 @iOSRegressionv @Offers_Android
#  Scenario: Esso Daisy Phase 2 : Offers enabled  for Daisy
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "StationOffer3" in login details
#    And user taps login button in login screen
#    When user lands on LID screen after successful Login
#    Then user taps on Offers
#   Then tap on your nectar card link in offers screen
#    And user should see the digital nectar card

#  @P11270-13189 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Offers- Load to card - Latest Offers & coupons Screen
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer3" in login details
#    And user taps login button in login screen
#    When user lands on LID screen after successful Login
#    Then user taps on Offers
#    And validate offers displayed in offer screen



#  @P11270-13132 @AndroidRegression1 @iOSRegression @Offers_Android
#  Scenario: Account :  Account- Add nectar Card from account screen ( User enters wrong and then correct card number while verifying nectar card)
#    Given user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer3" in login details
#    And user taps login button in login screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then tap on add nectar card from account screen
#    Then user is navigated to add nectar screen
#    And enter nectar card value and tap on next button
#    Then user is navigated to Verify nectar screen
#    Then user enters valid nectar details in verify nectar screen
#    And validate added nectar card in account
#    Then delete added nectar card
#    And validate if user sees add nectar card button after deleting nectar



#  @P11270-13172 @AndroidRegression1 @iOSRegressionR22j1 -10000
#  Scenario: Esso Daisy Ph2 : Offers screen Verify the Digital Card
#    Given user is on NLID screen
#    Then user taps on Offers
#    Then tap on your nectar card link in offers screen
#    And user should see the digital nectar card
#    Then close the digital nectar card

#  @P11270-11505  @AndroidRegressionR221d
#  Scenario: Verify App to display the Nectar points on LID screen in a new animated format
##    When user log out from the app if logged in
##    Then user is in login screen
##    When I enter "profileCompleted" in login details
##    And user taps login button in login screen
#    When user is on NLID screen
#    Then verify nectar points displayed on LID

#  @P11270-16024 @AndroidRegressionR221d
#  Scenario: Verify the Nectar card Localisation of points balance to include thousands separator
##    When user log out from the app if logged in
##    Then user is in login screen
##    And I enter "profileCompleted" in login details
##    And user taps login button in login screen
#    Given user is on NLID screen
#    Then verify nectar points comma separator on LID
#    Then user taps on Offers
#    Then verify nectar points comma seperator on offers screen
#    Then user taps on fuel icon and navigate to LID screen
#    Given user is on NLID screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user clicks on continue button in pump screen
#    And the user is navigated to the Redemption screen
#    And verify nectar points comma seperator on redemption screen

#  @P11270-13175 @AndroidRegressionR221d
#  Scenario: Verify the Point balance on Choose Redeem offers screen
##    When user log out from the app if logged in
##    Then user is in login screen
##    And I enter "profileCompleted" in login details
##    And user taps login button in login screen
#    Given user is on NLID screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user clicks on continue button in pump screen
#    And the user is navigated to the Redemption screen
#    And verify nectar points comma seperator on redemption screen

#  @P11270-13143 @AndroidRegression1 @iOSRegressionv @Offers_Android @AndroidRegressionR221d
#  Scenario: Sprint 2 Redemption Offers : CHOOSE AN OPTION OR CONTINUE - by choosing highlighted offer will apply on to the fuelling
##    When user log out from the app if logged in
##    Then user is in login screen
##    When I enter "profileCompleted" in login details
##    And user taps login button in login screen
#    When user is on NLID screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user clicks on continue button in pump screen
#    And the user is navigated to the Redemption screen
#    Then verify if user is able to select any offer and continue
#    And user verify the MFA screen
#    And user tap on Continue button in MFA screen
#    Then the user is navigated to Confirm payment screen
#    Then verify if reward is updated in confirm payment screen
#    And user confirms the payment
#    Then the system should display the authorization screen
#    Then user checks the details in the transaction summary screen
#    Then Verify the loyalty discount amount is not zero
#    Then Tap on Transaction Details link in Transaction Complete Screen
#    Then Verify the loyalty discount amount is not zero

  #    #Prerequisite:user should already visited LID screen (5N-1 times). This login should result in a multiple of 5th count visit to LID
#  @P11270-12316 @iOSRegressionR221a @AndroidRegressionR221d
#  Scenario: Verify Logged in user should able to see a modal pop up when loyalty is on-boarded
#    When user log out from the app if logged in
#    Then user is in login screen
#    And I enter "regressioncredentials12" in login details
#    And user taps login button in login screen
#    Then verify if a modal pop with the Nectar logo and Static firework image is displayed
#    When user tap on View Details Button in the Modal popup in LID
#    Then validate nectar card number and point balance in offers screen