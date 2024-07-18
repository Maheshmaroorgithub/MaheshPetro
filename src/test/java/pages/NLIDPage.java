package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class NLIDPage extends GenericWrappers {

    public NLIDPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
      
    @AndroidFindBy(id = "dashboard_register_btn")
    @iOSXCUITFindBy(id = "dashboard_register_btn")
    public WebElement registeranaccount_NLID;

    @AndroidFindBy(id = "header_desc_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextView[@name=\"To keep your payment information secure we need a few details. \"]")
    public WebElement registeration_First;

    @AndroidFindBy(xpath = "//*[@text='Login']")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Login'")
    public static WebElement login_Button_Nlid;

    @AndroidFindBy(id = "login_email_error_tv")
    @iOSXCUITFindBy(id = "login_email_errormsg")
    public WebElement inline_Error_Email;

    @AndroidFindBy(id = "forgot_password_header_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Please enter'")
    public WebElement forgot_password_text;

    @AndroidFindBy(id = "forgot_pwd_tv")
    @iOSXCUITFindBy(id = "forgot_pwd_tv")
    public WebElement forgot_Password_Button;

    @AndroidFindBy(id = "forgot_password_email_edit")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeTextField' AND value== 'Email'")
    public WebElement invaild_Emailid_Section_Forgot_Password;

    @AndroidFindBy(id = "forgot_password_email_edit")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    public WebElement vaild_Emailid_Section_Forgot_Password;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND value BEGINSWITH 'An email has been '")
    public WebElement email_Sent_popup;

    @AndroidFindBy(id = "forgot_password_continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'Send'")
    public WebElement send_Button_Forgot_Password;

    @AndroidFindBy(id = "login_pwd_error_tv")
    @iOSXCUITFindBy(id = "login_pwd_error")
    public WebElement inline_Error_Password;

    @AndroidFindBy(id = "forgot_password_email_error_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Incorrect email'")
    public WebElement inline_Error_Email_Password;

    @AndroidFindBy(id = "header_back_btn")
    @iOSXCUITFindBy(id = "header_back_btn")
    public static WebElement cancel_Button_Forgot_Password;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND value== 'Your email or password was incorrect. Please try again.'")
    public WebElement invalid_unpwd_popup;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Sign up for Twitter\"]/android.widget.TextView[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Authorise Esso App'")
    public WebElement esso_Twitter_Screen_Content;

    @AndroidFindBy(id = "layer_twitter")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeButton")
    public WebElement esso_Twitter_Button_Nlid;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"facebook\"]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'facebook'")
    public WebElement esso_Facebook_Screen_Content;

    @AndroidFindBy(id = "layer_facebook")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeButton")
    public WebElement esso_Facebook_Button_Nlid;

    @AndroidFindBy(id = "layer_google")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton")
    public WebElement esso_Google_Button_Nlid;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.widget.TextView[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'New to LinkedIn?'")
    public WebElement esso_Linkedin_Screen_Content;

    @AndroidFindBy(id = "layer_linkedIn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeButton")
    public WebElement esso_Linkedin_Button_Nlid;

    @AndroidFindBy(id = "layer_linkedIn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeButton")
    public List<WebElement> esso_Linkedin_Button_Nlid_Below_Register;

    @AndroidFindBy(id = "layer_twitter")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]/XCUIElementTypeButton")
    public List<WebElement> esso_Twitter_Button_Nlid_Below_Register;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.Button[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeToolbar[@name=\"Toolbar\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    public WebElement esso_SSO_Back_Button;

    @AndroidFindBy(id = "dashboard_more")
    @iOSXCUITFindBy(id = "iMoreSocial")
    public WebElement SsoMoreButtonNlidBelowRegister;

    @AndroidFindBy(id = "dashboard_register_apple")
    @iOSXCUITFindBy(id = "dashboard_register_apple")
    public WebElement SsoAppleButtonNlidBelowRegister;

    @AndroidFindBy(id = "dashboard_register_google")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND label== 'googleLogo'")
    public WebElement SsoGoogleButtonNlidBelowRegister;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'OK'")
    public WebElement OkButtonWrongContentPopup;

    @AndroidFindBy(xpath = "Locstion needed")
    @iOSXCUITFindBy(id = "start")
    public WebElement StartButtonLID;

    @AndroidFindAll({
            @AndroidBy(id = "com.google.android.gms:id/cancel"),
            @AndroidBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"NONE OF THE ABOVE\"))")})
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NONE OF THE ABOVE\"]")
	public WebElement NONEOFTHEABOVE;

    @AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
    public static WebElement SavePasswordPopupAndroid;

    @AndroidFindBy(xpath = "//*[@resource-id='com.firstdata.mpl.qa:id/switch_analytics' and @text='OFF']")
    @iOSXCUITFindBy(iOSNsPredicate = "name== 'Analytics & Performance' AND value == '0'")
    public WebElement AnalyticsDataDisabledQa;

    @AndroidFindBy(xpath = "//*[@resource-id='com.firstdata.mpl.stage:id/switch_analytics' and @text='OFF']")
    @iOSXCUITFindBy(iOSNsPredicate = "name== 'Analytics & Performance' AND value == '0'")
    public WebElement AnalyticsDataDisabledStage;

    @AndroidFindBy(xpath = "//*[@resource-id='com.firstdata.mpl.qa:id/switch_functional' and @text='OFF']")
    @iOSXCUITFindBy(iOSNsPredicate = "name== 'Functional' AND value == '0'")
    public WebElement FunctionalDataDisabledQa;

    @AndroidFindBy(xpath = "//*[@resource-id= 'com.firstdata.mpl.stage:id/switch_functional' and @text= 'OFF']")
    @iOSXCUITFindBy(iOSNsPredicate = "name== 'Functional' AND value == '0'")
    public WebElement FunctionalDataDisabledStage;

    @AndroidFindBy(id = "text_analytics_performance")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Analytics & Performance\"]")
    public WebElement SettingsScreenAnalyticsTitle;

    @AndroidFindBy(id = "cancel_alert_dialog")
    @iOSXCUITFindBy(id = "closeSocial")
    public WebElement closeButtonSsoModalPopup;

    @AndroidFindBy(id = "text_title")
    @iOSXCUITFindBy(id = "top_txt")
    public WebElement BoardBannerTitle;

    @AndroidFindBy(id = "text_messages")
    @iOSXCUITFindBy(id = "details_txt")
    public WebElement BoardBannerSubTitle;

    @AndroidFindBy(xpath = "//*[contains(@text,'OK')]")
    @iOSXCUITFindBy(id = "okay_btn")
    public WebElement BoardBannerOk;

    @AndroidFindBy(id = "text_title")
    @iOSXCUITFindBy(id = "top_txt")
    public List<WebElement> BoardBannerTitleList;

    @AndroidFindBy(id = "text_messages")
    @iOSXCUITFindBy(id = "details_txt")
    public List<WebElement> BoardBannerSubTitleList;

    @AndroidFindBy(id = "text_title")
    @iOSXCUITFindBy(id = "okay_btn")
    public List<WebElement> BoardBannerOkList;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso App Feedback']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"help_section_feedback_title\"])[1]")
    public WebElement FDHelp_Feedback;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='YouTube']")
    @iOSXCUITFindBy(id = "help_section_feedback_title")
    public WebElement FDYoutube_link;

    @AndroidFindBy(id = "how_to_use_app_text")
    @iOSXCUITFindBy(id = "how_to_setup_app_text")
    public WebElement FDHelp_Youtube_howtosetupFFApp;

    @AndroidFindBy(id = "how_to_setup_app_text")
    @iOSXCUITFindBy(id = "how_to_use_app_text")
    public WebElement FDHelp_Youtube_howtouseFFApp;

    @AndroidFindBy(id = "app_version")
    @iOSXCUITFindBy(id = "app_version")
    public WebElement VersionHelp;

    @AndroidFindBy(id = "login_email_editText")
    @iOSXCUITFindBy(id = "login_email_editText")
    public WebElement AccountEmail;

    @AndroidFindBy(id = "login_Btn")
    @iOSXCUITFindBy(id = "login_Btn")
    public WebElement AccountLoginBtn;

    @AndroidFindBy(id = "login_passWord_editText")
    @iOSXCUITFindBy(id = "login_passWord_editText")
    public WebElement AccountPassword;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Back']")
    @iOSXCUITFindBy(id = "NavBack")
    public WebElement CompleteYourProfielBack;

    @AndroidFindBy(id="rootView")
    @iOSXCUITFindBy(id="needed")
    public List<WebElement> MoreMenus;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='log in with']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"or_login_with_text_view\" and @label=\"log in with\"]")
    public WebElement SsoModalPopupTitle;

    @AndroidFindBy(id="dashboard_app_logo")
    @iOSXCUITFindBy(xpath = "needed")
    public WebElement EssoLogoNlid;

    @AndroidFindBy(id="app_assistant_container")
    @iOSXCUITFindBy(xpath ="needed")
    public WebElement AppAssistant;
    @AndroidFindBy(id = "switch_functional")
    @iOSXCUITFindBy(iOSNsPredicate = "name== 'Functional' AND value == '0'")
    public WebElement FunctionalData;

    @AndroidFindBy(id = "switch_analytics")
    @iOSXCUITFindBy(iOSNsPredicate = "name== 'Analytics & Performance' AND value == '0'")
    public WebElement AnalyticsData;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageButton[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeButton\n" + "\n")
    public WebElement esso_Apple_Button_Nlid;

}
