@Help
Feature: Help

  @P11270-13101 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Check Whether system verifies the third tutorial screen
    When user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    And user taps on Tutorial button in Help screen
    And user taps on next button in the Tutorial screen one of the Help screen
    And user taps on next button in the Tutorial screen two of the Help screen
    Then user verifies the third screen

  @P11270-13103 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Check Whether system system verifies the second tutorial screen
    When user is on NLID screen
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    And user taps on Tutorial button in Help screen
    And user taps on next button in the Tutorial screen one of the Help screen
    Then user verifies the second screen

  @P11270-13098 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Check Whether system displays the Get started icon on third tutorial screens
    When user is on NLID screen
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    And user taps on Tutorial button in Help screen
    And user taps on next button in the Tutorial screen one of the Help screen
    And user taps on next button in the Tutorial screen two of the Help screen
    And user taps on Get started button in the Help screen
    Then user lands on Help screen in NLID

  @P11270-13104 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Check Whether system displays the Get started icon on third tutorial screens
    When user is on NLID screen
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    And user taps on Tutorial button in Help screen
    Then user verifies the first screen
    And user taps on next button in the Tutorial screen one of the Help screen
    Then user verifies the second screen
    And user taps on next button in the Tutorial screen two of the Help screen
    Then user verifies the third screen
    And user taps on Get started button in the Help screen
    Then user lands on Help screen in NLID

  @P11270-35160 @iOSRegression @iOSRegressionSet1 @Sprint2322_23
  Scenario: Verify whether App displays the' CLICK HERE TO FUEL' button CT on the LID screen. ( Manual Registered user)
    When user is on NLID screen
    Then user verifies the updated CT in the start button

  @P11270-38689 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1 @Sprintandroid2322
  Scenario: Manual user - Verify the user is able to see the updated Esso logo in the "LID" screen
    When user is on NLID screen
    Then verify the updated esso logo is displayed

  @P11270-25786 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify whether the user is able to see the Esso logo on the LID when the user navigates to LID from any screen.
    When user is on NLID screen
    Then user taps on Station Finder
    And user taps on fuel icon
    Then verify the updated esso logo is displayed
    When user taps on Offers
    And user taps on fuel icon
    Then verify the updated esso logo is displayed
    Then user taps on History
    And user taps on fuel icon
    Then verify the updated esso logo is displayed
    And user taps on More button in tab bar
    When user navigates to Products and Information screen
    And user taps on fuel icon
    Then verify the updated esso logo is displayed

  @P11270-25337 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify whether the user should be able to see the Esso logo on the LID (Manual Log-in)
    When user is on NLID screen
    Then verify the updated esso logo is displayed

  @P11270-13108 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Check Whether the system able to Add nectar card
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And navigate to the Nectar card section
    And Delete the Nectar card if it is present
    And Add the Nectar card
    Then Verify the nectar card section in the Account screen

  @P11270-38592 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: LID -Manual user- Verify that wether App is app displaying a broadcast banner on the LID
    When user verifies the broadcast banner

  @P11270-38593 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: LID -Manual user- Verify that wether app  dismiss the broadcast banner on LID without the user interaction
    When user verifies the broadcast banner
    Then user confirms the banner board is not present

  @P11270-36995 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1  @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in LID state
    When user is on NLID screen
    Then user validates that the app assistant is not present

  @P11270-37001 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1  @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in More screen
    When user is on NLID screen
    And user taps on More button in tab bar
    Then user validates that the app assistant is not present

  @P11270-37002 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1  @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in Support Centre screen
    When user is on NLID screen
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    Then user validates that the app assistant is not present

  @P11270-36999 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1  @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in History screen (when there are no receipt)
    When user is on NLID screen
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    Then user validates that the app assistant is not present


