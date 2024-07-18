@PaymentMethod
Feature:PaymentMethod

  @P11270-10118 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the icons of all app supported credit cards are displayed on Add Payment Method screen. Current supported cards are Visa, Mastercard
    When user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    And user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
#    And Enter pin
#    Then user verifies the popup and clicks on ok button
    And Verify Visa card icon is displayed
    And Verify Master card icon is displayed

  @P11270-10117 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the user is able to see the following components in user credit card info.
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    And Verify Visa card icon is displayed
    And Verify Master card icon is displayed
    And Verify Card Name text box is displayed
    And Verify Card number text box is displayed
    Then verify Card expire date text box is displayed
    And verify Post code text box is displayed
    Then verify billing address text box is displayed
    And Verify Search button is displayed

#  The iOS and Android behaviour is different hence a defect is filed for clarification - P11270-28572
  @P11270-10116 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the user is able to see the following components on the Payment Card Method screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
#    And Verify that ‘Scan your card’ as a button
    And Verify Search button is displayed
    And Verify User is able to see 'Skip' button

  @P11270-10115 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the System not to display results, if user enters invalid post code and taps on Done.
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    And Enter the PostCode in search box
    Then Click on Search button
    And Verify that No Result displayed

  @P11270-10113 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the System able to close the info overlay as the USER taps on ‘GOT IT’ button
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    And Click on i icon in the security field
    Then Click on Got it button on popup screen

  @P11270-10112 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the user is able to choose the default credit card for payment by tapping on 'Choose Default Card'.
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then Click on Choose Default Card link

  @P11270-10114 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the system should allow user to delete 'Default' 'credit card'.
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And User Tap Edit card button with mobile number
    And user tap on Delete Card button
    And user should verify the CT "Are you sure you want to delete this card?"
    And user should verify cancel and delete button

#  =========================================================================
#
#  @P11270-10111 @iOSRegression @iOSRegressionSet21 @AndroidRegression @AndroidRegressionSet21
#  Scenario: Check whether the system is able to grey out the ‘+Add Card’ link, when the user has already added 5 cards.
#    Given user log out from the app if logged in
#    And user clicks on Login Icon
#    When I enter "MaxFiveCardAdd" in login details
#    And user taps login button in login screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    Then user tap on add card button in account
#    When user taps on Credit Debit card in Add Payment Method screen
#    And Verify that user should be able to add maximum five cards message
#
#  =========================================================================
#
#  @P11270-10119 @AndroidRegressionsR221
#  Scenario: Check whether the user is able to see default payment card information in the Payment Details screen
#    Given user is on NLID screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user selects pump number "1" to start fuelling
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user verify the MFA screen
#    When user tap on Continue button in MFA screen
#    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    Then Verify payment card is selected by default with tick mark