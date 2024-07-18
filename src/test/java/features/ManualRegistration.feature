@ManualRegistration1
Feature: Manual Registration

  @P11270-4824 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether system closes the keyboard prompt upon tapping Done or Return button
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    And enter First Name
    And enter Last Name
    And enter "chibisakkrava.d+" Email address
    And enter password
    And confirm password
    Then user taps on Done button

  @P11270-28466 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1 @Sprintandroid2322 @SprintiOS2324
  Scenario: App should not allow the Manual user to login again with the deleted account
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
    And user verifies the Account title in the account section
    And user takes the mail id of the user
    And user taps on delete your account in account screen
    And user verifies the delete your account screen
    And user taps on delete in delete your account screen
    And user verifies the delete your account popup
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user clicks on Login Icon
    And user uses the auto generated mail in login screen
    And enter password in login screen
    And user taps the Login Button alone
    Then validate the error message displayed in login screen

  @P11270-4825 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether the system is able validate the email address field once the user navigates to the next field
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    Then enter First Name
    Then enter Last Name
    And user enters the "regressioncredentials2" already registered mail address
    Then enter password
    Then user verifies the whether the email id is validated

  @P11270-21431 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify the system should redirect the user to the 'Register' screen when the user taps on the 'Sign Up Now!' link.
    Given user log out from the app if logged in
    When user clicks on Login Icon
    Then user verifies the forgot login and sign up link
    When user tap on sign up link in login screen
    Then user should be navigated to Manual Register screen

  @P11270-21604 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify the user should able to display the updated password rules from manual registration screen.
    Given user log out from the app if logged in
    When user clicks on Login Icon
    When user tap on sign up link in login screen
    Then user should be navigated to Manual Register screen
    When enter the password less then 8 characters
    Then user verifies the updated password rules

#  The below TC fails in iOS due to this defect - P11270-18609
  @P11270-4829 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether the password character limit is atleast 8 characters
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    And enter the password less then 8 characters
    And user verifies the updated password rules
    Then verify the tick marks are present

  @P11270-13243 @P11270-4830 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify application display validation message in password field if user enter less than 8 characters
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    And enter First Name
    And enter Last Name
    And enter "chibisakkrava.d+" Email address
    And user enters a password with less than 8 characters
    Then user verifies the updated password rules
    And confirm password
    Then click the check box for accept
    And click on continue button from register screen
    Then user verifies the validation message

  @P11270-29595 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: The app should display the updated password rule no 1 on the manual registration form from Login Screen
    Given user log out from the app if logged in
    When user clicks on Login Icon
    And user tap on sign up link in login screen
    Then user should be navigated to Manual Register screen
    When user enters a password with only upper case more than 8 characters
    Then user verifies the first rule in the register screen

  @P11270-22546 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify whether interim text that said has changed to "Contains a number and a special character" for password field
    Given user log out from the app if logged in
    When user clicks on Login Icon
    And user tap on sign up link in login screen
    Then user should be navigated to Manual Register screen
    When user enters a password with only upper case more than 8 characters
    Then user verifies the third rule in the register screen

  @P11270-29489 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: The app should display an inline error message when the user enters a password of fewer than 10 characters on the manual registration form from Login screen
    Given user log out from the app if logged in
    When user clicks on Login Icon
    And user tap on sign up link in login screen
    Then user should be navigated to Manual Register screen
    When user enters a password with only upper case more than 8 characters
    And confirm password
    Then click the check box for accept
    And click on continue button from register screen
    Then verify the inline error message in the password section

#  The below TC fails in iOS and Android due to - P11270-18732 and P11270-18697
  @P11270-4832 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether the Privacy Policy, Terms and Conditions are getting opened
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    And confirm password
    Then click the check box for accept
    And user taps on Privacy Policy link in the Registration screen
    And user lands in the Privacy Policy screen
    When user kill and relaunch the app
    When user taps on register button from Login screen
    And confirm password
    Then click the check box for accept
    And user taps on Terms and Conditions link in the Registration screen
    And user lands in the Terms and Condition screen

  @P11270-4833 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether the system is able to display - Please Accept Privacy Policy and T&C
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    When click on continue button from register screen without selecting the PP and TC checkbox
    Then verify the title of the PP and TC checkbox

  @P11270-4852 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether system show inline message if the user taps on CONTINUE button without entering info in the following fields
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    When click on continue button from register screen
    Then user verifies the inline error message of the empty first name
    Then user verifies the inline error message of the empty last name
    Then user verifies the inline error message of the empty email address
    Then user verifies the inline error message of the empty Password

  @P11270-4853 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether the system to validate the email, when user taps on tap button / when the focus is shifted from Email field
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    Then enter First Name
    Then enter Last Name
    And user enters the wrong mail format in the Register screen
    Then enter password
    When click on continue button from register screen without selecting the PP and TC checkbox
    Then user verifies the inline error message of the mail id

#  The below TC fails in iOS due to - P11270-25698
  @P11270-4854 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether Inability of the system to allow user to register with same email-id multiple times
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    Then enter First Name
    Then enter Last Name
    And user enters the "regressioncredentials2" already registered mail address
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then verify the multiple registration error popup

  @P11270-4855 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify validation message is displayed in confirmation password if password condition is not satisfied
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    And enter First Name
    And enter Last Name
    And enter "chibisakkrava.d+" Email address
    And enter password
    And enter a random password in the confirm password field
    Then click the check box for accept
    When click on continue button from register screen
    Then verify the inline error message in the confirm password

  @P11270-4857 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether the system is able to display Accept Privacy Policy and T&C content
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    When click on continue button from register screen without selecting the PP and TC checkbox
    Then verify the content of the PP and TC checkbox

  @P11270-4858 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether the system is able to enroll user email-id for receiving news and exclusive offers, if user has selected the check-box
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    And enter First Name
    And enter Last Name
    And enter "chibisakkrava.d+" Email address
    And enter password
    And confirm password
    Then click the check box for accept
    Then user selects the receive mails checkbox
    When click on continue button from register screen

  @P11270-16073 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify that system should display the device verification required pop-up when I change to a new device and attempt to log into the App
    When user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "accountLoginOtherDeviceCredentials" in login details
    And user taps the Login Button alone
    Then user verify the Login Notification Title
    Then user verify the Login Notification content in the Login screen
    Then user verify the OK button and Resend button
    And user tap on OK button in the Login Notification popup
    Then user verifies the Login screen

    #  This TC fails in iOS due the login issue - P11270-21459
  @P11270-16079 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify that system should display the resend email confirmation pop-up
    Given user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "accountLoginOtherDeviceCredentials" in login details
    And user taps the Login Button alone
    Then user verify the Login Notification Title
    Then user verify the Login Notification content in the Login screen
    Then user verify the OK button and Resend button
    And user tap on Resend link in the Login Notification popup
    Then user verifies the mail sent popup

#  The below TC fails in Android due to this defect - P11270-25575
  @P11270-13253 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify for guest user the updated URL to be displayed when user is tapping on FAQs link in more option
    When user log out from the app if logged in
    When user taps on More button in tab bar
    And user taps on Support Centre icon
    When User click on the Frequently asked Question link
    And user click on Loyalty points
    And user click on nectar link in loyalty points
    And tap on FAQ link in the nectar section
    Then user verifies the faq link

  @P11270-13245 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify validation is displayed when user enter only uppercase in password field
    When user log out from the app if logged in
    When user taps on register button from Login screen
    And enter First Name
    And enter Last Name
    And enter "chibisakkrava.d+" Email address
    And user enters a password with only upper case more than 8 characters
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then user verifies the validation message

  @P11270-13246 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify validation is displayed when user enter only lowercase in password field
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    And enter First Name
    And enter Last Name
    And enter "chibisakkrava.d+" Email address
    And user enters a password with only lower case
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then user verifies the validation message

  @P11270-13247 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify system display validation message if user enter password without any number or special characters
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    And enter First Name
    And enter Last Name
    And enter "chibisakkrava.d+" Email address
    And user enters a password with only upper case more than 8 characters
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then user verifies the validation message

  @P11270-13250 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify user is able to enter ASCII key in Registration page
    Given user log out from the app if logged in
    When user taps on register button from Login screen
    Then user enter the "AsciiCharacters32to61" in Registration fields and verify the values
    And user enter the "AsciiCharacters62to91" in Registration fields and verify the values
    And user enter the "AsciiCharacters92to121" in Registration fields and verify the values
    And user enter the "AsciiCharacters122to126" in Registration fields and verify the values

#  The below TC fails in iOS and Android due to the issue - P11270-22287 and P11270-25574
  @P11270-15837 @P11270-15836 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify the app should display a ‘Sign up' link on the 'Add Nectar Card’ screen
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
    When user taps on Offers
    Then user validate the empty offers screen
    When user clicks Add Nectar Card from offer screen
    Then User is navigated to Add Nectar Card screen
    And user verifies the Add nectar card screen from offers
    When user clicks on Sign up link in Add Nectar card screen
    Then user verifies the sign up link offers screen

  @P11270-30620 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify whether application is not displaying add mobile number task in manual Profile completion on LID
    When user is on NLID screen
    And user taps on the complete profile
    Then user confirms the mobile number field is not present in the Completes your profile screen

#  The below TC fails in iOS due to this defect - P11270-24496
  @P11270-13251 @P11270-16089 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify user is able to validate update password rules in edit page
    When user is on NLID screen
    And user taps on More button in tab bar
    Then user navigates to Account screen
    And user taps on edit usr pwd
    And user enters Current password
    And user enters a New Password to change the password
    And user enters a Confirm New Password to change the password
    And user tap on Done button
    Then verify copy text message for password changed
    When user taps on ok button
    Then user verifies the app redirects back to NLID

#  The below TC fails in Android due to the issue - P11270-25573
  @P11270-4851 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether the user is able to see the below mentioned details for Registration Screen
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user verifies the back button
    And user verifies the first name checkbox
    And user verifies the last name checkbox
    And user verifies the email checkbox
#    And user verifies the Mobile number Textbox
    Then user verifies the show hide toggle button
    Then user verifies the Continue button
    And confirm password
#    Then user taps on Done button
    Then user verifies the checkboxes
#    Then user verifies the Esso related content
    Then user verifies the PP and TC related content

  #
#    #  The below TC fails in Android due to the issue - P11270-25556
#  @P11270-16034 @iOSRegressionR2211 @AndroidRegressionR2211 @AndroidRegressionSet11 @RegressionUKR2211
#  Scenario: Verify user should able to see mobile number filed as part of registration form
#    When user log out from the app if logged in
#    When user taps on register button from Login screen
#    Then user verifies country code
#    Then user verifies the place holder in the textbox
#    And user enters the mobile number in the Register screen
#    Then user verifies the place holder is not displayed
#
#  @P11270-16035 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify app should display country code by default and app should not allow the user to edit the country code
#    Given user log out from the app if logged in
#    When user taps on register button from Login screen
#    Then user verifies country code
#    Then user verifies whether the country code is editable
#
#  @P11270-16036 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify user able to view and click info icon in the mobile number field
#    Given user log out from the app if logged in
#    When user taps on register button from Login screen
#    And user taps the info icon in the Mobile number section
#    Then user verifies the content in the info popup of Mobile number section
#    And user taps on OK button in the info popup of Mobile number section
#    Then user lands in the Registration Screen after tapping OK from Mobile Info popup
#
#  @P11270-16037 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify app should allow the user to enter the mobile number
#    Given user log out from the app if logged in
#    When user taps on register button from Login screen
#    And user enters the mobile number in the Register screen
#    Then user closes the keypad in the mobile section in Registration screen
#
##  The below TC fails in Android due to the issue - P11270-25556
#  @P11270-16042 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify mobile number format should be displayed with space
#    Given user log out from the app if logged in
#    When user taps on register button from Login screen
#    Then user verifies the place holder in the textbox
#    And user enters the mobile number in the Register screen
#    Then user closes the keypad in the mobile section in Registration screen
#    Then user verifies the entered mobile number is present with space
#
##  The below TC fails in Android due to the issue - P11270-25553
#  @P11270-16048 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the app validate the length of the mobile number
#    Given user log out from the app if logged in
#    When user taps on register button from Login screen
#    Then enter First Name
#    Then enter Last Name
#    Then enter "chibisakkrava.d+" Email address
#    Then enter password
#    And confirm password
#    And user enters the mobile number in the Register screen less than 10 digits
#    Then user closes the keypad in the mobile section in Registration screen
#    Then click the check box for accept in Register screen
#    When click on continue button from register screen
##    Then verify the inline error message for the mobile section in Registration screen
#
#  @P11270-16051 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the app should not mandate the user to add a mobile number
#    Given user log out from the app if logged in
#    When user taps on register button from Login screen
#    Then enter First Name
#    Then enter Last Name
#    Then enter "chibisakkrava.d+" Email address
#    Then enter password
#    And confirm password
#    Then click the check box for accept
#    When click on continue button from register screen
#
##  The below TC fails in Android due to the issue - P11270-25556 and P11270-25553
#  @P11270-16081 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the User success prompt after adding the mobile number in account flow
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
#    Then App should navigates to Confirm your email address screen
##    And user should see details in contextual registration screen
#    When user tap on Skip button
#    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then verify the add mobile number button in account
#    And user taps on Add mobile number button
#    Then Verify the title and the label
#    Then verify the add mobile number section in the account screen
#    Then verify the buttons in the add mobile number screen
#    And user adds the mobile number less than 10 digits in the Account screen
#    Then user taps done button in the keypad
#    And user taps on the Done button in the Add Mobile screen
##    Then user verifies the inline error message in the mobile number
#    And user adds the mobile number in the Account screen
#    Then user taps done button in the keypad
#    And user taps on the Done button in the Add Mobile screen
#    Then user verifies the mobile number is added successfully
##    And user taps on ok button
#    And user taps on contiue button
#    Then user navigate to account screen and verifies the mobile number
#    And user taps on edit button Mobile section in the Account screen
#    And user taps on delete button in Edit Mobile Number section
#    Then user verifies the delete pop msg
#    And user taps on delete button in the Delete Mobile popup msg
#    Then user verifies the mobile number is deleted successfully
#    Then user taps on ok button
#    Then user navigate to account screen and verifies the add mobile number section
#
#  @P11270-16246 @P11270-16247 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify App should display 'Add Mobile Number' task under user profile section the 'Complete Your Profile' screen
#    When user log out from the app if logged in
#    When user taps on register button from Login screen
#    Then user should be navigated to Manual Register screen
#    Then enter First Name
#    Then enter Last Name
#    Then enter Email address as "saravanan.murugan+"
#    Then enter password
#    And confirm password
#    Then click the check box for accept
#    When click on continue button from register screen
#    When user tap on Skip button
#    Then the system should display Skip warning popup
#    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
#    And user taps on the complete profile
#    Then user verifies the User Profile section in Complete your profile screen
#    And user taps on Add Mobile Number
#    Then user verifies the mobile number task is not completed
#
##  The below TC fails in Android/iOS due to the issue - P11270-25557
#  @P11270-16250 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify app display the 'Add Mobile Number' task as completed and display a tick mark for the 'Add Mobile Number' task
#    When user log out from the app if logged in
#    When user taps on register button from Login screen
#    Then user should be navigated to Manual Register screen
#    Then enter First Name
#    Then enter Last Name
#    Then enter Email address as "saravanan.murugan+"
#    Then enter password
#    And confirm password
#    Then click the check box for accept
#    When click on continue button from register screen
#    When user tap on Skip button
#    Then the system should display Skip warning popup
#    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
#    And user taps on the complete profile
#    Then user clicks on Completed Add Mobile number Icon
#    And user enters the mobile number
#    Then user clicks done icon on the screen
#    And user confirms the verification pop up
#    And user taps on contiue button
#    And user verifies the 50% profile completion circular indicator
#    And user taps on back and navigates to LID
#    Then user verifies the progress in the LID
#
##  The below TC fails in Android/iOS due to the issue - P11270-25557
#  @P11270-16253 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify app should display a 40% profile completion circular indicator on LID after adding a mobile number
#    When user log out from the app if logged in
#    When user taps on register button from Login screen
#    Then user should be navigated to Manual Register screen
#    Then enter First Name
#    Then enter Last Name
#    Then enter Email address as "saravanan.murugan+"
#    Then enter password
#    And confirm password
#    Then click the check box for accept
#    When click on continue button from register screen
#    When user tap on Skip button
#    Then the system should display Skip warning popup
#    When user tap on Skip anyway
#    Then app to dismiss the popup and navigate the user to LID after review
#    And user taps on the complete profile
#    Then user clicks on Completed Add Mobile number Icon
#    And user enters the mobile number
#    Then user clicks done icon on the screen
#    And user confirms the verification pop up
#    And user taps on contiue button
#    Then user verifies the 50% profile completion circular indicator
#    And user verifies the completion of PP and TC task
#    Then user verifies the completion of Set First Name and Last Name task
#    And user verifies the completion of Mobile number task
#    Then user verifies the completion of Notification task
#
#  @P11270-16076 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the User able to view add mobile number field in Add mobile number screen
#    When user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then verify the add mobile number button in account
#    And user taps on Add mobile number button
#    Then Verify the title and the label
#    Then verify the add mobile number section in the account screen
#    Then verify the buttons in the add mobile number screen
#    And user adds the mobile number in the Account screen
#    Then user verifies the place holder is not displayed in the Account Screen
#
##  The below TC fails in Android due to the issue - P11270-25556
#  @P11270-16078 @P11270-16074 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the User able to view add mobile number field in Add mobile number screen
#    When user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then verify the add mobile number button in account
#    And user taps on Add mobile number button
#    Then Verify the title and the label
#    Then verify the add mobile number section in the account screen
#    Then verify the buttons in the add mobile number screen
#    And user adds the mobile number less than 10 digits in the Account screen
#    Then user taps done button in the keypad
#    And user taps on the Done button in the Add Mobile screen
##    Then user verifies the inline error message in the mobile number
#    And user adds the mobile number in the Account screen
#    And user taps done button in the keypad
#    Then user verifies the inline error message is removed
#    And user taps on the Done button in the Add Mobile screen
#    Then user verifies the mobile number is added successfully
##    And user taps on ok button
#    Then user navigate to account screen and verifies the mobile number
##    And user taps on edit button Mobile section in the Account screen
##    And user taps on delete button in Edit Mobile Number section
##    Then user verifies the delete pop msg
##    And user taps on delete button in the Delete Mobile popup msg
##    Then user verifies the mobile number is deleted successfully
##    Then user taps on ok button
##    Then user navigate to account screen and verifies the add mobile number section
#
##  The below TC fails in Android due to the issue - P11270-25556
#  @P11270-16240 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify App should navigate the user to the 'Edit Mobile Number' screen
#    When user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And user taps on edit button Mobile section in the Account screen
#    And user enters the mobile number
#    Then user taps done button in the keypad
#    And user taps on the Done button in the Add Mobile screen
#    Then user verifies the mobile updated password successfully popup
#    And user taps on ok button
#    And user verifies the Account title in the account section
#
##  The below TC fails in Android due to the issue - P11270-25556
#  @P11270-16241 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify App should allow the user to edit the mobile number with following fomate 4 digits <Single space> 6 digits
#    When user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And user taps on edit button Mobile section in the Account screen
#    And user enters the mobile number in the Account screen
#    Then user verifies the entered mobile number is present with space in the Account screen
#
##  The below TC fails in Android due to the issue - P11270-25556
#  @P11270-16242 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify App should validation for the length of the mobile number
#    When user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And user taps on edit button Mobile section in the Account screen
#    And user adds the mobile number less than 10 digits in the Account screen
#    Then user taps done button in the keypad
#    And user taps on the Done button in the Edit Mobile screen
##    Then user verifies the inline error message in the mobile number
#    And user taps back in the mobile number field
#    Then user taps done button in the keypad
#    And user taps on the Done button in the Edit Mobile screen
#    Then user verifies the mobile updated password successfully popup
#
##   The below TC fails in Android due to the defect - P11270-25553
#  @P11270-16243 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify App should do empty validation for the mobile number field
#    When user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And user taps on edit button Mobile section in the Account screen
#    And user remove edit the mobile number
#    Then user taps done button in the keypad
#    And user taps on the Done button in the Edit Mobile screen
#    Then user verifies the inline error message in the edit mobile number screen with no number
#
#  @P11270-16251 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify app display an 'Already Completed' pop-up for the 'Add Mobile Number' task
#    When user is on NLID screen
#    And user taps on the complete profile
#    And user verifies the "Completes your profile" screen
#    Then user clicks on Completed Add Mobile number Icon
#    And user verifies the Add Mobile Number confirmation pop up with message
#    And user accepts the pop up message
#    And user verifies the "Completes your profile" screen
#
#  @P11270-16239 @AndroidRegressionR2211 @iOSRegressionR2211 @RegressionUKR2211
#  Scenario: Verify App should navigate the user to the 'Edit Mobile Number' screen
#    When user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then user edit the mobile number
#    Then verify the following content in Edit Mobile section
#
  #  @P11270-16244 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify App should allow the user to delete the added mobile number and display mobile number deleted successfully pop-up
#    When user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
##    And user taps on Add mobile number button
##    And user adds the mobile number in the Account screen
##    Then user taps done button in the keypad
##    And user taps on the Done button in the Add Mobile screen
##    Then user verifies the mobile number is added successfully
##    And user taps on ok button
##    Then user navigate to account screen and verifies the mobile number
#    And user taps on edit button Mobile section in the Account screen
#    And user taps on delete button in Edit Mobile Number section
#    Then user verifies the delete pop msg
#    And user taps on cancel button in the Mobile number then the system should close the prompt
#    And user taps on delete button in Edit Mobile Number section
#    And user taps on delete button in the Delete Mobile popup msg
#    Then user verifies the mobile number is deleted successfully
#    Then user taps on ok button
#    Then user navigate to account screen and verifies the add mobile number section
#
#  @P11270-13249 @AndroidRegressionR221a -10111-haveto-duplicateof4855
#  Scenario: Verify validation message is displayed in confirmation password if  password condition is not satisfied
#    Given user log out from the app if logged in
#    When user taps on Register screen
#    And enter First Name
#    And enter Last Name
#    And enter "chibisakkrava.d+" Email address
#    And user enters a valid password
#    And user enters different Confirm New Password in Registration Page
#    And click the check box for accept in Register screen
#    And click on continue button from register screen
#    Then verify the inline error message in the confirm password
#
#
#  @P11270-4922 @AndroidRegressionR2211
#  Scenario: Check whether System able to navigate user back to Esso App based on below mentioned conditions once user has accepted the PayPal Agreement
#    When user log out from the app if logged in
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
#    Then user taps on Add Pay Pal account in Account screen
#    Then user completes paypal terms and agreements
#    Then verify the 'Payment method added successfully' page and click on continue button
#
