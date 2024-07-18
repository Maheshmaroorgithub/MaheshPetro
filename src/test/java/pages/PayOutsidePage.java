package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class PayOutsidePage extends GenericWrappers {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/preceding::XCUIElementTypeButton[@name='circleCheck']")
	@AndroidFindBy(id = "account_receipt_checkBox")
	public WebElement ReceiptCKbx;

//	@AndroidFindBy(id = "account_terms_link")
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Terms and Conditions\"))")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Terms and'")
	public WebElement TermsACondition;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/preceding::XCUIElementTypeButton[@name='circleUnCheck']")
	public WebElement emailUnCircleCheck_box;
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public WebElement okBtn;

	@AndroidFindBy(id = "action_fuel")
	@iOSXCUITFindBy(id = "Fuel")
	public WebElement FuelIcon;

	@AndroidFindBy(id = "dashboard_start_option_inner_img")
	@iOSXCUITFindBy(id = "start_button")
	public WebElement StartFuelIcon;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Close Icon")
	public WebElement CloseButtonModalPopupLid;

	@AndroidFindBy(xpath = "//*[contains(@text,'Cancel')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	public WebElement CancelBttn;

	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement PumpContinueBtn;

	@AndroidFindBy(id = "confirm_payment")
	@iOSXCUITFindBy(id = "confirm_payment")
	public WebElement ConfirmPaymentScreenHeader;

	@iOSXCUITFindBy(id = "comfirm_payment_sub_desc_text")
	@AndroidFindBy(id = "comfirm_payment_sub_desc_text")
	public WebElement fuelConfirmSubHeaderText;

	@iOSXCUITFindBy(id = "text_selected_pump")
	@AndroidFindBy(id = "text_selected_pump")
	public WebElement selectPumpHeaderText;

	@iOSXCUITFindBy(id = "text_payment_method")
	@AndroidFindBy(id = "text_payment_method")
	public WebElement paymentMethodHeaderText;

	@iOSXCUITFindBy(id = "pre_auth_title_tv")
	@AndroidFindBy(id = "pre_auth_title_tv")
	public WebElement maxFuellingHeaderText;

	@iOSXCUITFindBy(id = "reward_title")
	@AndroidFindBy(id = "reward_title")
	public WebElement rewardPaymentHeaderText;

	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(id="location_continue_btn")
	public  WebElement LocationContinueButton;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]")
	public WebElement HeaderText;

	@AndroidFindBy(id = "regular_unleaded_title")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Supreme Unleaded\"]")
	public WebElement FuelProductName;

	@AndroidFindBy(id = "regular_unleaded_points")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	public WebElement TransactionAmount;

	@AndroidFindBy(id = "total_lyt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[3]")
	public WebElement PaymentInfo;

	@AndroidFindBy(id = "payment_confirmation_full_receipt_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Transaction Details\"]")
	public WebElement TransactionDetailsLinK;

	@AndroidFindBy(id = "payment_confirmation_done_btn")
	@iOSXCUITFindBy(id="payment_confirmation_done_btn")
	public WebElement PaymentConfirmationDone;
	@AndroidFindBy(id = "pump_select_confirm_btn")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Confirm\"]")
	public WebElement Confirm_BTN;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Changes saved. You will now receive receipts via email.")
	public WebElement PopUpMessage;

	@AndroidFindBy(id = "pay_with_paypal_btn")
	@iOSXCUITFindBy(id = "pay_with_paypal_btn")
	public WebElement PayPalButn;

	@AndroidFindBy(id = "payment_confirmation_done_btn")
	@iOSXCUITFindBy(id = "payment_confirmation_done_btn")
	public WebElement DoneBtn;

	@AndroidFindBy(id = "paid_pound_value")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public WebElement FuelAmount;

	@AndroidFindBy(id = "regular_unleaded_title")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public WebElement FuelGrade;

	@AndroidFindBy(id = "full_receipt_fuel_litre")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public WebElement FuelQty;

	@AndroidFindBy(id = "fuel_authorize_title")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public WebElement ReadyStrtFuel;

	@AndroidFindBy(id = "fuel_authorize_continue_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Continue'")
	public WebElement ReadyCtnBtn;

	@AndroidFindBy(id = "authorising_sub_desc_text")
	@iOSXCUITFindBy(id = "Authorizing your payment")
	public WebElement AuthorizeTxt;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	public WebElement AuthorizeTxtSiteId;

	@AndroidFindBy(id = "authorising_please_wait_text")
	@iOSXCUITFindBy(id = "Please wait")
	public WebElement CnfrmLoader;

	@AndroidFindBy(id = "alertTitle")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public WebElement CancelPopUpMessage;

	@AndroidFindBy(id = "confirm_payment")
	@iOSXCUITFindBy(id = "confirm_payment")
	public WebElement ConfrmPayment;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
	@iOSXCUITFindBy(id = "Locator Need")
	public WebElement TransDetLink;

	@AndroidFindBy(id = "vat_receipt_status")
	@iOSXCUITFindBy(id = "vat_receipt_status")
	public WebElement ViewLink;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout")
	@iOSXCUITFindBy(id = "Locator Need")
	public WebElement TutorialAlignment;

	@AndroidFindBy(id = "pump_select_paymentdetails_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[3]/XCUIElementTypeStaticText")
	public WebElement PaymentMethod;


	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment Details\"]")
	public WebElement EditPaymentMethodHeader;

	@AndroidFindBy(id = "pre_transaction_summary_add_clubcard")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Nectar Card\"]")
	public WebElement PaymentAddNectar;

	@AndroidFindBy(id = "account_your_nectar_collect_review_txt")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'You can collect Nectar'")
	public WebElement EditPymtAddNectarCardTxt;

	@AndroidFindBy(id = "pre_transaction_summary_clubcard_list")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]")
	public WebElement PymtDetailsNectarCardList;

	@AndroidFindBy(id = "payment_details_update_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Continue'")
	public WebElement PaymentContinueBtn;

	@AndroidFindBy(id = "card_holder_name")
	@iOSXCUITFindBy(id = "Save on fuel with points")
	public WebElement SaveOnPointsRedemptionscreen;

	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement ContinueButtonRedemptionScreen;

	@AndroidFindBy(id = "pump_select_text")
	@iOSXCUITFindBy(id = "pump_select_text")
	public WebElement selectpump;

	@AndroidFindBy(id = "payment_paypal_btn")
	@iOSXCUITFindBy(id = "Locator Need")
	public WebElement confirmspayment;

	@AndroidFindBy(id = "authorising_sub_desc_text")
	@iOSXCUITFindBy(id = "Authorising your payment")
	public WebElement Authorisingpayment;

	@AndroidFindBy(id = "fueling_counter_startfueling_text")
	@iOSXCUITFindBy(id = "Start fuelling now")
	public WebElement Startfuelling;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction Complete\"]")
	public WebElement TransactionComplete;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"ETV Esso Link\"]/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ETV Esso Link\"]")
	public WebElement TestLink;

	@AndroidFindAll({@AndroidBy(xpath = "//*[contains(@resource-id,'loyality_amount')]"),@AndroidBy(xpath = "//*[contains(@resource-id,'points_used_tv')]")})
	public WebElement loyalityAmountDiscounted;

	@AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'you!')]")
	public WebElement thankYouHeader;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(id = "Skip")
	public WebElement SkipBtn1;

	@AndroidFindAll({
			@AndroidBy(id="nectar_copy_txt2_in_tesco_screen"),
			@AndroidBy(id = "payment_confirmation_add_club_card_text")})
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name BEGINSWITH 'Add your Nectar card to'")
	public WebElement AddNectar;

	@AndroidFindBy(id = "payment_confirmation_full_receipt_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction Details\"]")
	public WebElement Transactiondeatils;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Transaction Details']")
	public WebElement Transactiondeatilspage;

	@AndroidFindAll({
			@AndroidBy(id="nectar_copy_txt2_in_tesco_screen"),
			@AndroidBy(id = "payment_confirmation_add_club_card_text")})
	@iOSXCUITFindBy(id = "Locator Need")
	public WebElement Verifynectar;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Locator Need")
	public WebElement Verifynectarmsg;

	@AndroidFindBy(id = "collect_points_tv")
	@iOSXCUITFindBy(id = "Locator Need")
	public WebElement Nectarpoint;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Changes saved. You will no longer receive receipts by email. You can still find your receipts in 'History'.")
	public WebElement PopUpMessage1;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "The fuel price displayed on the pump will apply.")
	public WebElement PleaseWaitBottomCt;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'PUMP'")
	public WebElement PleaseWaitPumpCt;

	@AndroidFindBy(id = "header_right_btn_cross")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'qrCodeReaderIcon'")
	public WebElement QrCodeButtonSelectYourPump;

	@AndroidFindBy(id = "pump_selection_messag")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Make sure you are'")
	public WebElement SelectYourPumpSubHeading;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[@text='1']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '1'")
	public WebElement SelectYourPumpNo1;

	@AndroidFindBy(id = "//android.widget.RelativeLayout[2]/android.widget.TextView[@text='2']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '2'")
	public WebElement SelectYourPumpNo2;

	@AndroidFindBy(id = "//android.widget.RelativeLayout[3]/android.widget.TextView[@text='3']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '3'")
	public WebElement SelectYourPumpNo3;

	@AndroidFindBy(id = "//android.widget.RelativeLayout[3]/android.widget.TextView[@text='3']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	public WebElement MfaLinkSelectYourPump;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]")
	public WebElement MfaInfoSelectYourPump;

	@AndroidFindBy(id = "pump_select_paymentdetails_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[3]/XCUIElementTypeStaticText")
	public WebElement PaymentMethodLinkSelectYourPump;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Payment Details'")
	public WebElement PaymentDetailsHeading;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Payment Method'")
	public WebElement PaymentMethodHeadingPaymentDetails;

	@AndroidFindBy(id = "pre_transaction_summary_clubcard_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Esso Nectar'")
	public WebElement EssoNectarHeadingPaymentDetails;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Please start fuelling")
	public WebElement StartfuellingSubheading;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "PUMP")
	public WebElement StartfuellingPump;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "1")
	public WebElement StartfuellingPumpNumber;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"You can fuel up to £ 100 Do not use your mobile while dispensing fuel or when walking on the forecourt.\"]")
	public WebElement StartfuellingCt;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
	public WebElement CancelButton;

	@AndroidFindBy(id = "safe_travel")
	@iOSXCUITFindBy(id = "safe_travel")
	public WebElement TransactionCompleteSafeTravels;

	@AndroidFindBy(id = "payment_confirmation_drive_text")
	@iOSXCUITFindBy(id = "payment_confirmation_drive_text")
	public WebElement TransactionCompleteSuccessfulCt;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	public WebElement TransactionCompleteFuelType;

	@AndroidFindBy(id = "full_receipt_fuel_litre")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	public WebElement TransactionCompleteQuantity;

	@AndroidFindBy(id = "regular_unleaded_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	public WebElement TransactionCompletePrice;

	@AndroidFindBy(id = "total_title")
	@iOSXCUITFindBy(id = "PAID")
	public WebElement TransactionCompletePaid;

	@AndroidFindBy(id = "total_tv")
	@iOSXCUITFindBy(id = "PAID")
	public WebElement TransactionDetailsPaid;

	@AndroidFindBy(id = "payment_confirmation_full_receipt_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction Details\"]")
	public WebElement TransactionCompleteDetails;

	@AndroidFindAll({
			@AndroidBy(id="nectar_copy_txt2_in_tesco_screen"),
			@AndroidBy(id = "payment_confirmation_add_club_card_text")})
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify your Nectar card to get exclusive Esso rewards.\"]")
	public WebElement VerifyNectarLinkTransactionComplete;

	@AndroidFindBy(id = "collect_points_tv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction Details\"]")
	public WebElement TransactionDetailsHeading;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "VAT Receipt")
	public WebElement TransactionDetailsVat;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"View\"]")
	public WebElement TransactionDetailsView;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+ Add Note\"]")
	public WebElement TransactionDetailsAddNote;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public WebElement TransactionDetailsAddress;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	public WebElement TransactionDetailsTime;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	public WebElement TransactionDetailsRateWithoutPoints;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[3]")
	public WebElement TransactionDetailsFuelTypeWithoutPoints;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	public WebElement TransactionDetailsPriceWithoutPoints;

	@AndroidFindBy(id="selected_amount")
	@iOSXCUITFindBy(id = "Maximum fueling amount: $100")
	public WebElement MaximumFueling;

	@AndroidFindBy(id="pump_select_paymentdetails_btn")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name=\"Change Payment Details\"]")
	public WebElement changepayment;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='PayPal']")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name=\"PayPal\"]")
	public WebElement PayPal;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='PayPal']")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name='Payment method: Paypal']")
	public List<WebElement> paymentMethodPayPal;
	
	@AndroidFindBy(id="btnClose']")
	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name='Payment method: Paypal']")
	public WebElement Nectarpop;

	@AndroidFindBy(xpath = "//*[contains(@text,'OK')]")
	public WebElement okBtnStartFuelling;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'pump_select_gallery')]")
	public WebElement pumpSelection;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup")
	public WebElement GooglePayAddPaymentMethodScreen;

	@AndroidFindBy(id = "android:id/button1")
	public WebElement PopUpOkPaymentMethod;

	@AndroidFindBy(id = "android:id/message")
	public WebElement GooglePayAddedPopupCt;

	@AndroidFindBy(id = "payment_method")
	public WebElement PaymentMethodValueConfirmPayment;

	@AndroidFindAll({
			@AndroidBy(id="pay_with_google_pay_btn"),
			@AndroidBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView")
	})
	public WebElement GPayMethodConfirmPayment;

	@AndroidFindBy(id = "select_payment_edit")
	public WebElement PumpEditButtonConfirmPayment;

	@AndroidFindBy(id = "payment_edit")
	public WebElement PaymentMethodEditButtonConfirmPayment;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup")
	public WebElement GooglePayPaymentMethod;

	@AndroidFindBy(id = "cancel_btn")
	public WebElement CancelButtonConfirmPaymentScreen;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]")
	public WebElement GooglePayFirstPayment;

	@AndroidFindBy(id = "item_edit")
	public WebElement UnlinkGooglePay;

	@AndroidFindBy(xpath = "//*[contains(@text,'Are you sure you want to unlink Google Pay?')]")
	public WebElement GooglePayUnlinkPopupCt;

	@AndroidFindBy(xpath = "//*[contains(@text,'UNLINK')]")
	public WebElement UnlinkButton;

	@AndroidFindBy(id = "android:id/button1")
	public WebElement GooglePayOkButton;

	@AndroidFindBy(xpath = "//*[contains(@text,'Google Pay unlinked successfully.')]")
	public WebElement UnlinkedSuccessfully;

	@AndroidFindBy(xpath = "//*[contains(@text,'Google Pay')]")
	public WebElement GooglePayFirstPaymentAddPayMethod;

	@AndroidFindBy(id="LocatorNeeded")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Swipe left or right to select your pump\"]")
	public WebElement FirstContextuaTipSwipeLeftCt;

	@AndroidFindBy(id="LocatorNeeded")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Got It!\"]")
	public WebElement FirstContextuaTipGotIt;

	@AndroidFindBy(id="add_payment_method_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add Payment Method\"]")
	public WebElement AddPaymentButton;

	@AndroidFindBy(id = "header_back_btn")
	@iOSXCUITFindBy(id = "NavBack")
	public WebElement BackBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Google Pay']")
	@iOSXCUITFindBy(id = "needed")
	public WebElement GooglePayTitle;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text=\"You can pay with Amex, Mastercard and Visa from your Google Pay wallet.\"]")
	@iOSXCUITFindBy(id = "needed")
	public WebElement GooglePaySubTitle;

	@AndroidFindBy(id = "android:id/button1")
	public WebElement GooglePayUnlinkBtnInPopUp;

	@AndroidFindBy(id = "android:id/button2")
	public WebElement GooglePayUnlinkCancelBtnPopUp;



	public PayOutsidePage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}