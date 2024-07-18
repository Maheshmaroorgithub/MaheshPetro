package stepDefinitions;

import com.google.common.collect.ImmutableMap;
import contants.*;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;
import io.cucumber.datatable.DataTable;
import io.appium.java_client.AppiumDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OffersSteps extends OffersPage {
    @Given("^reset the app$")
    public void reset_the_app() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            ((AndroidDriver) driver).removeApp(prop.getProperty("package"));
            //TODO: Path to be updated
            ((AndroidDriver) driver).installApp(prop.getProperty("androidPath"));
            ((AndroidDriver) driver).activateApp(prop.getProperty("package"));
        } else {
            waitFor(5000);
            appUninstallInstall();
            appInstall();
        }
    }

    @And("^allow location access$")
    public void allow_location_access() throws Throwable {
        waitFor(7000);
        if (platformName.equalsIgnoreCase("Android")) {
            if (isAlertPresent()) {
                driver.switchTo().alert().accept();
            } else {
                System.out.println(" Alert is not present");
            }

        } else {
            clickButtonWithOutScroll(StationAllow);
            if (isElementDisplayedWithoutAssert(StationAllow)) {
                waitFor(7000);
                clickButtonWithOutScroll(StationAllow);
                waitFor(7000);
            }
        }
    }

    @And("^Click on reward Edit button in Payment confirmation screen$")
    public void clickOnRewardEditButtonInPaymentConfirmationScreen() {
        clickButtonWithOutScroll(RewardEdit);

    }

    @When("^user enters search term in station finder$")
    public void user_enters_search_term_in_station_finder() throws Throwable {
        waitFor(8000);
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(StationSearch, 15);
            enterTextWithoutScroll(StationSearch, "Birmingham ,UK");
			waitFor(15000);
//			getCoordinates(StationSearch);
            waitFor(5000);
            androidTap();
            //driver.navigate().back();


        } else {
            if (isElementDisplayedWithoutAssert(StationAllow)) {
                clickButtonWithOutScroll(StationAllow);
            }
            if (isElementDisplayedWithoutAssert(DontallowCancel)) {
                clickButtonWithOutScroll(DontallowCancel);
            }
            enterTextWithoutScroll(StationSearch, "Birmingham, UK");
            waitForElement(StationSelect, 8);
            actionClick(StationSelect);
        }
    }


    @Then("^user selects a station from the list$")
    public void user_selects_a_station_from_the_list() throws Throwable {
//		if (platformName.equalsIgnoreCase("Android")) {
//			waitFor(5000);
//			clickButtonWithOutScroll(Station1.get(0));
//
//		}
//		else{
        waitFor(8000);
        if (!address_Station_List.isEmpty()) {
            clickButtonWithOutScroll(address_Station_List.get(0));
            waitFor(5000);
        } else {
            logger.info("No list");
        }
    }

    @Then("^user should see the copy text displayed on the modal pop\"([^\"]*)\" up in station finder for logged in user with non verified nectar$")
    public void user_should_see_the_copy_text_displayed_on_the_modal_pop_up_in_station_finder_for_logged_in_user_with_non_verified_nectar(
            String arg1) throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(2000);
            isElementDisplayed(StationOfferImg);
            isElementDisplayed(StationOfferTtl);
            staticTextValidation(StationOfferDes, arg1);
            isElementDisplayed(StationOfferGotIt);
            isElementDisplayed(StationOfferClose);

        } else {
            waitFor(5000);
//			isElementDisplayed(StationOfferImg);
            isElementDisplayed(StationOfferTtl);
//			staticTextValidation(StationOfferDes2, arg1);
//			System.out.println(StationOfferDes.getText());
            staticTextValidation(ModalPopupCt, arg1);
//			isElementDisplayed(StationOfferGotIt);
            isElementDisplayed(StationOfferClose);

        }
    }

    @Then("^tap on close$")
    public void tap_on_close() throws Throwable {
        clickButtonWithOutScroll(StationOfferClose);
    }

    @Then("^tap on Got It$")
    public void tap_on_got_it() throws Throwable {
        clickButtonWithOutScroll(StationOfferGotIt);
    }

    @When("^user lands on LID screen after successful Login$")
    public void user_lands_on_lid_screen_after_successful_login() throws Throwable {
        waitFor(8000);
        if (isElementDisplayedWithoutAssert(StationOfferClose)) {
            clickButtonWithOutScroll(StationOfferClose);
        }
    }

    @Then("^user should see the copy text displayed on the modal pop up in station finder for logged in user with verified nectar$")
    public void user_should_see_the_copy_text_displayed_on_the_modal_pop_up_in_station_finder_for_logged_in_user_with_verified_nectar()
            throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(3000);
            isElementDisplayed(StationOfferImg);
            isElementDisplayed(StationOfferTtl);
//			staticTextValidation(StationOfferDes, OffersContants.STATIONOFFERDES1);
            isElementDisplayed(StationOfferGotIt);
            isElementDisplayed(StationOfferClose);
        } else {
            waitFor(2000);
            isElementDisplayed(StationOfferImg);
            isElementDisplayed(StationOfferTtl);
        }
    }

    @When("^navigate back to \"([^\"]*)\" page$")
    public void navigate_back_to_something_page(String strArg1) throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            androidBack();
        } else {
            iOSBack();
        }
    }

    @And("^user should not see the Model popup in station detais$")
    public void user_should_not_see_the_model_popup_in_station_detais() throws Throwable {
        if (isElementDisplayedWithoutAssert(StationOfferImg)) {
            Assert.fail("StationOfferImg present");
        }
    }

    @And("^validate offer details in offers screen$")
    public void validate_offer_details_in_offers_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            isElementDisplayed(NectarLogo);
//			isElementDisplayed(OfferLink);
//			isElementDisplayed(PointsSec);
            staticTextValidation(HIW, OffersContants.HIW);
            staticTextValidation(CollectPtsLnk, OffersContants.COLLECTPTSLNK);
            staticTextValidation(CollectMoreHead, OffersContants.COLECTMOREHEAD);
            staticTextValidation(FindMoreLnk, OffersContants.FINDMORELNK);
            isElementDisplayed(RewardsSec);
            isElementDisplayed(EssoTM);
        } else {
            Assert.assertTrue(EssoTM.isDisplayed());
        }
    }

    @When("^user tap on learn more link in LID screen$")
    public void user_tap_on_learn_more_link_in_lid_screen() throws Throwable {
        waitFor(5000);
        clickButtonWithRetry(LIDLearnMore);
    }

    @Then("^user is navigated to add nectar screen$")
    public void user_is_navigated_to_add_nectar_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementDisplayedWithoutAssert(YesAddNow)) {
                clickButtonWithOutScroll(YesAddNow);
            }
            staticTextValidation(AddNectarCardheaderLearnmore, OffersContants.ADDNECTARHEAD);
        } else {
            waitFor(2000);
            if (isElementDisplayedWithoutAssert(YesAddNow)) {
                clickButtonWithOutScroll(YesAddNow);
            }
            waitFor(4000);
            staticTextValidation(AddNectarCardheaderLearnmore, OffersContants.ADDNECTARHEAD);
        }
    }

    @And("^enter random nectar card value and tap on next button$")
    public void enter_random_nectar_card_value_and_tap_on_next_button() throws Throwable {
        enterTextWithoutScroll(NectarEnter, OffersContants.NECTARNUM);
        hideMobileKeyboard();
        clickButtonWithOutScroll(NectarNxt);
    }

//	@Then("^user is navigated to Verify nectar screen$")
//	public void user_is_navigated_to_verify_nectar_screen() throws Throwable {
//		if (platformName.equalsIgnoreCase("android")) {
//			staticTextValidation(AccountPage.FirstFuelheader, OffersContants.ADDNECTARHEADIOS);
//		}
//		else{
//			waitFor(6000);
//			staticTextValidation(AccountPage.FirstFuelheader, OffersContants.ADDNECTARHEADIOS);
//		}
//	}

//	@Then("^user enters valid nectar details in verify nectar screen$")
//	public void user_enters_valid_nectar_details_in_verify_nectar_screen() throws Throwable {
//		if (isElementDisplayedWithoutAssert(Continue1)) {
//			clickButtonWithOutScroll(Continue1);
//			waitFor(5000);
//			clickButtonWithOutScroll(Continue);
//			switchToWebAppContext(((AppiumDriver) driver));
//			waitFor(2000);
//			enterTextWithoutScroll(VerifyNectarnum, OffersContants.NECTARNUMVALID);
//			enterTextWithoutScroll(VerifyNectarPass, OffersContants.NECTARPASS);
//			hideMobileKeyboard();
//			waitElementToBeClickable(VerifyNectarCont);
//			clickButtonWithOutScroll(VerifyNectarCont);
//			waitFor(2000);
//			enterTextWithoutScroll(OTP, OffersContants.OTP);
//			waitFor(4000);
//			hideMobileKeyboard();
//			clickButtonWithOutScroll(OTPDone);
//			waitFor(5000);
//		}
//		else {
//			waitFor(5000);
//			clickButtonWithOutScroll(Continue);
//			switchToWebAppContext(((AppiumDriver) driver));
//			waitFor(2000);
//			enterTextWithoutScroll(VerifyNectarnum, OffersContants.NECTARNUMVALID);
//			enterTextWithoutScroll(VerifyNectarPass, OffersContants.NECTARPASS);
//			hideMobileKeyboard();
//			waitElementToBeClickable(VerifyNectarCont);
//			clickButtonWithOutScroll(VerifyNectarCont);
//			waitFor(2000);
//			enterTextWithoutScroll(OTP, OffersContants.OTP);
//			waitFor(4000);
//			hideMobileKeyboard();
//			clickButtonWithOutScroll(OTPDone);
//			waitFor(5000);
//
//		}
//
//	}

    @When("^user tap on a cluster$")
    public void user_tap_on_a_cluster() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            clickButtonWithOutScroll(StationCluster.get(1));
        } else {
            clickButtonWithOutScroll(StationCluster.get(5));
        }
    }

    @Then("^map gets zoomed in to display cluster and map pins$")
    public void map_gets_zoomed_in_to_display_cluster_and_map_pins() throws Throwable {
        waitFor(3000);
        clickButtonWithOutScroll(StationCluster.get(2));
    }

//	@And("^enter nectar card value and tap on next button$")
//	public void enter_nectar_card_value_and_tap_on_next_button() throws Throwable {
//		waitFor(1000);
//		enterTextWithoutScroll(NectarEnter, AccountConstants.NECTARCARDNUMBERNOTVERIFIED);
//		hideMobileKeyboard();
//		clickButtonWithOutScroll(NectarNxt);
//	}

    @When("^user tap on add nectar button in offers screen$")
    public void user_tap_on_add_nectar_button_in_offers_screen() throws Throwable {
        waitForElement(AddNectarBtn, 4);
        clickButtonWithOutScroll(AddNectarBtn);
    }

    @Then("^validate nectar card number and point balance in offers screen$")
    public void validate_nectar_card_number_and_point_balance_in_offers_screen() throws Throwable {
//		if (platformName.equalsIgnoreCase("android")) {
//			staticTextValidation(NectarCard, OffersContants.CARDNUM);
//			isElementEnabled(Nectarpoints);
//		}
        waitFor(15000);
        ScrollTo(OffersContants.OFFERSTXTCROLL, AccountConstants.IOSSCROLLDOWN, PointsTxt);
        waitForElement(PointsBalanceOffersScreen, 25);
        Assert.assertTrue(PointsTxt.isDisplayed());
        Assert.assertTrue(PointsBalanceOffersScreen.isDisplayed());
//		}
    }

    @Then("^tap on continue button in verify nectar screen$")
    public void tap_on_continue_button_in_verify_nectar_screen() throws Throwable {
        switchToWebAppContext(((AppiumDriver) driver));
        clickButtonWithOutScroll(VerifyNectarCont);
        System.out.println("clicked" + VerifyNectarCont);
    }

    @Then("^tap on add nectar card from account screen$")
    public void tap_on_add_nectar_card_from_account_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            waitFor(3000);
            if (isElementDisplayedWithoutAssert(AccNectardelete)) {
                delete_added_nectar_card();
            }
            waitFor(3000);
            clickButtonWithOutScroll(AddNectar);
        } else {
            waitFor(6000);
            waitForElement(UserProfileAccount, 20);
            ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
            waitFor(3000);
            if (isElementDisplayedWithoutAssert(AccNectardelete)) {
                delete_added_nectar_card();
            }
            waitFor(3000);
            clickButtonWithOutScroll(AddNectar);
        }
    }

    @Then("^delete added nectar card$")
    public void delete_added_nectar_card() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, AccountNectarCardSection);
            waitFor(2000);
            clickButtonWithOutScroll(AccNectardelete);
            waitFor(3000);
            clickButtonWithOutScroll(PopUpOK);
            waitFor(3000);
            clickButtonWithOutScroll(PopUpOK);
        } else {
            waitFor(9000);
            ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, TermsAndConditionElement);
            if (isElementDisplayedWithoutAssert(AccNectardelete)) {
                clickButtonWithOutScroll(AccNectardelete);
                waitForElement(Deletecnf, 4);
                clickButtonWithOutScroll(Deletecnf);
                waitForElement(PopUpOK, 4);
                clickButtonWithOutScroll(PopUpOK);
                waitForElement(PasswordEdit, 20);
                ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
            }
        }
    }

    @Then("^user tap on verify later$")
    public void user_tap_on_verify_later() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {

            waitFor(5000);
//			if (isElementDisplayedWithoutAssert(ContextualRegistrationPage.SkipAnyway)) {
//				clickButtonWithOutScroll(ContextualRegistrationPage.SkipAnyway);
//			}
            waitForElement(AccountNectarCardVerifyLaterPopup, 10);
            clickButtonWithOutScroll(AccountNectarCardVerifyLaterPopup);
            waitForElement(AccountNectarVerifyLaterSkip, 15);
            clickButtonWithOutScroll(AccountNectarVerifyLaterSkip);
        } else if (platformName.equalsIgnoreCase("iOS")) {
            waitForElement(AccountNectarCardVerifyLaterPopup, 10);
            clickButtonWithOutScroll(AccountNectarCardVerifyLaterPopup);
            waitForElement(AccountNectarVerifyLaterSkip, 15);
            clickButtonWithOutScroll(AccountNectarVerifyLaterSkip);
        }


    }


    @And("^validate Verify later screen$")
    public void validate_verify_later_screen() throws Throwable {
        waitFor(6000);
        staticTextValidation(VerifyCardTTL, OffersContants.VERIFYTTL);
		/*waitFor(1000);
		//staticTextValidation(VerifyCardDes, OffersContants.VERIFYDES);
		waitFor(2000);
		isElementDisplayed(VerifyImg);
		waitFor(3000);
		isElementDisplayed(VerifyNowBtn);*/
    }

    @And("^validate if user sees add nectar card button after deleting nectar$")
    public void validate_if_user_sees_add_nectar_card_button_after_deleting_nectar() throws Throwable {
        staticTextValidation(AddNectar, OffersContants.ADDNECTAR);
    }

    @When("^user taps on more about collecting points$")
    public void user_taps_on_more_about_collecting_points() throws Throwable {
        clickButtonWithOutScroll(CollectPtsLnk);
    }

    @When("^user tap on find out more about nectar$")
    public void user_tap_on_find_out_more_about_nectar() throws Throwable {

        ScrollTo(OffersContants.OFFERSFINDSCROLL, AccountConstants.IOSSCROLLUP, FindMoreHomeLnk);
        clickButtonWithOutScroll(FindOutMoreNectar);
    }

    @Then("^user sees how to collect points overlay$")
    public void user_sees_how_to_collect_points_overlay() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            isElementDisplayed(HCLogo);
            isElementDisplayed(HCTtl);
            isElementDisplayed(HC1);
            isElementDisplayed(HC2);
            isElementDisplayed(HC3);
            isElementDisplayed(HC4);
            clickButtonWithOutScroll(HCclose);
        } else {
            isElementDisplayed(HCTtl);
            isElementDisplayed(HC1);
            isElementDisplayed(HC2);
            isElementDisplayed(HC3);
            isElementDisplayed(HC4);
            clickButtonWithOutScroll(HCclose);
        }
    }

    @Then("^user is redirected to corresponding page$")
    public void user_is_redirected_to_corresponding_page() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            androidBack();
        } else {
            iOSBack();
        }

    }

    @Then("^tap on cancel button on verify screen and land on verify later screen$")
    public void tap_on_cancel_button_on_verify_screen_and_land_on_verify_later_screen() throws Throwable {
        ScrollTo(OffersContants.CANCELSCROLL, AccountConstants.IOSSCROLLUP, PrivacyCloseBtn);
        waitFor(2000);
        clickButtonWithOutScroll(PrivacyCloseBtn);
        isElementDisplayed(VerifyNowBtn);
    }

    @Then("^tap on verify now button$")
    public void tap_on_verify_now_button() throws Throwable {
        clickButtonWithOutScroll(VerifyNowBtn);
    }

    @Then("^Validate third screen$")
    public void validate_third_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            isElementEnabled(TutorialImg);
            staticTextValidation(AppInstallAndLaunchSteps.WelcomTtl,
                    AppInstallAndLaunchConstants.Tutorial_Screen_Fourth_Page_Title);
            staticTextValidation(AppInstallAndLaunchSteps.Subtitle,
                    AppInstallAndLaunchConstants.Tutorial_Screen_FourthSub_Title);
        } else {
            waitForElement(WelcomTtl, 20);
            isElementDisplayed(exxon_Help_Tutorial_GetStartedBtn);
            Assert.assertTrue(WelcomTtl.isDisplayed());
            Assert.assertTrue(SubtitleSecondScreen.isDisplayed());
        }
    }

    @When("^user tap on LID screen$")
    public void user_tap_on_lid_screen() throws Throwable {
        clickButtonWithOutScroll(Fuel);
    }

    @When("^user taps on start button in LID$")
    public void tapPayButton() {
        waitForElement(payButton, 25);
        clickButtonWithOutScroll(payButton);
    }

//	@Then("^tap on verify nectar screen from transaction complete screen$")
//	public void tap_on_verify_nectar_screen_from_transaction_complete_screen() throws Throwable {
//		waitForElement(VerifyNectarTransdone,30);
//		clickButtonWithOutScroll(VerifyNectarTransdone);
//	}

    @And("^close the thank you screen if displayed$")
    public void close_the_thank_you_screen_if_displayed() throws Throwable {
        if (isElementDisplayedWithoutAssert(AccountSkip)) {
            clickButtonWithOutScroll(AccountSkip);
        }
    }

    @Then("^user lands on authorize payment screen$")
    public void user_lands_on_authorize_payment_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
//			staticTextValidation(AuthHead, OffersContants.AUTHTTL);
//			staticTextValidation(AuthDes, OffersContants.AUTHDES);
//			AuthLoader(AuthLoader);
            webDriverWaitForElement(15).until(ExpectedConditions.visibilityOf(AuthHead));
//			webDriverWaitForElement(15).until(ExpectedConditions.visibilityOf(AuthHead));
            Assert.assertTrue(AuthHead.getText().equalsIgnoreCase(OffersContants.AUTHTTL));
            Assert.assertTrue(AuthDes.getText().equalsIgnoreCase(OffersContants.AUTHDES));

        } else {
            waitForElement(AuthHead, 5);
            isElementDisplayedWithoutAssert(AuthHead);
//			isElementDisplayed(AuthDes);
        }
    }

    public void verifyAuthorisePaymentScreen() {

        webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(AuthDes));
        Assert.assertTrue(AuthHead.getText().trim().equalsIgnoreCase(OffersContants.AUTHTTL));
        Assert.assertTrue(AuthDes.getText().trim().equalsIgnoreCase(OffersContants.AUTHDES));

    }

    @Then("^user is navigated to start fueling now screen$")
    public void user_is_navigated_to_start_fueling_now_screen() throws Throwable {
        if (isElementDisplayedWithoutAssert(StartFuelingNow)) {
            staticTextValidation(StartFuelingNow, OffersContants.STARTNOW);
        }
    }

    @And("^then to now fueling$")
    public void then_to_now_fueling() throws Throwable {
        if (isElementDisplayedWithoutAssert(NowFueling)) {
            staticTextValidation(NowFueling, GuestCheckOutConstants.NowFueling);
        }
    }

    @And("^validate redemption offers$")
    public void validate_redemption_offers() throws Throwable {
        if (isElementDisplayedWithoutAssert(AccountMessage)) {
            staticTextValidation(AccountMessage, OffersContants.NOREDEMPTION);
        } else if (isElementDisplayedWithoutAssert(AccountMessage)) {
            // Need fill redemption offers scenario
        }
    }

    @Then("^tap on payment method in select your pump screen$")
    public void tap_on_payment_method_in_select_your_pump_screen() throws Throwable {
        clickButtonWithOutScroll(ChangePayment);
    }

    @Then("^validate nectar section in change payment screen$")
    public void validate_nectar_section_in_change_payment_screen() throws Throwable {
        isElementDisplayed(CPNectarLogo);
        staticTextValidation(CPNectarTtl, OffersContants.CPNECTTTL);
        staticTextValidation(CPNectDes, OffersContants.CPNECTDES);
        isElementDisplayed(CPNectAdd);
    }

    @Then("^tap on add nectar card in change payment screen$")
    public void tap_on_add_nectar_card_in_change_payment_screen() throws Throwable {
        clickButtonWithOutScroll(CPNectAdd);
    }

    @And("^validate offers displayed in offer screen$")
    public void validate_offers_displayed_in_offer_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            waitForElement(PointsTxt, 35);
            ScrollTo(OffersContants.OFFERSHEADERPOINTSCT, AccountConstants.IOSSCROLLDOWN, PointsTxt);
            waitForElement(PointsTxt, 20);
            Assert.assertTrue(PointsTxt.isDisplayed());
            Assert.assertTrue(OfferLink.isDisplayed());
            Assert.assertTrue(PointsSec.isDisplayed());
            waitFor(5000);
            ScrollTo(OffersContants.OFFERSFINDSCROLL, AccountConstants.IOSSCROLLUP, RewardsSec);
            Assert.assertTrue(isTextMatch(FindOutMoreNectar.getText(), OffersContants.OFFERSFINDSCROLL));
            Assert.assertTrue(isElementDisplayed(RewardsSec));
        } else {
            waitForElement(PointsTxt, 35);
            Assert.assertTrue(PointsSec.isDisplayed());
            ScrollTo(OffersContants.OFFERSHEADERPOINTSCT, AccountConstants.IOSSCROLLDOWN, PointsTxt);
            Assert.assertTrue(PointsTxt.isDisplayed());
            Assert.assertTrue(OfferLink.isDisplayed());
            waitFor(5000);
            ScrollTo(OffersContants.OFFERSFINDSCROLL, AccountConstants.IOSSCROLLUP, RewardsSec);
            Assert.assertTrue(isTextMatch(FindOutMoreNectar.getText(), OffersContants.OFFERSFINDSCROLL));
            Assert.assertTrue(isElementDisplayed(RewardsSec));
        }
    }

    @Then("^tap on view offers button$")
    public void tap_on_view_offers_button() throws Throwable {
        ScrollTo(OffersContants.OFFERSCROLL, AccountConstants.IOSSCROLLDOWN, OffDes);
        waitForElement(ViewOffer, 30);
        clickButtonWithOutScroll(ViewOffer);
    }

    @And("^validate offer details$")
    public void validate_offer_details() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            isElementDisplayed(OffOTTL);
            isElementDisplayed(OffODes);
//			isElementDisplayed(OffOLoadBtn);
            staticTextValidation(OffNoteTTl, OffersContants.OFFNOTETTL);
            isElementDisplayed(OffNoteDes);
        } else {

            isElementDisplayed(OffOTC);
            staticTextValidation(OffNoteTTl, OffersContants.OFFNOTETTL);
            isElementEnabled(ViewOfferClose);
        }
    }

    @Then("^tap on Terms & conditions link$")
    public void tap_on_terms_conditions_link() throws Throwable {
        clickButtonWithOutScroll(OffOTC);
    }

    @And("^validate Terms & conditions overlay$")
    public void validate_terms_conditions_overlay() throws Throwable {
        isElementDisplayed(OffTCTTL);
        staticTextValidation(OffTCTTL, StationFinderConstants.TERMSANDCOND);
    }

    @Then("^close the Terms & conditions overlay$")
    public void close_the_Terms_conditions_overlay() throws Throwable {
        clickButtonWithOutScroll(OffTCClose);
    }

    @Then("^validate add nectar card button displayed in transaction complete screen$")
    public void validate_add_nectar_card_button_displayed_in_transaction_complete_screen() throws Throwable {
        waitForElement(AddNectarCardTransDone, 50);
        Assert.assertTrue(AddNectarCardTransDone.isEnabled());
        if (platformName.equalsIgnoreCase("android")) {
            staticTextValidation(AddNectarCardTransDone, OffersContants.ADDNECTARTRANSCOMPLETE);
        } else {
            staticTextValidation(AddNectarCardTransDone, OffersContants.ADDNECTARTRANSCOMPLETE1);
        }
    }

    @Then("^tap on your nectar card link in offers screen$")
    public void tap_on_your_nectar_card_link_in_offers_screen() throws Throwable {
        clickButtonWithOutScroll(ViewNectarCrd);
    }

//	@Then("^user should see the digital nectar card$")
//	public void user_should_see_the_digital_nectar_card() throws Throwable {
//
//		if (platformName.equalsIgnoreCase("android")) {
//			isElementDisplayed(DigiLogo);
//			isElementDisplayed(DigiBarcode);
//			isElementDisplayed(DigiCardHead);
//			isElementDisplayed(DigiCardNum);
//			isElementDisplayed(DigiClose);
//			isElementDisplayed(DigiFName);
//			isElementDisplayed(DigiLName);
//			isElementDisplayed(DigiNoteHead);
//			isElementDisplayed(DigiNoteTtl);
//		}
//		else{
//			waitFor(5000);
//			//Assert.assertTrue(DigiLogo.isDisplayed());
//			Assert.assertTrue(DigiCardHead.isDisplayed());
//			Assert.assertTrue(DigiClose.isEnabled());
//			Assert.assertTrue(DigiNoteHead.isDisplayed());
//			Assert.assertTrue(DigiNoteTtl.isDisplayed());
//		}
//	}

    @Then("^close the digital nectar card$")
    public void close_the_digital_nectar_card() throws Throwable {
        clickButtonWithOutScroll(DigiClose);
    }

    @When("^user tap on filter icon$")
    public void user_tap_on_filter_icon() throws Throwable {
        waitFor(10000);
        if (isElementDisplayedWithoutAssert(StationAllow)) {
            clickButtonWithOutScroll(StationAllow);
        }
        if (isElementDisplayedWithoutAssert(DontallowCancel)) {
            clickButtonWithOutScroll(DontallowCancel);
        }
        waitForElement(StationFilter,20);
        clickButtonWithOutScroll(StationFilter);
    }

    @Then("^select a filter option$")
    public void select_a_filter_option() throws Throwable {
        if (platformName.equalsIgnoreCase("android")) {
            waitFor(1000);
            clickButtonWithOutScroll(FilterOption.get(1));
        } else {
            clickButtonWithOutScroll(FilterFacilities.get(1));
        }
    }

    @And("^validate apply filter button$")
    public void validate_apply_filter_button() throws Throwable {
        waitForElement(FilterApplyBtn, 10);
        staticTextValidation(FilterApplyBtn, OffersContants.APPLYFILTER);
    }

    @Then("^validate point balance as nill in offers screen when user has no points$")
    public void validate_point_balance_as_nill_in_offers_screen_when_user_has_no_points() throws Throwable {
        waitForElement(NilNectarpoints, 10);
        staticTextValidation(NilNectarpoints, "-");
    }

    @And("^user check whether find more about nectar link is available in the offers details screen$")
    public void userCheckWhetherFindMoreAboutNectarLinkIsAvailableInTheOffersDetailsScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(3000);
            ScrollTo(OffersContants.OFFERSFINDSCROLL, AccountConstants.IOSSCROLLUP, FindMoreMsgLnk);
            waitFor(4000);
            isElementDisplayed(FindMoreHomeLnk);
        } else {
            waitFor(3000);
//			ScrollTo(OffersContants.OFFERSFINDSCROLL, AccountConstants.IOSSCROLLUP, FindMoreMsgLnk);
            waitFor(4000);
            isElementEnabled(FindMoreHomeLnk);
        }
    }

    @And("^click the continue button under 'Nectar card added successfully' screen$")
    public void clickTheContinueButtonUnderNectarCardAddedSuccessfullyScreen() {
        waitForElement(NectarCardSuccess, 6);
        if (isElementDisplayedWithoutAssert(NectarCardSuccess)) {
            waitForElement(ContinueNectarCard, 3);
            clickButtonWithOutScroll(ContinueNectarCard);
            waitFor(5000);
            if (isElementDisplayedWithoutAssert(Continue))
                clickButtonWithOutScroll(Continue);
            waitFor(15000);
        }
    }

    @And("^user verifies the inline error message for empty nectar card number field$")
    public void userVerifiesTheInlineErrorMessageForNectarCardNumberField() {
        waitForElement(NectarcardInlineError, 10);
        staticTextValidation(NectarcardInlineError, OffersContants.NECTARCARDNUMBERINLINEERRORMSG);

    }

    @When("^user taps on the next button in 'Add Nectar Card' screen without entering the nectar card$")
    public void userTapsOnTheNextButtonInAddNectarCardScreenWithoutEnteringTheNectarCard() {
        waitFor(2000);
        clickButtonWithOutScroll(NectarNxt);
    }

    @And("^tap on the Add Nectar Card button in Transaction complete Screen$")
    public void tapOnTheAddNectarCardButtonInTransactionCompleteScreen() {
        waitForElement(AddNectarCardTransDone, 9);
        clickButtonWithOutScroll(AddNectarCardTransDone);
//		clickButtonWithOutScroll(VerifyNectarTransdone);
    }

    @And("^verify the Add nectar card screen$")
    public void verifyTheAddNectarCardScreen() {
        waitForElement(AddNectarCardText, 10);
        Assert.assertTrue(AddNectarCardText.isDisplayed());
        Assert.assertTrue(YesAddNow.isEnabled());
        Assert.assertTrue(NoSignUpBtn.isEnabled());
        Assert.assertTrue(WhatisNectarTxt.isEnabled());
    }

    @Then("^tap on Add now button in Add Nectar Card Screen$")
    public void tapOnAddNowButtonInAddNectarCardScreen() {
        clickButtonWithOutScroll(YesAddNow);
    }

    @And("^verify if the application redirects to the 'Link your account' Screen$")
    public void verifyIfTheApplicationRedirectsToTheLinkYourAccountScreen() throws InterruptedException {
        waitFor(6000);
        switchToWebAppContext(((AppiumDriver) driver));
        waitForElement(LinkAccTxt, 15);
        Assert.assertTrue(LinkAccTxt.isDisplayed());
        Assert.assertTrue(CancelReturnEssoLink.isEnabled());

    }

    @When("^tap on 'Cancel and Return to ESSO' link in 'Link your account' Screen$")
    public void tapOnCancelAndReturnToESSOLinkInLinkYourAccountScreen() {
        if (platformName.equalsIgnoreCase("iOS")) {
            waitForElement(LinkAccTxt, 15);
            Assert.assertTrue(LinkAccTxt.isDisplayed());
        }
        ScrollTo(OffersContants.CANCELSCROLL, AccountConstants.IOSSCROLLUP, CancelReturnEssoLink);
        waitForElement(CancelReturnEssoLink, 4);
        clickButtonWithOutScroll(CancelReturnEssoLink);
    }

    @Then("^verify if the user is in the Transaction Complete Screen$")
    public void verifyIfTheUserIsInTheTransactionCompleteScreen() {
        waitForElement(SafeTravelsTxt, 50);
        Assert.assertTrue(SafeTravelsTxt.isDisplayed());
        Assert.assertTrue(PaymentSuccessTxt.isDisplayed());
        Assert.assertTrue(TransDetailsLink.isEnabled());
    }

    @And("^click on Ok button in the modal popup in the Nectar card page$")
    public void clickOnOkButtonInTheModalPopupInTheNectarCardPage() {
        waitForElement(LinkAccOkBtn, 4);
        //Assert.assertTrue(PopUpTxt.isDisplayed());
        clickButtonWithOutScroll(LinkAccOkBtn);
    }

    @And("^user lands on Verify Card Screen and taps on skip button$")
    public void userLandsOnVerifyCardScreenAndTapsOnSkipButton() {
        waitFor(10000);
        if (isElementDisplayedWithoutAssert(skip_BTN)) {
            clickButtonWithOutScroll(skip_BTN);
        }
    }

    @Then("^verify if the user is in the Transaction Complete Screen with the context to verify the nectar card$")
    public void verifyIfTheUserIsInTheTransactionCompleteScreenWithTheContextToVerifyTheNectarCard() {
        waitForElement(SafeTravelsTxt, 15);
        Assert.assertTrue(SafeTravelsTxt.isDisplayed());
        Assert.assertTrue(PaymentSuccessTxt.isDisplayed());
        Assert.assertTrue(NectarCardTransTxt.isDisplayed());
        Assert.assertTrue(TransDetailsLink.isDisplayed());

    }

    @Then("^verify if the user is in the Transaction Complete Screen with the context to see rewards$")
    public void verifyIfTheUserIsInTheTransactionCompleteScreenWithTheContextToSeeRewards() {
        waitForElement(SafeTravelsTxt, 10);
        Assert.assertTrue(SafeTravelsTxt.isDisplayed());
        Assert.assertTrue(PaymentSuccessTxt.isDisplayed());
        Assert.assertTrue(NectarCardVerifiedTransTxt.isDisplayed());
        Assert.assertTrue(TransDetailsLink.isDisplayed());
    }

    @Then("^validate verify nectar card link displayed in transaction complete screen$")
    public void validateVerifyNectarCardLinkDisplayedInTransactionCompleteScreen() {
        waitForElement(VerfiyNectarCardTransdone, 50);
        Assert.assertTrue(VerfiyNectarCardTransdone.isEnabled());
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(VerfiyNectarCardTransdone,
                    "Verify your Nectar card to get exclusive\nEsso rewards.");
        } else {
            staticTextValidation(VerfiyNectarCardTransdone,
                    "Verify your Nectar card to get exclusive Esso rewards.");
        }
    }

    @And("^tap on the Verify Nectar Card link in Transaction complete Screen$")
    public void tapOnTheVerifyNectarCardLinkInTransactionCompleteScreen() {
        waitForElement(VerfiyNectarCardTransdone, 15);
        clickButtonWithOutScroll(VerfiyNectarCardTransdone);
    }

    @Then("^tap on Verify Nectar button in offers Screen$")
    public void tapOnVerifyNectarButtonInOffersScreen() {
        waitForElement(VerifyNectarCardBtn, 15);
        clickButtonWithOutScroll(VerifyNectarCardBtn);
    }

    @And("^verify the modal popup and click on Ok button before navigating to Offers Screen$")
    public void verifyTheModalPopupAndClickOnOkButtonBeforeNavigatingToOffersScreen() {
        Assert.assertTrue(isTextMatch(PopUpTxt.getText(), OffersContants.LINKACCPOPUPTXT));
        clickButtonWithOutScroll(LinkAccOkBtn);
    }

    @Then("^verify if the user is navigated to Offers screen$")
    public void verifyIfTheUserIsNavigatedToOffersScreen() {
        Assert.assertTrue(OffersNect.isDisplayed());
        Assert.assertTrue(BonusPoints.isDisplayed());
    }

    @And("^verify the modal popup and click on Ok button before navigating to Account Screen$")
    public void verifyTheModalPopupAndClickOnOkButtonBeforeNavigatingToAccountScreen() {
        Assert.assertTrue(isTextMatch(PopUpTxt.getText(), OffersContants.LINKACCPOPUPTXT));
        clickButtonWithOutScroll(LinkAccOkBtn);
    }

    @And("^user taps on Payment Method link under 'Select your pump'Screen$")
    public void userTapsOnPaymentMethodLinkUnderSelectYourPumpScreen() {

        clickButtonWithOutScroll(PaymentMethodLinkVisa);
    }

    @Then("^verify if the user lands on Payment Details Screen$")
    public void verifyIfTheUserLandsOnPaymentDetailsScreen() {
        waitForElement(PaymentContinueBtn, 20);
        Assert.assertTrue(PaymentMethodTxt.isDisplayed());
        Assert.assertTrue(EssoNectarTxt.isDisplayed());
        Assert.assertTrue(PaymentContinueBtn.isEnabled());

    }


    @And("^tap on Add Nectar card button in Payment details screen$")
    public void tapOnAddNectarCardButtonInPaymentDetailsScreen() {
        waitForElement(PaymentAddNectarCard, 10);
        clickButtonWithOutScroll(PaymentAddNectarCard);
    }

    @And("^verify if user lands on Verify Card Screen$")
    public void verifyIfUserLandsOnVerifyCardScreen() {
        Assert.assertTrue(VerifyCardTxt.isDisplayed());
        Assert.assertTrue(VerifyNowBtn.isDisplayed());
    }

    @And("^verify the modal popup and click on Ok button before navigating to verify card screen$")
    public void verifyTheModalPopupAndClickOnOkButtonBeforeNavigatingToVerifyCardScreen() {
        Assert.assertTrue(isTextMatch(PopUpTxt.getText(), OffersContants.LINKACCPOPUPTXT));
        clickButtonWithOutScroll(LinkAccOkBtn);
    }

    @Then("^verify whether See your Nectar balance link is displayed on LID$")
    public void verifyWhetherSeeYourNectarBalanceLinkIsDisplayedOnLID() {
        waitForElement(SeeYourNectBalink, 15);
        Assert.assertTrue(SeeYourNectBalink.isEnabled());
    }

    @And("^tap on See your Nectar balance Link$")
    public void tapOnSeeYourNectarBalanceLink() {
        waitForElement(SeeYourNectBalink, 15);
        clickButtonWithOutScroll(SeeYourNectBalink);
    }

    @And("^verify the modal popup and click on Ok button before navigating to LID$")
    public void verifyTheModalPopupAndClickOnOkButtonBeforeNavigatingToLID() {
        Assert.assertTrue(isTextMatch(PopUpTxt.getText(), OffersContants.LINKACCPOPUPTXT));
        clickButtonWithOutScroll(LinkAccOkBtn);
    }

    @Then("^verify whether 'Learn more' link is displayed on LID$")
    public void verifyWhetherLearnMoreLinkIsDisplayedOnLID() {
        Assert.assertTrue(LearnMoreLink.isEnabled());
    }

    @And("^tap on 'Learn more' Link$")
    public void tapOnLearnMoreLink() {
        clickButtonWithOutScroll(LearnMoreLink);
    }

    @And("^user tap on Get Started button in the Add Nectar Card screen$")
    public void userTapOnGetStartedButtonInTheAddNectarCardScreen() {
        waitForElement(GetStartedBtn, 10);
        clickButtonWithOutScroll(GetStartedBtn);
    }

    @And("^click the continue button under 'Card Added successfully' alert$")
    public void clickTheContinueButtonUnderCardAddedSuccessfullyAlert() {
        waitFor(5000);
        if (isElementDisplayedWithoutAssert(Continue)) {
            clickButtonWithOutScroll(Continue);
        } else {
            logger.info("No popup");
        }
    }


    @And("^click the continue button under 'verify your card' alert$")
    public void clickTheContinueButtonUnderVerifyYourCardAlert() {
        waitForElement(Continue, 30);
        //Assert.assertTrue(NectarcomAlert.isDisplayed());
        clickButtonWithOutScroll(Continue);

    }

    @And("^close the modal popup$")
    public void closeTheModalPopup() {
        waitFor(15000);
        if (isElementDisplayedWithoutAssert(CloseButtonModalPopupLid)) {
            clickButtonWithOutScroll(CloseButtonModalPopupLid);

        } else {
            logger.info("No popup");
        }
    }


    @And("^validate the offers screen before adding the nectar card$")
    public void validateTheOffersScreenBeforeAddingTheNectarCard() {
        waitForElement(GetExclusiveOffers, 10);
        Assert.assertTrue(GetExclusiveOffers.isEnabled());
        Assert.assertTrue(isTextMatch(HIW.getText(), OffersContants.HIW));
        Assert.assertTrue(isTextMatch(CollectPtsLnk.getText(), OffersContants.COLLECTPTSLNK));
        Assert.assertTrue(MoreCollectpoints.isEnabled());
//		Assert.assertTrue(isTextMatch(CollectMoreHead.getText(), OffersContants.COLECTMOREHEAD));
        if (platformName.equalsIgnoreCase("Android")) {
            ScrollTo(OffersContants.FINDMORELNK, AccountConstants.IOSSCROLLUP, FindMoreHomeLnk);
        } else {
            ScrollTo(OffersContants.COLECTMOREDESCRIPTION, AccountConstants.IOSSCROLLUP, FindMoreMsgLnk);
        }
        Assert.assertTrue(isTextMatch(FindMoreHomeLnk.getText(), OffersContants.OFFERSFINDSCROLL));
        Assert.assertTrue(isElementDisplayed(RewardsSec));
        Assert.assertTrue(AddNectarCardBtn.isEnabled());
    }

    @When("^user taps on 'More about collecting points'link in the offers screen$")
    public void userTapsOnMoreAboutCollectingPointsLinkInTheOffersScreen() {
        waitForElement(MoreCollectpoints, 4);
        clickButtonWithOutScroll(MoreCollectpoints);
    }

    @Then("^validate the popup which displays 'How to collect points' in detail and close the popup$")
    public void validateThePopupWhichDisplaysHowToCollectPointsInDetailAndCloseThePopup() {
        //Assert.assertTrue(isElementDisplayed(HCLogo));
        Assert.assertTrue(isElementDisplayed(HCTtl));
        Assert.assertTrue(isElementDisplayed(HC1));
        Assert.assertTrue(isElementDisplayed(HC2));
        Assert.assertTrue(isElementDisplayed(HC3));
        //Assert.assertTrue(isElementDisplayed(HC4));
        Assert.assertTrue(isElementEnabled(HCclose));
        clickButtonWithOutScroll(HCclose);
    }

    @When("^user taps on 'Get Exclusive offers' in the offers screen$")
    public void userTapsOnGetExclusiveOffersInTheOffersScreen() {
        waitForElement(GetExclusiveOffers, 20);
        clickButtonWithOutScroll(GetExclusiveOffers);
//		if(platformName.equalsIgnoreCase("iOS")) {
//			clickButtonWithOutScroll(GetExclusiveOffers);
//		}
//		else{
//			ScrollTo(MenuConstants.OFFERSSCREENCTWITHOUTVERIFYCARD, AccountConstants.IOSSCROLLUP, GetExclusiveOffers);
//			clickButtonWithOutScroll(GetExclusiveOffers);
//		}
    }

    @When("^user clicks on Verify Later button under 'Card Added successfully' alert$")
    public void userClicksOnVerifyLaterButtonUnderCardAddedSuccessfullyAlert() {
        waitForElement(VerifyLater, 10);
        clickButtonWithOutScroll(VerifyLater);
    }

    @When("^user clicks on Continue button under 'Card Added successfully' alert$")
    public void user_clicks_on_continue_button_under_card_added_successfully_alert() throws Throwable {
        waitForElement(Continue, 20);
        clickButtonWithOutScroll(Continue);
    }

    @And("^verify if the user is navigated to Verify Offers screen$")
    public void verifyIfTheUserIsNavigatedToVerifyOffersScreen() {
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(OfferLink, 5);
            //Assert.assertTrue(VerifyNectarCard.isDisplayed());
            Assert.assertTrue(OfferLink.isDisplayed());
            Assert.assertTrue(PointsSec.isDisplayed());
            isElementDisplayed(NectarCard);
        } else {
            waitForElement(OfferLink, 5);
            Assert.assertTrue(NilNectarpoints.isDisplayed());
            Assert.assertTrue(Nectarpoints.isDisplayed());
            Assert.assertTrue(VerifyNectarCard.isDisplayed());
            Assert.assertTrue(OfferLink.isDisplayed());
            Assert.assertTrue(PointsSec.isDisplayed());
            ScrollTo(OffersContants.OFFERSFINDSCROLL1, AccountConstants.IOSSCROLLUP, RewardsSec);
            Assert.assertTrue(isTextMatch(FindMoreHomeLnk.getText(), OffersContants.OFFERSFINDSCROLL));
            Assert.assertTrue(RewardsSec.isDisplayed());
            Assert.assertTrue(isElementEnabled(VerifyNectarCardBtn));
        }
    }

    @When("^user Verifies the Nectar card button in the Offers Screen$")
    public void userVerifiesTheNectarCardButtonInTheOffersScreen() {
        waitForElement(VerifyNectarCardBtn, 15);
        Assert.assertTrue(isElementEnabled(VerifyNectarCardBtn));
    }

    @When("^user taps on fuel icon$")
    public void userTapsOnFuelIcon() {
        waitFor(7000);
        clickButtonWithOutScroll(Fuel);
    }

    @Then("^Redemption screen is displayed with Redemption options$")
    public void redemptionScreenIsDisplayedWithRedemptionOptions() {
        waitForElement(RedemptionSaveTxt, 7);
        Assert.assertTrue(RedemptionViewClose.isEnabled());
        Assert.assertTrue(RedemptionSaveTxt.isDisplayed());
        Assert.assertTrue(RedemptionChooseOption.isDisplayed());
        Assert.assertTrue(RedemptionOption1.isEnabled());
        Assert.assertTrue(RedemptionOption2.isEnabled());
        Assert.assertTrue(RedemptionContinue.isEnabled());
    }

    @When("^user selects any of the options and click on continue in the popup$")
    public void userSelectsAnyOfTheOptionsAndClickOnContinueInThePopup() {
        clickButtonWithOutScroll(RedemptionOption1);
        clickButtonWithOutScroll(RedemptionContinue);
    }

    @Then("^the user is navigated to Confirm payment screen$")
    public void theUserIsNavigatedToConfirmPaymentScreen() {
        waitForElement(ConfirmPayment, 10);
//		Assert.assertTrue(isElementDisplayed(ConfirmPayment));
        staticTextValidation(CancelSelectYourPumpScreen, GuestCheckOutConstants.Cancel);
    }

    @When("^click on Edit link under Redemption Offers in Confirm payment screen$")
    public void clickOnEditLinkUnderRedemptionOffersInConfirmPaymentScreen() {
        clickButtonWithOutScroll(RewardEdit);
    }

    @Then("^the user is navigated to the Redemption screen$")
    public void theUserIsNavigatedToTheRedemptionScreen() {
        if (isElementDisplayedWithoutAssert(RedemptionSaveTxt)) {
            Assert.assertTrue(isElementEnabled(RedemptionViewClose));
            Assert.assertTrue(isElementDisplayed(RedemptionSaveTxt));
            Assert.assertTrue(isElementDisplayed(RedemptionChooseOption));
            Assert.assertTrue(isElementEnabled(RedemptionOption1));
            Assert.assertTrue(isElementEnabled(RedemptionOption2));
            Assert.assertTrue(isElementEnabled(RedemptionContinue));
            if (!platformName.equalsIgnoreCase("Android")) {
                Assert.assertTrue(isElementEnabled(RedemptionRewardCellClose));
            }
            clickButtonWithOutScroll(ContinueButtonRedemptionScreen);
        }
    }

    @When("^user unselects the redemption option$")
    public void userUnselectsTheRedemptionOption() {
        clickButtonWithOutScroll(RedemptionRewardCellClose);
        clickButtonWithOutScroll(RedemptionContinue);
    }


    @Then("^the user is navigated to Confirm payment screen after unselecting the redemption option$")
    public void theUserIsNavigatedToConfirmPaymentScreenAfterUnselectingTheRedemptionOption() {
        Assert.assertTrue(isElementDisplayed(PayPalButn));
        Assert.assertTrue(isElementDisplayed(RedemptionReward));
    }


    @And("^delete added nectar card if exists$")
    public void deleteAddedNectarCardIfExists() {
        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(15000);
            EmailSettings.isDisplayed();
            if (isElementDisplayedWithoutAssert(AccNectardelete)) {
                clickButtonWithOutScroll(AccNectardelete);
                waitForElement(Deletecnf, 10);
                clickButtonWithOutScroll(Deletecnf);
                waitForElement(PopUpOK, 10);
                clickButtonWithOutScroll(PopUpOK);
            } else {
                logger.info("No nectar card added");
            }
        } else {
            waitForElement(UserProfileAccount, 25);
            try {
                ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
            } catch (Exception e) {
                ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
            }
            if (isElementDisplayedWithoutAssert(AccNectardelete)) {
                clickButtonWithOutScroll(AccNectardelete);
                waitForElement(Deletecnf, 10);
                clickButtonWithOutScroll(Deletecnf);
                waitForElement(PopUpOK, 10);
                clickButtonWithOutScroll(PopUpOK);
            } else {
                logger.info("No nectar card added");
            }
        }
    }

    @And("^close the viewoffers popup$")
    public void closeTheViewoffersPopup() {
        clickButtonWithOutScroll(ViewOfferClose);
    }

    @Then("^the user is navigated to Confirm payment screen after selecting the redemption option$")
    public void theUserIsNavigatedToConfirmPaymentScreenAfterSelectingTheRedemptionOption() {
        Assert.assertTrue(isElementDisplayed(PayPalButn));
        Assert.assertTrue(isElementEnabled(RewardEdit));
    }

//	@Then("^enter nectar card value and taps on next button$")
//	public void enterNectarCardValueAndTapsOnNextButton() {
//		waitFor(1000);
//		enterTextWithoutScroll(NectarEnter, OffersContants.NECTARNUMVALID);
//		hideMobileKeyboard();
//		clickButtonWithOutScroll(NectarNxt);
//	}

    @When("^user verifies the Got it popup before the Station details screen$")
    public void userVerifiesTheGotItPopupBeforeTheStationDetailsScreen() {
        waitFor(5000);
        if (StationOfferGotItButton.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                if (!StationOfferGotItButton.isEmpty()) {
                    org.junit.Assert.assertTrue(!StationOfferGotItButton.isEmpty());
                    break;
                }
                waitForElement(NavBack, 10);
                clickButtonWithOutScroll(NavBack);
                waitFor(4000);
                clickButtonWithOutScroll(address_Station_List.get(0));
                waitFor(5000);
            }
        } else {
            org.junit.Assert.assertTrue(!StationOfferGotItButton.isEmpty());
        }
    }

//	@Then("^user enters valid nectar card details and verify the nectar card$")
//	public void userEntersValidNectarCardDetailsAndVerifyTheNectarCard() throws Throwable{
//		waitForElement(Continue,10);
//		clickButtonWithOutScroll(Continue);
//		switchToWebAppContext(((AppiumDriver) driver));
//		waitFor(2000);
//		enterTextWithoutScroll(VerifyNectarnum, OffersContants.NECTARNUMVALID);
//		enterTextWithoutScroll(VerifyNectarPass, OffersContants.NECTARPASS);
//		hideMobileKeyboard();
//		waitElementToBeClickable(VerifyNectarCont);
//		clickButtonWithOutScroll(VerifyNectarCont);
//		waitFor(2000);
//		enterTextWithoutScroll(OTP, OffersContants.OTP);
//		waitFor(4000);
//		hideMobileKeyboard();
//		clickButtonWithOutScroll(OTPDone);
//		waitFor(5000);
//	}

    @Then("^enter \"([^\"]*)\" Nectar card number and password$")
    public void enterNectarCardNumberAndPassword(String NectarCardCredentials) throws Throwable {
        waitFor(8000);
        if (isElementDisplayedWithoutAssert(NectarAddedSuccessfulTitle)) {
            clickButtonWithOutScroll(Continue);
        }
        waitFor(5000);
        if (isElementDisplayedWithoutAssert(NectarCardAddedSuccessPopup)) {
            try {
                if (isElementDisplayedWithoutAssert(ContinueNectarPopup)) {
                    clickButtonWithOutScroll(ContinueNectarPopup);
                } else {
                    clickButtonWithOutScroll(ContinueNectarPopuponNectarSuccessScreen);
                }
            } catch (Exception E) {
                logger.info("Back/Cancel Button is NOT PRESENT");
                Assert.fail();
            }
        }
        waitFor(30000);
        switchToWebAppContext(((AppiumDriver) driver));
        waitElementToBeClickable(VerifyNectarnum);
        enterTextWithoutScroll(VerifyNectarnum, getTestDataValues(passwordclass_path, NectarCardCredentials)[0]);
        waitElementToBeClickable(VerifyNectarPass);
        enterTextWithoutScroll(VerifyNectarPass, getTestDataValues(passwordclass_path, NectarCardCredentials)[1]);
        hideMobileKeyboard();
        waitElementToBeClickable(VerifyNectarCont);
        clickButtonWithOutScroll(VerifyNectarCont);
        waitFor(10000);
        waitElementToBeClickable(OTP);
        OTP.click();
        enterTextWithoutScroll(OTP,getTestDataValues(passwordclass_path, NectarCardCredentials)[2]);
        waitFor(4000);
        hideMobileKeyboard();
        clickButtonWithOutScroll(OTPDone);
        waitFor(5000);
    }

    @When("^user enters search term with a non mobile station in station finder$")
    public void userEntersSearchTermWithANonMobileStationInStationFinder() {
        if (platformName.equalsIgnoreCase("Android")) {
            waitFor(5000);
            enterTextWithoutScroll(StationSearch, "Chesterfield,UK");
            waitFor(1000);
            androidTap();
        } else {
            waitFor(8000);
            enterTextWithoutScroll(StationSearch, "Chesterfield");
            waitForElement(StationSelectNonMobilePay, 10);
            actionClick(StationSelectNonMobilePay);
        }
    }

    @And("^user taps on Add nectar card in Account screen$")
    public void userTapsOnAddNectarCardInAccountScreen() {
        clickButtonWithOutScroll(AccountAddNectarCardButton);
    }

    @And("^user verify the copy text in modal popup with nectar card not added in LID$")
    public void userVerifyTheCopyTextInModalPopupWithNectarCardNotAddedInLID() {
    }

//	@And("^user enters the nectar card number and tap on Next$")
//	public void userEntersTheNectarCardNumberAndVerifiesSuccessPopUp() {
//		enterTextWithoutScroll(AccountPage.NectarCardnumberEnter, AccountConstants.NECTARCARDNUMBERNOTVERIFIED);
//		hideMobileKeyboard();
//		clickButtonWithOutScroll(NectarNxt);
//	}

    @Then("^user verifies the Nectar Added success pop-up and skips verification$")
    public void userVerifiesTheNectarAddedSuccessPopUpAndSkipsVerification() {
        waitForElement(NectarCardAddedSuccessPopup, 30);
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(NectarCardAddedSuccessPopup, AppLaunchConstants.nectarSuccessPopupText);
        } else {
            staticTextValidation(NectarCardAddedSuccessPopup, AppLaunchConstants.nectarSuccessPopupTextiOS);
        }
        clickButtonWithOutScroll(VerifyLater);
    }

    @And("^user verifies Offer page after nectar card added$")
    public void userVerifiesOfferPageAfterNectarCardAdded() {
        isElementDisplayed(NectarCard);
        isElementDisplayed(VerifyNectarCard);
        staticTextValidation(VerifyNectarCard, OffersContants.VERIFYNECTARBTNTEXT);
    }


    @And("^verify nectar points comma separator on LID$")
    public void verify_nectar_points_comma_separator_LID() {

        StringBuilder nectarPointsDisplayedonLID = new StringBuilder();
        nectarPointsonLID.stream().forEach(n -> nectarPointsDisplayedonLID.append(n.getText()));
        logger.info("Displayed Nectar points on LID : " + nectarPointsDisplayedonLID);


        Assert.assertTrue(nectarPointsDisplayedonLID.toString().contains(","));
        int len = nectarPointsDisplayedonLID.toString().split(",").length;
        Assert.assertTrue(nectarPointsDisplayedonLID.toString().split(",")[len - 1].length() == 3);

    }

    @And("^verify nectar points comma seperator on offers screen$")
    public void verify_nectar_points_comma_separator_Offers() {

        webDriverWaitForElement(20).until(ExpectedConditions.visibilityOf(Nectarpointsinteger));
        logger.info("Displayed Nectar points on offers Screen : " + Nectarpointsinteger.getText());

        Assert.assertTrue(Nectarpointsinteger.getText().contains(","));
        int len = Nectarpointsinteger.getText().split(",").length;
        Assert.assertTrue(Nectarpointsinteger.getText().split(",")[len - 1].length() == 3);

    }

    @And("^verify nectar points comma seperator on redemption screen$")
    public void verify_nectar_points_comma_separator_Redemption() {

        webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(nectarPointsonRedemptionScreen));
        logger.info("Displayed Nectar points on redemption Screen : " + nectarPointsonRedemptionScreen.getText());

        Pattern pattern = Pattern.compile("\\d{1,},\\d{3}");
        Matcher matcher = pattern.matcher(nectarPointsonRedemptionScreen.getText());
        boolean matched = matcher.find();
        String nectarPoints = matcher.group();
        Assert.assertTrue(nectarPoints.contains(","));
        int len = nectarPoints.split(",").length;
        Assert.assertTrue(nectarPoints.split(",")[len - 1].length() == 3);

    }

    @And("^verify nectar points displayed on LID$")
    public void verify_nectar_points_LID() {

        webDriverWait().until(ExpectedConditions.visibilityOf(youHavetxtLID));
        Assert.assertTrue(youHavetxtLID.isDisplayed());
        Assert.assertTrue(nectarPointstxtLID.isDisplayed());
        Assert.assertTrue(nectarPointsonLID.size() > 3);
    }

    @And("^user navigates to LID screen for the 5nth time$")
    public void user_navigates_LID_5nth() {
        if (isElementEnabled(CloseButtonModalPopupLid)) {
            clickButtonWithOutScroll(CloseButtonModalPopupLid);
        }

        if (platformName.equalsIgnoreCase("Android")) {
            for (int i = 1; i <= 5; i++) {

//				frictionlessFlowSteps.user_on_More_button_in_tab_bar();
//				webDriverWaitForElement(20).until(ExpectedConditions.visibilityOf(AccountBtn));
//				modalPopupSteps.clickOnFuelTab();

                try {
                    webDriverWaitForElement(20).until(ExpectedConditions.visibilityOf(ViewDetailsBtn));
                    break;
                } catch (Exception E) {
//					webDriverWaitForElement(20).until(ExpectedConditions.visibilityOf(frictionlessFlowSteps.StartFuelBtn));
                }

            }
        } else {
            if (CloseButtonModalPopupLid1.isEmpty()) {
                for (int i = 0; i < 5; i++) {
                    waitFor(8000);
                    if (!CloseButtonModalPopupLid1.isEmpty()) {
                        Assert.assertTrue(!CloseButtonModalPopupLid1.isEmpty());
                        break;
                    }
                    waitForElement(AccountMore, 15);
                    clickButtonWithOutScroll(AccountMore);
                    waitForElement(FuelTab, 10);
                    clickButtonWithOutScroll(FuelTab);
                    waitFor(5000);
                }
            } else {
                org.junit.Assert.assertTrue(!CloseButtonModalPopupLid1.isEmpty());
            }
        }
    }

    @And("^verify save on fuel with points on redemption screen$")
    public void verify_save_on_fuel() {

        Assert.assertTrue(RedemptionSaveTxt.getText().trim().replace("\n", " ").equalsIgnoreCase(OffersContants.SAVEONFUELTXT));


    }

    @And("^user verifies CHOOSE AN OPTION OR CONTINUE section$")
    public void verify_choose_option() {

        Assert.assertTrue(RedemptionChooseOption.getText().trim().equalsIgnoreCase(OffersContants.CHOOSETXT));
        clickButtonWithOutScroll(redemptionInfoIcon);
        webDriverWait().until(ExpectedConditions.visibilityOf(discountMessage));
        Assert.assertTrue(discountMessage.getText().replace("\n", " ").trim().equalsIgnoreCase(OffersContants.DISCOUNTTXT));
        Assert.assertTrue(gotItButRedemption.isDisplayed());


    }

    @Then("^enter \"([^\"]*)\" Nectar card number and password from Transaciton complete screen$")
    public void enterNectarCardNumberAndPasswordFromTransacitonCompleteScreen(String NectarCredentials) throws Throwable {
        waitFor(8000);
        if (isElementDisplayedWithoutAssert(NectarAddedSuccessfulTitle)) {
            clickButtonWithOutScroll(ContinueNectarPopup);
        }
        if (isElementDisplayedWithoutAssert(ContinueNectarPopup)) {
            clickButtonWithOutScroll(ContinueNectarPopup);
        }
        waitFor(30000);
        switchToWebAppContext(((AppiumDriver) driver));
        waitElementToBeClickable(VerifyNectarnum);
        enterTextWithoutScroll(VerifyNectarnum, getTestDataValues(passwordclass_path, NectarCredentials)[0]);
        enterTextWithoutScroll(VerifyNectarPass, getTestDataValues(passwordclass_path, NectarCredentials)[1]);
        hideMobileKeyboard();
        waitElementToBeClickable(VerifyNectarCont);
        clickButtonWithOutScroll(VerifyNectarCont);
        waitFor(10000);
        enterTextWithoutScroll(OTP, getTestDataValues(passwordclass_path, NectarCredentials)[2]);
        waitFor(4000);
        hideMobileKeyboard();
        clickButtonWithOutScroll(OTPDone);
        waitFor(5000);
    }

//	@And("^validate added nectar card in account without verification$")
//	public void validateAddedNectarCardInAccountWithoutVerification() {
//		if (platformName.equalsIgnoreCase("android")){
//			staticTextValidation(AccNectarcard, OffersContants.CARDNUM);
//		}else {
//			ScrollTo(AccountConstants.TERMSCROLL,AccountConstants.IOSSCROLLUP,AccountPage.TermsAndConditionElement);
//			Assert.assertTrue(AccNectarcardFromConstant.isDisplayed());
//			staticTextValidation(AccNectarcardFromConstant,OffersContants.CARDNUM);
//		}
//	}

//	@And("^validate added nectar card in account$")
//	public void validate_added_nectar_card_in_account() throws Throwable {
//		waitForElement(AccNectarcard,20);
//		if (platformName.equalsIgnoreCase("android")){
////		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, AccountPage.TermsAndConditionElement);
////		Assert.assertTrue(AccNectarcard.isDisplayed());
//			staticTextValidation(AccNectarcard, OffersContants.CARDNUM);
//		}else {
//			ScrollTo(AccountConstants.TERMSCROLL,AccountConstants.IOSSCROLLUP,AccountPage.TermsAndConditionElement);
//			Assert.assertTrue(AccNectarcard.isDisplayed());
//			staticTextValidation(AccNectarcard,OffersContants.CARDNUM);
//		}
//	}

    @Then("^validate added nectar card \"([^\"]*)\" in the account$")
    public void validateAddedNectarCardInTheAccount(String NectarCardCredentials) {
        waitForElement(AccNectarcard, 20);
        if (platformName.equalsIgnoreCase("android")) {
            staticTextValidation(AccNectarcard, getTestDataValues(passwordclass_path, NectarCardCredentials)[3]);
        } else {
            ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, TermsAndConditionElement);
            Assert.assertTrue(AccNectarcard.isDisplayed());
            staticTextValidation(AccNectarcard, getTestDataValues(passwordclass_path, NectarCardCredentials)[3]);
        }
    }

    @And("^enter nectar card value \"([^\"]*)\" and tap on next button$")
    public void enterNectarCardValueAndTapOnNextButton(String NectarCardCredentials) {
        waitForElement(NectarEnter, 10);
        enterTextWithoutScroll(NectarEnter, getTestDataValues(passwordclass_path, NectarCardCredentials)[0]);
        hideMobileKeyboard();
        clickButtonWithOutScroll(NectarNxt);
    }

    @And("^user taps on cancel button in the Do you have a Nectar card screen$")
    public void userTapsOnCancelButtonInTheDoYouHaveANectarCardScreen() {
        waitForElement(CancelButtonDoYouHaveANectarCardScreen, 10);
        clickButtonWithOutScroll(CancelButtonDoYouHaveANectarCardScreen);
    }

    @Then("^the user validates the nectar card added successfully screen$")
    public void theUserValidatesTheNectarCardAddedSuccessfullyScreen() {
        waitForElement(NectarAddedSuccessfulTitle, 20);
        if (platformName.equalsIgnoreCase("android")) {
            Assert.assertTrue(isTextMatch(NectarAddedSuccessfulTitle.getText(), OffersContants.NECTARCARDADDEDSUCCESSFULLYTITLEANDROID));
            Assert.assertTrue(NectarAddedSuccessfullyScreenSubtitle.isDisplayed());
        } else {
            Assert.assertTrue(isTextMatch(NectarAddedSuccessfulTitle.getText(), OffersContants.NECTARCARDADDEDSUCCESSFULLYTITLEIOS));
            Assert.assertTrue(isTextMatch(NectarAddedSuccessfullyScreenSubtitle.getText(), OffersContants.NECTARCARDADDEDSUCCESSFULLYSUBTITLE));
        }
        Assert.assertTrue(isTextMatch(nectarCardContinueBtn.getText(), PayOutsideConstants.CONTINUEBUTTONSELECTYOURPUMP));
        Assert.assertTrue(NectarAddedSuccessfullyScreenImage.isEnabled());
    }

    @And("^user taps on Yes add now button from add nectar card screen$")
    public void userTapsOnYesAddNowButtonFromAddNectarCardScreen() {
        waitForElement(AddNowButton, 10);
        clickButtonWithOutScroll(AddNowButton);

    }

    @Then("user enters search term in station finder where the stations are not available")
    public void userEntersSearchTermInStationFinderWhereTheStationsAreNotAvailable() {
        waitFor(8000);
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(StationSearch, 15);
            enterTextWithoutScroll(StationSearch, "Butan");
//			waitFor(5000);
//			getCoordinates(StationSearch);
            waitFor(5000);
            androidTap();
            //driver.navigate().back();


        } else {
            if (isElementDisplayedWithoutAssert(StationAllow)) {
                clickButtonWithOutScroll(StationAllow);
            }
            if (isElementDisplayedWithoutAssert(DontallowCancel)) {
                clickButtonWithOutScroll(DontallowCancel);
            }
            enterTextWithoutScroll(StationSearch, "Porthgain");
            waitForElement(StationSelectCommon, 8);
            actionClick(StationSelectCommon);
        }
    }
}



