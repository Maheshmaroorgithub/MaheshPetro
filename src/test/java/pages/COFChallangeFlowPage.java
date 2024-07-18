package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class COFChallangeFlowPage extends GenericWrappers {

    public COFChallangeFlowPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirmation")
    @iOSXCUITFindBy(id = "NeedLocator")
    public WebElement LoginSavePwd;

    @AndroidFindBy(id = "com.google.android.gms:id/credential_save_reject")
    @iOSXCUITFindBy(id = "NeedLocator")
    public WebElement LoginSaveNever;

    @AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
    @iOSXCUITFindBy(id = "NeedLocator")
    public WebElement LoginSave;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(id = "Add a payment method to pay at the pump")
    public WebElement AddPaymentMethod;

    @AndroidFindBy(id = "lid_profile_variation_text")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeButton[1]"),
            @iOSXCUITBy(id = "Add Nectar card & never miss out on points again")})
    public static WebElement AddNectarLink;

    @AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public WebElement Continue_BTN;

    @AndroidFindBy(id = "locaator need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Get Started\"]")
    public WebElement GetStartedBtn;

    @AndroidFindBy(id = "pump_select_confirm_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm\"]")
    public WebElement Confirm_BTN;

    @AndroidFindBy(id = "security_pin_entry_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your Esso PIN to unlock the app for fuelling.\"]")
    public WebElement PinTxt;

    @AndroidFindBy(id = "LocatorNeed")
    @iOSXCUITFindBy(id = "Nectar card added successfully")
    public WebElement NectCardSuccess;

    @AndroidFindBy(xpath = "//*[contains(@text,'Payment method')]")
    @iOSXCUITFindBy(id = "Payment Method added successfully")
    public WebElement PaymentMethodSuccess;

    @AndroidFindBy(id = "LocatorNeed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
    public WebElement SetMaxFuelAmount;

    @AndroidFindBy(id = "LocatorNeed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SET MAXIMUM AMOUNT\"]")
    public WebElement SetMaxAmount;
//
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Ready to start fuelling?\"]")
//	public WebElement ReadyStartFuel;

    @AndroidFindBy(id = "fueling_counter_startfueling_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start fuelling now\"]")
    public WebElement StartFuelingNow;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public WebElement ReadyContinueBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText"),
            @AndroidBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText")})
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField")
    public WebElement PassPhrase;

    @AndroidFindBy(id = "submitButton")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Submit')]")
    public static WebElement PassPhraseSubmit;

    @AndroidFindBy(id = "account_add_card")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add Payment Method\"]")
    public WebElement AddCard;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'payment_name')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[1]")
    public WebElement CardName;
//
//	@AndroidFindBy(id = "challengeInformationHeaderTextView")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Verify by Password')]")
//	public WebElement VerifyPwdModirumScreen;

    @AndroidFindBy(id = "challengeInformationHeaderTextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Verify by Password')]")
    public static WebElement VerifyPwd;

//	@AndroidFindBy(id = "challengeInformationLabelTextView")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your password`\"]")
//	public WebElement EnterPwd;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'city')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[7]")
    public WebElement City;

    @AndroidFindBy(id = "payment_card_details_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Card Details\"]")
    public static WebElement EnterCardDetailsText;

    @AndroidFindBy(xpath = "//*[contains(@text,'quickly authorise')]")
    @iOSXCUITFindBy(id = "Use Touch ID to quickly authorise payments")
    public WebElement TouchIDCopyText;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'finger_print_check_box')]")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeButton[@name=\"circleCheck\"]")
    public WebElement TouchIdCheckBox;

    @AndroidFindBy(id = "payment_done_btn")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
    public WebElement TouchIdCheckBoxTick;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Just to ensure'")
    public WebElement AccountMessage;

    @AndroidFindBy(id = "card_holder_name")
    @iOSXCUITFindBy(id = "Save on fuel with points")
    public static WebElement SaveOnPointsRedemptionscreen;

    @AndroidFindBy(id = "continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Continue'")
    public static WebElement ContinueButtonRedemptionScreen;

    @AndroidFindBy(id = "linkedin_login_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"linkednNew\"]")
    public WebElement LinkedinIcon;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Email or Phone\"]")
    public WebElement SSOusername;

    @AndroidFindBy(xpath = "//android.view.View[2]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"]")
    public WebElement SSOpassWord;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign in\"]")
    public WebElement SSOsignin;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Confirm your Identity\"]")
    public WebElement PromptTtl;

    @AndroidFindBy(xpath = "//*[contains(@text,'updated')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Card details'")
    public WebElement EditCardSuccess;

    @AndroidFindBy(id = "dashboard_help_msg_social")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Card added'")
    public WebElement CardAddSuccess;

    @AndroidFindBy(id = "account_card_number")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
    public WebElement AddedCard;

    @AndroidFindBy(id = "facebook_login_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"fbNew\"]")
    public WebElement FacebookTab;

    @AndroidFindBy(xpath = "//*[contains(@class, 'android.view.View')][contains(@id,'email_input_container')")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
    public WebElement MobileNumber;

    @AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Continue'")
    public WebElement Continue;
    @AndroidFindBy(id = "m_login_password")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField")
    public WebElement Pwd;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'u_0_4')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
    public WebElement ContinueBtn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Cancel')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Cancel'")
    public WebElement OTPcancel;

    @AndroidFindBy(id = "search_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
    public WebElement AddressSearchopn;

    @AndroidFindBy(xpath = "//*[@text='Flat 2, Henry House, Ringers Road']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public WebElement ChooseAddress;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'"),
            @iOSXCUITBy(id = "button1")})
    public WebElement OkButton;

    @AndroidFindBy(xpath = "//*[contains(@text,'YES')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Cancel'")
    public WebElement TransCancel;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
    public WebElement SelectAddress;
//
//    @AndroidFindBy(id="twitter_login_icon")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
//    public WebElement TwitterTap;
//
//    @AndroidFindBy(id="username_or_email")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
//    public WebElement Twitterid;
//
//    @AndroidFindBy(id="password")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
//    public WebElement TwitterPwd;
//
//    @AndroidFindBy(id="allow")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='DONE']")
//    public WebElement TwitterSign;
//
//	@AndroidFindBy(id = "alertTitle")
//	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Just to ensure this is your card, we need to validate a few things. Don’t worry! Nothing will be charged to your account until you complete fuelling.\"]")
//	public WebElement Prompt3DSTxt;
//
//	@AndroidFindBy(id = "alertTitle")
//	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Got It\"]")
//	public WebElement Prompt3DSGotItBtn;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'challengeInformationHeader')]")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verification\"]"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Verify Your')]")})
    public WebElement VerificationTxt;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'challengeInformationHeader')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Verify Your')]")
    public WebElement VerificationTxtOtp;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'challengeIssuerImage')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[1]")
    public WebElement ModirumImg;

//	@AndroidFindBy(xpath = "//*[contains(@resource-id,'challengeInformationLabel')]")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your password`\"]")
//	public WebElement EnterPwdTxt;
//
//	@AndroidFindBy(id = "locator need")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Identify Confirmation\"]")
//	public WebElement IdentityConfrm3DSTtl;
//
//	@AndroidFindBy(id = "locator need")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Just to be sure you are you and you own this card, we need to ask you a few questions. Don’t worry! No monies will be charged to your account.\"]\n")
//	public WebElement Identity3DSTxt;


    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[contains(@resource-id,'start_option')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='start']")
    public WebElement fuelingLIDicon;

    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Debit'")
    @AndroidFindBy(xpath = "//*[contains(@text,'Add Debit/Credit Card')]")
    public WebElement addCardTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Card Details\"]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter Card Details')]")
    public WebElement enterCardDetailsTxt;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[2]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'visa')]")
    public WebElement visaLogo;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[3]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'master')]")
    public WebElement mastercardLogo;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[4]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'amex')]")
    public WebElement amexLogo;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Card added successfully.\"]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Card added successfully.')]")
    public WebElement cardAddedMsg;

//	@iOSXCUITFindBy(id = "OK")
//	@AndroidFindBy(xpath = "//*[contains(@text,'OK')]")
//	public WebElement okButCardAdded;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Got It\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"GOT IT\")")
    public WebElement GotIt3DSBut;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Confirm your Identity\"]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Confirm')]")
    public WebElement identityTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verification\"]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Verify Your Identity')]")
    public WebElement OTPverificationTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Verify by')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Verify by phone')]")
    public WebElement OTPverificationSubtitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'A text message')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'text message')]")
    public WebElement OTPverificationDesc;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Verification code')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Verification code')]")
    public WebElement OTPverificationCodeTxt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField")
    @AndroidFindBy(xpath = "//android.widget.EditText")
    public WebElement enterOTPfield;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Submit')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Submit')]")
    public WebElement OTPsubmitBut;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Resend Code')]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Resend Code')]")
    public WebElement OTPresendBut;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[contains(@resource-id,'payment_method')]//androidx.recyclerview.widget.RecyclerView[1]")
    public WebElement orderOfPaypalcard;

    @AndroidFindBy(xpath = "//*[contains(@text,'Add PayPal')]")
    public WebElement orderAddPaypalbut;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Mastercard')]")
    public WebElement orderMasterCard;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Visa')]")
    public WebElement orderVisaCard;

    @AndroidFindBy(xpath = "//*[contains(@text,'Add Card')]")
    public WebElement orderAddCard;

    @AndroidFindBy(xpath = "//*[contains(@text,'Default')]")
    public WebElement orderDefaultMethod;


    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\"Esso Nectar\"))")
    public WebElement orderEssoNectarsec;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Don’t lift the nozzle just yet.\"]")
    @AndroidFindBy(id = "dont_lift_nozzle_title_text")
    public WebElement dontLiftTheNozzleMessage;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"You can lift the nozzle now.\"]")
    @AndroidFindBy(id = "lift_nozzle_title_text")
    public WebElement liftTheNozzleTitle;

    @iOSXCUITFindBy(xpath = "top_txt")
    @AndroidFindBy(id = "top_txt")
    public WebElement customPopupTitle;


    @iOSXCUITFindBy(xpath = "details_txt")
    @AndroidFindBy(id = "details_txt")
    public WebElement popUpMessage;

    @AndroidFindBy(xpath = "//*[@text=‘OK’]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"details_txt\"]")
    public WebElement PopUpOkCustomPopup;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Just to ensure'")
    @AndroidFindBy(xpath = "//*[contains(@text,'Just to ensure this is your card, we need to ask you a few questions.')]")
    public WebElement confirmPopupCt;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(id = "OK"),
            @iOSXCUITBy(id = "button1")})
    public WebElement okBtn;

    @AndroidFindBy(id = "payment_expdate_et")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[3]")
    public WebElement ExpDate;

    @AndroidFindBy(id = "payment_security_code_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
    public WebElement SecurityCode;

    @AndroidFindBy(id = "payment_bill_address_postcode")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[4]")
    public WebElement Postal;

    @AndroidFindBy(id = "payment_bill_address_street")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[5]")
    public WebElement Addrs1;

    @AndroidFindBy(id = "payment_bill_address_locality")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[6]")
    public WebElement Addrs2;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[2]")
    public WebElement CardNo;

    @AndroidFindBy(id = "challengeInformationLabelTextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Enter your password')]")
    public WebElement EnterPwd;
}

