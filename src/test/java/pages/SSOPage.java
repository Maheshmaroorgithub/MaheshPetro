package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class SSOPage extends GenericWrappers {
//	COFChallangeFlowPage COFChallangeFlowPage=new COFChallangeFlowPage();

    public SSOPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "twitter_login_icon")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement TwitterIcon;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]")
    public WebElement HeaderText;
    @AndroidFindBy(id = "facebook_login_icon")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement FacebookIcon;

    @AndroidFindBy(id = "apple_sign_in_icon")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement AppleIcon;

    @AndroidFindBy(id = "account_secure_pin_edit")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement AccountEdit;

    @AndroidFindBy(id = "pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Forgot Your PIN?\"]")
    public WebElement ForgotYourPin;

    @AndroidFindBy(id = "pin_entry_forgot_pin_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot Your PIN?\"]")
    public WebElement ForgotYourPinwithoutquestion;

    @AndroidFindBy(id = "send_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Send\"]")
    public WebElement SendButton;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@text='Forgot PIN']")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement ForgotPin;

    @AndroidFindBy(id = "mobile_header_desc_text")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement ForgotPinDescription;

    @AndroidFindBy(id = "eamil_text")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement EmailText;

    @AndroidFindBy(xpath = "//*[contains(@text,'inbox')]")
    @iOSXCUITFindBy(id = "We have sent you instructions to reset your Esso PIN. Please check your inbox or spam folder.")
    public WebElement ResetPinPopup_Msg;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(id = "OK"),
            @iOSXCUITBy(id = "button1")})
    public static WebElement okBtn;

    @AndroidFindBy(id = "button1")
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement ResetPin_Popup_Msg_Ok_Btn;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[1]"),
            @AndroidBy(xpath = "//android.view.View[1]/android.widget.EditText")})
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[4]"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeTextField[@name=\"Email or Phone\"]")})
    public WebElement LinkedInUsername;

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.EditText)[2]"),
            @AndroidBy(xpath = "//android.view.View[2]/android.widget.EditText")})
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[5]/XCUIElementTypeSecureTextField"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password\"]")
    })
    public WebElement LinkedInPassWord;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"username_or_email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public WebElement TwitterUserName;

    @AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField")
    public WebElement TwitterUserName1;

    @AndroidFindBy(xpath = "//android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Next\"])[1]")
    public WebElement TwitterUserNameNext;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"username_or_email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public List<WebElement> TwitterUserNameList;

    @AndroidFindBy(xpath = "needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
    public WebElement TwitterMobileOrUsername;

    @AndroidFindBy(xpath = "//android.view.View[3]/android.widget.Button[2]")
    @iOSXCUITFindBy(id = "Allow")
    public WebElement LinkedInAllowBtnLogin;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"password\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField")
    public WebElement TwitterPwd;

    @AndroidFindBy(xpath = "//android.view.View[3]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Password Reveal password\"]")
    public WebElement TwitterPwd1;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"allow\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
    public WebElement SSOTwittersignin;

    @AndroidFindBy(xpath = "//android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.Button")
    @iOSXCUITFindBy(id = "Log in")
    public WebElement SSOTwittersignin1;

    @AndroidFindAll({
            @AndroidBy(xpath = "//*[contains(@resource-id,'m_login_email')]"),
            @AndroidBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")})
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
    public WebElement FbUserName;

    @AndroidFindAll({
            @AndroidBy(xpath = "//*[contains(@resource-id,'m_login_password')]"),
            @AndroidBy(xpath = "//android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")})
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField")
    public WebElement FbPassword;

    @AndroidFindBy(xpath = "needed")
    @iOSXCUITFindBy(id = "Continue")
    public WebElement ContinueButtonGoogleNlid;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button"),
            @AndroidBy(xpath = "//*[contains(@text,'Continue')]")})
    @iOSXCUITFindBy(id = "LocatorNeed")
    public WebElement ContinueButtonFbAlreadyLoggedIn;

    @AndroidFindBy(id = "btnClose")
    @iOSXCUITFindBy(id = "Close Icon")
    public WebElement CloseButtonModalPopupLid;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Start']")
    @iOSXCUITFindBy(id = "start_button")
    public WebElement payButton;

    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Not Now'")
    public WebElement NotNowButtonLID;

    @AndroidFindBy(id = "Locatorneeded")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]"),
            @iOSXCUITBy(id = "button1")})
    public WebElement ReinstallPopupOk;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@content-desc=\"Log in\"]"),
            @AndroidBy(xpath = "//*[@text='Log In']")})
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"Log in\"]"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"உள்நுழைக\"]"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"உள்நுழை\"]"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"ಲಾಗ್ ಇನ್ ಮಾಡು\"]")})
    public WebElement FBLogin;

    @AndroidFindBy(id = "btn_accept")
    @iOSXCUITFindBy(id = "LocatorNeeded")
    public WebElement AcceptBtn;

    @AndroidFindBy(id = "account_secure_pin_edit")
    @iOSXCUITFindBy(id = "account_secure_pin_edit")
    public WebElement pin_Edit_Btn_without_Mobile_SSO;

    @AndroidFindBy(id = "account_user_profile_title")
    @iOSXCUITFindBy(id = "account_user_profile_title")
    public WebElement UserProfileAccount;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'terms_conditions_checkBox')]")
    public WebElement termsConditionscheckbox;

    @AndroidFindBy(id = "btn_accept")
    @iOSXCUITFindBy(id = "LocatorNeeded")
    public WebElement AcceptBtnReview;

    @AndroidFindAll({
            @AndroidBy(xpath = "//*[@text='Continue']"),
            @AndroidBy(xpath = "//*[contains(@text,'Continue')]")})
    public WebElement fbContinueBtn;

    @AndroidFindBy(id = "terms_conditions_checkBox")
    @iOSXCUITFindBy(id = "terms_conditions_checkBox")
    public WebElement SsoPrivacyPolicyCheckbox;

    @AndroidFindBy(id = "btn_accept")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Accept\"]")
    public WebElement SsoAcceptButton;

    @AndroidFindBy(id = "privacy_policy_tv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextView[@name=\"I accept the Privacy Policy and Terms and Conditions.\"]")
    public WebElement SsoPrivacyPolicyCt;

//	@iOSXCUITFindBy(xpath = "Need to add")
//	@AndroidFindBy(xpath = "//*[contains(@text,'Just to ensure this is your card, we need to ask you a few questions.')]")
//	public WebElement confirmPopupCt;

    @AndroidFindAll({
            @AndroidBy(id = "com.firstdata.mpl.qa:id/dashboard_app_logo"),
            @AndroidBy(id = "header_image")})
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeImage")
    public WebElement essoLogoLidScreen;

    @AndroidFindBy(id = "mobile_EditText")
    @iOSXCUITFindBy(id = "mobile_EditText")
    public List<WebElement> MobileTextBoxAddMobileAccountList;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign in\"]")
    public WebElement SSOsignin;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Forgot PIN\"]")
    public WebElement ForgotPinHeader;

    @AndroidFindBy(xpath = "LocatorNeed")
    @iOSXCUITFindBy(id = "Continue")
    public WebElement ContinueButtonLinkedIn;

    @AndroidFindBy(xpath = "needed")
    @iOSXCUITFindBy(id = "SIWA_CONTINUE_BUTTON")
    public WebElement ContinueWithPasscodeAppleSignIn;

    @AndroidFindBy(xpath = "needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Sign In With Apple\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
    public WebElement PasswordAppleSignIn;

    @AndroidFindBy(xpath = "needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
    public WebElement ContinueAppleSignIn;

    @AndroidFindBy(id = "com.google.android.gms:id/cancel")
    @iOSXCUITFindBy(id = "terms_conditions_checkBox")
    public WebElement SsoGoogleSmartLockCancel;

    @AndroidFindBy(id = "needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"BrowserView?IsPageLoaded=true&WebViewProcessID=6309\"]/XCUIElementTypeOther[2]/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeStaticText")
    public WebElement GoogleSignInNewScreenHeading;

    @AndroidFindBy(id = "needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public WebElement GoogleSignInNewScreenContinue;

}
