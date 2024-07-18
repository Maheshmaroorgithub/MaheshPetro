package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class ManualRegistrationPage extends GenericWrappers {
    public ManualRegistrationPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "validations_tick1_iv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeImage[1]")
    public WebElement Tick1ManualRegistration;
    @AndroidFindBy(id = "validations_tick2_iv")
    @iOSXCUITFindBy(id = "validations_tick2_iv")
    public WebElement Tick2ManualRegistration;
    @AndroidFindBy(id = "validations_tick3_iv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeImage[3]")
    public WebElement Tick3ManualRegistration;
    @AndroidFindBy(id = "validations1")
    @iOSXCUITFindBy(id = "validations1")
    public WebElement PassValidation1ManualRegistration;
    @AndroidFindBy(id = "validations2")
    @iOSXCUITFindBy(id = "validations2")
    public WebElement PassValidation2ManualRegistration;
    @AndroidFindBy(id = "validations3")
    @iOSXCUITFindBy(id = "validations3")
    public WebElement PassValidation3ManualRegistration;
    @AndroidFindBy(id = "confirm_password_validation_txt")
    @iOSXCUITFindBy(id = "confirm_pwd_validation_txt")
    public WebElement ConfirmPasswordInlineErrorMessage;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Please Accept'")
    public WebElement PleaseAcceptPPTitle;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Please indicate'")
    public WebElement PleaseAcceptPPContent;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Done'")
    public WebElement DoneKeypadRegistration;
    @AndroidFindBy(id = "email_validation_txt")
    @iOSXCUITFindBy(id = "email_validation_txt")
    public WebElement MultipleMailIdPopup;
    @AndroidFindBy(id = "email_validation_txt")
    @iOSXCUITFindBy(id = "email_validation_txt")
    public WebElement InlineEmailErrorRegistration;
    @AndroidFindBy(id = "login_email_error_tv")
    @iOSXCUITFindBy(id = "NEEDED")
    public WebElement IncorrectEmailFormatLoginScreen;
    @AndroidFindBy(id = "newsletter_tv1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'I’d like to receive'")
    public WebElement EssoCheckboxContentRegistration;
    @AndroidFindBy(id = "email_validation_txt")
    @iOSXCUITFindBy(id = "email_validation_txt")
    public List<WebElement> InlineErrorEmptyEmail1;
    @AndroidFindBy(id = "password_validation_txt")
    @iOSXCUITFindBy(id = "pwd_validation_txt")
    public WebElement InlineErrorless8charPassword;
    @AndroidFindBy(id = "confirm_password_EditText")
    @iOSXCUITFindBy(id = "confirm_pwd_EditText")
    public WebElement RegstrConfPass;

    @AndroidFindBy(id = "password_validation_txt")
    @iOSXCUITFindBy(id = "pwd_validation_txt")
    public WebElement InlineErrorEmptyPassword;
    @AndroidFindBy(id = "privacy_policy_tv")
    @iOSXCUITFindBy(id = "Privacy Policy")
    public WebElement PpLinkRegistration;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(id = "Terms and Conditions.")
    public WebElement TcLinkRegistration;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'NavBack'")
    public WebElement BackPpLinkRegistration;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Privacy Policy'")
    public WebElement PpLinkRegistrationTitle;
    @AndroidFindBy(id = "password_show_img")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Info\"])[1]")
    public WebElement ShowToggleButtonPwd;
    @AndroidFindBy(id = "confirm_password_EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Touch ID'")
    public WebElement TouchIdContent;
    @AndroidFindBy(id = "privacy_policy_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'I accept the Privacy'")
    public WebElement PpTcCheckboxContentRegistration;
    @AndroidFindBy(id = "mobile_county_code_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == '+44(0)'")
    public WebElement CountryCodeRegisterScreen;
    @AndroidFindBy(id = "mobile_EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[6]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    public WebElement MobileNumberTextBoxManualRegistration;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeWindow[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]"),
            @iOSXCUITBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and value == 'Done'")})
    public WebElement HideKeyPadMobileRegistration;
    @AndroidFindBy(id = "mobile_info_icon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"info blue icon\"])[1]")
    public WebElement InfoButtonMobileRegistration;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Please provide your'")
    public WebElement InfoContentMobileRegistration;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public WebElement InfoPopupOkMobileRegistration;
    @AndroidFindBy(id = "mobile_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Please enter a valid mobile number'")
    public WebElement InlineErrorMessageMobileRegistration;
    @AndroidFindBy(id = "account_user_mobile_number")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Mobile number'")
    public WebElement MobileNumberTitleAccount;
    @AndroidFindBy(id = "add_mobile_number")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Add Mobile Number'")
    public WebElement MobileNumberButtonAccount;
    @AndroidFindBy(id = "account_mobile_edit")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH '+44(0)'")
    public WebElement MobileNumberButtonAccountWithButton;
    @AndroidFindBy(id = "delete_mobile_number")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Delete Mobile Number'")
    public WebElement MobileNumberDeleteButtonAccount;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Delete'")
    public WebElement MobileDeleteButtonPopupAccount;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'OK'")
    public WebElement MobileDeleteOkPopupSuccessAccount;
    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Add Mobile Number'")
    public WebElement AddMobileNumberTitleEditAccount;
    @AndroidFindBy(id = "mobile_header_desc_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'Please provide your'")
    public WebElement AddMobileNumberSubtitleAccount;
    @AndroidFindBy(id = "mobile_EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField")
    public WebElement MobileTextBoxAddMobileAccount;
    @AndroidFindBy(id = "mobile_EditText")
    @iOSXCUITFindBy(id = "mobile_EditText")
    public static List<WebElement> MobileTextBoxAddMobileAccountList;
    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Cancel'")
    public WebElement CancelButtonAddMobileNumberAccount;
    @AndroidFindBy(id = "mobile_done_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton/XCUIElementTypeStaticText")
    public WebElement DoneButtonAddMobileNumberAccount;
    @AndroidFindBy(id = "account_mobile_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[4]")
    public WebElement MobileNumberEditAccountWithButton;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'We have resent'")
    public WebElement MailResentSubtitle;
    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Before logging into'")
    public WebElement MailResentSubtitle1;
    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'OK'")
    public WebElement OkButtonMailSentPopup;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Resend Email'")
    public WebElement ResendMailButtonMailSentPopup;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Mobile number added successfully'")
    public WebElement MobileNumberAddedSuccessfullyPopup;
    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'It seems you have'")
    public WebElement ReinstalledAppPopupContent;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'It seems you have'")
    public WebElement Mobileok;
    @AndroidFindBy(id = "mobile_value")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name BEGINSWITH '+44'")
    public WebElement Mobilenumberverifies;
    @AndroidFindBy(id = "account_mobile_edit")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[4]")
    public WebElement EditMobilenumber;
    @AndroidFindBy(id = "delete_mobile_number")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Delete Mobile Number'")
    public WebElement DeleteMobilenumber;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Are you sure you want to delete'")
    public WebElement MobileNumberDeletePopupContent;
    @AndroidFindBy(xpath = "//androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Delete'")
    public WebElement DeleteMobileButtonPopup;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Mobile number deleted successfully.'")
    public WebElement DeleteMobileSuccessPopup;
//    @AndroidFindBy(id = "alertTitle")
//	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Login Notification'")
//	public static WebElement Alertitle;
    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Continue'")
	public static WebElement MobileNumberaddedContiuebutton;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[5]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public WebElement add_Moble_Num_Btn;
    @AndroidFindBy(id = "header_back_image_btn")
    @iOSXCUITFindBy(id = "header_back_image_btn")
    public WebElement Reg_Back;
    @AndroidFindBy(id = "header_back_btn")
    @iOSXCUITFindBy(id = "header_back_btn")
    public WebElement ProfileCompletion_Back;
    @AndroidFindBy(id = "privacy_policy_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeLink' AND name BEGINSWITH 'Privacy'")
	public WebElement PrivacyPolicyLink;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Terms and Conditions.')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeLink' AND name BEGINSWITH 'Terms and Conditions.'")
	public WebElement TermsAConditionLink;
    @AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeLink' AND name BEGINSWITH 'Terms and Conditions.'")
	public WebElement Emailcheckbox;
    @AndroidFindBy(id = "preauth_amount")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeLink' AND name BEGINSWITH 'Terms and Conditions.'")
	public WebElement Preauthamt;
    @AndroidFindBy(id="header_txt")
	@iOSXCUITFindBy(id = "Done")
	public WebElement mfpop;
    @AndroidFindBy(id="selected_amount")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	public WebElement MaximumFueling;
    @AndroidFindBy(id="defaultpicket_cancel_btn")
	@iOSXCUITFindBy(id = "Cancel")
	public WebElement cancelpop;
    @AndroidFindBy(xpath="(//android.widget.ImageView[@content-desc=\"Complete your profile\"])[6]")
	@iOSXCUITFindBy(id = "OK")
	public WebElement tickmark;
    @AndroidFindBy(id = "mobile_header_desc_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'Please update your'")
    public WebElement EditMobileNumberSubtitleAccount;
    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Edit Mobile Number'")
    public WebElement EditMobileNumberTitleEditAccount;
    @AndroidFindBy(id ="android:id/button1")
    @iOSXCUITFindBy(id = "OK")
    public WebElement OkButton;
    @AndroidFindBy(id ="android:id/message")
    @iOSXCUITFindBy(id = "Mobile number updated successfully")
    public WebElement MobileNumberUpdatedPopup;
    @AndroidFindBy(xpath = "//androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Cancel\"])[2]")
    public WebElement CancelMobileButtonPopup;
    @AndroidFindBy(id = "mobile_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Please enter a mobile number'")
    public WebElement InlineErrorNoNumberMobileRegistration;
    @AndroidFindBy(id = "mobile_header_desc_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Mobile number added'")
    public WebElement MobileNumberAddedScreenTitle;
    @AndroidFindBy(id = "mobile_header_desc_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'The Esso App will'")
    public WebElement MobileNumberAddedScreenSubtitle;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Skip'")
    public WebElement SkipButtonMfa;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'back Icon'")
    public WebElement BackButtonCompleteYourProfile;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(id = "titleLabel")
    public WebElement MfaPickerTitle;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.RelativeLayout")
    @iOSXCUITFindBy(id = "Loyalty Points")
    public WebElement    LoyaltyPointsFaq;
    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'list_item_text_view')])[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"3\"]")
    public WebElement NectarPintsFaq;
    @AndroidFindBy(id ="FAQs")
    @iOSXCUITFindBy(id = "FAQs")
    public WebElement FaqLinkLoyaltyPointsFaqs;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"URL\"]"),
            @iOSXCUITBy(id = "TabBarItemTitle")})
    public WebElement EssoBrowserLink;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"URL\"]")
    public WebElement UrlFaqLinkHelp;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'Don't have Nectar card'")
    public WebElement NectarCardSignUpCtOffers;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'After adding your card'")
    public WebElement AfterAddingYourCtOffers;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextView' and name BEGINSWITH 'Add your Nectar card to'")
    public WebElement AddYourNectarCardCtOffers;
    @AndroidFindBy(id = "com.firstdata.mpl.qa:id/dont_have_nector_card")
    @iOSXCUITFindBy(id = "Sign Up")
    public WebElement SignUpLinkOffers;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"URL\"]"),
            @iOSXCUITBy(id = "TabBarItemTitle")})
    public WebElement SignUpLinkBrowser;
    @AndroidFindBy(id = "locator needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"URL\"]")
    public WebElement NectarSignUpFaqLinkOffers;
    @AndroidFindBy(id = "com.android.chrome:id/url_bar")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"URL\"]"),
            @iOSXCUITBy(id = "TabBarItemTitle")})
    public WebElement PpLinkRegistrationUrl;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"URL\"]")
    public WebElement PpLinkRegistrationUrlLink;
    @AndroidFindBy(id = "firstname_validation_txt")
    @iOSXCUITFindBy(id = "firstname_validation_txt")
    public List<WebElement> InlineErrorEmptyFirstName1;
    @AndroidFindBy(id = "lastName_validation_txt")
    @iOSXCUITFindBy(id = "lastName_validation_txt")
    public List<WebElement> InlineErrorEmptyLastName1;
    @AndroidFindBy(id = "confirm_password_validation_txt")
    @iOSXCUITFindBy(id = "confirm_pwd_validation_txt")
    public List<WebElement> InlineErrorEmptyConfirmPassword1;
    @AndroidFindBy(id = "mobile_validation_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Please enter a valid mobile number'")
    public static List<WebElement> InlineErrorMessageMobileRegistration1;
    @AndroidFindBy(id = "//androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    @iOSXCUITFindBy(id = "OK")
    public static WebElement MultipleRegistrationOK;
    @AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
    public static WebElement SavePasswordPopupAndroid1;
    @iOSXCUITFindBy(id = "Accept all cookies")
    public WebElement AcceptCookies;
//    @AndroidFindBy(id = "Not Needed")
//    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Done'")
//    public WebElement DoneButtonKeypad1;
//    @AndroidFindBy(id = "paypal_get_started")
//    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'We have resent'")
//    public WebElement MailResentSubtitle2;

    @AndroidFindBy(id = "com.sec.android.app.sbrowser:id/location_bar_edit_text")
    public WebElement browserAddressBar;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
    @AndroidFindBy(xpath = "//*[contains(@text,'Confirm Password')]")
    public WebElement confirmPWDRegisterTxtBox;

    @iOSXCUITFindBy(id = "start_label_title")
    @AndroidFindBy(xpath = "//*[contains(@text,'CLICK HERE TO FUEL')]")
    public WebElement StartButtonCt;

    @AndroidFindBy(xpath = "//label//following-sibling::input[contains(@id,'email')]")
    public WebElement userName;

    @AndroidFindBy(xpath = "//label//following-sibling::input[contains(@id,'password')]")
    public WebElement password;

    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextField' and value BEGINSWITH 'Mobile number'")
    @AndroidFindBy(id = "mobile_EditText")
    public List<WebElement> mobileNumberFieldRegistration;

    @iOSXCUITFindBy(id = "sign_up_btn")
    @AndroidFindBy(id = "sign_up_btn")
    public WebElement SignUpLinkLoginScreen;

    @iOSXCUITFindBy(id = "forgot_pwd_tv")
    @AndroidFindBy(id = "forgot_pwd_tv")
    public WebElement ForgotPasswordLinkLoginScreen;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot Password\"]")
    @AndroidFindBy(id = "header_station_name_text")
    public WebElement ForgotPasswordScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Get exclusive offers\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Get exclusive offers\"]")
    public WebElement get_offers;

    @AndroidFindBy(id = "txtregi_redeem")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add your Nectar card to\"]")
    public WebElement add_nectar_card_to;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Collect points\"]")
    public WebElement collection_points_header;

    @AndroidFindBy(id = "list_item_text_child")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Collect Nectar points for your fuel or shop purchase at participating Esso stations. \"]")
    public WebElement collection_points_message;

    @AndroidFindBy(id = "list_item_earning_points")
    @iOSXCUITFindBy(id = "More about collecting points")
    public WebElement more_about_collecting_point_link;

    @AndroidFindBy(id = "pay_with_points")
    @iOSXCUITFindBy(id = "Rewards")
    public WebElement rewards_header;

    @AndroidFindBy(id = "sub_txt")
    @iOSXCUITFindBy(id = "Enjoy the benefits of Esso Nectar offers exclusive for you when you purchase at Esso.")
    public WebElement rewards_text;

    @AndroidFindBy(id = "login_dc_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
    public WebElement add_nectar_card;

    @AndroidFindBy(id = "continue_btn")
    @iOSXCUITFindBy(id = "continue_btn")
    public WebElement RegstrContinue;

    @AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Not Now'")
    public WebElement LoginSave;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Login Notification'")
    public WebElement Alertitle;

    @AndroidFindBy(id = "account_user_profile_title")
    @iOSXCUITFindBy(id = "account_user_profile_title")
    public WebElement UserProfileAccount;

    @AndroidFindBy(id = "firstName_EditText")
    @iOSXCUITFindBy(id = "firstName_EditText")
    public WebElement RegstrFirstName;

    @AndroidFindBy(id = "lastName_EditText")
    @iOSXCUITFindBy(id = "lastName_EditText")
    public WebElement RegstrLastName;

    @AndroidFindBy(id = "password_EditText")
    @iOSXCUITFindBy(id = "pwd_EditText")
    public WebElement RegstrPass;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Register']")
    public WebElement register_title;
}
