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

import java.util.regex.Pattern;

public class PayOutsideSteps extends PayOutsidePage {

    @Then("^user should opt for receipts by email checkbox$")
    public void user_should_opt_for_receipts_by_email_checkbox() throws Throwable {

        if (platformName.equalsIgnoreCase("android")) {
            TermsACondition.isDisplayed();
            if (ReceiptCKbx.getAttribute("checked").equalsIgnoreCase("true")) {
                clickButtonWithOutScroll(ReceiptCKbx);
                clickButtonWithOutScroll(okBtn);
            }
            clickButtonWithOutScroll(ReceiptCKbx);
        } else {
            ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, TermsACondition);
            if (isElementDisplayedWithoutAssert(ReceiptCKbx)) {
                clickButtonWithOutScroll(ReceiptCKbx);
                clickButtonWithOutScroll(okBtn);
            }
            clickButtonWithOutScroll(emailUnCircleCheck_box);
        }
    }

    @When("^the system displays the confirmation popup$")
    public void the_system_displays_the_confirmation_popup() throws Throwable {
        waitFor(2000);
        staticTextValidation(PopUpMessage, PayOutsideConstants.RECEIPTMSG);
    }

    @When("^the system displays the confirmation popup for not receiving mails$")
    public void the_system_displays_the_confirmation_popup_for_not_receiving_mails() throws Throwable {
        waitFor(2000);
        staticTextValidation(PopUpMessage1, PayOutsideConstants.RECEIPTMSGNO);
    }

    @Then("^user taps on fuel icon and start fuelling button$")
    public void user_taps_on_fuel_icon_and_start_fuelling_button() throws Throwable {
        waitFor(9000);
        clickButtonWithOutScroll(FuelIcon);
        waitForElement(StartFuelIcon, 25);
        clickButtonWithOutScroll(StartFuelIcon);
//	        if (isElementDisplayedWithoutAssert(StartFuelIcon)) {
//			waitForElement(FuelIcon,3);
//	        clickButtonWithOutScroll(FuelIcon);
//	        clickButtonWithOutScroll(Nectarpop);
//	        waitForElement(StartFuelIcon,5);
//	        clickButtonWithOutScroll(StartFuelIcon);
//		}

    }

    @Then("^user selects the pump from 'Select your Pump' page and taps on continue button$")
    public void user_selects_the_pump_from_Select_your_Pump_page_and_taps_on_continue_button() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementDisplayedWithoutAssert(LocationContinueButton)) {
                clickButtonWithOutScroll(LocationContinueButton);
                waitFor(1000);
                driver.switchTo().alert().accept();
            }
            waitForElement(PumpContinueBtn, 20);
            clickButtonWithOutScroll(PumpContinueBtn);
            waitFor(25000);
            if (isElementDisplayedWithoutAssert(SaveOnPointsRedemptionscreen)) {
                clickButtonWithOutScroll(ContinueButtonRedemptionScreen);
            }
        } else {
            waitForElement(PumpContinueBtn, 20);
            clickButtonWithOutScroll(PumpContinueBtn);
            waitFor(25000);
            if (isElementDisplayedWithoutAssert(SaveOnPointsRedemptionscreen)) {
                clickButtonWithOutScroll(ContinueButtonRedemptionScreen);
            }
        }
    }

    @And("^user confirms the payment$")
    public void userConfirmsThePayment() {
        waitFor(5000);
        if (isElementDisplayedWithoutAssert(PayPalButn)) {
            clickButtonWithOutScroll(PayPalButn);
        }
        if (isElementDisplayedWithoutAssert(ReadyCtnBtn)) {
            clickButtonWithOutScroll(ReadyCtnBtn);
        }
    }

//	@Then("^user taps on done button after finishing fuelling$")
//	public void user_taps_on_done_button_after_fininshing_fuelling() throws Throwable {
//		waitForElement(DoneBtn,50);
//		clickButtonWithOutScroll(DoneBtn);
//
//	}

    @Then("^the system should display the authorization screen$")
    public void theSystemShouldDisplayTheAuthorizationScreen() {
        waitForElement(AuthorizeTxt, 6);
        staticTextValidation(AuthorizeTxt, PayOutsideConstants.PAYMENTAUTHMSG);

    }

    @Then("^the system should display the loader when authorization is in progress$")
    public void theSystemShouldDisplayTheLoaderWhenAuthorizationIsInProgress() {

        Assert.assertTrue(isElementDisplayed(AuthorizeTxtSiteId));
        staticTextValidation(CnfrmLoader, "Please wait");
        staticTextValidation(PleaseWaitBottomCt, PayOutsideConstants.PLEASEWAITBOTTOMCT);
        staticTextValidation(PleaseWaitPumpCt, PayOutsideConstants.PLEASEWAITPUMP);
        staticTextValidation(AuthorizeTxt, PayOutsideConstants.PAYMENTAUTHMSG);
    }

    @When("^user taps on cancel button in the 'Start fuelling now' page$")
    public void userTapsOnCancelButtonInTheStartFuellingNowPage() {
        webDriverWaitForElement(15).until(ExpectedConditions.visibilityOf(okBtnStartFuelling));
        okBtnStartFuelling.click();
        System.out.println("clicked OK");
        CancelBttn.click();

    }

    @Then("^the system displays the cancellation popup$")
    public void theSystemDisplaysTheCancellationPopup() {
        staticTextValidation(CancelPopUpMessage, "Transaction Cancelled");
    }

    @And("^system cancels the transaction and returns to the 'Confirm Payment' Screen$")
    public void systemCancelsTheTransactionAndReturnsToTheConfirmPaymentScreen() {

        staticTextValidation(ConfrmPayment, PayOutsideConstants.CONFRMPAYMENT);
    }

    @Then("^user checks the details in the transaction summary screen$")
    public void userChecksTheDetailsInTheTransactionSummaryScreen() {
        waitForElement(DoneBtn, 70);
        Assert.assertTrue(isElementDisplayed(FuelAmount));
        Assert.assertTrue(isElementDisplayed(FuelGrade));
        Assert.assertTrue(isElementDisplayed(FuelQty));
        Assert.assertTrue(isElementDisplayed(DoneBtn));

    }

    @When("^user checks the Transaction Details in the transaction summary screen$")
    public void userChecksTheTransactionDetailsInTheTransactionSummaryScreen() {
        waitForElement(TransDetLink, 30);
        clickButtonWithOutScroll(TransDetLink);

    }

    @And("^the user should view the receipt after clicking view in Transaction Details screen$")
    public void theUserShouldViewTheReceiptAfterClickingViewInTransactionDetailsScreen() {
        waitForElement(ViewLink, 6);
        clickButtonWithOutScroll(ViewLink);
    }


    @And("^system should display the alignment$")
    public void systemShouldDisplayTheAlignment() {
        waitForElement(TutorialAlignment, 6);
        Assert.assertTrue(isElementDisplayed(TutorialAlignment));
    }

    @And("^user selects the payment method under 'Select your pump' page$")
    public void userSelectsThePaymentMethodUnderSelectYourPumpPage() {
        waitForElement(PaymentMethod, 6);

        clickButtonWithOutScroll(PaymentMethod);
    }

    @And("^user adds the Nectar card details by clicking the Add nectar card in Payment details screen$")
    public void userAddsTheNectarCardDetailsByClickingTheAddNectarCardInPaymentDetailsScreen() {
        waitForElement(PaymentAddNectar, 10);
        ScrollTo(OffersContants.ADDNECTAR, AccountConstants.IOSSCROLLDOWN, PaymentAddNectar);
        waitForElement(PaymentAddNectar, 10);
        clickButtonWithOutScroll(PaymentAddNectar);

    }

    @And("^user taps on continue button in payment details screen$")
    public void userTapsOnContinueButtonInPaymentDetailsScreen() {

        waitForElement(PaymentContinueBtn, 6);
        clickButtonWithOutScroll(PaymentContinueBtn);

    }

//	@And("^user verifies the Select your Pump Screen$")
//	public void userVerifiesTheSelectYourPumpScreen() {
//		waitForElement(PumpContinueBtn,600);
//		Assert.assertTrue(isElementDisplayed(MenuPagea.BackBtn));
//		Assert.assertTrue(isElementDisplayed(QrCodeButtonSelectYourPump));
//		//Assert.assertTrue(isElementDisplayed(AuthorizeTxtSiteId));
//		staticTextValidation(SelectYourPumpHeading, PayOutsideConstants.SELECTYOURPUMPHEADING);
////		staticTextValidation(SelectYourPumpSubHeading, PayOutsideConstants.SELECTYOURPUMPSUBHEADING);
////		staticTextValidation(SelectYourPumpNo1, PayOutsideConstants.PIN1);
////		staticTextValidation(SelectYourPumpNo2, PayOutsideConstants.PIN2);
////		staticTextValidation(SelectYourPumpNo3, PayOutsideConstants.PIN3);
//		//Assert.assertTrue(isElementDisplayed(MfaLinkSelectYourPump));
//		//Assert.assertTrue(isElementDisplayed(MfaInfoSelectYourPump));
//		Assert.assertTrue(isElementDisplayed(PaymentMethodLinkSelectYourPump));
//		staticTextValidation(PumpContinueBtn, PayOutsideConstants.CONTINUEBUTTONSELECTYOURPUMP);
//	}

//	@And("^user validate and delete the nectar card in Account screen$")
//	public void userValidateAndDeleteTheNectarCardInAccountScreen() throws Throwable {
//
//		//ScrollTo(AccountConstants.TERMSCROLL, AccountConstants.IOSSCROLLUP, TermsACondition);
//		if (isElementDisplayedWithoutAssert(AccountPagea.AccountNectarCardAdded)) {
//			AccountSteps.nectarDeleteAndVerify();
//		}
//	}

    @Then("^user verify the payment details screen with Nectar card$")
    public void userVerifyThePaymentDetailsScreenWithNectarCard() {
        waitForElement(EssoNectarHeadingPaymentDetails, 25);
        ScrollTo(PayOutsideConstants.ESSONECTARHEADINGPAYMENTDETAILS, AccountConstants.IOSSCROLLUP, EssoNectarHeadingPaymentDetails);
        staticTextValidation(EditPaymentMethodHeader, PayOutsideConstants.PAYMENTDETAILSHEADING);
        staticTextValidation(EssoNectarHeadingPaymentDetails, PayOutsideConstants.ESSONECTARHEADINGPAYMENTDETAILS);
        staticTextValidation(PaymentContinueBtn, PayOutsideConstants.CONTINUEBUTTONSELECTYOURPUMP);
        isElementDisplayed(PymtDetailsNectarCardList);
    }

    @Then("^user verify the confirms the payment screen$")
    public void user_verify_the_confirms_the_payment_screen() throws Throwable {
        waitForElement(ConfirmPaymentScreenHeader, 8);
        staticTextValidation(ConfirmPaymentScreenHeader, GuestCheckOutConstants.ConfirmPaymentHeader);
        Assert.assertTrue(fuelConfirmSubHeaderText.isDisplayed());
        staticTextValidation(selectPumpHeaderText, GuestCheckOutConstants.SelectedPumpText);
        staticTextValidation(paymentMethodHeaderText, GuestCheckOutConstants.PaymentMethodText);
        staticTextValidation(maxFuellingHeaderText, GuestCheckOutConstants.MaxFuellingAmountText);
        staticTextValidation(rewardPaymentHeaderText, GuestCheckOutConstants.RewardText);
        if (isElementDisplayedWithoutAssert(Confirm_BTN)) {
            Assert.assertTrue(Confirm_BTN.isEnabled());
        } else if (isElementDisplayedWithoutAssert(PayPalButn)) {
            Assert.assertTrue(isElementEnabled(PayPalButn));
        }
    }

//	@Then("^user taps on continue button$")
//	public void user_taps_on_continue_button() throws Throwable {
//		if(platformName.equalsIgnoreCase("Android"))
//		{
//			waitFor(8000);
//			clickButtonWithOutScroll(ReadyCtnBtn);
//		}
//		else {
//			waitForElement(ContinueBtn, 6);
//			clickButtonWithOutScroll(ContinueBtn);
//		}
//	}

    @And("^verify the Select Your Pump Screen$")
    public void verify_the_select_your_pump_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            if (isElementDisplayedWithoutAssert(LocationContinueButton)) {
                clickButtonWithOutScroll(LocationContinueButton);
                waitFor(1000);
                driver.switchTo().alert().accept();
            }
            waitForElement(selectpump, 6);
            staticTextValidation(selectpump, "Select your pump");
        } else {
            waitForElement(selectpump, 6);
            staticTextValidation(selectpump, "Select your pump");
        }
    }

    @And("^user taps on continue button in Select Your Pump Screen$")
    public void user_taps_on_continue_button_in_select_your_pump_screen() throws Throwable {
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(PumpContinueBtn, 10);
            clickButtonWithOutScroll(PumpContinueBtn);
            waitFor(10000);
            if (isElementEnabled(SaveOnPointsRedemptionscreen)) {
                clickButtonWithOutScroll(PumpContinueBtn);
            }
        } else {
            waitForElement(PumpContinueBtn, 10);
            clickButtonWithOutScroll(PumpContinueBtn);
            waitFor(10000);
            if (isElementDisplayedWithoutAssert(SaveOnPointsRedemptionscreen)) {
                clickButtonWithOutScroll(PumpContinueBtn);
            }
        }
    }

    @And("^user taps on confirms the payment$")
    public void user_taps_on_confirms_the_payment() throws Throwable {
        waitForElement(confirmspayment, 600);
        clickButtonWithOutScroll(confirmspayment);
    }

    @Then("^user verify the Authorising your payment screen$")
    public void user_verify_the_authorising_your_payment_screen() throws Throwable {
        waitForElement(Authorisingpayment, 60);
        staticTextValidation(Authorisingpayment, "Authorising your payment");
    }

    @Then("^user verify the Start fuelling now screen$")
    public void user_verify_the_start_fuelling_now_screen() throws Throwable {

        if (isElementDisplayedWithoutAssert(Startfuelling)) {
            staticTextValidation(Startfuelling, "Start fuelling now");
            Assert.assertTrue(isElementDisplayed(CancelButton));
            Assert.assertTrue(isElementDisplayed(AuthorizeTxtSiteId));
            staticTextValidation(StartfuellingSubheading, "Please start fuelling");
            staticTextValidation(StartfuellingPump, "PUMP");
            staticTextValidation(StartfuellingPumpNumber, "1");
            Assert.assertTrue(isElementDisplayed(StartfuellingCt));
        }

    }

    @Then("^user verify the Transaction Complete screen$")
    public void user_verify_the_transaction_complete_screen() throws Throwable {
        waitForElement(TransactionCompleteSafeTravels, 90);
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(HeaderText, GuestCheckOutConstants.TransactionComplete);
            staticTextValidation(TransactionCompleteSafeTravels, GuestCheckOutConstants.SafeTravelsText);
            staticTextValidation(TransactionCompleteSuccessfulCt, GuestCheckOutConstants.PaymentSuccessful);
            Assert.assertTrue(isElementDisplayed(FuelProductName));
            Assert.assertTrue(isElementDisplayed(TransactionAmount));
            isElementDisplayed(PaymentInfo);
            staticTextValidation(TransactionDetailsLinK, GuestCheckOutConstants.TransactionDetailsLinkText);
            staticTextValidation(PaymentConfirmationDone, GuestCheckOutConstants.DONE);

        } else {
//			waitForElement(TransactionCompleteFuelType, 90);
            staticTextValidation(TransactionComplete, "Transaction Complete");
            staticTextValidation(TransactionCompleteSafeTravels, "Safe travels!");
            staticTextValidation(TransactionCompleteSuccessfulCt, "Your payment was successful.");
            Assert.assertTrue(isElementDisplayed(TransactionCompleteFuelType));
            Assert.assertTrue(isElementDisplayed(TransactionCompleteQuantity));
            Assert.assertTrue(isElementDisplayed(TransactionCompletePrice));
            staticTextValidation(TransactionCompletePaid, "PAID");
            staticTextValidation(TransactionCompleteDetails, "Transaction Details");
            Assert.assertTrue(isElementDisplayed(DoneBtn));
        }
    }

    @And("^user adds the Nectar card details by clicking the Add nectar card in Transaction Complete screen$")
    public void user_adds_the_nectar_card_details_by_clicking_the_add_nectar_card_in_transaction_complete_screen()
            throws Throwable {
        waitForElement(AddNectar, 30);
        clickButtonWithOutScroll(AddNectar);
    }

    @Then("^user verify the Transaction Details screen$")
    public void user_verify_the_transaction_details_screen() throws Throwable {
        waitForElement(Transactiondeatilspage, 6);
        staticTextValidation(Transactiondeatilspage, "Transaction Details");
        staticTextValidation(TransactionDetailsPaid, "PAID");
    }

    @And("^user taps on the Transaction Details screen$")
    public void user_taps_on_the_transaction_details_screen() throws Throwable {
        waitForElement(Transactiondeatils, 6);
        clickButtonWithOutScroll(Transactiondeatils);
    }

    @Then("^user verify the Verify your Nectar card to get exclusive Esso rewards$")
    public void user_verify_the_verify_your_nectar_card_to_get_exclusive_esso_rewards() throws Throwable {

        staticTextValidation(Verifynectar, "Verify your Nectar card to get exclusive Esso rewards.");

    }

    @Then("^user verify the Verify your Nectar card$")
    public void user_verify_the_verify_your_nectar_card() throws Throwable {
        waitForElement(Verifynectar, 600);
        clickButtonWithOutScroll(Verifynectar);
    }

    @And("^user taps on Verify your Nectar card to get exclusive Esso rewards$")
    public void user_taps_on_verify_your_nectar_card_to_get_exclusive_esso_rewards() throws Throwable {

        staticTextValidation(Verifynectarmsg, "\"Esso\" would like to open \"nectar.com\" to verify your card.");

    }

    @Then("^user verify the Loyalty discounted for fuelling$")
    public void user_verify_the_loyalty_discounted_for_fuelling() throws Throwable {

        staticTextValidation(Nectarpoint, "+10 points");

    }

    @Then("^user tap done in the Transaction Complete screen$")
    public void userTapDoneInTheTransactionCompleteScreen() {

        clickButtonWithOutScroll(DoneBtn);
    }


    @Then("^user verifies the Verify Nectar card link in the Transaction Complete screen$")
    public void userVerifiesTheVerifyNectarCardLinkInTheTransactionCompleteScreen() {
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(VerifyNectarLinkTransactionComplete,
                    "Verify your Nectar card to get exclusive\nEsso rewards.");
        } else {
            staticTextValidation(VerifyNectarLinkTransactionComplete,
                    "Verify your Nectar card to get exclusive Esso rewards.");
        }
    }

//	@Then("^verify below are the elements$")
//	public void verify_below_are_the_elements(DataTable arg1) throws Throwable {
//		waitForElement(changepayment,60);
//		Assert.assertTrue(isTextMatch(MaximumFueling.getText(), PayOutsideConstants.Fuelingamt));
//		Assert.assertTrue(isElementDisplayed(ContinueBtn));
//
//	}

    @Then("^user verifies the Transaction Details screen from Transaction complete screen$")
    public void userVerifiesTheTransactionDetailsScreenFromTransactionCompleteScreen() {
        waitFor(5000);
        Assert.assertTrue(isElementDisplayed(BackBtn));
        staticTextValidation(TransactionDetailsHeading, "Transaction Details");
        Assert.assertTrue(isElementDisplayed(TransactionDetailsAddress));
        Assert.assertTrue(isElementDisplayed(TransactionDetailsTime));
        Assert.assertTrue(isElementDisplayed(TransactionDetailsRateWithoutPoints));
        Assert.assertTrue(isElementDisplayed(TransactionDetailsFuelTypeWithoutPoints));
        Assert.assertTrue(isElementDisplayed(TransactionDetailsPriceWithoutPoints));
        staticTextValidation(TransactionCompletePaid, "PAID");
        staticTextValidation(TransactionDetailsVat, "VAT Receipt");
        staticTextValidation(TransactionDetailsView, "View");
        staticTextValidation(TransactionDetailsAddNote, "+ Add Note");
    }

    @When("^user taps on \"([^\"]*)\" button from confirm payment screen$")
    public void userTapsOnButtonFromConfirmPaymentScreen(String arg0) throws Throwable {

        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(PayPalButn, 10);
            clickButtonWithOutScroll(PayPalButn);
        } else {
            waitForElement(getButtonElement("PayPal"), 4);
            clickButtonWithOutScroll(getButtonElement("PayPal"));
        }
    }

    @When("^user taps on Transaction Details Link in the Transaction Complete Screen$")
    public void userTapsOnTransactionDetailsLinkInTheTransactionCompleteScreen() {
        waitForElement(Transactiondeatils, 5);
        clickButtonWithOutScroll(Transactiondeatils);
    }

    @And("^validate the details in the Transaction Details screen$")
    public void validateTheDetailsInTheTransactionDetailsScreen() {
        staticTextValidation(Transactiondeatils, "Transaction Details");
        staticTextValidation(TransactionCompletePaid, "PAID");
    }

    @When("^user tap on add note’s in transaction details screen$")
    public void userTapOnAddNoteSInTransactionDetailsScreen() {
        clickButtonWithOutScroll(getTextElement("Add Note"));
    }

    @Then("^verify if the user is navigated to the Transaction Complete Screen$")
    public void verifyIfTheUserIsNavigatedToTheTransactionCompleteScreen() {
        if (platformName.equalsIgnoreCase("Android")) {
            waitForElement(HeaderText, 10);
            staticTextValidation(HeaderText, GuestCheckOutConstants.TransactionComplete);
        } else {
            waitForElement(TransactionComplete, 10);
            staticTextValidation(TransactionComplete, "Transaction Complete");
        }
    }

    @Then("^user verifies is Navigated to Thank you Screen$")
    public void userVerifiesIsNavigatedToThankYouScreen() {
        waitForElement(thankYouHeader, 15);
        if (platformName.equalsIgnoreCase("Android")) {
            Assert.assertTrue(isElementDisplayed(thankYouHeader));
            Assert.assertTrue(SkipBtn1.isDisplayed());
            Assert.assertTrue(TestLink.isDisplayed());
        } else {
            Assert.assertTrue(isElementDisplayed(thankYouHeader));
            Assert.assertTrue(SkipBtn1.isEnabled());
        }
    }

    @Then("^user verifies the Thank you screen$")
    public void userVerifiesTheThankYouScreen() {
        Assert.assertTrue(isElementDisplayed(thankYouHeader));
    }

    @And("^user verifies Payment details screen before adding nectar card$")
    public void userVerifiesPaymentDetailsScreenBeforeAddingNectarCard() {
        waitForElement(PaymentAddNectar, 15);
        staticTextValidation(EditPaymentMethodHeader, PayOutsideConstants.PAYMENTDETAILSHEADING);
        staticTextValidation(EssoNectarHeadingPaymentDetails, PayOutsideConstants.ESSONECTARHEADINGPAYMENTDETAILS);
        staticTextValidation(PaymentContinueBtn, PayOutsideConstants.CONTINUEBUTTONSELECTYOURPUMP);
        if (platformName.equalsIgnoreCase("Android")) {
            staticTextValidation(EditPymtAddNectarCardTxt, OffersContants.CPNECTDES);
        } else {
            staticTextValidation(EditPymtAddNectarCardTxt, OffersContants.CPNECTDES1);
        }
        isElementDisplayed(PaymentAddNectar);
    }


    @Then("^Verify the loyalty discount amount format is correct$")
    public void verify_discount_amount() {

        String discountedAmount = loyalityAmountDiscounted.getText();
        if (Pattern.matches("-£\\d+.\\d+", discountedAmount)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @Then("^Verify the loyalty discount amount is not zero$")
    public void verify_discount_amount_not_zero() {

        String discountedAmount = loyalityAmountDiscounted.getText();
        if (Pattern.matches("-£\\d+.\\d+", discountedAmount)) {
            Assert.assertFalse(discountedAmount.split("£")[1].trim().equalsIgnoreCase("0.00"));
        } else {
            Assert.fail();
        }
    }

    @And("^user selects pump number \"([^\"]*)\"$")
    public void selectPump(String pumpNumber) {
        if (platformName.equalsIgnoreCase("Android")) {
            //			String pumpNumberOri = pumpNumber ;
//			int pumpNum = Integer.parseInt(pumpNumber) + 2 ;
//			String pumpNumberCalc = String.valueOf(pumpNum);
//			webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(pumpSelection));
//			WebElement pump = ((AndroidDriver)driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(new UiSelector().text(\""+pumpNumberCalc+"\"))");
//
//
//
//			WebElement pumpOri = ((AndroidDriver)driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(new UiSelector().text(\""+pumpNumberOri+"\"))");
//			((AndroidDriver)driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(new UiSelector().text(\""+pumpNumber+"\"))");
//			TouchAction act= new TouchAction(((AndroidDriver)driver));
//			act.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5))).
//					press(ElementOption.element(driver.findElement(By.xpath("//*[contains(@text,'8')]")))).
//					waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).
//					moveTo(ElementOption.element(driver.findElement(By.xpath("//*[contains(@text,'6')]")))).
//					release().
//					perform();
//
//
//			driver.findElement(By.xpath("//*[@text='3']")).click();
        }
    }

    @And("^user selects pump number \"([^\"]*)\" to start fuelling$")
    public void userSelectsPumpNumberToStartFuelling(String PumpNumber) throws Throwable {
        waitForElement(selectpump, 15);
        int pumpNum = Integer.parseInt(PumpNumber);
        for (int i = 1; i <= pumpNum; i++) {
            String label = String.valueOf(i);
            if (platformName.equalsIgnoreCase("Android")) {
                waitForElement(getAndroidElementText(label), 10);
                clickButtonWithOutScroll(getAndroidElementText(label));
            } else {
                waitFor(8000);
                clickButtonWithOutScroll(getTextElement(label));
            }
        }
    }
//
//    @Then("^user verifies the updated content of the start button in the LID$")
//    public void userVerifiesTheUpdatedContentOfTheStartButtonInTheLID() {
//
//    }

    @Then("^the user validates whether Google Pay is updated in the Confirm Payment screen$")
    public void userValidatesGooglePayIsUpdatedInTheConfirmPaymentScreen() {
//		waitForElement(PaymentMethodValueConfirmPayment, 10);
//		staticTextValidation(PaymentMethodValueConfirmPayment, PaymentMethod);
        waitForElement(PaymentMethodValueConfirmPayment, 8);
        staticTextValidation(PaymentMethodValueConfirmPayment, "Google Pay");


    }

    @When("^user taps on Google pay in Add Payment Method screen$")
    public void userTapsOnGooglePayInAddPaymentMethodScreen() {
        waitForElement(GooglePayAddPaymentMethodScreen, 10);
        clickButtonWithOutScroll(GooglePayAddPaymentMethodScreen);
    }

    @Then("^user validates the popup after adding Google Pay$")
    public void userValidatesThePopupAfterAddingGooglePay() {
        waitForElement(PopUpOkPaymentMethod, 10);
        staticTextValidation(GooglePayAddedPopupCt, PayOutsideConstants.GOOGLEPAYADDEDPOPUPCT);
    }

    @Then("^user taps on OK button in the Google Pay$")
    public void userTapsOnOKButtonInTheGooglePay() {
        waitForElement(PopUpOkPaymentMethod, 10);
        clickButtonWithOutScroll(PopUpOkPaymentMethod);
    }

    @Then("^the user validates whether Gpay button is updated in the Confirm Payment screen$")
    public void userValidatesWhetherGpayButtonIsUpdatedInTheConfirmPaymentScreen() {
        waitForElement(GPayMethodConfirmPayment);
        Assert.assertTrue(GPayMethodConfirmPayment.isDisplayed());
    }

    @When("^the user taps on edit button in the selected pump$")
    public void userTapsOnEditButtonInTheSelectedPump() {
        waitForElement(PumpEditButtonConfirmPayment, 20);
        clickButtonWithOutScroll(PumpEditButtonConfirmPayment);
    }

    @When("^the user taps on edit button in the payment method in confirm payment screen$")
    public void userTapsOnEditButtonInThePaymentMethodInConfirmPaymentScreen() {
        waitForElement(PaymentMethodEditButtonConfirmPayment, 20);
        clickButtonWithOutScroll(PaymentMethodEditButtonConfirmPayment);
    }

    @Then("^the user validates Google Pay payment method present in payment details screen$")
    public void userValidatesGooglePayPaymentMethodPresentInPaymentDetailsScreen() {
        Assert.assertTrue(GooglePayPaymentMethod.isDisplayed());

    }

    @When("^user taps on cancel button from confirm payment screen$")
    public void userTapsOnCancelButtonFromConfirmPaymentScreen() {
        waitForElement(CancelButtonConfirmPaymentScreen, 20);
        clickButtonWithOutScroll(CancelButtonConfirmPaymentScreen);
    }

    @Then("^verify the google pay displayed as a first payment$")
    public void googlePayDisplayedAsAFirstPayment() {
        waitForElement(GooglePayFirstPayment, 10);
        System.out.println("Google Pay is displayed as a first payment: " + GooglePayFirstPayment.isDisplayed());
        Assert.assertTrue(GooglePayFirstPayment.isDisplayed());
    }

    @Then("^user validates the first tutorial screen during fuelling$")
    public void userValidatesTheFirstTutorialScreenDuringFuelling() {
        waitForElement(selectpump, 20);
        staticTextValidation(FirstContextuaTipSwipeLeftCt, PayOutsideConstants.FIRSTCONTEXTUALTIPSWIPECT);
        staticTextValidation(FirstContextuaTipGotIt, PayOutsideConstants.FIRSTCONTEXTUALTIPGOTIT);
    }

    @When("^user unlink the added googlepay payment$")
    public void userUnlinkTheAddedGooglepayPayment() {
        waitForElement(UnlinkGooglePay, 20);
        clickButtonWithOutScroll(UnlinkGooglePay);
    }

    @Then("^user validates the popup once the unlink is clicked$")
    public void userValidatesThePopupUnlinkClicked() {
        waitForElement(UnlinkGooglePay, 10);
        staticTextValidation(GooglePayUnlinkPopupCt, PayOutsideConstants.GOOGLEPAYUNLINKPOPUPCT);

    }

    @And("^user taps on unlink button$")
    public void userTapsOnUnlinkButton() {
        waitForElement(UnlinkButton, 20);
        clickButtonWithOutScroll(UnlinkButton);
    }

    @When("^verify the displayed popup once it is unlinked$")
    public void unlinkedSuccessfullyPopup() {
        staticTextValidation(UnlinkedSuccessfully, PayOutsideConstants.UNLINKEDSUCCESSFULLY);
    }

    @Then("^user taps on OK button in popup$")
    public void userTapsOnOKButtonInPopup() {
        clickButtonWithOutScroll(GooglePayOkButton);
    }

    @Then("^verify the googlepay displayed as first payment in add payment method$")
    public void googlepayDisplayedAsFirstPaymentInAddPaymentMethod() {
        System.out.println("Google Pay is displayed as a first payment: " + GooglePayFirstPaymentAddPayMethod.isDisplayed());
        Assert.assertTrue(GooglePayFirstPaymentAddPayMethod.isDisplayed());

    }

    @Then("^validtes the add payment button present in Lid screen$")
    public void validtesTheAddPaymentButtonPresentInLidScreen() {
        waitForElement(AddPaymentButton, 10);
        Assert.assertTrue(AddPaymentButton.isDisplayed());
    }

    @And("^user taps on add payment button present in Lid screen$")
    public void userTapsOnAddPaymentButtonPresentInLidScreen() {
        waitForElement(AddPaymentButton, 10);
        clickButtonWithOutScroll(AddPaymentButton);

    }

    @Then("user should see GooglePay title")
    public void userShouldSeeGooglePayTitle() {
        waitForElement(GooglePayTitle);
        org.testng.Assert.assertEquals(GooglePayTitle.getText(), PayOutsideConstants.GOOGLEPAYTEXT);
    }

    @Then("user verifies Edit GooglePay button")
    public void userVerifiesEditGooglePayButton() {
        waitForElement(UnlinkGooglePay);
        Assert.assertTrue(isElementDisplayed(UnlinkGooglePay));
    }

    @Then("user should see GooglePay subtitle")
    public void userShouldSeeGooglePaySubtitle() {
        waitForElement(GooglePaySubTitle);
        Assert.assertEquals(GooglePaySubTitle.getText(), PayOutsideConstants.GOOGLEPAYSUBTEXT);
    }

    @Then("user taps on unlink button for Google pay")
    public void userTapsOnUnlinkButtonForGooglePay() {
        waitForElement(UnlinkGooglePay);
        clickButtonWithOutScroll(UnlinkGooglePay);
    }

    @Then("user cancels the Google pay unlink")
    public void userCancelsTheGooglePayUnlink() {
        waitForElement(GooglePayUnlinkCancelBtnPopUp);
        clickButtonWithOutScroll(GooglePayUnlinkCancelBtnPopUp);
    }

    @Then("user unlinks the Google pay")
    public void userUnlinksTheGooglePay() {
        waitForElement(GooglePayUnlinkBtnInPopUp);
        clickButtonWithOutScroll(GooglePayUnlinkBtnInPopUp);
    }
}