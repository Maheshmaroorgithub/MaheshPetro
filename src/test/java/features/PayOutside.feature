@PayOutside
Feature: PayOutside

  @P11270-13151 @P11270-13181 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Sprint 2 - Payoutside : Verify Transaction Complete screen for "Added nectar card.. " message
    Given user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "FrictEssoPsword" in login details
    And user taps login button in login screen
    And user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    When user taps on fuel icon and start fuelling button
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
#    When user lands on authorize payment screen
    When user lands on card verification screen
    And enter valid password and click on submit button
    Then user is navigated to start fueling now screen
    And then to now fueling
    And user verify the Transaction Complete screen
    Then validate add nectar card button displayed in transaction complete screen
    And user adds the Nectar card details by clicking the Add nectar card in Transaction Complete screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Verify Later button under 'Card Added successfully' alert
    Then Validate skip click on skip button
    Then verify if the user is in the Transaction Complete Screen with the context to verify the nectar card
    Then user tap on Done button in Transaction Complete screen
    And close the thank you screen if displayed

  @P11270-13179 @P11270-13178 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Transaction Complete Screen Displays Verify your Nectar card to get exclusive Esso rewards when Card is not verified and card is verified
    And user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
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
    And validate verify nectar card link displayed in transaction complete screen
    And tap on the Verify Nectar Card link in Transaction complete Screen
    Then enter "NectarCardAddAndVerify" Nectar card number and password from Transaciton complete screen
    Then verify if the user is in the Transaction Complete Screen with the context to see rewards
    Then user tap on Done button in Transaction Complete screen
    And close the thank you screen if displayed

  @P11270-13141 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Complete the Fuelling transaction with Nectar card is verified and verify the Transaction complete screen
    And user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "3" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
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
    And close the thank you screen if displayed

  @P11270-13180 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Complete the Fuelling transaction and verify the Transaction Details screen
    And user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "4" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
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
    And user taps on the Transaction Details screen
    And Verify all the fields are present in Transaction Details screen

  @P11270-10109 @P11270-10108 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify whether the user is able to see the view link in Transaction Details screen
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "5" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    When user lands on card verification screen
    And enter valid password and click on submit button
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then user checks the details in the transaction summary screen
    Then Tap on Transaction Details link in Transaction Complete Screen
    Then the system displays the view link for receipt
    And the user should view the receipt after clicking view in Transaction Details screen

  @P11270-10123 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify whether the system displays the copy text msg
    When user is on NLID screen
    When user taps on More button in tab bar
    And user navigates to Account screen
    Then user should opt out for receipts by email checkbox
    Then user should validate the receipt checkbox copy text for not opting to receive emails
    When the system displays the confirmation popup for not receiving mails
    Then tap on ok button and close receipt checkbox copy text

  @P11270-10104 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify whether the system is able to make service call and display authorization screen
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "6" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    Then user verify the confirms the payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen
    When user lands on card verification screen
    And enter valid password and click on submit button
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then user tap on Done button in Transaction Complete screen

  @P11270-10105 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify whether the system is able to display loader while authorization is in progress
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "7" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    Then user verify the confirms the payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on authorize payment screen

  @P11270-13142 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2
  Scenario: Sprint 2 Pay outside : Complete the fuelling transaction without verifying nectar card and Verify the Transaction complete screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    And navigate to the Nectar card section
    And user taps on Add nectar card in Account screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    Then user tap on verify later
    And navigate to the Nectar card section from account screen
    And user taps on More button in tab bar
    And user taps on fuel icon
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "3" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
#    And Click on Change payment link
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
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
    And validate verify nectar card link displayed in transaction complete screen
    And tap on the Verify Nectar Card link in Transaction complete Screen
    Then enter "NectarCardAddAndVerify" Nectar card number and password from Transaciton complete screen
    Then verify if the user is in the Transaction Complete Screen with the context to see rewards

  @P11270-43195 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324 @SprintiOS2323
  Scenario: Manual user - The app should display not display last 4 digits of the card number used in a COF(Master card) transaction on the Transaction complete screen
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then user land on enter PIN screen
    When user enters four digit PIN
    Then user tap on continue button in enter PIN screen
    When user lands on card verification screen
    And enter valid password and click on submit button
    Then user is navigated to start fueling now screen
    And then to now fueling
    Then user verify the Transaction Complete screen
    And user verifies the card number with asterisk is not present in the Transaction Complete screen

  @P11270-25373 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @Sprintandroid2324 @SprintiOS2322
  Scenario: Verify if the user is able to see the updated LID variation with the Add Payment Method’ button (Manual Login user)
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user clicks on edit in the added payment method without phone and other payment
    Then user taps delete in the Edit Payment Method screen
    Then user taps on delete button in the Delete popup msg
    Then app to dismiss the popup when the user taps on OK button
    And user verifies the account page
    And user taps on fuel icon and navigate to LID screen
    Then validtes the add payment button present in Lid screen

  @P11270-25368 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify if the user is able to see the updated LID variation with the Add Payment Method’ button (Manual Login user)
    Given user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "FrictEssoPsword" in login details
    And user taps login button in login screen
    And user is on NLID screen
    Given user is on NLID screen
    Then validtes the add payment button present in Lid screen

  @P11270-43189 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @Sprintandroid2324 @SprintiOS2322
  Scenario: Manual user - The app should display the last 4 digits of the card number used in a COF(Visa) transaction on the Transaction Details screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then user lands on Add debit/credit card screen
    Then enter name of the card
    Then enter "4006 3400 0000 0014" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And user clicks on continue button in card screen as the second payment method
    And user verifies the account page
    And user navigated to NLID Screen
    When user taps on start button in LID
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
    Then user verify the Transaction Complete screen
    And Tap on Transaction Details link in Transaction Complete Screen
    Then user verifies that the "VISA" payment method "0014" is present with asterisks

  @P11270-39650 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2322
  Scenario: Manual user - Verify whether app displaying ‘Google Pay’ as an available payment method in Add Payment Method screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the account page
    Then user clicks on edit in the added payment method without phone and other payment
    Then user taps delete in the Edit Payment Method screen
    Then user taps on delete button in the Delete popup msg
    Then app to dismiss the popup when the user taps on OK button
    And user verifies the account page
    Then user tap on add card button in account
    Then verify the googlepay displayed as first payment in add payment method

  @P11270-39502 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2324
  Scenario: Manual user - Verify whether app displaying ‘Google Pay’ as an available payment method in Add Payment Method screen
    Given user is on NLID screen
    And user taps on add payment button present in Lid screen
    Then user verifies the Add Payment method screen
    Then verify the googlepay displayed as first payment in add payment method

  @P11270-39890 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2321
    Scenario: Verify the app is displaying the "GPay" payment button
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the account page
    Then user tap on add card button in account
    When user taps on Google pay in Add Payment Method screen
    Then user validates the popup after adding Google Pay
    Then user taps on OK button in the Google Pay
    When user taps on fuel icon and navigate to LID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    Then the user validates whether Gpay button is updated in the Confirm Payment screen

  @P11270-39687 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2414
  Scenario:Manual user -See whether app displaying Google Pay as payment method in the Account screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the account page
    Then user should see GooglePay title
    Then user verifies Edit GooglePay button
    Then user should see GooglePay subtitle

  @P11270-39710 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2415
  Scenario:Manual User -Verify whether app displaying Google Pay unlinked pop-up to the user and able to Cancel the popup
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the account page
    Then user should see GooglePay title
    Then user verifies Edit GooglePay button
    Then user taps on unlink button for Google pay
    Then user cancels the Google pay unlink

  @P11270-39716 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2415
  Scenario:Manual User -Verify whether app is able to unlink Google Pay
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the account page
    Then user should see GooglePay title
    Then user verifies Edit GooglePay button
    Then user taps on unlink button for Google pay
    Then user cancels the Google pay unlink
    Then user taps on unlink button for Google pay
    Then user unlinks the Google pay
    Then user taps on OK button in the Google Pay
    Then user tap on add card button in account
    When user taps on Google pay in Add Payment Method screen
    Then user validates the popup after adding Google Pay
    Then user taps on OK button in the Google Pay

  @P11270-39693 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2414
  Scenario:Manual user -See whether app displaying Google Pay as payment method in the Choose Default method in Account screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the account page
    Then user tap on add card button in account
    When user taps on Credit Debit card in Add Payment Method screen
    Then enter name of the card
    Then enter "4147 4630 1111 0083" card number
    Then enter expiry date
    Then enter CVV
    Then enter postal code
    Then enter address line1
    Then enter Address line2
    Then enter city
    Then check consent checkbox
    And tap on continue button in add payment screen
    And user clicks on ok button in card added message
    Then Click on Choose Default Card link
    Then user taps cof edit
    Then user taps delete in the Edit Payment Method screen
    Then user taps on delete button in the Delete popup msg
    Then app to dismiss the popup when the user taps on OK button

  @P11270-39722 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2414
  Scenario:Manual user -Verify whether App displaying the google pay already linked pop-up to the user
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the account page
    And user tap on add card button in account
    And user taps on Google Pay from existing payment method
    Then user should display google pay already linked pop-up to the user
    And user taps on OK on the google pay already linked pop-up

  @P11270-39704 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2415
  Scenario:Manual user -Verify whether App displaying the google pay already linked pop-up to the user
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the account page
    And user tap on add card button in account
    And user taps on Google Pay from existing payment method
    Then user should display google pay already linked pop-up to the user
    And user taps on OK on the google pay already linked pop-up


  @P11270-39889 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2321
    Scenario: Verify the app is displaying Google Pay as the selected payment method on the Confirm Payment screen (Site Check-In)
     Given user is on NLID screen
     When user taps on start button in LID
     And user is navigated to Select your pump screen
     And user selects pump number "1" to start fuelling
     And user selects the pump from 'Select your Pump' page and taps on continue button
     When user tap on Continue button in MFA screen
     Then the user is navigated to Confirm payment screen
     Then the user validates whether Google Pay is updated in the Confirm Payment screen

  @P11270-39891 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2321
   Scenario: Verify the app is displaying Google Pay as the selected payment method on the Confirm Payment screen when Pump is changed
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user validates the confirm payment screen and validates the pump number "1"
    When the user taps on edit button in the selected pump
    And user selects pump number "4" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    Then the user validates the confirm payment screen and validates the pump number "4"
    Then the user validates whether Google Pay is updated in the Confirm Payment screen

  @P11270-39892 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2321
   Scenario: Verify the app is displaying Google Pay as the selected payment method on the Confirm Payment screen when MFA is changed
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user validates whether "100" is updated in the Confirm Payment screen
    When the user taps on edit button in the Mfa section
    When the user taps "70" in the ruler in the Mfa screen and validates the continue button is updated
    When user tap on Continue button in MFA screen
    Then the user validates whether "70" is updated in the Confirm Payment screen
    Then the user validates whether Google Pay is updated in the Confirm Payment screen

  @P11270-39898 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2321
    Scenario: Verify the app is displaying Google Pay as a "Selected payment method" on the "Payment Details" screen
     Given user is on NLID screen
     When user taps on start button in LID
     And user is navigated to Select your pump screen
     And user selects pump number "1" to start fuelling
     And user selects the pump from 'Select your Pump' page and taps on continue button
     When user tap on Continue button in MFA screen
     Then the user is navigated to Confirm payment screen
     When the user taps on edit button in the payment method in confirm payment screen
     Then the user validates Google Pay payment method present in payment details screen

  @P11270-39906 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2321
  Scenario: Manual user - Verify the app is displaying Google Pay as the 1st payment method
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    When the user taps on edit button in the payment method in confirm payment screen
    Then verify the google pay displayed as a first payment

  @P11270-39895 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2321
  Scenario: Verify the app is allowing the user to cancel the Google Pay payment
    Given user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user validates whether Google Pay is updated in the Confirm Payment screen
    When user taps on cancel button from confirm payment screen
    Then user validates the cancel transaction popup
    When user taps on cancel trasaction button in the cancel transaction popup
    And user taps on More button in tab bar
    When user navigates to Account screen
    When user unlink the added googlepay payment
    Then user validates the popup once the unlink is clicked
    And user taps on unlink button
    When verify the displayed popup once it is unlinked
    Then user taps on OK button in popup

  @P11270-13190 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Select your Pump Screen while PayOutside
    Given user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen

  @P11270-29475 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2320 @SprintiOS2320
  Scenario: Verify app should display a static message “Don’t lift the nozzle just yet.“ (Manual Registered User - Site CheckIn)
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then validate the message Dont lift the nozzle just yet

  @P11270-29499 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2320 @SprintiOS2320
  Scenario: Verify app should display a static message “You can lift the nozzle now.“ (Manual Registered User - Site CheckIn)
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then validate the message Dont lift the nozzle just yet
    Then user is navigated to start fueling now screen
    Then validate the title You can lift the nozzle now

  @P11270-25922 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2320 @SprintiOS2320
  Scenario: Verify that system should able to display  the ‘Check you’ve paid before leaving' pop-up on start fueling screen. (site checkin)
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "1" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then validate the title and message of the custom popup in start fueling screen then taps on Ok button

  @P11270-26060 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2320 @SprintiOS2320
  Scenario: Check if user is able to close the pop up manually if they want to by selecting 'ok' on the pop up window of Drive Off in Login flow
    Given user is on NLID screen
    When user taps on start button in LID
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms card payment
    Then validate the title and message of the custom popup in start fueling screen then taps on Ok button
    And then to now fueling
    And user verify the Transaction Complete screen

  @P11270-13110 @P11270-13114 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Add nectar card from Payment details screen after adding nectar card
    And user is on NLID screen
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
    And user verifies Payment details screen before adding nectar card
    And user adds the Nectar card details by clicking the Add nectar card in Payment details screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Verify Later button under 'Card Added successfully' alert
    Then user lands on Verify Card Screen and taps on skip button
    Then user verify the payment details screen with Nectar card

  @P11270-13140 @P11270-13144 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Add and verify nectar card from Payment details screen
    And user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    When user taps on fuel icon and start fuelling button
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And Click on Change payment link
    And user adds the Nectar card details by clicking the Add nectar card in Payment details screen
    Then user is navigated to add nectar screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    Then enter "NectarCardAddAndVerify" Nectar card number and password
    Then user verify the payment details screen with Nectar card

  @P11270-15633 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify whether system should display a pop-up on the ‘Confirm payment’ screen when the user taps on the edit button
    And user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And navigate to the Nectar card section
    And Delete the Nectar card if it is present
    When user taps on fuel icon and start fuelling button
    And user is navigated to Select your pump screen
    And user selects pump number "2" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And Click on reward Edit button in Payment confirmation screen
    Then Verify the Message is displayed
    And Click Ok button on Redemption Popup

  @P11270-10106 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify whether the system is able to cancel the transaction when the user taps on cancel option
    And user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "8" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    When user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    Then user verify the confirms the payment screen
    And user confirms the payment
    Then user lands on authorize payment screen
    When user taps on cancel button in the 'Start fuelling now' page
    Then the system displays the cancellation popup
    And app to dismiss the popup when the user taps on OK button
    And system cancels the transaction and returns to the 'Confirm Payment' Screen

  @P11270-10107 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify whether the user is able to see the following elements on the Transaction summary screen
    When user is on NLID screen
    When user taps on start button in LID
    And user is navigated to Select your pump screen
    And user selects pump number "9" to start fuelling
    And user selects the pump from 'Select your Pump' page and taps on continue button
    And user verify the MFA screen
    And user tap on Continue button in MFA screen
    Then the user is navigated to Confirm payment screen
    And user confirms the payment
    Then the system should display the authorization screen
    Then user checks the details in the transaction summary screen
    Then Tap on Transaction Details link in Transaction Complete Screen
    Then Verify all the fields are present in Transaction Details screen

  ################################################################################################################
#  @P11270-13182 @AndroidRegression1 @IosRegression @PayOutside1 @PayOutside1_Failed
#  Scenario: View "Transaction Details" Screen When Loyalty discounted for fuelling
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on More button in tab bar
#    And user navigates to Account screen
#    And delete added nectar card if exists
#    And user adds a nectar card and taps verify later
#	When user taps on fuel icon and start fuelling button
#    And verify the Select Your Pump Screen
#    And user taps on continue button in Select Your Pump Screen
#    Then user verify the confirms the payment screen
#    And user confirms the payment
#    Then user verify the Authorising your payment screen
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    Then user verify the Transaction Complete screen
#    And user taps on the Transaction Details screen
#    Then user verify the Transaction Details screen
#    Then user verify the Loyalty discounted for fuelling


#  @P11270-13184 @AndroidRegression1 @IosRegression @PayOutside1 @PayOutside1_Failed
#  Scenario: Contextual Tips - Maximum fueling amount selection
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on fuel icon and start fuelling button
#    And verify the Select Your Pump Screen
#    And user taps on continue button in Select Your Pump Screen
#    Then user verify the confirms the payment screen
#    And user confirms the payment
#    Then user verify the Authorising your payment screen
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    Then user verify the Transaction Complete screen
#    And user taps on the Transaction Details screen
#    Then user verify the Transaction Details screen
#    Then user verify the Loyalty discounted for fuelling

#  @P11270-13185 @AndroidRegression1 @IosRegression @PayOutside1 @PayOutside1_Failed
#  Scenario: Contextual Tips - Maximum fueling amount selection
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on fuel icon and start fuelling button
#    And verify the Select Your Pump Screen
#    And user taps on continue button in Select Your Pump Screen
#    Then user verify the confirms the payment screen
#    And user confirms the payment
#    Then user verify the Authorising your payment screen
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    Then user verify the Transaction Complete screen
#    And user taps on the Transaction Details screen
#    Then user verify the Transaction Details screen
#    Then user verify the Loyalty discounted for fuelling

#  @P11270-13186 @AndroidRegression1 @IosRegression @PayOutside1 @PayOutside1_Failed
#  Scenario: Complete the fuelling transaction with Nectar card verified  and without selecting the redeem points
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on More button in tab bar
#    And user navigates to Account screen
#    And delete added nectar card if exists
#	When user taps on fuel icon and start fuelling button
#    And verify the Select Your Pump Screen
#     And user selects the payment method under 'Select your pump' page
#    And user adds the Nectar card details by clicking the Add nectar card in Payment details screen
#    Then user is navigated to add nectar screen
#    And enter nectar card value and tap on next button
#    When user clicks on Continue button under 'Card Added successfully' alert
#    Then user enters valid nectar details in verify nectar screen
#    And user confirms the payment
#    Then user verify the Authorising your payment screen
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    Then user verify the Transaction Complete screen
#    And user taps on the Transaction Details screen
#    Then user verify the Transaction Details screen
#    Then user verify the Loyalty discounted for fuelling
#
#  @P11270-13187 @AndroidRegression1 @IosRegression @PayOutside1 @PayOutside1_Failed
#  Scenario: Redemption Offers - "Save on fuel with points "  offers Screen
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#	When user taps on fuel icon and start fuelling button
#    And verify the Select Your Pump Screen
#    And user taps on continue button in Select Your Pump Screen
#    Then user verify the confirms the payment screen
#    And user confirms the payment
#    Then user verify the Authorising your payment screen
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    Then user verify the Transaction Complete screen
#    And user taps on the Transaction Details screen
#    Then user verify the Transaction Details screen
#    Then user verify the Loyalty discounted for fuelling

#  @P11270-13190 @AndroidRegression1 @IosRegression @PayOutside1
#  Scenario: Select your Pump Screen while Pay Out side
##Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on fuel icon and start fuelling button
#    And verify the Select Your Pump Screen
#    And verify below are the elements
#      | Maximum fueling amount: |
#      | Change Payment Details  |

#  @P11270-13192 @AndroidRegression1 @IosRegression @PayOutside1
#  Scenario: Sprint 2 Pay outside :  "Confirm Payment screen - by choosing highlighted offer
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on fuel icon and start fuelling button
#    And verify the Select Your Pump Screen
#    And user taps on continue button in Select Your Pump Screen
#    Then user verify the confirms the payment screen

#  @P11270-13142 @AndroidRegression1 @IosRegression @PayOutside1 @P11270-13142_Payoutside
#  Scenario: Complete the fuelling transaction without verifying nectar card and Verify the Transaction complete screen
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on More button in tab bar
#    And user navigates to Account screen
#    And delete added nectar card if exists
#    And user adds a nectar card and taps verify later
#    When user taps on fuel icon and start fuelling button
#    And user verifies the Select your Pump Screen
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms the payment
#    Then user verify the Authorising your payment screen
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And user verify the Transaction Complete screen
#    Then user verifies the Verify Nectar card link in the Transaction Complete screen
#    And user taps on the Transaction Details screen
#    Then user verifies the Transaction Details screen from Transaction complete screen

#  @P11270-13182 @AndroidRegression1 @IosRegression @PayOutside1 @PayOutside1_Failed @AndroidRegressionR221d
#  Scenario: View "Transaction Details" Screen When Loyalty discounted for fuelling
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
#    Then Tap on Transaction Details link in Transaction Complete Screen
#    Then Verify all the fields are present in Transaction Details screen including loyalty points
#    Then Verify the points redeemed in transaction details screen

#  @P11270-13183 @AndroidRegression1 @IosRegression @PayOutside1 @PayOutside1_Failed @AndroidRegressionR221d
#  Scenario: View "Transaction Complete" Screen Points redemption applied for fuelling
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
#    Then Verify the loyalty discount amount format is correct
#    Then Tap on Transaction Details link in Transaction Complete Screen
#    Then Verify the loyalty discount amount format is correct

#  @P11270-13186 @AndroidRegression1 @IosRegression @PayOutside1 @PayOutside1_Failed  @AndroidRegressionR221d
#  Scenario: Complete the fuelling transaction with Nectar card verified  and without selecting the redeem points
##    When user log out from the app if logged in
##    Then user is in login screen
##    When I enter "profileCompleted" in login details
##    And user taps login button in login screen
#    When user is on NLID screen
#    When user taps on start button in LID
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user verify the MFA screen
#    And user tap on Continue button in MFA screen
#    Then the user is navigated to Confirm payment screen
#    And user confirms the payment
#    Then the system should display the authorization screen
#    Then user checks the details in the transaction summary screen
#    Then Tap on Transaction Details link in Transaction Complete Screen
#    Then Verify all the fields are present in Transaction Details screen including loyalty points
#    Then Verify the points redeemed for no offers selected in transaction details screen
#
#  @P11270-13187 @AndroidRegression1 @IosRegression @PayOutside1 @PayOutside1_Failed @AndroidRegressionR221d
#  Scenario: Redemption Offers - "Save on fuel with points "  offers Screen
##    When user log out from the app if logged in
##    Then user is in login screen
##    When I enter "profileCompleted" in login details
##    And user taps login button in login screen
#    When user is on NLID screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user clicks on continue button in pump screen
#    And the user is navigated to the Redemption screen
#    And verify save on fuel with points on redemption screen
#
#  @P11270-13193 @AndroidRegression1 @IosRegression @PayOutside1 @AndroidRegressionR221d
#  Scenario: CHOOSE AN OPTION OR CONTINUE section
##    When user log out from the app if logged in
##    Then user is in login screen
##    When I enter "profileCompleted" in login details
##    And user taps login button in login screen
#    When user is on NLID screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user clicks on continue button in pump screen
#    And the user is navigated to the Redemption screen
#    Then user verifies CHOOSE AN OPTION OR CONTINUE section

#  @P11270-10103 @AndroidRegression1 @IosRegression @PayOutside1
#  Scenario: Verify whether the system is unable to send the transaction receipt when check-box for receipt preference is not selected by the user
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on More button in tab bar
#    And user navigates to Account screen
#    Then user should opt out for receipts by email checkbox
#    Then user should validate the receipt checkbox copy text for not opting to receive emails
#    When the system displays the confirmation popup for not receiving mails
#    Then tap on ok button and close receipt checkbox copy text
#    When user taps on fuel icon and start fuelling button
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user verify the MFA screen
#    When user tap on Continue button in MFA screen
#    Then user verify the confirms the payment screen
#    And user confirms the payment
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    Then user taps on done button after finishing fuelling

#  @P11270-13109 @AndroidRegression1 @IosRegression @PayOutside1
#  Scenario: Verify whether the user is able to see the help screen and alignment
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on More button in tab bar
#    And user taps on Support Centre icon
#    And system should display the tutorial screen
#    Then user verifies the first screen
#    And user taps on next button in the Tutorial screen one of the Help screen
#    And user taps on next button in the Tutorial screen two of the Help screen
#    Then user verifies the third screen

#  @P11270-10108 @AndroidRegression1 @PayOutside1
#  Scenario: Verify whether the user is able to view the receipt after clicking view in Transaction Details screen
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on fuel icon and start fuelling button
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms the payment
#    Then the system should display the authorization screen
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    When user checks the Transaction Details in the transaction summary screen
#    And the user should view the receipt after clicking view in Transaction Details screen

#  @P11270-10102 @AndroidRegression1 @IosRegression @PayOutside1
#  Scenario: Verify whether the system is able to send the transaction receipt when check-box for receipt preference is selected by the user
#    Then user is in login screen
#    When I enter "menu" in login details
#    And user taps login button in login screen
#    When user taps on More button in tab bar
#    And user navigates to Account screen
#    Then user should opt for receipts by email checkbox
#    And user should validate the receipt checkbox copy text
#    When the system displays the confirmation popup
#    Then tap on ok button and close receipt checkbox copy text
#    When user taps on fuel icon and start fuelling button
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms the payment
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    Then user taps on done button after finishing fuelling
#
#  @P11270-10103 @AndroidRegression1 @IosRegression @PayOutside1
#  Scenario: Verify whether the system is unable to send the transaction receipt when check-box for receipt preference is not selected by the user
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on More button in tab bar
#    And user navigates to Account screen
#    Then user should opt out for receipts by email checkbox
#    Then user should validate the receipt checkbox copy text for not opting to receive emails
#    When the system displays the confirmation popup for not receiving mails
#    Then tap on ok button and close receipt checkbox copy text
#    When user taps on fuel icon and start fuelling button
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms the payment
#    And Verify that Please wait screen is displayed
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    Then user taps on done button after finishing fuelling

  #  @P11270-13139 @AndroidRegression1 @iOSRegression @PayOutside1
#  Scenario: From LID add nectar card and verify the nectar card
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on More button in tab bar
#    And user navigates to Account screen
#    And delete added nectar card if exists

#  @P11270-13141 @AndroidRegression1 @IosRegression @PayOutside1
#  Scenario: Complete the Fuelling transaction with Nectar card is verified and verify the Transaction complete screen
##    Then user is in login screen
##    When I enter "menu1" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on More button in tab bar
#    And user navigates to Account screen
#    And delete added nectar card if exists
#    When user taps on fuel icon and start fuelling button
#    And user verifies the Select your Pump Screen
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms the payment
#    And the system should display the loader when authorization is in progress
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And user verify the Transaction Complete screen
#    And user adds the Nectar card details by clicking the Add nectar card in Transaction Complete screen
#    Then user is navigated to add nectar screen
#    And enter nectar card value and tap on next button
#    When user clicks on Continue button under 'Card Added successfully' alert
#    And user enters valid nectar details in verify nectar screen
#    And user verify the Transaction Complete screen
#    Then user tap done in the Transaction Complete screen


#  @P11270-13179 @P11270-13178 @AndroidRegression1 @IosRegression @PayOutside1
#  Scenario: Transaction Complete Screen Displays Verify your Nectar card to get exclusive Esso rewards when Card is not verified
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#    When user taps on More button in tab bar
#    And user navigates to Account screen
#    And delete added nectar card if exists
#    And user adds a nectar card and taps verify later
#    When user taps on fuel icon and start fuelling button
#    And user verifies the Select your Pump Screen
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms the payment
#    Then user verify the Authorising your payment screen
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And user verify the Transaction Complete screen
#    Then user verifies the Verify Nectar card link in the Transaction Complete screen


#  @P11270-13181 @AndroidRegression1 @IosRegression @PayOutside1 @PayOutside1_Failed
#  Scenario: Transaction Complete Screen navigating to Add Nectar Card when card is not added
##    Then user is in login screen
##    When I enter "menu" in login details
##    And user taps login button in login screen
#    And close the modal popup
#	When user taps on More button in tab bar
#    And user navigates to Account screen
#    And delete added nectar card if exists
#    When user taps on fuel icon and start fuelling button
#    And user verifies the Select your Pump Screen
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user confirms the payment
#    Then user verify the Authorising your payment screen
#    Then Start fuelling screen now is displayed
#    And Now fuelling displayed
#    And user verify the Transaction Complete screen
#    And user adds the Nectar card details by clicking the Add nectar card in Transaction Complete screen
#    Then user is navigated to add nectar screen

  #    Then the user is navigated to Confirm payment screen
#    And Tap on Payment method edit button
#    Then verify if the user lands on Payment Details Screen
#    When user selects the Challenge flow card and tap on update button
#    Then user verify the confirms the payment screen
#    And user confirms card payment
#    Then user land on enter PIN screen
#    When user enters four digit PIN
#    Then user tap on continue button in enter PIN screen
#    Then user verify the Authorising your payment screen
#    Then user is navigated to start fueling now screen
#    And Now fuelling displayed
#
#  @P11270-23517 @iOSRegression @iOSRegressionSet2 @AndroidRegression1 @AndroidRegressionSet2 @Sprint2320_21_Blocked
#  Scenario: User should see Offer specific BW screen post the fueling flow associated with the site with specified content on offer screen and title 3 should be hyperlink navigating to external webpage for details
#    When user is on NLID screen
#    When user taps on start button in LID
#    And user is navigated to Select your pump screen
#    And user selects pump number "4" to start fuelling
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#    And user verify the MFA screen
#    And user tap on Continue button in MFA screen
#    Then the user is navigated to Confirm payment screen
#    And user confirms the payment
#    Then the system should display the authorization screen
#    And user verify the Transaction Complete screen
#    Then user tap done in the Transaction Complete screen
#    Then user verifies is Navigated to the BW screen