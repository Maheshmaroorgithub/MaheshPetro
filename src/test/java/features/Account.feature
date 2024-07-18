@Account
Feature: Account

  @P11270-11962 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprint2321_22 @SprintiOS2321
  Scenario: Verify if system updates progress of the profile completion in 'percent' format
    When user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "FrictEssoPsword" in login details
    And user taps login button in login screen
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on the Email section in the complete profile screen
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-39613 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322
  Scenario: Manual user - Verify whether app displaying ‘Google Pay’ as an available payment method in Add Payment Method screen- From Add payment popup by tapping on start fuel
    When user is on NLID screen
    When user taps on start button in LID
    Then user validates the add payment popup title and ct once taps on start fuel
    Then user taps on ok button from add payment popup
    Then verify the googlepay displayed as first payment in add payment method

  @P11270-28420 @iOSRegression @iOSSprint2411 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2414 @AndroidRegressionSet
  Scenario: The Esso app should display the option to delete the Esso app account on the Account screen for Manual User
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user verifies the Delete Your Account button in red color below the Log Out button

  @P11270-28425 @iOSRegression @iOSSprint2411 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario: The app should navigate the user to the Account Deletion confirmation screen for Manual User
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    Then user verifies the delete your account screen

  @P11270-28431 @iOSRegression @iOSSprint2411 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario: The app should navigate the user to the Account screen from Account Deletion confirmation screen for Manual User
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    Then user verifies the delete your account screen
    And user taps on Cancel from Delete Account Confirmation screen
    Then Verify the User should land on Account Screen

  @P11270-39539 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322
  Scenario: Manual user - Verify whether app displaying ‘Google Pay’ as an available payment method in Add Payment Method screen-LID payment method Link
     When user is on NLID screen
     And user validates the add payment link present in LID screen
     When user taps on add payment link present in LID screen
     Then user verifies the Add Payment method screen
     Then verify the googlepay displayed as first payment in add payment method

  @P11270-35344 @iOSRegression @iOSRegressionSet1 @SprintiOS2324
  Scenario: Manual User [iOS-only] - Verify that whether the app is displaying the updated design of the Add Payment Method screen
    When user is on NLID screen
    When user taps on start button in LID
    And user validates the add payment popup title and ct once taps on start fuel
    Then user taps on ok button from add payment popup
    Then user verifies the Add Payment method screen
    Then validate the cancel button displayed in add payment method
    Then verify the applepay displayed as first payment in add payment method
    Then verify the credit/debit card displayed as second payment in add payment method
    Then verify the paypal is displayed as third payment in add payment method

  @P11270-35342 @iOSRegression @iOSRegressionSet1 @Sprint2321_22_ @SprintiOS2322
  Scenario: Manual User [iOS-only] - Verify that Whether the app is displaying the updated design of the Add Payment Method screen
    When user is on NLID screen
    And user validates the add payment link present in LID screen
    When user taps on add payment link present in LID screen
    Then user verifies the Add Payment method screen
    Then validate the cancel button displayed in add payment method
    Then verify the applepay displayed as first payment in add payment method
    Then verify the credit/debit card displayed as second payment in add payment method
    Then verify the paypal is displayed as third payment in add payment method

  @P11270-35347 @iOSRegression @iOSSprint2410 @iOSRegressionSet1
  Scenario: Manual User [iOS-only] - Verify that whether the app is displaying updated design of the payment method section in the Account screen when a payment method is not added
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    Then user verifies the Add Payment method screen
    Then validate the cancel button displayed in add payment method
    Then verify the applepay displayed as first payment in add payment method
    Then verify the credit/debit card displayed as second payment in add payment method
    Then verify the paypal is displayed as third payment in add payment method

  @P11270-35337 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: Manual User - Verify Whether app is displaying the Credit/Debit Card info icon pop-up on the Add Payment Method screen
    When user is on NLID screen
    And user validates the add payment link present in LID screen
    When user taps on add payment link present in LID screen
    Then user verifies the Add Payment method screen
    Then user verifies the info icon present and taps on the button
    When user verifies the text present under info icon and taps on ok button
    Then user verifies the Add Payment method screen

  @P11270-11998 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322 @SprintiOS2321
  Scenario: Verify if system navigates the user back to the Complete Your Profile' screen when the user taps on the CONTINUE button
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on add payment method
    Then user verifies the Add Payment method screen
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
    And enter valid password and click on submit button
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    Then user verifies the User Profile section in Complete your profile screen
    Then user verifies permission settings in the Complete your profile screen

  @P11270-12002 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprint2321_22 @SprintiOS2322
  Scenario: Verify if system marks the 'Payment Method' task as completed
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on add payment method
    And user verifies the completed pop up message and clicks ok button
    Then user verifies the User Profile section in Complete your profile screen

  @P11270-23855 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2323 @SprintiOS2324
  Scenario: Verify that system should be able to see 60% profile completion on LID
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on the Email section in the complete profile screen
    And user verifies the completed pop up message and clicks ok button
    When user taps on the Accepted Privacy Policy and Terms and conditions
    And user verifies the completed pop up message and clicks ok button
    When user taps on the Set First and Last Name
    And user verifies the completed pop up message and clicks ok button
    When user taps on add payment method
    And user verifies the completed pop up message and clicks ok button
    When user taps on the Notifications
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user validates Add nectar card link in LID

  @P11270-33072 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprint2322_23__ @SprintiOS2323_
  Scenario: Manual Registration->Verify whether the app marks the profile completion task 'Add Nectar Card' as complete when the user skip adding the Nectar card from Offer Screen >Add Nectar Card screen
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

  @P11270-11980 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2324 @SprintiOS2324
  Scenario: Verify if user is able to see the link 'Tell us how often you'd like to hear from us' in LID screen
    When user is on NLID screen
    And user taps on the complete profile
    Then user verifies permission settings in the Complete your profile screen
    When user taps on location button in the complete profile screen
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    And user verifies the Tell us how often you'd like to hear from us link in LID screen

  @P11270-12071 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify if system display a pop-up when the user taps on the CONTINUE button without selecting checkbox
    When user is on NLID screen
    And user taps on the complete profile
    When user taps on the Email Preferences in Complete your profile screen
    Then user verifies the Email Preferences screen
    When User taps on Continue button in the email preferences screen
    Then user verifies the Email Preferences popup when the checkbox is not selected
    When user taps on Ok button in the Email Preferences popup when the checkbox is not selected
    Then user verifies the Email Preferences screen

  @P11270-35349 @iOSRegression @iOSSprint2410 @iOSRegressionSet1
  Scenario: Manual User - Verify that whether the app is displaying the updated design of the payment method section in the Account screen when a payment method is added
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user verifies the payment method section with a card

  @P11270-29490 @iOSRegression @iOSSprint2411 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario:App should display the updated password rule no 1(At least 10 characters) on the Edit Password screen
    When user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user taps on new Password Field
    Then user verifies the updated password rules in Edit Password screen

  @P11270-29668 @iOSRegression @iOSSprint2411 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario:Verify the app is displaying the updated error message in Edit password screen
    When user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters the current password from the "FrictEssoPsword"
    And user enters the new password from the "FrictEssoPsword"
    And user enters the confirm password from the "FrictEssoPsword"
    And user tap on Done button
    Then user verifies the updated error message when same password is used
    And Tap on OK button in the popup

  @P11270-35350 @iOSRegression @iOSSprint2410 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2414 @AndroidRegressionSet
  Scenario: Manual User - Verify that whether app is displaying the default payment method under the payment method section
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user verifies the payment method section with a card
    Then user verifies the default payment method as the 1st payment method under the payment method section
    Then user verifies app highlight the default payment method with the label 'Selected Payment Method

  @P11270-35367 @iOSRegression @iOSSprint2411 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2414 @AndroidRegressionSet
  Scenario: Manual User - Verify that weather app is displaying  the PayPal payment method under the payment method section
    Given user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then Verify that  the app should display the PayPal payment method as a card view

  @P11270-13107 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Delete Nectar card from Account Screen
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
#    Then Add and verify Nectar card
    Then Delete and verify Nectar card

  @P11270-49274 @iOSRegression @iOSSprint2410 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario: Verify whether application is not displaying add mobile number task in Account screen for manual registraion
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
    And user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user confirms the mobile number field is not present in the account screen

  @P11270-30621 @iOSRegression @iOSSprint2410 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2414 @AndroidRegressionSet
  Scenario: Verify whether application is not displaying add mobile number task in Account screen for manual registraion
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user confirms the mobile number field is not present in the account screen

  @P11270-35346 @iOSRegression @iOSSprint2410 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2414 @AndroidRegressionSet
  Scenario: Manual User  - Verify that whether the app is displaying updated design of the payment method section in the Account screen when a payment method is not added
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user verifies payment method section in account screen when payment method is not added

  @P11270-29606 @iOSRegression @iOSSprint2411 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2414 @AndroidRegressionSet
  Scenario: Verify new user is able to change to new password in edit password screen (manual)
    Given user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters the current password from the "FrictEssoPsword"
    And user enters a New Password to change the password
    And user enters a Confirm New Password to change the password
    Then user tap on Done button
    Then verify copy text message for password changed
    And Tap on OK button in the popup
    Then user verifies the app redirects back to NLID

  @P11270-30652 @iOSRegression @iOSSprint2410 @iOSRegressionSet1
  Scenario: Verify whether application is not displaying add mobile number task in Account screen for Linked-in registraion
    Given user log out from the app if logged in
    And user taps on "LinkedIn" icon in the NLID
    And I enter SSO login details for "LinkedIn"
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user confirms the mobile number field is not present in the account screen

  @P11270-38750 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario: Linked-In user - Verify the user is able to see the updated Esso logo in the "More Menu" screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    Then verify the updated esso logo is displayed

  @P11270-21514 @iOSRegression @iOSSprint2413 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2415
  Scenario: Verify the user should able to see the external Esso webpage when the user taps on the Privacy Policy link from the Account screen. (LinkedIn)
    Given user is on NLID screen
    And user taps on More button in tab bar
    And verify the following data in tab bar
    When user navigates to Account screen
    When user taps on privacy policy in account screen
    Then user lands on privacy policy from account screen

  @P11270-21519 @iOSRegression @iOSSprint2413 @iOSRegressionSet1
  Scenario: Verify the user should able to see the external Esso webpage when the user taps on the Terms & Conditions link from the Account screen. (LinkedIn)
    Given user is on NLID screen
    And user taps on More button in tab bar
    And verify the following data in tab bar
    When user navigates to Account screen
    When user taps on terms and conditions in account screen
    Then user lands on terms and condition screen from account screen

  @P11270-35393 @iOSRegression @iOSSprint2410 @iOSRegressionSet1
  Scenario: SSO User - Verify that whether the app is displaying updated design of the payment method section in the Account screen when a payment method is not added
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    Then user verifies the Add Payment method screen

  @P11270-35394 @iOSRegression @iOSSprint2410 @iOSRegressionSet1
  Scenario: SSO User [iOS-only] - Verify that whether the app is displaying updated design of the payment method section in the Account screen when a payment method is not added
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    Then user verifies the Add Payment method screen
    Then validate the cancel button displayed in add payment method
    Then verify the applepay displayed as first payment in add payment method
    Then verify the credit/debit card displayed as second payment in add payment method
    Then verify the paypal is displayed as third payment in add payment method

  @P11270-35396 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: SSO User - Verify that whether the app is displaying the updated design of the payment method section in the Account screen when a payment method is added
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user tap on add card button in account
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
    Then user verifies the payment method section with a card

  @P11270-35397 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: SSO User - Verify that whether app is displaying the default payment method under the payment method section
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user verifies the payment method section with a card
    Then user verifies the default payment method as the 1st payment method under the payment method section
    Then user verifies app highlight the default payment method with the label 'Selected Payment Method

  @P11270-35398 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: SSO User - Verify that whether app is displaying ‘Choose Default Method’ below the ‘Add Payment Method’ link
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on Add Payment Method link
    Then user verifies the Add Payment method screen
    When user taps on Credit Debit card in Add Payment Method screen
    Then enter name of the card
    Then enter "5426 0640 0042 5059 " card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then validate if user is on 3ds password screen
    And enter valid password and click on submit button
    When user tap on OK button from Card added successfully popup
    Then user verifies the ‘Choose Default Method’ link below the ‘Add Payment Method’ link.

  @P11270-28424 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: The Esso app should display the option to delete the Esso app account on the Account screen for LinkedIn Signed in User
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user verifies the Delete Your Account button in red color below the Log Out button

  @P11270-28429 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: The app should navigate the user to the Account Deletion confirmation screen for LinkedIn Sign-In User
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    Then user verifies the delete your account screen

  @P11270-28436 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: The app should navigate the user to the Account screen from Account Deletion confirmation screen for LinkedIn user
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    Then user verifies the delete your account screen
    And user taps on Cancel from Delete Account Confirmation screen
    Then Verify the User should land on Account Screen

  @P11270-28441 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: Should be able to delete the LinkedIn User Esso Account
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    Then user verifies the delete your account screen
    And user taps on delete in delete your account screen
    And user verifies the delete your account popup
    And tap on Ok Button
    Then user verifies the app redirects back to NLID

  @P11270-21510 @iOSRegression @iOSSprint2413 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2415
  Scenario: Verify the user should able to see the external Esso webpage when the user taps on the Privacy Policy link from the Account screen.(Facebook)
    Given user log out from the app if logged in
    And user taps on "Facebook" icon in the NLID
    And I enter SSO login details for "Facebook"
    Given user is on NLID screen
    And user taps on More button in tab bar
    And verify the following data in tab bar
    When user navigates to Account screen
    When user taps on privacy policy in account screen
    Then user lands on privacy policy from account screen

  @P11270-21517 @iOSRegression @iOSSprint2413 @iOSRegressionSet1
  Scenario: Verify the user should able to see the external Esso webpage when the user taps on the Terms & Conditions link from the Account screen. (Facebook)
    Given user is on NLID screen
    And user taps on More button in tab bar
    And verify the following data in tab bar
    When user navigates to Account screen
    When user taps on terms and conditions in account screen
    Then user lands on terms and condition screen from account screen

  @P11270-28422 @iOSRegression @iOSSprint2411 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario: The Esso app should display the option to delete the Esso app account on the Account screen for Facebook Signed in User
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user verifies the Delete Your Account button in red color below the Log Out button

  @P11270-28427 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: The app should navigate the user to the Account Deletion confirmation screen for Facebook Sign-In User
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    Then user verifies the delete your account screen

  @P11270-28433 @iOSRegression @iOSSprint2411 @iOSRegressionSet1 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario: The app should navigate the user to the Account screen from Account Deletion confirmation screen for Facebook user
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    Then user verifies the delete your account screen
    And user taps on Cancel from Delete Account Confirmation screen
    Then Verify the User should land on Account Screen

  @P11270-35408 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: SSO User - Verify that whether app is displaying the MasterCard payment method under the payment method section
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then Verify that the app should display the MasterCard payment method as a card view

  @P11270-28439 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: Should be able to delete the Facebook User Esso Account
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    Then user verifies the delete your account screen
    And user taps on delete in delete your account screen
    And user verifies the delete your account popup
    And tap on Ok Button
    Then user verifies the app redirects back to NLID

  @P11270-12867 @iOSRegression @iOSSprint2410 @iOSRegressionSet1
  Scenario: Check Whether System displays the ok button to relogin the Application after entering the wrong password
    Given user log out from the app if logged in
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
    And user taps on the complete profile
    And user taps on add payment method
    Then user verifies the Add Payment method screen
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
    And enter valid password and click on submit button
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    Then user verifies the User Profile section in Complete your profile screen
    And user taps on back and navigates to LID
    And user clicks on more icon
    Then user clicks on Account
    And user Tap on Edit for Esso PIN field.
    And user taps on forgot password in PIN
    Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
    And user enters the wrong password in enter password field
    Then user clicks on continue icon in Forget password Screen
    Then user able to see invalid password popup message
    And Verify that User is navigate back to NLID screen

  @P11270-35351 @iOSRegression @iOSSprint2410 @iOSRegressionSet1
  Scenario: Manual User - Verify that whether app is displaying ‘Choose Default Method’ below the ‘Add Payment Method’ link
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on Add Payment Method link
    Then user verifies the Add Payment method screen
    When user taps on Credit Debit card in Add Payment Method screen
    Then enter name of the card
    Then enter "4012 0000 0001 2003 001 " card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    Then validate if user is on 3ds password screen
    And enter valid password and click on submit button
    When user tap on OK button from Card added successfully popup
    Then user verifies the ‘Choose Default Method’ link below the ‘Add Payment Method’ link.

  @P11270-35364 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: Manual User  -  Verify that whether app is displaying  the Visa payment method under the payment method section
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then User verifies the app should display the Visa card payment method as a card view

  @P11270-28437 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: Should be able to delete the Manual User Esso Account
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    Then user verifies the delete your account screen
    And user taps on delete in delete your account screen
    And user verifies the delete your account popup
    And tap on Ok Button
    Then user verifies the app redirects back to NLID

  @P11270-32695 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario: Check whether the App displaying the Gmail address of the user on the Account screen for the after Login with Google SSO user
    Given user log out from the app if logged in
    And user taps on "google" icon in the NLID
    And I enter SSO login details for "google"
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user validates the user profile field
    Then user validate the "Google" user id

  @P11270-32697 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario: Check whether the App displaying the Full Name of the user on the Account screen for the after Login with Google SSO user
    Given verify user is on LID Screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    Then user verifies the first and last name is displayed fully

  @P11270-32700 @AndroidRegression @Sprintandroid2413 @AndroidRegressionSet1
  Scenario: Check whether the App is allowing to edit First name and Last name together after Login with Google SSO user
    Given verify user is on LID Screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    When user edit name by entering firstname and lastname
    And tap on update button
    Then verify the Updated message is displayed
    And verify navigate back to account screen after tapping ok button

  @P11270-21511 @iOSRegression @iOSSprint2413 @iOSRegressionSet1
  Scenario: Verify the user should able to see the external Esso webpage when the user taps on the Privacy Policy link from the Account screen. (Apple Sign In)
    Given user log out from the app if logged in
    And user taps on "Apple" icon in the NLID
    And I enter SSO login details for "Apple"
    Given user is on NLID screen
    And user taps on More button in tab bar
    And verify the following data in tab bar
    When user navigates to Account screen
    When user taps on privacy policy in account screen
    Then user lands on privacy policy from account screen

  @P11270-15738 @iOSRegression @iOSRegressionSet1
  Scenario: Verify if SSO Apple based Esso app user navigate to 'Forgot PIN' screen to trigger a reset PIN email
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

  @P11270-21516 @iOSRegression @iOSSprint2413 @iOSRegressionSet1
  Scenario: Verify the user should able to see the external Esso webpage when the user taps on the Terms & Conditions link from the Account screen. (Apple Sign In)
    Given user is on NLID screen
    And user taps on More button in tab bar
    And verify the following data in tab bar
    When user navigates to Account screen
    When user taps on terms and conditions in account screen
    Then user lands on terms and condition screen from account screen

  @P11270-28421 @iOSRegression @iOSSprint2413 @iOSRegressionSet1
  Scenario: The Esso app should display the option to delete the Esso app account on the Account screen for Apple Signed in User
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then verify the delete button present in account screen

  @P11270-30633 @iOSRegression @iOSSprint2413 @iOSRegressionSet1
  Scenario: Verify whether application should not displaying add mobile number task in Account screen for Apple registraion
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user confirms the mobile number field is not present in the account screen

  @P11270-28426 @iOSRegression @iOSSprint2413 @iOSRegressionSet1
  Scenario: The app should navigate the user to the Account Deletion confirmation screen for Apple Sign-In User
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then verify the delete button present in account screen
    When user taps on the delete account
    Then user verifies the delete your account screen

  @P11270-28434 @iOSRegression @iOSSprint2413 @iOSRegressionSet1
  Scenario: The app should navigate the user to the Account screen from Account Deletion confirmation screen for Apple user
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then verify the delete button present in account screen
    When user taps on the delete account
    Then user verifies the delete your account screen
    And user taps on Cancel from Delete Account Confirmation screen
    Then Verify the User should land on Account Screen

  @P11270-28438 @iOSRegression @iOSSprint2411 @iOSRegressionSet1
  Scenario: Should be able to delete the Apple User Esso Account
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    Then user verifies the delete your account screen
    And user taps on delete in delete your account screen
    And user verifies the delete your account popup
    And tap on Ok Button
    Then user verifies the app redirects back to NLID