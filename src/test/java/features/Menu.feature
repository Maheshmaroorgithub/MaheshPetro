@Menu
Feature: Menu

  @P11270-5005 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to allow user to enter new password
    When user log out from the app if logged in
    And user clicks on Login Icon
    And I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    Given user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters the current password from the "regressioncredentials2"
    And user verifies the New Password textbox in Edit Password
    Then user tap on Done button
    Then user verifies the inline error message in password section Edit Password screen
    And user enters New Password
    Then user verifies the updated password rules in Edit Password screen
    And user enter the "IncorrectPwd" in new password and verify the values
    Then user tap on Done button
    Then user verifies the validation message in the Password section in Edit Password screen
    And user enter the "AsciiCharacters32to61" in new password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters62to91" in new password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters92to121" in new password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters122to126" in new password and verify the values
    Then user tap on Done button

    #  The below TC fails in Android due to this defect - P11270-25575
  @P11270-13254 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Verify for login user the updated URL to be displayed when user is tapping on FAQs link in more option
    Given user is on NLID screen
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    When User click on the Frequently asked Question link
    And user click on Loyalty points
    And user click on nectar link in loyalty points
    And tap on FAQ link in the nectar section
    Then user verifies the faq link

  @P11270-36704 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify that the app should not display the ‘Esso App Feedback’ section on the 'Support Centre' screen. (Normal user - LID)
    Given user is on NLID screen
    When user taps on More button in tab bar
    And user taps on Support Centre icon
    Then user verifies the esso app feedback section is not present

  @P11270-5006 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display Confirm new password field for Edit Password screen
    Given user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters the current password from the "regressioncredentials2"
    And user verifies the New Password textbox in Edit Password
    And user enters New Password
    And user Taps on show button and verify the new password typed is shown to the user
    Then user taps on hide button and verify the masked password in new password
    Then user verifies the Confirm new password text box
    And user enter the "AsciiCharacters32to61" in confirm password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters62to91" in confirm password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters92to121" in confirm password and verify the values
    Then user tap on Done button
    And user enter the "AsciiCharacters122to126" in confirm password and verify the values
    Then user tap on Done button

  @P11270-5031 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
  Scenario: Check whether System to navigate to Transaction Details screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    And transaction for last 90 days
    And the deatils as Date, Time, Transaction Amount
    And user taps on select button in transaction history
    And System should display Email Receipt button with Disable state
    And user select any Transaction Checkbox History
    Then user taps on Email receipt Button
    Then user should able to see Popup with text as Receipts sent via email
    And user taps on Ok Button
#    Then user tap on transaction list
#    And user is navigated to transaction details

  @P11270-5033 @P11270-4993 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to navigate to Transaction Details screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    And transaction for last 90 days
    And the deatils as Date, Time, Transaction Amount
    Then user tap on transaction list
    And user is navigated to transaction details
    And user validate vat receipt view link

  @P11270-5040 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: To verify that system will display following details for the Help screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    Then validate the Support Centre page options

  @P11270-5002 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to allow user to update the First name and Last name
    Given user is on NLID screen
    And user taps on More button in tab bar
    Then user navigates to Account screen
    When user edit name by entering firstname and lastname
    And tap on update button
    Then verify the Updated message is displayed
    And verify navigate back to account screen after tapping ok button
    When user taps on fuel icon and navigate to LID screen
    #And user verifies whether the system landed in LID

  @P11270-5003 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to allow user to enter current password
    Given user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    Then user verifies the Current password text box
    Then user tap on Done button
    Then user verifies the inline error message in Current password
    And user enters the current password from the "regressioncredentials2"
    And user Taps on show button and verify the current password "regressioncredentials2" shown to the user
    Then user taps on hide button and verify the masked password

  @P11270-5004 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display incorrect password prompt
    Given user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters incorrect Current password
    And user enters New Password
    And user enters Confirm New Password
    Then user tap on Done button
    Then user verifies the popup containing current password is wrong
    And Tap on OK button
    Then user verifies the edit password title

  #  This TC fails in iOS due to inline error issue - P11270-20981
  @P11270-5007 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether system Perform validation for New password and Confirm new password fields
    Given user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user verifies the user profile title and the icon in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters the current password from the "regressioncredentials2"
    And user enters New Password
    And user enters different Confirm New Password
    And user tap on Done button
    Then user verify the error message for password mismatch

  @P11270-5009 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display Payment Method section in Account
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user veify the display the available payment methods under the payment method section

  @P11270-5024 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display receipt subscription checkbox
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user should opt out for receipts by email checkbox
    Then user should validate the receipt checkbox copy text for not opting to receive emails
    Then tap on ok button and close receipt checkbox copy text
    Then user should opt for Offers by email checkbox
    And user should validate the offer checkbox copy text for opting to receive emails
    Then tap on ok button and close receipt checkbox copy text

  @P11270-5025 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display offers checkbox
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user should opt for Offers by email checkbox
    And user should validate the offer checkbox copy text for opting to receive emails
    Then tap on ok button and close receipt checkbox copy text
    Then user should opt out for Offers by email checkbox
    And user should validate the offer checkbox copy text for not opting to receive emails
    Then tap on ok button and close receipt checkbox copy text

  @P11270-5030 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check the ability of the user to view Transaction history screen
    Given user is on NLID screen
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    Then user verify the Transaction History screen
    When user taps on any of the Transaction infos from list
    Then user should navigate to transaction details screen
    When user taps on back Arrow from transaction details
    Then user should navigate to Transaction History Screen

  @P11270-5032 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display Copy Text as prompt, as user taps Email Receipt button
    Given user is on NLID screen
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    When user taps on Select Button
    Then System should display Email Receipt button with Disable state
    When user select any Transaction Checkbox History
    When user taps on Email receipt Button
    Then user should able to see Popup with text as Receipts sent via email
    When user taps on Ok Button
    Then user verify the Transaction History screen

  @P11270-5034 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether ability of system to display the VAT Receipt link as per following scenarios
    Given user is on NLID screen
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    Then user tap on transaction list
    And user validate vat receipt view link
    Then user tap on view vat receipt and validate

  @P11270-37000 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1  @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in History screen (when there are receipt)
    When user is on NLID screen
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    Then user validates that the app assistant is not present

  @P11270-5035 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether Ability of user to add a note to the Transaction Details
    Given user is on NLID screen
    When user taps on History icon from footers
    Then user should navigate to Transaction History Screen
    Then user tap on transaction list
    Then user tap on Add note link
#    And enter a note and save
#    Then validate the entered note

  #    In iOS, unable to verify Tell a Friend content
  @P11270-5037 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display the updated Copy Text XX as the message along with the link shared
    Given user is on NLID screen
    And user taps on More button in tab bar
    Then user taps on Tell a Friend
#    Then user verifies whether user lands in the Tell a friend screen
    Then user verifies the Tell a friend screen
    Then user taps on Tell a friend button in Tell a friend screen
  #    Then user verifies the tell a friend content in the display
  #    Then user taps message button in the Tell a friend option
  #    And verify the tell a friend content

  @P11270-5038 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display the updated prompt when user opt in for the news and promotions
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user should opt for Offers by email checkbox
    And user should validate the offer checkbox copy text for opting to receive emails
    Then tap on ok button and close receipt checkbox copy text

  @P11270-5039 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display the updated prompt when user opt out for the news and promotions
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user should opt out for Offers by email checkbox
    And user should validate the offer checkbox copy text for not opting to receive emails
    Then tap on ok button and close receipt checkbox copy text

  @P11270-5042 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: To verify that system will display following topics under FAQ.
    Given user is on NLID screen
    And user taps on More button in tab bar
    And user taps on Support Centre icon
    Given User click on the Frequently asked Question link
    Then Validate the header of Frequently asked Question title "Frequently Asked Questions"
    Then Validate all the Frequently Asked Question Header
      | How the app works              |
      | Payments & Billing             |
      | Safety and Security            |
      | Loyalty Points                 |
      | Benefits of Using the Esso App |
      | Technical                      |
      | Communications & Data Privacy  |

  @P11270-5052 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display Products and Information screen in sections
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Products and Information screen
    Then verify the about Esso fuel products & Information

  @P11270-5028 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System to display display LOG OUT button
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps LogOut button in Account screen
    Then verify user is on non logged in Dashboard

  @P11270-4988 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check whether System displays following Tabs for the Global Tab Bar
    When user log out from the app if logged in
    Then verify user is on non logged in Dashboard
    Then user able to view Fuel, Station, Offers
    And History,More

  @P11270-4994 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check user is not allowed to access Offers from non logged-in dashboard if accessed from tab bar
    Given user is on NLID screen
    When user taps on More button in tab bar
    Then user taps on Offers
    And verify user is able to see login popup
    Then user taps on ok button
    And verify system navigating to login page

  @P11270-4995 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
  Scenario: Check user is not allowed to access History from non logged-in dashboard if accessed from tab bar
    Given user is on NLID screen
    Then user taps on History
    And verify user is able to see login popup
    Then user taps on ok button
    And verify system navigating to login page

#
  #@P11270-5016 @IosRegression @AndroidRegression1 @Menu1
  #Scenario: Check whether System to turn off the location services
    #Given user is on NLID screen
    #Then user is in login screen
    #When I enter "menu" in login details
    #And user taps login button in login screen
    #When user navigates to Fuel Finder screen and enable the location
    #And user taps on More button in tab bar
    #When user navigates to Account screen to verify the device settings
    #And user navigates to Location services in the Account screen
    #And user navigates to Device settings to turn off the Location services
    #And user taps on location button in Device level setting
    #And user taps on Never button in Device level setting
    #When user kill and relaunch the app
    #And user verify the Location services is disabled
#

#
  #@P11270-5019 @IosRegression @AndroidRegression1
  #Scenario: Check whether System to turn off the Notification
    #Given user is on NLID screen
    #Then user is in login screen
    #When I enter "menu" in login details
    #And user taps login button in login screen
    #When user navigates to Fuel Finder screen and enable the location
    #And user taps on More button in tab bar
    #When user navigates to Account screen to verify the device settings
    #And user taps on Go To Settings link under notifications section
    #Then verify the user is navigated to device permission screen
    #And Disable the notification access
    #When user kill and relaunch the app
    #And user taps on More button in tab bar
    #When user navigates to Account screen
    #And user taps on Go To Settings link under notifications section
    #And enable back the notification services
#
#
#  @P11270-5046 @iOSRegression @iOSRegressionSet11 @AndroidRegsressionR221
#  Scenario: To verify that system will display Esso App feedback screen 4
#    Given user is on NLID screen
#    And user taps on More button in tab bar
#    And user taps on Support Centre icon
#    When User click on the Esso App Feedback
#    Then User taps on Give Us more feedback
#    And verify the Esso App feedback screen
#
#
#  @P11270-5049 @P11270-5050 @iOSRegression @iOSRegressionSet11 @AndroisdRegressionR221
#  Scenario: To verify that system to display a prompt, when user has given feedback or blank feedback.
#    Given user is on NLID screen
#    And user taps on More button in tab bar
#    And user taps on Support Centre icon
#    Then validate the Support Centre page options
#    When User click on the Esso App Feedback
#    Then User taps on Give Us more feedback
#    And user give stars for First Statement
#    Then user give stars for Second Statement
#    And user give stars for Third Statement
#    Then user give stars for Fourth Statement
#    Then click on the SEND FEEDBACK button
#    And verify the prompt message as "Thanks for your feedback."
#    Then Tap on OK button
#    And verify promt id getting closed and user navigated back to Suport Screen
#
#  @P11270-5047 @iOSRegression @iOSRegressionSet11 @AndroidRegsressionR221
#  Scenario: To verify that system will display text box below the statement reviews in feedback screen 4
#    Given user is on NLID screen
#    And user taps on More button in tab bar
#    And user taps on Support Centre icon
#    When User click on the Esso App Feedback
#    Then User taps on Give Us more feedback
#    And verify text box the statement reviews
#    And user enters maximum characters including Ascii characters in Esso Feedback
#    Then user verifies the character count entered in the Textbox feedback