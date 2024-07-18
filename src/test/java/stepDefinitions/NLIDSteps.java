package stepDefinitions;

import contants.MenuConstants;
import contants.NLIDConstants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.NLIDPage;

public class NLIDSteps extends NLIDPage {
    @When("^user taps on Register screen$")
    public void user_taps_on_Register_screen() {
        waitForElement(registeranaccount_NLID, 20);
        clickButtonWithOutScroll(registeranaccount_NLID);
        waitForElement(registeration_First, 10);
    }

    @When("^Verify the Registration screen$")
    public void Verify_the_Registration_screen() {
        Assert.assertTrue(isTextMatch(registeration_First.getText(),
                NLIDConstants.REGISTRATIONSCREENTITLE));
    }

    @And("^user taps on Login button in NLID$")
    public void user_taps_on_login_button_in_nlid() {
        waitForElement(login_Button_Nlid, 20);
        clickButtonWithOutScroll(login_Button_Nlid);
    }

    @And("^User taps on Login button in Login screen without entering the values$")
    public void user_taps_on_login_button_in_login_screen_without_entering_the_values() {
        clickButtonWithOutScroll(AccountLoginBtn);

        if (isElementDisplayedWithoutAssert(NONEOFTHEABOVE)) {
            clickButtonWithOutScroll(NONEOFTHEABOVE);
        }

    }

    @Then("^Verify the inline error message during login$")
    public void verify_the_inline_error_message_during_login() {
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(NONEOFTHEABOVE)) {
            clickButtonWithOutScroll(NONEOFTHEABOVE);
        }
        Assert.assertTrue(isTextMatch(inline_Error_Email.getText(),
                NLIDConstants.INLINEERROREMAIL));
    }

    @And("^Enter valid mail and tap done$")
    public void enter_valid_mail_and_tap_done() {
        if (platformName.equalsIgnoreCase("iOS")) {
            enterTextWithoutScroll(AccountEmail, NLIDConstants.VALIDMAILLOGIN);
            clickButtonWithOutScroll(AccountLoginBtn);
        } else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(2000);
            if (isElementDisplayedWithoutAssert(NONEOFTHEABOVE)) {
                clickButtonWithOutScroll(NONEOFTHEABOVE);
            }
            enterTextWithoutScroll(AccountEmail, NLIDConstants.VALIDMAILID);
            clickButtonWithOutScroll(AccountLoginBtn);
        }
    }

    @Then("^Verify the inline error message for password$")
    public void verify_the_inline_error_message_for_password() {
        Assert.assertTrue(isTextMatch(inline_Error_Password.getText(),
                NLIDConstants.INLINEERRORPASSOWRD));
    }

    @And("^Enter the wrong password and tap login$")
    public void enter_the_wrong_password_and_tap_login() {
        enterTextWithoutScroll(AccountPassword, NLIDConstants.VALIDPASSWORDWRONG);
        waitForElement(AccountLoginBtn);
        waitFor(8000);
        clickButtonWithOutScroll(AccountLoginBtn);
        waitFor(8000);
        if (isElementDisplayedWithoutAssert(SavePasswordPopupAndroid)) {
            clickButtonWithOutScroll(SavePasswordPopupAndroid);
        }
    }

    @Then("^Verify the popup content$")
    public void verify_the_popup_content() throws Throwable {

        if (platformName.equalsIgnoreCase("iOS")) {
            waitFor(20000);
            Assert.assertTrue(isTextMatch(invalid_unpwd_popup.getText(),
                    NLIDConstants.LOGINPAGENOTIFICATIONPOPUP));
        } else {
            waitFor(20000);
            waitForElement(invalid_unpwd_popup);
            Assert.assertTrue(isTextMatch(invalid_unpwd_popup.getText(),
                    NLIDConstants.LOGINPAGENOTIFICATIONPOPUP));
        }
    }

    @Then("^user taps on Forgot password link in login screen in NLID$")
    public void user_taps_on_Forgot_password_link_in_login_screen_in_NLID() throws Throwable {
        clickButtonWithOutScroll(forgot_Password_Button);
    }

    @And("^user enters invalid email id$")
    public void user_enters_invalid_email_id() {
        waitForElement(invaild_Emailid_Section_Forgot_Password, 8);
        enterTextWithoutScroll(invaild_Emailid_Section_Forgot_Password, NLIDConstants.INVALIDEMAILID);
    }

    @And("^user taps on send button in Forgot Password Screen$")
    public void user_taps_on_send_button_in_Forgot_Password_screen() {
        clickButtonWithOutScroll(send_Button_Forgot_Password);
    }

    @Then("^Verify the inability to send the mail$")
    public void verify_the_inability_to_send_the_mail() {
        Assert.assertTrue(isTextMatch(inline_Error_Email_Password.getText(),
                NLIDConstants.INLINEERROREMAILPASSOWRD));
    }

    @And("^user taps on Cancel in the Login Screen$")
    public void user_taps_on_cancel_in_the_login_screen() {
        waitForElement(cancel_Button_Forgot_Password, 5);
        clickButtonWithOutScroll(cancel_Button_Forgot_Password);
    }

    @And("^User enters valid email id and taps send button$")
    public void user_enters_valid_email_id_and_taps_send_button() {
        enterTextWithoutClick(vaild_Emailid_Section_Forgot_Password, NLIDConstants.VALIDMAILLOGIN);
        clickButtonWithOutScroll(send_Button_Forgot_Password);
    }

    @Then("^Verify the mail is sent$")
    public void verify_the_mail_is_sent() throws Throwable {
        waitForElement(OkButtonWrongContentPopup, 20);
        Assert.assertTrue(isTextMatch(email_Sent_popup.getText(),
                NLIDConstants.EMAILSENTPOPUPSUBTITLE));
    }

    @And("^user taps on Twitter icon in the NLID$")
    public void user_taps_on_twitter_icon_in_the_nlid() {
        waitForElement(esso_Twitter_Button_Nlid, 30);
        clickButtonWithOutScroll(esso_Twitter_Button_Nlid);
    }

    @Then("^user verifies whether the app navigated to Twitter login screen$")
    public void user_verifies_whether_the_app_navigated_to_twitter_login_screen() throws Throwable {
        waitForElement(esso_Twitter_Screen_Content, 30);
        isElementEnabled(esso_Twitter_Screen_Content);

    }

    @And("^user navigates back to NLID from Twitter$")
    public void user_navigates_back_to_nlid_from_twitter() {
        if (platformName.equalsIgnoreCase("iOS")) {
            clickButtonWithOutScroll(esso_SSO_Back_Button);
        } else if (platformName.equalsIgnoreCase("Android")) {
            androidBack();
        }
    }

    @And("^user taps on Facebook icon in the NLID$")
    public void user_taps_on_facebook_icon_in_the_nlid() {
        isElementEnabled(esso_Facebook_Button_Nlid);
        clickButtonWithOutScroll(esso_Facebook_Button_Nlid);
    }

    @Then("^user verifies whether the app navigated to Facebook login screen$")
    public void user_verifies_whether_the_app_navigated_to_facebook_login_screen() throws Throwable {

        if (platformName.equalsIgnoreCase("iOS")) {
            waitForElement(esso_Facebook_Screen_Content, 10);
            Assert.assertTrue(isTextMatch(esso_Facebook_Screen_Content.getText(),
                    NLIDConstants.ESSOTFACEBOOKPAGE));
        } else if (platformName.equalsIgnoreCase("Android")) {
            waitFor(3000);
            isElementEnabled(esso_Facebook_Screen_Content);
        }
    }

    @And("^user navigates back to NLID from Facebook$")
    public void user_navigates_back_to_nlid_from_facebook() {
        if (platformName.equalsIgnoreCase("iOS")) {
            clickButtonWithOutScroll(esso_SSO_Back_Button);
        } else if (platformName.equalsIgnoreCase("Android")) {
//                isElementEnabled(esso_back_fb_button);
//                clickButtonWithOutScroll(esso_back_fb_button);
            waitFor(3000);
            androidBack();
        }
    }

    @And("^user taps on Linkedin icon in the NLID$")
    public void user_taps_on_linkedin_icon_in_the_nlid() {
        isElementEnabled(esso_Linkedin_Button_Nlid);
        for (int i = 0; i <= 3; i++) {
            clickButtonWithOutScroll(esso_Linkedin_Button_Nlid);
            waitFor(3000);
            if (!isElementDisplayedWithoutAssert(esso_Linkedin_Button_Nlid))
                return;
        }
    }

    @And("^user taps on \"([^\"]*)\" icon in the NLID$")
    public void user_taps_on_sso_icon_in_the_nlid(String userType) {
        waitForElement(SsoMoreButtonNlidBelowRegister, 30);
        clickButtonWithOutScroll(SsoMoreButtonNlidBelowRegister);
        WebElement element = null;
        waitFor(5000);
        if (userType.equalsIgnoreCase("linkedin")) {
            element = esso_Linkedin_Button_Nlid;
        } else if (userType.equalsIgnoreCase("twitter")) {
            element = esso_Twitter_Button_Nlid;
        } else if (userType.equalsIgnoreCase("facebook")) {
            element = esso_Facebook_Button_Nlid;
        } else if (userType.equalsIgnoreCase("google")) {
            element = esso_Google_Button_Nlid;
        } else if (userType.equalsIgnoreCase("apple")) {
            element = esso_Apple_Button_Nlid;
        }
        isElementEnabled(element);
        clickButtonWithRetry(element);
    }

    @Then("^user verifies whether the app navigated to Linkedin login screen$")
    public void user_verifies_whether_the_app_navigated_to_linkedin_login_screen() throws Throwable {
        waitForElement(esso_Linkedin_Screen_Content, 10);
        if (platformName.equalsIgnoreCase("iOS")) {
            Assert.assertTrue(isTextMatch(esso_Linkedin_Screen_Content.getText(), NLIDConstants.ESSOLINKEDINPAGE));
        } else if (platformName.equalsIgnoreCase("Android")) {
            Assert.assertTrue(isTextMatch(esso_Linkedin_Screen_Content.getText(),
                    NLIDConstants.LINKEDINSCREEN));
        }
    }

    @And("^user navigates back to NLID from Linkedin$")
    public void user_navigates_back_to_nlid_from_linkedin() {
        if (platformName.equalsIgnoreCase("iOS")) {
            clickButtonWithOutScroll(esso_SSO_Back_Button);
        } else if (platformName.equalsIgnoreCase("Android")) {
            androidBack();
            waitFor(2000);
        }
    }

    @Then("^user taps on back button to navigate to login screen$")
    public void user_taps_on_back_button_to_navigate_to_login_screen() throws Throwable {

        androidBack();
    }

//    @And("^user enters valid mail id$")
//    public void user_enters_valid_mail_id() throws Throwable {
//
//        enterTextWithoutScroll(email_Valid_Login, NLIDConstants.VALIDMAILLOGIN);
//    }

//    @And("^user enters valid mail id and password$")
//    public void user_enters_valid_mail_id_and_password() throws Throwable {
//
//        enterTextWithoutScroll(email_Valid_Login, NLIDConstants.VALIDMAILLOGIN);
//        enterTextWithoutScroll(email_Valid_Password_Wrong, NLIDConstants.VALIDPASS);
//    }

    @And("^user navigated to More Screen$")
    public void user_navigated_to_more_screen() throws Throwable {

        waitFor(1000);
        androidBack();
    }

    @And("^clicks on ok button in the popup content$")
    public void clicksOnOkButtonInThePopupContent() {
        waitForElement(OkButtonWrongContentPopup);
        clickButtonWithOutScroll(OkButtonWrongContentPopup);
    }

    @Then("^user verifies Start button in the LID$")
    public void userVerifiesStartButtonInTheLID() {
        waitForElement(StartButtonLID);
        isElementEnabled(StartButtonLID);
//        Assert.assertTrue(isElementEnabled(StartButtonLID));
    }

    @And("^user verifies the Youtube links$")
    public void userVerifiesTheYoutubeLinks() {
//        ScrollTo(MenuConstants.FD_Help_Youtube_howtouseFFApp, "up", MenuPage.FDHelp_Youtube_howtouseFFApp);
        if (isElementDisplayedWithoutAssert(FDHelp_Youtube_howtouseFFApp)) {
            isElementDisplayed(FDHelp_Youtube_howtouseFFApp);
        } else {
            ScrollTo(MenuConstants.FD_Help_Youtube_howtouseFFApp, "down", FDHelp_Youtube_howtouseFFApp);
        }
        Assert.assertTrue(isTextMatch(FDYoutube_link.getText(), MenuConstants.Youtube_link));
        Assert.assertTrue(isTextMatch(FDHelp_Youtube_howtosetupFFApp.getText(), MenuConstants.FD_Help_Youtube_howtosetupFFApp));
        Assert.assertTrue(isTextMatch(FDHelp_Youtube_howtouseFFApp.getText(), MenuConstants.FD_Help_Youtube_howtouseFFApp));
    }

    @And("^user verifies the Version in the help screen$")
    public void userVerifiesTheVersionInTheHelpScreen() {
        Assert.assertTrue(isElementEnabled(VersionHelp));
    }

    @And("^user enters invalid email id in the Login screen$")
    public void userEntersInvalidEmailIdInTheLoginScreen() {
        waitForElement(AccountEmail, 8);
        enterTextWithoutScroll(AccountEmail, NLIDConstants.INVALIDEMAILID);
    }

    @And("^User enters the \"([^\"]*)\" valid mail id and taps send button$")
    public void userEntersTheValidMailIdAndTapsSendButton(String userType) throws Throwable {
        waitForElement(vaild_Emailid_Section_Forgot_Password, 25);
        enterTextWithoutScroll(vaild_Emailid_Section_Forgot_Password, getTestDataValues(loginclass_path, userType)[0]);
        clickButtonWithOutScroll(send_Button_Forgot_Password);
    }

    @Then("verify user navigates back to Login screen")
    public void user_back_to_login() {

        webDriverWait().until(ExpectedConditions.visibilityOf(forgot_Password_Button));
        Assert.assertTrue(forgot_Password_Button.isDisplayed());
    }

    @And("^user tabs on back button in the Forgot Password screen$")
    public void userTabsOnBackButtonInTheForgotPasswordScreen() {
        waitForElement(CompleteYourProfielBack, 10);
        clickButtonWithOutScroll(CompleteYourProfielBack);
    }

    @Then("^user verifies the Functional and Analytics options are disabled$")
    public void userVerifiesTheFunctionalAndAnalyticsOptionsAreDisabled() {
        waitForElement(AnalyticsData);
        Assert.assertFalse(AnalyticsData.isSelected());
        waitForElement(FunctionalData);
        Assert.assertFalse(FunctionalData.isSelected());
    }

    @Then("^user validates the SSO logos in the modal popup in the nlid$")
    public void userValidatesTheSSOLogosInTheModalPopupInTheNlid() {
        waitForElement(esso_Linkedin_Button_Nlid, 15);
        Assert.assertTrue(esso_Linkedin_Button_Nlid.isDisplayed());
//        Assert.assertTrue(esso_Twitter_Button_Nlid.isDisplayed());
        Assert.assertTrue(esso_Facebook_Button_Nlid.isDisplayed());
        Assert.assertTrue(esso_Google_Button_Nlid.isDisplayed());
    }

    @When("^the user taps on the close button in the modal popup$")
    public void theUserTapsOnTheCloseButtonInTheModalPopup() {
        waitForElement(closeButtonSsoModalPopup, 15);
        clickButtonWithOutScroll(closeButtonSsoModalPopup);
    }

    @Then("^user validates SSO logos and three dots in the NLID$")
    public void userValidatesSSOLogosAndThreeDotsInTheNLID() {
        waitForElement(SsoMoreButtonNlidBelowRegister, 15);
        Assert.assertTrue(SsoMoreButtonNlidBelowRegister.isDisplayed());
        Assert.assertTrue(SsoAppleButtonNlidBelowRegister.isDisplayed());
        Assert.assertTrue(SsoGoogleButtonNlidBelowRegister.isDisplayed());
        Assert.assertTrue(esso_Linkedin_Button_Nlid_Below_Register.isEmpty());
        Assert.assertTrue(esso_Twitter_Button_Nlid_Below_Register.isEmpty());
    }

    @And("^user taps on the three dots in the NLID$")
    public void userTapsOnTheThreeDotsInTheNLID() {
        waitForElement(SsoMoreButtonNlidBelowRegister, 15);
        clickButtonWithOutScroll(SsoMoreButtonNlidBelowRegister);
    }

    @When("^user verifies the broadcast banner$")
    public void userVerifiesTheBroadcastBanner() {
        if (isElementDisplayedWithoutAssert(BoardBannerTitle)) {
            Assert.assertTrue(isElementDisplayed(BoardBannerTitle));
            Assert.assertTrue(isElementDisplayed(BoardBannerSubTitle));
            //Assert.assertTrue(isElementDisplayed(BoardBannerOk));
        }
    }

    @Then("^user confirms the banner board is not present$")
    public void userConfirmsTheBannerBoardIsNotPresent() {
        waitFor(5000);
        Assert.assertTrue(BoardBannerTitleList.isEmpty());
        Assert.assertTrue(BoardBannerSubTitleList.isEmpty());
        Assert.assertTrue(BoardBannerOkList.isEmpty());
    }

    @Then("^verify the password screen text$")
    public void verifyThePasswordScreenText() {
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(forgot_password_text, 15);
            staticTextValidation(forgot_password_text.getText(), NLIDConstants.FORGOTPASSWORDTEXTANDROID);
        } else {
            waitForElement(forgot_password_text, 15);
            staticTextValidation(forgot_password_text.getText(), NLIDConstants.FORGOTPASSWORDTEXT);
        }
    }

    @And("User looks for Esso App Feedback option")
    public void userLooksForEssoAppFeedbackOption() {
        for (WebElement menus : MoreMenus) {
            String menuName = menus.getText();
            Assert.assertFalse(menuName.contains(NLIDConstants.ESSOAPPFEEDBACK));
        }
    }

    @And("User validates modal popup title")
    public void userValidatesModalPopupTitle() {
        waitForElement(SsoModalPopupTitle);
        Assert.assertEquals("Wrong modal popup", SsoModalPopupTitle.getText(), NLIDConstants.SSOMODALPOPUPTITLE);
    }

    @Then("Check for Esso logo on NLID")
    public void checkForEssoLogoOnNLID() {
        Assert.assertTrue(isElementDisplayed(EssoLogoNlid));
    }

    @Then("User should not see App assistant")
    public void userShouldNotSeeAppAssistant() {
        Assert.assertTrue(isElementDisplayed(AppAssistant));
    }
}