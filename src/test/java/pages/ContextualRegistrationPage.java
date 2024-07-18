package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class ContextualRegistrationPage extends GenericWrappers {

	public ContextualRegistrationPage() {

		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please wait...']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Indeterminate progress\"]")
	public static WebElement Loader;
	
	@AndroidFindBy(id = "dashboard_register_btn")
	@iOSXCUITFindBy(id = "dashboard_register_btn")
	public WebElement DashRegstr;
	
	@AndroidFindBy(id = "fl_progress_lyt")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public WebElement PrfcmpltLID;
	
	@AndroidFindBy(id = "dashboard_nectar_balance")
	@iOSXCUITFindBy(id = "LocatorNeed")
	public WebElement LIDNectar;
	
	@AndroidFindBy(id = "header_desc_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextView[@name=\"To keep your payment information secure we need a few details. \"]")
	public WebElement RegstrTtl;
	
	@AndroidFindBy(id = "firstName_EditText")
	@iOSXCUITFindBy(id = "firstName_EditText")
	public static WebElement RegstrFirstName;
	
	@AndroidFindBy(id = "lastName_EditText")
	@iOSXCUITFindBy(id = "lastName_EditText")
	public static WebElement RegstrLastName;
	
	@AndroidFindBy(id = "email_EditText")
	@iOSXCUITFindBy(id = "email_EditText")
	public static WebElement RegstrEmail;
	
	@AndroidFindBy(id = "password_EditText")
	@iOSXCUITFindBy(id = "pwd_EditText")
	public static WebElement RegstrPass;
	
	@AndroidFindBy(id = "confirm_password_EditText")
	@iOSXCUITFindBy(id = "confirm_pwd_EditText")
	public static WebElement RegstrConfPass;
	
	@AndroidFindBy(id = "mobile_EditText")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextField' and value BEGINSWITH 'Mobile number'")
	public static WebElement RegstrMobile;
	
	@AndroidFindBy(id = "terms_conditions_checkBox")
	@iOSXCUITFindBy(id = "terms_conditions_checkBox")
	public static WebElement RegstrTermsCkbx;

	@AndroidFindBy(id = "newsletter_checkBox")
	@iOSXCUITFindBy(id = "newsletter_checkBox")
	public static WebElement MailsCheckboxRegisterNoBiometrics;

	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(id = "continue_btn")
	public static WebElement RegstrContinue;
	
	@AndroidFindBy(id = "confirm_email_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Confirm your '")
	public WebElement CntxtRegTtl;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Registration']")
	public static WebElement Contextual_register_title;

	@AndroidFindBy(id = "confirm_email_subtitle")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'We have sent you'")
	public WebElement CntxtRegSubTtl;
	
//	@AndroidFindBy(id = "confirm_email_image_icon")
//	@iOSXCUITFindBy(id = "confirm_email")
//	public WebElement CntxtRegIcon;
	
	@AndroidFindBy(id = "confirm_email_subtitle2")
	@iOSXCUITFindBy(id = "confirm_email_subtitle2")
	public WebElement CntxtRegResendEmailLink;

//	@AndroidFindBy(id = "confirm_email_subtitle2")
//	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Resend Email'")
//	public WebElement CntxtRegResendEmailLink1;
	
	@AndroidFindBy(id = "confirm_email_btn_inbox")
	@iOSXCUITFindBy(id = "confirm_email_btn_inbox")
	public WebElement CntxtRegOpenInbox;
	
	@AndroidFindAll({@AndroidBy(id = "android:id/sem_title_default"),
			@AndroidBy(id = "android:id/title")})
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Cancel'")
	public WebElement CntxtRegAPP;

	@AndroidFindAll({@AndroidBy(id = "accept_btn"),
			@AndroidBy(xpath = "//android.widget.TextView[@text='ACCEPT']")})
	@iOSXCUITFindBy(id = "LocatorNeed")
	public WebElement ReviewAccept;

//	@AndroidFindBy(id = "tutorial_page_title")
//	@iOSXCUITFindBy(id = "tutorial_page_title")
//	public WebElement WelcomTtl;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Allow']")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(id = "OK"),
			@iOSXCUITBy(id = "button1")})
	public WebElement CameraAccessOkPopup;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Close Icon")
	public WebElement CloseButtonModalPopupLid1;

	@AndroidFindBy(id = "no need")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(id = "OK"),
			@iOSXCUITBy(id = "button1")})
	public WebElement FaceIdAccessOkPopup;

	@AndroidFindBy(id = "button_accept_all")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Accept All\"]")
	public WebElement acceptAllButtonAppLaunch;

	@AndroidFindBy(id = "tutorial_page_title")
	@iOSXCUITFindBy(id = "tutorial_page_title")
	public WebElement WelcomTtl;

	@AndroidFindBy(id = "button_accept_all")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Accept All'")
	public static WebElement AcceptAll;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"We've sent you an email to verify your identity. Please click on the link in the email to finish your registration.\"]")
	public WebElement PopUpMessage;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "We've sent you an email to verify your identity. Please click on the link in the email to finish your registration.")
	public WebElement PopUpMessage1;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(id = "OK"),
			@iOSXCUITBy(id = "button1")})
	public WebElement PopUpOK;
	
	@AndroidFindBy(id = "alertTitle")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Are you sure you'")
	public WebElement MessageTTL;
	
	/*
	 * Same for Verify later in verify nectar
	 */
	@AndroidFindBy(id="android:id/button2")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Skip Anyway'"),
			@iOSXCUITBy(id = "button1")})
	public WebElement SkipAnyway;
	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Verify Email'"),
			@iOSXCUITBy(id = "button2")})
	public WebElement VerifyEmail;
	
	@AndroidFindBy(id = "circular_progress_lid")
	@iOSXCUITFindBy(id = "start_button")
	public static WebElement LID;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'You can verify your'")
	public WebElement PopUpMessageContextual;

	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Touch ID'")
	public WebElement TouchIdContent;

	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Face ID'")
	public WebElement FaceIdContent;

//	@AndroidFindBy(id="btnClose']")
//	@iOSXCUITFindBy(xpath= "//XCUIElementTypeStaticText[@name='Payment method: Paypal']")
//	public WebElement Nectarpop;

	@AndroidFindBy(id = "neutral_func_btn")
	@iOSXCUITFindBy(id = "Skip")
	public WebElement WhatsNewSkip;

	@AndroidFindAll({
			@AndroidBy(xpath="//android.widget.TextView[@text='More']"),
			@AndroidBy(id = "action_more"),
	        @AndroidBy(id ="(//android.widget.ImageView[@resource-id=\"com.firstdata.mpl.qa:id/navigation_bar_item_icon_view\"])[5]")})
	@iOSXCUITFindBy(id = "More")
	public WebElement AccountMore;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account']")
	@iOSXCUITFindBy(id = "account_text")
	public WebElement AccountBtn;

	@AndroidFindBy(id = "description1")
	@iOSXCUITFindBy(id = "What’s New")
	public WebElement WhatsNew;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(id = "header_right_txt")
	public WebElement AccountSkip;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Not Now'")
	public static WebElement LoginSave;

	@AndroidFindBy(id = "account_logout")
	@iOSXCUITFindBy(id = "account_logout")
	public static WebElement LogOut;

	@AndroidFindBy(id = "current_password_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public static WebElement CurrentPassword;

	@AndroidFindBy(id = "NEEDED")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not Now\"]")
	public WebElement InAppRatingPopupNotNow;

	@AndroidFindBy(id = "android:id/button2")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(id = "OK"),
			@iOSXCUITBy(id = "button1")})
	public static WebElement LidOkButtonCardExpiry;

	@AndroidFindBy(id = "alertTitle")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Your card number ending'")
	public WebElement LidTitleCardExpiry;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Start']")
	@iOSXCUITFindBy(id = "start_button")
	public static WebElement payButton1;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Close Icon")
	public WebElement CloseButtonModalPopupLid;

	@AndroidFindBy(id = "account_password_edit")
	@iOSXCUITFindBy(id = "account_pwd_edit")
	public WebElement PasswordEdit;

	@AndroidFindBy(id = "com.google.android.gms:id/cancel")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NONE OF THE ABOVE\"]")
	public WebElement NONEOFTHEABOVE;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Register']")
	public WebElement register_title;

	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(xpath = "//XCUIElementTypeWindow[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]"),
			@iOSXCUITBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and value == 'Done'")})
	public WebElement HideKeyPadMobileRegistration;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(id= "scan_clubcard_text")
	public WebElement FirstFuelheader;

	@AndroidFindBy(id="Locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Logout\"]")
	public WebElement PinLogoutButton;

	@AndroidFindBy(id = "security_pin_entry_code1")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	public WebElement PinCode_1;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(id = "OK"),
			@iOSXCUITBy(id = "button1")})
	public WebElement okBtn;

	@AndroidFindBy(id = "security_pin_entry_title")
	@iOSXCUITFindBy(xpath = "//*[contains(@name,'Esso PIN')]")
	public WebElement SetUpPinTextRegistration;
}
