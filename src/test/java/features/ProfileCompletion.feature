@ProfileCompletion

Feature: ProfileCompletion

  @P11270-12015 @P11270-11981 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check Whether system completes "Add Nectar" task also circular indicator is increased to ten percent
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "chibisakkrava.d+"
    Then enter password
    And confirm password
    Then click the check box for accept
    Then user selects the receive mails checkbox
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review
    And user verifies the forty percent in indicator
    And user taps on the complete profile
    Then user clicks on Add nectar
    And user clicks on the get started icon
    And user enters the card details and click next icon
    And user clicks on continue in add nectar card
    Then user skips the verification page
    Then user clicks on Add nectar
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-38689 @AndroidRegression @AndroidRegressionSet2 @Sprint2321_22
  Scenario: Manual user - Verify the user is able to see the updated Esso logo in the "LID" screen
    When user is on NLID screen
    Then verify the updated esso logo is displayed

  @P11270-12080 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322 @SprintiOS2321
  Scenario: Verify if system mark the task as completed when user has already selected the receipts and marketing checkbox
    When user is on NLID screen
    And user taps on the complete profile
    When user taps on the Email Preferences in Complete your profile screen
    And user verifies the completed pop up message and clicks ok button
    Then user verifies permission settings in the Complete your profile screen

  @P11270-23850 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2323
  Scenario: Verify that system should not display the ‘Maximum Fuelling Amount’ task on the 'Complete Your Profile' screen
    When user is on NLID screen
    And user taps on the complete profile
    Then user verifies maximum fueling amount is not present

  @P11270-23851 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2323
  Scenario: Verify that system should display the updated list of tasks in the 'Complete Your Profile' screen .
    When user is on NLID screen
    And user taps on the complete profile
    Then user verifies the User Profile section in Complete your profile screen
    Then user verifies permission settings in the Complete your profile screen
    Then user verifies Email settings in the Complete your profile screen
    Then user verifies Payment and Loyalty in the Complete your profile screen

  @P11270-23853 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2323
  Scenario: Verify that system should be able to see 40% profile completion on LID
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter Email address as "chibisakkrava.d+"
    Then enter password
    And confirm password
    Then click the check box for accept
    Then user selects the receive mails checkbox
    When click on continue button from register screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review
    When user is on NLID screen
    And user taps on the complete profile
    When user taps on the Accepted Privacy Policy and Terms and conditions
    And user verifies the completed pop up message and clicks ok button
    When user taps on the Set First and Last Name
    And user verifies the completed pop up message and clicks ok button
    When user taps on the Notifications
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the forty percent in indicator

  @P11270-23854 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2323
  Scenario: Verify that system should be able to see 50% profile completion on LID
    When user is on NLID screen
     And user taps on the complete profile
    When user taps on the Accepted Privacy Policy and Terms and conditions
    And user verifies the completed pop up message and clicks ok button
    When user taps on the Set First and Last Name
    And user verifies the completed pop up message and clicks ok button
    When user taps on add payment method
    When user taps on Credit Debit card in Add Payment Method screen
    Then enter name of the card
    Then enter "4006 3400 0000 0014" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    And check consent checkbox
    Then user clicks on continue button in Card screen
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    When user taps on the Notifications
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the fifty percent in indicator

  @P11270-23856 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2323
  Scenario: Verify that system should be able to see 70% profile completion on LID
    When user is on NLID screen
    And user taps on the complete profile
    When user taps on the Accepted Privacy Policy and Terms and conditions
    And user verifies the completed pop up message and clicks ok button
    When user taps on the Set First and Last Name
    And user verifies the completed pop up message and clicks ok button
    When user taps on add payment method
    And user verifies the completed pop up message and clicks ok button
    Then user clicks on Add nectar
    And user clicks on the get started icon
    Then user is navigated to add nectar screen
    And user enters the card details and click next icon
    And user clicks on continue in add nectar card
    Then user skips the verification page
    When user taps on the Notifications
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then validate the seventy percent profile completion on LID

  @P11270-30619 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2323
  Scenario: Verify whether application is not displaying add mobile number task in manual Profile completion Screen
    When user is on NLID screen
    And user taps on the complete profile
    Then user confirms the mobile number field is not present in the Completes your profile screen

# Twiter cases to be uncommented when it is enabled
#  @P11270-30672 @iOSRegression @iOSRegressionSet21 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2323
#  Scenario: Verify whether application is not displaying add mobile number task in Twitter Profile completion Screen
#    Given user log out from the app if logged in
#    And user taps on "Twitter" icon in the NLID
#    And I enter SSO login details for "Twitter"
#    Given user is on NLID screen
#    And user taps on the complete profile
#    Then user confirms the mobile number field is not present in the Completes your profile screen

  @P11270-11966 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check Whether the system displays "Complete your profile" Screen
   When user log out from the app if logged in
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
   And user taps on the complete profile
   And user verifies the "Completes your profile" screen
   Then user verifies the User Profile section in Complete your profile screen
   Then user verifies permission settings in the Complete your profile screen
   Then user verifies Email settings in the Complete your profile screen
   Then user verifies Payment and Loyalty in the Complete your profile screen

  @P11270-11951 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether the system displays email resend confirmation pop-up
    When user log out from the app if logged in
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
    And user taps on Resend Email link below the Open Inbox link
    And user verifies the confirmation pop up message
    Then user tap on OK button from the confirmation popup
    Then user verifies the circular indicator in the LID

  @P11270-11952 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether system resends the verification email
    When user log out from the app if logged in
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
    And user taps on Resend Email link below the Open Inbox link
    And user verifies the confirmation pop up message

  @P11270-11954 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario:Check Whether System verifies the Start Fueling pop up
    When user log out from the app if logged in
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
    And user taps on start fuelling button in LID
    Then system should display verification pop up
    And user tap on ok button

  @P11270-11982 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether System shows tick mark for default apps completed while registration
    When user log out from the app if logged in
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
    And user taps on the complete profile
    Then user verifies the completed Accept privacy and Terms task
    And user verifies the completed Set First Name and Last Name task
    And user verifies the completed Notifications task

  @P11270-12011 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether system skips the Nectar verification and navigates back to Account screen
    When user log out from the app if logged in
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
    Then user clicks on Add nectar card button
    And user enters the card details and click next icon
    And user clicks on continue in add nectar card
    Then user skips the verification page
    And user verifies the account page

  @P11270-11994 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322 @SprintiOS2321
  Scenario: Verify if user is able to navigate to the ‘Add Payment Method’ screen from Complete your profile screen
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on add payment method
    Then user verifies the Add Payment method screen

  @P11270-39576 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322
  Scenario: Manual user - Verify whether app displaying ‘Google Pay’ as an available payment method in Add Payment Method screen- From Complete your profile
    When user is on NLID screen
    And user taps on the complete profile
    And user taps on add payment method
    Then user verifies the Add Payment method screen
    Then verify the googlepay displayed as first payment in add payment method

  @P11270-12014 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether system continues the Nectar verification and navigates back to Offer Screen
    When user log out from the app if logged in
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
    And user clicks on offer icon
    Then user clicks Add Nectar Card from offer screen
    And user enters the card details and click next icon
    And user clicks on continue in add nectar card
    Then user skips the verification page
    And user verifies the offer page

  @P11270-12017 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether the system completes "Add Nectar" task
    When user log out from the app if logged in
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
    And user verifies the forty percent in indicator
    And user taps on the complete profile
    Then user clicks on Add nectar
    And user clicks on the get started icon
    And user enters the card details and click next icon
    And user clicks on continue in add nectar card
    Then user skips the verification page
    Then user clicks on Add nectar
    And user verifies the completed pop up message and clicks ok button

  @P11270-11969 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether System not displays the tick mark on not completed task in list
    When user is on NLID screen
    And user taps on the complete profile
    Then user verifies the User Profile section in Complete your profile screen
    Then user verifies permission settings in the Complete your profile screen
    Then user verifies Email settings in the Complete your profile screen
    Then user verifies Payment and Loyalty in the Complete your profile screen
    When user verify without tick mark on the task

  @P11270-12082 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether System does not displays the circular indicator
    When user is on NLID screen
    Then user verifies the circular indicator in the LID

  @P11270-11999 @P11270-12004 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether system completes the Add Payment in Account Screen and navigates back
    When user log out from the app if logged in
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
    And user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
#    And Click on Add Card
#    And  user sets the pin number from Account screen
    And user enters the card details except "fingerprint checkbox"
    And check consent checkbox
    Then user clicks on continue button in Card screen
    When user tap done button to navigate verify screen "Payment method added successfully"
    When user tap on payment method added successfully screen continue button
    Then user verifies the success set Default payment popup
    And user verifies the account page
    Then user clicks on edit in the added payment method without phone and other payment
    Then user taps delete in the Edit Payment Method screen
    Then user taps on delete button in the Delete popup msg
    Then app to dismiss the popup when the user taps on OK button
    And user verifies the account page
    And user navigated to NLID Screen
    And user taps on the complete profile
    Then user taps on add payment method
    Then user verifies whether the task is completed

  @P11270-12085 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether System displays the nectar points
    When user log out from the app if logged in
    When user clicks on Login Icon
    When I enter "regressioncredentials2" in login details
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
    And user taps on fuel icon
    Given user is on NLID screen
    Then user verifies the circular indicator in the LID
    Then user verifies the nectar points in dashboard
    Then user verifies the nectar thumbnails in the LID

  @P11270-11967 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether system completes any task on the complete profile list
    When user log out from the app if logged in
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
    And user taps on the complete profile
    When user taps on the Email Preferences in Complete your profile screen
    And user verifies the Email Preferences screen
    And user taps on the accept email preferences
    And User taps on Continue button in the email preferences screen
    Then user verifies whether the email preferences task is completed
    And User taps on Continue button in the email preferences set successfully screen

  @P11270-11971 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether System displays the Already completed pop up by clicking the completed task in list
    When user is on NLID screen
    And user taps on the complete profile
    When user taps on the Email Preferences in Complete your profile screen
    And user verifies the Add Mobile Number confirmation pop up with message
    And user accepts the pop up message