@StationFinder

Feature: StationFinder

  @P11270-13120 @AndroidRegression @AndroidRegressionSet2
  Scenario: Ensure that the system to allow user to view the station markers
    When user log out from the app if logged in
    Then user taps on Station Finder
    When user enters search term in station finder
    Then user validates cluster displayed in map area
    When user tap on a cluster
    Then map gets zoomed in to display cluster and map pins

  @P11270-11497 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether logged-in user should be able to see icons next to the services & facilities available in the ‘Filter by’ screen.
    When user log out from the app if logged in
    Then user taps on Station Finder
    When user tap on filter icon
    Then Verify the app display icons next to all available services and facilities

  @P11270-11503 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify Non logged in user should see the station distance in miles for station in Station Details screen
    Given user is on NLID screen
    When user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user clicks on the search field in the Esso Station Finder Screen
    When user enters search term in station finder
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    And user selects a station from the list
    Then verify user is in the Station details screen
    Then user verify the app display the direct distance in miles for station in Station Details screen

  @P11270-4969 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether system not able to update the filters for Find Esso Stations screen, if user has tapped on Cancel button
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
    Then user taps on Station Finder
    When user tap on filter icon
    When taps on any of the services and facilities
    Then verify if a tick mark is displayed next to the selected services
    And verify the change in Apply Filter button
    When user taps on cancel button in Filter By Screen
    Then the system navigates to the Esso Station Finder Screen

  @P11270-4942 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2 @iOSSprint2413
  Scenario: Check whether System show results based on entered Postcode on the map view as well as the list view(search field will accept alphabets and numbers)
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
    Then user taps on Station Finder
    When user clicks on the search field in the Esso Station Finder Screen
    When user enters search term in station finder
#    Then verify if the Mobile pay stations is selected by default
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details

  @P11270-49301 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario:Verify The app should display the Clear Filter button on the Filter by screen.
    Given user is on NLID screen
    When user taps on Station Finder
    And user tap on filter icon
    Then user verifies the apply and clear all button

  @P11270-13227 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify system to display the available stations when user navigates to station finder maps in under 3 seconds.
    When user log out from the app if logged in
    Then user taps on Station Finder
    Then verify the available station is displayed under 3 seconds

  @P11270-4941 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System able to display Welcome to (Fuel Station Name) when the user is at the Fuel station
    When user log out from the app if logged in
    And user clicks on Login Icon
    When I enter "regressioncredentials2" in login details
    And user taps login button in login screen
    Given user is on NLID screen
    Then user verify the Welcome to Station name in the LID screen

  @P11270-11500 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether logged in user should see icons next to each service & facilities available in the respective station
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
    When user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user clicks on the search field in the Esso Station Finder Screen
    When user enters search term in station finder
#    Then verify if the Mobile pay stations is selected by default
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    And user selects a station from the list
    Then verify user is in the Station details screen
    Then verify the app display icons next to all available services and facilities in the respective station

  @P11270-11504 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether  logged in user should see the station distance in miles for station in Station Details screen
    Given user is on NLID screen
    When user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user clicks on the search field in the Esso Station Finder Screen
    When user enters search term in station finder
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    And user selects a station from the list
    Then verify user is in the Station details screen
    Then user verify the app display the direct distance in miles for station in Station Details screen

  @P11270-11498 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether logged-in user should be able to see icons next to the services & facilities available in the ‘Filter by’ screen.
    Given user is on NLID screen
    Then user taps on Station Finder
    When user tap on filter icon
    Then Verify the app display icons next to all available services and facilities

  @P11270-13231 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether the system displays all fueling station sites in the visible map area matching Station list
    Given user is on NLID screen
    Then user taps on Station Finder
    When user enters search term in station finder
#    Then verify if the Mobile pay stations is selected by default
    And check the stations are displayed in the station finder screen

  @P11270-4958 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System to allow user to make a call when tapping on the phone number
    When user is on NLID screen
    Then user taps on Station Finder
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then verify user is in the Station details screen
    Then verify whether System to display phone number in station details screen
    When user taps on phone number
    And check whether the System displays prompt with phone number with Call and cancel button
    When user taps on cancel button the system should close the prompt
    Then verify user is in the Station details screen
    And  System to navigate user to device level to make a call to the station when user tap on Call button

  @P11270-4953 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify whether the system is able to display the following components as part of Station finder
    When user is on NLID screen
    Then user taps on Station Finder
    Then Verify whether the system is able to display the following components as part of Station finder

  @P11270-13230 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether user navigates to station finder maps and experiences a delay equivalent to the large number of stations to be retrieved in the mapped area
    When user is on NLID screen
    Then user taps on Station Finder
    Then check the map is displayed in the station finder screen

  @P11270-4980 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether system to navigate user back to Fuel Finder screen
    When user is on NLID screen
    When user taps on Station Finder
    When user enters search term in station finder
    Then verify if the Mobile pay stations is selected by default
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details

  @P11270-4939 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System is able to get the consolidated list of all available fueling stations with complete details
    When user is on NLID screen
    When user taps on Station Finder
    When user enters search term in station finder
    And user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details

  @P11270-4964 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario:Check whether System to take the USER to the station detail screen for a mobile pay enabled station if USER taps on the icon for mobile pay enabled station
    When user is on NLID screen
    When user taps on Station Finder
    When user taps on Mobile pay Stations in Esso Station Finder Screen
    When user enters search term in station finder
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    Then user selects a station from the list
    Then verify user is in the Station details screen

  @P11270-4968 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether service option available under filter
    When user is on NLID screen
    Then user taps on Station Finder
    When user tap on filter icon
    Then Verify the System is able to display the following components as part of Filter By screen
    When taps on any of the services and facilities
    Then verify if a tick mark is displayed next to the selected services
    And verify the change in Apply Filter button

  @P11270-4952 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System is able to load below mentioned details for fuel station list view in the following order
    When user is on NLID screen
    Then user taps on Station Finder
    When user enters search term in station finder
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    Then user verify the app display the direct distance of the stations from device location

  @P11270-4955 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System is able to display the following components as part of Filter By screen.
    When user is on NLID screen
    Then user taps on Station Finder
    When user tap on filter icon
    Then Verify the System is able to display the following components as part of Filter By screen

  @P11270-13156 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify whether View offer loads  Non load to card offer in the Offers section
    When user is on NLID screen
    Then user taps on Offers
    And validate offers displayed in offer screen
    Then tap on view offers button
    And validate offer details
    Then tap on Terms & conditions link
    And validate Terms & conditions overlay
    Then close the Terms & conditions overlay

  @P11270-4937 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System is able to make the service call and load the nearby fueling stations by making a service calls and load the nearby fueling stations
    When user is on NLID screen
    When user taps on Station Finder
    And user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details

  @P11270-4965 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario:Check whether System to take the USER to the station detail screen for a not mobile pay enabled station, if USER taps on the icon for non-mobile pay enabled station.
    When user is on NLID screen
    When user taps on Station Finder
    When user enters search term with a non mobile station in station finder
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    Then user selects a station from the list
    Then verify user is in the Station details screen
    And check whether System displays Opening Hours details in Station Details screen

  @P11270-4960 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Check whether System to display Service and Facilities details in Station Details screen
    When user is on NLID screen
    Then user taps on Station Finder
    When user enters search term in station finder
    When user tap on list view
    Then user selects a station from the list
    Then verify the app display icons next to all available services and facilities in the respective station

  @P11270-11501 @iOSRegression @iOSRegressionSet2 @AndroidRegression @AndroidRegressionSet2
  Scenario: Verify Non logged in user should see the station distance in miles for each station in the list stations
    When user log out from the app if logged in
    When user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user clicks on the search field in the Esso Station Finder Screen
    When user enters search term in station finder
    When user tap on list view
    Then verify whether System is able to get the consolidated list of all available fueling stations with complete details
    And user selects a station from the list
    Then verify user is in the Station details screen
    Then user verify the app display the direct distance in miles for station in Station Details screen

  @P11270-35253 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario: Verify The app should display the ‘Clear All’ and ‘Apply’ buttons as disabled on the Filter by screen. (NLID)
    When user log out from the app if logged in
    When user taps on Station Finder
    When user tap on filter icon
    Then User should see Clear All button disabled
    And User should see Apply button disabled

  @P11270-36997 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in Station Finder default map view
    When user is on NLID screen
    When user taps on Station Finder
    Then user validates that the app assistant is not present

  @P11270-36998 @AndroidRegression @AndroidRegressionSet2 @iOSRegression @iOSRegressionSet2 @R123
  Scenario: Manual User - Verify the Esso app is not displaying the App Assistant in Station Finder list view
    When user is on NLID screen
    When user taps on Station Finder
    And user tap on list view
    Then user validates that the app assistant is not present

  @P11270-4976 @AndroidRegression @AndroidRegressionSet2
  Scenario:Check whether System to display Search button as enabled once has not entered any keyword for search text/input field.
    When user is on NLID screen
    When user taps on Station Finder
    Then the system navigates to the Esso Station Finder Screen
    When user clicks on the search field in the Esso Station Finder Screen
    Then search button is enabled in the system keyboard

  @P11270-35152 @AndroidRegression @Sprintandroid2410 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario: Verify whether App displaying the List Stations button style updated as a block button (Manual Registered user)
    When user is on NLID screen
    When user taps on Station Finder
    Then List Stations button style should be updated as a block button

  @P11270-35263 @AndroidRegression @Sprintandroid2410 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario: Verify The app should allow the user to apply the selected filter options on the Filter by screen
    When user is on NLID screen
    When user taps on Station Finder
    When user tap on filter icon
    Then User should see Clear All button disabled
    And User should see Apply button disabled
    And user tap on mobile payment enabled filter
    Then User should see Clear All button enabled
    And User should see Apply button enabled
    Then The Application should not display the selected filter count on the apply button
    Then User applies the filter
    Then Check filter count

  @P11270-13159 @AndroidRegression @Sprintandroid2410
  Scenario: Ensure that user able to convert station markers to clustered markers
    When user log out from the app if logged in
    Then user taps on Station Finder
    When user enters search term in station finder
    Then user validates cluster displayed in map area

  @P11270-35251 @AndroidRegression @Sprintandroid2410 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario: Verify The app should display the Clear Filter button on the Filter by screen. (Manual Registered User)
    When user is on NLID screen
    And user taps on Station Finder
    And user tap on filter icon
    Then user verifies the apply and clear all button

  @P11270-35254 @AndroidRegression @Sprintandroid2410 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario:Verify The app should display the ‘Clear All’ and ‘Apply’ buttons as disabled on the Filter by screen. (Manual Registered User)
    When user is on NLID screen
    When user taps on Station Finder
    When user tap on filter icon
    Then User should see Clear All button disabled
    And User should see Apply button disabled

  @P11270-35260 @AndroidRegression @Sprintandroid2410 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario:Verify The app should allow the user to clear the selected filter options on the Filter by screen. (Manual Registered User)
    When user is on NLID screen
    When user taps on Station Finder
    When user tap on filter icon
    Then User should see Clear All button disabled
    And User should see Apply button disabled
    And user tap on mobile payment enabled filter
    Then User should see Clear All button enabled
    And User should see Apply button enabled
    Then User applies the filter
    When user tap on filter icon
    Then User clears all the filter
    Then User should see Clear All button disabled
    Then User should see Apply button enabled

  @P11270-35252 @AndroidRegression @Sprintandroid2410 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario: Verify The app should display the Clear Filter button on the Filter by screen. (SSO User)
    Given user log out from the app if logged in
    And user taps on "Facebook" icon in the NLID
    And I enter SSO login details for "Facebook"
    When user taps on Station Finder
    And user tap on filter icon
    Then user verifies the apply and clear all button

 @P11270-4986 @AndroidRegressions @Sprintandroid2411 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario: Check whether System to update search results if USER is switching toggle button option
    When user is on NLID screen
    When user taps on Station Finder
    Then user enters search term in station finder where the stations are not available
    When user tap on list view
    Then check the copytext of searched field
    When user switches toggle button option

  @P11270-49300 @AndroidRegression @Sprintandroid2411 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario:Verify The app should display the Clear Filter button on the Filter by screen.
    Given user log out from the app if logged in
    When user taps on Station Finder
    And user tap on filter icon
    Then user verifies the apply and clear all button

  @P11270-35168 @AndroidRegression @Sprintandroid2413
  Scenario:Verify whether App displaying the List Stations button style updated as a block button (NLID to NLID)
    When user is on NLID screen
    When user taps on Station Finder
    Then List Stations button style should be updated as a block button

  @P11270-35262 @AndroidRegression @Sprintandroid2413 @iOSRegression @iOSSprint2413 @iOSRegressionSet2
  Scenario:The app should allow the user to apply the selected filter options on the Filter by screen. (NLID)
    When user is on NLID screen
    When user taps on Station Finder
    When user tap on filter icon
    Then User should see Clear All button disabled
    And User should see Apply button disabled
    And user tap on mobile payment enabled filter
    Then User should see Clear All button enabled
    And User should see Apply button enabled
    Then The Application should not display the selected filter count on the apply button
    Then User applies the filter
    Then Check filter count

#  @P11270-15770 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the system should allow the user to view the modal pop-up.
#    Given user is on NLID screen
#    And user taps on More button in tab bar
#    When user navigates to Account screen
#    And delete added nectar card if exists
#    Then tap on add nectar card from account screen
#    Then user is navigated to add nectar screen
#    And enter nectar card value "NectarCardAddAndVerify" and tap on next button
#    When user clicks on Continue button under 'Card Added successfully' alert
#    Then enter "NectarCardAddAndVerify" Nectar card number and password
#    And navigate to the Nectar card section from account screen
#    When user taps on Station Finder
#    Then the system navigates to the Esso Station Finder Screen
#    When user clicks on the search field in the Esso Station Finder Screen
#    When user enters search term in station finder
##    Then verify if the Mobile pay stations is selected by default
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the popup before the Station details screen
#    And user should see the copy text displayed on the modal pop and the View Details Button
#
#  @P11270-15771 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the system should allow the user to close the modal pop-up.
#    Given user is on NLID screen
#    Then user taps on Station Finder
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the popup before the Station details screen
#    And user should see the copy text displayed on the modal pop and the View Details Button
#    Then tap on close
#
  #
  #  @P11270-15772 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the system should allow the user to view the offers in the modal pop-up
#    When user is on NLID screen
#    When user taps on Station Finder
#    Then the system navigates to the Esso Station Finder Screen
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the popup before the Station details screen
#    And user should see the copy text displayed on the modal pop and the View Details Button
#    Then user taps on View Details Button
#    Then user should see the modal pop with offer details and Terms and Conditions
#
#  @P11270-15773 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the system should allow the user to close the offers in the modal pop-up
#    When user is on NLID screen
#    Then user taps on Station Finder
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the popup before the Station details screen
#    And user should see the copy text displayed on the modal pop and the View Details Button
#    Then user taps on View Details Button
#    Then user should see the modal pop with offer details and Terms and Conditions
#    Then tap on close button in offer details modal pop up
#    Then verify user is in the Station details screen
#
#  @P11270-15775 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the system should view the TC in the modal pop-up
#    When user is on NLID screen
#    Then user taps on Station Finder
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the popup before the Station details screen
#    And user should see the copy text displayed on the modal pop and the View Details Button
#    Then user taps on View Details Button
#    And user should see the modal pop with offer details and Terms and Conditions
#    When user taps on Terms and Conditions link in the view Details modal pop up
#    Then user sees the modal pop up with detailed terms and condition
#
#  @P11270-15776 @iOSRegressionR2211 @AndroidRegressionR2211 @RegressionUKR2211
#  Scenario: Verify the system should close the TC in the modal pop-up
#    When user is on NLID screen
#    Then user taps on Station Finder
#    When user enters search term in station finder
#    When user tap on list view
#    Then user selects a station from the list
#    When user verifies the popup before the Station details screen
#    And user should see the copy text displayed on the modal pop and the View Details Button
#    Then user taps on View Details Button
#    And user should see the modal pop with offer details and Terms and Conditions
#    When user taps on Terms and Conditions link in the view Details modal pop up
#    Then user sees the modal pop up with detailed terms and condition
#    Then user taps on close in terms and condition
#    And user taps on close button in view details modal pop up
#
#  @P11270-4983 @P11270-4984 @AndroidRegressionsR221
#  Scenario: Check whether System to update search results if USER is switching toggle button option
#    When user is on NLID screen
#    When user taps on Station Finder
#    When user tap on list view
#    And system displays the current location on the map
#    And verify System displays Mobile Pay Stations as selected by default
#    When user switches toggle button option
#    Then System should update results based on the search
#    And check that the system loads all Esso Stations button
#    And user clicks on current location on the map
#    And system displays the current location on the map
#    When user tap on list view
##    Then the system displays the copy text msg
#    And user verifies the copy text msg displayed
#    When user switches toggle button option
#    And user verifies the copy text msg displayed

#  @P11270-4985 @iOSRegression -Doubt
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

#  @P11270-4972 @iOSRegression -Doubt
#  Scenario: Check whether System is able to navigate user to App level settings under Device Settings, as user taps on Settings button
#    Given install open the Esso app
#    When user is on NLID screen
#    Then user is in login screen
#    When I enter "Offer1" in login d1etails
#    Then user taps login button in login screen
#    Then user taps on Station Finder
#    When user verify the Location Permission screen
#    When user taps on Continue button in Let us locate nearest station screen
#    Then system displays the popup with the contents
#    When user taps on dont allow button
#    And verify whether the system navigate back to the fuel finder screen
#    And user clicks on Settings button
#    Then verify whether the system is able to navigate to the App level settings under Device Settings

#  @P11270-4983- @iOSRegression- -Doubt
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


#  @P11270-4982 @iOSRegression -Doubt
#  Scenario: Check whether System to display Mobile Pay Stations as selected by default
#    When user is on NLID screen
#    When user taps on Station Finder
#    When user tap on list view
#    Then the system displays the copy text msg
#    And user verifies the copy text msg displayed
#    And system displays the current location on the map
#    And verify System displays Mobile Pay Stations as selected by default