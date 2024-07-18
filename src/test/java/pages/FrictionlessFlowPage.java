package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.Calendar;
import java.util.List;

public class FrictionlessFlowPage extends GenericWrappers {
//    GuestCheckOutPage guestCheckOutPage = new GuestCheckOutPage();
//    ProfileCompletionConstants profileCompletionConstants = new ProfileCompletionConstants();
//    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();

    public FrictionlessFlowPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    public WebElement AppSkip;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id = "OK")
    public WebElement Ok;

    @AndroidFindBy(id = "dashboard_register_btn")
    public WebElement RegisterTabBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment method : Mastercard']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Payment method: MasterCard\"]")
    public WebElement PaymentMethodLinkMaster;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment method : Visa']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Payment method: Visa\"]")
    public WebElement PaymentMethodLinkVisa;

    // @AndroidFindBy(xpath="//android.widget.TextView[@text='Payment method : PayPal']")
    @AndroidFindBy(id = "pump_select_paymentdetails_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Payment method: Paypal\"]")
    public WebElement PaymentMethodLinkPaypal;


    @AndroidFindBy(id = "payment_details_update_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeButton")
    public WebElement UpdateBtn;

//    @AndroidFindBy(id = "pre_transaction_summary_card_number")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"****0014\"]")
//    public WebElement UpdateBtn1;


    @iOSXCUITFindBy(id = "header_back_image_btn")
    public WebElement NavBackBtn;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[1])[2]")
    public WebElement PayPalTick;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]")
    public WebElement SelectOtherCard;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'you!')]")
    public static WebElement thankYouHeader;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"ETV Esso Link\"]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ETV Esso Link\"]")
    public WebElement TestLink;
    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(id = "Close")
    public static WebElement SkipBtn;

    @AndroidFindBy(id = "continue_btn")
    @iOSXCUITFindBy(id = "continue_btn")
    public WebElement PumpContinueBtn;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(id = "Skip")
    public WebElement SkipButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='start']")
    @AndroidFindBy(id = "dashboard_start_option_inner_img")
    public WebElement StartFuelBtn;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"visaLogo\"]")
    public WebElement VisaLogo;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]")
    public WebElement MasterLogo;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[2]")
    public static WebElement CardNo;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement paymentCreationBtn;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement AddToCardOkBtn;

    @AndroidFindBy(id = "android:id/button2")
//    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Done'")
    public WebElement SkipAnyway;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement VerifyEmail;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement AddtoCardBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    @AndroidFindBy(id = "security_pin_entry_code1")
    public WebElement PIN1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    @AndroidFindBy(id = "security_pin_entry_code2")
    public WebElement PIN2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    @AndroidFindBy(id = "security_pin_entry_code3")
    public WebElement PIN3;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    @AndroidFindBy(id = "security_pin_entry_code4")
    public WebElement PIN4;

    @AndroidFindBy(id = "add_payment_btn")
    public WebElement AddtoCardDebitBtn;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public WebElement PINContinueBtn;

    @AndroidFindBy(id = "account_privacy_link")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Done'")
    public static WebElement DoneButtonInNectarKeypad;

    @AndroidFindBy(id = "finger_print_check_box")
    public WebElement ADDtoCardChkBox;

    @AndroidFindBy(id = "card_consent_checkBox")
    public WebElement ADDtoCardChkBox2;

    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '****'")
    @AndroidFindBy(id = "account_card_number")
    public WebElement CardNumberOne;

    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '****'")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'account_card_number') and contains(@text,'****')]")
    public WebElement CardNumberMasked;

    @AndroidFindBy(id = "payment_security_code_et")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeSecureTextField")
    public static WebElement SecurityCode;

    @AndroidFindBy(id = "payment_done_btn")
    public WebElement AddToCardDoneBtn;

    @AndroidFindBy(id = "payment_done_btn")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
    public WebElement TouchIdCheckBoxTick;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Password\"]")
    public WebElement ForgotPwdTxt;

    @iOSXCUITFindBy(id = "dp2NectatNIcon2")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'description_text_view')]")
    public WebElement NectarLogo;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'pop_up_imageview')]")
    @iOSXCUITFindBy(id = "homeScreen_promo_banner")
    public WebElement FireworkImg;

    @AndroidFindBy(id = "fuel_authorize_continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'CONTINUE'")
    public WebElement ReadyCtnBtn;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\" Collect 6X Nectar points today when you fill up with our Esso Synergy Supreme+ fuels. \"]")
    public WebElement LogoDesc;

    @AndroidFindBy(xpath = "//*[contains(@text,'View Details')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"View Details\"]")
    public WebElement ViewDetailsBtn;

    @AndroidFindBy(id = "enter_password_text")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Enter Password\" AND type == \"XCUIElementTypeSecureTextField\"")
    public WebElement ForgotPwdEnter;

    @AndroidFindBy(id = "first_section_lyt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"OFFERS\"]")
    public WebElement OfferLink;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"HOW IT WORKS\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"HOW IT WORKS\"]")
    public WebElement HIW;

    @AndroidFindBy(id = "points_lyt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Bonus Points\"]\n")
    public WebElement PointsSec;

    @AndroidFindBy(id = "pay_points_lyt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Rewards\"]")
    public WebElement RewardsSec;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"More about collecting points\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"More about collecting points\"]")
    public WebElement CollectPtsLnk;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"COLLECT MORE\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"COLLECT MORE NECTAR POINTS\"]")
    public WebElement CollectMoreHead;

    @AndroidFindBy(id = "item_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[4]")
    public WebElement PayEditBtn;

    @AndroidFindBy(id = "account_add_card")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeStaticText[@name=\"Invalid card details or unsupported card. Please check and try again, or use an alternative card.\"]")
    public WebElement AddToCardBtn;

    @AndroidFindBy(id = "payment_cardno_validation_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Invalid card details\")]")
    public WebElement CardInvalidErrMsg;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Edit Payment Method\"]")
    public WebElement PayEditscreen;

    @AndroidFindBy(id = "login_password_showHide_btn")
    @iOSXCUITFindBy(id = "Info")
    public WebElement toggle;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Password\"]")
    public WebElement EnterPWDText;

    @AndroidFindBy(id = "security_pin_password")
    @iOSXCUITFindBy(id = "Enter your Esso App password to proceed.")
    public WebElement passprocedtxt;

    @AndroidFindBy(id = "submit_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public WebElement Submit;

    @AndroidFindBy(id = "forgot_password_link")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot Your Password?\"]")
    public WebElement Forgotpwdlink;

    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(id = "OK"),
            @iOSXCUITBy(id = "button1")})
    @AndroidFindBy(id = "android:id/button1")
    public WebElement invalidPasswordError_popup_ok_btn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Face ID\"]")
    @AndroidFindBy(id = "needed")
    public WebElement FaceIdScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Touch ID\"]")
    @AndroidFindBy(id = "needed")
    public WebElement TouchIdScreen;

    @iOSXCUITFindBy(id = "Skip")
    @AndroidFindBy(id = "needed")
    public WebElement BiometricsIdSkip;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(id = "Due to security reasons you need to login again.")
    public WebElement invalidPasswordError_popup_text;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement LocationFindBtn;

    @AndroidFindBy(id = "continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CONTINUE\"]")
    public WebElement TabPumbcotinueBtn;

    @AndroidFindBy(id = "pump_select_text")
    @iOSXCUITFindBy(id="pump_select_text")
    public WebElement SelectYourPump;

    @AndroidFindBy(id = "pump_select_confirm_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm\"]")
    public WebElement PaymentConfirm;

    @AndroidFindBy(id = "submit_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public WebElement ContinueBtnEnterPwdEnterPwdAccountEditPin;

    @AndroidFindBy(id = "enter_password_show_hide_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement passwordtxt;

    @AndroidFindBy(id = "account_secure_pin")
    @iOSXCUITFindBy(id = "account_secure_pin")
    public WebElement EssoPINScreen;

    @AndroidFindBy(id = "account_secure_pin_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Edit\"])[4]")
    public WebElement EssoPINEdit;

    @AndroidFindBy(id = "account_secure_pin_edit")
    @iOSXCUITFindBy(id = "account_secure_pin_edit")
    public WebElement EssoPINEdit1;

    @AndroidFindBy(id = "pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Forgot Your PIN?\"]")
    public WebElement ForgotPWD;

    @AndroidFindBy(xpath = "//*[contains(@text,'Forgot Your Pass')]")
    public WebElement forgotPasswordLink;

    @AndroidFindBy(id = "pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Forgot Your PIN\"]")
    public WebElement ForgotPWDwithoutquestion;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter PIN\"]")
    public WebElement EnterPINTxt;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(id = "header_text")
    public WebElement CancelButtonUnique;

    @AndroidFindBy(id = "header_back_btn")
    @iOSXCUITFindBy(id = "NavBack")
    public WebElement backBtn;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(id = "Forgot Password")
    public WebElement ForgotPWDTxt;

    @AndroidFindBy(id = "forgot_password_header_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'In order to'")
    public WebElement EmailAddressverify;

    @AndroidFindBy(id = "forgot_password_continue_btn")
    @iOSXCUITFindBy(id = "Send")
    public WebElement SendBtn;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Cancel'")
    public WebElement PINCanceBtn;

    @AndroidFindBy(id = "action_more")
    @iOSXCUITFindBy(id = "More")
    public WebElement TabMoreBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Account']")
    @iOSXCUITFindBy(id = "Account")
    public WebElement AccountTab;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Card Number\"]")
    public WebElement EnterCardNumber;

    @AndroidFindBy(id = "account_card_number")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Card Number\"]")
    public WebElement AccountCardNumber;

    @AndroidFindBy(id = "cardLogoContainer")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement CardLogo;

    @AndroidFindBy(id = "selected_card_tickmark")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement CardTicMark;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public WebElement EssoPIN1;

    @AndroidFindBy(id = "security_pin_entry_code2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
    public WebElement EssoPIN2;

    @AndroidFindBy(id = "security_pin_entry_code3")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    public WebElement EssoPIN3;

    @AndroidFindBy(id = "security_pin_entry_code4")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]")
    public WebElement EssoPIN4;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(id = "Cancel")
    public WebElement EssoPinCancel;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter PIN\"]")
    public WebElement PINText;

    @AndroidFindBy(id = "pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Password\"]")
    public WebElement PINForgotlINK;

    @AndroidFindBy(id = "payment_name_et")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement EnterCardName;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement EnterCArdNumber;

    @AndroidFindBy(id = "payment_expdate_et")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement EnterExpDate;

    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement EnterExpbtn;

    @AndroidFindBy(id = "payment_security_code_et")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement EnterSecurityCode;

    @AndroidFindBy(id = "payment_bill_address_postcode")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement EnterPOSTALCode;

    @AndroidFindBy(xpath = "//*[contains(@text,'Please enter postcode')]")
    @iOSXCUITFindBy(id = "Please enter postcode")
    public WebElement EnterPOSTALErrortxt;

    @AndroidFindBy(id = "Not Needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Done'")
    public WebElement DoneButtonKeypad1;

    @AndroidFindBy(id = "search_icon")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement Searchbtn;

    @AndroidFindBy(id = "finger_print_check_box")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement AcceptlINKONE;

    @AndroidFindBy(id = "card_consent_checkBox")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement AcceptlINKTWO;

    @AndroidFindBy(id = "card_consent_text_view")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement AcceptlINKTWOTxt;

    @AndroidFindBy(id = "payment_done_btn")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement PaymentDoneBtn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Henry')]")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement addresText;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement SelectBtn;

    @AndroidFindBy(id = "add_payment_method_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add Payment Method\"]")
    public WebElement AddCard;

    @AndroidFindBy(xpath = "//*[contains(@text,'Just to ensure')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert//XCUIElementTypeStaticText~xpath")
    public WebElement AccountMessage;

    @AndroidFindBy(id = "payment_name_et")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[1]")
    public WebElement CardName;

    @AndroidFindBy(id = "edit_payment_name_et")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[1]")
    public WebElement CardNameEditCardScreen;

    @AndroidFindBy(id = "payment_expdate_et")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[3]")
    public static WebElement ExpDate;

    @AndroidFindBy(id = "edit_payment_expdate_et")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[2]")
    public static WebElement ExpDateEditCardScreen;

    @AndroidFindBy(id = "payment_bill_address_country")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[8]")
    public WebElement CountryField;

    @AndroidFindBy(id = "payment_bill_address_postcode")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[4]")
    public static WebElement Postal;

    @AndroidFindBy(id = "edit_payment_bill_address_postcode")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[3]")
    public static WebElement PostalEditCardScreen;

    @AndroidFindBy(id = "payment_bill_address_street")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[5]")
    public static WebElement Addrs1;

    @AndroidFindBy(id = "payment_bill_address_locality")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[6]")
    public static WebElement Addrs2;

    @AndroidFindBy(id = "payment_bill_address_city")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[7]")
    public static WebElement City;

    //    @AndroidFindBy(id = "payment_done_btn")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Done\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
    public WebElement PaymtDone;

    @AndroidFindBy(id = "security_pin_entry_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your Esso PIN to unlock the app for fuelling.\"]")
    public WebElement PinTxt;

    @AndroidFindBy(id = "pump_select_text")
    @iOSXCUITFindBy(id = "pump_select_text")
    public static WebElement SelectPumpHeader;

    @AndroidFindBy(id = "pump_selection_message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Make sure you are parked'")
    public static WebElement SelectPumpTxt;

    @AndroidFindBy(id = "cancel_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public static WebElement CancelSelectYourPumpScreen;

    @AndroidFindBy(xpath = "//*[contains(@text,'added')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Card added successfully.\"]")
    public WebElement CardAddSuccess;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public WebElement PinCode_1;

    @AndroidFindBy(id = "security_pin_entry_code2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    public WebElement PinCode_2;

    @AndroidFindBy(id = "security_pin_entry_code3")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    public WebElement PinCode_3;

    @AndroidFindBy(id = "security_pin_entry_code4")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    public WebElement PinCode_4;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public WebElement okBtn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public WebElement Continue_BTN;

    @AndroidFindBy(xpath = "//*[contains(@text,'OK')]")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]"),
            @iOSXCUITBy(id = "button1")})
    public WebElement Okcomplete;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Confirm your Identity\"]")
    public WebElement PromptTtl;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Just to ensure'")
    public WebElement Prompt3DSTxt;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(id = "Got It")
    public WebElement Prompt3DSGotItBtn;

    @AndroidFindBy(id = "challengeInformationLabelTextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Enter your password')]")
    public WebElement EnterPwd;

    @AndroidFindBy(id = "payment_checkout_layout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm\"]")
    public WebElement Confirm_BTN;

    @AndroidFindBy(id = "payment_billing_info_icon")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement BillingIcon;

    @AndroidFindBy(id = "checkBox_save_next_time")
    @iOSXCUITFindBy(id = "checkBox_save_next_time")
    public WebElement SaveForNextTime;


    @AndroidFindBy(id = "payment_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[2]")
    public WebElement PaymentMethodEditBtn;

    @AndroidFindBy(id = "fueling_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[3]")
    public WebElement ConfirmPaymentEditMfa;

    @AndroidFindBy(xpath = "//*[contains(@text,'Set the Esso PIN')]")
    @iOSXCUITFindBy(id = "security_pin_entry_title")
    public WebElement setpin_Copytext;

    @AndroidFindBy(id = "payment_expdt_validation_txt")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Please enter expiry date\"]")
    public WebElement ExpErroMessage;

    @AndroidFindBy(id = "add_payment_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add Debit/Credit Card\"]")
    public WebElement payment_AddCreditDebit_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    public WebElement set_Pin_Screen;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(id = "security_pin_entry_continue_btn")
    public WebElement payment_Pin_Continue_Btn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Esso PIN added successfully.')]")
    @iOSXCUITFindBy(id = "Esso PIN added successfully.")
    public WebElement pin_Confirm;

    @AndroidFindBy(xpath = "//*[contains(@text,'OK')]")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]"),
            @iOSXCUITBy(id = "button1")})
    public WebElement pin_Confirm_Ok_Btn;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Mastercard Logo\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"card_logo\"]")
    public WebElement card_Details_Master_Logo;

    @AndroidFindBy(id = "payment_done_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
    public WebElement add_CreditDebit_Continue_Btn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter card number\"]")
    @AndroidFindBy(id = "payment_cardno_validation_txt")
    public WebElement add_CreditDebit_Cardnumber_Inline_Error;

    @AndroidFindBy(id = "pickers")
    @iOSXCUITFindBy(iOSNsPredicate = "type == \"XCUIElementTypePicker\"")
    public WebElement card_Exp_DateMonth_screen;

    @AndroidFindBy(id = "enter_password_text")
    public WebElement esso_Pin_Edit_Password;

    @AndroidFindBy(id = "submit_btn")
    public WebElement esso_Pin_Edit_Password_Continue;

    @AndroidFindBy(id = "security_pin_entry")
    public WebElement esso_New_Pin_Screen;

    @AndroidFindBy(id = "account_secure_set_up_pin")
    public WebElement essolink_In_Account;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")
    public WebElement essolink_Screen;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    public WebElement set_Up_Pin_Continue;

    @AndroidFindBy(id = "pin_entry_attemp_validation_txt")
    public WebElement set_Up_Pin_Inline_Error_Msg;

    @AndroidFindBy(id = "payment_cvv_info_icon")
    @iOSXCUITFindBy(id = "Info")
    public WebElement iicon_Security_Code;

    @AndroidFindBy(id = "pay_dialog_mid_lyt")
    @iOSXCUITFindBy(id = "Visa and Mastercard")
    public WebElement popup_I_Icon;

    @AndroidFindBy(id = "info_image_lyt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage")
    public WebElement popup_img_icon;

    @AndroidFindBy(id = "info_visa_mastercard__header_tv")
    @iOSXCUITFindBy(id = "Visa and Mastercard")
    public WebElement tool_tip_title_1;

    @AndroidFindBy(id = "info_ae_header_tv")
    @iOSXCUITFindBy(id = "American Express")
    public WebElement tool_tip_title_2;

    @AndroidFindBy(id = "info_visa_tv")
    @iOSXCUITFindBy(id = "For Visa and Mastercard, find the 3 digit security code on the back of your card.")
    public WebElement tool_tip_description_1;

    @AndroidFindBy(id = "info_ae_tv")
    @iOSXCUITFindBy(id = "For American Express, the 4 digit security code can be found on the front of the card.")
    public WebElement tool_tip_description_2;

    @AndroidFindBy(id = "dashboard_start_option_inner_img")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'start'")
    public WebElement start_Fueling_Icon;

    @AndroidFindBy(id = "continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public WebElement continue_Btn_Pump;

    @AndroidFindBy(id = "add_payment_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name BEGINSWITH 'Add Debit'")
    public WebElement AddDebitOrCrecitcardButton;

    @AndroidFindBy(id = "pay_with_paypal_btn")
    @iOSXCUITFindBy(id = "pay_with_paypal_btn")
    public WebElement paypal_Btn_Payment;

    @AndroidFindBy(id = "fuel_authorize_continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public WebElement paypal_Continue_Btn;

    @AndroidFindBy(id = "security_pin_entry_code1")
    public WebElement pin_Dot;

    @AndroidFindBy(id = "btnClose")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Close Icon'")
    public WebElement completed_Popup;

    @AndroidFindBy(id = "payment_confirmation_done_btn")
    public WebElement transaction_Done;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Set Up PIN'")
    public WebElement setpin_Title;

    @AndroidFindBy(id = "account_secure_pin")
    @iOSXCUITFindBy(id = "account_secure_pin")
    public WebElement EssoPinAccount;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Set up Esso PIN\"]")
    public WebElement SetUpEssoPinLink;

    @AndroidFindBy(id = "payment_details_cardview_lyt")
    public WebElement carddetails_Screen;

    @AndroidFindBy(id = "payment_bill_address_locality")
    public WebElement second_Address_Field;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")
    public WebElement second_Address_Field_Keypad;

    @AndroidFindBy(id = "search_icon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]")
    public WebElement search_Icon;

    @AndroidFindBy(id = "android:id/message")
    public WebElement search_Icon_Popup_Msg;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement search_Icon_Ok_Btn;

    @AndroidFindBy(id = "pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Forgot Your PIN?\"]")
    public WebElement forgot_Password_Pin;

    @AndroidFindBy(id = "pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Forgot Your PIN\"]")
    public WebElement forgot_Password_Pinwithoutquestion;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Password\"]")
    public WebElement enter_Password_ForgetPass;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public WebElement cancel_Icon_ForgetPass;

    @AndroidFindBy(id = "security_pin_password")
    @iOSXCUITFindBy(iOSNsPredicate = "value == \"Enter Password\" AND type == \"XCUIElementTypeSecureTextField\"")
    public WebElement enterpass_ForgetPass;

    @AndroidFindBy(id = "forgot_password_link")
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`label == \"Forgot Your Password?\"`]")
    public WebElement forgetPass_ForgetPass;

    @AndroidFindBy(id = "submit_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Continue\"]")
    public WebElement continue_ForgetPass;

    @AndroidFindBy(id = "LocatorNeeded")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Info\"]")
    public WebElement ShowPasswordLabel;

    @AndroidFindBy(id = "forgot_password_continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Send\"]")
    public WebElement send_Btn_ForgetPass;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Got It\"]")
    @AndroidFindBy(id = "info_dialog_gotit_btn")
    public WebElement cardDetails_I_Gotit_Icon;

    @AndroidFindBy(id = "enter_password_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your Esso App password to proceed.\"]/following::XCUIElementTypeOther[2]")
    public WebElement forgetPin_Password_Field;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public WebElement forgetPin_Ok_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup")
    public WebElement back_To_NLID;

    @AndroidFindBy(id = "payment_billing_details_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Billing Details\"]")
    public WebElement card_Details_Billing_Icon;


    @AndroidFindBy(xpath = "//*[contains(@resource-id,'pin_edit')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[4]")
    public WebElement EditEssoPin;

        @AndroidFindBy(id = "payment_billing_info_icon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"info blue icon\"])[1]")
    public WebElement card_Details_Billing_I_Icon;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'consent_checkBox')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public WebElement ConsentBox;

    @AndroidFindBy(id = "security_pin_entry")
    public WebElement set_Pin_dot_Screen;

    @AndroidFindBy(id = "payment_bill_address_postcode")
    public WebElement post_Code_Card_Details;

    @AndroidFindBy(id = "search_icon")
    public WebElement enable_Search_Icon;

    @AndroidFindBy(id = "search_editText")
    public WebElement post_Code_Lookup_Screen1;

    @AndroidFindBy(id = "address_list_lyt")
    public WebElement post_Code_Lookup_Screen2;

    @AndroidFindBy(id = "android:id/message")
    public WebElement postcode_Popup;

    @AndroidFindBy(id = "forgot_password_header_tv")
    public WebElement forgotpass_text;

    @AndroidFindBy(id = "forgot_password_continue_btn")
    public WebElement forgotPass_Send_Btn;

    @AndroidFindBy(id = "payment_bill_address_city")
    public WebElement cardDetails_City_Field;

    @AndroidFindBy(id = "payment_expdt_validation_txt")
    @iOSXCUITFindBy(id = "Please enter expiry date")
    public WebElement expiry_Date_Inline_Error_Msg;

    @AndroidFindBy(id = "payment_city_validation_txt")
    public WebElement city_Name_Inline_Error_Msg;

    @AndroidFindBy(id = "payment_secCode_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Please enter'")
    public WebElement security_Code_Inline_Err_Msg;

    @AndroidFindBy(id = "payment_billing_details_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Billing Details\"]")
    public WebElement billing_Details_Field;

    @iOSXCUITFindBy(id = "Please set up Apple Pay, PayPal or manually add a Debit/Credit Card to pay with the Esso App.")
    public WebElement AddPaymentScreen11;

    @AndroidFindBy(xpath = "//*[contains(@text,'Your billing details')]")
    @iOSXCUITFindBy(id = "Your billing details must match the exact address registered with the issuing bank.")
    public WebElement billingLable;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id = "OK")
    public WebElement billingLableoK;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(id = "Your billing details must match the exact address registered with the issuing bank.")
    public WebElement iicon_Popup_Msg;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(id = "Add a payment method to pay at the pump")
    public WebElement AddPaymentMethod;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Please check the box'")
    public WebElement CheckboxPopUpMsg;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'By saving this'")
    public WebElement ConsentIconPopUpMsg;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public WebElement iicon_Popup_Msg_Ok_Btn;

    @AndroidFindBy(id = "pin_entry_attemp_validation_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Wrong PIN. 2 Attempts left.\"]")
    public WebElement wrong_Pin_Inline_Err_Msg;

    @AndroidFindBy(id = "payment_streetAdr_validation_txt")
    @iOSXCUITFindBy(id = "Please enter address")
    public WebElement billing_Inline_Error_Address_Field;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Done'")
    public WebElement billing_Details_Expiry_Date_Ok;

    @AndroidFindBy(id = "card_consent_checkBox")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"circleUnCheck\"]")
    public static WebElement billing_Details_COF_Checkbox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter name on card\"]")
    @AndroidFindBy(id = "payment_name_validation_txt")
    public WebElement card_Name_Inline_Err_Msg;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Postcode Lookup\"]")
    public WebElement postcode_Lookup_Title;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(xpath = "locator need")
    public WebElement postcode_Lookup_Select_Button;

    @AndroidFindBy(id = "address_search_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"]")
    public WebElement postcode_Lookup_Search_Icon;

    @AndroidFindBy(id = "close_img")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear text\"]")
    public WebElement postcode_Lookup_Clear_Icon;

    @AndroidFindBy(xpath = "//*[contains(@text,'Select')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Select\"]")
    public WebElement selectLookUp;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell")
    public List<WebElement> postcode_Lookup_Screen_Address;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]")
    @AndroidFindBy(id = "address_lookup_selected")
    public WebElement postcode_Lookup_Screen_Selected_Address;

    @AndroidFindBy(id = "finger_print_check_box")
    public WebElement billing_Details_Checkbox_Authoriz;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout")
    public WebElement esso_Edit_Pin_Screen;

    @AndroidFindBy(id = "account_secure_set_up_pin")
    public WebElement esso_Pin_Account;

    @AndroidFindBy(id = "payment_bill_address_country")
    public WebElement unitedkingdm_Billing_Details;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'An email has been'")
    public WebElement resend_Popup_Msg;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Password reset'")
    @AndroidFindBy(id = "alertTitle")
    public WebElement resendPopup_Title;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear text\"]")
    @AndroidFindBy(id = "close_img")
    public WebElement closeicon_Postcode_Lookup;

    @AndroidFindBy(id = "flContainer")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell")
    public List<WebElement> address_List_Postcode_LookupScreen;

    @AndroidFindBy(id = "consent_info_icon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"info blue icon\"])[2]")
    public WebElement consent_I_Icon_Billing_Details;

    @AndroidFindBy(id = "payment_posCode_validation_txt")
    @iOSXCUITFindBy(id = "Please enter postcode")
    public WebElement postcode_Inline_Error_Msg;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Card added'")
    public WebElement card_Added_Success_Msg;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public WebElement card_Add_Ok_Btn;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public WebElement card_Alert_Ok_Btn;

//    @AndroidFindBy(id = "account_paycard_title")
//    public WebElement payment_Method_Txt;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    public WebElement added_Card_Number;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    public WebElement added_Card_Edit;

    @AndroidFindBy(id = "edit_payment_done_btn")
    public WebElement added_Card_Edit_Done;

    @AndroidFindBy(id = "edit_payment_delete_btn")
    public WebElement added_Card_Edit_Cancel;

    @AndroidFindBy(id = "header_text")
    public WebElement account_Screen_Title;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Mastercard Logo\"]")
    public WebElement added_Card_Logo;

    @AndroidFindBy(id = "paypal_get_started")
    public WebElement continue_Payment_Added;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
    public WebElement billing_Postcode_Address;

    @AndroidFindBy(id = "search_icon")
    public WebElement Postcodesearch;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
    public WebElement Postselectaddress;

    @AndroidFindBy(id = "header_right_txt")
    public WebElement selectbutton;

    @AndroidFindBy(id = "security_pin_entry_title")
    @iOSXCUITFindBy(id = "Enter your Esso PIN to unlock the app for fuelling.")
    public WebElement enteryouressopin_txt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Due to security reasons you need to login again.\"]")
    public WebElement passwordWarningPopup;

//    @AndroidFindBy(xpath = "//*[@resource-id=\"android:id/numberpicker_input\" and @index=\"0\"]")
    @AndroidFindBy(xpath = "//android.widget.NumberPicker[1]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypePicker/XCUIElementTypePickerWheel[1]")
    public WebElement MonthPickerAddCard;

//    @AndroidFindBy(xpath = "//*[@resource-id=\"android:id/numberpicker_input\" and @index=\"0\"]")
    @AndroidFindBy(xpath = "//android.widget.NumberPicker[2]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypePicker/XCUIElementTypePickerWheel[2]")
    public WebElement YearPickerAddCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypePicker/XCUIElementTypePickerWheel")
    public List<WebElement> monthYearPicker;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
    public List<WebElement> monthYearPicker1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"New PIN updated successfully.\"]")
    public WebElement pinSuccessMessage;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"NONE OF THE ABOVE\"]")
    public WebElement noneOfTheAboveButton;


    public String monthPicker() {
        Calendar cal = Calendar.getInstance();
        String[] monthName = {"January", "February",
                "March", "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December"};
        String Months = monthName[cal.get(Calendar.MONTH)];
        return Months;
    }

    public String yearPicker() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String YR = String.valueOf(year);
        return YR;
    }

//    public static void acceptbutton() {
////        driver.executeScript(String.valueOf(new KeyEvent(AndroidKey.SEARCH)));
////        driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
////        driver.getKeyboard().sendKeys(Keys.ENTER);
////        ((AndroidDriver<WebElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
////        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
//        driver.getKeyboard().pressKey(Keys.ENTER);
//    }

    @iOSXCUITFindBy(id = "pin_entry_attemp_validation_txt")
    @AndroidFindBy(xpath = "//*[contains(@text,'Enter a 4')]")
    public WebElement EssoPINTxtinErr;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"continue\")")
    public WebElement EssoPINTxtContinue;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Due to security reasons you need to login again.\"]")
    @AndroidFindBy(id = "android:id/message")
    public WebElement Securitytxt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"OK\"))")
    public WebElement Securitytxtok;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set the Esso PIN to unlock the app for fuelling.\"]")
    @AndroidFindBy(id = "header_right_txt")
    public WebElement EssoPINTxt2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    @AndroidFindBy(id = "header_left_txt")
    public WebElement EssoPINCancel;

    @iOSXCUITFindBy(id = "account_secure_set_up_pin")
    @AndroidFindBy(id = "account_secure_set_up_pin")
    public WebElement EssoPINTxt;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
    public WebElement userName;

    @AndroidFindBy(id = "account_user_profile_title")
    @iOSXCUITFindBy(id = "account_user_profile_title")
    public static WebElement UserProfileAccount;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeSecureTextField' AND value BEGINSWITH 'Password'")
    public WebElement password;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot Your Password?\"]")
    @AndroidFindBy(id = "forgot_password_link")
    public WebElement Essoforgotlink;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot Your Password\"]")
    @AndroidFindBy(id = "forgot_password_link")
    public WebElement Essoforgotlinkwithoutquestion;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Forgot Your PIN?\"]")
    @AndroidFindBy(id = "pin_entry_forgot_pin_txt")
    public WebElement EssoforgotPIN;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your Esso App password to proceed.\"]")
    @AndroidFindBy(id = "security_pin_password")
    public WebElement EssoforgotPWDlable;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Maximum Fuelling Amount'")
    public WebElement maximum_Fueling_Btn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Send\"]")
    @AndroidFindBy(id = "forgot_password_continue_btn")
    public WebElement EssoForContinueBtn;

    @AndroidFindBy(id = "forgot_password_continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'Send'")
    public WebElement send_Button_Forgot_Password;

    @AndroidFindBy(id = "pay_with_paypal_btn")
    @iOSXCUITFindBy(id = "pay_with_paypal_btn")
    public WebElement PayPalButn;


    @iOSXCUITFindBy(id = "In order to reset your password, an email will be sent to your address:")
    @AndroidFindBy(id = "forgot_password_header_tv")
    public WebElement EssoForgotINCTLable;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot Password\"]")
    @AndroidFindAll({
            @AndroidBy(id = "//android.widget.TextView[@text='Forgot Password']"),
            @AndroidBy(id = "header_text")})
    public WebElement EssoEssoForgotttle;

    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name=='Forgot Password'")
    @AndroidFindBy(id = "header_text")
    public WebElement EssoPINTxttitle1;

//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Edit\"])[6]")
//    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'payment_method')]//*[contains(@resource-id,'payment_edit')]")
//    public WebElement PaymentEditbtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete Card\"]")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Delete Card\"))")
    //@AndroidFindBy(id = "edit_payment_delete_btn")
    public WebElement CardDeletebtn;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Are you sure you want to delete this card?'")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Are you sure you want to delete this card?\"))")
    public WebElement Carddeletepopupmsg;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter city\"]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Please enter city')]")
    public WebElement CardinlineError;

    @iOSXCUITFindBy(id = "Done")
    public WebElement KayDone;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter card number\"]")
    @AndroidFindBy(id = "header_right_txt")
    public WebElement Cardnumber;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter name on card\"]")
    @AndroidFindBy(id = "header_right_txt")
    public WebElement Cardname;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please enter postcode\"]")
    @AndroidFindBy(id = "header_right_txt")
    public WebElement PostcodeinlineError;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Set Up PIN'")
    @AndroidFindBy(id = "header_right_txt")
    public WebElement EssoPINsetuptxt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NavBack\"]")
    @AndroidFindBy(id = "header_back_btn")
    public WebElement navBack;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"back Icon\"]")
    @AndroidFindBy(id = "header_back_btn")
    public WebElement navBack1;

    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '****'")
    @AndroidFindBy(id = "account_card_number")
    public WebElement cardLastdigit;

    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '****'")
    @AndroidFindBy(id = "edit_payment_cardNumber_tv")
    public WebElement cardLastdigit1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage")
    @AndroidFindBy(id = "selected_card_tickmark")
    public List<WebElement> tickMark;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Card\"]")
    public WebElement AccountaddCard;

    @AndroidFindBy(id = "card_consent_checkBox")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public WebElement ConsentBox11;

    @AndroidFindBy(id = "button1")
    @iOSXCUITFindBy(id = "OK")
    public WebElement ConsentBox11OK;

    @AndroidFindBy(xpath = "//*[contains(@text,'Payment method')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment method added successfully\"]")
    public WebElement AddpaymentScuccss;

    @AndroidFindBy(id = "dashboard_help_msg_social")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your payment method account will be charged for the amount you fuel.\"]")
    public WebElement AddpaymentScuccsslabel;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Complete your profile\"])[8]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Payment Method\"])[2]")
    public WebElement AddpaymentScuccssContinue;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public WebElement pinDigit;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
    public WebElement DonebtnEXP;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(id = "Done")
    public WebElement DonebtnEXPiOS;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Payment Method'])[2]")
    public WebElement payment_Methd_Btn1;

    @AndroidFindBy(id = "linkedin_login_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"linkednNew\"]")
    public WebElement LinkedinIcon;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Nectar card\"]")
    public WebElement OkNect;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Already Completed\"]")
    public WebElement profComCT;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"You have already completed this feature. Please select a feature without tickmark to complete your profile.\"]")
    public WebElement profComCT1;

    @AndroidFindBy(xpath = "//*[contains(@text,'Set Up PIN')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set Up PIN\"]")
    public WebElement SetupPINTitle;

    @AndroidFindBy(xpath = "//*[contains(@text,'Add Debit')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Debit/Credit Card\"]")
    public WebElement Addpaymentscreentitle;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Flat 1,Henry House,Ringers Road\"]")
    public WebElement Postcodelist;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Skip\"]")
    public WebElement Skipmax;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public WebElement Edit_Cancel;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    public WebElement Contmax;

    @AndroidFindBy(id = "dashboard_register_btn")
    @iOSXCUITFindBy(id = "dashboard_register_btn")
    public WebElement DashRegstr;

    @AndroidFindBy(id = "linkedin_login_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Welcome Back\"]")
    public WebElement LinkedinIconWel;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"Email or Phone\"]")
    public WebElement SSOLinUsername;

    @AndroidFindBy(xpath = "//android.view.View[1]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"] ")
    public WebElement SSOlinpwd;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign in\"]")
    public WebElement SSOsignin;

    @AndroidFindBy(id = "dashboard_start_option_inner_img")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"start\"]")
    public WebElement StartFuelIconLID;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public WebElement PopUpCancel;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id = "Delete")
    public WebElement PopUpDelete;

    @AndroidFindBy(id = "lid_vertical_dash")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"start\"]")
    public WebElement CTLID;

    @AndroidFindBy(id = "btnClose")
    @iOSXCUITFindBy(id = "Close Icon")
    public static WebElement CloseButtonModalPopupLid;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"We have sent you instructions to reset your password. Please check your inbox or spam folder.\"]")
    public WebElement Resetlabletxt;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"CANCEL\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CANCEL\"]")
    public WebElement CANCEL;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"DELETE\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"DELETE\"]")
    public WebElement DELETE;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"CONTINUE\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"DONE\"]")
    public WebElement CONTINUE;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Payment method\"))")
    public WebElement PaymentMethod;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Choose Default Method\"))")
    public WebElement ChooseDefaultMethod;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Add Card\"))")
    public WebElement AddCardtext;

    @AndroidFindBy(id = "locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment Method\"")
    public WebElement PaymentMethodTxt;

    @AndroidFindBy(id = "locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Welcome to the Esso App Here’s a few tips before you get started\"")
    public WebElement FuelWelcomeTxt;

    @AndroidFindBy(id = "locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Swipe left or right to select your pump\"]\n")
    public WebElement SwipeText;

    @AndroidFindBy(id = "locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Got It\"]")
    public WebElement FuelGotItButton;

    @AndroidFindBy(id = "locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Tap to select the maximum amount you would like to fuel today\"")
    public WebElement FuelMaxAmtTxt;

    @AndroidFindBy(id = "locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your Maximum Fuelling Amount: £100\"]")
    public WebElement FuelMFA;

    @AndroidFindBy(id = "locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"GET STARTED!\"]")
    public WebElement FuelGetStartedBtn;

    @AndroidFindBy(id = "locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Tap the Continue button to start fuelling\"")
    public WebElement FuelContinueTxt;


    @AndroidFindBy(id = "locator need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Identify Confirmation\"]")
    public WebElement IdentityConfrm3DSTtl;

    @AndroidFindBy(id = "locator need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Just to be sure you are you and you own this card, we need to ask you a few questions. Don’t worry! No monies will be charged to your account.\"]\n")
    public WebElement Identity3DSTxt;

    @AndroidFindBy(id = "locator need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Touch ID\"]")
    public WebElement Touchid;

    @AndroidFindBy(id = "locator need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Face ID\"]")
    public WebElement Faceid;

    @AndroidFindBy(id = "change_payment_method_text")
    @iOSXCUITFindBy(id = "needed")
    public WebElement ChangePaymentPaymentDetails;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[3]/android.widget.FrameLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[3]")
    public WebElement SelectCOFCard;

    @AndroidFindBy(id = "picker")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[3]")
    public WebElement SelectCOFCardPicker;

    @AndroidFindBy(id = "fuel_authorize_continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND BEGINSWITH 'Ready To'")
    public WebElement ReadyStartFuelTxt;

    @AndroidFindBy(id = "challengeInformationTextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Invalid password.'")
    public WebElement PassError;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'payment_method')]//*[contains(@text,'Edit')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[1]")
    public WebElement EditCard;


    @AndroidFindBy(xpath = "//*[contains(@resource-id,'payment_method')]//*[contains(@resource-id,'payment_edit')]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[5]")
    public WebElement EditCardwithoutMobile;

    @AndroidFindBy(id = "account_secure_pin_edit")
    @iOSXCUITFindBy(id = "account_secure_pin_edit")
    public WebElement EditPinwithoutMobile;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[5]")
    public WebElement EditCard1withoutMobile;

    @AndroidFindBy(id = "Not Needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Done'")
    public WebElement DoneButtonKeypad;

    @AndroidFindBy(id = "account_user_profile_title")
    @iOSXCUITFindBy(id = "account_user_profile_title")
    public static WebElement UserProfileAccountFriction;

    @iOSXCUITFindBy(id = "security_pin_entry_title")
    @AndroidFindBy(xpath = "//*[contains(@text,'new')]")
    public WebElement newESSOPinTxt;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[4]")
    @AndroidFindBy(id = "edit_payment_bill_addressline2")
    public WebElement Addr1EditCardScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField/XCUIElementTypeStaticText")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'security_code')]")
    public WebElement editCVV;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Edit PIN\"]")
    @AndroidFindBy(id = "header_station_name_text")
    public WebElement editEssoPinHeader;

    @iOSXCUITFindBy(id = "header_left_txt")
    @AndroidFindBy(id = "header_left_txt")
    public WebElement editEssoPinCancelBtn;

    @iOSXCUITFindBy(id = "header_left_txt")
    @AndroidFindBy(id = "header_left_txt")
    public WebElement EnterEssoPinCancelBtn;

    @iOSXCUITFindBy(id = "header_left_txt")
    @AndroidFindBy(id = "header_left_txt")
    public WebElement SetUpPinCancelBtn;

//    @iOSXCUITFindBy(id = "Cancel")
//    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Cancel')]")
//    public WebElement editEssoPinCancelBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'address_lookup_categories')]")
    public List<WebElement> postcodeLookupResults;

    @iOSXCUITFindBy(id = "account_secure_pin")
    @AndroidFindBy(xpath = "//*[@text='Esso PIN']")
    public WebElement essoPinTxt;

    @iOSXCUITFindBy(id = "account_secure_set_up_pin")
    @AndroidFindBy(xpath = "//*[@text='Set Up Esso PIN']")
    public WebElement setUpEssoPin;

    @AndroidFindBy(xpath = "//*[contains(@text,'Set the Esso')]")
    public WebElement setupPinDesc;

    @iOSXCUITFindBy(iOSNsPredicate= "type == \"XCUIElementTypeSearchField\"")
    @AndroidFindBy(xpath = "//*[contains(@text,'Search Postcode')]")
    public WebElement postcodeEmptySearchBox;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Cancel'")
    public WebElement AddCardCancelLid;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(id = "Cancel")
    public WebElement CreditDebitCardCancel;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Scan Your Card\"]")
    @AndroidFindBy(xpath = "//*[contains(@text,'Scan Your Card')]")
    public List<WebElement>  scanCardLink;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(id = "security_pin_entry_continue_btn")
    public static WebElement Continue_BTN_EnterPINScreenFuelling;

    @AndroidFindBy(id = "payment_edit")
    @iOSXCUITFindBy(id = "payment_edit")
    public WebElement EditPaymentMethodLink;

    @AndroidFindBy(id = "item_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[4]")
    public WebElement EditPaymentMethodLinkAccount;

    @AndroidFindBy(id = "add_payment_method_btn")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[contains(@name,'Add Payment')]"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Add a payment')]")})
    public WebElement AddPaymentMethodButtonLidCt;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Are you')]")
    public WebElement CancelTransactionTitleCt;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'You are trying to')]")
    public WebElement CancelTransactionSubtitleCt;

    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(id = "Cancel Transaction")
    public WebElement CancelTransactionbutton;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id = "Close")
    public WebElement CancelTransactionPopupCloseButton;

    @AndroidFindBy(id = "select_payment_edit")
    @iOSXCUITFindBy(id = "select_payment_edit")
    public WebElement EditPumpConfirmPayment;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]//XCUIElementTypeStaticText[2]")
    public WebElement CardNumberAndTypeTransactionDetails;

    @AndroidFindBy(id = "paypal_textview")
    public static WebElement CardTypeTransactionDetails;

    @AndroidFindBy(id = "card_alias_name")
    public static WebElement AsteriskValue;

    @AndroidFindBy(xpath = "//*[contains(@text,'****')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '****'")
    public static List<WebElement> CardNumberTransactionComplete;

    @AndroidFindBy(id = "password_show_img")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Info\"])[1]")
    public WebElement ShowToggleButtonPwd;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public List<WebElement> already_completed_Popupok_Btn;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public WebElement pinDigit1;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public List<WebElement> ListPinDigit1;

    @AndroidFindBy(id = "security_pin_entry_code2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
    public WebElement pinDigit2;

    @AndroidFindBy(id = "security_pin_entry_code3")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    public WebElement pinDigit3;

    @AndroidFindBy(id = "security_pin_entry_code4")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]")
    public WebElement pinDigit4;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(id = "security_pin_entry_continue_btn")
    public WebElement pinContinueButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[2]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'visa')]")
    public WebElement visaLogo;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[3]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'master')]")
    public WebElement  mastercardLogo;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[4]")
    @AndroidFindBy(xpath = "//*[contains(@resource-id,'amex')]")
    public WebElement amexLogo;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public WebElement card_Pin_Num1;

    @AndroidFindBy(id = "security_pin_entry_code2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    public WebElement card_Pin_Num2;

    @AndroidFindBy(id = "security_pin_entry_code3")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    public WebElement card_Pin_Num3;

    @AndroidFindBy(id = "security_pin_entry_code4")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    public WebElement card_Pin_Num4;

    @AndroidFindBy(id = "location_continue_btn")
    @iOSXCUITFindBy(id="location_continue_btn")
    public WebElement LocationContinueButton;

    @AndroidFindBy(id = "payment_expdate_et")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeTextField)[3]")
    public static WebElement ExpiryDate;

    @AndroidFindBy(id ="search_icon")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Search\"]")
    public WebElement SearchIcon;

    @AndroidFindBy(id = "payment_done_btn")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Done\"]")
    public WebElement DoneButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Flat 1, Henry House, Ringers Road\"))")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Flat 1,Henry House,Ringers Road\"]")
    public WebElement SelectAddreess;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Select\"]")
    public WebElement HeaderRightText;

    @AndroidFindBy(id = "card_consent_text_view")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'I consent')]")
    public WebElement ConsentBoxCopyText;

    @AndroidFindBy(id = "challengeInformationHeaderTextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Verify by Password')]")
    public WebElement VerifyPwd;

    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Debit'")
    @AndroidFindBy(xpath = "//*[contains(@text,'Add Debit/Credit Card')]")
    public WebElement addCardTitle;

    @AndroidFindBy(id = "confirm_payment")
    @iOSXCUITFindBy(id = "confirm_payment")
    public WebElement ConfirmPayment;

    @AndroidFindBy(id="button_action")
    @iOSXCUITFindBy(id="button_action")
    public WebElement GcoMfaContinueButton;

    @AndroidFindBy(id = "account_paycard_title")
    @iOSXCUITFindBy(id = "account_paycard_title")
    public WebElement PaymentMethodAccount;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(id = "security_pin_entry_continue_btn")
    public WebElement Continue_BTN_SetUpPINScreen;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public WebElement PinCode_1_Registration;

    @AndroidFindBy(id = "security_pin_entry_code2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeTextField")
    public WebElement PinCode_2_Registration;

    @AndroidFindBy(id = "security_pin_entry_code3")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    public WebElement PinCode_3_Registration;

    @AndroidFindBy(id = "security_pin_entry_code4")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    public WebElement PinCode_4_Registration;
}