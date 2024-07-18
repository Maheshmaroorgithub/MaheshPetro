@NativePassword
Feature: NativePassword

  @P11270-15838 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the user is able to see the save password prompt while logging in with unsaved login credentials
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "chibisakkrava.d+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    Then click on continue button from NLID
    And validate the OS Native password pop up
    When user clicks the save password button
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review

  @P11270-12655 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the user is able to Save password for the registered user (Android Specific)
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testesssoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    Then click on continue button from NLID
    When user clicks the save password button
    Then App should navigates to Confirm your email address screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review

  @P11270-15839 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check whether the user is able to Save password for the registered user
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

  @P11270-12659 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the user is able to see the save password prompt while logging in with unsaved login credentials
    When user log out from the app if logged in
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    Then enter "testesssoapp2021+" Email address
    Then enter password
    And confirm password
    Then click the check box for accept
    Then click on continue button from NLID
    And validate the OS Native password pop up
    When user clicks the save password button
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review

  @P11270-15844 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check whether the user is able to Save password for the registered user
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

  @P11270-15841 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Check whether the user is able to view the saved email address on the keyboard
    When user log out from the app if logged in
    And user clicks on Login Icon
    When user taps on email tab
    And user checks the suggestions on the keyboard
    And user clicks the mail suggestion from the keyboard
    Then user validates the password getting displayed

#  @P11270-15840 @AndroidRegression1- @iOSRegresssionR221- -11001
#  Scenario: Check whether the user is not able to Save password for the registered user
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
#
#  @P11270-12656
#  Scenario: Check whether the user is not able to Save password for the registered user
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