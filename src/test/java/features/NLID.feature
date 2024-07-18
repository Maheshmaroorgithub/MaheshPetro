@NonLoggedInDashboard
Feature: NonLoggedInDashboard

  @P11270-4816 @P11270-4818 @P11270-4819 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System navigates user to login page
    When user log out from the app if logged in
    And user clicks on Login Icon
    And User taps on Login button in Login screen without entering the values
    Then Verify the inline error message during login
    When Enter valid mail and tap done
    Then Verify the inline error message for password
    When Enter the wrong password and tap login
    Then Verify the popup content

  @P11270-4817 @P11270-4820 @P11270-4821 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System navigates user to send link
    When user log out from the app if logged in
    And user clicks on Login Icon
    And user taps on Forgot password link in login screen in NLID
    And user enters invalid email id
    And user taps on send button in Forgot Password Screen
    Then Verify the inability to send the mail
#    When user taps on Cancel in the Login Screen
    And user tabs on back button in the Forgot Password screen
    And user taps on Forgot password link in login screen in NLID
    And User enters the "regressioncredentials2" valid mail id and taps send button
    Then Verify the mail is sent

  @P11270-21427 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2324
    Scenario: Verify the system should display the updated copy text of the ‘Don’t Have An Account? Sign Up!'
     Given user log out from the app if logged in
     When user clicks on Login Icon
     Then user verifies the forgot login and sign up link

  @P11270-21433 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2324
     Scenario: Verify the system should be navigated to the forgot password screen when the user taps on the 'Forgot Login?' button.
      Given user log out from the app if logged in
      When user clicks on Login Icon
      When user taps on the forgot login link
      Then verify it is navigated to the forgot password screen

  @P11270-21429 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2323 @SprintiOS2324
    Scenario: Verify the system should display the updated copy text of the ‘Forgot your password?'
     Given user log out from the app if logged in
     When user clicks on Login Icon
     When user taps on the forgot login link
     Then verify it is navigated to the forgot password screen
     Then verify the password screen text

  @P11270-13238 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check Whether System is able to navigate login screen
    Given user is on NLID screen after multiple launch
    Then user verifies the login button in the NLID

  @P11270-4822 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check Whether System is able to navigate login screen using device back button
    Given user log out from the app if logged in
    And user clicks on Login Icon
    And user taps on Forgot password link in login screen in NLID
    And user tabs on back button in the Forgot Password screen
    And verify user navigates back to Login screen

  @P11270-37007 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in Support Centre screen (In NLID)
    When user log out from the app if logged in
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    Then user validates that the app assistant is not present

  @P11270-37008 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in Station Finder default map view(In NLID)
    When user log out from the app if logged in
    When user taps on Station Finder
    Then user validates that the app assistant is not present

  @P11270-37009 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in Station Finder list view(In NLID)
    When user log out from the app if logged in
    When user taps on Station Finder
    And user tap on list view
    Then user validates that the app assistant is not present

  @P11270-37006 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in More screen(in NLID)
    When user log out from the app if logged in
    And user taps on More button in tab bar
    Then user validates that the app assistant is not present

  @P11270-36996 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in NLID state
    When user log out from the app if logged in
    Then user validates that the app assistant is not present

  @P11270-36678 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @R123
  Scenario: Verify that Whether the app is displaying 3 dots button after the Google SSO button on NLID
    When user log out from the app if logged in
    Then user validates SSO logos and three dots in the NLID

  @P11270-36692 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @R123
  Scenario: Verify that Whether  the app should close the custom pop up when user taps on the 'X' button
    When user log out from the app if logged in
    And user taps on the three dots in the NLID
    Then user validates the SSO logos in the modal popup in the nlid
    When the user taps on the close button in the modal popup
    Then user verifies the app redirects back to NLID

  @P11270-38590 @AndroidRegression @Sprintandroid2410 @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @iOSSprint2413
  Scenario: Check whether the user is able to verify he don't see the account details from NLID
    When user log out from the app if logged in
    And user taps on More button in tab bar
    And user taps on fuel icon
    When user verifies the broadcast banner

  @P11270-49315 @AndroidRegression @Sprintandroid2410 @AndroidRegressionSet2
  Scenario:Verify the user is able to see the updated Esso logo in the "NLID" screen
    When user log out from the app if logged in
    Then Check for Esso logo on NLID

  @P11270-44420 @AndroidRegression @Sprintandroid2415 @AndroidRegressionSet2
  Scenario:Verify that The app should display the updated Esso logo on the app icon.
    When user log out from the app if logged in
    Then Check for Esso logo on NLID

  @P11270-38688 @AndroidRegression @Sprintandroid2410 @AndroidRegressionSet2
  Scenario:Verify the user is able to see the updated Esso logo in the "NLID" screen
    When user log out from the app if logged in
    Then Check for Esso logo on NLID

  @P11270-36685 @AndroidRegression @Sprintandroid2410 @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @iOSSprint2413
  Scenario:Verify that Whether the app is displaying a custom popup with the list of available SSO authentication methods
    And user taps on the three dots in the NLID
    Then user validates the SSO logos in the modal popup in the nlid
    And User validates modal popup title
    Then the user taps on the close button in the modal popup

  @P11270-38591 @AndroidRegression @Sprintandroid2410 @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @iOSSprint2413
  Scenario: Verify that whether app  dismiss the broadcast banner on NLID without the user interaction
    And user taps on More button in tab bar
    And user taps on fuel icon
    When user verifies the broadcast banner
    Then user confirms the banner board is not present

  @P11270-36703 @AndroidRegression @Sprintandroid2410 @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @iOSSprint2413
  Scenario:Verify that the app should not display the ‘Esso App Feedback’ section on the 'Support Centre' screen. (NLID)
    And user taps on More button in tab bar
    And User looks for Esso App Feedback option