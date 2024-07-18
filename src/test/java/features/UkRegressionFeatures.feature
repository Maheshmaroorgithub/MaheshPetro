@UK_Regression_Features
Feature: UKRegressionFeatures

  @P11270-5010 @P11270-5011 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System to display PayPal Account
    When user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user taps on Edit Pay Pal account in Account screen
    Then user verifies the user redirected to Account screen

  @P11270-35414 @AndroidRegression @Sprintandroid2414
  Scenario:Verify that whether app is displaying  the PayPal payment method under the payment method section
    When user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    Given user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    Then user verifies paypal email id with masked
    Then User should see paypal title
    Then user verifies Edit Pay Pal button


  @P11270-13176 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: LID- Nectar Card not verified /Vaulted to the account
    And user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And delete added nectar card if exists
    And tap on add nectar card from account screen
    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
    When user clicks on Continue button under 'Card Added successfully' alert
    Then enter "NectarCardAddAndVerify" Nectar card number and password
    And close the modal popup
    And user taps on More button in tab bar
    When user navigates to Account screen
    And navigate to the Nectar card section
    Then validate added nectar card "NectarCardAddAndVerify" in the account
    Then delete added nectar card

  @P11270-28442 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @SprintiOS2321 @Sprint01
  Scenario:App should allow the Manual user to register again with the deleted account
    When user is on NLID screen
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
    When user taps on register button from Login screen
    Then user should be navigated to Manual Register screen
    Then enter First Name
    Then enter Last Name
    And user enter the auto generated mail after deleting the user
    Then enter password
    And confirm password
    Then click the check box for accept
    When click on continue button from register screen
    Then App should navigates to Confirm your email address screen
    When user tap on Skip button
    Then the system should display Skip warning popup
    When user tap on Skip anyway
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    Then app to dismiss the popup and navigate the user to LID after review

  @P11270-5008 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System to display copy text XX as prompt
    When user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "FrictEssoPsword" in login details
    And user taps login button in login screen
    Given user is on NLID screen
    When user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user should verify the masked password and edit button in the account section
    When user taps on edit usr pwd
    Then user verifies the edit password title
    And user enters the current password from the "FrictEssoPsword"
#    And user enters New Password
    And user enters a New Password to change the password
#    And user enters Confirm New Password
    And user enters a Confirm New Password to change the password
    Then user tap on Done button
    Then verify copy text message for password changed
    And Tap on OK button in the popup
    Then user verifies the app redirects back to NLID

  @P11270-16359 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check Whether System displays the tutorial screen and clicks ok button in the Non logged in dashboard screen
    #When user log out from the app if logged in
    And user taps on More button in tab bar
    And user taps on Share logs in the Menu
    Then user sends the share logs to the "regressioncredentials2" to get the logs
    #Then user sends the share logs to the users
    Given reset the app
    Then Verify the Cookie page elements
    And Click Accept all button in the cookie page
    Then user validates tutorial screen
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user clicks on GET STARTED button
    And user navigates to the NLID before the welcome popup
    Then Validate the welcome pop-up message

  @P11270-37331 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @R123
  Scenario: Verify the app is displaying the privacy options on the Settings screen as disabled for Google signed in user
    Given reset the app
    Then Verify the Cookie page elements
    When the user taps on the Reject all button in the privacy screen
    And user taps on SKIP button in the tutorial screen
    Then user naviagtes to the NLID screen after tutorial screens
    And user is on NLID screen
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    When user is on NLID screen
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then user verifies the Functional and Analytics options are disabled

  @P11270-32152 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @Sprintandroid2321 @SprintiOS2322
  Scenario: The app should display the updated site check-in tutorial screen #1 (Google User.)
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user verifies the Account title in the account section
    And user taps on delete your account in account screen
    And user verifies the delete your account screen
    And user taps on delete in delete your account screen
    And user verifies the delete your account popup
    And tap on Ok Button
    Then user verifies the app redirects back to NLID
    And user taps on "Google" icon in the NLID
    And I enter SSO login details for "Google"
    Then user registers the SSO user by accepting the terms and conditions screen
    When user enters four digit PIN in the Set up PIN screen in registration flow
    When user tap on continue button in Set up PIN screen in registration flow
    And user tap on ok button in Set up PIN screen in registration flow
    When user is on NLID screen
    And user taps on More button in tab bar
    When user navigates to Account screen
    And user tap on add card button in account
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
    When user tap on payment method added successfully screen continue button
    And user verifies the account page
    Then user taps on Station Finder
    When user taps on Continue button in Let us locate nearest station screen
    Then system displays the popup with the contents
    When user taps on any of the following using the App button
    When user taps on Continue button in Allow Location screen
    Then the system navigates to the Esso Station Finder Screen
    And user navigated to NLID Screen
    When user taps on start button in LID
    Then user validates the first tutorial screen during fuelling

  @P11270-4930 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify whether System is able to display Copy Text, as user taps on Continue button
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    Then user naviagtes to the NLID screen after tutorial screens
    #Then user navigates across the tutorial screens
    Then user taps on Station Finder
    When user verify the location permission screen and bypass the screen
    Then system displays the popup with the contents
    Then user taps on any of the following using the App button

  @P11270-4934 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System is able to perform below mentioned actions if, user has tapped on Always allow/Only while using the app button a.Enable the location access for the app
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    Then user naviagtes to the NLID screen after tutorial screens
    #Then user navigates across the tutorial screens
    Then user taps on Station Finder
#    When user verify the Location Permission screen
    When user taps on Continue button in Let us locate nearest station screen
    Then system displays the popup with the contents
    When user taps on any of the following using the App button
    Then the system navigates to the Esso Station Finder Screen

  @P11270-4948 @iOSRegression @iOSRegressionSet2
  Scenario: Check Whether System displays the pop up message for device location off in fuel finder screen
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    #Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens
    Then user taps on Station Finder
    When user verify the location permission screen and bypass the screen
    Then system displays the popup with the contents and tap don't allow
    Then system should display the copy text msg if the user has not given the location services access

  @P11270-13138 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @Sprint2321_22_
  Scenario: Install & Launch :  Install& Launch  Esso app Launch Screen 3 UI and Alignment and animation
    Given reset the app
    Then user validates tutorial screen
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    And user clicks on GET STARTED button
    Then user naviagtes to the NLID screen after tutorial screens

  @P11270-12045 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @Sprintandroid2322 @SprintiOS2322
  Scenario: Verify 'PROFILE COMPLETION AT XX%' button with an increment of 10% for 'Location Services' task is completed
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
    Then user verifies permission settings in the Complete your profile screen
    When user taps on location button in the complete profile screen
    When user verify the location permission screen and bypass the screen
    Then system displays the popup with the contents
    When user taps on any of the following using the App button
    When user taps on Continue button in Allow Location screen
    Then user verifies permission settings in the Complete your profile screen
    When user taps on location button in the complete profile screen
    And user verifies the completed pop up message and clicks ok button
    And user taps on back and navigates to LID
    Then user verifies the progress in the LID

  @P11270-13136-AppLaunch @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Install& Launch  Esso app Launch 1 Screen UI and Alignment and animation
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    Then user naviagtes to the NLID screen after tutorial screens
    #Then user navigates across the tutorial screens

  @P11270-13131-AppLaunch @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Install& Launch Esso app Launch Screen 2 UI and Alignment and animation
    Given reset the app
    Then verify that Welcome screen screen is displayed and Pump in welcome screen
    And Verify Pay securely from your car screen displayed
    And user taps on SKIP button in the tutorial screen
    Then user naviagtes to the NLID screen after tutorial screens
    #Then user navigates across the tutorial screens

  @P11270-4938-Station @P11270-4931-Station @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System should not to display distance and other details for Fuel Finder button if user has not given location access for the app and distance should be calculated from the London location
    When user is on NLID screen
    Then user taps on Station Finder
    When user verify the location permission screen and bypass the screen
    Then system displays the popup with the contents and tap don't allow
    Then system should display the location access for the app
    And verify whether the system navigate back to the fuel finder screen
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
#    When user verifies the got it popup before the Station details screen
#    Then user taps on GOT IT button
    Then verify user is in the Station details screen
    Then user verify whether the distance is not present

  @P11270-12105-GCO @iOSRegression @iOSRegressionSet2
  Scenario: Check whether the user is able to see "Scan QR" screen when the loaction is not allowed by default
    When user is on NLID screen
    Then Tap on FUEL AS GUEST Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify user is navigated to Scan QR Code screen when you deny the location

  @P11270-13128-AppLaunch @P11270-13117-AppLaunch @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Install & Launch :  Install& Launch  Esso app Launch Screen 3 UI and Alignment and animation
    Given reset the app
    Then user validates tutorial screen
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user taps on Get Started button in the tutorial screen
    #Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens

  @P11270-37322 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2  @R123
  Scenario: Verify the app is displaying a 'Reject All' button on the Privacy screen during 1st time app launch
    Given reset the app
    Then Verify the Cookie page elements
    And user validates whether the Reject all button is present in the privacy screen

  @P11270-37323 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2  @R123
  Scenario: Verify the app is allowing the user to reject all the privacy options
    When the user taps on the Reject all button in the privacy screen
    And user taps on SKIP button in the tutorial screen
    Then user naviagtes to the NLID screen after tutorial screens
    And user is on NLID screen
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then user verifies the Functional and Analytics options are disabled

  @P11270-4951-Station @P11270-13157-Station @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System is able to display any reference to Nectar in Filters, Services and Facilities
    When user is on NLID screen
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
    Then user taps on Station Finder
    When user verify the location permission screen and bypass the screen
    When user taps on any of the following using the App button
    When user taps on Continue button in Allow Location screen
    When user tap on filter icon
    Then Verify the app display icons next to all available services and facilities
    And verify whether the system displays reference to nectar

  @P11270-37325 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2  @R123
  Scenario: Verify the app is displaying the privacy options on the Settings screen as disabled for manual user
    And user is on NLID screen
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then user verifies the Functional and Analytics options are disabled

  @P11270-37327 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2  @R123
  Scenario: Verify the app is displaying the privacy options on the Settings screen as disabled for FB user
    Given reset the app
    Then Verify the Cookie page elements
    When the user taps on the Reject all button in the privacy screen
    And user taps on SKIP button in the tutorial screen
    Then user naviagtes to the NLID screen after tutorial screens
    Given user log out from the app if logged in
    And user taps on "Facebook" icon in the NLID
    And I enter SSO login details for "Facebook"
    When user is on NLID screen
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then user verifies the Functional and Analytics options are disabled

#  @P11270-37328 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2  @R123
#  Scenario: Verify the app is displaying the privacy options on the Settings screen as disabled for Twitter user
#    Given user log out from the app if logged in
#    And user taps on "Twitter" icon in the NLID
#    And I enter SSO login details for "Twitter"
#    When user is on NLID screen
#    And user taps on More button in tab bar
#    And user taps on settings button in more screen
#    Then user verifies the Functional and Analytics options are disabled

  @P11270-36742 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2  @R123
  Scenario: Verify that the should allow the user to cancel the transaction prior to payment authorisation. (Scan QR code screen)
    Given user is on NLID screen
    Then user taps on Station Finder
    When user verify the location permission screen and bypass the screen
    Then system displays the popup with the contents and tap don't allow
    When user taps on Continue button in Allow Location screen
    Then system should display the location access for the app
    And verify whether the system navigate back to the fuel finder screen
    Then Click on fuel tab
    When user taps on start button in LID
    When user taps on cancel button in the bottom of the screen
    Then user validates the cancel transaction popup
    When user taps on cancel trasaction button in the cancel transaction popup
    Then user navigates back to the LID screen

  @P11270-36747 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2  @R123
  Scenario: Verify that the application should not cancel the transaction (Scan QR code screen)
    Given user is on NLID screen
#    Then user taps on Station Finder
#    When user verify the location permission screen and bypass the screen
#    Then system displays the popup with the contents and tap don't allow
#    Then system should display the location access for the app
#    And verify whether the system navigate back to the fuel finder screen
#    Then Click on fuel tab
    When user taps on start button in LID
    When user taps on cancel button in the bottom of the screen
    Then user validates the cancel transaction popup
    When user taps on close button in the cancel transaction popup
    Then Verify user is navigated to Scan QR Code screen

  @P11270-36760 @iOSRegression @iOSRegressionSet2 @R123
  Scenario: Verify that the should allow the user to cancel the transaction prior to payment authorisation. (GCO - Scan QR code screen)\
    When user log out from the app if logged in
    Then Tap on FUEL AS GUEST Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    When user taps on cancel button in the bottom of the screen
    Then user validates the cancel transaction popup
    When user taps on cancel trasaction button in the cancel transaction popup
    Then user verifies the app redirects back to NLID

  @P11270-37330 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @R123
  Scenario: Verify the app is displaying the privacy options on the Settings screen as disabled for Linked-In user
    Given user log out from the app if logged in
    And user taps on "LinkedIn" icon in the NLID
    And I enter SSO login details for "LinkedIn"
    When user is on NLID screen
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then user verifies the Functional and Analytics options are disabled

  @P11270-37324 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @R123
  Scenario: Verify the app is displaying the privacy options on the Settings screen as disabled
    And user log out from the app if logged in
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then user verifies the Functional and Analytics options are disabled

  @P11270-4970-Station @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System to convert full Map View into split Map View and List View, if user has tapped on List Stations button
    When user is on NLID screen
    When user taps on Station Finder
    When user enters search term in station finder
    When user tap on list view
    Then verify whether system convert full Map View into split Map View and List View if user has tapped on List Stations button

  @P11270-4981-Station @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether system to Get Directions as button , on tapping USER will be navigating to the route map view,Displaying the route to the destination(fuel station)
    When user is on NLID screen
    Then user taps on Station Finder
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
#    When user verifies the got it popup before the Station details screen
#    Then user taps on GOT IT button
    Then verify user is in the Station details screen
    When user taps on Get Directions Button
    Then user navigates to the route map view

  @P11270-4973-Station @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether system to search for given keyword and load the station listing based on keyword entered by the user as user taps on Search button from keyboard
    When user is on NLID screen
#    And close the modal popup
    When user taps on Station Finder
    When user enters search term in station finder
    And user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details

  @P11270-4967-Station @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System able to display the map view after applying the filter
    When user is on NLID screen
#    And close the modal popup
    Then user taps on Station Finder
    When user tap on filter icon
    Then Verify the System is able to display the following components as part of Filter By screen
    When taps on any of the services and facilities
    Then verify if a tick mark is displayed next to the selected services
    And verify the change in Apply Filter button
    When user clicks on Apply filter button
    Then the system navigates to the Esso Station Finder Screen

#  The below TC fails in Android due to this defect - P11270-28743
  @P11270-4959-Station @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System to display Opening Hours details in Station Details screen
    When user is on NLID screen
    Then user taps on Station Finder
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then verify user is in the Station details screen
    And check whether System displays Opening Hours details in Station Details screen

  @P11270-4943-Station @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System show results based on entered City on the map view as well as the list view(search field will accept alphabets and numbers)
    When user is on NLID screen
    Then user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user enters search term in station finder
    When user tap on list view
    Then check whether System show results based on entered city on the map as well as list view

  @P11270-11502-Station @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether logged in user should see the station distance in miles for each station in the list stations
    When user is on NLID screen
    And close the modal popup
    When user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user clicks on the search field in the Esso Station Finder Screen
#    Then verify whether the system displays Search button as a part of keyboard
    When user enters search term in station finder
    Then verify if the Mobile pay stations is selected by default
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    And user verify the app display the direct distance of the stations from device location

  @P11270-11499-Station @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether Non logged in user should see icons next to each service & facilities available in the respective station
    When user log out from the app if logged in
    When user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user clicks on the search field in the Esso Station Finder Screen
#    Then verify whether the system displays Search button as a part of keyboard
    When user enters search term in station finder
    Then verify if the Mobile pay stations is selected by default
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    And user selects a station from the list
    Then verify user is in the Station details screen
    Then verify the app display icons next to all available services and facilities in the respective station

  @P11270-4949 @iOSRegression @iOSRegressionSet2
  Scenario: Check whether System is able to navigate user to App level settings under Device Settings, as user taps on Settings button
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens
    Then user taps on Station Finder
    When user verify the location permission screen and bypass the screen
    Then system displays the popup with the contents and tap don't allow
    And user clicks on Settings button
    Then verify whether the system is able to navigate to the App level settings under Device Settings

  @P11270-4950 @iOSRegression @iOSRegressionSet2
  Scenario: Check whether System is able to close the prompt as user taps on Cancel button
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens
    Then user taps on Station Finder
    When user verify the location permission screen and bypass the screen
    Then system displays the popup with the contents and tap don't allow
    And user clicks on Cancel button
    Then the system navigates to the Fuel Finder Screen

  @P11270-13234 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the system displays the available stations when user navigates to station finder maps in under 3 seconds.
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    #Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens
    Then user taps on Station Finder
    When user verify the location permission screen and bypass the screen
    When user taps on any of the following using the App button
#    When user taps on Continue button in Allow Location screen
    Then check the map is displayed in the station finder screen
    Then Check whether multiple stations are displayed in cluster

  @P11270-12101 @iOSRegression @iOSRegressionSet2
  Scenario: Check whether user is able to navigate to the Allow Location screen from the terms and condition screen
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
#    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens
    Then Tap on FUEL AS GUEST Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Check whether user is able to navigate to the Allow Location screen from the terms and condition screen

  @P11270-12109 @iOSRegression @iOSRegressionSet2
  Scenario: Check whether the user is able to view all elements are displayed in the Select your ppump screen
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens
    Then Tap on FUEL AS GUEST Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Check whether user is able to navigate to the Allow Location screen from the terms and condition screen
    And Tap the continue button in the Allow location screen
    Then Verify whether the user is able to view the location permission popup
    And Tap on Allow Location
    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin
    Then Veriy the user is able to view the Select your pump screen with all expected elements

  @P11270-12102 @iOSRegression @iOSRegressionSet2
  Scenario: Check whether user is able to see location permission screen with all the text and buttons expected
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens
    Then Tap on FUEL AS GUEST Button in the NLID
    Then verify user is able to view Terms and Condition Screen
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Veriy the user is able to view the location permission screen with all expected elements
    Then user taps on any of the following using the App button

  @P11270-12103 @iOSRegression @iOSRegressionSet2
  Scenario: Check whether the user is able to view the location permission popup in Allow loaction screen
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens
    Then Tap on FUEL AS GUEST Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    And Click on Continue button in Allow location screen
    And Verify that elements displayed in Location access page
    Then user taps on any of the following using the App button

  @P11270-21631 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2412 @iOSRegression @iOSRegressionSet2 @iOSSprint2414
  Scenario:Verify the user should able to display the Analytics & Performance section with a checkbox.
    Given reset the app
    Then user should redirect to Data Privacy landing page screen
    When user taps on manage options
    Then user should redirect to Manage your cookie settings screen
    Then user should view title as Analytics & Performance for the analytics section
    Then user should see Analytics & Performance checkbox for the analytics section
    Then user should see the copy text as the content in the Analytics & Performance section

  @P11270-21632 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2412 @iOSRegression @iOSRegressionSet2 @iOSSprint2414
  Scenario:Verify the user should able to unselect/select the analytics check box.
    When user taps on manage options
    Then user should redirect to Manage your cookie settings screen
    Then user should view title as Analytics & Performance for the analytics section
    Then user should see Analytics & Performance checkbox for the analytics section
    Then user should be able to select Analytics & Performance checkbox
    Then user should be able to unselect Analytics & Performance checkbox

  @P11270-21633 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2412 @iOSRegression @iOSRegressionSet2 @iOSSprint2414
  Scenario:Verify the user should able to display the Functional section with a checkbox.
    Given user taps on manage options
    Then user should redirect to Manage your cookie settings screen
    Then user should view title as Functional for the Functional section
    Then user should see Functional checkbox for the Functional section
    Then user should see the copy text as the content in the Functional section

  @P11270-21634 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2412 @iOSRegression @iOSRegressionSet2 @iOSSprint2414
  Scenario:Verify the user should able to unselect/select the Functional check box.
    Given user taps on manage options
    Then user should redirect to Manage your cookie settings screen
    Then user should view title as Functional for the Functional section
    Then user should see Functional checkbox for the Functional section
    Then user should be able to select Functional checkbox
    Then user should be able to unselect Functional checkbox

  @P11270-21661 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2412
  Scenario:Verify the user should able to navigate back to the Data Privacy landing page screen
    Given reset the app
    Then user should redirect to Data Privacy landing page screen
    When user taps on manage options
    Then user should redirect to Manage your cookie settings screen
    When user taps back on manage your cookie settings screen

  @P11270-21662 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2412
  Scenario:Verify the user should retain the previous selection made by the user on the ‘MANAGE OPTIONS' screen.
    When user taps on manage options
    Then user should redirect to Manage your cookie settings screen
    When user should be able to select Analytics & Performance checkbox
    When user should be able to select Functional checkbox
    When user taps back on manage your cookie settings screen
    When user taps on manage options
    Then App should show the selected options retained

  @P11270-21636 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2412
  Scenario:Verify the user should able to accept the user privacy settings for Analytics & Performance/Functional from the ‘MANAGE OPTIONS' screen.
    When user taps on manage options
    Then user should redirect to Manage your cookie settings screen
    When user should be able to select Analytics & Performance checkbox
    When user should be able to select Functional checkbox
    When user taps on confirm on manage your cookie settings screen
    Then user should redirected to tutorial screen

  @P11270-21713 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2413
  Scenario:Verify for user privacy policy selection in settings screen
    Given reset the app
    Then application should display cookie setting
    Then application should display Accept All button
    Then application should display Reject All button
    Then application should display Manage Options button
    When user taps on Accept All button
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user taps on Get Started button in the tutorial screen
    Then user allows notification
    Then click on OK button on NLID
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then app should display Location Services
    Then app should display Notifications
    Then app should display Camera Access
    Then app should display Analytics and Performance
    Then app should display Functional

  @P11270-21715 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2413
  Scenario:Verify for the Analytics & Performance section under Cookie Settings in settings screen
    Given reset the app
    Then application should display cookie setting
    Then application should display Accept All button
    Then application should display Reject All button
    Then application should display Manage Options button
    When user taps on Accept All button
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user taps on Get Started button in the tutorial screen
    Then user allows notification
    Then click on OK button on NLID
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then app should display Location Services
    Then app should display Notifications
    Then app should display Camera Access
    Then app should display Analytics and Performance

  @P11270-21716 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2413
  Scenario:Verify for the Functional section under Cookie Settings in settings screen
    Given reset the app
    Then application should display cookie setting
    Then application should display Accept All button
    Then application should display Reject All button
    Then application should display Manage Options button
    When user taps on Accept All button
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user taps on Get Started button in the tutorial screen
    Then user allows notification
    Then click on OK button on NLID
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then app should display Location Services
    Then app should display Notifications
    Then app should display Camera Access
    Then app should display Functional

  @P11270-21740 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2413
  Scenario:Verify the user should able to allow accept the user privacy settings for Analytics & Performance from the ‘Setting' screen.
    Given reset the app
    Then application should display cookie setting
    Then application should display Accept All button
    Then application should display Reject All button
    Then application should display Manage Options button
    When user taps on Accept All button
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user taps on Get Started button in the tutorial screen
    Then user allows notification
    Then click on OK button on NLID
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then app should display Location Services
    Then app should display Notifications
    Then app should display Camera Access
    Then app should display Analytics and Performance
    Then user toggles Analytics & Performance to allow

  @P11270-21741 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2413
  Scenario:Verify the user should able to allow accept the user privacy settings for Functional from the ‚ÄòSetting' screen.
    Given reset the app
    Then application should display cookie setting
    Then application should display Accept All button
    Then application should display Reject All button
    Then application should display Manage Options button
    When user taps on Accept All button
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user taps on Get Started button in the tutorial screen
    Then user allows notification
    Then click on OK button on NLID
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then app should display Location Services
    Then app should display Notifications
    Then app should display Camera Access
    Then app should display Functional
    Then user toggles Functional to allow

  @P11270-21742 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2413
  Scenario:Verify the user should able to decline accept the user privacy settings for Analytics & Performance from the ‘Setting' screen.
    Given reset the app
    Then application should display cookie setting
    Then application should display Accept All button
    Then application should display Reject All button
    Then application should display Manage Options button
    When user taps on Accept All button
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user taps on Get Started button in the tutorial screen
    Then user allows notification
    Then click on OK button on NLID
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then app should display Location Services
    Then app should display Notifications
    Then app should display Camera Access
    Then app should display Analytics and Performance
    Then user toggles Analytics & Performance to decline

  @P11270-21744 @AndroidRegressionSet2 @AndroidRegression @Sprintandroid2413
  Scenario:Verify the user should able to decline accept the user privacy settings for Functional from the ‚ÄòSetting' screen.
    Given reset the app
    Then application should display cookie setting
    Then application should display Accept All button
    Then application should display Reject All button
    Then application should display Manage Options button
    When user taps on Accept All button
    When user tap on next button
    Then Validate second screen
    When user tap on next button
    Then Validate third screen
    When user taps on Get Started button in the tutorial screen
    Then user allows notification
    Then click on OK button on NLID
    And user taps on More button in tab bar
    And user taps on settings button in more screen
    Then app should display Location Services
    Then app should display Notifications
    Then app should display Camera Access
    Then app should display Functional
    Then user toggles Functional to decline

  @P11270-14813 @iOSRegression @iOSRegressionSet2
  Scenario: Verify if System navigate the user to non logged-in dashboard from Scan QR-Code camera screen (GCO) after 300 seconds of inactivity
    Given reset the app
    Then verify that Welcome screen screen is displayed
    And user taps on SKIP button in the tutorial screen
    Then user navigates across the tutorial screens
    Then user naviagtes to the NLID screen after tutorial screens
    Then Tap on FUEL AS GUEST Button in the NLID
    Then user should opt out Verify the Terms and condition checkbox
    And Tap on continue button
    Then Verify user is navigated to Scan QR Code screen when you deny the location
    When Tap on Scan QR Code button
    Then Verify user is navigated to Scan QR Code Camera screen
    And Verify user is navigated to NLID screen from Scan QR Code Camera screen after 300 seconds of in activity

#  ====================================================================================================================
#  ====================================================================================================================
##  @P11270-12109_iOS  @iOSRegression  @GCO_iOS -
#  Scenario: Check whether the user is able to view all elements are displayed in the Select your pump screen
#    Given user is on NLID screen
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Verify the Elements present in the Select your pump screen
#    And user is navigated to Select your pump screen
##    And user selects pump number "10" to start fuelling
#    And user selects the pump from 'Select your Pump' page and taps on continue button
#
#  @P11270-4985-Station @RegressionUKR221_123 @RegressionSF1DONELogin
#  Scenario: Check whether System to update search results if USER is switching toggle button option
#    When user is on NLID screen
#    When user taps on Station Finder
#    When user tap on list view
#    Then the system displays the copy text msg
#    And user verifies the copy text msg displayed
#    And system displays the current location on the map
#    And verify System displays Mobile Pay Stations as selected by default
#    When user switches toggle button option
#    Then System should update results based on the search
#
#  @P11270-4982-Station @RegressionUKR221_123 @RegressionSF1DONELogin
#  Scenario: Check whether System to display Mobile Pay Stations as selected by default
#    When user is on NLID screen
#    When user taps on Station Finder
#    When user tap on list view
#    Then the system displays the copy text msg
#    And user verifies the copy text msg displayed
#    And system displays the current location on the map
#    And verify System displays Mobile Pay Stations as selected by default

#  @P11270-15916 @P11270-13134 @iOSRegression @Offers_Android @AndrsoidRegressionR221
#  Scenario: Offers - Newly added and verify the Nectar card
##    Given user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And delete added nectar card if exists
#    When user taps on Offers
#    And validate offer details in offers screen
#    When user tap on add nectar button in offers screen
#    Then user is navigated to add nectar screen
#    And enter nectar card value and tap on next button
#    Then enter "NectarCardAddAndVerify" Nectar card number and password
#    Then validate nectar card number and point balance in offers screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And navigate to the Nectar card section
#    And validate added nectar card in account
#    Then delete added nectar card

#  @P11270-12104 @AndroidRegressiosnR221
#  Scenario: Check whether the user is able to view the location permission popup in Allow loaction screen (Android)
#    Given reset the app
#    Then verify that Welcome screen screen is displayed
#    And user taps on SKIP button in the tutorial screen
#    Then user navigates across the tutorial screens
#    Then user naviagtes to the NLID screen after tutorial screens
#    Then Tap on FUEL AS GUEST Button in the NLID
#    Then verify user is able to view Terms and Condition Screen
#    Then user should opt out Verify the Terms and condition checkbox
#    And Tap on continue button
#    Then Check whether user is able to navigate to the Allow Location screen from the terms and condition screen
#    And Tap the continue button in the Allow location screen
#    Then Verify whether the user is able to view the location permission popup
#    And Tap on Deny button
#    Then Verify user is navigated to Scan QR Code screen
#    And Tap on turn on location link
#    And Tap on Allow Location
#    Then Verify whether the user is able to view the Select your pump screen for a valid mobile pay site checkin