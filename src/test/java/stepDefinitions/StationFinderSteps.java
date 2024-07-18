package stepDefinitions;

import com.google.common.collect.ImmutableMap;
import contants.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.*;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;

public class StationFinderSteps extends StationFinderPage {

    @Then("^Verify the app display icons next to all available services and facilities$")
    public void verifyTheAppDisplayIconsNextToAllAvailableServicesAndFacilities() throws Throwable {
        if (platformName.equalsIgnoreCase("iOS")) {
//            clickButtonWithOutScroll(OpenHoursService);
//            clickButtonWithOutScroll(OpenHoursService);
            Assert.assertTrue(MobilePaymentEnabledIcon.isEnabled());
//            clickButtonWithOutScroll(MobilePaymentEnabledIcon);
            Assert.assertTrue(OpenHoursIcon.isEnabled());
            Assert.assertTrue(TescoExpressIcon.isEnabled());
            Assert.assertTrue(FoodServiceIcon.isEnabled());
            Assert.assertTrue(PremiumCoffeeIcon.isEnabled());
            Assert.assertTrue(CustomerToiletsIcon.isEnabled());
            Assert.assertTrue(ATMIcon.isEnabled());
            Assert.assertTrue(MotorwayIcon.isEnabled());
            Assert.assertTrue(HGVPumpsIcon.isEnabled());
            Assert.assertTrue(SynergyIcon.isEnabled());
            Assert.assertTrue(SynergyUnleadedIcon.isEnabled());
            Assert.assertTrue(LPGIcon.isEnabled());
            Assert.assertTrue(AdBlueIcon.isEnabled());
            ScrollTo(StationFinderConstants.NECTARTXT, AccountConstants.IOSSCROLLUP, ClubCardService);
            Assert.assertTrue(CarWashIcon.isEnabled());
            Assert.assertTrue(JetWashIcon.isEnabled());
            Assert.assertTrue(AirTowerIcon.isEnabled());
            Assert.assertTrue(MobIcon.isEnabled());
            Assert.assertTrue(NectarPointsIcon.isEnabled());
            Assert.assertTrue(ClubCardIcon.isEnabled());
        } else {
            waitFor(5000);
            ScrollTo(StationFinderConstants.MOBTXT, AccountConstants.IOSSCROLLDOWN, MobilePaymentEnabledService);
            isElementDisplayed(MobilePaymentEnabledIcon);
            isElementDisplayed(OpenHoursIcon);
            isElementDisplayed(TescoExpressIcon);
            Assert.assertTrue(FoodServiceIcon.isDisplayed());
            Assert.assertTrue(PremiumCoffeeIcon.isEnabled());
            Assert.assertTrue(CustomerToiletsIcon.isDisplayed());
            Assert.assertTrue(ATMIcon.isDisplayed());
            Assert.assertTrue(MotorwayIcon.isDisplayed());
            Assert.assertTrue(HGVPumpsIcon.isDisplayed());
//            ScrollTo(StationFinderConstants.NECTARTXT, AccountConstants.IOSSCROLLUP, NectarPoints );
//            Assert.assertTrue(SynergyIcon.isDisplayed());
//            Assert.assertTrue(SynergyUnleadedIcon.isDisplayed());
//            Assert.assertTrue(LPGIcon.isDisplayed());
//            Assert.assertTrue(AdBlueIcon.isEnabled());
//            Assert.assertTrue(CarWashIcon.isEnabled());
//            Assert.assertTrue(JetWashIcon.isEnabled());
//            Assert.assertTrue(AirTowerIcon.isEnabled());
//            Assert.assertTrue(MobIcon.isEnabled());
//            Assert.assertTrue(NectarPointsIcon.isEnabled());
//            Assert.assertTrue(ClubCardIcon.isEnabled());
        }

    }


    @Then("^verify the app display icons next to all available services and facilities in the respective station$")
    public void verifyTheAppDisplayIconsNextToAllAvailableServicesAndFacilitiesInTheRespectiveStation() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(5000);
            ScrollTo(AccountConstants.Service_And_Facilities, AccountConstants.IOSSCROLLUP, Servs);
            waitForElement(Servs, 10);
            isElementDisplayedWithoutAssert(Servs);
            isElementDisplayedWithoutAssert(SDMobPayIcon);
            isElementDisplayedWithoutAssert(MobPayment);
            isElementDisplayedWithoutAssert(SDSynergyIcon);
            isElementDisplayedWithoutAssert(Synergy);
            isElementDisplayedWithoutAssert(SDMobil1Icon);
            isElementDisplayedWithoutAssert(MobOne);
        } else if (platformName.equalsIgnoreCase("Android")) {
            ScrollTo(StationFinderConstants.Service_And_Facilities, StationFinderConstants.IOSSCROLLUP, Servs);
            waitForElement(ServiceFacilityIcon, 10);
            Assert.assertTrue(isElementDisplayed(Servs));
            Assert.assertTrue(isElementDisplayed(ServiceFacilityIcon));
            Assert.assertTrue(isElementDisplayed(MobPayment));
            Assert.assertTrue(isElementDisplayed(SDMobPayIconStationDetails));
            Assert.assertTrue(isElementDisplayed(Open24HrsStationDetails));
            Assert.assertTrue(isElementDisplayed(Open24HoursIconStationDetails));
            Assert.assertTrue(isElementDisplayed(AtmStationDetails));
            Assert.assertTrue(isElementDisplayed(AtmIconStationDetails));
//            Assert.assertTrue(isElementDisplayed(SDSynergyIcon));
//            Assert.assertTrue(isElementDisplayed(SupremeIconStationDetails));
//            Assert.assertTrue(isElementDisplayed(CarWashIconStationDetails));
            Assert.assertTrue(isElementDisplayed(MobOne));
            Assert.assertTrue(isElementDisplayed(DirectionsLink));
        }
    }

    @Then("^user clicks on close icon for station$")
    public void user_clicks_on_close_icon_for_station() throws Throwable {

        waitFor(6000);
        // clickButtonWithOutScroll(close_Icon_Station);
    }

    @Then("^user verify the app display the direct distance of the stations from device location$")
    public void userVerifyTheAppDisplayTheDirectDistanceOfTheStationsFromDeviceLocation() {
//        if (platformName.equalsIgnoreCase("iOS")) {
        waitForElement(address_Station_List.get(0), 7);
        String s1 = "mi";
        StringUtils.containsAny(address_Station_List.get(0).getText(), s1);
        Assert.assertTrue(isElementDisplayed(DirectionsLinkList.get(0)));
//        Assert.assertTrue(isTextContain(StationOneMilesList.getText(), "mi"));
//
//        } else if (platformName.equalsIgnoreCase("Android")) {
//            waitFor(6000);
//            staticTextValidation(MilesStationOne, StationFinderConstants.KM);
//            staticTextValidation(MilesStationTwo, StationFinderConstants.KM);
//        }
    }

    @Then("^user verify the app display the direct distance in miles for station in Station Details screen$")
    public void userVerifyTheAppDisplayTheDirectDistanceInMilesForStationInStationDetailsScreen() {
        waitForElement(StationOneMiles, 10);
        Assert.assertTrue(isTextContain(StationOneMiles.getText(), "mi"));
    }

    @Then("^check the map is displayed in the station finder screen$")
    public void checkTheMapIsDisplayedInTheStationFinderScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitForElement(StationMap, 4);
            if (isElementDisplayed(StationMap)) {
                logger.info("Map is displayed under 3 seconds");
            } else {
                logger.info("Map is not displayed");
            }

        } else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(6000);
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);
            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
        }

    }

    @Then("^the user changes the view using zoom in and out and views the map$")
    public void theUserChangesTheViewUsingZoomInAndOutAndViewsTheMap() throws InterruptedException {
        waitFor(4000);
        ZoomInAndOut();
    }

    @Then("^check the stations are displayed in the station finder screen$")
    public void checkTheStationsAreDisplayedInTheStationFinderScreen() {
        waitForElement(SepStationsMap, 15);
        Assert.assertTrue(SepStationsMap.isDisplayed());
    }

    @Then("^user sees the modal pop up with detailed terms and condition$")
    public void userSeesTheModalPopUpWithDetailedTermsAndCondition() {
        waitForElement(CloseTermsAndCond, 7);
        staticTextValidation(DetTermsAndCond, StationFinderConstants.TERMSANDCOND);
        Assert.assertTrue(DetTermsAndCond.isDisplayed());
        Assert.assertTrue(TermsAndCondTxt.isDisplayed());
        Assert.assertTrue(CloseTermsAndCond.isEnabled());

    }

    @Then("^user taps on close in terms and condition$")
    public void userTapsOnCloseInTermsAndCondition() {

        waitForElement(CloseTermsAndCond, 6);
        clickButtonWithOutScroll(CloseTermsAndCond);
    }


    @When("^user taps on Mobile pay Stations in Esso Station Finder Screen$")
    public void userTapsOnMobilePayStationsInEssoStationFinderScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitForElement(MobPayStationBtn, 6);
            isElementEnabled(MobPayStationBtn);
        } else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(6000);
            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
        }
    }

    @And("^user should see the copy text displayed on the modal pop and the View Details Button$")
    public void userShouldSeeTheCopyTextDisplayedOnTheModalPopAndTheViewDetailsButton() {
        waitFor(6000);
        isElementDisplayedWithoutAssert(StationDetailsPopupLogo);
        isElementEnabled(GotItClose);
        isElementEnabled(ViewDetailsBtn.get(0));

    }

    @Then("^user should see the modal pop with offer details and Terms and Conditions$")
    public void userShouldSeeTheModalPopWithOfferDetailsAndTermsAndConditions() {
        waitFor(4000);
        staticTextValidation(TermsAndCondLink, "Terms and Conditions");
        isElementDisplayed(BannerCloseBtn);
    }

    @Then("^user taps on View Details Button$")
    public void userTapsOnViewDetailsButton() {
        waitFor(3000);
        clickButtonWithOutScroll(ViewDetailsBtn.get(0));
    }

    @Then("^tap on close button in offer details modal pop up$")
    public void tapOnCloseButtonInOfferDetailsModalPopUp() {
        waitFor(3000);
        clickButtonWithOutScroll(BannerCloseBtn);
    }

    @And("^user taps on Terms and Conditions link in the view Details modal pop up$")
    public void userTapsOnTermsAndConditionsLinkInTheViewDetailsModalPopUp() {
        waitForElement(TermsAndCondLink, 7);
        clickButtonWithOutScroll(TermsAndCondLink);
    }

    @Then("^the system navigates to the Fuel Finder Screen$")
    public void theSystemNavigatesToTheFuelFinderScreen() {

        if (platformName.equalsIgnoreCase("iOS")) {

            isElementDisplayed(MobPayStationBtn);
            isElementDisplayed(AllEssoStationBtn);
            isElementDisplayed(MapBtn);
            isElementDisplayed(FavBtn);
        } else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(7000);
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);
            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
        }
    }


    @And("^user taps on close button in view details modal pop up$")
    public void userTapsOnCloseButtonInViewDetailsModalPopUp() {
        waitForElement(BannerCloseBtn, 4);
        clickButtonWithOutScroll(BannerCloseBtn);
    }

    @When("^user verifies Continue button is displayed in Allow Location screen$")
    public void userVerifiesContinueButtonIsDisplayedInAllowLocationScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {

            isElementDisplayed(AllowLocContinueButton);
        } else if (platformName.equalsIgnoreCase("Android")) {

            waitFor(7000);
            staticTextValidation(AllowLocContinueButton, StationFinderConstants.CONTINUEBTN);
        }
    }

    private Sequence zoomSinglefinger(String fingerName, Point locus, int startRadius, int endRadius, double angle, Duration duration) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, fingerName);
        Sequence fingerPath = new Sequence(finger, 0);

        double midpointRadius = startRadius + (endRadius > startRadius ? 1 : -1) * 20;

        // find coordinates for starting point of action (converting from polar coordinates to cartesian)
        int fingerStartx = (int) Math.floor(locus.x + startRadius * Math.cos(angle));
        int fingerStarty = (int) Math.floor(locus.y - startRadius * Math.sin(angle));

        // find coordinates for first point that pingers move quickly to
        int fingerMidx = (int) Math.floor(locus.x + (midpointRadius * Math.cos(angle)));
        int fingerMidy = (int) Math.floor(locus.y - (midpointRadius * Math.sin(angle)));

        // find coordinates for ending point of action (converting from polar coordinates to cartesian)
        int fingerEndx = (int) Math.floor(locus.x + endRadius * Math.cos(angle));
        int fingerEndy = (int) Math.floor(locus.y - endRadius * Math.sin(angle));
        // move finger into start position
        fingerPath.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), fingerStartx, fingerStarty));
        // finger comes down into contact with screen
        fingerPath.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        // finger moves a small amount very quickly
        fingerPath.addAction(finger.createPointerMove(Duration.ofMillis(1), PointerInput.Origin.viewport(), fingerMidx, fingerMidy));
        // pause for a little bit
        fingerPath.addAction(new Pause(finger, Duration.ofMillis(100)));
        // finger moves to end position
        fingerPath.addAction(finger.createPointerMove(duration, PointerInput.Origin.viewport(), fingerEndx, fingerEndy));
        // finger lets up, off the screen
        fingerPath.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        return fingerPath;
    }

    private Collection<Sequence> zoom(Point locus, int startRadius, int endRadius, int pinchAngle, Duration duration) {
        // convert degree angle into radians. 0/360 is top (12 O'clock).
        double angle = Math.PI / 2 - (2 * Math.PI / 360 * pinchAngle);
        // create the gesture for one finger
        Sequence fingerAPath = zoomSinglefinger("fingerA", locus, startRadius, endRadius, angle, duration);
        // flip the angle around to the other side of the locus and get the gesture for the second finger
        angle = angle + Math.PI;
        Sequence fingerBPath = zoomSinglefinger("fingerB", locus, startRadius, endRadius, angle, duration);
        return Arrays.asList(fingerAPath, fingerBPath);
    }

    private Collection<Sequence> zoomIn(Point locus, int distance) {
        return zoom(locus, 200, 200 + distance, 45, Duration.ofMillis(25));
    }

    private Collection<Sequence> zoomOut(Point locus, int distance) {
        return zoom(locus, 200 + distance, 200, 45, Duration.ofMillis(25));
    }

    public void ZoomInAndOut() throws InterruptedException {
        // tap center to dismiss toolbars
        WebElement map = driver.findElement(By.xpath("\t\n" +
                "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
        map.click();

        Rectangle mapCoordinates = map.getRect();
        Point center = getCenter(mapCoordinates);
        driver.perform(zoomOut(center, 450));
        Thread.sleep(1000);
        driver.perform(zoomIn(center, 450));
        Thread.sleep(1000);
        driver.perform(zoomOut(center.moveBy(0, 250), 300));
        Thread.sleep(1000);
        driver.perform(zoomIn(center.moveBy(0, -250), 300));
        Thread.sleep(3000);
    }

    private Point getCenter(Rectangle rect) {
        return new Point(rect.x + rect.getWidth() / 2, rect.y + rect.getHeight() / 2);
    }

    @Then("^verify whether the system navigate back to the fuel finder screen$")
    public void verifyWhetherTheSystemNavigateBackToTheFuelFinderScreen() {
        Assert.assertTrue(isElementDisplayed(StationSearch));
    }

    @When("^user taps on any of the following using the App button$")
    public void userTapsOnAnyOfTheFollowingUsingTheAppButton() {
        waitForElement(AllowOncePopup, 15);
        if (isElementDisplayedWithoutAssert(AllowLocationWhileUsingTheApp)) {
            clickButtonWithOutScroll(AllowLocationWhileUsingTheApp);
        }
        if (isElementDisplayedWithoutAssert(AllowOncePopup)) {
            clickButtonWithOutScroll(AllowOncePopup);
        }
    }

    @Then("^Verify whether the user is able to tap on Station Finder$")
    public void verifyWhetherTheUserIsAbleToTapOnStationFinder() {
        waitForElement(TabStation, 7);
        isElementDisplayed(TabStation);
        staticTextValidation(TabStation, StationFinderConstants.STATION);
        clickButtonWithOutScroll(TabStation);
    }

    @And("^user clicks on Settings button$")
    public void userClicksOnSettingsButton() {

        if (platformName.equalsIgnoreCase("iOS")) {

            clickButtonWithOutScroll(DontAllowSettings);
        }
    }

    @And("^user clicks on Cancel button$")
    public void userClicksOnCancelButton() {
        waitFor(5000);
        if (isElementDisplayedWithoutAssert(DontallowCancel)) {
            clickButtonWithOutScroll(DontallowCancel);
        }
    }

    @And("^verify whether the system displays reference to nectar$")
    public void verifyWhetherTheSystemDisplaysReferenceToNectar() {
        if (platformName.equalsIgnoreCase("iOS")) {
            ScrollTo(StationFinderConstants.NECTARPTS, AccountConstants.IOSSCROLLUP, NectarPoints);
            isElementDisplayed(NectarPoints);
        } else if (platformName.equalsIgnoreCase("Android")) {
            ScrollTo(StationFinderConstants.NECTARPTS, AccountConstants.IOSSCROLLUP, NectarPoints);
            isElementDisplayed(NectarPoints);
//            staticTextValidation(MobilePaymentEnabledService, StationFinderConstants.MOBPAYMENT);
//            waitFor(3000);
//            staticTextValidation(OpenHoursService, StationFinderConstants.OPENHOURS);
//            waitFor(3000);
//            staticTextValidation(TescoExpressService, StationFinderConstants.TESCO);
//            waitFor(3000);
//            staticTextValidation(NectarPoints, StationFinderConstants.NECTARPTS);
        }
    }

    @Then("^Verify whether the system is able to display the following components as part of Station finder$")
    public void verifyWhetherTheSystemIsAbleToDisplayTheFollowingComponentsAsPartOfStationFinder() {
        waitFor(10000);
        if (platformName.equalsIgnoreCase("iOS")) {
            Assert.assertTrue(isElementDisplayed(StationSearch));
            Assert.assertTrue(isElementDisplayed(StationFilter));
//            isElementDisplayed(StationSearch);
//            isElementDisplayed(StationFilter);
            Assert.assertTrue(isElementDisplayed(MobPayStationBtn));
            Assert.assertTrue(isElementDisplayed(AllEssoStationBtn));
            Assert.assertTrue(isElementDisplayed(MapBtn));
            Assert.assertTrue(isElementDisplayed(FavBtn));
        } else if (platformName.equalsIgnoreCase("Android")) {
            waitElementToBeClickable(StationSearch);
            Assert.assertTrue(isElementDisplayed(StationSearch));
            Assert.assertTrue(isElementDisplayed(StationFilter));
//            isElementDisplayed(StationSearch);
//            isElementDisplayed(StationFilter);
            Assert.assertTrue(isElementDisplayed(MobPayStationBtn));
            Assert.assertTrue(isElementDisplayed(AllEssoStationBtn));
            Assert.assertTrue(isElementDisplayed(MapBtn));
            Assert.assertTrue(isElementDisplayed(FavBtn));
        }
    }

    @Then("^verify whether the system is able to navigate to the App level settings under Device Settings$")
    public void verifyWhetherTheSystemIsAbleToNavigateToTheAppLevelSettingsUnderDeviceSettings() {

        waitForElement(AllowAccessTxt, 20);
        isTextMatch(AllowAccessTxt.getText(), StationFinderConstants.ALLOWACCESSTXT);
//        Assert.assertTrue(isElementDisplayed(LocSetting));
    }

    @Then("^Verify the System is able to display the following components as part of Filter By screen$")
    public void verify_the_system_is_able_to_display_the_following_components_as_part_of_filter_by_screen() throws Throwable {
        waitForElement(OpenHoursService, 10);
        Assert.assertTrue(isElementDisplayed(filter_by_Header));
        Assert.assertTrue(isElementDisplayed(FilterByStartText));
        Assert.assertTrue(isElementDisplayed(filter_Cancel_Btn));
        Assert.assertTrue(isElementDisplayed(filter_Apply_Btn));
        if (platformName.equalsIgnoreCase("Android")) {
            Assert.assertTrue(FilterServicesList.size() >= 10);
//            ScrollTo(StationFinderConstants.CLUB, AccountConstants.IOSSCROLLUP,ClubCardIcon);
        } else {
            Assert.assertTrue(FilterServicesList.size() > 15);
        }
    }

    @Then("^whether System navigates to extended Map View By default$")
    public void whether_system_navigates_to_extended_map_view_by_default() throws Throwable {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(4000);
            isElementDisplayed(StationMap);
        } else if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);
            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
        }
    }

    @Then("^verify user is in the Station details screen$")
    public void verify_user_is_in_the_station_details_screen() throws Throwable {
        waitFor(9000);
        if (isElementDisplayedWithoutAssert(GotItClose)) {
            clickButtonWithOutScroll(GotItClose);
        }
        waitFor(5000);
        isElementEnabled(OpeningHours);
        isElementEnabled(MobPayAccept);
        isElementEnabled(FuelHrsTxt);
        isElementEnabled(PhoneTxt);
        Assert.assertTrue(GetDirections.isEnabled());

    }

    @Then("^verify whether System to display phone number in station details screen$")
    public void verify_whether_system_to_display_phone_number_in_station_details_screen() throws Throwable {
        Assert.assertTrue(PhoneTxt.isDisplayed());
    }

    @And("^check whether System displays Opening Hours details in Station Details screen$")
    public void check_whether_system_displays_opening_hours_details_in_station_details_screen() throws Throwable {
        waitForElement(open_Hours_Station, 10);
        staticTextValidation(OpeningHours, StationFinderConstants.OPENHOURSSTATION);
        staticTextValidation(fuel_Hours_Station, StationFinderConstants.FUELHOURSSTATION);
    }

    @When("^user taps on phone number$")
    public void user_taps_on_phone_number() throws Throwable {
        waitForElement(PhoneIcon, 8);
        clickButtonWithOutScroll(PhoneIcon);
    }

    @And("^check whether the System displays prompt with phone number with Call and cancel button$")
    public void check_whether_the_system_displays_prompt_with_phone_number_with_call_and_cancel_button() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(phno_Call_Station, 10);
            staticTextValidation(PhoneCallBtn, StationFinderConstants.PHNOCALLSTATION);
            staticTextValidation(PhoneCancelBtn, StationFinderConstants.PHNOCANCELSTATION);
        } else {
            waitForElement(PhoneCallBtn, 10);
            Assert.assertTrue(PhoneCallBtn.isEnabled());
            Assert.assertTrue(PhoneCancelBtn.isEnabled());
        }
    }

    @When("^user taps on cancel button the system should close the prompt$")
    public void user_taps_on_cancel_button_the_system_should_close_the_prompt() throws Throwable {
        waitForElement(PhoneCancelBtn, 6);
        clickButtonWithOutScroll(PhoneCancelBtn);
    }

    @And("^System to navigate user to device level to make a call to the station when user tap on Call button$")
    public void system_to_navigate_user_to_device_level_to_make_a_call_to_the_station_when_user_tap_on_call_button() throws Throwable {

        clickButtonWithOutScroll(PhoneIcon);
        waitForElement(CallPhoneNumber, 15);
        clickButtonWithOutScroll(CallPhoneNumber);
        if (isElementDisplayedWithoutAssert(DeviceLevelPhoneCancel)) {
            Assert.assertTrue(DeviceLevelPhoneCancel.isEnabled());
        }
    }

    @Then("^user checks that the geolocation permission is on for app$")
    public void user_checks_that_the_geolocation_permission_is_on_for_app() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);

            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);

            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);
        }
    }

    @Then("^check whether System show results based on entered city on the map as well as list view$")
    public void checkWhetherSystemShowResultsBasedOnEnteredCityOnTheMapAsWellAsListView() {
//        if (platformName.equalsIgnoreCase("iOS")) {
        isElementDisplayed(CityMapView);
        isElementDisplayed(FirstStation);
//        }
//        else if (platformName.equalsIgnoreCase("Android"))
//        {
//            waitFor(5000);
//            staticTextValidation(address_Station_List.get(0), StationFinderConstants.KM);
//        }
    }

    @Then("^verify whether system convert full Map View into split Map View and List View if user has tapped on List Stations button$")
    public void verifyWhetherSystemConvertFullMapViewIntoSplitMapViewAndListViewIfUserHasTappedOnListStationsButton() {
        waitFor(5000);
        isElementDisplayed(CityMapView);
        isElementDisplayed(FirstStation);
//      staticTextValidation(address_Station_List.get(0), StationFinderConstants.KM);
    }

    @Then("^Verify whether services available in the Esso station should be displayed in the List View$")
    public void verifyWhetherServicesAvailableInTheEssoStationShouldBeDisplayedInTheListView() {
        waitFor(3000);
        staticTextValidation(FilterByStartText, StationFinderConstants.FILTERSTARTTEXT);
        waitFor(3000);
        staticTextValidation(MobilePaymentEnabledService, StationFinderConstants.MOBPAYMENT);
        //isElementDisplayed(MobIcon);
        waitFor(3000);
        staticTextValidation(OpenHoursService, StationFinderConstants.OPENHOURS);
        //isElementDisplayed(OpenIcon);
        waitFor(3000);
        staticTextValidation(TescoExpressService, StationFinderConstants.TESCO);
        // isElementDisplayed(TescoIcon);
        waitFor(3000);
        staticTextValidation(NectarPoints, StationFinderConstants.NECTARPTS);
        //isElementDisplayed(NectarIcon);
        waitFor(3000);
        staticTextValidation(ClubPoints, StationFinderConstants.CLUB);
        //isElementDisplayed(ClubIcon);
    }

    @When("^user taps on cancel button in Filter By Screen$")
    public void userTapsOnCancelButtonInFilterByScreen() {
        waitFor(7000);
        clickButtonWithOutScroll(CancelFilterBtn);
    }

    @When("^user enters \"([^\"]*)\" in station finder$")
    public void userEntersInStationFinder(String arg0) throws Throwable {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(5000);
            enterTextWithoutScroll(StationSearch, arg0);
            waitFor(3000);
            actionClick(PostCdStation1);
        } else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(9000);
            enterTextWithoutScroll(StationSearch, arg0);
            waitFor(3000);
            getCoordinates(StationSearch);
            waitFor(1000);
            androidTap();
            waitFor(5000);
        }
    }

    @Then("^check whether System show results based on entered postcode on the map as well as list view$")
    public void checkWhetherSystemShowResultsBasedOnEnteredPostcodeOnTheMapAsWellAsListView() {
        if (platformName.equalsIgnoreCase("iOS")) {
            isElementDisplayed(PostcodeStation);
            isElementDisplayed(MapView);
        } else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(5000);
            staticTextValidation(address_Station_List.get(0), StationFinderConstants.KM);
            isElementDisplayed(CityMapView);
        }
    }

    @When("^user switches toggle button option$")
    public void userSwitchesToggleButtonOption() {
        if (platformName.equalsIgnoreCase("iOS")) {
            if (isElementEnabled(MobPayStationBtn)) {
                clickButtonWithOutScroll(AllEssoStationBtn);
            } else {
                clickButtonWithOutScroll(MobPayStationBtn);
            }
        } else {
            if (isElementEnabled(MobPayStationBtn)) {
                clickButtonWithOutScroll(MobPayStationBtn);
            } else {
                clickButtonWithOutScroll(AllEssoStationBtn);
            }
        }
    }

    @Then("^System should update results based on the search$")
    public void systemShouldUpdateResultsBasedOnTheSearch() {
        isElementDisplayed(SearchResults.get(0));
    }

    @And("^check that the system loads all Esso Stations button$")
    public void checkThatTheSystemLoadsAllEssoStationsButton() {
        if (platformName.equalsIgnoreCase("iOS")) {
            isElementEnabled(AllEssoStationBtn);
        } else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(5000);
            staticTextValidation(AllEssoStationBtn, StationFinderConstants.ESPAYSTN);
        }
    }

    @When("^user taps on All esso Stations$")
    public void userTapsOnAllEssoStations() {
        waitFor(7000);
        clickButtonWithOutScroll(AllEssoStationBtn);
    }

    @Then("^the system displays the copy text msg$")
    public void theSystemDisplaysTheCopyTextMsg() {

        if (platformName.equalsIgnoreCase("iOS")) {
            isElementDisplayed(SorryMsg);
        } else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(3000);
            staticTextValidation(SorryMsg, StationFinderConstants.SORRYMSG);
        }
    }

    @And("^user verifies the copy text msg displayed$")
    public void userVerfiesTheCopyTextMsgDisplayed() {
        waitFor(1000);
        staticTextValidation(SorryMsg, StationFinderConstants.SORRYMSG);
    }

    @And("^system displays the current location on the map$")
    public void systemDisplaysTheCurrentLocationOnTheMap() {
        isElementDisplayed(CurrentLocMap);
    }

    @And("^verify System displays Mobile Pay Stations as selected by default$")
    public void verifySystemDisplaysMobilePayStationsAsSelectedByDefault() {

        if (platformName.equalsIgnoreCase("iOS")) {
            isElementEnabled(MobPayStationBtn);
        } else if (platformName.equalsIgnoreCase("Android")) {
            isElementEnabled(AllEssoStationBtn); //All Esso Station button is enabled when Mobile Pay stations button is selected and vice versa
            staticTextValidation(MobPayStationBtn, StationFinderConstants.MBPAYSTN);
            isElementDisplayed(StationIcon);
        }
    }

    @Then("^user verify the components in the station$")
    public void user_verify_the_components_in_the_station() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(4000);
            staticTextValidation(open_Hours_Station, StationFinderConstants.OPENHOURSSTATION);
            staticTextValidation(shop_Hours_Station, StationFinderConstants.SHOPHOURSSTATION);
            waitFor(5000);
            ScrollTo(AccountConstants.Service_And_Facilities, AccountConstants.IOSSCROLLUP, Servs);
            staticTextValidation(fuel_Hours_Station, StationFinderConstants.FUELHOURSSTATION);
            staticTextValidation(get_Direction_Station, StationFinderConstants.GETDIRECTION);
        }
    }

    @Then("^verify whether the system should be able to make the service call and load the nearby service stations$")
    public void verify_whether_the_system_should_be_able_to_make_the_service_call_and_load_the_nearby_service_stations() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(5000);
            staticTextValidation(station_Phno, StationFinderConstants.STATIONPHNO);
        }
    }

    @Then("^system should display the copy text msg if the user has not given the location services access$")
    public void system_should_display_the_copy_text_msg_if_the_user_has_not_given_the_location_services_access() throws Throwable {
        Assert.assertTrue(LocationNotAllowedPopupCt.isDisplayed());
        Assert.assertTrue(
                isTextMatch(LocationNotAllowedPopupCt.getText(), StationFinderConstants.LOCATIONNOTALLOWEDPOPUPIOS));
    }

    @Then("^verify whether System is able to get the consolidated list of all available fueling stations with complete details$")
    public void verify_whether_system_is_able_to_get_the_consolidated_list_of_all_available_fueling_stations_with_complete_details() throws Throwable {
        waitFor(15000);
        Assert.assertTrue(isElementDisplayed(address_Station_List.get(0)));
        Assert.assertTrue(isElementDisplayed(DirectionsLinkList.get(0)));
    }

    @When("^user taps on Get Directions Button$")
    public void user_taps_on_get_directions_button() throws Throwable {
//
//        if (platformName.equalsIgnoreCase("Android")) {
//            waitFor(9000);
//            clickButtonWithOutScroll(get_Direction_Station);
//        } else {
        waitForElement(GetDirections, 5);
        clickButtonWithOutScroll(GetDirections);
//        }
    }

    @Then("^user navigates to the route map view$")
    public void user_navigates_to_the_route_map_view() throws Throwable {
        waitFor(5000);
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementEnabled(direction_Get_Direction)) {
                Assert.assertTrue(isElementEnabled(direction_Get_Direction));
            } else if (isElementEnabled(GoogleMapsDirectionStationDetails)) {
                clickButtonWithOutScroll(GoogleMapsDirectionStationDetails);
            }
        } else {
            Assert.assertTrue(isElementEnabled(direction_Get_Direction));
        }
    }

    @Then("^user taps on back button in fuel finder screen$")
    public void user_taps_on_back_button_in_fuel_finder_screen() throws Throwable {

        waitFor(1000);
        androidBack();

    }

    @Then("^user navigates back to NLID screen$")
    public void user_navigates_back_to_nlid_screen() throws Throwable {

        waitFor(3000);
        staticTextValidation(complete_Profile, StationFinderConstants.COMPLETEPROFILE);
    }

    @Then("^user verifies the search icon in the fuel finder screen$")
    public void user_verifies_the_search_icon_in_the_fuel_finder_screen() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(2000);
            staticTextValidation(StationSearch, StationFinderConstants.STATIONSEARCH);
            isElementDisplayed(StationSearch);
        }
    }

    @Then("^user taps on Apply Filter Button$")
    public void user_taps_on_apply_filter_button() throws Throwable {

        waitFor(10000);
        clickButtonWithOutScroll(filter_Apply_Btn);
    }

    @And("^user clicks on ok button in location off popup$")
    public void user_clicks_on_ok_button_in_location_off_popup() throws Throwable {
        waitFor(4000);
        clickButtonWithOutScroll(location_Off_Ok);
    }

    @Then("^Check whether multiple stations are displayed in cluster$")
    public void check_whether_multiple_stations_are_displayed_in_cluster() throws Throwable {

        waitFor(2000);
        isElementEnabled(map_Cluster);
    }

    @When("^user taps on no thanks in turn on location pop up$")
    public void user_taps_on_no_thanks_in_turn_on_location_pop_up() throws Throwable {
        waitFor(2000);
        clickButtonWithOutScroll(no_Thanks_Button);
    }

    @And("^verify whether the app should not display 'Open now'or 'Closed Now' Status$")
    public void verifyWhetherTheAppShouldNotDisplayOpenNowOrClosedNowStatus() {
        waitForElement(OpeningHours, 3);
        Assert.assertFalse(OpenNowTxt.isDisplayed());
    }

    @When("^user taps on any of the stations in the Map$")
    public void userTapsOnAnyOfTheStationsInTheMap() {
        clickButtonWithOutScroll(address_Station_List.get(0));
    }

    @Then("^system navigates to the Esso Station Finder Screen$")
    public void SystemNavigatesToTheEssoStationFinderScreen() {
        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(5000);
            Assert.assertTrue(isTextMatch(StationHeader.getText(), "Esso Station Finder"));
            Assert.assertTrue(StationFilter.isEnabled());
            Assert.assertTrue(StationSearch.isEnabled());
            Assert.assertTrue(FavBtn.isEnabled());
            Assert.assertTrue(MapBtn.isEnabled());
            //Assert.assertTrue(MobPayStationBtn.isEnabled());
            // Assert.assertTrue(AllEssoStationBtn.isEnabled());
            Assert.assertTrue(listStations.isEnabled());

        } else {
            waitForElement(MobPayStationBtn, 50);
            Assert.assertTrue(isTextMatch(StationHeader.getText(), "Esso Station Finder"));
            Assert.assertTrue(StationFilter.isEnabled());
            Assert.assertTrue(StationSearch.isEnabled());
            Assert.assertTrue(FavBtn.isEnabled());
            Assert.assertTrue(MapBtn.isEnabled());
            Assert.assertTrue(MobPayStationBtn.isEnabled());
            Assert.assertTrue(AllEssoStationBtn.isEnabled());
            Assert.assertTrue(listStations.isEnabled());
            isElementEnabled(MobPayStationBtn);
            isElementEnabled(AllEssoStationBtn);
            isElementEnabled(listStations);
        }

    }

    @Then("^the system navigates to the Esso Station Finder Screen$")
    public void theSystemNavigatesToTheEssoStationFinderScreen() {
        waitFor(8000);
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementDisplayedWithoutAssert(locationtitle)) {
                Assert.assertTrue(isElementDisplayed(locationtitle));
                waitFor(2000);
                clickButtonWithOutScroll(continue_btn);
                waitFor(3000);
                clickButtonWithOutScroll(permission_allow);
            }
            waitForElement(MobPayStationBtn, 20);
            Assert.assertTrue(isTextMatch(StationHeader.getText(), "Esso Station Finder"));
            Assert.assertTrue(StationFilter.isEnabled());
            Assert.assertTrue(StationSearch.isEnabled());
            Assert.assertTrue(FavBtn.isEnabled());
            Assert.assertTrue(MapBtn.isEnabled());

        } else {
            waitForElement(MobPayStationBtn, 20);
            Assert.assertTrue(isTextMatch(StationHeader.getText(), "Esso Station Finder"));
            Assert.assertTrue(StationFilter.isEnabled());
            Assert.assertTrue(StationSearch.isEnabled());
            Assert.assertTrue(FavBtn.isEnabled());
            Assert.assertTrue(MapBtn.isEnabled());
            Assert.assertTrue(MobPayStationBtn.isEnabled());
            Assert.assertTrue(AllEssoStationBtn.isEnabled());
            Assert.assertTrue(listStations.isEnabled());
            isElementEnabled(MobPayStationBtn);
            isElementEnabled(AllEssoStationBtn);
            isElementEnabled(listStations);
        }
    }

    @Then("^the system navigates to the Esso Finder Screen$")
    public void theSystemNavigatesToTheEssoFinderScreen() {
        waitForElement(MobPayStationBtn, 10);
        Assert.assertTrue(isTextMatch(StationHeader.getText(), "Esso Station Finder"));
        Assert.assertTrue(StationFilter.isEnabled());
        Assert.assertTrue(StationSearch.isEnabled());
        Assert.assertTrue(FavBtn.isEnabled());
        //Assert.assertTrue(MobPayStationBtn.isEnabled());
        Assert.assertTrue(AllEssoStationBtn.isEnabled());

    }

    @When("^user clicks on the search field in the Esso Station Finder Screen$")
    public void userClicksOnTheSearchFieldInTheEssoStationFinderScreen() {
        waitForElement(StationSearch, 3);
        clickButtonWithOutScroll(StationSearch);
    }

    @Then("^verify whether the system displays Search button as a part of keyboard$")
    public void verifyWhetherTheSystemDisplaysSearchButtonAsAPartOfKeyboard() {
        waitForElement(KeyBoardSearch, 10);
        if (platformName.equalsIgnoreCase("iOS")) {
            Assert.assertTrue(isElementEnabled(KeyBoardSearch));
        } else {

        }
    }

    @Then("^verify if the Mobile pay stations is selected by default$")
    public void verifyIfTheMobilePayStationsIsSelectedByDefault() {
        waitForElement(MobPayStationBtn, 10);
        Assert.assertTrue(isElementDisplayed(MobPayStationBtn));
    }

    @When("^user clicks on Save Station button$")
    public void userClicksOnSaveStationButton() {
        if (platformName.equalsIgnoreCase("Android")) {

            if (isElementDisplayedWithoutAssert(StationDetailsFavBtn1)) {
                waitForElement(StationDetailsFavBtn1, 8);
                clickButtonWithOutScroll(StationDetailsFavBtn1);
                waitForElement(StationDetailsFavBtn, 8);
                clickButtonWithOutScroll(StationDetailsFavBtn);
            } else {
                waitFor(8000);
                if (isElementDisplayedWithoutAssert(StationDetailsFavBtn)) {
                    clickButtonWithOutScroll(StationDetailsFavBtn);
                }
            }

        } else {
            waitFor(8000);
            if (isElementDisplayedWithoutAssert(StationDetailsFavBtn)) {
                clickButtonWithOutScroll(StationDetailsFavBtn);
            } else {
                logger.info("No Station Saved");
            }
        }
    }

    @Then("^verify if the Station is saved$")
    public void verifyIfTheStationIsSaved() {
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementDisplayedWithoutAssert(Continue_BTN)) {
                clickButtonWithOutScroll(Continue_BTN);
            }
            waitForElement(StationDetailsSaveBtn, 15);
            Assert.assertTrue(isElementEnabled(StationDetailsSaveBtn));
//            isElementEnabled(StationDetailsSaveBtn);
        } else {
            if (isElementDisplayedWithoutAssert(StationDetailsFavBtn)) {
                Assert.assertTrue(StationDetailsSaveBtn.isEnabled());
            } else {
                logger.info("Station Saved");
            }
        }
    }

    @When("^user taps on back button in Station Details screen$")
    public void userTapsOnBackButtonInStationDetailsScreen() {
        clickButtonWithOutScroll(NavBack);
    }

    @When("^taps on any of the services and facilities$")
    public void tapsOnAnyOfTheServicesAndFacilities() {
        ScrollTo(StationFinderConstants.MOBTXT, AccountConstants.IOSSCROLLDOWN, MobilePaymentEnabledService);
        clickButtonWithOutScroll(FoodServiceService);
        waitForElement(AtmService, 5);
        clickButtonWithOutScroll(AtmService);
    }

    @Then("^verify if a tick mark is displayed next to the selected services$")
    public void verifyIfATickMarkIsDisplayedNextToTheSelectedServices() {
        if (platformName.equalsIgnoreCase("iOS")) {
            int size = checkmark.size();
            Assert.assertTrue(size > 1);
        } else {
            logger.info("No tickmark available");
        }
    }

    @And("^verify the change in Apply Filter button$")
    public void verifyTheChangeInApplyFilterButton() {
        waitForElement(ApplyFilter, 8);
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(ApplyFilter, OffersContants.APPLYFILTER);
        } else {
            staticTextValidation(ApplyFilter.getText(), OffersContants.APPLYFILTER);
        }
    }

    @When("^user clicks on Apply filter button$")
    public void userClicksOnApplyFilterButton() {
        waitForElement(ApplyFilter, 15);
        clickButtonWithOutScroll(ApplyFilter);
    }

    @When("^user clicks on the Saved Station$")
    public void userClicksOnTheSavedStation() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitForElement(StationDetailsSaveBtn, 8);
            clickButtonWithOutScroll(StationDetailsSaveBtn);

        } else {
            clickButtonWithOutScroll(StationDetailsSaveBtn);
        }
    }

    @Then("^user verify the favourite Station$")
    public void user_verify_the_favourite_station() throws Throwable {
//    	if(isElementDisplayedWithoutAssert(StationFav)) {
//            waitFor(10000);
//            Assert.assertTrue(isElementEnabled(StationFav));
//            waitFor(5000);
//            clickButtonWithOutScroll(Continue1);
//        }
//    	else{
//    	  waitFor(4000);
//           if(isElementDisplayedWithoutAssert(StationFav)) {
        waitForElement(StationFav, 20);
        Assert.assertTrue(isElementDisplayed(StationFav));
        clickButtonWithOutScroll(COntinueButtonFavourite);
//           }
//           else{
//   			logger.info("No popup");
//   		}
//        }

    }

    @Then("^verify if the Station is unsaved$")
    public void verifyIfTheStationIsUnsaved() {
        waitFor(5000);
        Assert.assertTrue(isElementEnabled(StationDetailsFavBtn));
    }

    @When("^user verifies the popup before the Station details screen$")
    public void userVerifiesThePopupBeforeTheStationDetailsScreen() {
        waitFor(5000);
        if (ViewDetailsBtn.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                waitFor(5000);
                if (!ViewDetailsBtn.isEmpty()) {
                    Assert.assertTrue(!ViewDetailsBtn.isEmpty());
                    break;
                }
                waitForElement(NavBack, 10);
                clickButtonWithOutScroll(NavBack);
                waitFor(2000);
                clickButtonWithOutScroll(address_Station_List.get(0));
                waitFor(5000);
            }
        } else {
            Assert.assertTrue(!ViewDetailsBtn.isEmpty());
        }

    }

    @Then("^verify the results as a list based on the search term$")
    public void verifyTheResultsAsAListBasedOnTheSearchTerm() {
        Assert.assertTrue(SearchResults.size() > 1);
    }

    @When("^user enters the postcode in station finder search$")
    public void userEntersThePostcodeInStationFinderSearch() {
        waitForElement(StationSearch, 10);
        enterTextWithoutScroll(StationSearch, "BR11AA");
        waitForElement(StationSelect, 12);
        actionClick(StationSelect);
    }

    @When("^user verifies the got it popup before the Station details screen$")
    public void userVerifiesTheGotItPopupBeforeTheStationDetailsScreen() {
        if (GotItBtn.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                if (!GotItBtn.isEmpty()) {
                    Assert.assertTrue(!GotItBtn.isEmpty());
                    break;
                }
                waitForElement(NavBack, 10);
                clickButtonWithOutScroll(NavBack);
                waitFor(2000);
                clickButtonWithOutScroll(address_Station_List.get(1));
                waitFor(5000);
            }
        } else {
            Assert.assertTrue(!GotItBtn.isEmpty());
        }
    }

    @When("^user verifies the frequency of the modal popup before the Station details screen$")
    public void userVerifiesTheFrequencyOfTheModalPopupBeforeTheStationDetailsScreen() {
        int count = 0, i;
        while (count <= 5) {
            if (!GotItBtn.isEmpty()) {
                clickButtonWithOutScroll(GotItClose);
                for (i = 1; i <= 6; i++) {
                    if (i == 6) {
                        Assert.assertTrue(!GotItBtn.isEmpty());
                        break;
                    }
                    waitForElement(NavBack, 10);
                    clickButtonWithOutScroll(NavBack);
                    waitForElement(Fuel, 9);
                    clickButtonWithOutScroll(Fuel);
                    waitForElement(TabStation, 5);
                    clickButtonWithOutScroll(TabStation);
                    waitForElement(StationSearch, 7);
                    enterTextWithoutScroll(StationSearch, "Birmingham , UK");
                    waitForElement(StationSelect, 5);
                    actionClick(StationSelect);
                    waitForElement(listStations, 10);
                    clickButtonWithOutScroll(listStations);
                    waitFor(2000);
                    clickButtonWithOutScroll(address_Station_List.get(0));
                    waitFor(5000);
                }
                System.out.println("The frequencty is" + i);
                break;
            }
            waitForElement(NavBack, 10);
            clickButtonWithOutScroll(NavBack);
            waitForElement(Fuel, 6);
            clickButtonWithOutScroll(Fuel);
            waitForElement(TabStation, 5);
            clickButtonWithOutScroll(TabStation);
            waitForElement(StationSearch, 7);
            enterTextWithoutScroll(StationSearch, "Birmingham , UK");
            waitForElement(StationSelect, 5);
            actionClick(StationSelect);
            waitForElement(listStations, 10);
            clickButtonWithOutScroll(listStations);
            waitForElement(address_Station_List.get(0), 7);
            clickButtonWithOutScroll(address_Station_List.get(0));
            waitFor(5000);
            count++;
        }

    }

    @Then("^user verifies the got it popup before the Station details screen in NLID$")
    public void userVerifiesTheGotItPopupBeforeTheStationDetailsScreenInNLID() {
        if (GotItBtn.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                if (!GotItBtn.isEmpty()) {
                    Assert.assertTrue(!GotItBtn.isEmpty());
                    break;
                }
                waitForElement(NavBack, 10);
                clickButtonWithOutScroll(NavBack);
                waitForElement(Fuel, 6);
                clickButtonWithOutScroll(Fuel);
                waitForElement(TabStation, 5);
                clickButtonWithOutScroll(TabStation);
                waitForElement(StationSearch, 7);
                enterTextWithoutScroll(StationSearch, "Birmingham , UK");
                waitForElement(StationSelect, 5);
                actionClick(StationSelect);
                waitForElement(listStations, 10);
                clickButtonWithOutScroll(listStations);
                waitForElement(address_Station_List.get(0), 7);
                clickButtonWithOutScroll(address_Station_List.get(0));
                waitFor(5000);
            }
        } else {
            Assert.assertTrue(!GotItBtn.isEmpty());
        }

    }

    @Then("^user verify whether the distance is not present$")
    public void userVerifyWhetherTheDistanceIsNotPresent() {
        Assert.assertTrue(!isElementDisplayedWithoutAssert(StationOneMilesnotPresent));
//        Assert.assertTrue(StationOneMilesnotPresent.isEmpty());
    }

    @Then("^user verify the Welcome to Station name in the LID screen$")
    public void userVerifyTheWelcomeToStationNameInTheLIDScreen() {
        waitForElement(WelcomeToLid, 10);
        Assert.assertTrue(isTextMatch(WelcomeToLid.getText(), StationFinderConstants.GreetingTextLID));
        Assert.assertTrue(StationNameLid.isDisplayed());
    }


    @Then("verify the icons displayed next to services")
    public void verify_service_icons() {


        webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(clubCardService));
        Assert.assertTrue(serviceImages.size() > 0);

    }

    @And("^user clicks on current location on the map$")
    public void userClicksOnCurrentLocationOnTheMap() {
        clickButtonWithOutScroll(StationSearch);
        hideMobileKeyboard();
        waitFor(2000);
        clickButtonWithOutScroll(MapBtn);
    }

    @And("^verify the available station is displayed under 3 seconds$")
    public void stations_displayed() {

        waitForElement(StationCluster.get(2), 5);
        Assert.assertTrue("Station is not displayed under 3 seconds", StationCluster.get(2).isDisplayed());
    }

    @Then("^user validates cluster displayed in map area$")
    public void user_validates_cluster_displayed_in_map_area() throws Throwable {
        waitFor(10000);
        if (platformName.equalsIgnoreCase("iOS")) {
            isElementDisplayed(StationCluster.get(2));
        } else {
            isElementDisplayed(StationCluster.get(1));
        }
    }

    @And("^select Nectar Points filter$")
    public void select_nectar_filter() {
        if (platformName.equalsIgnoreCase("iOS")) {
            ScrollTo(StationFinderConstants.NECTARTXT, AccountConstants.IOSSCROLLUP, NectarPointsService);
            clickButtonWithOutScroll(NectarPointsService);
        } else {
            webDriverWait().until(ExpectedConditions.visibilityOf(nectarPointsFilter));
            nectarPointsFilter.click();
        }
    }

    @Then("^search button is enabled in the system keyboard$")
    public void search_button_enabled() {

        driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "search"));

    }


    @When("^user clicks on Save Station button for the first time$")
    public void userClicksOnSaveStationButtonForTheFirstTime() {
        if (platformName.equalsIgnoreCase("Android")) {

            waitForElement(StationDetailsFavBtn, 20);
            clickButtonWithOutScroll(StationDetailsFavBtn);

//            if (isElementDisplayedWithoutAssert(StationDetailsFavBtn1)) {
//                waitForElement(StationDetailsFavBtn1, 8);
//                clickButtonWithOutScroll(StationDetailsFavBtn1);
//                waitForElement(StationDetailsFavBtn, 8);
//                clickButtonWithOutScroll(StationDetailsFavBtn);
//            } else {
//                waitFor(8000);
//                if (isElementDisplayedWithoutAssert(StationDetailsFavBtn)) {
//                    clickButtonWithOutScroll(StationDetailsFavBtn);
//                }
//            }

        } else {
            waitFor(8000);
            if (isElementDisplayedWithoutAssert(StationDetailsFavBtn)) {
                clickButtonWithOutScroll(StationDetailsFavBtn);
            } else {
                logger.info("No Station Saved");
            }
        }
    }

    @Then("^user verifies the apply and clear all button$")
    public void userVerifiesTheApplyAndClearAllButton() {
        Assert.assertTrue(!(FilterScreenClearAll.isEnabled()));
        Assert.assertFalse(FilterScreenClearAll.isEnabled());
        Assert.assertTrue(!(ApplyFilter.isEnabled()));
        Assert.assertFalse(ApplyFilter.isEnabled());
    }

    @And("^user unselects the selected filters$")
    public void userUnselectsTheSelectedFilters() {
        waitForElement(AtmService, 15);
        clickButtonWithOutScroll(FoodServiceService);
        clickButtonWithOutScroll(AtmService);
    }

    @Then("^user verify the Clear all is disabled and apply is enabled$")
    public void userVerifyTheClearAllIsDisabledAndApplyIsEnabled() {
        Assert.assertTrue(!(FilterScreenClearAll.isEnabled()));
        Assert.assertFalse(FilterScreenClearAll.isEnabled());
        Assert.assertTrue(ApplyFilter.isEnabled());
    }

    @And("^user verifies that the filter is not applied$")
    public void userVerifiesThatTheFilterIsNotApplied() {
        Assert.assertTrue((AppliedFilter.isEmpty()));
    }

    @When("^user tap on list view$")
    public void user_tap_on_list_view() throws Exception {
        waitForElement(listStations, 15);
        clickButtonWithOutScroll(listStations);
        waitFor(4000);
    }

    @Then("User should see Clear All button disabled")
    public void userShouldSeeClearAllButtonDisabled() {
        waitForElement(FilterScreenClearAll);
        Assert.assertFalse(FilterScreenClearAll.isEnabled());
    }

    @Then("List Stations button style should be updated as a block button")
    public void listStationsButtonStyleShouldBeUpdatedAsABlockButton() {
        waitForElement(listStations, 15);
        Assert.assertTrue(isElementDisplayed(listStations));
    }

    @And("User should see Apply button disabled")
    public void userShouldSeeApplyButtonDisabled() {
        waitForElement(filter_Apply_Btn);
        Assert.assertFalse(filter_Apply_Btn.isEnabled());
    }

    @And("user tap on mobile payment enabled filter")
    public void userTapOnMobilePaymentEnabledFilter() {
        waitForElement(MobilePaymentEnabled);
        clickButtonWithOutScroll(MobilePaymentEnabled);
    }

    @Then("User applies the filter")
    public void userAppliesTheFilter() {
        waitForElement(filter_Apply_Btn);
        clickButtonWithOutScroll(filter_Apply_Btn);
    }

    @Then("User clears all the filter")
    public void userClearsAllTheFilter() {
        waitForElement(FilterScreenClearAll);
        clickButtonWithOutScroll(FilterScreenClearAll);
    }

    @Then("Check filter count")
    public void checkFilterCount() {
        waitForElement(filter_count_1);
        Assert.assertEquals(filter_count_1.getText(), StationFinderConstants.FILTER_COUNT_1);
    }

    @Then("User should see Clear All button enabled")
    public void userShouldSeeClearAllButtonEnabled() {
        waitForElement(FilterScreenClearAll);
        Assert.assertTrue(FilterScreenClearAll.isEnabled());
    }

    @And("User should see Apply button enabled")
    public void userShouldSeeApplyButtonEnabled() {
        waitForElement(filter_Apply_Btn);
        Assert.assertTrue(filter_Apply_Btn.isEnabled());
    }

    @Then("The Application should not display the selected filter count on the apply button")
    public void theApplicationShouldNotDisplayTheSelectedFilterCountOnTheApplyButton() {
        waitForElement(filter_Apply_Btn);
        String ActualText = filter_Apply_Btn.getText();
        Assert.assertTrue(ActualText.equalsIgnoreCase(StationFinderConstants.APPLYTXT));
    }

    @Then("check the copytext of searched field")
    public void checkTheCopytextOfSearchedField() {
        if (platformName.equalsIgnoreCase("iOS")) {
            Assert.assertTrue(NoStationMsg.getText().contains(StationFinderConstants.NOSTATIONSMSGTXT1));
        } else {
            String values[] = NoStationMsg.getText().split("\n");
            Assert.assertEquals(values[0], StationFinderConstants.NOSTATIONSMSGTXT1);
            Assert.assertEquals(values[1], StationFinderConstants.NOSTATIONSMSGTXT2);
            Assert.assertEquals(values[3], StationFinderConstants.NOSTATIONSMSGTXT3);
        }
    }
}
