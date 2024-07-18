package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class AccountPage extends GenericWrappers {
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Settings\"])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public WebElement Mobilesetting;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Help']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public WebElement Apps;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso_QA']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public WebElement EssoQA;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Permissions']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public WebElement Permissions;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='OFF']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public WebElement Cameraon;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
	public static WebElement AccountSkip;

	@AndroidFindBy(id = "alertTitle")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Login Notification'")
	public WebElement Alertitle;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[1][@text='Notifications']")
	public WebElement SettingNotify;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch")
	public WebElement SettingNotifyOff;

	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
	public static WebElement ContinueBtn;

	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Don’t Allow']")
	public WebElement DontAllow;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Cancel'])[1]")
	public WebElement DisabledCancel;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Allow']")
	public static WebElement AllowPopup;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(id = "OK"),
			@iOSXCUITBy(id = "button1")})
	public static WebElement okBtn;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Allow']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Message\"]")
	public WebElement CardMessagePopupLid;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Allow']")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(id = "OK"),
			@iOSXCUITBy(id = "button1")})
	public WebElement CardMessagePopupLidOk;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Face ID\"]")
	@AndroidFindBy(id = "needed")
	public WebElement FaceIdScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Touch ID\"]")
	@AndroidFindBy(id = "needed")
	public WebElement TouchIdScreen;

	@iOSXCUITFindBy(id = "Skip")
	@AndroidFindBy(id = "needed")
	public WebElement BiometricsIdSkip;

	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Planned Maintenance\"]")
	public WebElement PlannedMaintenance;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
	@iOSXCUITFindBy(id = "needed")
	public WebElement AllowNotificationContinue;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Allow']")
	@iOSXCUITFindBy(id = "needed")
	public WebElement AllowNotificationAllow;

	@AndroidFindBy(id = "dismiss_button")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Sorry'")
	public WebElement PlannedMaintenanceTxt;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]")
	public static WebElement Allow;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Got It'")
	public WebElement EmailInfoX;

	@iOSXCUITFindBy(id = "account_receipt_checkBox")
	@AndroidFindBy(id = "account_receipt_checkBox")
	public WebElement ReceiptCKbx;

	@iOSXCUITFindBy(iOSNsPredicate = "name=='account_receipt_checkBox' and name BEGINSWITH 'Login'")
	public WebElement ReceiptUnCircleCheck_box;

	@iOSXCUITFindBy(iOSNsPredicate = "name =='account_receipt_checkBox' and name BEGINSWITH 'Login'")
	public WebElement ReceiptCircleCheck_box;

	@iOSXCUITFindBy(iOSNsPredicate = "name=='account_news_checkBox' and name BEGINSWITH 'Login'")
	public WebElement promotionsUnCircleCheck_box;

	@iOSXCUITFindBy(iOSNsPredicate = "name=='account_news_checkBox' and name BEGINSWITH 'Login'")
	public WebElement promotionsCircleCheck_box;

	@AndroidFindBy(xpath = "//*[contains(@text,'Login')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Login'")
	public static WebElement AccountLogin;

	@AndroidFindBy(id = "login_email_editText")
	@iOSXCUITFindBy(id = "login_email_editText")
	public static WebElement AccountEmail;

	@AndroidFindBy(id = "lid_profile_variation_text")
	@iOSXCUITFindBy(id = "Add Nectar card & never miss out on points again")
	public WebElement AddNectarLink;

	@AndroidFindBy(id = "login_passWord_editText")
	@iOSXCUITFindBy(id = "login_passWord_editText")
	public static WebElement AccountPassword;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND value== 'Your email or password was incorrect. Please try again.'")
	public WebElement invalid_unpwd_popup;

	@AndroidFindBy(id = "lid_profile_variation_text")
	@iOSXCUITFindBy(id = "Tell us how often you'd like to hear from us")
	public static WebElement PreferencesLink;

	@AndroidFindBy(id = "action_more")
	@iOSXCUITFindBy(id = "More")
	public static WebElement AccountMore;

	@AndroidFindBy(id = "com.google.android.gms:id/cancel")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NONE OF THE ABOVE\"]")
	public static WebElement NONEOFTHEABOVE;

	@AndroidFindBy(id = "login_Btn")
	@iOSXCUITFindBy(id = "login_Btn")
	public static WebElement AccountLoginBtn;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_reject")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name BEGINSWITH 'Login'")
	public WebElement LoginNever;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Not Now'")
	public static WebElement LoginSave;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Products & Information']")
	@iOSXCUITFindBy(id = "products_and_information_text")
	public static WebElement ProductsAndInformation;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(id= "scan_clubcard_text")
	public static WebElement FirstFuelheader;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Register']")
	public static WebElement register_title;

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.TextView[@text='Account']"),
			@AndroidBy(xpath = "//*[@text='Account']")})
	@iOSXCUITFindBy(id = "account_text")
	public static WebElement AccountBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tell a Friend']")
	@iOSXCUITFindBy(id = "tell_a_friend_text")
	public WebElement ReferAfriend;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	@iOSXCUITFindBy(id = "settings_text")
	public WebElement SettingsBtnMore;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Support Centre']")
	@iOSXCUITFindBy(id = "support_centre_text")
	public WebElement SupportCentre;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share Logs']")
	@iOSXCUITFindBy(id = "shareLogsEnabled")
	public WebElement ShareLog;

	@AndroidFindBy(id = "forgot_password_email_edit")
	@iOSXCUITFindBy(id = "Account")
	public WebElement Forgetmail;

	@AndroidFindBy(id = "forgot_password_email_edit")
	@iOSXCUITFindBy(id = "Account")
	public WebElement Resetmsg;

	@AndroidFindBy(id = "forgot_password_continue_btn")
	@iOSXCUITFindBy(id = "Account")
	public WebElement send;
//
//	@iOSXCUITFindBy(id = "Fuel")
//	public WebElement FuelScr;
//
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='start']")
//	public WebElement Start;
//
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SCAN QR CODE']")
//	public WebElement ScanQRCode;

	@AndroidFindBy(id = "preauth_info_icon")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='acc info icon'])[2]")
	public WebElement AccountInfoIcon;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert//XCUIElementTypeStaticText~xpath")
	public static WebElement AccountMessage;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(id = "OK"),
			@iOSXCUITBy(id = "button1")})
	public static WebElement AccountOkBtn;

	@AndroidFindBy(id = "account_privacy_link")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Privacy Policy'"),
			@iOSXCUITBy(id = "//XCUIElementTypeStaticText[@name=\"Privacy Policy\"]")})
	public WebElement AccountPrivacyPolicy;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Privacy Policy'")
	public WebElement HeadTxt;

	@AndroidFindBy(id = "header_left_txt")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"Cancel and return to ESSO\"]")
	public static WebElement PrivacyCloseBtn;

	@AndroidFindBy(id = "toolbar")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Privacy Policy']")
	public WebElement PrivacyPolicyElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Terms and Conditions']")
	public static WebElement TermsAndConditionElement;

//	@AndroidFindBy(id = "account_terms_link")
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Terms and Conditions\"))")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Terms and'")
	public static WebElement TermsACondition;

	@AndroidFindBy(id = "account_logout")
	@iOSXCUITFindBy(id = "account_logout")
	public static WebElement LogOut;

//	@AndroidFindBy(id = "dashboard_greeting_msg")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'**@')]")
//	//XCUIElementTypeStaticText[@name="e****@gmail.com"]
//	public WebElement LogOutPage;

	@AndroidFindBy(id = "account_name_edit")
	@iOSXCUITFindBy(id = "account_name_edit")
	public WebElement UserEdit;

	@AndroidFindBy(id = "editFirstName")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]")
	public WebElement EditFname;

	@AndroidFindBy(id = "lastName_EditText")
	@iOSXCUITFindBy(id = "lastName_EditText")
	public WebElement EditLname;

	@AndroidFindBy(id = "edit_btn")
	@iOSXCUITFindBy(id = "edit_btn")
	public WebElement EditUpdate;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'OK'"),
			@iOSXCUITBy(id = "button1")})
	public WebElement EditOK;

	@AndroidFindBy(id = "account_user_fullname")
	@iOSXCUITFindBy(id = "account_user_fullname")
	public WebElement AccountFullName;

	@AndroidFindBy(id = "account_info_icon")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Edit'])[1]")
	public WebElement EmailInfoIcon;

	@AndroidFindBy(id = "account_info_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]")
	public WebElement EmailInfo;

	@iOSXCUITFindBy(id = "Changes saved. You will now receive emails from Esso about topics that may interest you, promotions and Nectar offers.")
	public WebElement Promotion_OPT_IN_POpup;

	@iOSXCUITFindBy(id = "Changes saved. You will no longer receive emails from Esso about topics that may interest you, promotions and Nectar offers.")
	public WebElement Promotion_OPT_OUT_POpup;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Changes saved. You will now receive receipts via email.']")
	public WebElement mailOPTPopUP;

	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Changes saved.'")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Changes saved. You will no longer ')]")
	public WebElement mailOPTOUTPopUP;

	@AndroidFindBy(id = "account_password_edit")
	@iOSXCUITFindBy(id = "account_pwd_edit")
	public static WebElement PasswordEdit;

	@iOSXCUITFindBy(id = "Done")
	public WebElement KayDone;

	@AndroidFindBy(id = "edit_password__done_btn")
	@iOSXCUITFindBy(id = "edit_pwd_done_btn")
	public WebElement PassWordDone;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Password should contain at least 10 characters')]")
	public WebElement Accountct;

	@AndroidFindBy(id = "current_password_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public static WebElement CurrentPassword;

	@AndroidFindBy(id = "new_password_EditText")
	@iOSXCUITFindBy(id = "new_pwd_EditText")
	public static WebElement NewPassword;

	@AndroidFindBy(id = "confirm_new_pasword_et")
	@iOSXCUITFindBy(id = "confirm_new_pwd_et")
	public static WebElement ConfirmPassword;

	@AndroidFindBy(id = "current_password_validation_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter current password']")
	public WebElement IncorrectPassErrorMessage;
	public WebElement StarRewards;

	@AndroidFindBy(id = "account_preauth_edit")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Maximum Fuelling Amount']/preceding:: XCUIElementTypeButton[@name='Edit'][1]")
	public static WebElement MaxFuelEditLk;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc='test_number_picker_view']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Privacy Policy']")
	public WebElement MaxFuelAmt;

	@AndroidFindBy(id = "defaultpicket_ok_btn")
	@iOSXCUITFindBy(id = "Done")
	public static WebElement MaxFuelOK;

	@AndroidFindBy(id = "defaultpicket_cancel_btn")
	@iOSXCUITFindBy(id = "Cancel")
	public WebElement MaxFuelCncl;

	@AndroidFindBy(id = "preauth_amount")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Maximum Fuelling Amount']")
	public WebElement MaxFuelAmtCk;

	@AndroidFindBy(id = "preauth_info_icon")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='acc info icon'])[2]")
	public WebElement MaxFuelInfo;

	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther)[1]")
	public WebElement MaxFuelInfoTxt;

	@AndroidFindBy(id = "location_service_option")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther)[1]")
	public WebElement LocSrcSwitch;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther)[1]")
	public WebElement LocAllow;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Your password has been'")
	public WebElement LocCpyTXT;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther)[1]")
	public WebElement LocDeny;

	@AndroidFindBy(id = "camera_access_option")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther)[1]")
	public WebElement CamSwitch;

	@AndroidFindBy(id = "validations_tick1_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]")
	public WebElement PassValidationTick1;

	@AndroidFindBy(id = "validations_tick2_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]")
	public WebElement PassValidationTick2;

	@AndroidFindBy(id = "validations_tick3_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[3]")
	public WebElement PassValidationTick3;

	@AndroidFindBy(id = "validations1")
	@iOSXCUITFindBy(id = "At least 10 characters")
	public WebElement PassValidation1;

	@AndroidFindBy(id = "validations2")
	@iOSXCUITFindBy(id = "Contains upper and lower case")
	public WebElement PassValidation2;

	@AndroidFindBy(id = "validations3")
	@iOSXCUITFindBy(id = "Contains numbers or special character")
	public WebElement PassValidation3;

	@AndroidFindBy(id = "selected_card_tickmark")
	public WebElement CardTick;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='ADD PAYMENT METHOD']")
	public WebElement PaymentMtdBtn;

	@AndroidFindBy(id = "payment_paypal_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Add PayPal'")
	public WebElement PaypalBtn;

	@AndroidFindBy(id = "AcctEmail")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	public WebElement AcctEmail;

//	@AndroidFindBy(id = "account_info_layout")
//	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Edit'])[1]")
//	public WebElement AcctLayOut;

	@AndroidFindBy(id = "account_camera_access_title")
	public WebElement AcctCam;

	@AndroidFindBy(id = "crind_receipt_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'No Paper'")
	public WebElement AcctRecipt;

	@AndroidFindBy(id = "account_receipt_msg")
	@iOSXCUITFindBy(xpath = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'I would like to receive receipts '")
	public WebElement AcctRctMsg;

	@AndroidFindBy(id = "account_news_checkBox")
	@iOSXCUITFindBy(id = "account_news_checkBox")
	public WebElement OfferCheck;

	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Location Services']")
	public WebElement LocationServicesAcc;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Settings'")
	public WebElement NotifGoToSettings;

	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Notifications']")
	public WebElement NotificationScroll;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Notifications']")
	@iOSXCUITFindBy(xpath = "Locater need")
	public WebElement NotificationStatus;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	@iOSXCUITFindBy(xpath = "Locater need")
	public WebElement Devicebackbutton;
	
	@AndroidFindBy(id = "account_notification_service_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Push Notifications'")
	public static WebElement NotificationsTitleAccount;

	@AndroidFindBy(id = "location_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Location Services']/following::XCUIElementTypeStaticText[@name='OFF'][1]")
	public WebElement LocationOFF;

	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='ALLOW ESSO-QA TO ACCESS']")
	public WebElement PermissionScrn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='App notifications']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Notifications')]")
	public static WebElement NotificationSettin;

	@AndroidFindBy(id = "com.android.settings:id/switch_widget")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@name='Allow Notifications']")
	public static WebElement NotifAllow;

	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Esso-QA']")
	public WebElement GoSettings;

	@AndroidFindBy(id = "ss")
	@iOSXCUITFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Offers\"]")
	public WebElement StationFinder;

	@AndroidFindBy(id = "header_left_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CANCEL']")
	public WebElement CancelBtn;

	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='NavBack']")
	public WebElement NavBck;

	@AndroidFindBy(id = "camera_access_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Camera Access']/following::XCUIElementTypeStaticText[@name='ON'][1]")
	public WebElement CameraON;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Camera Access']/following::XCUIElementTypeButton[@name='Go To Settings'][1]")
	public WebElement CameraGotoSettings;
    
	@AndroidFindBy(id = "camera_access_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSwitch[@name='Camera']")
	public WebElement CameraAccess;

	@AndroidFindBy(id = "account_info_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='User Profile']/following::XCUIElementTypeButton[@name='acc info icon'][1]")
	public WebElement UserProfileLink;

	@AndroidFindBy(id = "account_user_profile_title")
	@iOSXCUITFindBy(id = "account_user_profile_title")
	public WebElement UserProfileAccount;

	@AndroidFindBy(id = "account_add_nectarcard")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
	public WebElement add_nectar_Account;
	@AndroidFindBy(id = "account_user_email")
	@iOSXCUITFindBy(id = "account_user_email")
	public WebElement EmailField;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'This email is used to set')]")
	public WebElement EmailCT;


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Edit Password']")
	public WebElement EdtPasswordScr;

	@AndroidFindBy(id = "current_password_showHide_btn")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Info'])[1]")
	public WebElement currentPwdShw;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Cancel']")
	@AndroidFindBy(id = "header_left_txt")
	public WebElement PwdCancelBtn;

	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Account']")
	public WebElement AccountScrn;

	@AndroidFindBy(id = "notification_service_option")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='Info'])[1]/ancestor::XCUIElementTypeTextField[1]")
	public WebElement Currpassshwfield;

	@AndroidFindBy(id = "validations_tick1_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='At least 10 characters']/following::XCUIElementTypeImage[1]")
	public WebElement Tick1;

	@AndroidFindBy(id = "validations_tick2_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Contains upper and lower case']/following::XCUIElementTypeImage[1]")
	public WebElement Tick2;

	@AndroidFindBy(id = "validations_tick3_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Contains numbers or special character']/following::XCUIElementTypeImage[1]")
	public WebElement Tick3;

	@AndroidFindBy(id = "com.android.settings:id/app_snippet")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Contains numbers or special character']/following::XCUIElementTypeImage[1]")
	public WebElement AppInfo;

	@AndroidFindBy(id = "confirm_password_validation_txt")
	@iOSXCUITFindBy(id = "confirm_pwd_validation_txt")
	public WebElement DiffPwdCT;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Current password entered is incorrect')]")
	public WebElement CurrPassInvldMsg;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Due to security reasons')]")
	public WebElement CurrPassInvldMsg2;

	@AndroidFindBy(id = "current_password_validation_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter current password']")
	public WebElement CurrPassEmptyMsg;

	@AndroidFindBy(id = "password_validation_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter new password']")
	public WebElement NewPassEmptyMsg;

	@iOSXCUITFindBy(id = "Full name successfully updated.")
	public WebElement NameEditSuccessMsg;

	@AndroidFindBy(id = "account_user_fullname")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Full name']/following::XCUIElementTypeStaticText[1]")
	public WebElement FullName;

	@AndroidFindBy(id = "location_service_option")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Location Services']/following::XCUIElementTypeButton[@name='Go To Settings'][1]")
	public WebElement LocGoToSettings;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'Location')]")
	public WebElement LocSettings;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[contains(@name,'While')]")
	public WebElement LocSettingsAlways;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Esso-QA']")
	public WebElement SettingsBack;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'While')]")
	public WebElement LocSettingsAlwaysEnabled;

	@AndroidFindBy(id = "preauth_info_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Maximum Fuelling Amount']/following::XCUIElementTypeButton[@name='acc info icon'][1]")
	public WebElement FuelingInfo;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'This is the amount')]")
	public WebElement FuelingInfoTxt;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"There are now over 1,000 First Fuel sites in the US selling high quality First Fuel fuels. We offer products and services for both business and consumer use.\"]")
	public WebElement Product;

	@AndroidFindBy(id = "account_nectar_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Push Notifications'")
	public static WebElement AccountNectarCardSection;

	@AndroidFindBy(id = "account_nectar_edit")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Delete'"),
			@iOSXCUITBy(id = "account_nectar_edit")})
	public static WebElement AccountNectarCardAdded;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Delete'"),
			@iOSXCUITBy(id = "button1")})
	public static WebElement AccountDeleteNectarPopupButton;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Are you sure'")
	public static WebElement AccountDeleteNectarPopupMessage;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Nectar card deleted'")
	public static WebElement AccountDeleteNectarSuccessPopupMessage;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'OK'"),
			@iOSXCUITBy(id = "button1")})
	public static WebElement NectarDeleteSuccessfulPopupOK;

	@AndroidFindBy(id = "account_add_nectarcard")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
	public static WebElement AccountAddNectarCardButton;

	@AndroidFindBy(id = "add_loyalty_entry_edit")
	@iOSXCUITFindBy(id = "add_loyalty_entry_edit")
	public static WebElement NectarCardnumberEnter;

	@AndroidFindBy(id = "account_privacy_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Done'")
	public static WebElement DoneButtonInNectarKeypad;

	@AndroidFindBy(id = "add_loyalty_done_btn")
	@iOSXCUITFindBy(id = "add_loyalty_done_btn")
	public static WebElement NextButtonNectarCardAddScreen;

	@AndroidFindBy(xpath = "//*[contains(@text,'Verify later')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Verify later'")
	public static WebElement AccountNectarCardVerifyLaterPopup;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Skip'")
	public static WebElement AccountNectarVerifyLaterSkip;

	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and value == 'Done'")
	public WebElement HideKeyPadMobileRegistration;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Close Icon")
	public WebElement CloseButtonModalPopupLid;

	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Not Now'")
	public WebElement NotNowButtonLID;

	@AndroidFindBy(id = "Locatorneeded")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]"),
			@iOSXCUITBy(id = "button1")})
	public static WebElement ReinstallPopupOk;

	@AndroidFindBy(id = "Locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"£100\"]")
	public static WebElement FuellingAmountAccount;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"£100\"]")
	public static WebElement Close;

	@AndroidFindBy(id = "account_preauth_edit")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Edit\"]")
	public static WebElement MaxFuelEditLkiOS;

	@AndroidFindBy(id = "account_card_number")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'**@')]")
	public static WebElement PaypalEmail;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Edit\"]")
	public static WebElement PaypalEdit;
	
	@AndroidFindBy(id = "paypal_signout_btn")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"Sign Out\"]"),
			@iOSXCUITBy(id = "paypal_signout_q2_btn")})
	public static WebElement PaypalSignout;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	@AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
	public static WebElement nectarCardContinueBtn;

	@AndroidFindBy(xpath = "//*[contains(@text,'Nectar card')]")
	public WebElement nectarAddedFirstTimemessage;

	@AndroidFindBy(id = "dashboard_greeting_msg")
	@iOSXCUITFindBy(id = "Nectar card added successfully")
	public WebElement NectarAddedSuccessfulTitle;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Last used password cannot be used as new password.")
	public WebElement SamePasswordErrorPopup;

	@AndroidFindBy(id = "account_delete")
	@iOSXCUITFindBy(id = "account_delete")
	public WebElement DeleteYourAccountAccountScreen;

	@AndroidFindBy(id = "account_delete_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Yes, Delete My Account\"]")
	public WebElement deleteButtonDeleteScreen;

	@AndroidFindBy(id = "header_cancel_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
	public WebElement CancelDeleteScreen;

	@AndroidFindBy(id = "delete_account_subtitle_txt")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Are you sure'")
//	@iOSXCUITFindBy(id = "Are you sure you want to delete your account?")
	public WebElement DeleteScreenTitle;

	@AndroidFindBy(id = "delete_account_desc_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Clicking the below button will permanently delete all of your account data including login, profile and payment accounts.\"]")
	public WebElement DeleteScreenSubTitle;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Your account has been deleted.")
	public WebElement DeleteAccountPopUpCt;

	@AndroidFindBy(id = "mobile_EditText")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextField' and value BEGINSWITH 'Mobile number'")
	public List<WebElement> mobileNumberFieldAccount;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Payment Method\"]")
	@AndroidFindBy(id = "alertTitle")
	public WebElement AddPaymentTitle;

	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]"),
			@iOSXCUITBy(id = "button1")})
	@AndroidFindBy(id = "android:id/button1")
	public WebElement AddPaymentOkButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please add a payment method to continue fuelling with the Esso App.\"]")
	@AndroidFindBy(id = "android:id/message")
	public WebElement AddPaymentCt;

	@AndroidFindBy(xpath = "//*[contains(@text,'Add a payment method to pay at the pump')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and value BEGINSWITH 'Add a payment'")
	public WebElement AddPaymentLink;

	@AndroidFindBy(xpath = "//*[contains(@text,'Add a payment method to pay at the pump')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	public WebElement AddPaymentLinkButton;

	@AndroidFindBy(id = "info_icon")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\" \"]")
	public WebElement AddPaymentInfoIcon;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and value BEGINSWITH 'You can store'")
	public WebElement InfoIconCt;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]"),
			@iOSXCUITBy(id = "button1")})
	public WebElement InfoOkButon;

	@iOSXCUITFindBy(id = "Cancel")
	public WebElement CancelButtonAddPaymentScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public WebElement ApplePayFirstPaymentAddPayMethod;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	public WebElement CreditDebitSecondPaymentAddPayMethod;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
	public WebElement PaypalThirdPaymentAddPayMethod;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Allow Location'")
	public WebElement FFheadertext;

	@AndroidFindBy(id = "paypal_get_started")
	@iOSXCUITFindBy(id = "paypal_get_started")
	public WebElement AllowLocContinueButton;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'When you arrive at'")
	public WebElement AllowPopupHeader;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(id = "Allow Once")
	public WebElement AllowOncePopup;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Location permission selected'")
	public WebElement LocationPermissionSuccessScreen;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'CONTINUE'")
	public WebElement LocationPermissionContinueButton;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]")
	public WebElement HeaderText;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public WebElement exxon_Help_feedback_Promtmsgok;

	@AndroidFindBy(id = "email_EditText")
	@iOSXCUITFindBy(id = "email_EditText")
	public WebElement RegstrEmail;

	@AndroidFindBy(id = "Need Locater")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Edit\"])[3]")
	public WebElement EditPin;

	@AndroidFindBy(id = "card_payment_layout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[5]")
	public WebElement DefaultPaymentMethod;

	@AndroidFindBy(id = "selected_default_payment_tv")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='  Selected Payment Method  '])[1]")
	public WebElement SelectedPaymentMethod;

	@AndroidFindBy(id = "Need Locater")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Payment Method\"]")
	public WebElement AddPaymentMethodLink;

	@AndroidFindBy(id = "button1")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[2]")
	public WebElement CardAddedOKButton;

	@AndroidFindBy(id = "Need Locater")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Choose Default Method\"]")
	public WebElement ChooseDefaultMethod;

	@AndroidFindBy(id = "account_paycard_title")
	@iOSXCUITFindBy(id = "account_paycard_title")
	public WebElement PaymentMethodAccount;

	@AndroidFindBy(id = "add_payment_method_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add Payment Method\"]")
	public WebElement AddCard;

	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '****'")
	@AndroidFindBy(id = "account_card_number")
	public WebElement CardNumberOne;

	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '****'")
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'account_card_number') and contains(@text,'****')]")
	public WebElement CardNumberMasked;

	@AndroidFindBy(id = "Need Locater")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[5]")
	public WebElement PaymentCardView;

	@AndroidFindBy(id = "Need Locater")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"card_logo\"]")
	public WebElement CofLogo;

	@AndroidFindBy(id = "Need Locater")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]")
	public WebElement CofPaymentType;

	@AndroidFindBy(xpath = "//*[@text='PayPal']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]")
	public WebElement PayPalTitle;

	@AndroidFindBy(id = "Need Locater")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	public WebElement PayPalEmail;

	@AndroidFindBy(id = "com.firstdata.mpl.qa:id/header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Account'")
	public WebElement AccountTitle;

	@iOSXCUITFindBy(id = "Accept all cookies")
	public WebElement AcceptCookies;

	@AndroidFindBy(id = "com.android.chrome:id/url_bar")
	@iOSXCUITFindBy(id = "TabBarItemTitle")
	public WebElement PpLinkRegistrationUrl;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"URL\"]")
	public WebElement PpLinkRegistrationUrlLink;

	@AndroidFindBy(id = "com.android.chrome:id/url_bar")
	@iOSXCUITFindBy(id = "Terms and Conditions")
	public WebElement TermsandCondition;

	@AndroidFindBy(id = "paypal_edit_nickname_btn")
	public WebElement PaypalEditNicknameButton;

	@AndroidFindBy(id = "paypal_cancel_btn")
	public WebElement PaypalCancelButton;

	@AndroidFindBy(id = "add_payment_method_desc")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please add a payment method to pay with the Esso App.\"]")
	public WebElement PaymentMethodText;

	@AndroidFindBy(id = "account_paycard_icon")
	public WebElement PaymentMethodIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PayPal']")
	@iOSXCUITFindBy(xpath = "needed")
	public WebElement PaypalText;

	public AccountPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
