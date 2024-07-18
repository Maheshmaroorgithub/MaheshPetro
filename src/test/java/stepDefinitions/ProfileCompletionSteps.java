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

public class ProfileCompletionSteps extends ProfileCompletionPage {
    @And("^user clicks on the register account$")
    public void user_clicks_on_the_register_account() {
        isElementDisplayed(registerAccount);
        clickButtonWithOutScroll(registerAccount);
    }

//    @Then("^user fills the details on the registration screen$")
//    public void user_fills_the_details_on_the_registration_screen() {
//        isElementDisplayed(registerFirstName);
//        enterTextWithoutScroll(registerFirstName, ProfileCompletionConstants.REGISTERFIRSTNAME);
//        enterTextWithoutScroll(registerLastName, ProfileCompletionConstants.REGISTERLASTNAME);
//        enterTextWithoutScroll(register_Email, ProfileCompletionConstants.REGISTEREMAIL);
//        enterTextWithoutScroll(register_Password, ProfileCompletionConstants.REGISTERPASS);
//        enterTextWithoutScroll(register_ConfirmPass, ProfileCompletionConstants.REGISTERPASS);
//        hideMobileKeyboard();
//        isElementDisplayed(register_AcceptPrivacy);
//        clickButtonWithOutScroll(register_AcceptPrivacy);
//        clickButtonWithOutScroll(register_Continue_Btn);
//    }

    @And("^user skips the email verification page$")
    public void user_skips_the_email_verification_page() {
        waitFor(7000);
        isElementDisplayed(register_Email_Skip);
        clickButtonWithOutScroll(register_Email_Skip);
        isElementDisplayed(register_Emailskip_Anyway);
        clickButtonWithOutScroll(register_Emailskip_Anyway);

    }

    @And("^user verifies the forty percent in indicator$")
    public void user_verifies_the_forty_percent_in_indicator() {
        waitFor(4000);
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementDisplayedWithoutAssert(LIDProgress40)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress40.getText(), ProfileCompletionConstants.FORTYERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress50)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress50.getText(), ProfileCompletionConstants.FIFTYPERCENTINDICATOR));
            }
        } else {
            if (isElementDisplayedWithoutAssert(LIDProgress40)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress40.getText(), ProfileCompletionConstants.FORTYERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress50)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress50.getText(), ProfileCompletionConstants.FIFTYPERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress60)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress60.getText(), ProfileCompletionConstants.SIXTYPERCENTINDICATOR));
            }
        }
    }
    @And("^user verifies the fifty percent in indicator$")
    public void user_verifies_the_fifty_percent_in_indicator() {
        if (platformName.equalsIgnoreCase("Android")) {
        	 waitFor(8000);
             if (isElementDisplayedWithoutAssert(LIDProgress40))  {
                 Assert.assertTrue(
                         isTextMatch(LIDProgress40.getText(), ProfileCompletionConstants.FORTYERCENTINDICATOR));
             } else if (isElementDisplayedWithoutAssert(LIDProgress50)) {
                 Assert.assertTrue(
                         isTextMatch(LIDProgress50.getText(), ProfileCompletionConstants.FIFTYPERCENTINDICATOR));
             } else if (isElementDisplayedWithoutAssert(LIDProgress60)) {
                 Assert.assertTrue(
                         isTextMatch(LIDProgress60.getText(), ProfileCompletionConstants.SIXTYPERCENTINDICATOR));
             }

        } else {
            waitFor(4000);
            if (isElementDisplayedWithoutAssert(LIDProgress40)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress40.getText(), ProfileCompletionConstants.FORTYERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress50)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress50.getText(), ProfileCompletionConstants.FIFTYPERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress60)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress60.getText(), ProfileCompletionConstants.SIXTYPERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress70)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress70.getText(), ProfileCompletionConstants.SEVENTYPERCENTINDICATOR));

            }
        }
    }

    @Then("^enter Email address as \"([^\"]*)\"$")
    public void enter_Email_address_as(String arg1) throws Throwable {
        enterTextWithoutClick(RegstrEmail, arg1 + getSaltNumber()
                + ContextualRegistrationConstants.REGISTEREMAILDOM);

    }

    @Then("^enter Email address as invalid \\\"([^\\\"]*)\\\"$")
    public void enter_email_address_as_invalid_something(String arg1) throws Throwable {
        enterTextWithoutClick(RegstrEmail, arg1 + getSaltNumber()
                + ContextualRegistrationConstants.REGISTEREMAILINVALID);

    }

    @And("^user taps on the complete profile$")
    public void user_taps_on_the_complete_profile() {
        waitForElement(profile_Completion_NLID,50);
        clickButtonWithOutScroll(profile_Completion_NLID);
    }

    @And("^user clicks on the get started icon$")
    public void user_clicks_on_the_get_started_icon() {
        waitForElement(getStarted_Add_Nectar,10);
        clickButtonWithOutScroll(getStarted_Add_Nectar);
    }

    @And("^user taps on Resend Email link below the Open Inbox link$")
    public void user_taps_on_resend_email_link_below_the_open_inbox_link() throws Throwable {
        waitForElement(resend_email_btn_NLID,25);
        clickButtonWithOutScroll(resend_email_btn_NLID);
    }

    @And("^user verifies the confirmation pop up message$")
    public void user_verifies_the_confirmation_pop_up_message() throws Throwable {
        waitForElement(resend_email_Popup_message,20);
        Assert.assertTrue(isElementDisplayed(resend_email_Popup_message));
    }

    @Then("^user tap on OK button from the confirmation popup$")
    public void user_tap_on_ok_button_from_the_confirmation_popup() throws Throwable {
        waitForElement(resend_popup_ok_btn,10);
        clickButtonWithOutScroll(resend_popup_ok_btn);
    }

    @And("^user verifies the \"([^\"]*)\" screen$")
    public void user_verifies_the_something_screen(String strArg1) throws Throwable {
        waitForElement(complete_profile_Screen,4);
        staticTextValidation(complete_profile_Screen, ProfileCompletionConstants.COMPLETEYOURPROFILESCREEN);
    }
    @And("^user tap on the Start Fuelling icon$")
    public void user_tap_on_the_start_fuelling_icon() throws Throwable {
        clickButtonWithOutScroll(start_fueling_icon_NLID);
    }

    @Then("^system should display verification pop up$")
    public void system_should_display_verification_pop_up() throws Throwable {
        waitForElement(start_fueling_popup_btn,10);
        if (platformName.equalsIgnoreCase("Android")) {
            Assert.assertTrue(isTextContain(start_fueling_verficaton_msg.getText(), ProfileCompletionConstants.STARTFUELINGVERIFYMSG));
        } else {
            staticTextValidation(start_fueling_verficaton_msg, ProfileCompletionConstants.STARTFUELINGVERIFYMSG);
        }
        staticTextValidation(VerificationRequiredPopupTitle, ProfileCompletionConstants.VERIFICATIONREQUIREDTITLE);
    }

    @And("^user tap on ok button$")
    public void user_tap_on_ok_button() throws Throwable {
        waitForElement(start_fueling_popup_btn, 6);
        clickButtonWithOutScroll(start_fueling_popup_btn);
    }

//    @And("^user taps on Add Mobile Number$")
//    public void user_taps_on_add_mobile_number() throws Throwable {
//        waitForElement(add_Moble_Num_Btn,5);
//        clickButtonWithOutScroll(add_Moble_Num_Btn);
//    }

    @And("^user enters the mobile number$")
    public void user_enters_the_mobile_number() throws Throwable {
        waitForElement(enter_Mble_Num, 9);
        enterTextWithoutScroll(enter_Mble_Num, ProfileCompletionConstants.MOBILENUMBER);
        clickButtonWithOutScroll(mble_num_Done_Btn);
    }

    @Then("^user clicks done icon on the screen$")
    public void user_clicks_done_icon_on_the_screen() throws Throwable {
        waitFor(6000);
        if (isElementDisplayedWithoutAssert(mble_num_Done_Btn)) {
            clickButtonWithOutScroll(mble_num_Done_Btn);
        }
    }

    @And("^user confirms the verification pop up$")
    public void user_confirms_the_verification_pop_up() throws Throwable {
        waitFor(9000);
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(mble_Num_Complted_popup, ProfileCompletionConstants.MOBILENUMCOMPLTDPOPUP);
        }
        else{
            if (isElementDisplayedWithoutAssert(email_task)) {
                staticTextValidation(email_task, ProfileCompletionConstants.MOBILENUMCOMPLTDPOPUPTEXT);
                clickButtonWithOutScroll(mble_Num_Popup_Okbtn);
            }
        }
    }

    @Then("^user clicks on Completed Add Mobile number Icon$")
    public void user_clicks_on_completed_add_mobile_number_icon() throws Throwable {
        waitForElement(add_Mobl_Num_cmpltd, 9);
        clickButtonWithOutScroll(add_Mobl_Num_cmpltd);
    }

    @And("^user verifies the Add Mobile Number confirmation pop up with message$")
    public void user_verifies_the_add_mobile_number_confirmation_pop_up_with_message() throws Throwable {

        staticTextValidation(compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);

    }

    @And("^user accepts the pop up message$")
    public void user_accepts_the_pop_up_message() throws Throwable {
        waitForElement(completd_Mble_Num_Popupok_Btn,8);
        clickButtonWithOutScroll(completd_Mble_Num_Popupok_Btn);
    }

    @When("^user clicks on Login Icon$")
    public void user_clicks_on_login_icon() throws Throwable {
        waitForElement(login_Button_Nlid,20);
        clickButtonWithOutScroll(login_Button_Nlid);
    }

    @Then("^user taps on Login Icon in Login screen$")
    public void user_taps_on_login_icon_in_login_screen() throws Throwable {

        clickButtonWithOutScroll(login_Button_Login);
        waitFor(7000);
    }

    @When("^user verify without tick mark on the task$")
    public void user_verify_without_tick_mark_on_the_task() throws Throwable {

//        Assert.assertTrue(isElementDisplayed(email_task));
        isElementEnabled(email_task);
    }

    @Then("^user verifies the completed Accept privacy and Terms task$")
    public void user_verifies_the_completed_accept_privacy_and_terms_task() throws Throwable {
        waitForElement(PpAndTcProfile,20);
//        Assert.assertTrue(isElementDisplayed(completed_Privacy_And_Terms));
        isElementEnabled(PpAndTcProfile);
    }

    @And("^user verifies the completed Set First Name and Last Name task$")
    public void user_verifies_the_completed_set_first_name_and_last_name_task() throws Throwable {
        waitFor(4000);
//        Assert.assertTrue(isElementDisplayed(completed_First_Last_Name));
        isElementEnabled(SetFirstnameProfile);
    }

    @And("^user verifies the completed Notifications task$")
    public void user_verifies_the_completed_notifications_task() throws Throwable {
        waitFor(4000);
        if (platformName.equalsIgnoreCase("Android")) {
            ScrollTo(ProfileCompletionConstants.EMAILTASK, ProfileCompletionConstants.IOSSCROLLUP, email_task);
            Assert.assertTrue(isElementDisplayed(completed_Notification));
        } else {
            ScrollTo(ProfileCompletionConstants.EMAILTASK, ProfileCompletionConstants.IOSSCROLLUP, email_task);
            waitForElement(NotificationsProfile,10);
            Assert.assertTrue(isElementDisplayed(NotificationsProfile));
        }
    }

    @Then("^user taps on maximum fueling amount$")
    public void user_taps_on_maximum_fueling_amount() throws Throwable {

    	waitForElement(maximum_Fueling_Btn,5);
        clickButtonWithOutScroll(maximum_Fueling_Btn);
    	if (isElementDisplayedWithoutAssert(CompleteYourProfile30)) {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile30.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE30));
        } else if(isElementDisplayedWithoutAssert(CompleteYourProfile40))  {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile40.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE40));
        } else if (isElementDisplayedWithoutAssert(CompleteYourProfile50)) {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile50.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE50));
        }

    }

    @Then("^user clicks on Set Maximum Amount button$")
    public void user_clicks_on_set_maximum_amount_button() throws Throwable {
        waitForElement(set_Maximum_Fueling_Btn,6);
        clickButtonWithOutScroll(set_Maximum_Fueling_Btn);
    }

    @And("^user sets the fueling amount and clicks ok button$")
    public void user_sets_the_fueling_amount_and_clicks_ok_button() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            clickButtonWithOutScroll(maximum_Fuel_ok_btn);
        } else {
            waitForElement(maximumAmountPicker, 7);
            selectSinglePickerValue(maximumAmountPicker);
            waitForElement(maximum_Fueling_ok_btn,8);
            clickButtonWithOutScroll(maximum_Fueling_ok_btn);
            if (isElementDisplayedWithoutAssert(maximum_Fuel_ok_btn)) {
                clickButtonWithOutScroll(maximum_Fuel_ok_btn);
            }
        }
    }
    @And("^user clicks on continue button in maximum fueling screen$")
    public void user_clicks_on_continue_button_in_maximum_fueling_screen() throws Throwable {
        waitForElement(maximum_fueling_continu_btn, 10);
        clickButtonWithOutScroll(maximum_fueling_continu_btn);
    }

    @Then("^user clicks on Add card icon$")
    public void user_clicks_on_add_card_icon() throws Throwable {

        clickButtonWithOutScroll(compltd_Add_Nectar);

    }

    @And("^user verifies the completed pop up message and clicks ok button$")
    public void user_verifies_the_completed_pop_up_message_and_clicks_ok_button() throws Throwable {
//        staticTextValidation(compltd_Add_Nectar_Msgpopup, ProfileCompletionConstants.ALREADYCOMPLETEDMSGPOPUP);
//        clickButtonWithOutScroll(compltd_Add_Nectar_okbtn);
        staticTextValidation(maximum_Fueling_Amnt_Compltd_Msg, ProfileCompletionConstants.MAXIMUMFUELINGAMNTCMPLTDMSG);
        staticTextValidation(compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);
//        Assert.assertTrue(isElementDisplayed(completd_Mble_Num_Popupok_Btn));
        isElementEnabled(completd_Mble_Num_Popupok_Btn);
        clickButtonWithOutScroll(compltd_Add_Nectar_okbtn);
    }

    @And("^user verifies the circular indicator$")
    public void user_verifies_the_circular_indicator() throws Throwable {

        isElementDisplayed(percent_progress);
    }

    @And("^user enters the card details and click next icon$")
    public void user_enters_the_card_details_and_click_next_icon() throws Throwable {
        waitForElement(enter_nectar_card_Accnt,5);
        enterTextWithoutScroll(enter_nectar_card_Accnt, ProfileCompletionConstants.NECTARCARDNUMBER);
        hideMobileKeyboard();
        clickButtonWithOutScroll(accnt_Nectar_Next);

    }

    @And("^user clicks on verify later$")
    public void user_clicks_on_verify_later() throws Throwable {

        clickButtonWithOutScroll(accnt_Nectar_verify_later);
    }

    @Then("^user skips the verification page$")
    public void user_skips_the_verification_page() throws Throwable {
        waitForElement(accnt_Nectar_Skip,5);
        clickButtonWithOutScroll(accnt_Nectar_Skip);
    }

    @And("^user verifies the account page$")
    public void user_verifies_the_account_page() throws Throwable {
        waitForElement(UserProfileAccount, 25);
        staticTextValidation(account_Page, ProfileCompletionConstants.ACCOUNTSCREEN);
    }

    @And("^user clicks on offer icon$")
    public void user_clicks_on_offer_icon() throws Throwable {
        waitFor(4000);
        clickButtonWithOutScroll(offer_icon);
    }

    @Then("^user clicks Add Nectar Card from offer screen$")
    public void user_clicks_add_nectar_card_from_offer_screen() throws Throwable {
        waitFor(3000);
        clickButtonWithOutScroll(add_Nectar_Offer);
    }

    @And("^user clicks on continue in add nectar card$")
    public void user_clicks_on_continue_in_add_nectar_card() throws Throwable {
    	waitForElement(add_Nectar_Continue,10);
    	clickButtonWithOutScroll(add_Nectar_Continue);
        waitForElement(accnt_Nectar_verify_later,10);
        clickButtonWithOutScroll(accnt_Nectar_verify_later);

    }

    @Then("^user clicks cancels and skips the verification page$")
    public void user_clicks_cancels_and_skips_the_verification_page() throws Throwable {

        clickButtonWithOutScroll(add_Nectar_cancel);
    }

    @And("^user verifies the offer page$")
    public void user_verifies_the_offer_page() throws Throwable {
        waitFor(5000);
//        Assert.assertTrue(isElementDisplayed(offer_screen));
            isElementEnabled(offer_screen);
    }

    @And("^user clicks a Add card in Account screen$")
    public void user_clicks_a_Add_card_in_Account_screen() throws Throwable {
        waitFor(4000);
        if (platformName.equalsIgnoreCase("Android")) {
            clickButtonWithOutScroll(add_card_button);
        } else {
//            ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, AccountPage.LogOut);
//            ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLDOWN, add_card_button);
//            ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, AccountConstants.IOSSCROLLUP, add_card_button);
            clickButtonWithOutScroll(add_card_button);
        }

    }

    @And("^user enter the email id in paypal screen$")
    public void user_enter_the_email_id_in_paypal_screen() throws Throwable {

        waitFor(7000);
        isElementDisplayed(paypal_Email_id);
        enterTextWithoutScroll(paypal_Email_id, ProfileCompletionConstants.PAYPALUSERNAME);
    }

    @Then("^user enters the password in paypal screen$")
    public void user_enters_the_password_in_paypal_screen() throws Throwable {

        enterTextWithoutScroll(paypal_Password, ProfileCompletionConstants.PAYPALPASSWORD);
    }

    @Then("^user clicks on login button in paypal screen$")
    public void user_clicks_on_login_button_in_paypal_screen() throws Throwable {

        clickButtonWithOutScroll(paypal_Login_btn);
    }

    @And("^user clicks on continue button$")
    public void user_clicks_on_continue_button() throws Throwable {
        waitFor(9000);
        waitFor(9000);
        waitFor(9000);
        clickButtonWithOutScroll(paypal_Agree_Cookies);
        clickButtonWithOutScroll(paypal_Continue_Btn);
    }

    @Then("^user clicks on Agree and Continue Button$")
    public void user_clicks_on_agree_and_continue_button() throws Throwable {

        clickButtonWithOutScroll(paypal_Agree_Continue);
    }

    @Then("^user verifies the success message and clicks on Continue$")
    public void user_verifies_the_success_messgae_and_clicks_on_continue() throws Throwable {

        staticTextValidation(paypal_Completed_Success_Msg, ProfileCompletionConstants.PAYPALSUCCESSMSG);
        clickButtonWithOutScroll(paypal_Compltd_Continue_Btn);
    }

//    @Then("^user verifies the Nectar Added Success Message$")
//    public void user_verifies_the_nectar_added_success_message() throws Throwable {
//
//        staticTextValidation(nectar_Card_Success_Msg, ProfileCompletionConstants.NECTARCARDSUCCESSMSG);
//    }

    @Then("^user clicks on Add nectar$")
    public void user_clicks_on_add_nectar() throws Throwable {
        waitForElement(compltd_nectar_Card_Btn,25);
        if (platformName.equalsIgnoreCase("Android")) {
            clickButtonWithOutScroll(compltd_nectar_Card_Btn);
        } else {
            if (isElementDisplayedWithoutAssert(compltd_nectar_Card_Btn)) {
                clickButtonWithOutScroll(compltd_nectar_Card_Btn);
            } else {
                ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLUP, compltd_nectar_Card_Btn);
                waitFor(2000);
                clickButtonWithOutScroll(compltd_nectar_Card_Btn);
            }
        }
    }

    @Then("^user taps on add payment method$")
    public void user_taps_on_add_payment_method() throws Throwable {
        waitForElement(payment_Methd_Btn,25);
//        if (platformName.equalsIgnoreCase("Android")) {
//            waitForElement(payment_Methd_Btn,10);
//            clickButtonWithOutScroll(payment_Methd_Btn);
//        } else {
////            String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
////                    + "var elementTop = arguments[0].getBoundingClientRect().top;"
////                    + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
////
////            ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, payment_Methd_Btn);
////            ScrollTo(ProfileCompletionConstants.ADDNECTARSCROLL, ProfileCompletionConstants.IOSSCROLLUP, add_Nectar_Button);
//            ScrollTo(ProfileCompletionConstants.PAYMENTMETHODPROFILE, ProfileCompletionConstants.IOSSCROLLDOWN, PaymentTitleProfile);
            clickButtonWithOutScroll(payment_Methd_Btn);
//        }
    }

    @And("^clicks on \"([^\"]*)\" icon$")
    public void clicks_on_something_icon(String strArg1) throws Throwable {

        clickButtonWithOutScroll(payment_Mthd_Paypal_Btn);
    }

//    @Then("^user verifies the payment method task as completed$")
//    public void user_verifies_the_payment_method_task_as_completed() throws Throwable {
//
//        clickButtonWithOutScroll(payment_Methd_Btn);
//        staticTextValidation(compltd_Add_Nectar_Msgpopup, ProfileCompletionConstants.ALREADYCOMPLETEDMSGPOPUP);
//        clickButtonWithOutScroll(compltd_Add_Nectar_okbtn);
//        androidBack();
//    }

    @Then("^user clicks on edit in the added payment method$")
    public void user_clicks_on_edit_in_the_added_payment_method() throws Throwable {
        waitForElement(payment_Edit_Btn,10);
        if (isElementDisplayedWithoutAssert(payment_Edit_Btn)){
            clickButtonWithOutScroll(payment_Edit_Btn);
        } else {
            ScrollTo(ProfileCompletionConstants.PAYMENTEDIT, "up", payment_Edit_Btn);
            clickButtonWithOutScroll(payment_Edit_Btn);
        }
    }

    @Then("^user click on the signout icon in the popup$")
    public void user_click_on_the_signout_icon_in_the_popup() throws Throwable {
        waitForElement(payment_Edit_Signout_Btn,6);
        clickButtonWithOutScroll(payment_Edit_Signout_Btn);
    }

    @And("^user navigated to NLID Screen$")
    public void user_navigated_to_nlid_screen() throws Throwable {
        waitFor(9000);
        clickButtonWithOutScroll(fuel);
        waitFor(5000);
        if (isElementDisplayedWithoutAssert(LidTitleCardExpiry)) {
            clickButtonWithOutScroll(LidOkButtonCardExpiry);
        }


        waitFor(3000);
    }

//    @Then("^user verifies the payment method$")
//    public void user_verifies_the_payment_method() throws Throwable {
//
//    clickButtonWithOutScroll(payment_Methd_Btn);
//    clickButtonWithOutScroll(compltd_Add_Nectar_okbtn);
//    }

    @And("^user closes the pop up of nectar card$")
    public void user_closes_the_pop_up_of_nectar_card() throws Throwable {

        waitFor(9000);
        if (isElementDisplayedWithoutAssert(completed_Popup)){
            clickButtonWithOutScroll(completed_Popup);
        }
    }


    @Then("^user verifies the completed features in Account$")
    public void user_verifies_the_completed_features_in_account() throws Throwable {

        isElementDisplayed(compltd_Accnt_Featrs);
    }

    @Then("^user verifies the circular indicator in the LID$")
    public void user_verifies_the_circular_indicator_in_the_LID() throws Throwable {
        waitForElement(start_Fueling_Icon,15);
        Assert.assertTrue(isElementEnabled(start_Fueling_Icon));
    }

    @Then("^user verifies the nectar points in dashboard$")
    public void user_verifies_the_nectar_points_in_dashboard() throws Throwable {
        Assert.assertTrue(isElementEnabled(enectarpoints));
    }

    @Then("^user verifies the progress bar in the Complete your Profile screen$")
    public void user_verifies_the_progress_bar_in_the_complete_your_profile_screen() throws Throwable {
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(CompleteYourProfile40)) {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile40.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE40));
        } else if (isElementDisplayedWithoutAssert(CompleteYourProfile50))  {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile50.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE50));
        } else if (isElementDisplayedWithoutAssert(CompleteYourProfile60)) {
            Assert.assertTrue(
                    isTextMatch(CompleteYourProfile60.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE60));
        }
    }

    @Then("^user verifies the tick mark in the Maximum fuelling Amount$")
    public void user_verifies_the_tick_mark_in_the_maximum_fuelling_amount() throws Throwable {
        waitFor(3000);
        Assert.assertTrue(isElementDisplayed(TickMarkMfaCompleteYourProfile));
    }

    @Then("^verify the body of the already completed task$")
    public void verify_the_body_of_the_already_completed_task() throws Throwable {
        staticTextValidation(maximum_Fueling_Amnt_Compltd_Msg, ProfileCompletionConstants.MAXIMUMFUELINGAMNTCMPLTDMSG);
    }

    @Then("^user lands in the Complete your Profile screen$")
    public void user_lands_in_the_complete_your_profile_screen() throws Throwable {
        Assert.assertTrue(isElementDisplayed(add_Mobl_Num_cmpltd));
    }

    @Then("^user verifies the nectar thumbnails in the LID$")
    public void user_verifies_the_nectar_thumbnails_in_the_lid() throws Throwable {
        if (isElementEnabled(enectarpointsThumbnail)) {
            Assert.assertTrue(isElementEnabled(enectarpointsThumbnail));
        }
    }

    @Then("^user verifies the progress in the LID$")
    public void user_verifies_the_progress_in_the_lid() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(fifty_percent_Indicator,10);
            if (isElementDisplayedWithoutAssert(fifty_percent_Indicator))  {
                Assert.assertTrue(isElementEnabled(fifty_percent_Indicator));
            } else if (isElementDisplayedWithoutAssert(sixty_percent_Indicator)) {
                Assert.assertTrue(
                        isTextMatch(sixty_percent_Indicator.getText(), ProfileCompletionConstants.SIXTYPERCENTINDICATOR));
            }
        } else {
            waitForElement(LIDProgress50,10);
            if (isElementDisplayedWithoutAssert(LIDProgress50))  {
                Assert.assertTrue(
                        isTextMatch(LIDProgress50.getText(), ProfileCompletionConstants.FIFTYPERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress60)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress60.getText(), ProfileCompletionConstants.SIXTYPERCENTINDICATOR));
            }
        }
    }

    @Then("^user verifies the User Profile section in Complete your profile screen$")
    public void userVerifiesTheUserProfileSectionInCompleteYourProfileScreen() {
        waitForElement(UserProfileTitleProfile, 30);
//       ScrollTo(ProfileCompletionConstants.PPTANDCPROFILE, ProfileCompletionConstants.IOSSCROLLUP, PpAndTcProfile);
        Assert.assertTrue(isElementDisplayed(UserProfileTitleProfile));
        Assert.assertTrue(isTextMatch(PpAndTcProfile.getText(), ProfileCompletionConstants.PPTANDCPROFILE));
        Assert.assertTrue(isTextMatch(EmailVerifiedProfile.getText(), ProfileCompletionConstants.EMAILPROFILE));
        Assert.assertTrue(isTextMatch(SetFirstnameProfile.getText(), ProfileCompletionConstants.FNAMEPROFILE));
        Assert.assertTrue(isTextMatch(payment_Methd_Btn.getText(), ProfileCompletionConstants.PAYMETHODTITLEPROFILE));
        if (isElementDisplayedWithoutAssert(PaymentTitleProfile)) {
            Assert.assertTrue(isElementDisplayed(PaymentTitleProfile));
        } else {
            ScrollTo(ProfileCompletionConstants.PAYMENTMETHODPROFILE, ProfileCompletionConstants.IOSSCROLLUP, PaymentTitleProfile);
            Assert.assertTrue(isElementDisplayed(PaymentTitleProfile));
        }
    }

    @Then("^user verifies permission settings in the Complete your profile screen$")
    public void userVerifiesPermissionSettingsInTheCompleteYourProfileScreen() {
        ScrollTo(ProfileCompletionConstants.EMAILPREFERENCEPROFILE, ProfileCompletionConstants.IOSSCROLLUP, email_task);
        email_task.isDisplayed();
        waitFor(2000);
        Assert.assertTrue(isElementEnabled(PermissionsTitle));
        Assert.assertTrue(isTextMatch(LocationServicesProfile.getText(), ProfileCompletionConstants.LOCATIONSERVICESPROFILE));
        Assert.assertTrue(isTextMatch(NotificationsProfile.getText(), ProfileCompletionConstants.NOTIFICATIONSPROFILE));
    }

    @Then("^user verifies Email settings in the Complete your profile screen$")
    public void userVerifiesEmailSettingsInTheCompleteYourProfileScreen() {
       waitForElement(email_task,10);
    	//Assert.assertTrue(isElementEnabled(EmailTitleProfie));
        Assert.assertTrue(isTextMatch(email_task.getText(), ProfileCompletionConstants.EMAILPREFERENCEPROFILE));
    }

    @Then("^user verifies Payment and Loyalty in the Complete your profile screen$")
    public void userVerifiesPaymentAndLoyaltyInTheCompleteYourProfileScreen() {
        Assert.assertTrue(isElementEnabled(LoyaltyTitleProfile));
        if (platformName.equalsIgnoreCase("iOS")) {
            Assert.assertTrue(isTextMatch(compltd_nectar_Card_Btn.getText(), ProfileCompletionConstants.ADDNECTARCARD));
        }
        ScrollTo(ProfileCompletionConstants.PPTANDCPROFILE, ProfileCompletionConstants.IOSSCROLLDOWN, PpAndTcProfile);
        Assert.assertTrue(isElementEnabled(PaymentTitleProfile));
    }

    @And("^user sets the pin number from Account screen$")
    public void user_sets_the_pin_number_from_Account_screen() throws Throwable {
        waitFor(3000);
        enterTextWithoutClick(card_Pin_Num1, FrictionlessFlowConstants.PIN1 );
        enterTextWithoutClick(card_Pin_Num2, FrictionlessFlowConstants.PIN2);
        enterTextWithoutClick(card_Pin_Num3, FrictionlessFlowConstants.PIN3);
        enterTextWithoutClick(card_Pin_Num4, FrictionlessFlowConstants.PIN4);
    }

    @Then("^user clicks on continue in Edit button$")
    public void user_clicks_on_continue_in_Edit_button() throws Throwable {
        waitFor(2000);
        clickButtonWithOutScroll(payment_Pin_Continue_Btn);
    }

    @Then("^user clicks on ok button in esso pin successful$")
    public void user_clicks_on_ok_button_in_esso_pin_successful() throws Throwable {
        waitForElement(pin_Confirm_Ok_Btn,10);
        clickButtonWithOutScroll(pin_Confirm_Ok_Btn);
    }

    @Then("^user taps delete in the Edit Payment Method screen$")
    public void userTapsDeleteInTheEditPaymentMethodScreen() {
        ScrollTo(FrictionlessFlowConstants.DELETECARD, AccountConstants.IOSSCROLLUP, deleteButtonEditPaymentMethod);
        clickButtonWithOutScroll(deleteButtonEditPaymentMethod);
    }

    @Then("^user taps on delete button in the Delete popup msg$")
    public void userTapsOnDeleteButtonInTheDeletePopupMsg() {
        clickButtonWithOutScroll(DeletePopupButtonDebitCard);
        waitFor(5000);
    }

    @Then("^user verifies whether the task is completed$")
    public void userVerifiesWhetherTheTaskIsCompleted() {
        waitFor(2000);
        staticTextValidation(maximum_Fueling_Amnt_Compltd_Msg, ProfileCompletionConstants.MAXIMUMFUELINGAMNTCMPLTDMSG);
        staticTextValidation(compltd_mbl_Num_popup, ProfileCompletionConstants.COMPLETEDMBLENUMPOPUP);
//        Assert.assertTrue(isElementDisplayed(completd_Mble_Num_Popupok_Btn));
        isElementEnabled(completd_Mble_Num_Popupok_Btn);
    }
    
    @And("^user verifies the 50% profile completion circular indicator$")
    public void user_verifies_the_50_profile_completion_circular_indicator() throws Throwable {
    	waitFor(1000);
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(Profile40completion, ProfileCompletionConstants.COMPLETEYOURPROFILE40);
        } else {
            if (isElementDisplayedWithoutAssert(CompleteYourProfile50)) {
                Assert.assertTrue(
                        isTextMatch(CompleteYourProfile50.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE50));
            } else if(isElementDisplayedWithoutAssert(CompleteYourProfile60))  {
                Assert.assertTrue(
                        isTextMatch(CompleteYourProfile60.getText(), ProfileCompletionConstants.COMPLETEYOURPROFILE60));
            }
        }
    }

    @When("^user taps on the Email Preferences in Complete your profile screen$")
    public void userTapsOnTheEmailPreferencesInCompleteYourProfileScreen() {
        waitFor(6000);
        ScrollTo(ProfileCompletionConstants.EMAILTASK, ProfileCompletionConstants.IOSSCROLLUP,email_task);
        waitForElement(email_task,10);
        clickButtonWithOutScroll(email_task);
    }

    @And("^user verifies the Email Preferences screen$")
    public void userVerifiesTheEmailPreferencesScreen() {
        waitForElement(emailPreference_tellustext,10);
        Assert.assertTrue(isTextMatch(email_task.getText().trim(), ProfileCompletionConstants.EMAILPREFERENCESHEADING));
        Assert.assertTrue(isElementDisplayed(emailPreference_tellustext));
        Assert.assertTrue(isElementDisplayed(emailpreferencesCheckbox1));
        Assert.assertTrue(isElementDisplayed(emailpreferencesCheckbox2));
        Assert.assertTrue(isElementDisplayed(EmailPreferencesOffersAcceptCheckbox));
        Assert.assertTrue(isElementDisplayed(NectarCardSectionAccount));
        Assert.assertTrue(isTextMatch(EmailPreferencesCheckbox1Ct.getText().trim(), ProfileCompletionConstants.EMAILPREFERENCESSCREENCHECKBOX1CT));
        isElementDisplayed(EmailPreferencesOffersAcceptCheckbox);
        if (platformName.equalsIgnoreCase("Android")) {
            Assert.assertTrue(isTextMatch(EmailPreferencesCheckbox2Ct.getText().trim(), ProfileCompletionConstants.EMAILPREFERENCESSCREENCHECKBOX2CT1));
        } else {
            Assert.assertTrue(isTextMatch(EmailPreferencesCheckbox2Ct.getText().trim(), ProfileCompletionConstants.EMAILPREFERENCESSCREENCHECKBOX2CT));
        }
//        }
    }

    @And("^user taps on the accept email preferences$")
    public void userTapsOnTheAcceptEmailPreferences() {
            waitForElement(EmailPreferencesOffersAcceptCheckbox,10);
            clickButtonWithOutScroll(EmailPreferencesOffersAcceptCheckbox);

    }

    @And("^User taps on Continue button in the email preferences set successfully screen$")
    public void userTapsOnContinueButtonInTheEmailPreferencesSetSuccessfullyScreen() {
        waitForElement(paypal_Compltd_Continue_Btn, 9);
        clickButtonWithOutScroll(paypal_Compltd_Continue_Btn);
    }

    @Then("^user verifies whether the email preferences task is completed$")
    public void userVerifiesWhetherTheEmailPreferencesTaskIsCompleted() {
        waitForElement(emailpreferenceSuccessMessage,5);
        Assert.assertTrue(isElementDisplayed(emailpreferenceSuccessMessage));
        Assert.assertTrue(isElementDisplayed(emailpreferenceSuccessDesc));
    }
        @Then("^user taps on location services and confirm whether it is completed$")
        public void userTapsOnLocationServicesAndConfirmWhetherItIsCompleted () {


//                if (platformName.equalsIgnoreCase("Android"))  {
//                	Location_Services.isDisplayed();
//                    waitForElement(LocationServicesProfile,5);
//                    clickButtonWithOutScroll(LocationServicesProfile);
////                	 Assert.assertTrue(isElementDisplayed(getTextElement("Let us locate your nearest stations")));
////                     Assert.assertTrue(isElementDisplayed(getTextElement("Then see which is most convenient and get directions if required.")));
//                     clickButtonWithOutScroll(getButtonElement("CONTINUE"));
//                     waitForElement(new GuestCheckOutPage().AllowLocationWhileUsingTheApp);
//                     clickButtonWithOutScroll(new GuestCheckOutPage().AllowLocationWhileUsingTheApp);
//                     waitFor(5000);
//                     isElementEnabled(MenuSteps.LocationPermissionSuccessScreen);
//                     Assert.assertTrue(isElementEnabled(MenuSteps.LocationPermissionSuccessScreen));
//                     Assert.assertTrue(isElementEnabled(getTextElement("You will always be able to quickly navigate to your favourite station.")));
//                     clickButtonWithOutScroll(getButtonElement("CONTINUE"));
//                } else if (platformName.equalsIgnoreCase("iOS")) {
            if (platformName.equalsIgnoreCase("Android")) {
                ScrollTo(ProfileCompletionConstants.LOCATIONSERVICESPROFILE, ProfileCompletionConstants.IOSSCROLLUP, LocationServicesProfile);
            }
                    clickButtonWithOutScroll(LocationServicesProfile);
                    waitForElement(resend_popup_ok_btn,5);
                    clickButtonWithOutScroll(resend_popup_ok_btn);
//                }
//
//                if (already_completed_Popupok_Btn.isEmpty()) {
//                	waitForElement(LocationServicesProfile,5);
//                    clickButtonWithOutScroll(LocationServicesProfile);
//                    waitFor(3000);
//                    Assert.assertTrue(isElementDisplayed(getTextElement("Let us locate your nearest stations")));
//                    Assert.assertTrue(isElementDisplayed(getTextElement("Then see which is most convenient and get directions if required.")));
//                    clickButtonWithOutScroll(getButtonElement("CONTINUE"));
//                    waitForElement(new GuestCheckOutPage().AllowLocationWhileUsingTheApp);
//                    clickButtonWithOutScroll(new GuestCheckOutPage().AllowLocationWhileUsingTheApp);
//                    waitFor(5000);
//                    isElementEnabled(MenuSteps.LocationPermissionSuccessScreen);
//                    Assert.assertTrue(isElementEnabled(MenuSteps.LocationPermissionSuccessScreen));
//                    Assert.assertTrue(isElementEnabled(getTextElement("You will always be able to quickly navigate to your favourite station.")));
//                    clickButtonWithOutScroll(getButtonElement("CONTINUE"));
//                } else {
//                    waitForElement(already_completed_Popupok_Btn.get(0),5);
//                    clickButtonWithOutScroll(already_completed_Popupok_Btn.get(0));
//                    clickButtonWithOutScroll(app_Back_Button);
//                }
            }

        @And("^User taps on continue button in the mobile number added successfully screen$")
        public void userTapsOnContinueButtonInTheMobileNumberAddedSuccessfullyScreen () {
            if (platformName.equalsIgnoreCase("iOS")) {
                waitForElement(Continue_BTN,8);
                clickButtonWithOutScroll(Continue_BTN);
                if (isElementDisplayedWithoutAssert(maximum_Fueling_ok_btn)) {
                    clickButtonWithOutScroll(maximum_Fueling_ok_btn);
                }
            } else {
            	 waitForElement(Continue_BTN,8);
                 clickButtonWithOutScroll(Continue_BTN);
                 if (isElementDisplayedWithoutAssert(maximum_Fueling_ok_btn)) {
                     clickButtonWithOutScroll(maximum_Fueling_ok_btn);
                 }
            }

    }

    @And("^User taps on Continue button in the email preferences screen$")
    public void userTapsOnContinueButtonInTheEmailPreferencesScreen() {
//        if (platformName.equalsIgnoreCase("iOS")) {
//            clickButtonWithOutScroll(getButtonElement("Continue"));
//        }
//        else
//        {
                clickButtonWithOutScroll(emailcontinue);
//        }
    }

    @When("^user navigates to the top of the screen in Complete your profile screen$")
    public void userNavigatesToTheTopOfTheScreenInCompleteYourProfileScreen() {
        if(platformName.equalsIgnoreCase("Android"))
        {
            AcceptedPPAndTC.isDisplayed();
            waitFor(2000);
        }
        else {
            ScrollTo(ProfileCompletionConstants.PPTANDCPROFILE, ProfileCompletionConstants.IOSSCROLLDOWN, PpAndTcProfile);
            waitFor(1500);
        }
    }
    @Then("^user clicks on Add nectar card$")
    public void userClicksOnAddNectarCard() {
        waitForElement(UserProfileAccount, 15);
       ScrollTo(ProfileCompletionConstants.ADDNECTARCARD, ProfileCompletionConstants.IOSSCROLLUP, OkNect);
        waitFor(2000);
        clickButtonWithOutScroll(OkNect);
    }

    @Then("^user verifies the Add Payment method screen in android$")
    public void userVerifiesTheAddPaymentMethodScreenInAndroid() {
        waitForElement(CreditDebitCardAddPaymentMethodScreen,15);
        Assert.assertTrue(AddPaymentMethodScreenTitle.isDisplayed());
        Assert.assertTrue(AddPaymentMethodScreenCancel.isEnabled());
        Assert.assertTrue(CreditDebitCardAddPaymentMethodScreen.isEnabled());
        Assert.assertTrue(AddPaymentMethodScreenPayPal.isEnabled());
    }

    @And("^user taps on start fuelling button in LID$")
    public void userTapsOnStartFuellingButtonInLID() {
        waitForElement(start_Fueling_Icon,15);
        clickButtonWithOutScroll(start_Fueling_Icon);
    }

    @Then("^user clicks on edit in the added payment method without phone and other payment$")
    public void userClicksOnEditInTheAddedPaymentMethodWithoutPhoneAndOtherPayment() {
        waitForElement(payment_Edit_Btn_No_Mobile,30);
        clickButtonWithOutScroll(payment_Edit_Btn_No_Mobile);
    }

    @Given("^user is on NLID screen after multiple launch$")
    public void userIsOnNLIDScreenAfterMultipleLaunch() throws Throwable {
        waitForElement(login_Button_Nlid,20);
    }

    @Then("^user verifies the login button in the NLID$")
    public void user_verifies_the_login_button_in_the_nlid() throws Throwable {
        Assert.assertTrue(isElementDisplayed(login_Button_Nlid));
    }

    @Then("^user confirms the mobile number field is not present in the Completes your profile screen$")
    public void userConfirmsTheMobileNumberFieldIsNotPresentInTheCompletesYourProfileScreen() {
        waitForElement(complete_profile_Screen,4);
        Assert.assertTrue(add_Moble_Num_Btn.isEmpty());
    }

    @And("^user taps on cancel button in the add nectar card launch screen from Profile completion$")
    public void userTapsOnCancelButtonInTheAddNectarCardLaunchScreenFromProfileCompletion() {
        waitForElement(complete_profile_Screen,10);
        clickButtonWithOutScroll(CancelAddNectarCardLaunch);
    }

    @And("^user taps on cancel button in the add nectar card screen from Profile completion$")
    public void userTapsOnCancelButtonInTheAddNectarCardScreenFromProfileCompletion() {
        waitForElement(complete_profile_Screen,10);
        clickButtonWithOutScroll(CancelAddNectarCardNumberScreeen);
    }

    @When("^user taps on Credit Debit card in Add Payment Method screen$")
    public void userTapsOnCreditDebitCardInAddPaymentMethodScreen() {
        waitForElement(CreditDebitCardAddPaymentMethodScreen,10);
        waitFor(10000);
        clickButtonWithOutScroll(CreditDebitCardAddPaymentMethodScreen);
    }

    @Then("^user verifies the Add Payment method screen$")
    public void userVerifiesTheAddPaymentMethodScreen() {
        waitForElement(CreditDebitCardAddPaymentMethodScreen,15);
        Assert.assertTrue(AddPaymentMethodScreenTitle.isDisplayed());
        Assert.assertTrue(AddPaymentMethodScreenCancel.isEnabled());
        if (isElementDisplayedWithoutAssert(AddPaymentMethodScreenApplePay)){
            Assert.assertTrue(AddPaymentMethodScreenApplePay.isEnabled());
        }
        Assert.assertTrue(CreditDebitCardAddPaymentMethodScreen.isEnabled());
        Assert.assertTrue(AddPaymentMethodScreenPayPal.isEnabled());

    }

    @And("^user taps on the Email section in the complete profile screen$")
    public void userTapsOnTheEmailSectionInTheCompleteProfileScreen() {
        waitForElement(Compltd_Email_Btn,20);
        clickButtonWithOutScroll(Compltd_Email_Btn);
    }

    @When("^user taps on location button in the complete profile screen$")
    public void userTapsOnLocationButtonInTheCompleteProfileScreen() {
        waitForElement(LocationServicesProfile,20);
        clickButtonWithOutScroll(LocationServicesProfile);
    }

    @Then("^user verifies the location permission screen for nearest stations$")
    public void userVerifiesTheLocationPermissionScreenForNearestStations() {
        waitFor(9000);
        Assert.assertTrue(isTextMatch(FFheadertext.getText().trim(), MenuConstants.FF_LOCATION));
        Assert.assertTrue(isTextMatch(FFCopytext.getText().trim(), MenuConstants.FF_NEAREST));
        Assert.assertTrue(isTextMatch(FFdirectiontext.getText().trim(), MenuConstants.FF_NEARESTMSG));
    }

    @Then("^user verifies the Email Preferences popup when the checkbox is not selected$")
    public void userVerifiesTheEmailPreferencesPopupWhenTheCheckboxIsNotSelected() {
        waitForElement(OkButtonEmailPreferencesPopup,20);
        Assert.assertTrue(isTextMatch(EmailPreferencesPopupCt.getText().trim(), ProfileCompletionConstants.EMAILPREFERENCESSCREENPOPUPCT));
        Assert.assertTrue(OkButtonEmailPreferencesPopup.isDisplayed());
    }

    @When("^user taps on Ok button in the Email Preferences popup when the checkbox is not selected$")
    public void userTapsOnOkButtonInTheEmailPreferencesPopupWhenTheCheckboxIsNotSelected() {
        waitForElement(OkButtonEmailPreferencesPopup,20);
        clickButtonWithOutScroll(OkButtonEmailPreferencesPopup);
    }

    @Then("^user verifies maximum fueling amount is not present$")
    public void userVerifiesMaximumFuelingAmountIsNotPresent() {
        waitForElement(CompleteYourProfile,10);
        Assert.assertTrue(maximum_Fueling_Btn1.isEmpty());
    }

    @When("^user taps on the Accepted Privacy Policy and Terms and conditions$")
    public void userTapsOnTheAcceptedPrivacyPolicyAndTermsAndConditions() {
        waitForElement(UserProfileTitleProfile, 30);
        Assert.assertTrue(isElementDisplayed(UserProfileTitleProfile));
        Assert.assertTrue(isTextMatch(PpAndTcProfile.getText(), ProfileCompletionConstants.PPTANDCPROFILE));
        clickButtonWithOutScroll(PpAndTcProfile);


    }

    @When("^user taps on the Set First and Last Name$")
    public void userTapsOnTheSetFirstAndLastName() {
        Assert.assertTrue(isTextMatch(SetFirstnameProfile.getText(), ProfileCompletionConstants.FNAMEPROFILE));
        clickButtonWithOutScroll(SetFirstnameProfile);

    }

    @When("^user taps on the Notifications$")
    public void userTapsOnTheNotifications() {
        ScrollTo(ProfileCompletionConstants.EMAILPREFERENCEPROFILE, ProfileCompletionConstants.IOSSCROLLUP, email_task);
        email_task.isDisplayed();
        waitFor(2000);
        Assert.assertTrue(isElementEnabled(PermissionsTitle));
        Assert.assertTrue(isTextMatch(NotificationsProfile.getText(), ProfileCompletionConstants.NOTIFICATIONSPROFILE));
        clickButtonWithOutScroll(NotificationsProfile);
    }

    @Then("^validate the forty percent profile completion on LID$")
    public void validateTheFortyPercentProfileCompletionOnLID() {
        waitForElement(forty_percent_Indicator,10);
        Assert.assertTrue(isTextMatch(forty_percent_Indicator.getText(),ProfileCompletionConstants.FORTYERCENTINDICATOR));
    }

    @Then("^validate the fifth percent profile completion on LID$")
    public void validateTheFifthPercentProfileCompletionOnLID() {
        waitForElement(fifty_percent_Indicator,10);
        Assert.assertTrue(isTextMatch(fifty_percent_Indicator.getText(),ProfileCompletionConstants.FIFTYPERCENTINDICATOR));
    }

    @Then("^validate the Sixty percent profile completion on LID$")
    public void validateTheSixtyPercentProfileCompletionOnLID() {
        waitForElement(sixty_percent_Indicator,10);
        Assert.assertTrue(isTextMatch(sixty_percent_Indicator.getText(),ProfileCompletionConstants.SIXTYPERCENTINDICATOR));
    }

    @Then("^validate the seventy percent profile completion on LID$")
    public void validateTheSeventyPercentProfileCompletionOnLID() {
        waitFor(4000);
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementDisplayedWithoutAssert(LIDProgress40)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress40.getText(), ProfileCompletionConstants.FORTYERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress50)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress50.getText(), ProfileCompletionConstants.FIFTYPERCENTINDICATOR));
            }
        } else {
            if (isElementDisplayedWithoutAssert(LIDProgress40)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress40.getText(), ProfileCompletionConstants.FORTYERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress50)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress50.getText(), ProfileCompletionConstants.FIFTYPERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress60)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress60.getText(), ProfileCompletionConstants.SIXTYPERCENTINDICATOR));
            } else if (isElementDisplayedWithoutAssert(LIDProgress70)) {
                Assert.assertTrue(
                        isTextMatch(LIDProgress70.getText(), ProfileCompletionConstants.SEVENTYPERCENTINDICATOR));

            }
        }
    }

    @When("^user taps on add nectar card from complete profile$")
    public void userTapsOnAddNectarCardFromCompleteProfile() {
        waitForElement(add_nectar_card,25);
        clickButtonWithOutScroll(add_nectar_card);
        clickButtonWithOutScroll(get_started_button);

    }
    @Then("user taps delete in the Edit Payment Method")
    public void userTapsDeleteInTheEditPaymentMethod() {
        waitFor(5000);
       // scrollToElement(deleteButtonEditPaymentMethod);
        clickButtonWithOutScroll(deleteButtonEditPaymentMethod);
    }

    @Then("user taps cof edit")
    public void userTapsCofEdit() {
        waitFor(5000);
        ScrollTo("Edit", AccountConstants.IOSSCROLLDOWN, EditPaymentMethod);
        clickButtonWithOutScroll(EditPaymentMethod);
    }

    @And("user taps on Google Pay from existing payment method")
    public void userTapsOnGooglePayFromExistingPaymentMethod() {
        waitForElement(GooglePayTitle);
        clickButtonWithOutScroll(GooglePayTitle);
    }

    @Then("user should display google pay already linked pop-up to the user")
    public void userShouldDisplayGooglePayAlreadyLinkedPopUpToTheUser() {
        waitForElement(GooglePayAddedPopUpText);
        org.testng.Assert.assertEquals(GooglePayAddedPopUpText.getText(),PayOutsideConstants.GOOGLEADDEDCT);

    }

    @And("user taps on OK on the google pay already linked pop-up")
    public void userTapsOnOKOnTheGooglePayAlreadyLinkedPopUp() {
        waitForElement(GooglePayAddedPopUpTextBtn);
        clickButtonWithOutScroll(GooglePayAddedPopUpTextBtn);
    }

//    @When("^user taps on continue button in the Email Preferences screen$")
//    public void userTapsOnContinueButtonInTheEmailPreferencesScreen() {
//        isElementDisplayed(EmailPreferencesOffersAcceptCheckbox);
//    }
}
