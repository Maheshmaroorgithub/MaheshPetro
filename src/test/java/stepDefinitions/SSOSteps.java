package stepDefinitions;

import contants.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;
import io.cucumber.datatable.DataTable;
import io.appium.java_client.AppiumDriver;

public class SSOSteps extends SSOPage {

    @When("^I enter SSO login details for \"([^\"]*)\"$")
    public void i_enter_sso_login_details_for_something(String userType) throws Throwable {

        if(userType.toLowerCase().contains("linkedin")) {
            waitFor(5000);
            if (isElementEnabled(LinkedInAllowBtnLogin)) {
                clickButtonWithOutScroll(LinkedInAllowBtnLogin);
            } else {
                waitForElement(LinkedInUsername,10);
                switchToWebAppContext(((AppiumDriver) driver));
                waitElementToBeClickable(LinkedInUsername);
                clickButtonWithOutScroll(LinkedInUsername);
                waitFor(10000);
                enterTextWithoutScroll(LinkedInUsername, getTestDataValues(loginclass_path, userType)[0]);
                hideMobileKeyboard();
                waitForElement(LinkedInPassWord,15);
                enterTextWithoutScroll(LinkedInPassWord, getTestDataValues(loginclass_path, userType)[1]);
                hideMobileKeyboard();
                clickButtonWithOutScroll(SSOsignin);
                waitFor(5000);
                if (isElementEnabled(LinkedInAllowBtnLogin)) {
                    clickButtonWithOutScroll(LinkedInAllowBtnLogin);
                }
            }

            waitFor(9000);
            if (isElementEnabled(NotNowButtonLID)) {
                clickButtonWithOutScroll(NotNowButtonLID);
            }
            if (isElementDisplayedWithoutAssert(ReinstallPopupOk)) {
                clickButtonWithOutScroll(ReinstallPopupOk);
            }
            if (isElementEnabled(CloseButtonModalPopupLid)) {
                clickButtonWithOutScroll(CloseButtonModalPopupLid);
            }
        } else if (userType.toLowerCase().contains("facebook")) {
            waitFor(5000);
            if (isElementEnabled(ContinueButtonFbAlreadyLoggedIn)) {
                clickButtonWithOutScroll(ContinueButtonFbAlreadyLoggedIn);
            } else if (isElementDisplayedWithoutAssert(payButton)) {
                System.out.println("THE APP IS IN LOGGED IN STATE");
            } else if (isElementDisplayedWithoutAssert(SsoPrivacyPolicyCheckbox)) {
                System.out.println("THE APP NAVIGATED TO THE REGISTRATION SCREEN WITH TERMS AND CONDITIONS");
            } else if (isElementDisplayedWithoutAssert(SsoGoogleSmartLockCancel)) {
                clickButtonWithOutScroll(SsoGoogleSmartLockCancel);
            } else {
                waitForElement(FbUserName, 20);

//                FbUserName.click();
//                Actions act= new Actions(driver);
//                act.sendKeys(getTestDataValues(loginclass_path, userType)[0]).perform();

                enterTextWithoutScroll(FbUserName, getTestDataValues(loginclass_path, userType)[0]);
                hideMobileKeyboard();

//                FbPassword.click();
//                act.sendKeys(getTestDataValues(loginclass_path, userType)[1]).perform();
                enterTextWithoutScroll(FbPassword, getTestDataValues(loginclass_path, userType)[1]);

                hideMobileKeyboard();
                clickButtonWithOutScroll(FBLogin);
                try {
                    webDriverWaitForElement(15).until(ExpectedConditions.visibilityOf(fbContinueBtn)).click();
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
            waitFor(8000);
//            if (isElementEnabled(FbSavePassword)) {
//                clickButtonWithOutScroll(FbSavePassword);
//            }
            if (isElementEnabled(NotNowButtonLID)) {
                clickButtonWithOutScroll(NotNowButtonLID);
            }
            if (isElementEnabled(ReinstallPopupOk)) {
                clickButtonWithOutScroll(ReinstallPopupOk);
            }
            if (isElementEnabled(CloseButtonModalPopupLid)) {
                clickButtonWithOutScroll(CloseButtonModalPopupLid);
            }
        } else if (userType.toLowerCase().contains("twitter")) {
            waitFor(15000);
            if (isElementDisplayedWithoutAssert(TwitterUserName)) {
                enterTextWithoutScroll(TwitterUserName, getTestDataValues(loginclass_path, userType)[0]);
                hideMobileKeyboard();
                enterTextWithoutScroll(TwitterPwd, getTestDataValues(loginclass_path, userType)[1]);
                hideMobileKeyboard();
                clickButtonWithOutScroll(SSOTwittersignin);
            } else if (TwitterUserNameList.isEmpty()) {
                clickButtonWithOutScroll(SSOTwittersignin);
                waitForElement(TwitterUserName1, 20);
//                clickButtonWithOutScroll(TwitterUserName1);
                enterTextWithoutClick(TwitterUserName1, getTestDataValues(loginclass_path, userType)[0]);
//                enterTextWithoutScroll(TwitterUserName1,getTestDataValues(loginclass_path, userType)[0]);
                clickButtonWithOutScroll(TwitterUserNameNext);
                waitFor(20000);
//                if (isElementDisplayedWithoutScroll(TwitterMobileOrUsernameTitle)){
//                waitFor(5000);
//                    enterTextWithoutClick(TwitterMobileOrUsername,getTestDataValues(loginclass_path, userType)[2]);
//                    clickButtonWithOutScroll(TwitterUserNameNext);
//                }
                waitForElement(TwitterPwd1, 20);
                enterTextWithoutScroll(TwitterPwd1, getTestDataValues(loginclass_path, userType)[1]);
                hideMobileKeyboard();
                waitForElement(SSOTwittersignin1, 20);
                clickButtonWithOutScroll(SSOTwittersignin1);
            }

            waitFor(9000);
            if (isElementEnabled(NotNowButtonLID)) {
                clickButtonWithOutScroll(NotNowButtonLID);
            }
            if (isElementEnabled(ReinstallPopupOk)) {
                clickButtonWithOutScroll(ReinstallPopupOk);
            }
            if (isElementEnabled(CloseButtonModalPopupLid)) {
                clickButtonWithOutScroll(CloseButtonModalPopupLid);
            }
        } else if (userType.toLowerCase().contains("google")) {
            if (platformName.equalsIgnoreCase("iOS")) {
                waitForElement(ContinueButtonGoogleNlid, 20);
                clickButtonWithOutScroll(ContinueButtonGoogleNlid);
            }
            waitFor(9000);
            if (isElementDisplayedWithoutAssert(FirstUserGoogleNlid)) {
                clickButtonWithOutScroll(FirstUserGoogleNlid);
                if (platformName.equalsIgnoreCase("iOS")) {
                    if (!isElementDisplayedWithoutAssert(GoogleSignInNewScreenContinue)) {
                        ScrollTo(SSOConstants.GGOGLESIGNINNEWPAGECONTINUE, AccountConstants.IOSSCROLLUP, GoogleSignInNewScreenContinue);
                        clickButtonWithOutScroll(GoogleSignInNewScreenContinue, false);
                    }
                }
            } else if (isElementDisplayedWithoutAssert(payButton)) {
                System.out.println("THE APP IS IN LOGGED IN STATE");
            } else if (isElementDisplayedWithoutAssert(SsoPrivacyPolicyCheckbox)) {
                System.out.println("THE APP NAVIGATED TO THE REGISTRATION SCREEN WITH TERMS AND CONDITIONS");
            }
            if (isElementDisplayedWithoutAssert(ContinueButtonLinkedIn)) {
                clickButtonWithOutScroll(ContinueButtonLinkedIn);
            }
            if (isElementEnabled(NotNowButtonLID)) {
                clickButtonWithOutScroll(NotNowButtonLID);
            }
            if (isElementEnabled(ReinstallPopupOk)) {
                clickButtonWithOutScroll(ReinstallPopupOk);
            }
            if (isElementEnabled(CloseButtonModalPopupLid)) {
                clickButtonWithOutScroll(CloseButtonModalPopupLid);
            }
        } else if (userType.toLowerCase().contains("apple")) {
            waitFor(5000);
            waitForElement(ContinueWithPasscodeAppleSignIn, 10);
            clickButtonWithOutScroll(ContinueWithPasscodeAppleSignIn);
            waitForElement(PasswordAppleSignIn, 25);
            enterTextWithoutScroll(PasswordAppleSignIn, getTestDataValues(loginclass_path, userType)[1]);
            waitForElement(ContinueAppleSignIn, 20);
            clickButtonWithOutScroll(ContinueAppleSignIn);
            waitFor(10000);
            if (isElementEnabled(AccountPage.ReinstallPopupOk)) {
                clickButtonWithOutScroll(AccountPage.ReinstallPopupOk);
            }
        }
    }

    @When("^I enter SSO login details for Twitter$")
    public void i_enter_sso_login_details_for_twitter() throws Throwable {
        waitFor(15000);
        enterTextWithoutClick(LinkedInUsername, SSOConstants.TwitterUSER);
        hideMobileKeyboard();
        enterTextWithoutClick(LinkedInPassWord, SSOConstants.TwitterPASSWORD);
        hideMobileKeyboard();
    }

    @When("^I enter SSO login details for Facebook$")
    public void i_enter_sso_login_details_for_facebook() throws Throwable {
        waitFor(5000);
        enterTextWithoutClick(LinkedInUsername, SSOConstants.FacebookUSER);
        hideMobileKeyboard();
        enterTextWithoutClick(LinkedInPassWord, SSOConstants.FacebookPASSWORD);
        hideMobileKeyboard();
    }

    @And("^user taps login button in Twitter login screen$")
    public void user_taps_login_button_in_twitter_login_screen() throws Throwable {
        clickButtonWithOutScroll(SSOTwittersignin);
        waitFor(2000);

    }

    @And("^user taps login button in Facebook login screen$")
    public void user_taps_login_button_in_facebook_login_screen() throws Throwable {
        clickButtonWithOutScroll(FBLogin);
        waitFor(2000);
    }

    @And("^tap on Edit pin from account screen$")
    public void tap_on_edit_pin_from_account_screen() throws Throwable {

        clickButtonWithOutScroll(AccountEdit);
    }

    @When("^user taps on Forgot your pin link$")
    public void user_taps_on_forgot_your_pin_link() throws Throwable {
        try {
            if (isElementDisplayedWithoutAssert(ForgotYourPin)) {
                clickButtonWithOutScroll(ForgotYourPin);
            } else {
                clickButtonWithOutScroll(ForgotYourPinwithoutquestion);
            }
        } catch (Exception E) {
            logger.info("Forgot PIN link is NOT PRESENT");
            Assert.fail();
        }
    }

    @Then("^user is navigated to Forgot Pin Screen$")
    public void user_is_navigated_to_forgot_pin_screen() throws Throwable {
        waitFor(3000);
        staticTextValidation(ForgotPinHeader, SSOConstants.Forgot_PIN);
    }

    @And("^Veirfy all the elements are present in Forgot Pin Screen$")
    public void veirfy_all_the_elements_are_present_in_forgot_pin_screen() throws Throwable {
        staticTextValidation(ForgotPinHeader, SSOConstants.Forgot_PIN);
//        staticTextValidation(ForgotPinDescription,SSOConstants.Forgot_Pin_Desc);
        staticTextValidation(SendButton, SSOConstants.SEND);
    }

    @And("^user taps on send button in Forgot Pin Screen$")
    public void user_taps_on_send_button_in_forgot_pin_screen() throws Throwable {
        clickButtonWithOutScroll(SendButton);
    }

    @Then("^verify the confirmation pop up is displayed$")
    public void verify_the_confirmation_pop_up_is_displayed() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(okBtn, 30);
            Assert.assertTrue(isTextMatch(ResetPinPopup_Msg.getText(), SSOConstants.Instructon_ResetPin_Message));
        } else {
            waitForElement(ResetPinPopup_Msg, 30);
            Assert.assertTrue(isTextMatch(ResetPinPopup_Msg.getText(), SSOConstants.Instructon_ResetPin_Message));
        }
    }

    @Then("^verify the user is navigated to the Account screen$")
    public void verify_the_user_is_navigated_to_the_account_screen() throws Throwable {
        staticTextValidation(HeaderText, SSOConstants.Account);
    }

    @Then("^user is on Twitter Login$")
    public void user_is_on_twitter_login() throws Throwable {
        clickButtonWithOutScroll(TwitterIcon);
    }

    @Then("^user is on Facebook Login$")
    public void user_is_on_facebook_login() throws Throwable {
        clickButtonWithOutScroll(FacebookIcon);
    }

    @Then("^verify user is on LID Screen$")
    public void verify_user_is_on_lid_screen() throws Throwable {
        waitFor(10000);
        Assert.assertTrue(isElementDisplayedWithoutAssert(payButton));
        logger.info("User is on LID screen");
    }

    @Then("^user clicks on edit in the pin without phone$")
    public void userClicksOnEditInThePinWithoutPhone() {
        waitForElement(UserProfileAccount, 20);
        clickButtonWithOutScroll(pin_Edit_Btn_without_Mobile_SSO);
    }

    @Then("^accept terms and conditions$")
    public void acceptTermsConditions() throws InterruptedException {
        if ("android".equalsIgnoreCase(platformName)) {
            webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(termsConditionscheckbox)).click();
            AcceptBtn.click();
            Thread.sleep(3000);
            webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(AcceptBtnReview)).click();
            AcceptBtnReview.click();
        }
    }

    @Then("^user registers the SSO user by accepting the terms and conditions screen$")
    public void userRegistersTheSSOUserByAcceptingTheTermsAndConditionsScreen() {
        waitForElement(SsoPrivacyPolicyCheckbox, 20);
        clickButtonWithOutScroll(SsoPrivacyPolicyCheckbox);
        waitForElement(SsoAcceptButton, 5);
        clickButtonWithOutScroll(SsoAcceptButton);
    }

    @Then("^user navigates to the SSO registration screen$")
    public void userNavigatesToTheSSORegistrationScreen() {
        waitForElement(SsoPrivacyPolicyCheckbox, 20);
        Assert.assertTrue(isElementDisplayed(SsoPrivacyPolicyCheckbox));
        Assert.assertTrue(isElementDisplayed(SsoPrivacyPolicyCt));
        Assert.assertTrue(isTextMatch(SsoPrivacyPolicyCt.getText(), SSOConstants.SSOREGISTRATIONPRIVACYPOLICYCT));
    }

    @Then("^user verifies the mobile number field is not present in the SSO registraion flow$")
    public void userVerifiesTheMobileNumberFieldIsNotPresentInTheSSORegistraionFlow() {
        waitForElement(SsoPrivacyPolicyCheckbox, 20);
        Assert.assertTrue(MobileTextBoxAddMobileAccountList.isEmpty());
    }

//    @Then("^validate text displayed from the confirmation popup$")
//    public void validateTextDisplayedFromTheConfirmationPopup() {
//        if (isElementDisplayedWithoutAssert(confirmPopupCt)) {
//            staticTextValidation(confirmPopupCt, SSOConstants.CONFIRMPOPUPCT);
//
//    }
//    }

    @Then("^verify the updated esso logo is displayed$")
    public void verifyTheUpdatedEssoLogoIsDisplayed() {
        waitForElement(essoLogoLidScreen, 20);
        if ("android".equalsIgnoreCase(platformName)) {
            Assert.assertTrue(essoLogoLidScreen.isDisplayed());
            logger.info("updated Esso logo is displayed");
        } else {
            Assert.assertTrue(essoLogoLidScreen.isEnabled());
        }
    }
}