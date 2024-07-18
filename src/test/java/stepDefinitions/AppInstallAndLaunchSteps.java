package stepDefinitions;

import contants.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;
import io.cucumber.datatable.DataTable;

public class AppInstallAndLaunchSteps extends AppInstallAndLaunchPage {

    @Given("^user validates tutorial screen$")
    public void user_validates_tutorial_screen() throws Throwable {
        waitFor(6000);
        if (isElementDisplayedWithoutAssert(CameraAccessOkPopup)) {
            clickButtonWithOutScroll(CameraAccessOkPopup);
        }
        if (isElementDisplayedWithoutAssert(FaceIdAccessOkPopup)) {
            clickButtonWithOutScroll(FaceIdAccessOkPopup);
        }
        if (isElementDisplayedWithoutAssert(acceptAllButtonAppLaunch)) {
            waitForElement(acceptAllButtonAppLaunch, 20);
            clickButtonWithOutScroll(acceptAllButtonAppLaunch);
        }
        waitForElement(WelcomTtl, 10);
        if (platformName.equalsIgnoreCase("android")) {
            isElementDisplayed(WelcomImg);
            staticTextValidation(WelcomTtl, AppInstallAndLaunchConstants.Tutorial_Screen_One_Page_Title);
            staticTextValidation(Subtitle, AppInstallAndLaunchConstants.Tutorial_Screen_One_Sub_Title_Android);
        } else if (platformName.equalsIgnoreCase("iOS")) {
//			isElementDisplayed(WelcomImg);
            Assert.assertTrue(WelcomTtl.isDisplayed());
            Assert.assertTrue(Subtitle.isDisplayed());
        }
    }

    @When("^Validate swipe app tutorial screen$")
    public void validate_swipe_app_tutorial_screen() throws Throwable {
        swipeHorizontal(2000, WelcomTtl);
        swipeHorizontal(2000, WelcomTtl_two);
        swipeHorizontal(2000, WelcomTtl_three);
    }

    @Then("^Validate on next button$")
    public void validate_on_next_button() throws Throwable {
        Assert.assertTrue(isTextContain(NextBtn.getText(), AppInstallAndLaunchConstants.NEXT));
    }

    @When("^Validate tap on next button second screen$")
    public void validate_tap_on_next_button_second_screen() throws Throwable {
        Assert.assertTrue(isTextContain(NextBtn.getText(), AppInstallAndLaunchConstants.NEXT));
        clickButtonWithOutScroll(NextBtn);
    }

    @When("^Validate tap on next button third screen$")
    public void validate_tap_on_next_button_third_screen() throws Throwable {
        Assert.assertTrue(isTextContain(NextBtn.getText(), AppInstallAndLaunchConstants.NEXT));
        clickButtonWithOutScroll(NextBtn);
    }

    @Then("^Validate tap on next button first screen$")
    public void validate_tap_on_next_button_first_screen() throws Throwable {
        Assert.assertTrue(isTextContain(NextBtn.getText(), AppInstallAndLaunchConstants.NEXT));
        clickButtonWithOutScroll(NextBtn);
    }

    @When("^Validate the second Skip screen$")
    public void validate_the_second_skip_screen() throws Throwable {
        Assert.assertTrue(isTextContain(skip_BTN.getText(), AppInstallAndLaunchConstants.SKIP));
    }

    @Then("^Validate the First Skip screen$")
    public void validate_the_first_skip_screen() throws Throwable {
        Assert.assertTrue(isTextContain(skip_BTN.getText(), AppInstallAndLaunchConstants.SKIP));
    }

    @And("^Validate the third Skip screen$")
    public void validate_the_third_skip_screen() throws Throwable {
        Assert.assertTrue(isTextContain(skip_BTN.getText(), AppInstallAndLaunchConstants.SKIP));
    }

    @When("^Validate skip click on skip button$")
    public void validate_skip_click_on_skip_button() throws Throwable {
        if (isElementDisplayedWithoutAssert(skip_BTN)) {
            clickButtonWithOutScroll(skip_BTN);
        }
    }

    @Then("^Validate second screen$")
    public void validate_second_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            waitForElement(WelcomTtl, 20);
            isElementDisplayed(NextBtn);
            isElementDisplayed(skip_BTN);
            isElementDisplayed(WelcomImg2);
            staticTextValidation(WelcomTtl, AppInstallAndLaunchConstants.Tutorial_Screen_Second_Page_Title);
            staticTextValidation(SubtitleSecondScreen, AppInstallAndLaunchConstants.Tutorial_Screen_Second_Sub_Title);
        } else {
            waitForElement(WelcomTtl, 20);
            isElementDisplayed(NextBtn);
            isElementDisplayed(skip_BTN);
            staticTextValidation(WelcomTtl, AppInstallAndLaunchConstants.Tutorial_Screen_Second_Page_Title);
            Assert.assertTrue(SubtitleSecondScreen.isDisplayed());
        }
    }

    @Then("^third screen$")
    public void third_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            swipeHorizontal(2000, WelcomTtl);
            Assert.assertTrue(isElementDisplayed(WelcomTtl));
            Assert.assertTrue(isElementDisplayed(NextBtn));
            Assert.assertTrue(isElementDisplayed(skip_BTN));
        } else {
            swipeHorizontal(2000, WelcomTtl_two);
            Assert.assertTrue(isElementDisplayed(WelcomTtl_three));
            Assert.assertTrue(isElementDisplayed(NextBtn));
            Assert.assertTrue(isElementDisplayed(skip_BTN));
        }

    }

    @Then("^validate third screen$")
    public void validate_third_screen() throws Throwable {

        if (platformName.equalsIgnoreCase("android")) {
            Assert.assertTrue(isElementDisplayed(NextBtn));
            Assert.assertTrue(isElementDisplayed(skip_BTN));
            Assert.assertTrue(isElementDisplayed(WelcomTtl));
            Assert.assertTrue(isElementDisplayed(WelcomImg3));
            Assert.assertTrue(isTextMatch(WelcomTtl.getText().trim(),
                    AppInstallAndLaunchConstants.Tutorial_Screen_Third_Page_Title));
            Assert.assertTrue(isTextMatch(Subtitle.getText().trim(),
                    AppInstallAndLaunchConstants.Tutorial_Screen_Third_Sub_Title));
        } else {
            Assert.assertTrue(isElementDisplayed(WelcomTtl_3));
            Assert.assertTrue(isTextMatch(WelcomTtl_four.getText().trim(),
                    AppInstallAndLaunchConstants.Tutorial_Screen_Third_Page_Title_iOS));
            Assert.assertTrue(isTextMatch(WelcomSUBTtl_fournew.getText().trim(),
                    AppInstallAndLaunchConstants.Tutorial_Screen_Third_Sub_Title_iOS));
            Assert.assertTrue(isElementDisplayed(GetStarted_BTN));
            Assert.assertTrue(isElementDisplayed(WelcomImg3));
        }
    }

    @And("^fourth screen$")
    public void fourth_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            swipeHorizontal(2000, WelcomTtl);
            Assert.assertTrue(isElementDisplayed(WelcomTtl));
            Assert.assertTrue(isElementDisplayed(GetStarted_BTN));

        } else {
            swipeHorizontal(2000, WelcomTtl_three);
            Assert.assertTrue(isElementDisplayed(WelcomTtl_four));
            Assert.assertTrue(isElementDisplayed(GetStarted_BTN));

        }
    }

    @And("^validate fourth screen$")
    public void validate_fourth_screen() throws Throwable {
        Assert.assertTrue(isElementDisplayed(GetStarted_BTN));
        if (platformName.equalsIgnoreCase("android")) {
            Assert.assertTrue(isElementDisplayed(WelcomTtl));
            Assert.assertTrue(isElementDisplayed(WelcomImg4));
            Assert.assertTrue(isTextMatch(WelcomTtl.getText().trim(),
                    AppInstallAndLaunchConstants.Tutorial_Screen_Fourth_Page_Title));
            Assert.assertTrue(isTextMatch(Subtitle.getText().trim(),
                    AppInstallAndLaunchConstants.Tutorial_Screen_FourthSub_Title));
        } else {
            Assert.assertTrue(isElementDisplayed(WelcomTtl_four));
            Assert.assertTrue(WelcomImg4.isEnabled());
            Assert.assertTrue(isTextMatch(WelcomTtl_four.getText().trim(),
                    AppInstallAndLaunchConstants.Tutorial_Screen_Fourth_Page_Title_ios));
            Assert.assertTrue(isTextMatch(WelcomSUBTtl_four.getText().trim(),
                    AppInstallAndLaunchConstants.Tutorial_Screen_FourthSub_Title_iOS));
        }
    }

    @Then("^Validate tabs for the Global Tab Bar logged in dashboard$")
    public void validate_tabs_for_the_global_tab_bar_logged_in_dashboard() throws Throwable {
        isElementDisplayed(FuelTab);
        isElementDisplayed(StationTab);
        isElementDisplayed(OffersTab);
        isElementDisplayed(HistoryTab);
        isElementDisplayed(MoreTab);
    }

    @Then("^Validate the device back button is inactive$")
    public void validate_the_device_back_button_is_inactive() throws Throwable {
        driver.navigate().back();
    }

    @Then("^user tap on next button$")
    public void user_tap_on_next_button() throws Throwable {
        clickButtonWithOutScroll(NextBtn);
    }

    @Then("^Validate the Get Started button in fourth screen$")
    public void validate_the_get_started_button_in_fourth_screen() throws Throwable {
        Assert.assertTrue(isTextMatch(GetStarted_BTN.getText().trim(), AppInstallAndLaunchConstants.GETSTD));
    }

    @When("^click on Get Started button$")
    public void clickOnGetStartedButton() {
        clickButtonWithOutScroll(GetStarted_BTN);
        waitFor(2000);
        if (platformName.equalsIgnoreCase("android")) {
            clickButtonWithOutScroll(AccountOkBtn);
        } else {
            clickButtonWithOutScroll(ContinueBtn);
            waitFor(3000);
            clickButtonWithOutScroll(AllowPopup);
            waitFor(2000);
            clickButtonWithOutScroll(AllowPopup);
            waitFor(2000);
            if (isElementDisplayed(AccountOkBtn)) {
                clickButtonWithOutScroll(AccountOkBtn);
            }
        }

    }

    @Given("^user validates the tutorial screen$")
    public void userValidatesTheTutorialScreen() {
        //	waitFor(6000);
        if (platformName.equalsIgnoreCase("android")) {
            waitForElement(WelcomImg, 6000);
            Assert.assertTrue(isElementDisplayed(WelcomImg));
            Assert.assertTrue(isTextMatch(WelcomTtl.getText().trim(),
                    AppInstallAndLaunchConstants.Tutorial_Screen_One_Page_Title));
            Assert.assertTrue(
                    isTextMatch(Subtitle.getText().trim(), AppInstallAndLaunchConstants.Tutorial_Screen_One_Sub_Title));
            // Assert.assertTrue(isTextContain(WelcomTtl.getText(),
            // AccountConstants.WELCOMTXT));
        } else {
            Assert.assertTrue(WelcomImg.isEnabled());
            // Assert.assertTrue(isElementEnabled(WelcomTtl));
            // Assert.assertTrue(isElementEnabled(WelcomSUBTtl_one));
        }
    }

    @Then("^User validate allow notifications screen$")
    public void userValidateAllowNotificationsScreen() {
        Assert.assertTrue(isElementDisplayed(Allow_Notifications_header));
        Assert.assertTrue(isElementDisplayed(notification_image));
        Assert.assertTrue(isElementDisplayed(notification_middle_message));
        Assert.assertTrue(isElementDisplayed(notification_bottom_message));
        Assert.assertTrue(isElementDisplayed(ContinueBtn));
        Assert.assertTrue(
                isTextMatch(Allow_Notifications_header.getText().trim(), AppInstallAndLaunchConstants.Welcome_Screen_fourth_top_header));
        Assert.assertTrue(
                isTextMatch(notification_middle_message.getText().trim(), AppInstallAndLaunchConstants.Welcome_Screen_fourth_middle_message));
        Assert.assertTrue(
                isTextMatch(notification_bottom_message.getText().trim(), AppInstallAndLaunchConstants.Welcome_Screen_fourth_small_message));
    }

    @Then("^User is navigated to Add Nectar Card screen$")
    public void userIsNavigatedToAddNectarCardScreen() {
        staticTextValidation(add_Nectar_card, OffersContants.ADDNECTAR);
    }

    @And("^user validates offers screen$")
    public void userValidatesOffersScreen() {
        waitForElement(add_nectar_card_to, 4);
        isElementDisplayed(add_nectar_card_to);
        isTextMatch(add_nectar_card_to.getText(), AppInstallAndLaunchConstants.Offers_Add_Nectar_to_text);
        isElementDisplayed(get_offers);
        isTextMatch(get_offers.getText(), AppInstallAndLaunchConstants.Offers_Add_Nectar_get_exclusive);
        isElementDisplayed(collection_points_header);
        isTextMatch(get_offers.getText(), AppInstallAndLaunchConstants.Offers_Add_Nectar_get_exclusive);
        isElementDisplayed(collection_points_message);
        isTextMatch(collection_points_header.getText(), AppInstallAndLaunchConstants.Offers_Add_Nectar_collection_points_header);
        isElementDisplayed(more_about_collecting_point_link);
        isTextMatch(more_about_collecting_point_link.getText(), AppInstallAndLaunchConstants.Offers_Add_Nectar_More_about_collecting_points_link);
        isElementDisplayed(rewards_header);
        isTextMatch(rewards_header.getText(), AppInstallAndLaunchConstants.Offers_Add_Nectar_Rewards_header);
        isElementDisplayed(rewards_text);
        isTextMatch(rewards_text.getText(), AppInstallAndLaunchConstants.Offers_Add_Nectar_Rewards_text);
        isElementDisplayed(add_nectar_card);
        isTextMatch(add_nectar_card.getText(), AppInstallAndLaunchConstants.Offers_Add_Nectar_card_text);
        if (platformName.equalsIgnoreCase("Android")) {
            isElementDisplayed(Add_Nectar_card_image);
            ScrollTo(OffersContants.COLECTMOREHEAD, AccountConstants.IOSSCROLLUP, collect_more_nectar_points);
            staticTextValidation(collect_more_nectar_points, OffersContants.COLECTMOREHEAD);
        } else {
            Assert.assertTrue(isElementDisplayed(collect_more_nectar_points));
        }
    }

    @When("^user taps on \"([^\"]*)\" link$")
    public void userTapsOnLink(String linkName) throws Throwable {
        isElementDisplayed(more_about_collecting_point_link);
        clickButtonWithOutScroll(more_about_collecting_point_link);
    }

    @Then("^user should see How to collect points popup$")
    public void userShouldSeeHowToCollectPointsPopup() {
        waitForElement(how_to_collect_points_popup, 3);
        isElementDisplayed(how_to_collect_points_popup);
        clickButtonWithOutScroll(geRewards_How_to_collect_points_popup_Close);
    }

//	@And("^user enters the nectar card number$")
//	public void userEntersTheNectarCardNumber() {
//		enterTextWithoutScroll(AccountPage.NectarCardnumberEnter, AccountConstants.NECTARCARDNUMBERNOTVERIFIED);
//		clickButtonWithOutScroll(AccountPage.DoneButtonInNectarKeypad);
//		clickButtonWithOutScroll(AccountPage.NextButtonNectarCardAddScreen);
//		clickButtonWithOutScroll(AccountPage.AccountNectarCardContinuePopup);
//	}

    @And("^Click on skipp button in Welcome screen$")
    public void clickOnSkippButtonInWelcomeScreen() {
        waitForElement(TutorialSkipButton, 3);
        clickButtonWithOutScroll(TutorialSkipButton);
        clickButtonWithOutScroll(ContinueBtn);
        clickButtonWithOutScroll(AllowPopup);
    }

    @Then("^Verify the CT text popup text displayed in NLID screen$")
    public void verifyTheCTTextPopupTextDisplayedInNLIDScreen() {
        waitFor(2000);
        Assert.assertTrue(isElementDisplayed(CtTextLIDScreen));
        clickButtonWithOutScroll(OkButtonCTText);
    }

    @Then("^verify that User is able to see Welcome screen$")
    public void verifyThatUserIsAbleToSeeWelcomeScreen() {
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(WelcomTtl, 14);
            staticTextValidation(WelcomTtl, AppInstallAndLaunchConstants.Tutorial_Screen_One_Page_Title);
        } else {

            staticTextValidation(WelcomTtl, AppInstallAndLaunchConstants.Tutorial_Screen_One_Page_Title_ios);
        }
    }

    @And("^Swipe left and right from welcome screen$")
    public void swipeLeftAndRightFromWelcomeScreen() {
        waitFor(2000);
        clickButtonWithOutScroll(NextButtonScreen);

    }

    @And("^User enter \"([^\"]*)\" Login credentials$")
    public void userEnterLoginCredentials(String arg0) throws Throwable {
        waitFor(5000);
        enterTextWithoutScroll(userName, AppInstallAndLaunchConstants.UN1);
        waitFor(3000);
        enterTextWithoutScroll(password, AppInstallAndLaunchConstants.PWD1);
    }

    @And("^Verify the Nectar Card points in LID screen$")
    public void verifyTheNectarCardPointsInLIDScreen() {
        waitFor(5000);
        if (isElementDisplayedWithoutAssert(CloseNectarPopup))
            clickButtonWithOutScroll(CloseNectarPopup);
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(NectarPointBalanceLeftText, AppInstallAndLaunchConstants.NECTARBALANCETXT1);
            staticTextValidation(NectarPointBalanceRightText, AppInstallAndLaunchConstants.NECTARBALANCETXT2);
            Assert.assertTrue(isElementDisplayed(NectarPointBalanceValue));
        } else {
            Assert.assertTrue(isElementDisplayed(NectarPointBalance));
        }
    }

    @And("^Verify that User should be able to see the tick mark for loaded card$")
    public void verifyThatUserShouldBeAbleToSeeTheTickMarkForLoadedCard() {
        waitFor(5000);
        Assert.assertTrue(isElementEnabled(OfferAppliedTickMark));
        Assert.assertTrue(isElementEnabled(OffersBannerPanen));

    }

    @Then("^user validates first tutorial screen$")
    public void userValidatesFirstTutorialScreen() {
        waitFor(10);
        waitForElement(CarImageWelScreen, 20);
        Assert.assertTrue(CarImageWelScreen.isDisplayed());
        Assert.assertTrue(EssoLogo.isDisplayed());
    }

//	@And("^User click on get Started Button$")
//	public void userClickOnGetStartedButton() {
//		if(platformName.equalsIgnoreCase("Android")) {
//			waitForElement(GetStarted_BTN, 20);
//			clickButtonWithOutScroll(GetStarted_BTN);
//			waitForElement(AccountOkBtn, 20);
//			clickButtonWithOutScroll(AccountOkBtn);
//		}
//		else{
//			waitForElement(GetStarted_BTN, 20);
//			clickButtonWithOutScroll(GetStarted_BTN);
//			waitFor(2000);
//			if(isElementDisplayedWithoutAssert(ContinueButtonInFuelAsGuest)) {
//				clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
//			}
//			waitFor(2000);
//			if(isElementDisplayedWithoutAssert(AllowInPopupScreen)) {
//				clickButtonWithOutScroll(AllowInPopupScreen);
//			}
//			waitFor(2000);
//			if(isElementDisplayedWithoutAssert(AllowInPopupScreen)) {
//				clickButtonWithOutScroll(AllowInPopupScreen);
//			}
//			waitFor(3000);
//			if(isElementDisplayedWithoutAssert(AllowInPopupScreen)) {
//				clickButtonWithOutScroll(AccountPage.okBtn);
//			}
//
//		}
//	}

    @Then("^click on allow button$")
    public void clickOnAllowButton() {
        waitForElement(AllowInPopupScreen, 20);
        clickButtonWithOutScroll(AllowInPopupScreen);
    }

    @Then("^Verify elements present in second screen$")
    public void verifyElementsPresentInSecondScreen() {
        waitFor(4000);
        waitForElement(Screen2Tittle, 20);
        staticTextValidation(Screen2Tittle, AppInstallAndLaunchConstants.ScreenTitleText);
        staticTextValidation(Screen2SubTittle, AppInstallAndLaunchConstants.ScreenSubTitleText);
    }

    @Then("^Verify the Cookie page elements$")
    public void verifyTheCookiePageElements() {

        waitFor(2000);
        if (platformName.equalsIgnoreCase("android")) {
            waitForElement(acceptAllButtonAppLaunch, 20);
            staticTextValidation(CookieSubText1AppLaunch, AppInstallAndLaunchConstants.CookieSubTextAnd1);
            Assert.assertTrue(acceptAllButtonAppLaunch.isEnabled());
            Assert.assertTrue(manageOptionButtonAppLaunch.isEnabled());
        } else {
            waitForElement(acceptAllButtonAppLaunch, 20);
            staticTextValidation(CookieSubText1AppLaunch, AppInstallAndLaunchConstants.CookieSubText1);
            staticTextValidation(CookieSubText2AppLaunch, AppInstallAndLaunchConstants.CookieSubText2);
            Assert.assertTrue(acceptAllButtonAppLaunch.isEnabled());
            Assert.assertTrue(getButtonElement("Manage Options").isEnabled());

        }

    }

    @And("^Click Accept all button in the cookie page$")
    public void clickAcceptAllButtonInTheCookiePage() {
        waitForElement(acceptAllButtonAppLaunch, 20);
        clickButtonWithOutScroll(acceptAllButtonAppLaunch);
    }


//	@Given("^install open the Esso app$")
//	public void install_open_the_Esso_app() {
//		waitFor(5000);
//		appUninstallInstall();
//		appInstall();
//		waitForElement(acceptAllButtonAppLaunch,20);
//		clickButtonWithOutScroll(acceptAllButtonAppLaunch);
//		waitForElement(NextButtonScreen,10);
//		clickButtonWithOutScroll(NextButtonScreen);
//		waitForElement(NextBtn,5);
//		clickButtonWithOutScroll(NextBtn);
//		waitForElement(GetStarted_BTN,20);
//		clickButtonWithOutScroll(GetStarted_BTN);
//		waitForElement(ContinueButtonInFuelAsGuest,20);
//		clickButtonWithOutScroll(ContinueButtonInFuelAsGuest);
//		waitForElement(AllowInPopupScreen,20);
//		clickButtonWithOutScroll(AllowInPopupScreen);
//		waitFor(3000);
//		clickButtonWithOutScroll(AccountPage.okBtn);
//
//	}

    @And("^user taps on SKIP button in the tutorial screen$")
    public void userTapsOnSKIPButtonInTheTutorialScreen() {
        clickButtonWithOutScroll(TutorialSkipButton);
    }

	@Then("^user navigates across the tutorial screens$")
	public void userNavigatesAcrossTheTutorialScreens() {
		if (platformName.equalsIgnoreCase("iOS")) {
			waitForElement(ContinueBtn,10);
			Assert.assertTrue(ContinueBtn.isEnabled());
		} else {
			waitForElement(ContinueBtn,10);
			Assert.assertTrue(ContinueBtn.isEnabled());
		}
	}

    @When("^user taps on Get Started button in the tutorial screen$")
    public void userTapsOnGetStartedButtonInTheTutorialScreen() {
        clickButtonWithOutScroll(exxon_Help_Tutorial_GetStartedBtn);
    }

    @When("^click on Get Started button on Add Nectar Card screen$")
    public void clickOnGetStartedButtonOnAddNectarCardScreen() {
        waitForElement(AddNectarGetStartedBtn, 30);
        clickButtonWithOutScroll(AddNectarGetStartedBtn);
    }

    @Then("^Validate the welcome pop-up message$")
    public void verifywelcomepopupmessage() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitForElement(welcomePopup, 10);
            staticTextValidation(welcomePopup, AppInstallAndLaunchConstants.CTNLIDText);
        } else {
            webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(welcomePopup));
            staticTextValidation(welcomePopup, AppInstallAndLaunchConstants.CTNLIDText);
        }
    }

    @And("^user clicks on GET STARTED button$")
    public void clickGETSTARTED() {
        clickButtonWithOutScroll(GETSTARTEDBut);
    }

    @And("^user validates whether the Reject all button is present in the privacy screen$")
    public void userValidatesWhetherTheRejectAllButtonIsPresentInThePrivacyScreen() {
        waitForElement(rejectAllButtonAppLaunch, 30);
        staticTextValidation(rejectAllButtonAppLaunch, AppInstallAndLaunchConstants.REJECTALLBUTTONPRIVACYSCREEEN);
    }

    @When("^the user taps on the Reject all button in the privacy screen$")
    public void theUserTapsOnTheRejectAllButtonInThePrivacyScreen() {
        waitForElement(rejectAllButtonAppLaunch, 40);
        clickButtonWithOutScroll(rejectAllButtonAppLaunch);
    }

    @Then("application should display cookie setting")
    public void applicationShouldDisplayCookieSetting() {
        waitForElement(CookieSettingsText);
        Assert.assertTrue(isElementDisplayed(CookieSettingsText));
        waitForElement(CookieSubText1AppLaunch);
        Assert.assertTrue(isElementDisplayed(CookieSubText1AppLaunch));
    }

    @Then("application should display Accept All button")
    public void applicationShouldDisplayAcceptAllButton() {
        waitForElement(acceptAllButtonAppLaunch);
        Assert.assertTrue(isElementDisplayed(acceptAllButtonAppLaunch));
    }

    @Then("application should display Reject All button")
    public void applicationShouldDisplayRejectAllButton() {
        waitForElement(rejectAllButtonAppLaunch);
        Assert.assertTrue(isElementDisplayed(rejectAllButtonAppLaunch));
    }

    @Then("application should display Manage Options button")
    public void applicationShouldDisplayManageOptionsButton() {
        waitForElement(manageOptionButtonAppLaunch);
        Assert.assertTrue(isElementDisplayed(manageOptionButtonAppLaunch));
    }

    @When("user taps on Accept All button")
    public void userTapsOnAcceptAllButton() {
        clickButtonWithOutScroll(acceptAllButtonAppLaunch);
    }

    @Then("user allows notification")
    public void userAllowsNotification() {
        waitForElement(AllowNotificationContinue);
        clickButtonWithOutScroll(AllowNotificationContinue);
        waitForElement(AllowNotificationAllow);
        clickButtonWithOutScroll(AllowNotificationAllow);
    }

    @Then("app should display Location Services")
    public void appShouldDisplayLocationServices() {
        waitForElement(LocationTitleAccount);
        Assert.assertTrue(isElementDisplayed(LocationTitleAccount));
    }

    @Then("app should display Notifications")
    public void appShouldDisplayNotifications() {
        waitForElement(NotificationsTitleAccount);
        Assert.assertTrue(isElementDisplayed(NotificationsTitleAccount));
    }

    @Then("app should display Camera Access")
    public void appShouldDisplayCameraAccess() {
        waitForElement(CameraTitleAccount);
        Assert.assertTrue(isElementDisplayed(CameraTitleAccount));
    }

    @Then("app should display Analytics and Performance")
    public void appShouldDisplayAnalyticsAndPerformance() {
        waitForElement(SettingsScreenAnalyticsTitle);
        Assert.assertTrue(isElementDisplayed(SettingsScreenAnalyticsTitle));
    }

    @Then("app should display Functional")
    public void appShouldDisplayFunctional() {
        waitForElement(Functional);
        Assert.assertTrue(isElementDisplayed(Functional));
    }

    @Then("click on OK button on NLID")
    public void clickOnOKButtonOnNLID() {
        waitForElement(AccountOkBtn);
        clickButtonWithOutScroll(AccountOkBtn);
    }

    @Then("user toggles Analytics & Performance to allow")
    public void userTogglesAnalyticsPerformanceToAllow() {
        waitForElement(AnalyticsData);
        if (!AnalyticsData.isEnabled()) {
            clickButtonWithOutScroll(AnalyticsData);
        }
        Assert.assertTrue(AnalyticsData.isEnabled());
    }

    @Then("user toggles Functional to allow")
    public void userTogglesFunctionalToAllow() {
        waitForElement(FunctionalData);
        if (!FunctionalData.isEnabled()) {
            clickButtonWithOutScroll(FunctionalData);
        }
        Assert.assertTrue(FunctionalData.isEnabled());
    }

    @Then("user toggles Analytics & Performance to decline")
    public void userTogglesAnalyticsPerformanceToDecline() {
        waitForElement(AnalyticsData);
        if (!AnalyticsData.isEnabled()) {
            clickButtonWithOutScroll(AnalyticsData);
        }
        clickButtonWithOutScroll(AnalyticsData);
        Assert.assertFalse(AnalyticsData.isSelected());
    }

    @Then("user toggles Functional to decline")
    public void userTogglesFunctionalToDecline() {
        waitForElement(FunctionalData);
        if (!FunctionalData.isEnabled()) {
            clickButtonWithOutScroll(FunctionalData);
        }
        clickButtonWithOutScroll(FunctionalData);
        Assert.assertFalse(FunctionalData.isSelected());
    }

    @Then("user should redirect to Data Privacy landing page screen")
    public void userShouldRedirectToDataPrivacyLandingPageScreen() {
        waitForElement(manageOptionButtonAppLaunch);
        Assert.assertTrue(isElementDisplayed(manageOptionButtonAppLaunch));
    }

    @When("user taps on manage options")
    public void userTapsOnManageOptions() {
        waitForElement(manageOptionButtonAppLaunch);
        clickButtonWithOutScroll(manageOptionButtonAppLaunch);
    }

    @Then("user should redirect to Manage your cookie settings screen")
    public void userShouldRedirectToManageYourCookieSettingsScreen() {
        Assert.assertTrue(isElementDisplayed(CookieSubText1AppLaunch));
    }

    @Then("user should view title as Analytics & Performance for the analytics section")
    public void userShouldViewTitleAsAnalyticsPerformanceForTheAnalyticsSection() {
        String Actual = AnalyticsAndPerformance.getText();
        Assert.assertEquals(Actual, AppInstallAndLaunchConstants.ANALYTICSANDPERFORMANCETITLE);
    }

    @Then("user should see Analytics & Performance checkbox for the analytics section")
    public void userShouldSeeAnalyticsPerformanceCheckboxForTheAnalyticsSection() {
        Assert.assertTrue(isElementDisplayed(AnalyticsAndPerformanceCheckbox));
    }

    @Then("user should see the copy text as the content in the Analytics & Performance section")
    public void userShouldSeeTheCopyTextAsTheContentInTheAnalyticsPerformanceSection() {
        String actual = AnalyticsAndPerformanceSectionCT.getText();
        Assert.assertEquals(actual, AppInstallAndLaunchConstants.ANALYTICSANDPERFORMANCESECTIONCT);
    }

    @Then("user should be able to select Analytics & Performance checkbox")
    public void userShouldBeAbleToSelectAnalyticsPerformanceCheckbox() {
        clickButtonWithOutScroll(AnalyticsAndPerformanceCheckbox);
        waitFor(3000);
        Assert.assertTrue(AnalyticsAndPerformanceCheckbox.isEnabled());
    }

    @Then("user should be able to unselect Analytics & Performance checkbox")
    public void userShouldBeAbleToUnselectAnalyticsPerformanceCheckbox() {
        clickButtonWithOutScroll(AnalyticsAndPerformanceunCheckbox);
        Assert.assertFalse(AnalyticsAndPerformanceCheckbox.isSelected());
    }

    @Then("user should view title as Functional for the Functional section")
    public void userShouldViewTitleAsFunctionalForTheFunctionalSection() {
        String Actual = Functional.getText();
        Assert.assertEquals(Actual, AppInstallAndLaunchConstants.FUNCTIONALTITLE);
    }

    @Then("user should see Functional checkbox for the Functional section")
    public void userShouldSeeFunctionalCheckboxForTheFunctionalSection() {
        Assert.assertTrue(isElementDisplayed(FunctionalCheckbox));
    }

    @Then("user should see the copy text as the content in the Functional section")
    public void userShouldSeeTheCopyTextAsTheContentInTheFunctionalSection() {
        String actual = FunctionalSectionCT.getText();
        Assert.assertEquals(actual, AppInstallAndLaunchConstants.FUNCTIONSECTIONCT);
    }

    @Then("user should be able to select Functional checkbox")
    public void userShouldBeAbleToSelectFunctionalCheckbox() {
        clickButtonWithOutScroll(FunctionalCheckbox);
        waitFor(3000);
        Assert.assertTrue(FunctionalCheckbox.isEnabled());
    }

    @Then("user should be able to unselect Functional checkbox")
    public void userShouldBeAbleToUnselectFunctionalCheckbox() {
        clickButtonWithOutScroll(FunctionalCheckbox);
        Assert.assertFalse(FunctionalCheckbox.isSelected());
    }

    @When("user taps on confirm on manage your cookie settings screen")
    public void userTapsOnConfirmOnManageYourCookieSettingsScreen() {
        clickButtonWithOutScroll(ConfirmOnCookieSettings);
    }

    @Then("user should redirected to tutorial screen")
    public void userShouldRedirectedToTutorialScreen() {
        waitForElement(WelcomTtl);
        Assert.assertTrue(isElementDisplayed(WelcomTtl));
    }

    @When("user taps back on manage your cookie settings screen")
    public void userTapsBackOnManageYourCookieSettingsScreen() {
        androidBack();
    }

    @Then("App should show the selected options retained")
    public void appShouldShowTheSelectedOptionsRetained() {
        Assert.assertTrue(AnalyticsAndPerformanceCheckbox.isEnabled());
        Assert.assertTrue(FunctionalCheckbox.isEnabled());
    }

    @And("user navigates to the NLID before the welcome popup")
    public void userNavigatesToTheNLIDBeforeTheWelcomePopup() {
        if (platformName.equalsIgnoreCase("iOS")) {
            clickButtonWithOutScroll(ContinueBtn);
            clickButtonWithOutScroll(AllowPopup);
            waitFor(4000);
            if (isElementDisplayedWithoutAssert(Allow)) {
                clickButtonWithOutScroll(Allow);
            }
        } else {
            waitForElement(AllowNotificationContinue, 10);
            clickButtonWithOutScroll(AllowNotificationContinue);
            waitForElement(AllowNotificationAllow, 10);
            clickButtonWithOutScroll(AllowNotificationAllow);
        }
    }
}
