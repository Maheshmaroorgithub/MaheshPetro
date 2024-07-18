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
import io.appium.java_client.AppiumDriver;


public class ContextualRegistrationSteps extends ContextualRegistrationPage {
    AccountSteps AccountSteps = new AccountSteps();
    FrictionlessFlowSteps FrictionlessFlowSteps = new FrictionlessFlowSteps();

    public void logOutMethod() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementDisplayedWithoutAssert(WhatsNew)) {
                clickButtonWithOutScroll(WhatsNewSkip);
            }
        }
        waitForElement(AccountMore, 60);
        clickButtonWithRetry(AccountMore);
        waitForElement(AccountBtn, 20);
        clickButtonWithOutScroll(AccountBtn);
        waitForElement(PasswordEdit, 25);

        if ("Android".equalsIgnoreCase(platformName)) {
            ScrollTo("Log Out", AccountConstants.IOSSCROLLUP, LogOut);

        } else {
            try {
                ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
            } catch (Exception e) {
                ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
            }
        }
        clickButtonWithOutScroll(LogOut);
        waitForElement(DashRegstr, 25);
    }

    @Given("^user is on NLID screen$")
    public void user_is_on_nlid_screen() throws Throwable {

        clickButtonWithOutScroll(CameraAccessOkPopup, false);

        clickButtonWithOutScroll(FaceIdAccessOkPopup, false);

        clickButtonWithOutScroll(InAppRatingPopupNotNow, false);

        clickButtonWithOutScroll(AcceptAll, false);

        if (isElementDisplayedWithoutAssert(payButton1)) {
            System.out.println("Start Button is Present");
        } else if (isElementDisplayedWithoutAssert(WelcomTtl)) {
            AccountSteps.user_taps_on_SKIP_button();
        } else if (isElementDisplayedWithoutAssert(SetUpPinTextRegistration)) {
            FrictionlessFlowSteps.userEntersFourDigitPINInTheSetUpPINScreenInRegistrationFlow();
            FrictionlessFlowSteps.userTapOnContinueButtonInSetUpPINScreenInRegistrationFlow();
            if (isElementDisplayedWithoutAssert(okBtn)) {
                clickButtonWithOutScroll(okBtn);
            }
            if (platformName.equalsIgnoreCase("Android")) {
                clickButtonWithOutScroll(ReviewAccept);
            }
        } else if (isElementDisplayedWithoutAssert(ReviewAccept)) {
            clickButtonWithOutScroll(ReviewAccept);
            user_is_on_nlid_screen();
        } else if (isElementDisplayedWithoutAssert(WhatsNew)) {
            clickButtonWithOutScroll(WhatsNewSkip);
            user_is_on_nlid_screen();
        } else if (isElementDisplayedWithoutAssert(VerifyEmail)) {
            clickButtonWithOutScroll(VerifyEmail);
            user_is_on_nlid_screen();
        } else if (isElementDisplayedWithoutAssert(LidTitleCardExpiry)) {
            clickButtonWithOutScroll(LidOkButtonCardExpiry);
            user_is_on_nlid_screen();
        } else if (isElementDisplayedWithoutAssert(acceptAllButtonAppLaunch)) {
            clickButtonWithOutScroll(acceptAllButtonAppLaunch);
            AccountSteps.user_taps_on_SKIP_button();
        } else if (isElementDisplayedWithoutAssert(NONEOFTHEABOVE)) {
            clickButtonWithOutScroll(NONEOFTHEABOVE);
            user_is_on_nlid_screen();
        } else if (isElementEnabled(CloseButtonModalPopupLid1)) {
            clickButtonWithOutScroll(CloseButtonModalPopupLid1);
            user_is_on_nlid_screen();
        }
    }

    @When("^user taps on register button from Login screen$")
    public void user_taps_on_register_button_from_login_screen() throws Throwable {
        waitForElement(DashRegstr, 45);
        clickButtonWithOutScroll(DashRegstr);
    }

    @Then("^user should be navigated to Manual Register screen$")
    public void user_should_be_navigated_to_manual_register_screen() throws Throwable {
        waitForElement(register_title, 5);
        staticTextValidation(register_title, ContextualRegistrationConstants.REGISTERHEADER);
//			Assert.assertTrue(RegstrTtl.getText().contains(ContextualRegistrationConstants.REGISTERTTL));
    }

    @Then("^enter First Name$")
    public void enter_first_name() throws Throwable {
        webDriverWaitForElement(10).until(ExpectedConditions.elementToBeClickable(RegstrFirstName));
        enterTextWithoutClick(RegstrFirstName, ContextualRegistrationConstants.REGISTERFNAME);
    }

    @Then("^enter Last Name$")
    public void enter_last_name() throws Throwable {
        waitForElement(RegstrLastName, 4);
        waitElementToBeClickable(RegstrLastName);
        enterTextWithoutClick(RegstrLastName, ContextualRegistrationConstants.REGISTERLNAME);
    }

    @Then("^enter \"([^\"]*)\" Email address$")
    public void enter_something_email_address(String arg1) throws Throwable {
        enterTextWithoutClick(RegstrEmail, arg1 + getSaltNumber()
                + ContextualRegistrationConstants.REGISTEREMAILDOM);
    }

    @When("^user enter \"([^\"]*)\" in login details$")
    public void userEnterInLoginDetails(String arg0) throws Throwable {
        enterTextWithoutClick(RegstrEmail, arg0 + getSaltNumber()
                + ContextualRegistrationConstants.REGISTEREMAILDOM);
        enterTextWithoutClick(RegstrPass, ContextualRegistrationConstants.REGISTERPASS);

    }

    @Then("^user enters Current password$")
    public void user_enters_current_password() throws Throwable {
        enterTextWithoutScroll(CurrentPassword, ContextualRegistrationConstants.REGISTERPASS);
    }

    @Then("^enter password$")
    public void enter_password() throws Throwable {
        hideMobileKeyboard();
        waitForElement(RegstrPass, 10);
        enterTextWithoutClick(RegstrPass, ContextualRegistrationConstants.REGISTERPASS);
    }

    @Then("^confirm password$")
    public void confirm_password() throws Throwable {
        hideMobileKeyboard();
        enterTextWithoutClick(RegstrConfPass, ContextualRegistrationConstants.REGISTERCONFPASS);
    }

    @Then("^enter First Name ASCII key$")
    public void enter_first_name_ascii_key() throws Throwable {
        enterTextWithoutClick(RegstrFirstName, ContextualRegistrationConstants.ASCIIkEY);
    }

    @Then("^enter Last Name ASCII key$")
    public void enter_last_name_ascii_key() throws Throwable {
        enterTextWithoutClick(RegstrLastName, ContextualRegistrationConstants.ASCIIkEY);
    }

    @Then("^enter password ASCII key$")
    public void enter_password_ascii_key() throws Throwable {
        enterTextWithoutClick(RegstrPass, ContextualRegistrationConstants.ASCIIkEY);
    }

    @And("^enter a random password in the confirm password ASCII key field$")
    public void enter_a_random_password_in_the_confirm_password_ascii_key_field() throws Throwable {
        hideMobileKeyboard();
        enterTextWithoutClick(RegstrConfPass, ContextualRegistrationConstants.ASCIIkEY);
    }

    @Then("^click the check box for accept$")
    public void click_the_check_box_for_accept() throws Throwable {
        hideMobileKeyboard();
        clickButtonWithOutScroll(RegstrTermsCkbx);
    }

    @When("^click on continue button from register screen$")
    public void click_on_continue_button_from_register_screen() throws Throwable {
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(HideKeyPadMobileRegistration)) {
            hideMobileKeyboard();
        }
        clickButtonWithOutScroll(RegstrContinue);
        waitFor(20000);
        if (isElementDisplayedWithoutAssert(LoginSave)) {
            clickButtonWithOutScroll(LoginSave);
        }
    }

    @Then("^App should navigates to Confirm your email address screen$")
    public void app_should_navigates_to_confirm_your_email_address_screen() throws Throwable {
        waitForElement(CntxtRegTtl, 30);
        staticTextValidation(Contextual_register_title, ContextualRegistrationConstants.CONTXTREGHEAD);
        staticTextValidation(CntxtRegTtl, ContextualRegistrationConstants.CONTXTREGTTL);
    }

    @Then("^user should see details in contextual registration screen$")
    public void user_should_see_details_in_contextual_registration_screen() throws Throwable {
        staticTextValidation(CntxtRegTtl, ContextualRegistrationConstants.CONTXTREGTTL);
        staticTextValidation(CntxtRegSubTtl, ContextualRegistrationConstants.CONTXTREGSUBTTL);
        staticTextValidation(CntxtRegResendEmailLink, ContextualRegistrationConstants.CONTXTREGRESNDLNK);
        staticTextValidation(CntxtRegOpenInbox, ContextualRegistrationConstants.CONTXTREGOPENINBX);
//		if (platformName.equalsIgnoreCase("Android")) {
//			isElementDisplayed(CntxtRegIcon);
//		}
        staticTextValidation(AccountSkip, ContextualRegistrationConstants.CONTXTREGSKIP);
    }

    @Then("^user tap on open inbox$")
    public void user_tap_on_open_inbox() throws Throwable {
        clickButtonWithOutScroll(CntxtRegOpenInbox);
    }

    @Then("^see the list of apps installed in device$")
    public void see_the_list_of_apps_installed_in_device() throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(CntxtRegAPP, ContextualRegistrationConstants.CONTXTREGAPP);
        } else {
            staticTextValidation(CntxtRegAPP, ContextualRegistrationConstants.CONTXTREGAPPCANCELIOS);
        }
    }

    @Then("^tap on cancel button from email apps$")
    public void tap_on_cancel_button_from_email_apps() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            androidBack();
        } else {
            clickButtonWithOutScroll(CntxtRegAPP);
        }
    }

    @When("^user tap on Resend confirmation email link$")
    public void user_tap_on_resend_confirmation_email_link() throws Throwable {
        clickButtonWithOutScroll(CntxtRegResendEmailLink);
    }

    @Then("^the system should display the confirmation popup$")
    public void the_system_should_display_the_confirmation_popup() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(PopUpOK, 10);
            Assert.assertTrue(isTextMatch(PopUpMessage.getText(), ContextualRegistrationConstants.CONTXTREGRESNDMSG));
        }
//		staticTextValidation(PopUpMessage, ContextualRegistrationConstants.CONTXTREGRESNDMSG);
        else {
            waitForElement(PopUpMessage, 12);
//		Assert.assertTrue(isTextMatch(PopUpMessage.getText(),ContextualRegistrationConstants.CONTXTREGRESNDMSG));
            Assert.assertTrue(isElementDisplayed(PopUpMessage));
        }
    }

    @Then("^app to dismiss the popup when the user taps on OK button$")
    public void app_to_dismiss_the_popup_when_the_user_taps_on_ok_button() throws Throwable {
        clickButtonWithOutScroll(PopUpOK);

    }

    @When("^user tap on Skip button$")
    public void user_tap_on_skip_button() throws Throwable {
        waitForElement(AccountSkip, 30);
        clickButtonWithOutScroll(AccountSkip);
    }

    @Then("^the system should display Skip warning popup$")
    public void the_system_should_display_skip_warning_popup() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(MessageTTL, ContextualRegistrationConstants.CONTXTREGSKIPTTL);
            staticTextValidation(PopUpMessage, ContextualRegistrationConstants.CONTXTREGSKIPMSG);
            isElementDisplayed(SkipAnyway);
            isElementDisplayed(VerifyEmail);
        } else {
            waitForElement(MessageTTL, 3);
//			staticTextValidation(MessageTTL, ContextualRegistrationConstants.CONTXTREGSKIPTTL);
            Assert.assertTrue(isTextMatch(MessageTTL.getText(), ContextualRegistrationConstants.CONTXTREGSKIPTTL));
            Assert.assertTrue(isTextMatch(PopUpMessageContextual.getText(), ContextualRegistrationConstants.CONTXTREGSKIPMSG));
//			staticTextValidation(PopUpMessageContextual, ContextualRegistrationConstants.CONTXTREGSKIPMSG);
            isElementDisplayed(SkipAnyway);
            isElementDisplayed(VerifyEmail);
        }

    }

    @When("^user tap on Skip anyway$")
    public void user_tap_on_skip_anyway() throws Throwable {
        waitForElement(SkipAnyway, 10);
        clickButtonWithOutScroll(SkipAnyway);
    }

    @Then("^app to dismiss the popup and navigate the user to LID after review$")
    public void app_to_dismiss_the_popup_and_navigate_the_user_to_lid_after_review() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(ReviewAccept, 30);
            clickButtonWithOutScroll(ReviewAccept);
            waitFor(4000);
            try {
                if (ReviewAccept.isDisplayed()) {
                    clickButtonWithOutScroll(ReviewAccept);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            waitForElement(LID, 30);
            Assert.assertTrue(isElementDisplayed(LID));
        }
    }

    @When("^user tap on verify email$")
    public void user_tap_on_verify_email() throws Throwable {
        clickButtonWithOutScroll(VerifyEmail);
    }

    @Then("^App should not navigate user to add payment method or maximum fueling screen$")
    public void app_should_not_navigate_user_to_add_payment_method_or_maximum_fueling_screen() throws Throwable {
        staticTextNotSame(FirstFuelheader, ContextualRegistrationConstants.PAYMENTTTL);
    }

    @When("^user minimize and relaunch the app$")
    public void user_minimize_and_relaunch_the_app() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            androidBackgroundandLaunch();
        } else {
            backgroundiOSApp();
        }
    }

    @When("^user kill and relaunch the app$")
    public void user_kill_and_relaunch_the_app() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            initiateNativeAPP();
            waitFor(10000);
        } else {
            initiateNativeAPP();
//			closeIOSApp();
//			launchiOSApp();
        }
    }


    @Given("^user log out from the app if logged in$")
    public void userLogOutFromTheAppIfLoggedIn() throws Throwable {
        waitFor(20000);
        clickButtonWithOutScroll(CameraAccessOkPopup, false);

        clickButtonWithOutScroll(FaceIdAccessOkPopup, false);

        clickButtonWithOutScroll(InAppRatingPopupNotNow, false);

        clickButtonWithOutScroll(AcceptAll, false);

        if (isElementDisplayedWithoutAssert(DashRegstr)) {
            System.out.println("Register button is Present");
        } else if (isElementDisplayedWithoutAssert(PinLogoutButton)) {
            clickButtonWithOutScroll(PinLogoutButton);
        } else if (isElementDisplayedWithoutAssert(LID)) {
            logOutMethod();
        } else if (isElementDisplayedWithoutAssert(WelcomTtl)) {
            AccountSteps.user_taps_on_SKIP_button();
        } else if (isElementDisplayedWithoutAssert(ReviewAccept)) {
            clickButtonWithOutScroll(ReviewAccept);
            logOutMethod();
        } else if (isElementDisplayedWithoutAssert(WhatsNew)) {
            clickButtonWithOutScroll(WhatsNewSkip);
            logOutMethod();
        } else if (isElementDisplayedWithoutAssert(PrfcmpltLID)) {
            logOutMethod();
        } else if (isElementDisplayedWithoutAssert(LIDNectar)) {
            logOutMethod();
        } else if (isElementDisplayedWithoutAssert(VerifyEmail)) {
            clickButtonWithOutScroll(VerifyEmail);
        } else if (isElementDisplayedWithoutAssert(LidTitleCardExpiry)) {
            clickButtonWithOutScroll(LidOkButtonCardExpiry);
        } else if (isElementDisplayedWithoutAssert(acceptAllButtonAppLaunch)) {
            waitForElement(acceptAllButtonAppLaunch, 20);
            clickButtonWithOutScroll(acceptAllButtonAppLaunch);
            AccountSteps.user_taps_on_SKIP_button();
        } else if (isElementDisplayedWithoutAssert(NONEOFTHEABOVE)) {
            clickButtonWithOutScroll(NONEOFTHEABOVE);
        } else if (isElementEnabled(CloseButtonModalPopupLid)) {
            clickButtonWithOutScroll(CloseButtonModalPopupLid);
            logOutMethod();
        } else {
            logOutMethod();
        }
    }

    @And("^user enters a password with less than 8 characters$")
    public void user_enters_a_password_with_less_than_8_characters() {
        enterTextWithoutScroll(RegstrPass, ManualRegistrationConstants.PWDLESSTHANEIGHTCHARACTERS);
    }

    @And("^user enters a password with only upper case more than 8 characters$")
    public void user_enters_a_password_with_only_upper_case_more_than_8_characters() throws Throwable {
        enterTextWithoutScroll(RegstrPass, ManualRegistrationConstants.PWDMORETHANEIGHTUPPERCHARACTERS);
    }

    @And("^user enters a password with only lower case$")
    public void user_enters_a_password_with_only_lower_case() throws Throwable {
        enterTextWithoutScroll(RegstrPass, ManualRegistrationConstants.PWDMORETHANEIGHTLOWERCHARACTERS);
    }

    @And("^user enters the already registered mail address$")
    public void user_enters_the_already_registered_mail_address() throws Throwable {
        enterTextWithoutClick(RegstrEmail, ManualRegistrationConstants.ALREADYREGISTEREDMAILID);
    }

    @And("^user enters the wrong mail format in the Register screen$")
    public void user_enters_the_wrong_mail_format_in_the_register_screen() throws Throwable {
        enterTextWithoutClick(RegstrEmail, ManualRegistrationConstants.WRONGMMAILIDFORMAT);
    }

    @And("^user verifies the first name checkbox$")
    public void user_verifies_the_first_name_checkbox() throws Throwable {
        waitForElement(RegstrFirstName, 5);
        Assert.assertTrue(
                isTextMatch(RegstrFirstName.getText(), ManualRegistrationConstants.FNCHECKBOXREGISTRATION));
    }

    @And("^user verifies the last name checkbox$")
    public void user_verifies_the_last_name_checkbox() throws Throwable {
        Assert.assertTrue(
                isTextMatch(RegstrLastName.getText(), ManualRegistrationConstants.LNCHECKBOXREGISTRATION));
    }

    @And("^user verifies the email checkbox$")
    public void user_verifies_the_email_checkbox() throws Throwable {
        Assert.assertTrue(
                isTextMatch(RegstrEmail.getText(), ManualRegistrationConstants.EMAILCHECKBOXREGISTRATION));
    }

    @And("^user verifies the Mobile number Textbox$")
    public void user_verifies_the_mobile_number_textbox() throws Throwable {
        Assert.assertTrue(
                isTextMatch(RegstrMobile.getText(), ManualRegistrationConstants.MOBILECHECKBOXREGISTRATION));
    }

    @Then("^user verifies the checkboxes$")
    public void user_verifies_the_checkboxes() throws Throwable {
        hideMobileKeyboard();
        Assert.assertTrue(isElementDisplayed(RegstrTermsCkbx));
        Assert.assertTrue(isElementDisplayed(MailsCheckboxRegisterNoBiometrics));
    }

    @Then("^user selects the receive mails checkbox$")
    public void userSelectsTheReceiveMailsCheckbox() {
        clickButtonWithOutScroll(MailsCheckboxRegisterNoBiometrics);
    }

    @And("^user enters the \"([^\"]*)\" already registered mail address$")
    public void userEntersTheAlreadyRegisteredMailAddress(String userType) throws Throwable {
        enterTextWithoutClick(RegstrEmail, getTestDataValues(loginclass_path, userType)[0]);
    }
}
