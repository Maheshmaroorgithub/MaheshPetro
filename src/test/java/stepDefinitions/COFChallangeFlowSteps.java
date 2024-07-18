package stepDefinitions;

import contants.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class COFChallangeFlowSteps extends COFChallangeFlowPage {
	Instant startOf3dsmsg=null;
	Instant endOf3dsmsg=null;

	@When("^I enter SSO in login details for \"([^\"]*)\"$")
	public void i_enter_sso_in_login_details_for_something(String userType) throws Throwable {
		waitFor(3000);
		switchToWebAppContext(((AppiumDriver) driver));
		waitFor(2000);
		enterTextWithoutScroll(SSOusername, COFChallangeFlowConstants.LNUSER);
		hideMobileKeyboard();
		enterTextWithoutScroll(SSOpassWord, COFChallangeFlowConstants.LNPASSWORD);
		hideMobileKeyboard();
	}

	@Then("^user is in Linked in Login$")
	public void user_is_in_linked_in_login() throws Throwable {
		waitFor(3000);
		isElementDisplayed(LinkedinIcon);
		clickButtonWithOutScroll(LinkedinIcon);
	}

	@And("^user taps login button in SSO login screen$")
	public void user_taps_login_button_in_sso_login_screen() throws Throwable {
		clickButtonWithOutScroll(SSOsignin);
		waitFor(2000);
	}


//	@Then("^validate if user is on 3ds password screen$")
//	public void validate_if_user_is_on_3ds_password_screen() throws Throwable {
//		waitFor(4000);
//		isElementDisplayed(PassPhrase);
//	}
//
//	@Then("^validate 3DS passphrase prompt$")
//	public void validate_3ds_passphrase_prompt() throws Throwable {
//		waitFor(2000);
//		if (isElementDisplayedWithoutAssert(Continue_BTN)) {
//			clickButtonWithOutScroll(Continue_BTN);
//		}
//		for (int i = 0; i < 10;) {
//			waitFor(2000);
//			i++;
//			logger.info("###################Modirum Pop up not yet displayed#########################");
//			if (isElementDisplayedWithoutAssert(PromptTtl)) {
//				logger.info("###################Modirum Pop displayed#########################");
//				break;
//			}
//			staticTextValidation(AccountPage.AccountMessage, COFChallangeFlowConstants.PASSPHRASEONBOARD);
//		}
//	}

//	@Then("^user tap on add card button in account$")
//	public void user_tap_on_add_card_button_in_account() throws Throwable {
//		ScrollTo(COFChallangeFlowConstants.ACCOUNT, AccountConstants.IOSSCROLLUP, AddCard);
//		clickButtonWithOutScroll(AddCard);
//		waitFor(2000);
//	}

//	@Then("^enter name of the card$")
//	public void enter_name_of_the_card() throws Throwable {
//		isElementDisplayed(CardName);
//		enterTextWithoutClick(CardName, COFChallangeFlowConstants.CARDNAME);
//	}
//
//	@Then("^enter \"([^\"]*)\" card number$")
//	public void enter_something_card_number(String arg1)  {
//		enterTextWithoutClick(CardNo, arg1);
//	}
//
//	@Then("^enter expiry date$")
//	public void enter_expiry_date() throws Throwable {
//		waitFor(1000);
//		enterTextWithoutClick(ExpDate,COFChallangeFlowConstants.EXPDATE);
//
//	}
//
//	@Then("^enter CVV$")
//	public void enter_cvv() throws Throwable {
//		enterTextWithoutClick(CVV, COFChallangeFlowConstants.CVV);
//	}
//
//	@Then("^enter postal code$")
//	public void enter_postal_code() throws Throwable {
//		enterTextWithoutClick(Postal, COFChallangeFlowConstants.POSTAL);
//		hideMobileKeyboard();
//	}
//
//	@Then("^enter address line1$")
//	public void enter_address_line1() throws Throwable {
//		enterTextWithoutClick(Addrs1, COFChallangeFlowConstants.ADDRESS1);
//		hideMobileKeyboard();
//	}
//
//	@Then("^enter Address line2$")
//	public void enter_address_line2() throws Throwable {
//		enterTextWithoutClick(Addrs2, COFChallangeFlowConstants.ADDRESS2);
//		hideMobileKeyboard();
//	}
//
//	@Then("^enter city$")
//	public void enter_city() throws Throwable {
//		enterTextWithoutClick(City, COFChallangeFlowConstants.CITY);
//		hideMobileKeyboard();
//	}
//
//	@Then("^check consent checkbox$")
//	public void check_consent_checkbox() throws Throwable {
//		ScrollTo(COFChallangeFlowConstants.CONSENTSCROLL, AccountConstants.IOSSCROLLUP, ConsentBox);
//		clickButtonWithOutScroll(ConsentBox);
//	}

//	@When("^user is on setup PIN screen$")
//	public void user_is_on_setup_pin_screen() throws Throwable {
//		staticTextValidation(AccountPage.AccountMessage, COFChallangeFlowConstants.SETUPPIN);
//	}


	@Then("^tap on got it button in overlay$")
	public void tap_on_got_it_button_in_overlay() throws Throwable {
		if (isElementDisplayedWithoutAssert(PromptTtl)) {
			clickButtonWithOutScroll(okBtn);
		}
	}


//	@When("^user enters invalid card number and other valid card details$")
//	public void userEntersInvalidCardNumberAndOtherValidCardDetails() {
//		waitFor(2000);
//		enterTextWithoutClick(CardName, COFChallangeFlowConstants.CARDNAME);
//		enterTextWithoutClick(CardNo,COFChallangeFlowConstants.INVALIDCARD);
//		enterTextWithoutClick(ExpDate,COFChallangeFlowConstants.EXPDATE);
//		enterTextWithoutClick(CVV, COFChallangeFlowConstants.CVV);
//		enterTextWithoutClick(Postal, COFChallangeFlowConstants.POSTAL);
//		hideMobileKeyboard();
//		enterTextWithoutClick(Addrs1, COFChallangeFlowConstants.ADDRESS1);
//		hideMobileKeyboard();
//		enterTextWithoutClick(Addrs2, COFChallangeFlowConstants.ADDRESS2);
//		hideMobileKeyboard();
//		enterTextWithoutClick(City, COFChallangeFlowConstants.CITY);
//		hideMobileKeyboard();
//
//	}
//	@And("^enter invalid password and click on submit button$")
//	public void enter_invalid_password_and_click_on_submit_button() throws Throwable {
//		enterTextWithoutScroll(PassPhrase, COFChallangeFlowConstants.CARDNAME);
//		clickButtonWithOutScroll(PassPhraseSubmit);
//	}
//
//	@Then("^validate error message displayed in modirum screen$")
//	public void validate_error_message_displayed_in_modirum_screen() throws Throwable {
//		isElementDisplayed(PassError);
//		isElementDisplayed(FailAlertImg);
//	}

//	@And("^enter valid password and click on submit button$")
//	public void enter_valid_password_and_click_on_submit_button() throws Throwable {
//		enterTextWithoutScroll(PassPhrase, COFChallangeFlowConstants.PASSWORD);
//		clickButtonWithOutScroll(PassPhraseSubmit);
//	}

//	@Then("^validate success screen for added card$")
//	public void validate_success_screen_for_added_card() throws Throwable {
//		if (platformName.equalsIgnoreCase("Android")) {
//			staticTextValidation(PaymentSuccessTtl, COFChallangeFlowConstants.PAYSUCCSTTL);
//			staticTextValidation(PaymentSuccessDes, COFChallangeFlowConstants.PAYSUCCSDES);
//		}
//		else{
//			staticTextValidation(CardAddSuccess,COFChallangeFlowConstants.CARDSUCCESS);
//			staticTextValidation(PaymentSuccessTtl, COFChallangeFlowConstants.PAYSUCCSTTL);
//			clickButtonWithOutScroll(AccountPage.okBtn);
//		}
//	}

	@Then("^tap on continue button in success screen$")
	public void tap_on_continue_button_in_success_screen() throws Throwable {
		clickButtonWithOutScroll(Continue);
	}


	@When("^user enter the mobile number$")
	public void user_enter_the_mobile_number() throws Throwable {

		enterTextWithoutScroll(MobileNumber, COFChallangeFlowConstants.MOBNUMBER);

	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
		enterTextWithoutScroll(Pwd, COFChallangeFlowConstants.PWDFACEBOOK);
	}

	@When("^user click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		clickButtonWithOutScroll(ContinueBtn);
	}
//
//	@When("^validate the facebook prompt$")
//	public void validate_the_facebook_prompt() {
//		staticTextValidation(FBMSG, COFChallangeFlowConstants.FBPromt);
//		clickButtonWithOutScroll(OkBtn);
//
//	}

	@And("^tap on cancel button navigate to payment screen$")
	public void tap_on_cancel_button_navigate_to_payment_screen() {
		waitFor(5000);
		webDriverWait().until(ExpectedConditions.elementToBeClickable(OTPcancel));
		clickButtonWithOutScroll(OTPcancel);
		waitFor(2000);
		if (platformName.equalsIgnoreCase("Android")) {
			try {
				webDriverWaitForElement(3).until(ExpectedConditions.visibilityOf(TransCancel));
				if (TransCancel.isDisplayed()) {
					logger.info("Transaction cancel confirmation was displayed");
					clickButtonWithOutScroll(TransCancel);
				}
			} catch (Exception E) {
				logger.info("Transaction cancel confirmation was not displayed");
			}
		} else {
			waitForElement(addCardTitle, 10);
			staticTextValidation(addCardTitle.getText(), GuestCheckOutConstants.Add_Debit_Credit_Card_Header);
		}

	}
	@Then ("^enter address details$")
	public void enter_address_details()
	{
		clickButtonWithOutScroll(AddressSearchopn);
		clickButtonWithOutScroll(ChooseAddress);
		clickButtonWithOutScroll(SelectAddress);
	}


	@Then("^user lands on enter PIN screen$")
	public void userLandsOnEnterPINScreen() {
	}

//	@When("^user lands on card verification screen$")
//	public void userLandsOnCardVerificationScreen() {
//
//		isElementDisplayed(VerifyPwd);
//		waitFor(1000);
//		staticTextValidation(EnterPwd,COFChallangeFlowConstants.ENTERPWD);
//
//	}

	@When("^user taps on 'Add a payment method to pay at the pump' link$")
	public void userTapsOnAddAPaymentMethodToPayAtThePumpLink() {

		isElementDisplayed(AddPaymentMethod);
		waitFor(2000);
		clickButtonWithOutScroll(AddPaymentMethod);
	}

	@When("^user taps on Add nectar card link in LID$")
	public void userTapsOnAddNectarCardLinkInLID() {
		waitForElement(AddNectarLink,20);
		clickButtonWithOutScroll(AddNectarLink);
	}

	@Then("^tap on 'Get Started' button under Add Nectar Card screen$")
	public void tapOnGetStartedButtonUnderAddNectarCardScreen() {

		isElementDisplayed(GetStartedBtn);
		waitFor(2000);
		clickButtonWithOutScroll(GetStartedBtn);
	}

	@Then("^verify the 'Nectar card added successfully' page and click on continue button$")
	public void verifyTheNectarCardAddedSuccessfullyPageAndClickOnContinueButton() {

		isElementDisplayed(NectCardSuccess);
		waitFor(2000);
		clickButtonWithOutScroll(Continue_BTN);
	}

	@Then("^verify the 'Payment method added successfully' page and click on continue button$")
	public void verifyThePaymentMethodAddedSuccessfullyPageAndClickOnContinueButton() {
		webDriverWaitForElement(60).until(ExpectedConditions.visibilityOf(Continue_BTN));
		Assert.assertTrue(PaymentMethodSuccess.isDisplayed());
		clickButtonWithOutScroll(Continue_BTN);
	}

	@Then("^user clicks on 'Set your maximum fuelling amount' button in LID screen$")
	public void userClicksOnSetYourMaximumFuellingAmountButtonInLIDScreen() {
		isElementDisplayed(SetMaxFuelAmount);
		waitFor(2000);
		clickButtonWithOutScroll(SetMaxFuelAmount);

	}

	@Then("^user taps on 'SET MAXIMUM AMOUNT'$")
	public void userTapsOnSETMAXIMUMAMOUNT() {
		clickButtonWithOutScroll(SetMaxAmount);
	}

//
//	@And("^user enters the maximum digit card number in the Card Number field$")
//	public void userEntersTheMaximumDigitCardNumberInTheCardNumberField() {
//		enterTextWithoutClick(CardNo,COFChallangeFlowConstants.CARDNUM);
//		Assert.assertTrue(CardNo.getAttribute("value").length()<=19);
//	}
//
//	@Then("^verify whether the entered card number is displayed$")
//	public void verifyWhetherTheEnteredCardNumberIsDisplayed() {
//		waitForElement(CardNo, 7);
//		Assert.assertTrue(!CardNo.getAttribute("value").isEmpty());
//	}


//	@Then("^user verifies the Country name as 'United Kingdom' by default$")
//	public void userVerifiesTheCountryNameAsUnitedKingdomByDefault() {
//		waitForElement(CountryField,7);
//		Assert.assertTrue(CountryField.getText().equalsIgnoreCase("United Kingdom"));
//	}

//	@When("^user adds five cards from the add card link in the Account Screen$")
//	public void userAddsFiveCardsFromTheAddCardLinkInTheAccountScreen() {
//
//		for (int i = 1; i <= 5; i++) {
//			clickButtonWithOutScroll(AccountMore);
//			waitFor(2000);
//			clickButtonWithOutScroll(AccountPage.AccountBtn);
//			waitFor(1000);
//			ScrollTo(COFChallangeFlowConstants.ACCOUNT, AccountConstants.IOSSCROLLUP, AddCard);
//			clickButtonWithOutScroll(AddCard);
//			waitFor(2000);
//			enterTextWithoutClick(CardName, COFChallangeFlowConstants.CARDNAME);
//			enterTextWithoutClick(FrictionlessFlowPage.CardNo, COFChallangeFlowConstants.MAXCARD_ + i);
//			enterTextWithoutClick(FrictionlessFlowPage.ExpDate, COFChallangeFlowConstants.EXPDATE);
//			enterTextWithoutClick(FrictionlessFlowPage.SecurityCode, COFChallangeFlowConstants.CVV);
//			enterTextWithoutClick(FrictionlessFlowPage.Postal, COFChallangeFlowConstants.POSTAL);
//			hideMobileKeyboard();
//			enterTextWithoutClick(FrictionlessFlowPage.Addrs1, COFChallangeFlowConstants.ADDRESS1);
//			hideMobileKeyboard();
//			enterTextWithoutClick(FrictionlessFlowPage.Addrs2, COFChallangeFlowConstants.ADDRESS2);
//			hideMobileKeyboard();
//			enterTextWithoutClick(City, COFChallangeFlowConstants.CITY);
//			hideMobileKeyboard();
//			ScrollTo(COFChallangeFlowConstants.CONSENTSCROLL, AccountConstants.IOSSCROLLUP, ConsentBox);
//			clickButtonWithOutScroll(ConsentBox);
//			clickButtonWithOutScroll(PaymtDone);
//
//			if (isElementDisplayed(PassPhrase)) {
//				clickButtonWithOutScroll(Continue_BTN);
//				enterTextWithoutScroll(PassPhrase, COFChallangeFlowConstants.PASSWORD);
//				clickButtonWithOutScroll(PassPhraseSubmit);
//			} else if (isElementDisplayed(VerifyPwd)) {
//				waitFor(1000);
//				staticTextValidation(FrictionlessFlowPage.EnterPwd, COFChallangeFlowConstants.ENTERPWD);
//			} else {
//				continue;
//			}
//
//		}
//	}

	@And("^validates if the system disables the Add card link after adding a maximum of five cards$")
	public void validatesIfTheSystemDisablesTheAddCardLinkAfterAddingAMaximumOfFiveCards() {

		Assert.assertTrue(!isElementEnabled(AddCard));

	}

	@And("^user scrolls to Add card link$")
	public void userScrollsToAddCardLink() {
		ScrollTo(COFChallangeFlowConstants.ADDCARDSCROLL, AccountConstants.IOSSCROLLUP, AddCard);

	}


	@And("^verify whether the system navigates to Start fuelling now screen$")
	public void verifyWhetherTheSystemNavigatesToStartFuellingNowScreen() {
		waitFor(6000);
		isElementDisplayed(StartFuelingNow);
	}

//	@And("^user scrolls down to Payment Method section in the Account screen$")
//	public void userScrollsDownToPaymentMethodSectionInTheAccountScreen() {
//		ScrollTo(COFChallangeFlowConstants.ADDCARDSCROLL, AccountConstants.IOSSCROLLUP, AddCard);
//	}
//
//	@And("^check whether Edit link is available near the Added card and tap on it$")
//	public void checkWhetherEditLinkIsAvailableNearTheAddedCardAndTapOnIt() {
//		isElementDisplayed(EditCard);
//		clickButtonWithOutScroll(EditCard);
//	}
////
//	@And("^verify whether the Edit link is available near the added card$")
//	public void verifyWhetherTheEditLinkIsAvailableNearTheAddedCard() {
//		isElementDisplayed(EditCard);
//	}

//	@Then("^verify whether the card details are prepopulated in the Edit payment screen$")
//	public void verifyWhetherTheCardDetailsArePrepopulatedInTheEditPaymentScreen() {
//		String CardNameNew=CardName.getText();
//		Assert.assertTrue(CardNameNew.length()>0);
//		String ExpDateNew=ExpDate.getText();
//		Assert.assertTrue(ExpDateNew.length()>0);
//		String PostcodeNew=Postal.getText();
//		Assert.assertTrue(PostcodeNew.length()>0);
//		String AddressNew1=Addrs1.getText();
//		Assert.assertTrue(AddressNew1.length()>0);
//		String AddressNew2=Addrs2.getText();
//		Assert.assertTrue(AddressNew2.length()>0);
//		String CityNew1=City.getText();
//		Assert.assertTrue(CityNew1.length()>0);
//
//	}
//
//	@And("^edit any of the fields under Edit Payment screen$")
//	public void editAnyOfTheFieldsUnderEditPaymentScreen() {
//		String CardNameNew=CardName.getText();
//		CardName.getText().replace("Test","Test1");
//		enterTextWithoutScroll(CVV,COFChallangeFlowConstants.CVV);
//	}

	@And("^verify if the system displays the checkbox and copy text to use Touch ID for authorizing payments$")
	public void verifyIfTheSystemDisplaysTheCheckboxAndCopyTextToUseTouchIDForAuthorizingPayments() {
		Assert.assertTrue(TouchIdCheckBox.isDisplayed());

		if (platformName.equalsIgnoreCase("Android")) {
			staticTextValidation(TouchIDCopyText, COFChallangeFlowConstants.FINGERPRINTTXT);

		} else {
			staticTextValidation(TouchIDCopyText, COFChallangeFlowConstants.TOUCHIDCOPYTEXT);
		}
	}

//	@And("^user scrolls down to Consent checkbox section$")
//	public void userScrollsDownToConsentCheckboxSection() {
//		ScrollTo(COFChallangeFlowConstants.CONSENTSCROLL, AccountConstants.IOSSCROLLUP, ConsentBox);
//	}

	@Then("^user verifies the updated pop up and clicks on ok buttton$")
	public void userVerifiesTheUpdatedPopUpAndClicksOnOkButtton() {
		waitForElement(OkButton, 10);
		staticTextValidation(EditCardSuccess, COFChallangeFlowConstants.EDITCARDSUCCESS);
		clickButtonWithOutScroll(OkButton);

	}

//	@Then("^user verifies the default input text for the Address field Line two under Billing Details Section$")
//	public void userVerifiesTheDefaultInputTextForTheAddressFieldLineTwoUnderBillingDetailsSection() {
//		String AddrValue=Addrs2.getText();
//		Assert.assertTrue(AddrValue.equalsIgnoreCase("Address 2"));
//	}

	@Then("^user verifies the default input text for the Card Name under Billing Details Section$")
	public void userVerifiesTheDefaultInputTextForTheCardNameUnderBillingDetailsSection() {
		waitForElement(CardName, 5);
		String Cardname = CardName.getText();
		Assert.assertTrue(Cardname.equalsIgnoreCase("Name on card"));
	}

	@When("^user taps on the checkbox to use Touch ID for authorizing payments$")
	public void userTapsOnTheCheckboxToUseTouchIDForAuthorizingPayments() {
		clickButtonWithOutScroll(TouchIdCheckBox);
	}

	@Then("^verify if the system displays a tickmark on the checkbox and save it$")
	public void verifyIfTheSystemDisplaysATickmarkOnTheCheckboxAndSaveIt() {
		isElementDisplayed(TouchIdCheckBoxTick);
	}


	@And("^user taps on continue if there is redemption screen$")
	public void userTapsOnContinueIfThereIsRedemptionScreen() {
		waitFor(8000);
		if (isElementDisplayedWithoutAssert(SaveOnPointsRedemptionscreen)) {
			clickButtonWithOutScroll(ContinueButtonRedemptionScreen);
		}
	}

	@Given(("^user is on LID Screen$"))
	public void verifyIfUserIsOnLID() {
		if (platformName.equalsIgnoreCase("Android")) {
			webDriverWaitForElement(60).until(ExpectedConditions.visibilityOf(fuelingLIDicon));
			//waitForElement(contextualRegistrationPage.fuelingLIDicon,50);
			try {
				if (fuelingLIDicon.isDisplayed()) {
					Assert.assertTrue("User is on LID Screen", true);
				}
			} catch (Exception E) {
				Assert.fail("User failed to land on LID Screen");
			}
		}
	}

	@Then("^user lands on Add debit/credit card screen$")
	public void userLandsOnAddCardScreen() {
		if (platformName.equalsIgnoreCase("Android")) {
			boolean flag = false;
			webDriverWaitForElement(15).until(ExpectedConditions.visibilityOf(CardName));
			WebElement[] items = {addCardTitle, enterCardDetailsTxt, visaLogo, mastercardLogo};
			for (WebElement ele : items) {
				if (ele.isDisplayed()) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}

			if (flag) {
				Assert.assertTrue("Add Card Details validated successfully", true);
			} else {
				Assert.fail("Add Card Details validation failed ");
			}

		}
	}

	@Then("^verify 3ds prompt$")
	public void verify3DSPrompt() {
		if (platformName.equalsIgnoreCase("Android")) {

			webDriverWaitForElement(60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'Just to ensure')]")));
			startOf3dsmsg = Instant.now();
			String txt = AccountMessage.getText();
			logger.info("3ds prompt text displayed : " + txt + " at time " + startOf3dsmsg.toString());
			Assert.assertTrue(txt.replace("\n", "").equalsIgnoreCase(COFChallangeFlowConstants.PASSPHRASEADDMSG));

		}
	}

	@Then("^validate if user is on 3ds password screen$")
	public void validate_if_user_is_on_3ds_password_screen() throws Throwable {
		if (platformName.equalsIgnoreCase("iOS")) {
			waitForElement(VerifyPwd, 90);
			Assert.assertTrue(PassPhrase.isDisplayed());
//			Assert.assertTrue(isElementDisplayed(VerificationTxt));
			Assert.assertTrue(isElementDisplayed(VerifyPwd));
		} else {
			waitForElement(VerificationTxt, 90);
			Assert.assertTrue(isElementDisplayed(VerificationTxt));
			Assert.assertTrue(isElementDisplayed(VerifyPwd));

		}
	}

	@And("^enter valid password and click on submit button$")
	public void enter_valid_password_and_click_on_submit_button() throws Throwable {
		waitForElement(PassPhrase, 50);
		enterTextWithoutScroll(PassPhrase, COFChallangeFlowConstants.PASSWORD);
		//waitForElement(PassPhrase,10);
		clickButtonWithOutScroll(PassPhraseSubmit);
	}

//	@Then("^validate success screen for added card COF$")
//	public void verifyif3DScardIsAdded(){
//
//		if(platformName.equalsIgnoreCase("Android")) {
//			webDriverWaitForElement(60).until(ExpectedConditions.visibilityOf(cardAddedMsg));
//			Assert.assertTrue(cardAddedMsg.isDisplayed());
//			logger.info("Card added message is displayed");
//			clickButtonWithOutScroll(okButCardAdded);
//		}
//	}

	@Then("^validate 3ds prompt exists for not more than 5 seconds$")
	public void validate3dspromptTimeDuration(){
		verify3DSPrompt();

		boolean is3dsDisplayed=driver.findElement(By.xpath("//*[contains(@text,'Just to ensure')]")).isDisplayed();
		while(is3dsDisplayed) {
			logger.info("3ds prompt still displaying");
			try{
				setImplicit(0);
				webDriverWaitForElement(0).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'Just to ensure')]")));
				//is3dsDisplayed=driver.findElement(By.xpath("//*[contains(@text,'Just to ensure')]")).isDisplayed();
			}
			catch(Exception E){
				endOf3dsmsg=Instant.now();
				logger.info("3DS prompt disappeared at "+endOf3dsmsg.toString());
				break;
			}
		}
		Duration timePeriod=Duration.between(startOf3dsmsg,endOf3dsmsg);
		logger.info("Time period of 3ds prompt is : "+ timePeriod.getSeconds());
		Assert.assertTrue(6>((int) timePeriod.getSeconds()));
	}

	@Then("^verify 3ds and tap on Got it button$")
	public void verify3dsAndTapGotitButton(){
		verify3DSPrompt();
		waitForElement(GotIt3DSBut,10);
		GotIt3DSBut.click();
		logger.info("Tapped Got it Button");
		setImplicit(0);
		Assert.assertTrue(driver.findElements(By.xpath("//*[contains(@text,'Just to ensure')]")).size()==0);
		logger.info("3ds prompt disappeared after taping Got it button");

	}

	@Then("^validate identity confirmation title$")
	public void verifyIdentityTitle() {

		waitForElement(identityTitle,25);
		if(isElementDisplayedWithoutAssert(identityTitle)) {
			String txt=identityTitle.getText();
			logger.info("Identity title displayed "+txt);
			Assert.assertTrue(txt.equalsIgnoreCase(COFChallangeFlowConstants.IDENTITYCONFIRMATIONTITLE));
			staticTextValidation(confirmPopupCt, COFChallangeFlowConstants.CONFIRMPOPUPCT);

		}
		else {
			Assert.assertFalse("Title cant be found",true);
		}
	}

	@Then("^all fields on Add debit card screen should be cleared$")
	public void verifyAllFieldsOnAddCardScreenShouldbeEmpty(){
		logger.info("Verifying that the fields on Add card screen should not be cleared");
		Assert.assertTrue(!ExpDate.getText().isEmpty());
		Assert.assertTrue(!SecurityCode.getText().isEmpty());
		Assert.assertTrue(!Postal.getText().isEmpty());
		Assert.assertTrue(!Addrs1.getText().isEmpty());
		Assert.assertTrue(!Addrs2.getText().isEmpty());
		Assert.assertTrue(!City.getText().isEmpty());
		if(platformName.equalsIgnoreCase("iOS")) {
			ScrollTo(GuestCheckOutConstants.Enter_Card_Details, AccountConstants.IOSSCROLLDOWN, EnterCardDetailsText);
		}
		Assert.assertTrue(!CardName.getText().isEmpty());
		Assert.assertTrue(!CardNo.getText().isEmpty());
	}

//	@Then("^validate if user is on 3ds password screen OTP$")
//	public void validateOTPscreen(){
//	if(platformName.equalsIgnoreCase("Android")) {
//		webDriverWaitForElement(30).until(ExpectedConditions.visibilityOf(enterOTPfield));
//		WebElement[] OTPscreenItems = {OTPverificationTitle, OTPverificationDesc, OTPcancel, OTPverificationSubtitle, OTPverificationCodeTxt, OTPsubmitBut, OTPresendBut};
//		List<WebElement> OTPlists = new ArrayList<>(Arrays.asList(OTPscreenItems));
//
//			int i = 1;
//			for (WebElement ele : OTPlists) {
//				if (!(ele.isDisplayed())) {
//					Assert.fail("OTP Verification Screen Validation Failed");
//					break;
//				} else {
//					logger.info("Successfully Validated OTP verification screen Item " + i + " of " + OTPlists.size());
//					Assert.assertTrue("Validated OTP verification screen Item " + i + " of " + OTPlists.size(), true);
//				}
//				++i;
//			}
//		}
//
//	}

	@Then("^validate if user is on OTP password screen$")
	public void validateIfUserIsOnOTPPasswordScreen() {
		waitFor(60000);
		if (platformName.equalsIgnoreCase("iOS")) {
//			waitForElement(VerificationTxt, 60);
			Assert.assertTrue(PassPhrase.isDisplayed());
			Assert.assertTrue(isElementDisplayed(OTPverificationSubtitle));
			Assert.assertTrue(isElementDisplayed(VerificationTxtOtp));
		} else {
//			waitForElement(PassPhrase, 60);
//			PassPhrase.isEnabled();
//			webDriverWaitForElement(60).until(ExpectedConditions.visibilityOf(ModirumImg));
//			Assert.assertTrue(ModirumImg.isDisplayed());
//			staticTextValidation(VerificationTxt, COFChallangeFlowConstants.VERIFYBYPWD);
//			staticTextValidation(EnterPwdTxt, COFChallangeFlowConstants.ENTERPWD);
//			webDriverWaitForElement(30).until(ExpectedConditions.visibilityOf(enterOTPfield));
			WebElement[] OTPscreenItems = {OTPverificationTitle, OTPverificationDesc, OTPcancel, OTPverificationSubtitle, OTPverificationCodeTxt, OTPsubmitBut, OTPresendBut};
			List<WebElement> OTPlists = new ArrayList<>(Arrays.asList(OTPscreenItems));

			int i = 1;
			for (WebElement ele : OTPlists) {
				if (!(ele.isDisplayed())) {
					Assert.fail("OTP Verification Screen Validation Failed");
					break;
				} else {
					logger.info("Successfully Validated OTP verification screen Item " + i + " of " + OTPlists.size());
					Assert.assertTrue("Validated OTP verification screen Item " + i + " of " + OTPlists.size(), true);
				}
				++i;
			}
		}
	}

//	@And("^verify the payment method order$")
//	public void verifyPaymentMethodOrder(){
//
//
//		webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(orderOfPaypalcard));
//		Point startPoint=orderOfPaypalcard.getCenter();
//		AndroidDriver driv=(AndroidDriver)driver;
//		TouchAction act=new TouchAction(driv);
//		act.press(PointOption.point(500,1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).moveTo(PointOption.point(500,500)).release().perform();
//		List<WebElement> paymentSection=new ArrayList<>(Arrays.asList(orderOfPaypalcard,orderAddPaypalbut,orderMasterCard,orderVisaCard,orderAddCard,orderDefaultMethod));
//
//		List<Integer> yLocations=new ArrayList<>();
//		for(WebElement ele:paymentSection){
//
//			Point elePoint=ele.getCenter();
//			yLocations.add(elePoint.getY());
//
//		}
//
//		boolean inProperOrder=yLocations.stream().sorted().collect(Collectors.toList()).equals(yLocations);
//		Assert.assertTrue(inProperOrder);
//	}

	@Then("^validate if user is on modirum password screen$")
	public void validateIfUserIsOnModirumPasswordScreen() {
		if (platformName.equalsIgnoreCase("iOS")) {
			waitForElement(VerifyPwd, 60);
			Assert.assertTrue(EnterPwd.isDisplayed());
			Assert.assertTrue(isElementDisplayed(VerificationTxt));
			Assert.assertTrue(isElementDisplayed(VerifyPwd));
		} else {
			waitForElement(PassPhrase, 60);
//			PassPhrase.isEnabled();
			webDriverWaitForElement(60).until(ExpectedConditions.visibilityOf(ModirumImg));
			Assert.assertTrue(ModirumImg.isDisplayed());
			staticTextValidation(VerifyPwd, COFChallangeFlowConstants.VERIFYBYPWD);
			staticTextValidation(EnterPwd, COFChallangeFlowConstants.ENTERPWD);
		}
	}

	@Then("^validate the title and message of the custom popup in start fueling screen then taps on Ok button$")
	public void validateTheTitleAndMessageOfTheCustomPopupInStartFuelingScreenThenTapsOnOkButton() {
		if (isElementDisplayedWithoutAssert(customPopupTitle)) {
			staticTextValidation(customPopupTitle.getText(), COFChallangeFlowConstants.CUSTOMPOPUPTITLE);
			Assert.assertTrue(popUpMessage.isDisplayed());
			clickButtonWithOutScroll(PopUpOkCustomPopup);
		}
	}

	@Then("^validate the message Dont lift the nozzle just yet$")
	public void validateTheMessageDontLiftTheNozzleJustYet() {
		if (isElementDisplayedWithoutAssert(dontLiftTheNozzleMessage)) {
			staticTextValidation(dontLiftTheNozzleMessage, COFChallangeFlowConstants.DONTLIFTTHENOZZLEMESSAGE);
		}
	}

	@Then("^validate the title You can lift the nozzle now$")
	public void validateTheTitleYouCanLiftTheNozzleNow() {
		if (isElementDisplayedWithoutAssert(liftTheNozzleTitle)) {
			staticTextValidation(liftTheNozzleTitle, COFChallangeFlowConstants.LIFTTHENOZZLETITLE);
		}
	}
}