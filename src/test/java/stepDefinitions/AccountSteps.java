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

import static contants.AccountConstants.*;

public class AccountSteps extends AccountPage {
	static String UserMailEntered;

	@Given("^user taps on SKIP button$")
	public void user_taps_on_SKIP_button() throws Throwable {
		clickButtonWithOutScroll(AccountSkip);
		if (platformName.equalsIgnoreCase("iOS")) {
			waitForElement(ContinueBtn, 10);
			clickButtonWithOutScroll(ContinueBtn);
			waitForElement(AllowPopup, 10);
			clickButtonWithOutScroll(AllowPopup);
			waitFor(3000);
			if (isElementDisplayedWithoutAssert(Allow)) {
				clickButtonWithOutScroll(Allow);
			}
			waitFor(3000);
			if (isElementDisplayedWithoutAssert(okBtn)) {
				clickButtonWithOutScroll(okBtn);
			}
			waitFor(3000);
			if (isElementDisplayedWithoutAssert(PlannedMaintenance)) {
				clickButtonWithOutScroll(okBtn);
			}
		} else {
			waitForElement(AccountOkBtn, 10);
			clickButtonWithOutScroll(AccountOkBtn);
		}
	}

	@And("^user is in login screen$")
	public void user_is_in_login_screen() throws Throwable {
		waitForElement(AccountLogin, 20);
		clickButtonWithOutScroll(AccountLogin);
	}

	@When("^user enters login username and pwd$")
	public void user_enters_login_username_and_pwd() throws Throwable {
		enterTextWithoutScroll(AccountEmail, AccountConstants.ACCOUNTEMAIL);
		enterTextWithoutScroll(AccountPassword, AccountConstants.ACCOUNTPASSWORD);
	}

	@And("^user clicks on more icon$")
	public void user_clicks_on_more_icon() throws Throwable {
		waitForElement(AccountMore, 15);
		clickButtonWithOutScroll(AccountMore);
	}

	@Then("^user clicks on Account$")
	public void user_clicks_on_account() throws Throwable {
		//waitForElement(account_icon,10);
		webDriverWaitForElement(10).until(ExpectedConditions.elementToBeClickable(AccountBtn));
		clickButtonWithOutScroll(AccountBtn);
	}

	@Then("^user clicks on Add nectar card button$")
	public void user_clicks_on_add_nectar_card_button() throws Throwable {
		waitForElement(UserProfileAccount, 10);
		if (platformName.equalsIgnoreCase("Android")) {
			ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, AccountNectarCardSection);
			//scrollToElement(add_nectar_Account);
			clickButtonWithOutScroll(add_nectar_Account);
		} else {
			ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
			waitForElement(add_nectar_Account, 15);
			clickButtonWithOutScroll(add_nectar_Account);
		}
	}

	@When("^I enter \"([^\"]*)\" in login details$")
	public void MIDirectUser1iEnterInLoginDetails(String userType) {
		if (platformName.equalsIgnoreCase("Android")) {
			waitForElement(AccountEmail, 25);
			clickButtonWithOutScroll(AccountEmail);
			waitForElement(NONEOFTHEABOVE, 10);
			if (isElementDisplayedWithoutAssert(NONEOFTHEABOVE)) {
				clickButtonWithOutScroll(NONEOFTHEABOVE);
			}
			waitForElement(AccountEmail, 25);
			try {
				enterTextWithoutScroll(AccountEmail, getTestDataValues(loginclass_path, userType)[0]);
				enterTextWithoutScroll(AccountPassword, getTestDataValues(loginclass_path, userType)[1]);
			} catch (Exception E) {
				driver.navigate().back();
				logger.info("LOADER WAS PRESENT");
				waitForElement(AccountEmail, 25);
				enterTextWithoutScroll(AccountEmail, getTestDataValues(loginclass_path, userType)[0]);
				enterTextWithoutScroll(AccountPassword, getTestDataValues(loginclass_path, userType)[1]);
			}

		} else {
			waitForElement(AccountEmail, 20);
			enterTextWithoutScroll(AccountEmail, getTestDataValues(loginclass_path, userType)[0]);
			enterTextWithoutScroll(AccountPassword, getTestDataValues(loginclass_path, userType)[1]);

		}
	}

	@When("^user taps login button in login screen$")
	public void user_taps_login_button_in_login_screen() throws Throwable {
		waitForElement(AccountLoginBtn, 10);
		clickButtonWithOutScroll(AccountLoginBtn);
		waitFor(8000);
		if (isElementEnabled(LoginSave)) {
			clickButtonWithOutScroll(LoginSave);
		}
		if (isElementEnabled(Alertitle)) {
			if (AccountConstants.LOGINNTFCT.equalsIgnoreCase(Alertitle.getText())) {
				clickButtonWithOutScroll(okBtn);
			}
		}
		waitFor(10000);
		if (isElementEnabled(NotNowButtonLID)) {
			clickButtonWithOutScroll(NotNowButtonLID);
		}
		waitFor(5000);
		if (isElementEnabled(CloseButtonModalPopupLid)) {
			clickButtonWithOutScroll(CloseButtonModalPopupLid);
		}
		if (isElementDisplayedWithoutAssert(CardMessagePopupLid)) {
			clickButtonWithOutScroll(CardMessagePopupLidOk);
		}

	}

	@When("^user taps on More button in tab bar$")
	public void user_taps_on_More_button_in_tab_bar() throws Throwable {
		if (platformName.equalsIgnoreCase("Android")) {
			waitForElement(AccountMore, 50);
			clickButtonWithRetry(AccountMore);
			logger.info("User is on more screen");
		} else {
			if (isElementDisplayedWithoutAssert(FFheadertext)) {
				clickButtonWithOutScroll(AllowLocContinueButton);
				if (isElementDisplayedWithoutAssert(AllowPopupHeader)) {
					clickButtonWithOutScroll(AllowOncePopup);
					if (isElementDisplayedWithoutAssert(LocationPermissionSuccessScreen)) {
						clickButtonWithOutScroll(LocationPermissionContinueButton);
						logger.info("User is on more screen");
					}
				}
			}
			waitForElement(AccountMore, 30);
			clickButtonWithOutScroll(AccountMore);
			logger.info("User is on more screen");
		}
	}

	@When("^user navigates to Products and Information screen$")
	public void user_navigates_to_about_firstfuel_screen() throws Throwable {
		waitForElement(ProductsAndInformation, 10);
		clickButtonWithOutScroll(ProductsAndInformation);
	}

	@When("^user navigates to Account screen$")
	public void user_navigates_to_Account_screen() throws Throwable {
		waitForElement(AccountBtn, 25);
		clickButtonWithOutScroll(AccountBtn);
		logger.info("User is on Account screen");
	}


	@And("^user taps on Edit Pay Pal account in Account screen$")
	public void user_taps_on_edit_pay_pal_account_in_account_screen() throws Throwable {
		waitForElement(PaypalEdit, 25);
		clickButtonWithOutScroll(PaypalEdit);
		waitForElement(PaypalSignout, 5);
		clickButtonWithOutScroll(PaypalSignout);
	}

	@Then("^validate the please log into your account$")
	public void validate_the_please_log_into_your_account() throws Throwable {
		staticTextValidation(Accountct, AccountConstants.Accountctmsg);
	}

//	@When("^user navigates to forgot your password$")
//	public void user_navigates_to_forgot_your_password() throws Throwable {
//		clickButtonWithOutScroll(Forgetpass);
//	}

	@When("^user enters the reset email$")
	public void user_enters_the_reset_email() throws Throwable {
		enterTextWithoutScroll(Forgetmail, AccountConstants.ACCOUNTEMAIL);

	}

	@Then("^validate the reset email verify message$")
	public void validate_the_reset_email_verify_message() throws Throwable {

		staticTextValidation(Resetmsg, AccountConstants.Resetmsg);
	}

	@And("^user taps send button$")
	public void user_taps_send_button() throws Throwable {
		clickButtonWithOutScroll(send);
		waitFor(6000);
	}

	@Then("^user enters invalid Password in New Password field$")
	public void user_enters_invalid_Password_in_New_Password_field() throws Throwable {
		enterTextWithoutScroll(NewPassword, AccountConstants.INVALIDPASSWORD);
	}

//	@Then("^verify validation text for Incorrect details as per validation rules of New Password field$")
//	public void verify_validation_text_for_Incorrect_details_as_per_validation_rules_of_NewPassword_field()
//			throws Throwable {
//		staticTextValidation(NewPasswordError, AccountConstants.INVALIDPASSWORDVALIDATIONMSG);
//	}

	@When("^Check System to display Copy Text of info icon And Check dismiss the prompt on tapping OK button from the prompt$")
	public void check_System_to_display_Copy_Text_of_info_icon_And_Check_dismiss_the_prompt_on_tapping_OK_button_from_the_prompt()
			throws Throwable {
		isElementDisplayed(AccountInfoIcon);
		staticTextValidation(AccountMessage, AccountConstants.ACCOUNTMSGTEXT);
		clickButtonWithOutScroll(AccountOkBtn);
	}

	@When("^user taps on Privacy Policy link$")
	public void user_taps_on_Privacy_Policy_link() throws Throwable {
		waitForElement(PasswordEdit, 20);
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
		clickButtonWithOutScroll(AccountPrivacyPolicy);
		waitFor(5000);
	}

	@Then("^verify user navigates to Privacy Policy screen$")
	public void verify_user_navigates_to_Privacy_Policy_screen() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			Assert.assertTrue(isElementDisplayed(HeadTxt));
		} else {
			staticTextValidation(HeadTxt, AccountConstants.PRIVACYTXT);
		}
	}

	@Then("^user taps on Close button$")
	public void user_taps_on_Close_button() throws Throwable {
		clickButtonWithOutScroll(PrivacyCloseBtn);
	}

	@Then("^verify navigate back to account page$")
	public void verify_navigate_back_to_account_page() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			isElementDisplayed(HeadTxt);
		} else {
			staticTextValidation(HeadTxt, AccountConstants.ACCOUNTHEAD);
		}
	}

	@When("^user taps on Terms and Conditions link$")
	public void user_taps_on_Terms_and_Conditions_lnk() throws Throwable {
		waitForElement(PasswordEdit, 20);
		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, TermsACondition);
		clickButtonWithOutScroll(TermsACondition);
	}

	@Then("^verify user navigates to Terms and Conditions screen$")
	public void verify_user_navigates_to_Terms_and_Conditions_screen() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			isElementDisplayed(HeadTxt);
		} else {
			staticTextValidation(HeadTxt, AccountConstants.TERMSTXT);
		}
	}

	@And("^user taps LogOut button in Account screen$")
	public void user_taps_logout_button_in_account_screen() throws Throwable {
		waitFor(7000);
		if ("IOS".equalsIgnoreCase(platformName)) {
			ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
			waitForElement(LogOut, 5);
			clickButtonWithOutScroll(LogOut);
		} else {
			try {
				ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			} catch (Exception e) {
				ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			}
			clickButtonWithOutScroll(LogOut);
		}
	}

	@Then("^user edit name by entering firstname and lastname$")
	public void user_edit_name_by_entering_firstname_and_lastname() throws Throwable {
		waitForElement(UserProfileAccount, 10);
		clickButtonWithOutScroll(UserEdit);
		waitForElement(EditFname, 10);
		enterTextWithoutScroll(EditFname, AccountConstants.REFNAME);
		enterTextWithoutScroll(EditLname, AccountConstants.RELNAME);
	}

	@Then("^revert firstname and lastname$")
	public void revert_firstname_and_lastname() throws Throwable {
		enterTextWithoutScroll(EditFname, AccountConstants.FNAME);
		enterTextWithoutScroll(EditLname, AccountConstants.LNAME);
	}

	@And("^tap on update button$")
	public void tap_on_update_button() throws Throwable {
		if (isElementDisplayedWithoutAssert(DoneButtonInNectarKeypad)) {
			clickButtonWithOutScroll(DoneButtonInNectarKeypad);
		}
		hideMobileKeyboard();
		clickButtonWithOutScroll(EditUpdate);
		waitFor(5000);
	}

	@Then("^verify navigate back to account screen after tapping ok button$")
	public void verify_navigate_back_to_account_screen_after_tapping_ok_button() throws Throwable {
		clickButtonWithOutScroll(EditOK);
		waitFor(6000);
		waitElementToBeClickable(UserEdit);
		if ("IOS".equalsIgnoreCase(platformName)) {
//			staticTextValidation(AccountFullName, AccountConstants.EDITNAME);
			Assert.assertTrue(AccountFullName.getText().contains(AccountConstants.EDITNAME));
		} else {
			staticTextValidation(AccountFullName, AccountConstants.EDITNAME);
		}
	}

	@Then("^reset data to original form$")
	public void reset_data_to_original_form() throws Throwable {
		clickButtonWithOutScroll(UserEdit);
		enterTextWithoutScroll(EditFname, AccountConstants.FNAME);
		enterTextWithoutScroll(EditLname, AccountConstants.LNAME);
		clickButtonWithOutScroll(EditUpdate);
		clickButtonWithOutScroll(EditOK);
	}

	@And("^user taps on cancel$")
	public void user_taps_on_cancel() throws Throwable {
		clickButtonWithOutScroll(PrivacyCloseBtn);
	}

	@Then("^verify navigate back to account screen after tapping cancel$")
	public void verify_navigate_back_to_account_screen_after_tapping_cancel() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			isElementDisplayed(AccountFullName);
		} else {
			staticTextValidation(AccountFullName, AccountConstants.NAME);
		}
	}

	@Then("^user taps on email info icon$")
	public void user_taps_on_email_info_icon() throws Throwable {
		clickButtonWithOutScroll(EmailInfoIcon);
	}

	@And("^Verify System to display Copy Text in info$")
	public void verify_system_to_display_copy_text_in_info() throws Throwable {
		isElementDisplayed(EmailInfo);
	}

	@Then("^user taps on GOT IT button$")
	public void user_taps_on_got_it_button() throws Throwable {
		if (isElementDisplayedWithoutAssert(EmailInfoX)) {
			clickButtonWithOutScroll(EmailInfoX);
		}
	}

	@When("^user taps on edit usr pwd$")
	public void user_taps_on_edit_usr_pwd() throws Throwable {
		waitForElement(PasswordEdit, 10);
		clickButtonWithOutScroll(PasswordEdit);
	}

	@Then("^user tap on Done button$")
	public void user_tap_on_done_button() throws Throwable {
		if (isElementDisplayedWithoutAssert(KayDone)) {
			clickButtonWithOutScroll(KayDone);
		}
		waitForElement(PassWordDone, 15);
		clickButtonWithOutScroll(PassWordDone);
		waitFor(5000);
	}

//	@Then("^verify Inline error message for Current Password New Password$")
//	public void verify_inline_error_message_for_current_password_new_password() throws Throwable {
//		staticTextValidation(CurrentPassError, AccountConstants.CURRENTERMSG);
//		staticTextValidation(NewPasswordError, AccountConstants.NEWERMSG);
//	}

	@And("^user enters incorrect Current Password$")
	public void user_enters_incorrect_current_password() throws Throwable {
		enterTextWithoutScroll(CurrentPassword, AccountConstants.CURRENTPASS);
	}

	@And("^user enters New Password$")
	public void user_enters_new_password() throws Throwable {
		waitFor(2000);
		enterTextWithoutScroll(NewPassword, AccountConstants.NEWPASS1);
	}

	@And("^user enters Confirm New Password$")
	public void user_enters_confirm_new_password() throws Throwable {
		if (isElementDisplayedWithoutAssert(HideKeyPadMobileRegistration)) {
			clickButtonWithOutScroll(HideKeyPadMobileRegistration);
		}
		enterTextWithoutScroll(ConfirmPassword, AccountConstants.CONFIRMPASS);
	}

	@Then("^Verify promt message for Incorrect Current Password$")
	public void verify_promt_message_for_incorrect_current_password() throws Throwable {
		isElementDisplayed(IncorrectPassErrorMessage);
	}

	@Then("^verify copy text message for password changed$")
	public void verify_copy_text_message_for_password_changed() throws Throwable {
		waitForElement(LocCpyTXT, 25);
//		if ("IOS".equalsIgnoreCase(platformName)) {
//			staticTextValidation(LocCpyTXT, AccountConstants.PASSWRDCNGTXT);
//		} else {
		staticTextValidation(LocCpyTXT, AccountConstants.PASSWRDCNGTXT);
//		}
	}
//
//	@Then("^user should see Star Rewards section below Maximum Fuelling$")
//	public void user_should_see_star_rewards_section_below_maximum_fuelling() throws Throwable {
//		isElementDisplayed(StarRewards);
//	}

	@Then("^Tap on Maximum Fueling Amount edit button$")
	public void tap_on_maximum_fueling_amount_edit_button() throws Throwable {
		waitForElement(PasswordEdit, 20);
		if ("IOS".equalsIgnoreCase(platformName)) {
			ScrollTo(AccountConstants.MaxiumumFuelling, AccountConstants.IOSSCROLLUP, MaxFuelAmtCk);
			clickButtonWithOutScroll(MaxFuelEditLk);
		} else {
			ScrollTo(AccountConstants.MaximumFuellingAmount, AccountConstants.IOSSCROLLUP, MaxFuelEditLk);
			clickButtonWithOutScroll(MaxFuelEditLk);
		}
	}

	@Then("^Select Maximum Fuelling Amount Amount$")
	public void select_maximum_fuelling_amount_amount() throws Throwable {
		clickButtonWithOutScroll(MaxFuelOK);
	}

	@And("^validate the updated Maximum Fueling Amount value$")
	public void validate_the_updated_maximum_fueling_amount_value() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			staticTextValidation(FuellingAmountAccount, AccountConstants.MAXFUELUPAMT);
		} else {
			staticTextValidation(MaxFuelAmtCk, AccountConstants.MAXFUELUPAMT);
		}
	}

	@Then("^Tap on cancel button and validate maximum fuel amount$")
	public void tap_on_cancel_button_and_validate_maximum_fuel_amount() throws Throwable {
		waitFor(5000);
		clickButtonWithOutScroll(MaxFuelCncl);
		if ("IOS".equalsIgnoreCase(platformName)) {
			staticTextValidation(FuellingAmountAccount, AccountConstants.MAXFUELUPAMT);
		} else {
			staticTextValidation(MaxFuelAmtCk, AccountConstants.MAXFUELUPAMT);
		}
	}

	@Then("^scroll to location service toggle button$")
	public void scroll_to_location_service_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			ScrollTo(AccountConstants.LOCATIONSERVS, AccountConstants.IOSSCROLLUP, LocSrcSwitch);
		}
	}

	@And("^Turn On location service toggle button$")
	public void turn_on_location_service_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocSrcSwitch);
		}
	}

	@Then("^click on allow button in permission popup and validate toggle switch$")
	public void click_on_allow_button_in_permission_popup_and_validate_toggle_switch() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocAllow);
			staticTextValidation(LocSrcSwitch, AccountConstants.SWITCHON);
		}
	}

	@Then("^click on deny button in permission popup and validate toggle switch$")
	public void click_on_deny_button_in_permission_popup_and_validate_toggle_switch() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocDeny);
			staticTextValidation(LocSrcSwitch, AccountConstants.SWITCHOFF);
		}
	}

	@Then("^scroll to Camera Access toggle button$")
	public void scroll_to_camera_access_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			//ScrollTo(AccountConstants.CAMSERVS, AccountConstants.CAMSERVS, MaxFuelInfo);
		}
	}

	@And("^Turn On Camera access toggle button$")
	public void turn_on_camera_access_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(CamSwitch);
		}
	}

	@Then("^click on deny button in camera permission popup and validate toggle switch$")
	public void click_on_deny_button_in_camera_permission_popup_and_validate_toggle_switch() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocDeny);
			staticTextValidation(CamSwitch, AccountConstants.SWITCHOFF);
		}
	}

	@Then("^click on allow button in camera permission popup and validate toggle switch$")
	public void click_on_allow_button_in_camera_permission_popup_and_validate_toggle_switch() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocAllow);
			staticTextValidation(CamSwitch, AccountConstants.SWITCHON);
		}
	}

	@And("^switch off location search toggle button$")
	public void switch_off_location_search_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(LocSrcSwitch);
		}
	}

	@And("^validate Copy text message for location pop up$")
	public void validate_copy_text_message_for_location_pop_up() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			staticTextValidation(LocCpyTXT, AccountConstants.LOCMSG);
		}
	}

	@Then("^tap on ok button and close location copy text$")
	public void tap_on_ok_button_and_close_location_copy_text() throws Throwable {
		waitForElement(okBtn,25);
		if ("IOS".equalsIgnoreCase(platformName)) {
			clickButtonWithOutScroll(okBtn);
			if (isElementDisplayedWithoutAssert(FaceIdScreen)) {
				clickButtonWithOutScroll(BiometricsIdSkip);
			}
			if (isElementDisplayedWithoutAssert(TouchIdScreen)) {
				clickButtonWithOutScroll(BiometricsIdSkip);
			}
		} else {
			clickButtonWithOutScroll(okBtn);
		}

	}

	@Then("^switch off Camera toggle button$")
	public void switch_off_camera_toggle_button() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			clickButtonWithOutScroll(CamSwitch);
		}
	}

	@And("^validate Copy text message for Camera pop up$")
	public void validate_copy_text_message_for_camera_pop_up() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			logger.info("Not applicable for IOS");
		} else {
			staticTextValidation(LocCpyTXT, AccountConstants.LOCMSG);
		}
	}

//	@Then("^user should opt for receipts by email checkbox$")
//	public void user_should_opt_for_receipts_by_email_checkbox() throws Throwable {
//		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, TermsACondition);
//		if (platformName.equalsIgnoreCase("android")) {
//			if (ReceiptCKbx.getAttribute("checked").equalsIgnoreCase("true")) {
//				clickButtonWithOutScroll(ReceiptCKbx);
//				clickButtonWithOutScroll(okBtn);
//			}
//			clickButtonWithOutScroll(ReceiptCKbx);
//		} else {
//			if (isElementDisplayedWithoutAssert(ReceiptCKbx)) {
//				clickButtonWithOutScroll(ReceiptCKbx);
//				clickButtonWithOutScroll(okBtn);
//			}
//			clickButtonWithOutScroll(emailUnCircleCheck_box);
//		}
	// }

	@And("^user should validate the receipt checkbox copy text$")
	public void user_should_validate_the_receipt_checkbox_copy_text() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			waitFor(5000);
			isElementDisplayedWithoutAssert(mailOPTPopUP);
		} else {
			staticTextValidation(LocCpyTXT, AccountConstants.RECEIPTMSG);
		}
	}

	@Then("^user should opt out for receipts by email checkbox$")
	public void user_should_opt_out_for_receipts_by_email_checkbox() throws Throwable {
		waitForElement(UserProfileAccount, 20);
		if (platformName.equalsIgnoreCase("android")) {
			TermsACondition.isDisplayed();
			if (ReceiptCKbx.getAttribute("checked").equalsIgnoreCase("false")) {
				clickButtonWithOutScroll(ReceiptCKbx);
				waitForElement(okBtn);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(ReceiptCKbx);
		} else {
			try {
				ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			} catch (Exception e) {
				ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			}
			waitForElement(ReceiptCKbx, 15);
			if (ReceiptCKbx.getAttribute("label").equalsIgnoreCase("circleUnCheck")) {
				clickButtonWithOutScroll(ReceiptCKbx);
				waitForElement(okBtn);
				clickButtonWithOutScroll(okBtn);
			}
//			if (isElementDisplayedWithoutAssert(emailUnCircleCheck_box)) {
//				clickButtonWithOutScroll(emailUnCircleCheck_box);
//				waitForElement(okBtn);
//				clickButtonWithOutScroll(okBtn);
//			}
			clickButtonWithOutScroll(ReceiptCKbx);
		}
	}

	@And("^user should validate the receipt checkbox copy text for not opting to receive emails$")
	public void user_should_validate_the_receipt_checkbox_copy_text_for_not_opting_to_receive_emails()
			throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			waitForElement(mailOPTOUTPopUP, 10);
			staticTextValidation(mailOPTOUTPopUP, AccountConstants.RECEIPTMSGNO);
		} else {
			waitForElement(okBtn, 20);
			staticTextValidation(LocCpyTXT, AccountConstants.RECEIPTMSGNO);
		}
	}

	@Then("^user should opt for Offers by email checkbox$")
	public void user_should_opt_for_offers_by_email_checkbox() throws Throwable {
		waitForElement(PasswordEdit, 20);
		if (platformName.equalsIgnoreCase("android")) {
			ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			if (OfferCheck.getAttribute("checked").equalsIgnoreCase("true")) {
				clickButtonWithOutScroll(OfferCheck);
				waitForElement(okBtn, 10);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(OfferCheck);
			waitForElement(LocCpyTXT, 20);
		} else {
			try {
				ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			} catch (Exception e) {
				ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			}
			waitForElement(OfferCheck, 25);
			if (OfferCheck.getAttribute("label").equalsIgnoreCase("circleCheck")) {
				clickButtonWithOutScroll(OfferCheck);
				waitForElement(okBtn, 20);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(OfferCheck);

//			if (isElementDisplayedWithoutAssert(promotionsCircleCheck_box)) {
//				clickButtonWithOutScroll(promotionsCircleCheck_box);
//				waitForElement(okBtn,10);
//				clickButtonWithOutScroll(okBtn);
//			}
//			clickButtonWithOutScroll(promotionsUnCircleCheck_box);
		}
	}

	@And("^user should validate the offer checkbox copy text for opting to receive emails$")
	public void user_should_validate_the_offer_checkbox_copy_text_for_opting_to_receive_emails() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			waitForElement(Promotion_OPT_IN_POpup, 10);
			staticTextValidation(Promotion_OPT_IN_POpup, AccountConstants.OFFERMSG);
			isElementDisplayed(Promotion_OPT_IN_POpup);
		} else {
			waitForElement(okBtn, 20);
			staticTextValidation(LocCpyTXT, AccountConstants.OFFERMSG);
		}
	}

	@Then("^user should opt out for Offers by email checkbox$")
	public void user_should_opt_out_for_offers_by_email_checkbox() throws Throwable {
		waitForElement(PasswordEdit, 20);
		ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
		if (platformName.equalsIgnoreCase("android")) {
			if (OfferCheck.getAttribute("checked").equalsIgnoreCase("false")) {
				clickButtonWithOutScroll(OfferCheck);
				waitForElement(okBtn);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(OfferCheck);
		} else {
			try {
				ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			} catch (Exception e) {
				ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			}

			waitForElement(OfferCheck, 25);
			if (OfferCheck.getAttribute("label").equalsIgnoreCase("circleUnCheck")) {
				clickButtonWithOutScroll(OfferCheck);
				waitForElement(okBtn, 25);
				clickButtonWithOutScroll(okBtn);
			}
			clickButtonWithOutScroll(OfferCheck);


//			if (isElementDisplayedWithoutAssert(promotionsUnCircleCheck_box)) {
//				clickButtonWithOutScroll(promotionsUnCircleCheck_box);
//				waitForElement(okBtn);
//				clickButtonWithOutScroll(okBtn);
//			}
//			clickButtonWithOutScroll(promotionsCircleCheck_box);
		}
	}

	@And("^user should validate the offer checkbox copy text for not opting to receive emails$")
	public void user_should_validate_the_offer_checkbox_copy_text_for_not_opting_to_receive_emails() throws Throwable {
		if ("IOS".equalsIgnoreCase(platformName)) {
			waitForElement(Promotion_OPT_OUT_POpup, 10);
			staticTextValidation(Promotion_OPT_OUT_POpup, AccountConstants.NOOFFERMSG);
		} else {
			waitForElement(okBtn, 10);
			staticTextValidation(LocCpyTXT, AccountConstants.NOOFFERMSG);
		}
	}

	@Then("^Tap on Maximum Fueling info icon$")
	public void tap_on_maximum_fueling_info_icon() throws Throwable {
		ScrollTo(AccountConstants.MaxiumumFuelling, AccountConstants.IOSSCROLLUP, MaxFuelInfo);
		clickButtonWithOutScroll(MaxFuelInfo);
	}

	@And("^validate the Maximum Fueling copytext$")
	public void validate_the_maximum_fueling_copytext() throws Throwable {
		isElementDisplayed(MaxFuelInfoTxt);
	}

	@Then("^validate Maximum fueling amount$")
	public void validate_maximum_fueling_amount() throws Throwable {
		isElementDisplayed(MaxFuelAmtCk);
	}

	@And("^user enters New Password to check tick mark for acieving password criteria$")
	public void user_enters_new_password_to_check_tick_mark_for_acieving_password_criteria() throws Throwable {
		enterTextWithoutScroll(NewPassword, AccountConstants.ACCOUNTPASSWORD);
		isElementDisplayed(PassValidationTick1);
		isElementDisplayed(PassValidationTick2);
		isElementDisplayed(PassValidationTick3);
	}

//	@And("^user enters New Password and check password criteria being displayed$")
//	public void user_enters_new_password_and_check_password_criteria_being_displayed() throws Throwable {
//		enterTextWithoutScroll(NewPassword, AccountConstants.ACCOUNTPASSWORD);
//		isElementDisplayed(PassValidation1);
//		isElementDisplayed(PassValidation2);
//		isElementDisplayed(PassValidation3);
//	}

//	@Then("^user able to view components heading, BackButton, USER profile, Email address$")
//	public void user_able_to_view_components_heading_backbutton_user_profile_email_address() throws Throwable {
//		isElementDisplayed(HeadTxt);
//		isElementDisplayed(BackBtn);
//		isElementDisplayed(AcctEmail);
//		isElementDisplayed(AcctLayOut);
//	}

	@And("^Camera Access, Receipt Preferences, Marketing Email Preferences, Terms & Condition, Privacy Policy, LOG OUT$")
	public void camera_access_receipt_preferences_marketing_email_preferences_terms_condition_privacy_policy_log_out()
			throws Throwable {
		if (platformName.equalsIgnoreCase("iOS")) {
			isElementDisplayed(AcctCam);
		}
		isElementDisplayed(AcctRecipt);
		isElementDisplayed(AcctRctMsg);
		isElementDisplayed(TermsACondition);
		isElementDisplayed(AccountPrivacyPolicy);
		isElementDisplayed(LogOut);
	}

	@Then("^tap on ok button and close receipt checkbox copy text$")
	public void tapOnOkButtonAndCloseReceiptCheckboxCopyText() {
		clickButtonWithOutScroll(okBtn);
	}

	@When("^user verify the location services status is on$")
	public void userVerifyTheLocationServicesStatusIsOn() {
		try {
			LocationServicesAcc.isDisplayed();
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}

	@And("^user taps on Go To Settings link under notifications section$")
	public void userTapsOnGoToSettingsLinkUnderNotificationsSection() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			clickButtonWithOutScroll(NotifGoToSettings);
			waitFor(2000);
			isElementDisplayed(NotificationsTitleAccount);
			waitForElement(NotificationScroll);
			clickButtonWithOutScroll(NotificationScroll);
			waitForElement(NotificationStatus, 5);
			clickButtonWithOutScroll(NotificationStatus);
			waitForElement(NotifAllow);
			clickButtonWithOutScroll(NotifAllow);
			waitForElement(Devicebackbutton);
			clickButtonWithOutScroll(Devicebackbutton);
			waitForElement(Devicebackbutton);
			clickButtonWithOutScroll(Devicebackbutton);
			isElementDisplayed(NotificationsTitleAccount);

		} else {

			clickButtonWithOutScroll(NotifGoToSettings);
		}

	}

	@Then("^verify the user is navigated to device permission screen$")
	public void verifyTheUserIsNavigatedToDevicePermissionScreen() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			if (isElementDisplayedWithoutAssert(AppInfo)) {
				isElementDisplayed(AppInfo);
			} else if (isElementDisplayedWithoutAssert(AccountMessage)) {
				staticTextValidation(LocCpyTXT, AccountConstants.LOCMSG);
				clickButtonWithOutScroll(okBtn);
			}
		} else {
			Assert.assertTrue(PermissionScrn.isEnabled());
		}
	}

	@And("^Disable the notification access$")
	public void disableTheNotificationAccess() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			clickButtonWithOutScroll(NotificationSettin);
			clickButtonWithOutScroll(NotifAllow);
			androidBack();
			androidBack();
			ScrollTo(AccountConstants.NOTIFICATIONS, AccountConstants.IOSSCROLLDOWN, NotificationSettin);

		} else {
			clickButtonWithOutScroll(NotificationSettin);
			clickButtonWithOutScroll(NotifAllow);
		}
	}

	@And("^navigate to the account screen$")
	public void navigateToTheAccountScreenAndVerifyTheStatusOfLocationServices() {
		clickButtonWithOutScroll(AccountMore);
		if (AccountBtn.isDisplayed()) {
			clickButtonWithOutScroll(AccountBtn);
		}
	}

//	@Then("^verify the status of Location Services$")
//	public void verifyTheStatusOfLocationServices() {
//		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, NotificationScroll);
//		if ("ANDROID".equalsIgnoreCase(platformName)) {
//			staticTextValidation(LocationOFF, AccountConstants.SWITCHOFF);
//		} else {
//			clickButtonWithOutScroll(StationFinder);
//			waitForElement(ContinueBtn);
//			clickButtonWithOutScroll(ContinueBtn);
//			if (isElementDisplayedWithoutAssert(DontAllow))
//				clickButtonWithOutScroll(DontAllow);
//			waitForElement(DisabledCancel);
//			while (isElementDisplayedWithoutAssert(DisabledCancel))
//				clickButtonWithOutScroll(DisabledCancel);
//			clickButtonWithOutScroll(AccountMore);
//			if (AccountBtn.isDisplayed()) {
//				clickButtonWithOutScroll(AccountBtn);
//			}
//			Assert.assertTrue(LocationOFF.isEnabled());
//		}
//	}

//	@When("^location services is switched off$")
//	public void location_services_is_switched_off() throws Throwable {
//		ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, NotificationScroll);
//		if ("ANDROID".equalsIgnoreCase(platformName)) {
//			if (AccountConstants.SWITCHOFF.equalsIgnoreCase(LocationOFF.getText())) {
//				clickButtonWithOutScroll(LocGoToSettings);
//				waitForElement(AllowPopup, 5);
//				clickButtonWithOutScroll(AllowPopup);
//			}
//		}
//	}

//	@And("^navigate to start fuel screen to allow Camera access$")
//	public void navigateToStartFuelScreenToAllowCameraAccess() {
//		if ("IOS".equalsIgnoreCase(platformName)) {
//			clickButtonWithOutScroll(FuelScr);
//			waitForElement(Start);
//			clickButtonWithOutScroll(Start);
//			waitForElement(ScanQRCode);
//			clickButtonWithOutScroll(ScanQRCode);
//			clickButtonWithOutScroll(AccountOkBtn);
//			waitForElement(CancelBtn);
//			clickButtonWithOutScroll(CancelBtn);
//			waitForElement(NavBck);
//			clickButtonWithOutScroll(NavBck);
//			navigateToTheAccountScreenAndVerifyTheStatusOfLocationServices();
//		}
//	}

	@Then("^Verify the status of the Camera Access$")
	public void verifyTheStatusOfTheCameraAccess() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			if (AccountConstants.SWITCHOFF.equalsIgnoreCase(CameraON.getText())) {
				clickButtonWithOutScroll(CameraON);
				clickButtonWithOutScroll(AllowPopup);
			}
		}
	}

	@And("^tap on the Go To Settings under camera access$")
	public void tapOnTheGoToSettingsUnderCameraAccess() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			clickButtonWithOutScroll(NotifGoToSettings);
			waitFor(2000);
			isElementDisplayed(CameraAccess);

		} else {
			clickButtonWithOutScroll(NotifGoToSettings);
			waitFor(2000);
			isElementDisplayed(CameraAccess);
		}
	}

	@Then("^verify the camera access in settings screen$")
	public void verify_the_camera_access_in_settings_screen() throws Throwable {

	}

	@Then("^disable the camera access for the user$")
	public void disableTheCameraAccessForTheUser() {
		if (isElementDisplayedWithoutAssert(AccountMessage)) {
			staticTextValidation(AccountMessage, AccountConstants.SETTINGMSG);
			clickButtonWithOutScroll(okBtn);

		} else {
			isElementDisplayed(CameraAccess);
		}
	}

	@And("^verify the user profile link in the Account screen$")
	public void verifyTheUserProfileLinkInTheAccountScreen() {
		clickButtonWithOutScroll(UserProfileLink);
	}

	@Then("^verify the email field is non editable$")
	public void verifyTheEmailFieldIsNonEditable() {
		isElementDisplayed(EmailField);
	}

	@And("^verify the Copy Text in the userinfo link$")
	public void verifyTheCopyTextInTheUserinfoLink() {
		staticTextValidation(EmailCT, AccountConstants.EmailCT);
		clickButtonWithOutScroll(EmailInfoX);
	}

	@And("^Verify the change password screen$")
	public void verifyTheChangePasswordScreen() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(HeadTxt, AccountConstants.EDITPASS);
		} else {
			waitForElement(EdtPasswordScr, 8);
			isElementDisplayed(EdtPasswordScr);
			Assert.assertTrue(CurrentPassword.isDisplayed());
			Assert.assertTrue(NewPassword.isDisplayed());
			Assert.assertTrue(ConfirmPassword.isDisplayed());
//			Assert.assertTrue(CancelBtn.isEnabled());

		}
	}

	@And("^user Taps on show button and verify the password typed is shown to the user$")
	public void userTapsOnShowButtonAndVerifyThePasswordTypedIsShownToTheUser() {
		clickButtonWithOutScroll(currentPwdShw);
		staticTextValidation(Currpassshwfield, AccountConstants.ACCOUNTPASSWORD);
		// staticTextValidation(currentPwdShw, SignInConstants.HIDE);
	}

	@Then("^Tap the Back button and verify the user navigated to the Account screen$")
	public void tapTheBackButtonAndVerifyTheUserNavigatedToTheAccountScreen() {
		clickButtonWithOutScroll(CancelBtn);
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(HeadTxt, AccountConstants.ACCOUNTHEAD);
		} else {
			isElementDisplayed(AccountScrn);
		}
	}

	@And("^user verify the tick marks are not visible$")
	public void userVerifyTheTickMarksAreNotVisible() {
		if (isElementDisplayedWithoutAssert(Tick1)) {
			Assert.fail();
		}
		if (isElementDisplayedWithoutAssert(Tick2)) {
			Assert.fail();
		}
		if (isElementDisplayedWithoutAssert(Tick3)) {
			Assert.fail();
		}
	}

	@Then("^user verify the tick marks are visible$")
	public void userVerifyTheTickMarksAreVisible() {
		Assert.assertTrue(Tick1.isEnabled());
		Assert.assertTrue(Tick2.isEnabled());
		Assert.assertTrue(Tick3.isEnabled());
	}

	@And("^user taps on new Password Field$")
	public void userTapsOnNewPasswordField() {
		clickButtonWithOutScroll(NewPassword);
	}

	@And("^user enters different Confirm New Password$")
	public void userEntersDifferentConfirmNewPassword() {
		if (isElementDisplayedWithoutAssert(HideKeyPadMobileRegistration)) {
			clickButtonWithOutScroll(HideKeyPadMobileRegistration);
		}
		enterTextWithoutScroll(ConfirmPassword, AccountConstants.DIFFCONFIRMPASS);
	}

	@Then("^user verify the error message for password mismatch$")
	public void userVerifyTheErrorMessageForPasswordMismatch() {
//		if ("ANDROID".equalsIgnoreCase(platformName)) {
//			staticTextValidation(DiffPwdCT, AccountConstants.CONFIRMPASSER);
//		} else {
		staticTextValidation(DiffPwdCT, AccountConstants.CONFIRMPASSER);
//		}
	}

	@Then("^user enters invalid Current password$")
	public void userEntersInvalidCurrentPassword() {
		enterTextWithoutScroll(CurrentPassword, AccountConstants.INVALIDPASSWORD);
	}

	@Then("^verify copy text error message for invalid current password$")
	public void verifyCopyTextErrorMessageForInvalidCurrentPassword() {
		waitFor(2000);
		if (isElementDisplayedWithoutAssert(CurrPassInvldMsg))
			isElementDisplayed(CurrPassInvldMsg);
		else
			isElementDisplayed(CurrPassInvldMsg2);
	}

	@And("^user enter the new and confirm password$")
	public void userEnterTheNewAndConfirmPassword() {
		enterTextWithoutScroll(NewPassword, AccountConstants.NEWPASS);
		enterTextWithoutScroll(ConfirmPassword, AccountConstants.CONFIRMPASS);
	}

	@Then("^verify the error message for submitting the form with curernt password empty$")
	public void verifyTheErrorMessageForSubmittingTheFormWithCurerntPasswordEmpty() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(CurrPassEmptyMsg, AccountConstants.CURRENTERMSG);
		} else {
			isElementDisplayed(CurrPassEmptyMsg);
		}
	}

	@And("^user enter the Current and confirm password$")
	public void userEnterTheCurrentAndConfirmPassword() {
		enterTextWithoutScroll(CurrentPassword, AccountConstants.CURRENTPASS);
		enterTextWithoutScroll(ConfirmPassword, AccountConstants.CONFIRMPASS);
	}

	@Then("^verify the error message for submitting the form with new password empty$")
	public void verifyTheErrorMessageForSubmittingTheFormWithNewPasswordEmpty() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(NewPassEmptyMsg, AccountConstants.NEWERMSG);
		} else {
			isElementDisplayed(NewPassEmptyMsg);
		}
	}

	@And("^user enter the current and new password$")
	public void userEnterTheCurrentAndNewPassword() {
		enterTextWithoutScroll(CurrentPassword, AccountConstants.CURRENTPASS);
		enterTextWithoutScroll(NewPassword, AccountConstants.NEWPASS);
	}

//	@Then("^verify the error message for submitting the form with confirm password empty$")
//	public void verifyTheErrorMessageForSubmittingTheFormWithConfirmPasswordEmpty() {
//		if ("ANDROID".equalsIgnoreCase(platformName)) {
//			staticTextValidation(ConfrmPassEmptyMsg, AccountConstants.CONFIRMERMSG);
//		} else {
//			isElementDisplayed(ConfrmPassEmptyMsg);
//		}
//	}

	@Then("^user verify the error message displayed for new and confirm password empty field$")
	public void userVerifyTheErrorMessageDisplayedForNewAndConfirmPasswordEmptyField() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(AccountMessage, AccountConstants.CONFIRMERMSG);
		} else {
			isElementDisplayed(NewPassEmptyMsg);
		}
	}

	@Then("^user verify the error message displayed for current and new password empty field$")
	public void userVerifyTheErrorMessageDisplayedForCurrentAndNewPasswordEmptyField() {
		waitForElement(NewPassEmptyMsg);
		isElementDisplayed(CurrPassEmptyMsg);
		isElementDisplayed(NewPassEmptyMsg);
	}

	@Then("^verify the Updated message is displayed$")
	public void verifyTheUpdatedMessageIsDisplayed() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			waitForElement(AccountMessage, 10);
			staticTextValidation(AccountMessage, AccountConstants.NAMEDIT);
		} else {
			waitForElement(NameEditSuccessMsg, 20);
			staticTextValidation(NameEditSuccessMsg, AccountConstants.NAMEDIT);
		}
	}

	@And("^Tap on user edit$")
	public void tapOnUserEdit() {
		waitForElement(UserEdit);
		clickButtonWithOutScroll(UserEdit);
	}

	@Then("^Verify the Full name is prepopulated in the Name edit screen$")
	public void verifyTheFullNameIsPrepopulatedInTheNameEditScreen() {
		waitForElement(EditFname);
		Assert.assertTrue(!EditFname.getText().isEmpty());
		Assert.assertTrue(!EditLname.getText().isEmpty());
	}

	@And("^Clear the last name field and enter value with (\\d+) characters$")
	public void clearTheLastNameFieldAndEnterValueWithCharacters(int arg0) {
		waitForElement(EditLname);
		enterTextWithoutScroll(EditLname, AccountConstants.Char100Lname);
		clickButtonWithOutScroll(EditUpdate);
		clickButtonWithOutScroll(okBtn);
	}

	@Then("^Verify the Field has (\\d+) Charaters$")
	public void verifyTheFieldHasCharaters(int arg0) {
		clickButtonWithOutScroll(UserEdit);
		Assert.assertTrue(EditLname.getText().length() == 100);
	}

	@And("^Get the First name and last name and verify the first letter is capitalized$")
	public void getTheFirstNameAndLastNameAndVerifyTheFirstLetterIsCapitalized() {
		char Fname = EditFname.getText().charAt(0);
		char Lname = EditLname.getText().charAt(0);
		Assert.assertTrue(Character.isUpperCase(Fname));
		Assert.assertTrue(Character.isUpperCase(Lname));
	}

	@And("^enter the New Fist/Last Name with special characters$")
	public void enterTheNewFistLastNameWithSpecialCharacters() {
		enterTextWithoutScroll(EditFname, AccountConstants.FNAMESPL);
		enterTextWithoutScroll(EditLname, AccountConstants.LNAMESPL);

	}

	@Then("^verify the First/Last Name with special characters$")
	public void verifyTheFirstLastNameWithSpecialCharacters() {
		waitForElement(UserEdit);
		String NameCheck = AccountConstants.FNAMESPL + " " + AccountConstants.LNAMESPL;
		staticTextValidation(FullName, NameCheck);
	}

	@And("^user edit name by entering Test firstname and lastname$")
	public void userEditNameByEnteringTestFirstnameAndLastname() {
		clickButtonWithOutScroll(UserEdit);
		// clearTextFields(EditFname);
		enterTextWithoutScroll(EditFname, AccountConstants.TFNAME);
		// clearTextFields(EditLname);
		enterTextWithoutScroll(EditLname, AccountConstants.TLNAME);
	}

	@And("^Tap the cancel button$")
	public void tapTheCancelButton() {
		clickButtonWithOutScroll(PwdCancelBtn);
	}

	@Then("^verify the first and last name is not updated$")
	public void verifyTheFirstAndLastNameIsNotUpdated() {
		isElementDisplayed(FullName);
		Assert.assertTrue(!FullName.getText().contains(AccountConstants.TFNAME));

	}

	@And("^user taps on Go To Settings link under Location Services$")
	public void userTapsOnGoToSettingsLinkUnderLocationServices() {
		ScrollTo(AccountConstants.LOCATIONSERVS, AccountConstants.IOSSCROLLUP, LocationServicesAcc);
		clickButtonWithOutScroll(LocGoToSettings);

	}

	@Then("^Verify user allows the Location service enabled$")
	public void verifyUserAllowsTheLocationServiceEnabled() {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(LocSrcSwitch, AccountConstants.SWITCHON);
		} else {
			waitForElement(LocSettings);
			clickButtonWithOutScroll(LocSettings);
			waitForElement(LocSettingsAlways);
			clickButtonWithOutScroll(LocSettingsAlways);
			clickButtonWithOutScroll(SettingsBack);
			Assert.assertTrue(isElementEnabled(LocSettingsAlwaysEnabled));
		}
	}

	@And("^give wrong current password everytime till the error message is verified$")
	public void giveWrongCurrentPasswordEverytimeTillTheErrorMessageIsVerified() throws Throwable {
		try {
			for (int i = 0; i < 4; i++) {
				user_enters_incorrect_current_password();
				user_enters_new_password();
				user_enters_confirm_new_password();
				user_tap_on_done_button();
				if (isElementDisplayedWithoutAssert(CurrPassInvldMsg2))
					break;
				clickButtonWithOutScroll(okBtn);
			}
			isElementDisplayed(CurrPassInvldMsg2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And("^Tap the info icon in maximum fueling amount$")
	public void tapTheInfoIconInMaximumFuelingAmount() {
		ScrollTo(AccountConstants.ACCOUNTSCREENNECTARSECTION, AccountConstants.IOSSCROLLUP, AccountNectarCardSection);
		waitFor(4000);
		clickButtonWithOutScroll(FuelingInfo);
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			staticTextValidation(AccountMessage, AccountConstants.PREAUTHINFO);
		} else {
			staticTextValidation(FuelingInfoTxt, AccountConstants.PREAUTHINFO);
		}
	}

	public void nectarAddAndVerify() throws Throwable {
		waitFor(5000);
		ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
		clickButtonWithOutScroll(AccountAddNectarCardButton);
		enterTextWithoutScroll(NectarCardnumberEnter, AccountConstants.NECTARCARDNUMBERNOTVERIFIED);
		hideMobileKeyboard();
		clickButtonWithOutScroll(NextButtonNectarCardAddScreen);
		waitFor(7000);
		if ("android".equalsIgnoreCase(platformName)) {
			if (isElementDisplayedWithoutAssert(nectarAddedFirstTimemessage)) {
				clickButtonWithOutScroll(nectarCardContinueBtn);
			}
		} else {
			if (isElementDisplayedWithoutAssert(NectarAddedSuccessfulTitle)) {
				clickButtonWithOutScroll(nectarCardContinueBtn);
			}

		}
		waitForElement(AccountNectarCardVerifyLaterPopup, 10);
		clickButtonWithOutScroll(AccountNectarCardVerifyLaterPopup);
		waitForElement(AccountNectarVerifyLaterSkip, 15);
		clickButtonWithOutScroll(AccountNectarVerifyLaterSkip);
		//ScrollTo(AccountConstants.ACCOUNTSCREENNECTARSECTION, AccountConstants.IOSSCROLLUP, AccountNectarCardSection);
		waitFor(2000);
		if ("android".equalsIgnoreCase(platformName)) {
			ScrollTo(AccountConstants.LOGOUTANDROID, AccountConstants.IOSSCROLLUP, LogOut);
		} else {
			ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
		}
		Assert.assertTrue(
				isTextMatch(AccountNectarCardAdded.getText(), AccountConstants.ACCOUNTSCREENDELETENECTARCARDBUTTONCT));
		//Assert.assertTrue(isElementDisplayedWithoutScroll(AccountNectarCardWithStars));
	}

	public void nectarDeleteAndVerify() throws Throwable {
		waitForElement(TermsACondition, 10);
		if ("android".equalsIgnoreCase(platformName)) {
			ScrollTo(AccountConstants.LOGOUTANDROID, AccountConstants.IOSSCROLLUP, TermsACondition);
		} else {
			ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, TermsACondition);
		}
		waitForElement(AccountNectarCardAdded, 10);
		clickButtonWithOutScroll(AccountNectarCardAdded);
		waitForElement(AccountDeleteNectarPopupMessage, 10);
		staticTextValidation(AccountDeleteNectarPopupMessage, AccountConstants.ACCOUNTNECTARDELETEPOPUPMSG);
		clickButtonWithOutScroll(AccountDeleteNectarPopupButton);
		waitFor(4000);
		waitForElement(AccountDeleteNectarSuccessPopupMessage, 10);
		staticTextValidation(AccountDeleteNectarSuccessPopupMessage, AccountConstants.ACCOUNTNECTARDELETESUCCESS);
		clickButtonWithOutScroll(NectarDeleteSuccessfulPopupOK);
		waitForElement(AccountAddNectarCardButton, 10);
		Assert.assertTrue(
				isTextMatch(AccountAddNectarCardButton.getText(), AccountConstants.ACCOUNTSCREENADDNECTARCARDBUTTONCT));

//		Assert.assertTrue(
//				isTextMatch(AccountAddNectarCardSectionCT.getText(), AccountConstants.ACCOUNTNECTARSECTIONCT));
//
	}

	@Then("^user verifies the Nectar card section$")
	public void user_verifies_the_nectar_card_section() throws Throwable {
		waitForElement(PasswordEdit, 20);
		if ("android".equalsIgnoreCase(platformName)) {
			ScrollTo(AccountConstants.LOGOUTANDROID, AccountConstants.IOSSCROLLUP, LogOut);
		} else {
			ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
		}

		if (isElementDisplayedWithoutAssert(AccountNectarCardAdded)) {
			nectarDeleteAndVerify();
			nectarAddAndVerify();
		} else {
			nectarAddAndVerify();
			nectarDeleteAndVerify();
		}
	}

	@When("^user enters \"([^\"]*)\" in login details$")
	public void userEntersInLoginDetails(String arg0) throws Throwable {

		waitFor(2000);
//		enterTextWithoutScroll(AccountEmail, PayOutsideConstants.LoggedEmail);
//		enterTextWithoutScroll(AccountPassword,PayOutsideConstants.LoggedPassword);
		enterTextWithoutScroll(AccountEmail, StationFinderConstants.USERNM);
		enterTextWithoutScroll(AccountPassword, StationFinderConstants.PASS);
	}

	@Then("^user verifies paypal email id with masked$")
	public void userVerifiesPaypalEmailIdWithMasked() {
		if (platformName.equalsIgnoreCase("Android")) {
			staticTextValidation(HeaderText, "Account");
			staticTextValidation(PaypalEmail.getText().substring(1, 6), AccountConstants.PaypalEmailMasked);

		} else {
			waitFor(4000);
			waitForElement(getTextElement("Account"), 5);
			Assert.assertTrue(isElementDisplayed(PaypalEmail));
		}
	}

	@Then("^user taps login button$")
	public void userTapsLoginButton() {
		waitForElement(AccountLoginBtn, 5);
		clickButtonWithOutScroll(AccountLoginBtn);
		waitFor(2000);
		if (isElementEnabled(LoginSave)) {
			clickButtonWithOutScroll(LoginSave);
		}
		if (isElementEnabled(Alertitle)) {
			if (AccountConstants.LOGINNTFCT.equalsIgnoreCase(Alertitle.getText())) {
				clickButtonWithOutScroll(okBtn);
			}
		}

	}


	@And("^check if the planned maintenance pop up is getting displayed$")
	public void checkIfThePlannedMaintenancePopUpIsGettingDisplayed() {
		waitFor(3000);
		if (isElementDisplayedWithoutAssert(PlannedMaintenance)) {
			isElementDisplayed(PlannedMaintenanceTxt);
			clickButtonWithOutScroll(okBtn);
		} else {
			logger.info("No Planned Maintenance Pop up !");
		}
	}

	@Then("^user naviagtes to the NLID screen after tutorial screens$")
	public void userNaviagtesToTheNLIDScreenAfterTutorialScreens() {
		if (isElementDisplayedWithoutAssert(AccountOkBtn)) {
			waitForElement(AccountOkBtn,20);
			clickButtonWithOutScroll(AccountOkBtn);
		}
		if (platformName.equalsIgnoreCase("iOS")) {
			clickButtonWithOutScroll(ContinueBtn);
			clickButtonWithOutScroll(AllowPopup);
			waitFor(4000);
			if (isElementDisplayedWithoutAssert(Allow)) {
				clickButtonWithOutScroll(Allow);
			}
			waitFor(4000);
			if (isElementDisplayedWithoutAssert(okBtn)) {
				clickButtonWithOutScroll(okBtn);
			}
			waitFor(4000);
			if (isElementDisplayedWithoutAssert(PlannedMaintenance)) {
				clickButtonWithOutScroll(okBtn);
			}
		}
		else {
			waitForElement(AllowNotificationContinue);
			clickButtonWithOutScroll(AllowNotificationContinue);
			waitForElement(AllowNotificationAllow);
			clickButtonWithOutScroll(AllowNotificationAllow);
			waitForElement(AccountOkBtn);
			clickButtonWithOutScroll(AccountOkBtn);
		}
	}

	@And("^user verifies Add Nectar card section$")
	public void userVerifiesAddNectarCardSection() throws Throwable {
		waitForElement(PasswordEdit, 20);

		if ("Android".equalsIgnoreCase(platformName)) {
			ScrollTo(AccountConstants.LOGOUTANDROID, AccountConstants.IOSSCROLLUP, LogOut);
		} else {
			ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
		}
		waitFor(4000);
		if (isElementDisplayedWithoutAssert(AccountNectarCardAdded)) {
			waitForElement(AccountNectarCardAdded, 60);
			clickButtonWithOutScroll(AccountNectarCardAdded);
			waitForElement(AccountDeleteNectarPopupButton, 60);
			clickButtonWithOutScroll(AccountDeleteNectarPopupButton);
			waitForElement(NectarDeleteSuccessfulPopupOK, 60);
			clickButtonWithOutScroll(NectarDeleteSuccessfulPopupOK);
		}
	}

	@And("^Add and verify Nectar card$")
	public void addANectarCard() throws Throwable {
		nectarAddAndVerify();
	}

	@And("^user verifies Added Nectar card section$")
	public void userVerifiesAddedNectarCardSection() {
		waitForElement(UserProfileAccount, 20);
		if ("Android".equalsIgnoreCase(platformName)) {
			ScrollTo(AccountConstants.LOGOUTANDROID, AccountConstants.IOSSCROLLUP, LogOut);
		} else {
			try {
				ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			} catch (Exception e) {
				ScrollTo(AccountConstants.LOGOUTTXT, AccountConstants.IOSSCROLLUP, LogOut);
			}
		}
		Assert.assertTrue(
				isTextMatch(AccountNectarCardAdded.getText(), AccountConstants.ACCOUNTSCREENDELETENECTARCARDBUTTONCT));
	}

	@Then("^Delete and verify Nectar card$")
	public void deleteAndVerifyNectarCard() throws Throwable {
		nectarDeleteAndVerify();
	}

	@And("^user enters a New Password to change the password$")
	public void userEntersANewPasswordToChangeThePassword() {
		waitForElement(NewPassword, 10);
		enterTextWithoutScroll(NewPassword, AccountConstants.NEWPASSTOCHANGE);
	}

	@And("^user enters a Confirm New Password to change the password$")
	public void userEntersAConfirmNewPasswordToChangeThePassword() {
		if (isElementDisplayedWithoutAssert(HideKeyPadMobileRegistration)) {
			clickButtonWithOutScroll(HideKeyPadMobileRegistration);
		}
		enterTextWithoutScroll(ConfirmPassword, AccountConstants.NEWPASSTOCHANGE);
	}

	@And("^user enters the new password from the \"([^\"]*)\"$")
	public void userEntersTheNewPasswordFromThe(String PasswordLogin) throws Throwable {
		enterTextWithoutScroll(NewPassword, getTestDataValues(loginclass_path, PasswordLogin)[1]);
	}

	@And("^user enters the confirm password from the \"([^\"]*)\"$")
	public void userEntersTheConfirmPasswordFromThe(String PasswordLogin) throws Throwable {
		if (isElementDisplayedWithoutAssert(HideKeyPadMobileRegistration)) {
			clickButtonWithOutScroll(HideKeyPadMobileRegistration);
		}
		enterTextWithoutScroll(ConfirmPassword, getTestDataValues(loginclass_path, PasswordLogin)[1]);
	}

	@Then("^user verifies the updated error message when same password is used$")
	public void userVerifiesTheUpdatedErrorMessageWhenSamePasswordIsUsed() {
		waitForElement(exxon_Help_feedback_Promtmsgok, 20);
		Assert.assertTrue(SamePasswordErrorPopup.getText().contains(AccountConstants.SAMEPASSWORDPOPUPMESSAGE));
	}

	@And("^user takes the mail id of the user$")
	public void userTakesTheMailIdOfTheUser() {
		waitFor(6000);
		if (platformName.equalsIgnoreCase("iOS")) {
			UserMailEntered = EmailField.getAttribute("value");
		} else {
			UserMailEntered = EmailField.getText();
		}
	}

	@And("^user taps on delete your account in account screen$")
	public void userTapsOnDeleteYourAccountInAccountScreen() {
		ScrollTo(AccountConstants.DELETEYOURACCOUNT, AccountConstants.IOSSCROLLUP, DeleteYourAccountAccountScreen);
		clickButtonWithOutScroll(DeleteYourAccountAccountScreen);
	}

	@And("^user verifies the delete your account screen$")
	public void userVerifiesTheDeleteYourAccountScreen() {
		Assert.assertTrue(isElementDisplayed(CancelDeleteScreen));
		Assert.assertTrue(isElementDisplayed(DeleteScreenTitle));
		if (platformName.equalsIgnoreCase("iOS")) {
			Assert.assertTrue(DeleteScreenSubTitle.getText().contains(AccountConstants.DELETEACCOUNTSCREENSUBTITLE));
			Assert.assertTrue(deleteButtonDeleteScreen.getText().equalsIgnoreCase(AccountConstants.DELETEACCOUNTDELETEBUTTON));
		} else {
			Assert.assertTrue(isElementDisplayed(DeleteScreenSubTitle));
//			Assert.assertTrue(DeleteScreenSubTitle.getText().equalsIgnoreCase(AccountConstants.DELETEACCOUNTSCREENSUBTITLE));
			staticTextValidation(deleteButtonDeleteScreen, AccountConstants.DELETEACCOUNTDELETEBUTTON);
		}

	}

	@And("^user taps on delete in delete your account screen$")
	public void userTapsOnDeleteInDeleteYourAccountScreen() {
		waitForElement(deleteButtonDeleteScreen, 5);
		clickButtonWithOutScroll(deleteButtonDeleteScreen);
	}

	@And("^user verifies the delete your account popup$")
	public void userVerifiesTheDeleteYourAccountPopup() {
		waitForElement(okBtn, 10);
		Assert.assertTrue(DeleteAccountPopUpCt.getText().contains(AccountConstants.DELETEACCOUNTPOPUPCT));
	}

	@Then("^user confirms the mobile number field is not present in the account screen$")
	public void userConfirmsTheMobileNumberFieldIsNotPresentInTheAccountScreen() {
		waitForElement(UserProfileAccount, 10);
		Assert.assertTrue(mobileNumberFieldAccount.isEmpty());
	}

	@Then("^user taps on ok button from add payment popup$")
	public void okButtonFromAddPaymentPopup() {
		waitForElement(AddPaymentOkButton, 8);
		clickButtonWithOutScroll(AddPaymentOkButton);
	}

	@And("^user validates the add payment link present in LID screen$")
	public void addPaymentLinkPresentInLIDScreen() {
		Assert.assertTrue(AddPaymentLink.isDisplayed());
		staticTextValidation(AddPaymentLink, "Add a payment method to pay at the pump");
	}

	@When("^user taps on add payment link present in LID screen$")
	public void userTapsOnAddPaymentLinkPresentInLIDScreen() {
		waitForElement(AddPaymentLinkButton, 8);
		clickButtonWithOutScroll(AddPaymentLinkButton);
	}

	@Then("^user verifies the info icon present and taps on the button$")
	public void userTapsOnTheInfoButtonPresentInPaymentMethod() {
		Assert.assertTrue(AddPaymentInfoIcon.isDisplayed());
		clickButtonWithOutScroll(AddPaymentInfoIcon);

	}

	@When("^user verifies the text present under info icon and taps on ok button$")
	public void userVerifiesTheTextPresentUnderInfoIconAndTapsOnOkButton() {
		waitForElement(InfoIconCt, 10);
		staticTextValidation(InfoIconCt, AccountConstants.INFOICONCT);
		clickButtonWithOutScroll(InfoOkButon);
	}

	@Then("^validate the cancel button displayed in add payment method$")
	public void validateTheCancelButtonDisplayedInAddPaymentMethod() {
		waitForElement(CancelButtonAddPaymentScreen, 10);
		Assert.assertTrue(isElementDisplayed(CancelButtonAddPaymentScreen));

	}

	@Then("^verify the applepay displayed as first payment in add payment method$")
	public void verifyTheApplepayDisplayedAsFirstPaymentInAddPaymentMethod() {
		waitForElement(ApplePayFirstPaymentAddPayMethod, 10);
		Assert.assertTrue(ApplePayFirstPaymentAddPayMethod.isDisplayed());
	}


	@Then("^verify the credit/debit card displayed as second payment in add payment method$")
	public void verifyTheCreditDebitCardDisplayedAsSecondPaymentInAddPaymentMethod() {
		waitForElement(CreditDebitSecondPaymentAddPayMethod, 10);
		Assert.assertTrue(CreditDebitSecondPaymentAddPayMethod.isDisplayed());
	}


	@Then("^verify the paypal is displayed as third payment in add payment method$")
	public void verifyThePaypalIsDisplayedAsThirdPaymentInAddPaymentMethod() {
		waitForElement(PaypalThirdPaymentAddPayMethod, 10);
		Assert.assertTrue(PaypalThirdPaymentAddPayMethod.isDisplayed());
	}

	@And("^user uses the auto generated mail in login screen$")
	public void userUsesTheAutoGeneratedMailInLoginScreen() {
		waitForElement(AccountEmail, 10);
		enterTextWithoutClick(AccountEmail, AccountSteps.UserMailEntered);
	}

	@And("^user enter the auto generated mail after deleting the user$")
	public void userEnterTheAutoGeneratedMailAfterDeletingTheUser() {
		enterTextWithoutClick(RegstrEmail, AccountSteps.UserMailEntered);
	}

	@Then("^enter password in login screen$")
	public void enterPasswordInLoginScreen() {
		hideMobileKeyboard();
		waitForElement(AccountPassword, 10);
		enterTextWithoutScroll(AccountPassword, StationFinderConstants.PASS);

	}

	@And("^validate the error message displayed in login screen$")
	public void validateTheErrorMessageDisplayedInLoginScreen() {
		waitForElement(invalid_unpwd_popup, 10);
		staticTextValidation(invalid_unpwd_popup, AccountConstants.LOGINNOTIFICATION);
	}

	@Then("^user validates Add nectar card link in LID$")
	public void userValidatesAddNectarCardLinkInLID() {
		waitForElement(AddNectarLink, 30);
		Assert.assertTrue(AddNectarLink.isEnabled());
	}

	@And("^user taps on login button$")
	public void userTapsOnLoginButton() {
		waitForElement(AccountLoginBtn, 10);
		clickButtonWithOutScroll(AccountLoginBtn);
	}

	@Then("^user validates the add payment popup title and ct once taps on start fuel$")
	public void addPaymentPopupTitleAndCtOnceTapsOnStartFuel() {
		waitForElement(AddPaymentOkButton, 8);
		staticTextValidation(AddPaymentTitle, "Add Payment Method");
		staticTextValidation(AddPaymentCt, AccountConstants.ADDPAYMENTCT);
	}

	@And("^user verifies the Tell us how often you'd like to hear from us link in LID screen$")
	public void userVerifiesTheTellUsHowOftenYouDLikeToHearFromUsLinkInLIDScreen() {
		waitForElement(PreferencesLink, 10);
		staticTextValidation(PreferencesLink, AccountConstants.PreferencesLink);
	}

	@And("^user adds a nectar card and taps verify later$")
	public void userAddsANectarCardAndTapsVerifyLater() throws Throwable {
		nectarAddAndVerify();
	}

	@When("^user taps on email tab$")
	public void userTapsOnEmailTab() {
		waitForElement(AccountEmail, 5);
		clickButtonWithOutScroll(AccountEmail);
	}

	@Then("^user taps login button in NLID$")
	public void user_taps_login_button_in_nlid() throws Throwable {
		clickButtonWithOutScroll(AccountLoginBtn);
		waitFor(1000);
	}

	@And("^user taps on More button alone$")
	public void userTapsOnMoreButtonAlone() {
		waitForElement(AccountMore, 10);
		clickButtonWithOutScroll(AccountMore);
	}

	@And("^Delete the Nectar card if it is present$")
	public void delete_the_nectar_card_if_it_is_present() throws Throwable {
		waitFor(3000);
		if (isElementDisplayedWithoutAssert(AccountNectarCardAdded)) {
			clickButtonWithOutScroll(AccountNectarCardAdded);
			clickButtonWithOutScroll(AccountDeleteNectarPopupButton);
			waitForElement(NectarDeleteSuccessfulPopupOK, 20);
			clickButtonWithOutScroll(NectarDeleteSuccessfulPopupOK);
		}
	}

	@And("^tap on Ok Button$")
	public void tap_on_ok_button() throws Throwable {
		waitForElement(okBtn, 5);
		clickButtonWithOutScroll(okBtn);
	}

	@And("^user taps the Login Button alone$")
	public void user_taps_the_login_button_alone() throws Throwable {
		waitForElement(AccountLoginBtn, 20);
		clickButtonWithOutScroll(AccountLoginBtn);
	}

	@Then("^user verifies the Login screen$")
	public void user_verifies_the_login_screen() throws Throwable {
		waitFor(5000);
		Assert.assertTrue(isElementDisplayed(AccountLoginBtn));
	}

	@And("user Tap on Edit for Esso PIN field.")
	public void userTapOnEditForEssoPINField() {
		waitForElement(EditPin, 10);
		clickButtonWithOutScroll(EditPin);
	}

	@Then("user verifies the default payment method as the {int}st payment method under the payment method section")
	public void userVerifiesTheDefaultPaymentMethodAsTheStPaymentMethodUnderThePaymentMethodSection(int arg0) {
		waitForElement(DefaultPaymentMethod, 10);
		Assert.assertTrue(isElementDisplayed(DefaultPaymentMethod));
	}

	@Then("user verifies app highlight the default payment method with the label 'Selected Payment Method")
	public void userVerifiesAppHighlightTheDefaultPaymentMethodWithTheLabelSelectedPaymentMethod() {
		waitForElement(SelectedPaymentMethod, 10);
		String str = SelectedPaymentMethod.getText();
		String str1 = str.trim();
		Assert.assertEquals(str1, AccountConstants.SELECTEDPAYMENTMETHODCT);
	}

	@When("user tap on OK button from Card added successfully popup")
	public void userTapOnOKButtonFromCardAddedSuccessfullyPopup() {
		waitFor(5000);
		waitForElement(CardAddedOKButton, 10);
		clickButtonWithOutScroll(CardAddedOKButton);
	}

	@And("user taps on Add Payment Method link")
	public void userTapsOnAddPaymentMethodLink() {
		waitForElement(AddPaymentMethodLink, 10);
		clickButtonWithOutScroll(AddPaymentMethodLink);
	}

	@Then("user verifies the ‘Choose Default Method’ link below the ‘Add Payment Method’ link.")
	public void userVerifiesTheChooseDefaultMethodLinkBelowTheAddPaymentMethodLink() {
		waitForElement(ChooseDefaultMethod, 10);
		Assert.assertEquals(ChooseDefaultMethod.getText(), AccountConstants.CHOOSEDEFAULTMETHODCT);
	}

	@Then("User verifies the app should display the Visa card payment method as a card view")
	public void userVerifiesTheAppShouldDisplayTheVisaCardPaymentMethodAsACardView() {
		waitForElement(PaymentMethodAccount, 30);
		Assert.assertTrue(isTextMatch(PaymentMethodAccount.getText(), MenuConstants.PAYMENTMETHODACCOUNT));
		isElementDisplayed(PaymentCardView);
		isElementDisplayed(CofLogo);
		isElementEnabled(AddCard);
		isElementDisplayed(CardNumberOne);
		isElementDisplayed(CardNumberMasked);
		Assert.assertTrue(isTextMatch(CofPaymentType.getText(), AccountConstants.VISACARDPAYMENTTYPE));
	}

	@Then("Verify that  the app should display the PayPal payment method as a card view")
	public void verifyThatTheAppShouldDisplayThePayPalPaymentMethodAsACardView() {
		waitForElement(PaymentMethodAccount, 30);
		Assert.assertTrue(isTextMatch(PaymentMethodAccount.getText(), MenuConstants.PAYMENTMETHODACCOUNT));
		if (platformName.equalsIgnoreCase("Android")){
			Assert.assertTrue(isTextMatch(PAYPALTEXT,PayPalTitle.getText()));
			Assert.assertTrue(isElementDisplayed(PaypalEmail));
			Assert.assertTrue(isElementDisplayed(PaypalEdit));
			clickButtonWithOutScroll(PaypalEdit);
			waitForElement(PaypalSignout, 5);
			Assert.assertTrue(isTextMatch(PaypalEditNicknameButton.getText(),PAYPALEDITNAMETEXT));
			Assert.assertTrue(isTextMatch(PaypalSignout.getText(),PAYPALSIGNOUTTEXT));
			Assert.assertTrue(isTextMatch(PaypalCancelButton.getText(),PAYPALCANCELTEXT));
		} else {
			isElementEnabled(PayPalTitle);
			isElementDisplayed(PayPalEmail);
			isElementDisplayed(PaypalEdit);
			clickButtonWithOutScroll(PaypalEdit);
			waitForElement(PaypalSignout, 5);
			isElementDisplayed(PaypalSignout);
		}
	}

	@Then("Verify that the app should display the MasterCard payment method as a card view")
	public void verifyThatTheAppShouldDisplayTheMasterCardPaymentMethodAsACardView() {
		waitForElement(PaymentMethodAccount, 30);
		Assert.assertTrue(isTextMatch(PaymentMethodAccount.getText(), MenuConstants.PAYMENTMETHODACCOUNT));
		isElementDisplayed(PaymentCardView);
		isElementDisplayed(CofLogo);
		isElementEnabled(AddCard);
		isElementDisplayed(CardNumberOne);
		isElementDisplayed(CardNumberMasked);
		Assert.assertTrue(isTextMatch(CofPaymentType.getText(), MASTERCARDPAYMENTTYPE));
	}

	@Then("user verifies the Delete Your Account button in red color below the Log Out button")
	public void userVerifiesTheDeleteYourAccountButtonInRedColorBelowTheLogOutButton() {
		ScrollTo(AccountConstants.DELETEYOURACCOUNT, AccountConstants.IOSSCROLLUP, DeleteYourAccountAccountScreen);
		isElementDisplayed(LogOut);
	}

	@And("user taps on Cancel from Delete Account Confirmation screen")
	public void userTapsOnCancelFromDeleteAccountConfirmationScreen() {
		clickButtonWithOutScroll(CancelDeleteScreen);

	}

	@Then("Verify the User should land on Account Screen")
	public void verifyTheUserShouldLandOnAccountScreen() {
		waitForElement(UserProfileAccount, 10);
		Assert.assertTrue(isTextMatch(AccountTitle.getText(), MenuConstants.ACCOUNT1));
	}

	@Then("user validates the user profile field")
	public void userValidatesTheUserProfileField() {
		Assert.assertTrue(isElementDisplayedWithoutAssert(EmailField));
	}

	@Then("user validate the {string} user id")
	public void userValidateTheUserId(String Google) {
		Assert.assertTrue(isTextMatch(getTestDataValues(loginclass_path, Google)[0],EmailField.getText()));
	}

	@Then("user verifies the first and last name is displayed fully")
	public void userVerifiesTheFirstAndLastNameIsDisplayedFully(){
		waitForElement(UserEdit);
		clickButtonWithOutScroll(UserEdit);
		logger.info("User is on Edit Full Name screen");
		String FullName = EditFname.getText()+" "+EditLname.getText();
		clickButtonWithOutScroll(CancelBtn);
		logger.info("User is on Account screen");
		Assert.assertTrue(isTextMatch(AccountFullName.getText(),FullName));
	}

		@When("user taps on privacy policy in account screen")
		public void userTapsOnPrivacyPolicyInAccountScreen() {
			ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
			clickButtonWithOutScroll(AccountPrivacyPolicy);
	   }

	@Then("user lands on privacy policy from account screen")
	public void userLandsOnPrivacyPolicyFromAccountScreen() {
		waitFor(15000);
		if ("IOS".equalsIgnoreCase(platformName)) {
			if (isElementDisplayedWithoutAssert(AcceptCookies)) {
					clickButtonWithOutScroll(AcceptCookies);
				}
				waitForElement(PpLinkRegistrationUrl,10);
			    clickButtonWithOutScroll(PpLinkRegistrationUrl);
				Assert.assertTrue(
						isTextMatch(PpLinkRegistrationUrlLink.getText(), ManualRegistrationConstants.PPURLLINKTITLEREGISTRATION));
		}
	}

	@When("user taps on terms and conditions in account screen")
	public void userTapsOnTermsAndConditionsInAccountScreen() {
		ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
		clickButtonWithOutScroll(TermsandCondition);
	}

	@Then("user lands on terms and condition screen from account screen")
	public void userLandsOnTermsAndConditionScreenFromAccountScreen() {
		waitFor(15000);
		if ("IOS".equalsIgnoreCase(platformName)) {
			if (isElementDisplayedWithoutAssert(AcceptCookies)) {
				clickButtonWithOutScroll(AcceptCookies);
			}
			waitForElement(PpLinkRegistrationUrl,10);
			clickButtonWithOutScroll(PpLinkRegistrationUrl);
			Assert.assertTrue(
					isTextMatch(PpLinkRegistrationUrlLink.getText(), ManualRegistrationConstants.TCURLLINKTITLEREGISTRATION));
		}
	}

	@Then("verify the delete button present in account screen")
	public void verifyTheDeleteButtonPresentInAccountScreen() {
		waitForElement(AccountFullName,25);
		ScrollTo(AccountConstants.DELETEYOURACCOUNT, AccountConstants.IOSSCROLLUP, DeleteYourAccountAccountScreen);
		Assert.assertTrue(isElementDisplayed(DeleteYourAccountAccountScreen));
	}

	@When("user taps on the delete account")
	public void userTapsOnTheDeleteAccount() {
		clickButtonWithOutScroll(DeleteYourAccountAccountScreen);
	}

	@And("verify the following data in tab bar")
	public void verifyTheFollowingDataInTabBar() {
		waitForElement(AccountBtn,10);
		Assert.assertTrue(isTextMatch(ReferAfriend.getText(), MenuConstants.TellAFRIEND));
		Assert.assertTrue(isTextMatch(AccountBtn.getText(), MenuConstants.ACCOUNT1));
		Assert.assertTrue(isTextMatch(SettingsBtnMore.getText(), MenuConstants.SETTINGSBUTTON));
		Assert.assertTrue(isTextMatch(ProductsAndInformation.getText(), MenuConstants.ProductsandInformation));
		Assert.assertTrue(isTextMatch(SupportCentre.getText(), MenuConstants.SupportCentre));
		Assert.assertTrue(isTextMatch(ShareLog.getText(), MenuConstants.ShareLogs));
	}

	@Then("user verifies payment method section in account screen when payment method is not added")
	public void userVerifiesPaymentMethodSectionInAccountScreenWhenPaymentMethodIsNotAdded() {
		waitForElement(PaymentMethodAccount,10);
		if (platformName.equalsIgnoreCase("Android")) {
			Assert.assertTrue(isElementDisplayed(PaymentMethodIcon));
			Assert.assertTrue(isTextMatch(PaymentMethodAccount.getText(), PAYMENTMETHODCTACCOUNT));
			Assert.assertTrue(isTextMatch(PaymentMethodText.getText(), PAYMENTMETHODTEXT));
			Assert.assertTrue(isTextMatch(AddCard.getText(), ADDPAYMENTBUTTONTEXT));
		}
		else{
			Assert.assertTrue(isTextMatch(PaymentMethodAccount.getText(), PAYMENTMETHODCTACCOUNT));
			Assert.assertTrue(isTextMatch(PaymentMethodText.getText(), PAYMENTMETHODTEXT));
			Assert.assertTrue(isTextMatch(AddCard.getText(), ADDPAYMENTBUTTONTEXT));
		}

	}

	@Then("user verifies Edit Pay Pal button")
	public void userVerifiesEditPayPalButton() {
		waitForElement(PaypalEdit, 25);
		clickButtonWithOutScroll(PaypalEdit);
	}

	@Then("User should see paypal title")
	public void userShouldSeePaypalTitle() {
		waitForElement(PaypalText);
		Assert.assertEquals(AccountConstants.PAYPALTEXT,PaypalText.getText());
	}

	@And("user tap on ok button in Set up PIN screen in registration flow")
	public void userTapOnOkButtonInSetUpPINScreenInRegistrationFlow() {
		waitForElement(okBtn,25);
		if (isElementDisplayedWithoutAssert(okBtn)){
			clickButtonWithOutScroll(okBtn);
		}
	}
}

//	@And("^user adds nectar card in the Add Nectar card screen$")
//	public void user_adds_nectar_card_in_the_add_nectar_card_screen() throws Throwable {
//		throw new PendingException();
//	}
//	@And("^user taps on Verify Later in the card added successfully popup$")
//	public void user_taps_on_verify_later_in_the_card_added_successfully_popup() throws Throwable {
//		throw new PendingException();
//	}
//	@And("^user taps on Skip in the Add Nectar card screen$")
//	public void user_taps_on_skip_in_the_add_nectar_card_screen() throws Throwable {
//		throw new PendingException();
//	}
//	@Then("^user lands in the Account screen$")
//	public void user_lands_in_the_account_screen() throws Throwable {
//		throw new PendingException();
//	}
//	@And("^user verifies the Nectar card section after when there is a card$")
//	public void user_verifies_the_nectar_card_section_after_when_there_is_a_card() throws Throwable {
//		throw new PendingException();
//	}
//	@And("^user deletes the Nectar card$")
//	public void user_deletes_the_nectar_card() throws Throwable {
//		throw new PendingException();
//	}
//	@Then("^user navigates from the popup to Account screen$")
//	public void user_navigates_from_the_popup_to_account_screen() throws Throwable {
//		throw new PendingException();
//	}


