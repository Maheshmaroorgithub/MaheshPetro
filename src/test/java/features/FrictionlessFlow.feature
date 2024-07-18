@Frictionless
Feature: FrictionlessFlow

	@P11270-12904 @P11270-12912 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Validate invalid password popup error message "Due to security reasons you need to login again.Button: OK"
		Given user log out from the app if logged in
		And user clicks on Login Icon
		When I enter "FrictEssoPsword" in login details
		And user taps login button in login screen
		And user is on NLID screen
#		When user taps on fuel icon and start fuelling button
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		And user selects pump number "1" to start fuelling
		And user selects the pump from 'Select your Pump' page and taps on continue button
		When user tap on Continue button in MFA screen
		Then the user is navigated to Confirm payment screen
		And user confirms card payment
		Then user land on enter PIN screen
		And user should enter wrong PIN three times
		Then Verify user is navigated to Enter Password screen
		When user enter invalid password in enter password screen
		Then user able to see invalid password popup message
		And Verify that User is navigate back to NLID screen

	@P11270-12786 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System to show inline error message when user leaves the field blank and clicks on continue
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
#		Then user tap on add card button in account
		Then user lands on Add debit/credit card screen
		And user taps on card number field
		Then check consent checkbox
		And tap on continue button in add payment screen
		Then user verifies the inline error message for card number field

	@P11270-12822 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether System to display CT as prompt when user tap on the ‘Edit’ button i. CT[Message: Are you sure you want to delete this card?, Button: CANCEL, DELETE]
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
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
		And user click the edit card button with no mobile and no paypal
		And user should verify the last four digit of card number
		And user tap on Delete Card button
		And user should verify the CT "Are you sure you want to delete this card?"
		And user should verify cancel and delete button

	@P11270-12824 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays user able to enter maximum of fifty characters
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on City field
		Then user enters maximum of fifty characters above fifty user will not be able to enter

	@P11270-12826 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the default input text for the City field under Billing Details section as'City'
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the default input text for the City field under Billing Details Section

	@P11270-12787 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: System to display the entered card number in the format XXXX XXXX XXXX XXXX
		And user log out from the app if logged in
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		And verify elements displayed in Add Card Screen
		And Enter name Card Name
		And Verify card number in valid format

	@P11270-12815 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the united kingdom in Billing details screen
		And user log out from the app if logged in
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
		When user taps on add payment method
#		Then Verify user is navigated to Add Payment Method screen
		When user taps on Credit Debit card in Add Payment Method screen
		And user scrolls to Country name under Billing Details Section
		Then user verifies the Country name as 'United Kingdom' by default

	@P11270-12858 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: System to close the info overlay as user taps on ‘GOT IT’ button
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		And Click on i icon in the security field
		Then Click on Got it button on popup screen

	@P11270-12832 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the list of address in postcode lookup screen
		And user log out from the app if logged in
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
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Set Up pin screen with numeric keypad
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons
		And user verifies the list of address in postcode lookup screen

	@P11270-12853 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the entered numbers in post code field
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
		When user taps on add payment method
#		Then Verify user is navigated to Add Payment Method screen
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		When user enters the postcode in the billing Details screen
		Then verify whether the entered postcode is alphanumeric and also the postcode length

	@P11270-12919 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the native picker while clicking the Expiry month and date
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
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then enter expiry date

	@P11270-12882 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Scenario: Check Whether System displays the popup message for i icon next to consent to app checkbox field
		And user log out from the app if logged in
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
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then enter name of the card
		Then enter "5232 0500 0019 0003" card number
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		Then enter address line1
		Then enter Address line2
		Then enter city
		Then user verifies and clicks the i icon next to consent checkbox

	@P11270-12873 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether System to display CTXX as inline error message ●CTXX[Message: Wrong PIN. 2 Attempts left]
		And user log out from the app if logged in
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
		And user Tap Edit button
		Then user enter the wrong pin number and click on continue button
		Then user verifies the inline error message for entering wrong pin

	@P11270-12876 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the Address 2 input fields in Card details screen under Billing Details section as'Address2'
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
		When user taps on add payment method
#		Then Verify user is navigated to Add Payment Method screen
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the default input text for the Address field Line two under Billing Details Section

#	The iOS and Android behaviour is different hence a defect is filed for clarification - P11270-28571
	@P11270-12886 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check the whether System to allow the user to add cards as a payment method.
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
#		And user skips the biometrics screen if present
		Then user should verify title text on the payment screen
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
		Then user verifies the success set Default payment popup
		And user verifies the account page

	@P11270-12789 @AndroidRegression @AndroidRegressionSet1
	Scenario:Check whether the system displays icons for cards of all app supported credit cards will be displayed here.
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
		When user enters the unsupported card number in the Card number field
		Then verify whether the logo of the cards are greyed out
		When user enters the first four digits of a valid card number in the Add number field
		Then verify whether the logo of the entered card is active

#	The iOS and Android behaviour is different hence a defect is filed for clarification - P11270-28570
	@P11270-12795 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check System to display the following prompt when the card is successfully added a. Title: Message,Copy Text Message Card added successfully. Buttons:OK b. System to navigate user back to the account screen
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
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

	@P11270-12796 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether system displays the set pin screen through Account
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
		And tap cancel button in the Add card screen LID
		And tap cancel button in the Credit Debit card screen
#		Then user clicks back to the NLID screen
		And user clicks on more icon
		When user navigates to Account screen
		Then user clicks on esso pin edit
		And user sets the pin number
		Then user clicks on continue
		Then user verifies the set new pin screen

#	The iOS and Android behaviour is different hence a defect is filed for clarification - P11270-28565
	@P11270-12797 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the unsupported card message in Billing details screen while entering wrong card number
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
		Then enter name of the card
		Then enter "3123" card number
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		Then enter address line1
		Then enter Address line2
		Then enter city
		Then check consent checkbox
		And tap on continue button in add payment screen
		Then user verifies the inline error msg for the invalid card

	@P11270-12798 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the entered card number in the Card number field
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
		Then enter name of the card
		Then enter "4012 0000 0601 2003 100" card number
		Then verify whether the entered card number is displayed

	@P11270-12814 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the Name on Card in Billing Details Screen
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		And verify elements displayed in Add Card Screen
		And user enters the maximum characters in Card Name field
		Then verify whether the entered card name is displayed

	@P11270-12816 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: System to show inline error message when user does not enter ‘City’ and taps on Done : ”Please enter city”
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		Then enter address line1
		Then enter Address line2
#		Then enter city
		Then check consent checkbox
		And tap on continue button in add payment screen
		Then user should verify the inliner error "Please enter city"

	@P11270-12818 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether System to allow user to add card on file link active.
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user should verify the Add Card link
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen

	@P11270-12820 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether system ables to clear the Pin input field by clicking clear in keypad
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user click the edit pin button with no mobile number
		Then user verifies the Set Up pin screen with numeric keypad
		And user sets the pin number
		Then user verifies the entered pin as dot

	@P11270-12821 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: System to navigate user to Postcode Lookup screen, when clicked on search icon.
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		And tap on search icon
		Then verify user is navigated to postcode lookup screen
		Then user select postcode in the list
		Then user verifies the screen with screen title and back icon and search clear icons
		And user verifies the list of address in postcode lookup screen

	@P11270-12819 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: System to navigate the user to Postcode Lookup’ search screen, if the user has entered the search criteria.
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		And tap on search icon
		Then verify user is navigated to postcode lookup screen

	@P11270-12823 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether the User should see the following details for the‘Forgot Password’ Screen title: ‘Forgot Password’ ii. ‘Back’ buttoniii. CT screen label: In order to reset your password, an email will be sent to your address: (User email address) ‘SEND’ button
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user able to see the Esso PIN on Account Screen
		Then user click the edit pin button with no mobile number
		And User click the Forgot your PIN link
		And User able to verify the CT label
#		Then user should verify the cancel button
		Then user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		Then user able to verify the forgot text and email address
		Then user able to see the send button

	@P11270-12840 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System System to display the Text Esso PIN on Accounts screen.
		And user log out from the app if logged in
		And user clicks on Login Icon
		When I enter "regressioncredentials2" in login details
		And user taps login button in login screen
		Given user is on NLID screen
		When user taps on More button in tab bar
		When user navigates to Account screen
		And user verifies the Esso PIN under User Profile in Account Screen

	@P11270-12828 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the Esso pin edit in Account screen
		Given user is on NLID screen
		When user taps on More button in tab bar
		When user navigates to Account screen
		And user verifies the Esso PIN under User Profile in Account Screen
		Then verify whether the system displays the edit link near Esso PIN
		Then User Tap Esso PIN Edit button
		When user enters four digit PIN
		Then user tap on continue button in enter PIN screen
		Then verify the Edit Esso PIN Screen

	@P11270-12834 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: System to show inline error messages if user has left the fields blank and taps on ‘Done’
		Given user is on NLID screen
		When user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		And tap on continue button in add payment screen
		Then Verify the inline error message for Name On Card
		And Verify the inline error message for Card Number
		And Verify the inline error message for Expiry Date
		And Verify the inline error message for Security Code
		And Verify inline error message for post code
		And Verify inline error message for Address from LID
		And Verify the inline error message for city from LID

	@P11270-16259 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether System should allow the user to edit the card on file details
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And User Tap Edit card button with mobile number
#		And user scrolls down to Payment Method section in the Account screen
#		And check whether Edit link is available near the Added card and tap on it
		Then verify whether the card details are prepopulated in the Edit payment screen
		And edit any of the fields under Edit Payment screen
		And user scrolls down to Consent checkbox section
		Then check consent checkbox
		When tap on continue button in add payment screen
		Then user verifies the updated pop up and clicks on ok buttton

	@P11270-12817 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System the email sent popup in forgot your password screen
		Given user is on NLID screen
		When user taps on More button in tab bar
		When user navigates to Account screen
		And user click the edit pin button with no mobile number
		Then user verifies the Set Up pin screen with numeric keypad
		And user taps on forgot password in PIN
		Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
		And user taps on forget password link
		Then user clicks on send button to re login
		Then user verifies the popup message for relogin the Application
		And Verify that User is navigate back to NLID screen

	@P11270-12829 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether the system displays ‘select’ button as ‘Disabled’ until, user has made any selection from the search results
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
		Then enter postal code
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies if the select button as disabled until user has made any selection

	@P11270-12830 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the tick mark for the selected address in postcode lookup screen
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
		Then enter postal code
		Then user verifies the search icon is enabled
		Then user clicks on enabled search icon
		And user clicks any one address in the below
		Then user verifies the tick mark in the selected Address

	@P11270-12833 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the entered text in postcode lookup screen is cleared by clicking clear icon
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
		Then enter postal code
		Then user verifies the search icon is enabled
		Then user clicks on enabled search icon
		And user clicks on clear icon in the postcode lookup screen
		Then verify the search text is cleared

	@P11270-12835 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the inline Error message for Name on the card field in Billing Details Screen
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
		Then enter "5520 9050 1002 2051" card number
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		Then enter address line1
		Then enter Address line2
		Then enter city
		Then check consent checkbox
		And tap on continue button in add payment screen
		And user verifies the inline error message for name on the card field

#	The iOS and Android behaviour is different hence a defect is filed for clarification - P11270-28760
	@P11270-12837 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether the System performs displays the address when user has selected an option and tapped on ‘select’ button.
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
		Then enter postal code
		Then user verifies the search icon is enabled
		Then user clicks on enabled search icon
		And user clicks any one address in the below
		Then user verifies the tick mark in the selected Address
		Then user taps select option
		Then check if the address is auto filled in the address fields in billing section

	@P11270-14798 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
	Scenario: Verify if System navigate the user to logged-in dashboard from the Add Nectar Card screen after 300 seconds of inactivity
		When user log out from the app if logged in
		And user clicks on Login Icon
		When I enter "FrictEssoPsword" in login details
		And user taps login button in login screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		And delete added nectar card if exists
		When user taps on fuel icon and navigate to LID screen
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		And user selects pump number "1" to start fuelling
		And user selects the pump from 'Select your Pump' page and taps on continue button
		And user verify the MFA screen
		When user tap on Continue button in MFA screen
		Then the user is navigated to Confirm payment screen
		And Click on Change payment link
		And user verifies Payment details screen before adding nectar card
		And user adds the Nectar card details by clicking the Add nectar card in Payment details screen
		Then user is navigated to add nectar screen
		Then Verify user navigated back to LID screen

	@P11270-14800 @iOSRegression @iOSRegressionSet1  @AndroidRegression @AndroidRegressionSet1
	Scenario: Verify if System navigate the user to logged-in dashboard from the Change Payment Details screen after 300 seconds of inactivity
		Given user is on NLID screen
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		And user selects pump number "1" to start fuelling
		And user selects the pump from 'Select your Pump' page and taps on continue button
		And user verify the MFA screen
		When user tap on Continue button in MFA screen
		Then the user is navigated to Confirm payment screen
		And Click on Change payment link
		And user verifies Payment details screen before adding nectar card
		And user adds the Nectar card details by clicking the Add nectar card in Payment details screen
		Then user is navigated to add nectar screen
		And user taps on scan barcode
		Then Verify user navigated back to LID screen

	@P11270-12905 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: Check whether the system to navigate the user to Enter PIN and user should see following details for Enter PIN screen
		Given user is on NLID screen
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		And user selects pump number "1" to start fuelling
		And user selects the pump from 'Select your Pump' page and taps on continue button
		When user tap on Continue button in MFA screen
		Then the user is navigated to Confirm payment screen
		And user confirms card payment
		And user able to see the cancel button in the enter pin
		And user enter the Enter PIN number
		Then user able to see the screen label for Enter your Esso PIN to Authorize Payment
		And User click the Forgot your PIN link

	@P11270-12913 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: Check whether system to navigate user back to LID screen tapping on ‘Cancel’ button
		Given user is on NLID screen
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		And user selects pump number "1" to start fuelling
		And user selects the pump from 'Select your Pump' page and taps on continue button
		When user tap on Continue button in MFA screen
		Then the user is navigated to Confirm payment screen
		And user confirms card payment
		Then user land on enter PIN screen
		And user able to see the cancel button in the enter pin
		Then user should verify navigate to Enter password Screen
		And user tap the cancel button
		Then the user is navigated to Confirm payment screen

	@P11270-12915 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: whether the system to navigate the user to Enter Password screen and
	the user should see the following details for the Enter password screen
		Given user is on NLID screen
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		And user selects pump number "1" to start fuelling
		And user selects the pump from 'Select your Pump' page and taps on continue button
		And user verify the MFA screen
		When user tap on Continue button in MFA screen
		Then the user is navigated to Confirm payment screen
		And user confirms card payment
		Then user land on enter PIN screen
		Then user click forgot button
#		And user able to see the cancel button in the enter pin
		And user able see the Enter password text
		And user able to view the password

#	The below TC fails in iOS due to the below defect - P11270-20387
	@P11270-12875 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether System to display ‘Edit’ button if card is added
		Given user is on NLID screen
		And user clicks on more icon
		Then user clicks on Account
		And verify the card number
		And verify the card number is masked
		And user enter the edit button
		And user able to see the edit payment method
		And tap cancel button in the Add card screen LID
#		And verify tick mark in payment method

	@P11270-12914 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: Check whether system to navigate user to ‘Forgot Password’ screen when user tap on ‘Forgot your password?’ link
		Given user is on NLID screen
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		And user selects pump number "1" to start fuelling
		And user selects the pump from 'Select your Pump' page and taps on continue button
		When user tap on Continue button in MFA screen
		Then the user is navigated to Confirm payment screen
		And user confirms card payment
		Then user click forgot button
		And user able see the Enter password text
		When user click the Forgot your pwd link
		Then user should verify the CT label and clicks on send button
		And user verifies the popup message for relogin the Application
		Then user verifies the app redirects back to NLID

	@P11270-12906 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays Visa and MasterCard while clicking i icon
		Given user log out from the app if logged in
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter Email address as "Shruthi.s1"
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
		Then user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		And user clicks on i icon in security code
		Then user verifies the Visa and MasterCard in pop up
		And user is able to dismiss the pop up

	@P11270-12907 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: Check Whether System displays the inline error messgae for Security code in card details screen
		Given user is on NLID screen
		And user taps on the complete profile
		Then user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		And user enters the card details except "security code"
		Then user clicks on continue button in Card screen without "security code"
		Then user verifies the inline error message for security code

	@P11270-12911 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: Check Whether System displays the inline error message for expiry date in Credit Debit card screen
		Given user is on NLID screen
		And user taps on the complete profile
		Then user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		And user enters the card details except "expiry date"
		Then user clicks on continue button in Card screen without "expiry date"
		Then user verifies the inline error message for expiry date

	@P11270-12877 @P11270-12902 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether system to navigate user to ‘Forgot Password’ screen when user tap on ‘Forgot your password?’ link
		Given user log out from the app if logged in
		When user clicks on Login Icon
		When I enter "FrictEssoPsword" in login details
		And user taps login button in login screen
		And user is on NLID screen
		And user taps on More button in tab bar
		And user navigates to Account screen
		And user click the edit pin button with no mobile number
		And User click the Forgot your PIN link
		And User able to verify the CT label
		Then user should verify the cancel button
		Then user click the Forgot your pwd link
		Then user should verify the title Forgot pwd
		Then user verify the back button

	@P11270-12885 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether User should see only the last 4 digits of the card
		And user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user should verify the card last four digit

	@P11270-12866 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether System to display the logo of the card
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user should verify the card last four digit
		Then user should able to see the logo of the card

#	The iOS and Android behaviour is different hence a defect is filed for clarification - P11270-28892
	@P11270-12901 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether system to send reset password email and user should see a prompt
		And user is on NLID screen
		When user taps on start button in LID
		And user is navigated to Select your pump screen
		And user selects pump number "1" to start fuelling
		And user selects the pump from 'Select your Pump' page and taps on continue button
		When user tap on Continue button in MFA screen
		Then the user is navigated to Confirm payment screen
		And user confirms card payment
		When user taps on Forgot your pin link
		Then Verify user is navigated to Enter Password screen
		When user taps on forget password link
		Then verify user is navigated to Forgot Password screen
		When user taps on send button in Forgot Password Screen
		Then verify the prompt message and tap on Ok button
		Then user verifies the app redirects back to NLID

	@P11270-12883 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: System to display ‘Search’ as an icon
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
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		And user able to see and verify the search icon

	@P11270-12852 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario:Verify whether the inline error message for postcode field
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		And user enters the card details except "post code"
		Then user clicks on continue button in Card screen
		Then user should able to view inline error message without enter the postcode

	@P11270-12881 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: Check Whether System displays a popup when the consent checkbox is not clicked in the Add Debit/Credit Card Screen
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		And user enters the card details except "consent checkbox"
		And user scrolls down to Consent checkbox section
		Then user clicks on continue button in Card screen without "consent checkbox"
		Then user verifies the popup message for checkbox
		And user clicks on ok in the popup message

	@P11270-12880 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: Check Whether system displays the input field for postcode and i icon in card details screen
		Given user is on NLID screen
		And user taps on the complete profile
		Then user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		And user clicks on postcode field
		Then user verifies the postcode field as input field

	@P11270-12879 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: Check Whether System displays Enter password screen while clicking Forgot your pin
		Given user is on NLID screen
		And user taps on More button in tab bar
		Then user clicks on Account
		Then user click the edit pin button with no mobile number
		And user taps on forgot password in PIN
		Then user verifies the forgot password screen with enter password btn cancel btn and continue btn

	@P11270-12878 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: Check Whether System displays the name on card field text or input field in Add Debit/Credit card screen
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address i icon in Card details screen
		Then user verifies the default input text for the Card Name under Billing Details Section

	@P11270-12846 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the copy text next to the i info icon
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		And user verifies the Billing address i icon in Card details screen
		When user taps on the consent info icon
		And verify whether the system displays the consent copy text msg

	@P11270-12872 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the entered text in first Address line Billing details screen
		Given user is on NLID screen
		And user taps on the complete profile
		Then user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address i icon in Card details screen
		And user taps on First Address field and verifies keypad
		Then user enters the fifty characters in Address field
		And the field should display the fifty characters in first address field

	@P11270-12869 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System able to enter fifty characters in second Address field
		Given user is on NLID screen
		And user taps on the complete profile
		Then user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address i icon in Card details screen
		And user taps on second Address Field
		Then user enters the fifty characters in second Address Field
		And the field should display the fifty characters in second address field

	@P11270-12841 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the default input text for the Address Line 1 field under Billing Details section as'Address1'
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the default text in the first Address Field

	@P11270-12871 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays an inline error message if the Address is not entered and submitted
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		And user enters the card details except "billing address"
		And user clicks on continue button in Card screen
		And user verifies the inline error message for Address Field

	@P11270-12865 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: system to display ‘Billing Details’ as section header
		Given user is on NLID screen
		And user taps on More button in tab bar
		When user navigates to Account screen
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address in the screen

	@P11270-12861 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the Billing address i icon in Card details screen
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address i icon in Card details screen

#	The iOS and Android behaviour is different hence a defect is filed for clarification - P11270-28477
	@P11270-12859 @AndroidRegression @AndroidRegressionSet1 @iOSRegression @iOSRegressionSet1
	Scenario: Check Whether System displays the Checkbox for consent and Touch ID authorization in the Billing Details field
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then enter name of the card
		Then enter "5232 0500 0019 0003" card number
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		Then enter address line1
		Then enter Address line2
		Then enter city
#		Then check consent checkbox
#		And user scrolls down to Consent checkbox section
		Then user verifies the Check box for consent and Authorization

	@P11270-12848 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check whether the system displays the Checkbox and the Copy text
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
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
#		When user enters the card details in Add card screen
		Then check consent checkbox and verifies the copy text displayed

	@P11270-12844 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the checkbox for consent to use the card in Billing Details Screen
		Given user is on NLID screen
		And user taps on the complete profile
		Then user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address i icon in Card details screen
		Then enter name of the card
		Then enter "5232 0500 0019 0003" card number
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		Then enter address line1
		Then enter Address line2
		Then enter city
#		Then check consent checkbox
#		And tap on continue button in add payment screen
		Then user verifies and clicks the i icon next to consent checkbox
		And verify whether the system displays the consent copy text msg

	@P11270-12857 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Inability of the system to display past month and year as expiry date in the picker
		Given user is on NLID screen
		And user taps on the complete profile
		Then user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		And click on Card Exp Date field in Add Card screen
		Then Verify the Current Date and Current month are displayed

	@P11270-12851 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System enables the search icon for the postcode after entering the number in post code
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		And user enters the postcode in the billing Details screen
		Then user verifies the search icon is enabled

	#todo: Create a defect for search icon not disabled when no postcode entered
	@P11270-12838 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System to disable ‘Search’ option if user has not entered any value in 'Postcode’ field
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		And user clicks on postcode field
		Then user verifies the search icon is disabled

	@P11270-12839 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1
	Scenario: Check Whether System displays the screen with screen title and back icon and search clear icons
		Given user is on NLID screen
		And user taps on the complete profile
		When user taps on add payment method
		When user taps on Credit Debit card in Add Payment Method screen
		Then user verifies the Billing address i icon in Card details screen
		And user clicks on postcode field
		Then user verifies the search icon is enabled
		And user enters the postcode in the billing Details screen
		Then user clicks on enabled search icon
		Then user verifies the screen with screen title and back icon and search clear icons

	@P11270-12809 @iOSRegression @iOSRegressionSet1 @AndroidRegression @AndroidRegressionSet1 @SprintiOS2324
	Scenario: App should perform 3DS verification for Card Onboarding confirmation
		When user log out from the app if logged in
		When user taps on register button from Login screen
		Then user should be navigated to Manual Register screen
		Then enter First Name
		Then enter Last Name
		Then enter "roshini.narayanan+" Email address
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
		Then user tap on add card button in account
		When user taps on Credit Debit card in Add Payment Method screen
		Then user lands on Add debit/credit card screen
		Then enter name of the card
		Then enter "5520 9050 1002 2051" card number
		Then enter expiry date
		Then enter CVV
		Then enter postal code
		Then enter address line1
		Then enter Address line2
		Then enter city
		Then check consent checkbox
		And tap on continue button in add payment screen
		Then validate identity confirmation title
		Then validate if user is on OTP password screen

#	================================================================================
#	@P11270-12840 @iOSRegression @iOSRegressionSet11 @AndroidRegression @AndroidRegressionSet11
#	Scenario: Check Whether System System to display the Text Esso PIN on Accounts screen.
#		And user is on NLID screen
#		When user taps on More button in tab bar
#		When user navigates to Account screen
#		And user verifies the Esso PIN under User Profile in Account Screen
#
##	The iOS and Android behaviour is different hence a defect is filed for clarification - P11270-28477
#	@P11270-16260 @iOSRegression @AndroidRegressionR2211 -10111-haveto-blocked
#	Scenario: Check Whether the system should display a biometric (Face ID/Touch ID/Fingerprint) checkbox in the 'Edit Payment Method' screen
#		Given user is on NLID screen
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		And user scrolls down to Payment Method section in the Account screen
#		And check whether Edit link is available near the Added card and tap on it
#		And user scrolls down to Consent checkbox section
#		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments
#
##	The iOS and Android behaviour is different hence a defect is filed for clarification - P11270-28477
#	@P11270-16263 @iOSRegression @AndroidRegressionR2211 -10111-haveto-blocked
#	Scenario: Check Whether the system should display a biometric (Face ID/Touch ID/Fingerprint) checkbox in the 'Add Debitt/Credit card' screen
#		Given user is on NLID screen
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		When user tap on add card button in account
#		Then user lands on Add debit/credit card screen
#		And user scrolls down to Consent checkbox section
#		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments
#
#	@P11270-15960 @iOSRegression @AndroidRegression1
#	Scenario: Check Whether system marks "Maximum Fueling Amount" as completed
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter "chandru.r+" Email address
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on the complete profile
#		And user verifies the "Completes your profile" screen
#		Then user taps on maximum fueling amount
#		Then user clicks on Set Maximum Amount button
#		And user sets the fueling amount and clicks ok button
#		And user clicks on continue button in maximum fueling screen
#		Then user verifies "Maximum Fueling Amount" task is completed
#
#	@11270-12875- @AndroidRegression1- @iOSRegressionDuplicate-
#	Scenario: Check whether System to display ‘Edit’ button if card is added
#		Then user is in login screen
#		When I enter "Frictionless" in login de1tailsD
#		And user taps login button in login screen
#		And user on More button in tab bar
#		And user navigate to account screen
#		And verify the card number
#		And verify tick mark in payment method
#		And user enter the edit button
#		And user able to see the edit payment method
#
#	@11270-12840- @AndroidRegression1 @iOSRegressionDuplicate
#	Scenario: Check whether system to display the Text Esso PIN on Accounts screen
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter the firstName
#		Then enter the secondName
#		Then enter the emailAddress
#		Then enter the password
#		Then enter the confirm password
#		Then click the Accept checkBox
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user on More button in tab bar
#		And user navigate to account screen
#		Then user able to see the Esso PIN on Account Screen
#
#	@P11270-12840- @AndroidRegression1 @IosRegression @M5 @chan @chan51mar18@duplicate
#	Scenario: Check whether System to display the Text Esso PIN on Accounts screen
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter "chandru.r+" Email address
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		When user able to see the text of set up Esso PIN
#
#	@P11270-12823 @AndroidRegression1 @iOSRegression @duplicate
#	Scenario: Check Whether System displays the Forgot your password in forgot your pin screen
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter Email address as "Shruthi.s1"
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on the complete profile
#		Then user taps on add payment method
#		And user clicks on Add credit or debit card
#		Then user verifies the Set Up pin screen with numeric keypad
#		And user sets the pin number
#		Then user clicks on continue
#		Then user verifies the popup and clicks on ok button
#		Then user clicks back to the NLID screen
#		And user clicks on more icon
#		Then user clicks on Account
#		Then user click on the edit esso link
#		And user taps on forgot password in PIN
#		Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
#		And user taps on forget password link
#		Then user verifies the forgot password and back button and In order to reset your password, an email will be sent to your address and send button
#
#	@P11270-12823 @AndroidRegression1 @iOSRegression @duplicate
#	Scenario: Check whether the icons of all app supported credit cards are displayed on Add Payment Method screen. Current supported cards are Visa, Mastercard
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter "chandru.r+" Email address
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user verifies the forty percent in indicator
#		And user clicks on more icon
#		Then user clicks on Account
#		And user clicks a Add card in Account screen
#		And Enter pin
#		Then user verifies the popup and clicks on ok button
#		And user enters the card details in Billing Screen except fingerprint checkbox
#		Then user clicks on continue button in Card screen
#		When user tap done button to navigate verify screen "Payment method added successfully"
#		When user tap on payment method added successfully screen continue button
#		Then user verifies the success set Default payment popup
#		And user verifies the account page
#		And User Tap Edit button
#		And User click the Forgot your PIN link
#		And User able to verify the CT label
#		Then user should verify the cancel button
#		Then user click the Forgot your pwd link
#		Then user should verify the title Forgot pwd
#		Then user verify the back button
#		Then user should verify the CT label and clicks on send button
#
#	@P11270-12791 @AndroidRegression1 @iOSRegression @duplicate
#	Scenario: Check whether System allow user to  enter PIN with possible values for each text/input field is numbers
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter "chandru.r+" Email address
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		Then Click on Add Card
#		Then user should verifies the Set Up pin screen with numeric keypad
#
#	@P11270-12793 @AndroidRegression1 @iOSRegression @duplicate
#	Scenario: Check Whether System displays the dot for completed pin in Payment Method
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter Email address as "Shruthi.s1"
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on the complete profile
#		Then user taps on add payment method
#		And user clicks on Add credit or debit card
#		Then user verifies the Set Up pin screen with numeric keypad
#		And user sets the pin for first
#		Then user verifies the first pin displayed as dot
#
#	@P11270-12811 @AndroidRegression1 @iOSRegression
#	Scenario: Check Whether System displays the Add payment in profile completion screen
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter Email address as "Shruthi.s1"
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on the complete profile
#		Then user verifies the Add Payment Method in Complete Profile screen
#
#	@P11270-12822 @AndroidRegression1 @iOSRegression @duplicate
#	Scenario: Check Whether System displays the message for card add and delete
#		When user clicks on Login Icon
#		Then user enters the valid credentials with card added
#		Then user taps on Login Icon in Login screen
#		And user clicks on more icon
#		Then user clicks on Account
#		And user verifies for the payment method
#		Then user verifies the last digits of card number and tick mark for the added card number
#		And user taps on edit link in the added card
#		Then user verifies the cancel and delete option in the screen
#		When user taps on Delete Card button in Edit Payment Screen
#		Then Verify system should display the prompt message

#	@P11270-12822 @AndroidRegression1 @iOSRegression @duplicate
#	Scenario: Check whether System to display CT as prompt when user tap on the ‘Edit’ Message: Are you sure you want to delete this card?, Button: CANCEL, DELETE
#		Given click on the login link in present in dashboard
#		When User Should Enter the Username
#		And User Should Enter the password
#		Then User Click on login button
#		And user clicks on more icon in LID Screen
#		And Click on Account link
#		And user click the payment edit button
#		And user should verify the last four digit of card number
#		And user tap on Delete Card button
#		And user should verify the CT "Are you sure you want to delete this card?"
#		And user should verify cancel and delete button

#	@P11270-12825 @iOSRegression @AndroidRegression1
#	Scenario: Check Whether System to allow User to add maximum of 5 cards
#		Then user is in login screen
#		When I enter "Offer1" in login det1ailsD
#		And user taps login button in login screen
#		When user adds five cards from the add card link in the Account Screen
#		And validates if the system disables the Add card link after adding a maximum of five cards

#	@P11270-12827 @AndroidRegression1 @iOSRegression
#	Scenario: Check Whether System to allow User to add maximum of 5 cards
#		Then user is in login screen
#		When I enter "Offer1" in login det1ailsD
#		And user taps login button in login screen
#		When user taps on More button in tab bar
#		When user navigates to Account screen
#		And user scrolls to Add card link
#		And validates if the system disables the Add card link after adding a maximum of five cards

#	@P11270-12875- @iOSRegression- @AndroidRegression1- @duplicate
#	Scenario: Check whether System to display ‘Edit’ button if card is added
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter "testessoapp2021+" Email address
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		Then user tap on add card button in account
#		When user is on setup PIN screen
#		When user enters four digit PIN
#		Then user tap on continue button in enter PIN screen
#		Then tap on ok button and close location copy text
#		Then enter name of the card
#		Then enter "5544 3300 0000 0011" card number
#		Then enter expiry date
#		Then enter CVV
#		Then enter postal code
#		Then enter address line1
#		Then enter Address line2
#		Then enter city
#		Then check consent checkbox
#		And tap on continue button in add payment screen
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		And user scrolls down to Payment Method section in the Account screen
#		And verify whether the Edit link is available near the added card

#	@P11270-16261 @iOSRegressionR22w1 @AndroidRegrsessionR221 
#	Scenario: The system should allow the user to select biometric (Face ID/Touch ID/Fingerprint) to authorise the card on file payment
##		When user is in login screen
##		And I enter "regressioncredentials121" in login de1tailsD
##		And user taps login button in login screen
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		And user scrolls down to Payment Method section in the Account screen
#		And check whether Edit link is available near the Added card and tap on it
#		And user scrolls down to Consent checkbox section
#		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments
#		And verify if the user is able to select the checkbox
#		And tap on continue button in add payment screen
#
#	@P11270-16262 @iOSRegression @AndroidRegression1 @AndroidsRegressionR221
#	Scenario: The system should allow the user to deselect biometric (Face ID/Touch ID/Fingerprint) to authorise the card on file payment
##		When user is in login screen
##		And I enter "regressioncredentials121" in login d1etailsD
##		And user taps login button in login screen
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		And user scrolls down to Payment Method section in the Account screen
#		And check whether Edit link is available near the Added card and tap on it
#		And user scrolls down to Consent checkbox section
#		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments
#		And verify if the user is able to deselect the checkbox
#		And tap on continue button in add payment screen

#	@P11270-12867 @AndroidRegsressionR221
#	Scenario: Check Whether System displays the ok button to relogin the Application after entering the wrong password
#		Given user log out from the app if logged in
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter Email address as "Shruthi.s1"
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on the complete profile
#		Then user taps on add payment method
#		And user clicks on Add credit or debit card
#		Then user verifies the Set Up pin screen with numeric keypad
#		And user sets the pin number
#		Then user clicks on continue
#		Then user verifies the popup and clicks on ok button
#		Then user clicks back to the NLID screen
#		And user clicks on more icon
#		Then user clicks on Account
#		Then user click on the edit esso link
#		And user taps on forgot password in PIN
#		Then user verifies the forgot password screen with enter password btn cancel btn and continue btn
#		And user enters the wrong password in enter password field
#		Then user clicks on continue icon in Forget password Screen
#		Then user able to see invalid password popup message
#		And Verify that User is navigate back to NLID screen

#	@P11270-12792 @IosRegression @CRiOS1 @M9 @chan51mar18
#	Scenario: Check whether System navigates user to ‘Set Up PIN’ screen
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter "chandru.r+" Email address
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		Then Click on Add Card
#		Then user should verify the system navigate to setup PIN screen
#	@P11270-12873- @AndroidRegression1 @iOSRegression
#	Scenario: Check Whether System displays the inline error messsage for entering wrong pin
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter Email address as "Shruthi.s1"
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on the complete profile
#		Then user taps on add payment method
#		And user clicks on Add credit or debit card
#		Then user verifies the Set Up pin screen with numeric keypad
#		And user sets the pin number
#		Then user clicks on continue
#		Then user verifies the popup and clicks on ok button
#		Then user clicks back to the NLID screen
#		And user clicks on more icon
#		Then user clicks on Account
#		Then user click on the edit esso link
#		And user enters wrong pin
#		Then user clicks on continue
#		Then user verifies the inline error message for entering wrong pin

#	@P11270-12875- @iOSRegression- @AndroidRegression1-
#	Scenario: Check whether System to display ‘Edit’ button if card is added
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter "testessoapp2021+" Email address
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		Then user tap on add card button in account
#		When user is on setup PIN screen
#		When user enters four digit PIN
#		Then user tap on continue button in enter PIN screen
#		Then tap on ok button and close location copy text
#		Then enter name of the card
#		Then enter "5544 3300 0000 0011" card number
#		Then enter expiry date
#		Then enter CVV
#		Then enter postal code
#		Then enter address line1
#		Then enter Address line2
#		Then enter city
#		Then check consent checkbox
#		And tap on continue button in add payment screen
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		And user scrolls down to Payment Method section in the Account screen
#		And verify whether the Edit link is available near the added card

	## TouchID/Finger print not applicable for automation######
#	@P11270-12849 @AndroisdRegressionR221
#	Scenario: Check whether system to navigate user to next logical screen if Touch ID/Fingerprint authentication is successful
##		Given user log out from the app if logged in
##		When user clicks on Login Icon
##		When I enter "FrictEssoPswordchk" in login de1tailsD
##		And user taps login button in login screen
#		Given user is on NLID screen
#		When user taps on fuel icon and start fuelling button
#		Then user select pump and tap on continue button
#		And user tap on Continue button in MFA screen
#		Then the user is navigated to Confirm payment screen
#		And user confirms card payment
#		And user able to see the cancel button
#		And user enter the Enter PIN number
#		Then Tap the continue button
#		Then verify that user is navigated to next logical screen once authentication is successful

	#	@P11270-12838 @AndroidRegression1 @iOSRegression
#	Scenario: Check Whether System to disable ‘Search’ option if user has not entered any value in 'Postcode’ field
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter Email address as "Testessoapp2021+"
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on the complete profile
#		When user taps on add payment method
#		Then Verify user is navigated to Add Payment Method screen
#		And Tap on Add Debit or Credit card details
#		When user is on setup PIN screen
#		When user enters four digit PIN
#		Then user tap on continue button in enter PIN screen
#		Then tap on ok button and close location copy text
#		Then user verifies the Billing address i icon in Card details screen
#		And user clicks on postcode field
#		Then user verifies the search icon is disabled
#
#
#	@P11270-12839 @iOSRegression @AndroidRegression1
#	Scenario: Check Whether System displays the screen with screen title and back icon and search clear icons
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter Email address as "testessoapp2021+"
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on the complete profile
#		When user taps on add payment method
#		Then Verify user is navigated to Add Payment Method screen
#		And Tap on Add Debit or Credit card details
#		When user is on setup PIN screen
#		When user enters four digit PIN
#		Then user tap on continue button in enter PIN screen
#		Then tap on ok button and close location copy text
#		Then user verifies the Billing address i icon in Card details screen
#		And user clicks on postcode field
#		Then user verifies the search icon is enabled
#		And user enters the postcode in the billing Details screen
#		Then user clicks on enabled search icon
#		Then user verifies the screen with screen title and back icon and search clear icons

#	@P11270-12841 @iOSRegression @AndroidRegression1
#	Scenario: Check Whether System displays the default input text for the Address Line 1 field under Billing Details section as'Address1'
#		When user taps on register button from Login screen
#		Then user should be navigated to Manual Register screen
#		Then enter First Name
#		Then enter Last Name
#		Then enter Email address as "testessoapp2021+"
#		Then enter password
#		And confirm password
#		Then click the check box for accept
#		When click on continue button from register screen
#		When user tap on Skip button
#		Then the system should display Skip warning popup
#		When user tap on Skip anyway
#		Then app to dismiss the popup and navigate the user to LID after review
#		And user taps on the complete profile
#		When user taps on add payment method
#		Then Verify user is navigated to Add Payment Method screen
#		And Tap on Add Debit or Credit card details
#		When user is on setup PIN screen
#		When user enters four digit PIN
#		Then user tap on continue button in enter PIN screen
#		Then tap on ok button and close location copy text
#		Then user verifies the default input text for the Address field Line one under Billing Details Section

#	@P11270-12842 @iOSRegression @AndroidRegression1
#	Scenario: Check whether user able to navigate user to the 3DS SDK driven screen and allowing user to enter the password,when user has set-up password at the payment method level
#		Then user is in login screen
#		When I enter "Challenge2" in login de1tailsD
#		And user taps login button in login screen
#		When user taps on start button in LID
#		Then user clicks on continue button in station screen
#		And allow location access
#		And user selects the pump from 'Select your Pump' page and taps on continue button
#		And user confirms card payment
#		Then user land on enter PIN screen
#		When user enters four digit PIN
#		Then user tap on continue button in enter PIN screen
#		When user lands on authorize payment screen
#		Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
#		When user lands on authorize payment screen
#		And enter valid password and click on submit button
#		And verify whether the system navigates to Start fuelling now screen


#	@P11270-12847 @AndroidRegression1 @iOSRegression
#	Scenario: Check whether system performs 3DS verification for COF and wait for the response from 3DS SDK
#		When user is in login screen
#		And I enter "Offer1" in login de1tailsD
#		And user taps login button in login screen
#		When user taps on start button in LID
#		Then user clicks on continue button in station screen
#		And allow location access
#		And user selects the pump from 'Select your Pump' page and taps on continue button
#		And user confirms card payment
#		Then user land on enter PIN screen
#		When user enters four digit PIN
#		Then user tap on continue button in enter PIN screen
#		When user lands on authorize payment screen
#		Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
#		When user lands on card verification screen
#		And enter valid password and click on submit button

#	@P11270-12849- @AndroidRegression1- @iOSRegression-
#	Scenario: Check whether system navigates user to next logical screen if authentication is successful
#		When user is in login screen
#		And I enter "Offer1" in login de1tailsD
#		And user taps login button in login screen
#		When user taps on start button in LID
#		And user selects the pump from 'Select your Pump' page and taps on continue button
#		And user confirms card payment
#		Then user land on enter PIN screen
#		When user enters four digit PIN
#		Then user tap on continue button in enter PIN screen
#		When user lands on authorize payment screen
#		Then Confirmation prompt "Just to ensure this is your card, we need to validate a few things. Don't worry! Nothing will be charged to your account until you complete fuelling." should be displayed
#		When user lands on card verification screen
#		And enter valid password and click on submit button
#		Then user is navigated to start fueling now screen

#	@P11270-16264 @iOSRegression @AndroidRegression1
#	Scenario: Check whether the system should allow the user to select biometric (Face ID/Touch ID/Fingerprint) to authorise the card on file payment
#		When user is in login screen
#		And I enter "Offer1" in login det1ailsD
#		And user taps login button in login screen
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		When user is on setup PIN screen
#		When user enters four digit PIN
#		Then user tap on continue button in enter PIN screen
#		Then tap on ok button and close location copy text
#		And user scrolls down to Consent checkbox section
#		And verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments
#		When user taps on the checkbox to use Touch ID for authorizing payments
#		Then verify if the system displays a tickmark on the checkbox and save it

#	@P11270-12900 @AndroidRsegressionR221
#	Scenario: Check whether the system to display Touch ID/Fingerprint prompt on-site check-in screen
#		And close the modal popup
#		When user taps on start button in LID
#		And user is navigated to Select your pump screen
#		And user selects the pump from 'Select your Pump' page and taps on continue button
#		And user verify the MFA screen
#		When user tap on Continue button in MFA screen
#		Then the user is navigated to Confirm payment screen
#		And Tap on Payment method edit button
#		Then verify if the user lands on Payment Details Screen
#		When user selects the frictionless flow card and tap on update button
#		And user verify the confirms the payment screen
#		When user confirms card payment
#		Then user is navigated to Enter pin screen

#	@P11270-12884 @AndroidRegressionsR221 -10111-havetSo-duplicateof12875
#	Scenario: Check whether User should see the highlighted card number with tick mark for the default payment card
#		Given user is on NLID screen
#		And user clicks on more icon in LID Screen
#		And Click on Account link
#		Then user should verify the card last four digit
#		And verify tick mark in payment method

#	@P11270-12912 @iOSRegressionR2sd21 @AndroidRegressionR2s21 @RegressionUKRsds21
#	Scenario: Validate invalid password popup error message "Due to security reasons you need to login again.Button: OK"
#		Given user log out from the app if logged in
#		And user clicks on Login Icon
#		When I enter "FrictEssoPswordchk" in logi1n detailsA
#		And user taps login button in login screen
#		And user is on NLID screen
#		When user taps on fuel icon and start fuelling button
#		And user selects the pump from 'Select your Pump' page and taps on continue button
#		When user tap on Continue button in MFA screen
#		Then the user is navigated to Confirm payment screen
#		And user confirms card payment
#		Then user land on enter PIN screen
#		And user should enter wrong PIN three times
#		Then Verify user is navigated to Enter Password screen
#		When user enter invalid password in enter password screen
#		Then user able to see invalid password popup message
#		And Verify that User is navigate back to NLID screen

#	#	The iOS and Android behaviour is different hence a defect is filed for clarification - P11270-28477
#	@P11270-16259 @AndroidRegressiosnR221 -10111-haveto-blocked
#	Scenario: Check whether System should allow the user to edit the card on file details
##		And user log out from the app if logged in
##		Given user is in login screen
##		When I enter "regressioncredentials12" in logi1n details
##		And user taps login button in login screen
#		And user is on NLID screen
#		And user taps on More button in tab bar
#		When user navigates to Account screen
#		And user scrolls down to Payment Method section in the Account screen
#		And check whether Edit link is available near the Added card and tap on it
#		Then verify whether the card details are prepopulated in the Edit payment screen
#		And edit any of the fields under Edit Payment screen
#		And user scrolls down to Consent checkbox section
#		Then check consent checkbox
#		When tap on continue button in add payment screen
#		Then user verifies the updated pop up and clicks on ok buttton
