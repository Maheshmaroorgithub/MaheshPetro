package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class GuestCheckOutPage extends GenericWrappers {

	public GuestCheckOutPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
	public WebElement userName;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
	public WebElement password;

	@AndroidFindBy(id = "dashboard_start_option_inner_img")
	@iOSXCUITFindBy(id="dashboard_start_option_inner_img")
	public WebElement FuelAsGuest;

	@AndroidFindBy(id = "terms_conditions_checkBox")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"circleUnCheck\"]")
	public WebElement PrivacyAndTermsCheckBox;

	@AndroidFindBy(id = "LocatorNeeded")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sorry there was a connectivity issue while updating your details. Please try again.\"]")
	public WebElement networkSorryMessage;

	@AndroidFindBy(id = "gco_tc_continue_btn")
//	@iOSXCUITFindBy(id="location_continue_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement ContinueButtonInFuelAsGuest;

	@AndroidFindBy(id = "gco_tc_continue_btn")
	@iOSXCUITFindBy(id="location_continue_btn")
	public WebElement ContinueButtonInFuelAsGuestLetUsLocate;

	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement ContinueButtonSelect;

	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(id="location_continue_btn")
	public static WebElement LocationContinueButton;

	@AndroidFindBy(id = "permission_allow_foreground_only_button")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Allow While Using App\"]")
	public static WebElement AllowLocationWhileUsingTheApp;

	@AndroidFindBy(id = "permission_allow_one_time_button")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Allow Once\"]")
	public WebElement AllowLocationOnlyThisTime;

	@AndroidFindBy(id = "permission_dont-allow_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeScrollView[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]")
	public WebElement AllowLocationdontAllow;

	@AndroidFindBy(id = "pump_select_text")
	@iOSXCUITFindBy(id="pump_select_text")
	public WebElement SelectYourPump;

	@AndroidFindBy(id = "selected_amount")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Your Maximum Fuelling Amount: Â£100\"]")
	public WebElement Selectedamount;

	@AndroidFindBy(id = "continue_btn")
//	@AndroidFindBy(xpath = "//android.widget.Button[@text='CONFIRM']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement ConfirmButton;

	@AndroidFindBy(id = "add_payment_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name BEGINSWITH 'Add'")
	public WebElement AddDebitOrCrecitcardButton;

	@AndroidFindBy(id = "payment_name_et")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeTextField)[1]")
	public static WebElement NameOnCard;

	@AndroidFindBy(id = "payment_cardno_et")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeTextField)[2]")
	public static WebElement CardNumber;

	@AndroidFindBy(id = "payment_expdate_et")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeTextField)[3]")
	public static WebElement ExpiryDate;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"2\"]")
	public WebElement SelectPump2;

	@AndroidFindBy(id = "payment_bill_address_postcode")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeTextField)[4]")
	public WebElement PostCode;

	@AndroidFindBy(id = "payment_bill_address_street")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeTextField)[5]")
	public static WebElement Address1;

	@AndroidFindBy(id = "payment_bill_address_locality")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeTextField)[6]")
	public static WebElement Address2;

	@AndroidFindBy(id = "payment_bill_address_city")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value=\"City\"]")
	public WebElement AddressCity;

	@AndroidFindBy(id = "payment_bill_address_country")
	@iOSXCUITFindBy(id="//XCUIElementTypeTextField[@value=\"United Kingdom\"]")
	public WebElement AddressCountry;

	@AndroidFindBy(id = "payment_done_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Done\"]")
	public WebElement DoneButton;

	@AndroidFindBy(id = "fuel_authorize_continue_btn")
	//@AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
	@iOSXCUITFindBy(id="//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement HowToFuelContinueButton;

	@AndroidFindBy(id = "fueling_counter_startfueling_text")
	@iOSXCUITFindBy(id="Start fuelling now")
	public WebElement StartFuelingNow;

	@AndroidFindBy(id = "dashboard_greeting_msg")
	@iOSXCUITFindBy(id="Now fuelling")
	public WebElement NowFueling;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(id="Please set up Apple Pay, PayPal or manually add a Debit/Credit Card to pay with the Esso App.")
	public WebElement AddPaymentScreen;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Terms and Conditions\"]")
	public WebElement TransactionComplete;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Allow Location\"]")
	public WebElement GcoAllowlocation;

	@AndroidFindBy(id = "header_station_name_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Terms and Conditions\"]")
	public WebElement GcoAddPaymentHeading;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Terms and Conditions\"]")
	public WebElement TermsConditionHeader;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeNavigationBar[@name=\"Transaction Complete\"]")
	public WebElement TransactionCompleteHeader;

	@AndroidFindBy(id = "header_station_name_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,\"Site\")]")
	public WebElement SelectPumpScreenHeader;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]")
	public static WebElement HeaderText;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Postcode Lookup\"]")
	public WebElement postcode_Lookup_Title;

	@AndroidFindBy(id = "payment_confirmation_full_receipt_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Transaction Details\"]")
	public static WebElement TransactionDetailsLinK;

	@AndroidFindBy(id = "fuel_type_logo")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeCell[1]/XCUIElementTypeImage['index=0'])[1]")
	public WebElement FuelTypeEssoLogo;

	@AndroidFindBy(id = "full_receipt_address")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement StationAddress;

	@AndroidFindBy(id = "full_receipt_fueling_datetime")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText['index=2'])[3]")
	public WebElement FuelingDateAndTime;

	@AndroidFindBy(id = "full_receipt_title")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement PrdtnameinTranstnDtls;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Transaction Details\"]")
	public WebElement TransactionDetailsHeaderText;

	@AndroidFindBy(id = "full_receipt_cost")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText['index=2'])[4]")
	public WebElement TransactionAmountinTransactionDetails;

	@AndroidFindBy(id = "full_receipt_fuel_litre")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText['index=2'])[5]")
	public WebElement TransactionLitresTransactionDetails;

	@AndroidFindBy(id = "paypal_tv")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement CardInfo;

	@AndroidFindBy(id = "vat_receipt")
	@iOSXCUITFindBy(id="vat_receipt")
	public WebElement VatReciept;

	@AndroidFindBy(id = "vat_receipt_status")
	@iOSXCUITFindBy(id="vat_receipt_status")
	public static WebElement VatRecieptView;


	@AndroidFindBy(id = "payment_confirmation_done_btn")
	@iOSXCUITFindBy(id="payment_confirmation_done_btn")
	public static WebElement PaymentConfirmationDone;

	@AndroidFindBy(id = "send_receipt_header_desc_textview")
	@iOSXCUITFindBy(id="Do you need the receipt?")
	public WebElement SendReciptHeaderDescp;

	@AndroidFindBy(id = "send_receipt_sub_header_desc_textview")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement SendReciptSubHeaderDescp;

	@AndroidFindBy(id = "gco_email_editText")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	public WebElement EmailIDforSendReport;

	@AndroidFindBy(id = "news_letter_checkBox")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	public WebElement SendingRecieptChceckBox;

	@AndroidFindBy(id = "news_letter_info_textview")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement MarkettingInfo;

	@AndroidFindBy(id = "send_receipt_button")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Send me the Receipt\"]")
	public WebElement SendMeTheReciept;

	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please indicate that you accept the Privacy Policy and Terms and Conditions.\"]")
	public WebElement RecieptSentSuccessfully;

	@AndroidFindBy(xpath = "//*[contains(@text,'access this')]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please log into your account to access this feature.\"]")
//	@iOSXCUITFindBy(id = "Please log into your account to access this feature.")
	public WebElement PopUpMessageLogin;

	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Are you sure you don't'")
	public WebElement PopUpMessage;

	@AndroidFindBy(id = "app_logo")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement EssoLogo;

	@AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.TextView[1]")
	@iOSXCUITFindBy(id="LocatorNeed")
	public static WebElement Thankyou;

	@AndroidFindBy(id = "thank_you_desc_top_text_view")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement DontmissLoyaltyPoint;

	@AndroidFindBy(id = "thank_you_desc_bottom_text_view")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement ThankYouDescBottomView;

	@AndroidFindBy(id = "remind_later_text_view")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement RemindLaterTextView;

	@AndroidFindBy(id = "register_now_btn")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement RegisterNowButton;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Cancel\"]")
	public WebElement CloseButton;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Select\"]")
	public WebElement HeaderRightText;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
	public WebElement GcoSkipSendReceipt;

	@AndroidFindBy(id = "gco_tc_header_desc_textview")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Your privacy'")
//	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Your privacy is important\"]")
	public WebElement YourprivacyisImportant;

	@AndroidFindBy(id = "gco_tc_sub_header_desc_textview")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Please accept'")
	public WebElement PleaseAcceptTermsandConditions;

	@AndroidFindBy(id = "privacy_policy_text_view")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextView[@name=\"I accept the Privacy Policy and Terms and Conditions.\"]")
	public WebElement AccepttermsandConditions;

	@AndroidFindBy(accessibility ="Esso UK R4")
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeButton['index=0'])[1]")
	public WebElement EssoLogoimg;

	@AndroidFindBy(id = "location_setting_title")
	@iOSXCUITFindBy(id="location_setting_title")
	public WebElement LocateYourStation;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(id="location_subtitle_tv")
	public WebElement LocateYourStation_SubTitle;

	@AndroidFindBy(id = "permission_message")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement LocationPermissionMessage;

	@AndroidFindBy(id = "detail_message")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement LocationPermissionDetailedMessage;

	@AndroidFindBy(id = "scan_qrcode_tv")
	@iOSXCUITFindBy(id="Scan QR Code")
	public WebElement ScanQRCode;

	@AndroidFindAll({@AndroidBy(id = "com.android.packageinstaller:id/permission_deny_button"),
			@AndroidBy(xpath = "//*[contains(@text,'Deny')]")})
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Don’t Allow\"]")
	public static WebElement DontAllowPopup;

	@AndroidFindBy(id = "qr_code_scan_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Scan QR code\"]")
	public WebElement ScanQRCodebtn;

	@AndroidFindBy(id = "permission_allow_button")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement CameraPermissionAllow;

	@AndroidFindBy(id = "scan_cancel_btn")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Cancel\"]")
	public WebElement ScanCancelbtn;

	@AndroidFindBy(id = "scan_qrcode_bottom_tv")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement TurnonLocationLink;

	@AndroidFindBy(accessibility ="Back")
	@iOSXCUITFindBy(id="header_back_btn")
	public WebElement HeaderBackButton;

	@AndroidFindBy(id ="pump_selection_message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Make sure you are parked'")
	public WebElement PumpSelectionmessage;

	@AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='pump_select_adapter_pumpNumber_text']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"1\"]")
	public WebElement Pump_Number;

	@AndroidFindBy(id ="action_more")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"More\"]")
	public WebElement More;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Account']")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement Account;

	@AndroidFindBy(id ="picker")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement Picker;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Â£105\"))")
	public WebElement SetMaximumFuellingAmount;

	@AndroidFindBy(id ="defaultpicket_ok_btn")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement MaximumFuellingOkButton;

	@AndroidFindBy(id ="payment_card_details_title")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement Payment_Details_Title;

	@AndroidFindBy(id ="payment_scan_tv")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Scan Your Card\"]")
	public static WebElement ScanYourCard;

	@AndroidFindBy(id ="payment_billing_details_title")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Billing Details\"]")
	public WebElement BillingDetails;

	@AndroidFindBy(accessibility ="Cancel")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Cancel\"]")
	public WebElement Cancel;

	@AndroidFindBy(id ="payment_cvv_info_icon")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement CVVInfoiIcon;

	@AndroidFindBy(id ="payment_billing_info_icon")
	@iOSXCUITFindBy(id="info blue icon")
	public WebElement BillingInfoiIcon;

	@AndroidFindBy(id ="search_icon")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Search\"]")
	public WebElement SearchIcon;

	@AndroidFindBy(id ="privacy_policy_text_view")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeLink[@name=\"Privacy Policy\"]")
	public WebElement PrivacyPolicy;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Terms and Conditions.']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeLink[@name=\"Terms and Conditions.\"]")
	public WebElement TermsAndConditions;

	@AndroidFindBy(id ="payment_name_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter name on card\"]")
	public WebElement InlineErrorNameOnCard;

	@AndroidFindBy(id ="payment_cardno_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter card number\"]")
	public WebElement InlineErrorCardNumber;

	@AndroidFindBy(id ="payment_expdt_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter expiry date\"]")
	public WebElement InlineErrorExpiryDate;

	@AndroidFindBy(id ="payment_secCode_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter security code\"]")
	public WebElement InlineErrorSecurityCode;

	@AndroidFindBy(id ="payment_posCode_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter postcode\"]")
	public WebElement InlineErrorPostCode;

	@AndroidFindBy(id ="payment_streetAdr_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter address\"]")
	public WebElement InlineErrorAddress1;

	@AndroidFindBy(id ="payment_city_validation_txt")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter city\"]")
	public WebElement InlineErrorCity;

	@AndroidFindBy(id ="payment_bill_address_country")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement Country;

	@AndroidFindBy(id = "payment_done_btn")
	public WebElement Done;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Flat 1, Henry House, Ringers Road\"))")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Flat 1,Henry House,Ringers Road\"]")
	public WebElement SelectAddreess;

	@AndroidFindBy(id ="message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Your billing details'")
//	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Your billing details must match the exact address registered with the issuing bank.\"]")
	public WebElement BillingMessage;

	@AndroidFindBy(id ="address_search_icon")
	@iOSXCUITFindBy(iOSNsPredicate="type == \"XCUIElementTypeSearchField\"")
	public WebElement Address_SearchIcon;

	@AndroidFindBy(id ="close_img")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Clear text\"]")
	public WebElement ClearSearch;

	@AndroidFindBy(id ="search_editText")
	@iOSXCUITFindBy(iOSNsPredicate="type == \"XCUIElementTypeSearchField\"")
	public WebElement SearchEditText;

	@AndroidFindBy(id ="fuel_authorize_title")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Ready to start fuelling?\"]")
	public WebElement ReadyToDStartFuelling;

	@AndroidFindBy(id ="fuel_authorize_title")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Ready to start fuelling?\"]")
	public List<WebElement> ReadyToDStartFuellingSize;

	@AndroidFindBy(id ="fueling_counter_fuelingprice_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement PleaseStartFuelling;

	@AndroidFindBy(id ="fueling_pump_cirle_layout")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement Fuelling_Pump_Circle;

	@AndroidFindBy(id ="pumpNo_tv")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement PumpText;

	@AndroidFindBy(id ="fueling_counter_pumpno_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement PumpNumberStartFuelling;

	@AndroidFindBy(id ="fueling_counter_fuellinginstruction_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement StartFuellingMessage;

	@AndroidFindBy(id ="authorising_sub_desc_text")
	@iOSXCUITFindBy(id="Authorising your payment")
	public WebElement AuthorisingYourPayment;

	@AndroidFindBy(id ="authorising_please_wait_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement PleaseWaitText;

	@AndroidFindBy(id ="authorising_text")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement Authorising_Text;

	/* ****************************************************** Start iOS Objects ********************************************** */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Start']")
	@iOSXCUITFindBy(id="start_button")
	public WebElement StartFuelButton;

	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(id = "continue_btn")
	public WebElement SelectPumpContinueButton;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Close Icon")
	public static WebElement CloseButtonModalPopupLid;

	@AndroidFindBy(id = "pump_select_paymentdetails_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment method: Paypal\" or @name=\"Payment method: MasterCard\"]")
	public WebElement changePaymentMethod;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment Details\"]")
	public WebElement paymentDetailsHeader;

	@AndroidFindBy(id = "locatorNeeded")
	@iOSXCUITFindBy(id = "Please Setup Apple Pay or manually add a Debit/Credit card to pay with the Esso App.")
	public WebElement AddPaymentScreenMessage;

	@AndroidFindBy(id = "add_payment_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add Debit/Credit Card\"]")
	public WebElement AddCreditCardGCOButton;

	@iOSXCUITFindBy(id = "Apple Pay")
	public WebElement setUpApplePayGCOButton;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Debit/Credit Card\"]")
	public WebElement AddDebitCreditCardHeader;

	@AndroidFindBy(id ="payment_scan_tv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Scan Your Card\"]")
	public WebElement scanQRCodelink;

//	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	@AndroidFindAll({
			@AndroidBy(xpath = ".//android.widget.Button[@text='Allow']"),
			@AndroidBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")})
	@iOSXCUITFindBy(id = "OK")
	public WebElement CameraAccessOkPopup;

	@AndroidFindBy(id ="payment_card_details_title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Card Details\"]")
	public static WebElement EnterCardDetailsText;


	@AndroidFindBy(id = "payment_security_code_et")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeSecureTextField")
	public static WebElement securityCode;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Select\"]")
	public WebElement selectAddressbutton;

	@AndroidFindBy(id = "payment_done_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
	public WebElement doneButton;

	@AndroidFindBy(id ="authorising_please_wait_text")
	@iOSXCUITFindBy(id = "authorising_please_wait_text")
	public WebElement PleaseWaitScreen;

	@AndroidFindBy(id = "fueling_counter_startfueling_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start fuelling now\"]")
	public WebElement StartFuelingNowScreen;

	@AndroidFindBy(id = "dashboard_greeting_msg")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Now fuelling\"]")
	public WebElement nowFuelingScreen;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Transaction Complete\"]")
	public WebElement transactionCompleteScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your payment was successful.\"]\n")
	public WebElement paymentSuccessfulMessage;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
	public WebElement skipButtonSendReceipt;

	@iOSXCUITFindBy(id = "Do you need the receipt?")
	public WebElement DoYouNeedYourReceipt;

	@iOSXCUITFindBy(id = "What is the email address you want us to send the digital receipt to?")
	public WebElement DoYouNeedYourReceiptSubTitle;

	@AndroidFindBy(id = "gco_email_editText")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[@value=\"Email\"])[1]")
	public WebElement enterEmailAddress;

	@AndroidFindBy(id = "send_receipt_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Send me the Receipt\"]")
	public WebElement sendReceiptButton;

	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Receipt Sent Successfully\"]")
	public WebElement ReceiptSentSuccess;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"OK\"))")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public WebElement okButton;

	@AndroidFindBy(id = "thank_you_text_view")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thank you!\"]")
	public WebElement thankYouHeader;

	@AndroidFindBy(id = "thank_you_desc_top_text_view")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
	public WebElement dontMissLoyaltyTextMesg;

	@AndroidFindBy(id = "remind_later_text_view")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Remind me later\"]")
	public WebElement remindLaterButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please turn on notification permission in settings\"]")
	public WebElement remindmeLaterCopyText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Settings\"]")
	public WebElement SettingsButtonremindmeLater;

	@AndroidFindBy(id = "register_now_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Register Now\"]")
	public WebElement RegNowButton;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(id = "Close")
	public WebElement CloseButtonThankYouScreen;

	@AndroidFindBy(id = "confirm_payment")
	@iOSXCUITFindBy(id = "confirm_payment")
	public static WebElement ConfirmPaymentScreenHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"PayPal\"]")
	public WebElement PayWithPaypalButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"starImage\"]")
	public WebElement starImageThankYouScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you sure you don't want to save a receipt for this transaction? If you don't save it now, you won't be able to see this at a later date.\"]")
	public WebElement SkipConfirmMessage;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
	public WebElement skipConfirmButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Collect receipt\"]")
	public WebElement collectReceiptButton;

	@iOSXCUITFindBy(id = "PrivacyMobilePayment")
	public WebElement mobileIconSendReceiptScreen;

	@iOSXCUITFindBy(id = "circleUnCheck")
	public WebElement receiveEmailCBSendReceiptScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"circleUnCheck\"]")
	public WebElement checkBoxSendReceiptScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please start fuelling\"]")
	public WebElement PleaseStartFuelSubTitle;

	@AndroidFindBy(id = "LocatorNeeded")
	@iOSXCUITFindBy(id = "You can fuel up to Â£100.00 Do not use your mobile while dispensing fuel or when walking on the forecourt.")
	public WebElement footerTextStartFuellingScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"PUMP\"]")
	public WebElement PumpTextFuelScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeProgressIndicator[@name=\"Progress\"]")
	public WebElement topProgressLineStartFuel;

	@AndroidFindBy(id ="authorising_sub_desc_text")
	@iOSXCUITFindBy(id = "authorising_sub_desc_text")
	public WebElement authorisingPaymentScreen;

	@AndroidFindBy(id ="button2")
	@iOSXCUITFindBy(id="Collect receipt")
	public WebElement CollectReceipt;

	@AndroidFindBy(id ="button1")
	@iOSXCUITFindBy(id="Skip")
	public WebElement SKIP;

	@AndroidFindBy(id ="email_validation_txt")
	@iOSXCUITFindBy(id="Please enter email address")
	public WebElement InlineErrorMessageEmailValidation;

	@AndroidFindBy(id ="email_validation_txt")
	@iOSXCUITFindBy(id="Incorrect email format")
	public WebElement InlineErrorMessageWrongmailFormat;

	@AndroidFindBy(id ="content")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement ContentFrame;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"COLLECT RECEIPT\"))")
	public WebElement Collect_Reciept;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Use Apple Pay')]")
	public WebElement PleaseSetupApplePayDebitCardStaticText;

	@AndroidFindBy(id = "header_right_btn_cross")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"qrCodeReaderIcon\"]")
	public WebElement ScanQRCodePumpScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter PIN\"]")
	public WebElement EnterPinHeader;

	@AndroidFindBy(id = "payment_card_details_title")
	public WebElement AddPaymentScreenTitle;

	@AndroidFindBy(id = "security_pin_entry_title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your Esso PIN to unlock the app for fuelling.\"]")
	public WebElement EnterPinFuelText;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[1]")
	public WebElement KeyBoardDone;

	@AndroidFindBy(id = "Not Needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Done'")
	public WebElement DoneButtonKeypad1;

	@iOSXCUITFindBy(id = "comfirm_payment_sub_desc_text")
	@AndroidFindBy(id = "comfirm_payment_sub_desc_text")
	public WebElement fuelConfirmSubHeaderText;

	@iOSXCUITFindBy(id = "text_selected_pump")
	@AndroidFindBy(id = "text_selected_pump")
	public static WebElement selectPumpHeaderText;

	@iOSXCUITFindBy(id = "text_payment_method")
	@AndroidFindBy(id = "text_payment_method")
	public static WebElement paymentMethodHeaderText;

	@iOSXCUITFindBy(id = "pre_auth_title_tv")
	@AndroidFindBy(id = "pre_auth_title_tv")
	public static WebElement maxFuellingHeaderText;

	@iOSXCUITFindBy(id = "reward_title")
	@AndroidFindBy(id = "reward_title")
	public static WebElement rewardPaymentHeaderText;

	@AndroidFindBy(xpath = "//*[contains(@text,'Payment Details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment Details\"]")
	public WebElement paymentDetailsHeaderText;

	@AndroidFindBy(xpath = "//*[contains(@text,'Esso Nectar')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Esso Nectar\"]")
	public WebElement EssoNectarPaymentDetailsHeaderText;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Allow Location\"]")
	public List<WebElement> AllowLocationHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Allow “Esso-QA” to use your location?\"]")
	public WebElement useLocationPopupHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"When you arrive at an Esso station, the app will know at which petrol station you are located. You then just have to select the pump.\"]")
	public WebElement useLocationPopupSubHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@index=\"2\"]")
	public WebElement readytoStartFuellingSubText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"How to Fuel\"]")
	public WebElement howToFuelHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@index=\"0\"]")
	public WebElement clockImageReadyToStartFuelScreen;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Flat 1,Henry House,Ringers Road\"]")
	public WebElement SelectAddressFromList;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Welcome to\"]")
	public WebElement LIDGreetingText;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Save on fuel with points\"]")
	public List<WebElement> OfferPopupInPaymentScreen;

	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'You could have earned'")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"You could have earned loyalty points with this fuelling. Register now so next time you donâ€™t miss out.\"]")
	public WebElement loyalityTextThankYouScreen;

	@AndroidFindBy(xpath = "//android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField\n")
	public WebElement PassPhrase;

//	@AndroidFindBy(id = "submitButton")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Submit')]")
//	public WebElement PassPhraseSubmit;
//
//	@AndroidFindBy(id = "challengeInformationHeaderTextView")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify by Password`\"]")
//	public WebElement VerifyPwd;
//
//	@AndroidFindBy(id = "challengeInformationLabelTextView")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your password`\"]")
//	public WebElement EnterPwd;

	@AndroidFindBy(id = "preauth_info_icon")
	@iOSXCUITFindBy(id = "info blue icon")
	public WebElement MaxFuelInfoIcon;

	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(id = "This is the amount that will be reserved in your account. The pump will stop before this value. You will only be charged for the fuel dispensed.")
	public WebElement MaxFuellingPopUp;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"SKIP\"))")
	public WebElement Skip_prompt;

	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText]")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement PassphraseEntrerYourPwd;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Privacy Policy\"))")
	public WebElement PrivacyandPolicy;

	@AndroidFindBy(id="mfa_title")
	@iOSXCUITFindBy(id = "mfa_title")
	public WebElement GcoMfaHeading;

	@AndroidFindBy(id="mfa_subtitle_text")
	@iOSXCUITFindBy(id = "mfa_subtitle_text")
	public WebElement GcoMfaSubHeading;

	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"£140\"]")
	public WebElement GcoMfaValue140;

	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"£100\"]")
	public WebElement GcoMfaValue100;

	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"£70\"]")
	public WebElement GcoMfaValue70;

	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"£40\"]")
	public WebElement GcoMfaValue40;

	@AndroidFindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"£20\"]")
	public WebElement GcoMfaValue20;

	@AndroidFindBy(id="mfaSeekbar")
	@iOSXCUITFindBy(id="mfaSeekbar")
	public WebElement GcoMfaSlider;

	@AndroidFindBy(id="button_action")
	@iOSXCUITFindBy(id="button_action")
	public WebElement GcoMfaContinueButton;

	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.TextView")
	@iOSXCUITFindBy(id="LocatorNeed")
	public WebElement GcoMfaContinueValue140;

	@AndroidFindBy(id="mfa_footer_header")
	@iOSXCUITFindBy(id="mfa_footer_header")
	public WebElement GcoMfaPleaseNote;

	@AndroidFindBy(id="mfa_footer_subtitle")
	@iOSXCUITFindBy(id = "mfa_footer_subtitle")
	public WebElement GcoMfaPleaseNoteCt;

	@AndroidFindBy(xpath = "//*[contains(@text,'Save for next time')]")
	@iOSXCUITFindBy(id="cb_text_view")
	public WebElement MfaSaveNextTime;

	@AndroidFindBy(id="checkBox_save_next_time")
	@iOSXCUITFindBy(id= "checkBox_save_next_time")
	public WebElement MfaSaveNextTimeCheckBox;

	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Please indicate'")
	@AndroidFindBy(xpath = "//*[contains(@text,'indicate that')]")
	public WebElement acceptPrivacyPolicyMessage;

	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
	@AndroidFindBy(xpath = "//*[contains(@text,'Add Nectar')]")
	public WebElement addNectarCardBtn;

	@iOSXCUITFindBy(id = "scan_clubcard")
	@AndroidFindBy(xpath = "//*[contains(@text,'Scan')]")
	public WebElement scanBarcodeNectar;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'collect_points_tv')]")
	public WebElement rewardPointsinTransactionDetails;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'rewards_points_tv')]")
	public WebElement pointsredeemedinTransactionbDetails;

	@iOSXCUITFindBy(id = "pump_number")
	@AndroidFindBy(id = "pump_number")
	public WebElement PumpNumberValueConfirmPayment;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	@AndroidFindAll({@AndroidBy(id = "payment_checkout_layout"),
			@AndroidBy(id = "payment_details_update_btn")})
	public WebElement ContinueButtonPaymentDetails;

	@iOSXCUITFindBy(id = "max_fueling_points")
	@AndroidFindBy(id = "max_fueling_points")
	public WebElement MfaValueConfirmPaymentScreen;

	@iOSXCUITFindBy(id = "fueling_edit")
	@AndroidFindBy(id = "fueling_edit")
	public WebElement MfaEditButtonConfirmPayment;

	@iOSXCUITFindBy(id = "payment_method")
	@AndroidFindBy(id = "payment_method")
	public WebElement PaymentValueConfirmPayment;

	@AndroidFindBy(id="mfaSeekbar")
	@iOSXCUITFindBy(id="mfaSeekbar")
	public List<WebElement> GcoMfaSliderList;

	@iOSXCUITFindBy(id = "select_payment_edit")
	@AndroidFindBy(id = "select_payment_edit")
	public WebElement EditPumpNumberConfirmPaymentScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeButton")
	@AndroidFindBy(id = "header_back_btn")
	public WebElement BackButtonMfaScreen;

	@AndroidFindBy(id = "header_back_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NavBack\"]")
	public WebElement BackBtn;

	@AndroidFindBy(id = "cancel_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
	public WebElement CancelSelectYourPumpScreen;

	@AndroidFindBy(id = "authorising_please_wait_text")
	@iOSXCUITFindBy(id = "authorising_please_wait_text")
	public WebElement AuthHead;

	@AndroidFindBy(xpath = "//*[contains(@text,'Authorising your')]")
	@iOSXCUITFindBy(id = "authorising_sub_desc_text")
	public WebElement AuthDes;

	@AndroidFindBy(id = "cancel_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
	public List<WebElement> CancelButtonBottomScreen;

	@AndroidFindBy(id = "loyalty_edit")
	@iOSXCUITFindBy(id = "loyalty_edit")
	public WebElement RewardEdit;

	@AndroidFindBy(id = "confirm_payment")
	@iOSXCUITFindBy(id = "confirm_payment")
	public WebElement ConfirmPayment;

	@AndroidFindBy(id= "invitation_negative")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"No Thanks\"]")
	public WebElement NoThanksButton;
}
