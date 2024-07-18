@SmokeTestEndtoEnd

Feature: Smoke test cases for end to end

  @P11270-22898 @iOSSmoke @AndroidSmoke
  Scenario: Complete the Fuelling transaction with paypal and verify the Transaction Details screen
#    When user log out from the app if logged in
#    And user clicks on Login Icon
#    And I enter "smokecredentials1" in login details
#    And user taps login button in login screen
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then user verify the confirms the payment screen
    When user confirms card payment
    When user lands on authorize payment screen
    Then user is navigated to start fueling now screen
    And then to now fueling
    And user verify the Transaction Complete screen
    When user taps on Transaction Details Link in the Transaction Complete Screen
    Then user verify the Transaction Details screen
    When user tap on back button in the transaction Details screen
    Then verify if the user is navigated to the Transaction Complete Screen
    Then user tap done in the Transaction Complete screen

  @P11270-38593 @iOSSmoke @AndroidSmoke @R123
  Scenario: LID -Manual user- Verify that wether app  dismiss the broadcast banner on NLID without the user interaction
    When user verifies the broadcast banner
    Then user confirms the banner board is not present

  @P11270-36995 @iOSSmoke @AndroidSmoke @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in LID state
    When user is on NLID screen
    Then user validates that the app assistant is not present

  @P11270-25582 @iOSSmoke @AndroidSmoke
  Scenario: Verify the paypal email id is masked
    When user is on NLID screen
    And user clicks on more icon
    Then user clicks on Account
    Then user verifies paypal email id with masked

  @P11270-35160 @iOSSmoke @R322
  Scenario: Verify whether App displays the' CLICK HERE TO FUEL' button CT on the LID screen
    When user is on NLID screen
    Then user verifies the updated CT in the start button

  @P11270-36996 @iOSSmoke @AndroidSmoke @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in NLID state
    When user log out from the app if logged in
    Then user validates that the app assistant is not present

  @P11270-38591 @iOSSmoke @AndroidSmoke @R223
  Scenario: NLID - Verify that wether app  dismiss the broadcast banner on NLID without the user interaction
    When user verifies the broadcast banner
    Then user confirms the banner board is not present

  @P11270-22886 @iOSSmoke @AndroidSmoke
  Scenario: Verify the contextual registration screen
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
    Then App should navigates to Confirm your email address screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review

  @P11270-32156 @AndroidSmoke @iOSSmoke
  Scenario:Check the profile completion content
    When user is on NLID screen
    And user taps on the complete profile
    Then user clicks on Add nectar
    And user taps on cancel button in the add nectar card launch screen from Profile completion
    Then user clicks on Add nectar
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-30621 @AndroidSmoke @iOSSmoke
  Scenario: Verify whether application is not displaying add mobile number task in Account screen for manual registraion
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user confirms the mobile number field is not present in the account screen

  @P11270-30619 @AndroidSmoke @iOSSmoke
  Scenario: Verify whether application is not displaying add mobile number task in manual Profile completion Screen
    When user is on NLID screen
    And user taps on the complete profile
    Then user confirms the mobile number field is not present in the Completes your profile screen

  @P11270-22902 @AndroidSmoke
  Scenario:Check the profile completion content
    When user is on NLID screen
    And user taps on the complete profile
    And user verifies the "Completes your profile" screen
    Then user verifies the completed Accept privacy and Terms task
    And user verifies the completed Set First Name and Last Name task
    And user verifies the completed Notifications task
    When user navigates to the top of the screen in Complete your profile screen
    Then user verifies the User Profile section in Complete your profile screen
    Then user verifies permission settings in the Complete your profile screen
    Then user verifies Email settings in the Complete your profile screen
    Then user verifies Payment and Loyalty in the Complete your profile screen

  @P11270-28013 @iOSSmoke @AndroidSmoke
  Scenario:Verify Esso app should not display the ‘Scan your card button’ on the Add Debit/Credit Card screen
    When user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user verifies that the Scan your card button is not present

  @P11270-35346 @iOSSmoke @AndroidSmoke @R322
  Scenario: Manual User  - Verify that whether the app is displaying updated design of the payment method section in the Account screen when a payment method is not added
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
#    Then user tap on add card button in account
#    Then user verifies the Add Payment method screen
    Then user verifies payment method section in account screen when payment method is not added

  @P11270-28442 @iOSSmoke @AndroidSmoke
  Scenario:App should allow the Manual user to register again with the deleted account
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user takes the mail id of the user
    And user taps on delete your account in account screen
    And user verifies the delete your account screen
    And user taps on delete in delete your account screen
    And user verifies the delete your account popup
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    And user enter the auto generated mail after deleting the user
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review

  @P11270-28437 @iOSSmoke @AndroidSmoke
  Scenario:Should be able to delete the Manual User Esso Account
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user takes the mail id of the user
    And user taps on delete your account in account screen
    And user verifies the delete your account screen
    And user taps on delete in delete your account screen
    And user verifies the delete your account popup
    And tap on Ok Button
    Then user verifies the app redirects back to NLID

  @P11270-22888 @iOSSmoke @AndroidSmoke
  Scenario: Check whether the user is able to Save password for the registered user and validate the saved password getting displayed
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on the continue button in registration screen
    And validate the OS Native password pop up
    When user clicks the save password button
    Then App should navigates to Confirm your email address screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps LogOut button in Account screen
    And user clicks on Login Icon
    When user taps on email tab
    And user checks the suggestions on the keyboard
    And user clicks the mail suggestion from the keyboard
    Then user validates the password getting displayed

  @P11270-30618 @AndroidSmoke @iOSSmoke
  Scenario: Verify whether application is not displaying add mobile number task in manual registration flow.
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    And user confirms the mobile number field is not present in the registration screen

  @P11270-22887 @iOSSmoke @AndroidSmoke
  Scenario: Check whether the user is not able to Save password for the registered user
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on the continue button in registration screen
    And validate the OS Native password pop up
    When user clicks the Not now button
    Then App should navigates to Confirm your email address screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review

  @P11270-32185 @AndroidSmoke @iOSSmoke
  Scenario:Check the profile completion content
    When user is on NLID screen
    And user taps on the complete profile
    And user verifies the "Completes your profile" screen
    Then user clicks on Add nectar
    And user clicks on the get started icon
    And user taps on cancel button in the add nectar card screen from Profile completion
    Then user clicks on Add nectar
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-22903 @iOSSmoke @AndroidSmoke
  Scenario: Check the profile completion after adding payment, Nectar and MFA
    When user is on NLID screen
    And user taps on More button in tab bar
    Then user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    And user enters the card details "5426 0640 0042 5125" in Billing Screen except fingerprint checkbox
    Then user clicks on continue button in Card screen
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    Then user verifies the success set Default payment popup
    And user verifies the account page
    Then user clicks on edit in the added payment method
    And user should verify the last four digit of card number
    When Tap the cancel button
    And user verifies Add Nectar card section
    Then Add and verify Nectar card

  @P11270-22894 @iOSSmoke @AndroidSmoke
  Scenario: System to navigate user to ‘Forgot Password’ screen when user tap on ‘Forgot your password’ link
    When user is on NLID screen
    And user clicks on more icon
    Then user clicks on Account
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
#    And Enter pin
#    Then user verifies the popup and clicks on ok button
#    And user skips the biometrics screen if present
#    And user enters the card details in Billing Screen except fingerprint checkbox
    And user enters the card details "5426 0640 0042 5133" in Billing Screen except fingerprint checkbox
    And tap on continue button in add payment screen
    Then validate success screen for added card
    And user verifies the account page
    And user Tap Edit button
    And User click the Forgot your PIN link
    And User able to verify the CT label
    Then user click the Forgot your pwd link
    Then user should verify the title Forgot pwd
    Then user should verify the CT label and clicks on send button
    And validate the CT 'Reset your password' and tap on OK button
    Then user verifies the app redirects back to NLID

  @P11270-22904 @iOSSmoke @AndroidSmoke
  Scenario: Check the profile completion after adding Mobile, Email Preferences and Location Services
    When user log out from the app if logged in
    And user clicks on Login Icon
    And I enter "smokecredentials2" in login details
    And user taps login button in login screen
    And user verifies the fifty percent in indicator
    And user taps on the complete profile
    When user taps on the Email Preferences in Complete your profile screen
    And user verifies the Email Preferences screen
    And user taps on the accept email preferences
    And User taps on Continue button in the email preferences screen
    Then user verifies whether the email preferences task is completed
    And User taps on Continue button in the email preferences set successfully screen
    Then user taps on location services and confirm whether it is completed
    And user taps on back and navigates to LID

  @P11270-35349 @iOSSmoke @AndroidSmoke @R322
  Scenario: Manual User - Verify that whether the app is displaying the updated design of the payment
  method section in the Account screen when a payment method is added
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user verifies the payment method section with a card

  @P11270-22891 @iOSSmoke @AndroidSmoke
  Scenario: Check whether the user is able to navigate to the Station details screen from LID
    When user is on NLID screen
    Then user taps on Station Finder
    Then system navigates to the Esso Station Finder Screen
    When user clicks on the search field in the Esso Station Finder Screen
    When user enters search term in station finder
    Then verify if the Mobile pay stations is selected by default
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    And user selects a station from the list
    Then verify user is in the Station details screen
    When user clicks on Save Station button for the first time
    Then user verify the favourite Station
    And user selects a station from the list
    Then verify if the Station is saved
#    When user clicks on Save Station button
    Then user clicks on the Saved Station
    And verify if the Station is unsaved
    When user taps on back button in Station Details screen
    Then the system navigates to the Esso Finder Screen

  @P11270-22899 @iOSSmoke @AndroidSmoke
  Scenario: Offers - Newly added and verify the Nectar card
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    When user taps on Offers
    And validate the offers screen before adding the nectar card
    When user taps on 'More about collecting points'link in the offers screen
    Then validate the popup which displays 'How to collect points' in detail and close the popup
    When user taps on 'Get Exclusive offers' in the offers screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    Then enter "NectarCardAddAndVerify" Nectar card number and password
    Then validate offers displayed in offer screen
    And validate nectar card number and point balance in offers screen

  @P11270-25273 @iOSSmoke @AndroidSmoke
  Scenario: Verify that system should not display the Maximum Fuelling Amount link on site checkin screen
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling

  @P11270-25280 @iOSSmoke @AndroidSmoke
  Scenario: Verify that System should allow the user to change the MFA ruler units
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen

  @P11270-22901 @iOSSmoke @AndroidSmoke
  Scenario: Offers - Verify the nectar card
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    When user taps on Offers
    And validate the offers screen before adding the nectar card
    And user check whether find more about nectar link is available in the offers details screen
    When user tap on add nectar button in offers screen
    Then user is navigated to add nectar screen
    When user taps on the next button in 'Add Nectar Card' screen without entering the nectar card
    Then user verifies the inline error message for empty nectar card number field
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    Then enter "NectarCardAddAndVerify" Nectar card number and password
    Then validate offers displayed in offer screen
    And validate nectar card number and point balance in offers screen

  @P11270-35251 @iOSSmoke @AndroidSmoke @R322
  Scenario: Verify The app should display the Clear Filter button on the Filter by screen. (Manual Registered User)
    When user is on NLID screen
    And user taps on Station Finder
    And user tap on filter icon
    Then user verifies the apply and clear all button

  @P11270-35266 @iOSSmoke @AndroidSmoke @R322
  Scenario: The app should allow the user to apply the filter without selecting any of the filters on the Filter by screen. (Manual Registered User)
    When user is on NLID screen
    And user taps on Station Finder
    And user tap on filter icon
    When taps on any of the services and facilities
    When user clicks on Apply filter button
    Then the system navigates to the Esso Station Finder Screen
    When user tap on filter icon
    And user unselects the selected filters
    Then user verify the Clear all is disabled and apply is enabled
    When user clicks on Apply filter button
    Then the system navigates to the Esso Station Finder Screen
    And user verifies that the filter is not applied

   @P11270-22905 @iOSSmoke @AndroidSmoke
  Scenario: Verify the updated password rules
     When user is on NLID screen
     And user clicks on more icon
     Then user clicks on Account
     When user taps on edit usr pwd
     And Verify the change password screen
     And user taps on new Password Field
     Then user verifies the updated password rules

  @P11270-22907 @iOSSmoke @AndroidSmoke
  Scenario: Check whether System to display tab bar only in landing screen of following features
    When user is on NLID screen
    Then verify the Tab bar at the bottom of App UI screen
    And user navigates to Fuel Finder screen and Verify
    And verify the Tab bar at the bottom of App UI screen
    And user taps on More button alone
    Then user verifies whether landed on the Extended Tab bar
    And verify the Tab bar at the bottom of App UI screen
    Then user verifies whether landed on the Extended Tab bar
    When user navigates to Products and Information screen
    Then verify the about Esso fuel products & Information
    And user verifies the back button in the top left corner
    And verify the Tab bar at the bottom of App UI screen
    When user tabs on back button
    Then user verifies whether landed on the Extended Tab bar
    When user navigates to Account screen
    Then user verifies the back button in the top left corner
    And verify the Tab bar at the bottom of App UI screen
    When user tabs on back button
    Then user verifies whether landed on the Extended Tab bar
    When user taps on Support Centre icon
    Then verify the Tab bar at the bottom of App UI screen
    And user verifies the back button in the top left corner
    When user tabs on back button
    Then user verifies whether landed on the Extended Tab bar
    When user taps on Tell a Friend
    Then verify the Tab bar at the bottom of App UI screen
    And verify system navigating to Refer a Friend screen

  @P11270-22906 @iOSSmoke @AndroidSmoke
  Scenario: Validate the FAQ screen when the user is logged in
    When user is on NLID screen
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    And User click on the Frequently asked Question link
    Then Validate the header of Frequently asked Question title "Frequently Asked Questions"
    And Validate all the Frequently Asked Question Header
      | How the app works |
      | Payments & Billing |
      | Safety and Security |
      | Loyalty Points |
      | Benefits of Using the Esso App |
      | Technical |
      | Communications & Data Privacy |
    When user tabs on back button in the Faq screen
    Then validate the Support Centre page options

  @P11270-29668 @iOSSmoke @AndroidSmoke
  Scenario:Verify the app is displaying the updated error message in Edit password screen
    When user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters the current password from the "smokecredentials2"
    And user enters the new password from the "smokecredentials2"
    And user enters the confirm password from the "smokecredentials2"
    And user tap on Done button
    Then user verifies the updated error message when same password is used
    And Tap on OK button in the popup

  @P11270-29490 @iOSSmoke @AndroidSmoke
  Scenario:App should display the updated password rule no 1(At least 10 characters) on the Edit Password screen
    When user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user taps on new Password Field
    Then user verifies the updated password rules in Edit Password screen

  @P11270-29492 @AndroidSmoke
  Scenario:App should display an inline error message when the user enters a password of fewer than 10 characters
    When user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enter the "IncorrectPwd" in new password and verify the values
    Then user tap on Done button
    Then user verifies the validation message in the Password section in Edit Password screen

  @P11270-25284 @iOSSmoke @AndroidSmoke
  Scenario:Check whether user should see different variations of offers in different sites under the same Brand Wholesaler in Offer BW screen post the fueling flow
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "4" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then user verify the confirms the payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    When user lands on card verification screen
    And enter valid password and click on submit button
    Then user is navigated to start fueling now screen
    And then to now fueling
    And user verify the Transaction Complete screen
    Then user tap done in the Transaction Complete screen
    Then user verifies is Navigated to Thank you Screen

  @P11270-22911 @iOSSmoke @AndroidSmoke
  Scenario: Verify History screen shows list of fuelling transactions
    When user is on NLID screen
    And user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    When user taps on any of the Transaction infos from list
    Then user should navigate to transaction details screen
    And user validate vat receipt view link
    Then user tap on view vat receipt and validate

  @P11270-36752 @iOSSmoke @AndroidSmoke @R123
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

  @P11270-36754 @iOSSmoke @AndroidSmoke @R123
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

  @P11270-36753 @iOSSmoke @AndroidSmoke @R123
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

  @P11270-25281 @iOSSmoke @AndroidSmoke
  Scenario: Verify that System should allow the user to change the MFA ruler units
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    And click the Save for next time
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And Tap on Maximum Fuelling amount edit button
    And user verify the Unselect Save for next time check box

  @P11270-22897 @iOSSmoke @AndroidSmoke
  Scenario: Verify whether the user is navigated to NLID when Forgot Password is tapped during fuelling flow
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen if the screen is present
    Then the user is navigated to Confirm payment screen
#    And user verify the confirms the payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the frictionless flow card and tap on update button
    And user confirms card payment
    Then user is navigated to Enter pin screen
    When User click the Forgot your PIN link
    Then User able to verify the CT label
    When user click the Forgot your pwd link
    Then user should verify the title Forgot pwd
    And user should verify the CT label and clicks on send button
    When validate the CT 'Reset your password' and tap on OK button
    Then user verifies the app redirects back to NLID

  @P11270-22900 @P11270-22895 @iOSSmoke @AndroidSmoke
  Scenario: Verify the app should be able to go back to the entry point screen when the user selects the  link after adding Nectar card from Transaction complete Screen
    Given user log out from the app if logged in
    And user taps on "Facebook" icon in the NLID
    And I enter SSO login details for "Facebook"
    Given user is on NLID screen
    And user taps on More button in tab bar
    And user navigates to Account screen
    Then delete added nectar card if exists
    When user taps on fuel icon
    Then user lands on LID screen after successful Login
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
#    Then user verify the confirms the payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the frictionless flow card and tap on update button
#    Then user verify the confirms the payment screen
    And user confirms card payment
    And Enter pin in the fuelling flow
    When user lands on authorize payment screen
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then validate add nectar card button displayed in transaction complete screen
    And tap on the Add Nectar Card button in Transaction complete Screen
    And verify the Add nectar card screen
    Then tap on Add now button in Add Nectar Card Screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    When tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen
    And click on Ok button in the modal popup in the Nectar card page
    And user lands on Verify Card Screen and taps on skip button
    Then verify if the user is in the Transaction Complete Screen with the context to verify the nectar card
#    When Tap on Transaction Details link in Transaction Complete Screen
#    Then  Verify all the fields are present in Transaction Details screen
#    When user tap on back button in the transaction Details screen
#    Then verify if the user is in the Transaction Complete Screen
    When user tap on Done button in Transaction Complete screen
    And Verify if the thank you screen is displayed
    When user kill and relaunch the app
    And user is on NLID screen
    When user taps on Offers
    Then verify if the user is navigated to Verify Offers screen

  @P11270-35396 @iOSSmoke @AndroidSmoke @R322
  Scenario: SSO User - Verify that whether the app is displaying the updated design of the payment
  method section in the Account screen when a payment method is added
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user verifies the payment method section with a card

  @P11270-35386 @AndroidSmoke @R322
  Scenario: SSO User [Android-only] - Verify that whether the app is displaying the updated design of the Add Payment Method screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user clicks on edit in the added payment method
    And user should verifies the last four digit of card number
    And  user tap on Delete Card button
    And user should verify the CT "Are you sure you want to delete this card?"
    And user should verify cancel and delete button
    When user taps on delete button in the Delete popup msg
    Then user tap on OK button from the confirmation popup
    Then Click on fuel tab
    When user taps on Add Payment button in LID
    Then user verifies the Add Payment method screen in android
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
    And tap on continue button in add payment screen
    Then validate success screen for added card

  @P11270-35379 @iOSSmoke @R322
  Scenario: SSO User [iOS-only] - Verify that whether the app is displaying the updated design of the Add Payment Method screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user clicks on edit in the added payment method
    And user should verifies the last four digit of card number
    And  user tap on Delete Card button
    And user should verify the CT "Are you sure you want to delete this card?"
    And user should verify cancel and delete button
    When user taps on delete button in the Delete popup msg
    Then user tap on OK button from the confirmation popup
    Then Click on fuel tab
    When user taps on Add Payment button in LID
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
    And tap on continue button in add payment screen
    Then validate success screen for added card

  @P11270-22896 @iOSSmoke @AndroidSmoke
  Scenario: Check whether the System displays the CT msg  when user taps on the Edit Link in the Payment method section and also Validate the Forgot password Link when user enters a wrong password
    When user log out from the app if logged in
    And user clicks on Login Icon
    And I enter "smokecredentials2" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user clicks on edit in the added payment method
    And user should verifies the last four digit of card number
    And  user tap on Delete Card button
    And user should verify the CT "Are you sure you want to delete this card?"
    And user should verify cancel and delete button
    When user taps on delete button in the Delete popup msg
    Then user tap on OK button from the confirmation popup
    And User Tap Esso PIN Edit button
    And User click the Forgot your PIN link
    And User able to verify the CT label
    Then user enters the wrong password in enter password field
    Then user tap on continue button in the Enter password screen in Edit pin flow Account screen
    Then user verify the security pop text
    Then user verify and click the ok button
    Then user verify after tap on ok button navigate to NLID screen

  @P11270-35250 @iOSSmoke @AndroidSmoke @R322
  Scenario: Verify The app should display the Clear Filter button on the Filter by screen - NLID
    When user log out from the app if logged in
    And user taps on Station Finder
    And user tap on filter icon
    Then user verifies the apply and clear all button

  @P11270-35265 @iOSSmoke @AndroidSmoke @R322
  Scenario: The app should allow the user to apply the filter without selecting any of the filters on the Filter by screen. (NLID)
    When user log out from the app if logged in
    And user taps on Station Finder
    And user tap on filter icon
    When taps on any of the services and facilities
    When user clicks on Apply filter button
    Then the system navigates to the Esso Station Finder Screen
    When user tap on filter icon
    And user unselects the selected filters
    Then user verify the Clear all is disabled and apply is enabled
    When user clicks on Apply filter button
    Then the system navigates to the Esso Station Finder Screen
    And user verifies that the filter is not applied

  @P11270-22908 @iOSSmoke @AndroidSmoke
  Scenario: Navigating to the Help Page and verifying all the components after login
    Given user log out from the app if logged in
    And user clicks on Login Icon
    And I enter "smokecredentials2" in login details
    And user taps login button in login screen
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    Then validate the Support Centre page options

  @P11270-35339 @AndroidSmoke @R322
  Scenario: Manual User [Android-only] - Verify that Whether the app is displaying the updated design
  of the Add Payment Method screen
    When user is on NLID screen
    When user taps on Add Payment button in LID
    Then user verifies the Add Payment method screen in android

  @P11270-22893 @iOSSmoke @AndroidSmoke
  Scenario: Check whether the user navigates to Add Payment Method screen with a pop up saying'Card added successfully' as per current functionality
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
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
    Then validate if user is on 3ds password screen
    When enter valid password and click on submit button
    Then validate success screen for added card

  @P11270-22880 @iOSSmoke @AndroidSmoke
  Scenario: Smoke Test - Verify the App Install and Launch of the Esso App
    Given reset the app
    Then user validates tutorial screen
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user taps on Get Started button in the tutorial screen
    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens

  @P11270-22881 @iOSSmoke @AndroidSmoke
  Scenario: Check whether the SSO and Manual Logins are accessible
    Given user is on NLID screen
    And user taps on "Twitter" icon in the NLID
    Then user verifies whether the app navigated to Twitter login screen
    And user navigates back to NLID from Twitter
    And user taps on "Facebook" icon in the NLID
    Then user verifies whether the app navigated to Facebook login screen
    When user navigates back to NLID from Facebook
    And user taps on "LinkedIn" icon in the NLID
    Then user verifies whether the app navigated to Linkedin login screen
    When user navigates back to NLID from Linkedin
    And user clicks on Login Icon
    And User taps on Login button in Login screen without entering the values
    Then Verify the inline error message during login
    And Verify the inline error message for password
    When user enters invalid email id in the Login screen
    And user taps on Login Icon in Login screen
    Then user verifies the inline error message of the invalid email address
    When Enter valid mail and tap done
    Then Verify the inline error message for password
    When Enter the wrong password and tap login
    Then Verify the popup content
    And clicks on ok button in the popup content

  @P11270-22882 @iOSSmoke @AndroidSmoke
  Scenario: Check the Forgot Password flow from Login Screen
    Given user is on NLID screen
    And user clicks on Login Icon
    And user taps on Forgot password link in login screen in NLID
    And user tabs on back button in the Forgot Password screen
    And user taps on Forgot password link in login screen in NLID
    And user enters invalid email id
    And user taps on send button in Forgot Password Screen
    Then Verify the inability to send the mail
    And User enters the "smokecredentials1" valid mail id and taps send button
    Then Verify the mail is sent

  @P11270-22883 @iOSSmoke @AndroidSmoke
  Scenario: Check the behaviour and content of the all the tabs in NLID except Help and Station Finder
    Given user is on NLID screen
    And user able to view Fuel, Station, Offers
    And History,More
    When user taps on Offers
    Then verify user is able to see login popup
    When user taps on ok button
    Then verify system navigating to login page
    When user taps on Cancel in the Login Screen
    And user taps on History
    Then verify user is able to see login popup
    When user taps on ok button
    Then verify system navigating to login page
    When user taps on Cancel in the Login Screen
    And user taps on More button alone
    Then verify the following content in tab bar
      | Tell a Friend |
      | Account |
      | Settings |
      | Products and Information |
      | Help |
    When user taps on Tell a Friend
    Then verify user is able to see login popup
    When user taps on ok button
    Then verify system navigating to login page
    When user taps on Cancel in the Login Screen
    And user taps on More button alone
    And user navigates to Products and Information screen
    Then verify the about Esso fuel products & Information
    And verify the Tab bar at the bottom of App UI screen
    And user taps on More button alone
    And user navigates to Account screen
    Then verify user is able to see login popup
    When user taps on ok button
    Then verify system navigating to login page

  @P11270-22884 @iOSSmoke @AndroidSmoke
  Scenario: Check the options in Help screen from NLID
    Given user is on NLID screen
    When user taps on More button in tab bar
    Then user taps on Support Centre icon
    And user navigates to Support Centre screen
    Then validate the Call text as Speak to a customer representative and Normal call rates apply.
    When User click on the call link
    Then verify if user click on call its navigating to dial pad screen
    When User click on the Frequently asked Question link
    Then Validate the header of Frequently asked Question title "Frequently Asked Questions"
    And Validate all the Frequently Asked Question Header
      | How the app works |
      | Payments & Billing |
      | Safety and Security |
      | Loyalty Points |
      | Benefits of Using the Esso App |
      | Technical |
      | Communications & Data Privacy |
    When user tabs on back button in the Faq screen
    Then validate user on support centre page
    And validate the Email title as Send us your questions or thoughts
    And user verifies the Youtube links
    And user verifies the Version in the help screen

  @P11270-22885 @iOSSmoke @AndroidSmoke
  Scenario: Check whether the Ascii characters are accepted in the Manual Registration screen
    When user is on NLID screen
    When user taps on Register screen
    Then user enter the "AsciiCharacters32to61" in Registration fields and verify the values
    And user enter the "AsciiCharacters62to91" in Registration fields and verify the values
    And user enter the "AsciiCharacters92to121" in Registration fields and verify the values
    And user enter the "AsciiCharacters122to126" in Registration fields and verify the values

  @P11270-22892 @iOSSmoke @AndroidSmoke
  Scenario: Check whether the user is able to use the filter icon for selecting the available services and facilities
    Given user is on NLID screen
    Then user taps on Station Finder
    When user verify the location permission screen and bypass the screen
    When user taps on any of the following using the App button
#    When user taps on Continue button in Allow Location screen
    When user tap on filter icon
    Then Verify the System is able to display the following components as part of Filter By screen
    And Verify the app display icons next to all available services and facilities
    When taps on any of the services and facilities
    Then verify if a tick mark is displayed next to the selected services
    And verify the change in Apply Filter button
    When user clicks on Apply filter button
    Then the system navigates to the Esso Station Finder Screen

  @P11270-36771 @iOSSmoke @R123
  Scenario: Verify that the application should display a back button instead of the 'Cancel' button on Add Payment Method screen (GCO - Add Payment Method screen)
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
    Then user should see cancel button at the bottom of the screen

  @P11270-37322 @iOSSmoke @AndroidSmoke @R123
  Scenario: Verify the app is displaying a 'Reject All' button on the Privacy screen during 1st time app launch
    Given reset the app
    Then Verify the Cookie page elements
    And user validates whether the Reject all button is present in the privacy screen

  @P11270-36742- @iOSSmoke @AndroidSmoke @R123
  Scenario: Verify that the should allow the user to cancel the transaction prior to payment authorisation. (Scan QR code screen)
    Given user log out from the app if logged in
    And user taps on "Facebook" icon in the NLID
    And I enter SSO login details for "Facebook"
    Given user is on NLID screen
    Then user taps on Station Finder
    When user verify the location permission screen and bypass the screen
    Then system displays the popup with the contents and tap don't allow
    Then system should display the location access for the app
    And verify whether the system navigate back to the fuel finder screen
    Then Click on fuel tab
    When user taps on start button in LID
    When user taps on cancel button in the bottom of the screen
    Then user validates the cancel transaction popup
    When user taps on cancel trasaction button in the cancel transaction popup
    Then user navigates back to the LID screen

  @P11270-36760 @iOSSmoke @R123
  Scenario: Verify that the should allow the user to cancel the transaction prior to payment authorisation. (GCO - Scan QR code screen)\
    When user log out from the app if logged in
    Then Tap on FUEL AS GUEST Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    When user taps on cancel button in the bottom of the screen
    Then user validates the cancel transaction popup
    When user taps on cancel trasaction button in the cancel transaction popup
    Then user verifies the app redirects back to NLID


#========================================================
#  @P11d270-22889 @Smoke_iOS @Smoke_Android
#  Scenario: Check whether the user is able perform fuelling with 3DS passphrase Card and User should be navigate to Thank you screen after tapping on send my receipts button
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify Location page and Select allow while using app button
#    Then Verify the Elements present in the Select your pump screen
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user select a MFA in the MFA screen
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And verify elements displayed in Add Card Screen
#    And Enter name Card Name
#    And Enter Challenge flow 3DS card Card Name
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on the Done button
#    And Verify the ready to start fuelling if displayed click on continue button
#    And Verify that Please wait screen is displayed
#    When user lands on card verification screen GCO
#    And enter valid password and click on submit button GCO
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Click on Send receipt button
#    And Click on ok button present in the receipt sent Success message screen
#    And Verify the thank you screen should be displayed
#    When User click on remind me later link in thank you screen
#    Then Verify the CT text displayed with Cancel button
#    Then Verify that User is navigate back to NLID screen
#
#  @P1d1270-22890 @Smoke_iOS @Smoke_Android
#  Scenario: Check whether the user is able perform fuelling with Frictionless Card and User should be navigate to Thank you screen after tapping on send my receipts button
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify Location page and Select allow while using app button
#    Then Verify the Elements present in the Select your pump screen
#    Then Click on Continue button in Select pumpscreen
#    Then user verify the MFA screen in GCO flow
#    When user tap on Continue button in MFA screen
#    Then Click on Add Debit or Credit Card
#    And verify elements displayed in Add Card Screen
#    And Enter name Card Name
#    And Enter name Card Number
#    And Enter name Card Exp Date
#    And Enter name Security Code
#    And Enter name PostCode
#    And Enter name Address1
#    And Enter name AddressSecond
#    And Enter name Card City
#    Then Click on the Done button
#    And Verify the ready to start fuelling if displayed click on continue button
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And Transaction Complete screen is displayed for the user
#    When Tap on Transaction Details link in Transaction Complete Screen
#    Then Verify user is navigated to Transaction Details screen
#    Then Verify all the fields are present in Transaction Details screen
#    When user taps on back Arrow from transaction details
#    Then verify user navigates to Transaction Complete screen
#    And Click on done button in transaction complete screen
#    Then Verify Send receipt screen is displayed
#    And Click on Send receipt button
#    And Click on ok button present in the receipt sent Success message screen
#    And Verify the thank you screen should be displayed
#    And Click on Close button in Thank you screen
#    Then Verify that User is navigate back to NLID screen

#  @P11d270-25290 @Smoke_iOS @Smoke_Android @R2
#  Scenario:Check whether the user should be able to see the planned maintenance pop-up on LID/NLID for the 1st time 1 week in advance of the planned maintenance date
#    Given user is on NLID screen
#    When user taps on register button from Login screen
#    Then user should be navigated to Manual Register screen
#    Then enter First Name
#    Then enter Last Name
#    Then enter "chibisakkrava.d+" Email address
#    Then enter password
#    And confirm password
#    Then click the check box for accept
#    When click on the continue button in registration screen
#    And validate the OS Native password pop up
#    When user clicks the Not now button
#    Then App should navigates to Confirm your email address screen
#    And user should see details in contextual registration screen
#    When user tap on Resend confirmation email link
#    Then the system should display the confirmation popup
#    And app to dismiss the popup when the user taps on OK button
#    When user tap on Skip button
#    Then the system should display Skip warning popup
#    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
#    And check if the planned maintenance pop up is getting displayed

#  duplicate
#  @P11d270-25281 @Smoke_iOS @Smoke_Android @Completed
#  Scenario: Verify that System should allow the user to change the MFA ruler units
#    When user is on NLID screen
#    And user taps on start button in LID
#    And validate if the user is fuelling for the first time
#    And user is navigated to Select your pump screen
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    Then user verify the confirms the payment screen

#  not in Manual smoke
#  @P11d270-22909 @Smoke_iOS @Smoke_Android
#  Scenario: Verify for guest user the updated URL to be displayed when user is tapping on FAQs link in more option
#    Given user is on NLID screen
#    And user taps on More button in tab bar
#    Then user navigates to Support Centre screen
#    And User click on the Frequently asked Question link
#    When tap on loyalty point links in FAQ
#    Then tap on Will I still earn Nectar Points if I use the app
#    And tap on FAQ hyperlink in nectar card description
#
  @P11270-22910 @iOSSmokefds @AndroidSmokeds
  Scenario: To verify that system to display a prompt, when user has given feedback or blank feedback
    When user is on NLID screen
    And user taps on More button in tab bar
    Then user taps on Support Centre icon
    When User click on the Esso App Feedback
    And User taps on Give Us more feedback
    And user give stars for First Statement
    And user give stars for Second Statement
    And user give stars for Third Statement
    And user give stars for Fourth Statement
    And click on the SEND FEEDBACK button
    Then verify the prompt message as "Thanks for your feedback."
    When Tap on OK button
    Then user navigates to Support Centre screen


  @P11270-25292 @iOSSmokefefe @AndroidSmokedf
  Scenario: Verify the system should display the following details on the 'App Assistant' chat screen.
    When user log out from the app if logged in
    Then verify if the App assistant icon is displayed
    When user taps on App assistant icon
    Then verify if the system displays the details of the App Assitant
    And user taps on close in App assistant screen
    And user clicks on Login Icon
    And I enter "smokecredentialjs2" in login details
    When user taps login button in login screen
    And verify if the App assistant icon is displayed
    When user taps on App assistant icon
    Then verify if the system displays the details of the App Assitant

  @P11270-25301 @iOSSmokefew @AndroidSmokefese
  Scenario:Verify system should expand/collapse the blue bubble when the user taps on the 'MORE' or ‘LESS'respectively
    When user is on NLID screen
    When user taps on Station Finder
    And the system navigates to the Esso Station Finder Screen
    Then verify if the App assistant icon is displayed
    When user taps on App assistant icon
    Then verify if the system displays the details of the App Assitant
    When user taps on the first topic of Pre-Authorization
    Then verify if the details related to Pre-Authorization is displayed
    When tap on MORE link in the Pre-Authorization details tab
#     Then verify if the system expands the blue bubble for content expansiom
    When tap on LESS link in the Pre-Authorization details tab
    Then verify if the system collapse the blue bubble for content contraction

  @P11270-25302 @iOSSmokefe @AndroidSmokefweef
  Scenario:Verify system should display a message if the user has initiated a keyword search without entering any copy text
    When user is on NLID screen
    When user clicks on more icon
    Then verify if the App assistant icon is displayed
    When user taps on App assistant icon
    Then verify if the system displays the details of the App Assitant
    When user taps on 'Search by keywords' field in App Assistant
    Then verify the components in the 'Search by keywords' field
    When user tap on search button in the mobile keyboard without entering any text
    Then validate if the system displays an appropriate sorry msg for the user