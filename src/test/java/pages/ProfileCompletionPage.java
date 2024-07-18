package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class ProfileCompletionPage extends GenericWrappers
{

    public ProfileCompletionPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "dashboard_register_btn")
    @iOSXCUITFindBy(id = "dashboard_register_btn")
    public WebElement registerAccount;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement register_Email_Skip;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement register_Emailskip_Anyway;

    @AndroidFindBy(id = "dashboard_progress_text")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement fifty_percent_Indicator;

    @AndroidFindBy(id = "dashboard_progress_text")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement forty_percent_Indicator;

    @AndroidFindBy(id = "profile_complete_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Complete Your Profile'")
    public WebElement profile_Completion_NLID;

    @AndroidFindBy(id = "get_started_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Get Started'")
    public WebElement getStarted_Add_Nectar;

    @AndroidFindBy(id = "dashboard_login")
    @iOSXCUITFindBy(id = "dashboard_login")
    public static WebElement login_Button_Nlid;

    @AndroidFindBy(id = "lid_resend_email_click_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Resend Email'")
    public WebElement resend_email_btn_NLID;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeAlert/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
    public WebElement resend_email_Popup_message;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public WebElement resend_popup_ok_btn;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(id = "profile_complete_btn")
    public WebElement complete_profile_Screen;

    @AndroidFindBy(id = "dashboard_start_option_inner_img")
    @iOSXCUITFindBy(id = "start")
    public WebElement start_fueling_icon_NLID;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Before you can proceed,'")
    public WebElement start_fueling_verficaton_msg;

    @AndroidFindBy(id = "account_add_nectarcard")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Add Nectar card\"]")
    public WebElement OkNect;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public WebElement start_fueling_popup_btn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add Mobile Number\"]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public List<WebElement> add_Moble_Num_Btn;

    @AndroidFindBy(id = "mobile_EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTextField")
    public static WebElement enter_Mble_Num;

    @AndroidFindBy(id = "picker")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypePickerWheel")
    public WebElement maximumAmountPicker;

    @AndroidFindBy(id = "mobile_done_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Done'")
    public WebElement mble_num_Done_Btn;

    @AndroidFindBy(id = "dashboard_greeting_msg")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Mobile number added'")
    public WebElement mble_Num_Complted_popup;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(id = "OK")
    public WebElement mble_Num_Popup_Okbtn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.LinearLayout")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public WebElement add_Mobl_Num_cmpltd;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Already Completed'")
    public static WebElement compltd_mbl_Num_popup;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(id = "OK"),
            @iOSXCUITBy(id = "button1")})
    public WebElement completd_Mble_Num_Popupok_Btn;


    @AndroidFindBy(xpath = "//*[@text='Email Preferences']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Preferences\"]")
    public static WebElement email_task;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.LinearLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[9]/XCUIElementTypeImage[1]")
    public WebElement completed_Notification;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[@text='Maximum Fuelling Amount']")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Maximum Fuelling Amount'")
    public WebElement maximum_Fueling_Btn;

    @AndroidFindBy(id = "set_amount")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'SET MAXIMUM AMOUNT'")
    public WebElement set_Maximum_Fueling_Btn;

    @AndroidFindBy(id = "defaultpicket_ok_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Done'")
    public WebElement maximum_Fueling_ok_btn;

    @AndroidFindBy(id = "defaultpicket_ok_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
    public WebElement maximum_Fuel_ok_btn;


    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'CONTINUE'")
    public WebElement maximum_fueling_continu_btn;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'You have already'")
    public WebElement maximum_Fueling_Amnt_Compltd_Msg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.LinearLayout")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement compltd_Add_Nectar;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement compltd_Add_Nectar_Msgpopup;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id = "button1")
    public WebElement compltd_Add_Nectar_okbtn;

    @AndroidFindBy(id = "header_back_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'back Icon'")
    public WebElement app_Back_Button;

    @AndroidFindBy(id = "dashboard_progress_text")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement percent_progress;

    @AndroidFindBy(id = "action_third_tab")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Offers'")
    public WebElement offer_icon;

    @AndroidFindBy(id = "action_more")
    @iOSXCUITFindBy(id = "More")
    public WebElement more_icon;

    @AndroidFindBy(id = "account_user_profile_title")
    @iOSXCUITFindBy(id = "account_user_profile_title")
    public static WebElement UserProfileAccount;

    @AndroidFindBy(id = "add_loyalty_entry_edit")
    @iOSXCUITFindBy(id = "add_loyalty_entry_edit")
    public WebElement enter_nectar_card_Accnt;

    @AndroidFindBy(id = "account_logout")
    @iOSXCUITFindBy(id = "account_logout")
    public static WebElement LogOut;

    @AndroidFindBy(id = "account_privacy_link")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Privacy Policy'")
    public WebElement AccountPrivacyPolicy;

    @AndroidFindBy(id = "add_loyalty_done_btn")
    @iOSXCUITFindBy(id = "add_loyalty_done_btn")
    public WebElement accnt_Nectar_Next;

    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Verify later'")
    public WebElement accnt_Nectar_verify_later;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Skip'")
    public WebElement accnt_Nectar_Skip;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Account'")
    public WebElement account_Page;

    @AndroidFindBy(id = "login_dc_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
    public static WebElement add_Nectar_Offer;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Continue'")
    public WebElement add_Nectar_Continue;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement add_Nectar_cancel;

    @AndroidFindBy(id = "txtoffer")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'OFFERS'")
    public WebElement offer_screen;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement paypal_Email_id;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View[5]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.widget.EditText")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement paypal_Password;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View[5]/android.widget.Button")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement paypal_Login_btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[8]/android.view.View[2]/android.view.View[2]/android.view.View[2]")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement paypal_Agree_Cookies;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[7]/android.widget.Button")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement paypal_Continue_Btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[5]/android.widget.Button")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement paypal_Agree_Continue;

    @AndroidFindBy(id = "dashboard_greeting_msg")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Or Sign Up Now!'")
    public WebElement paypal_Completed_Success_Msg;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(id = "paypal_get_started")
    public WebElement paypal_Compltd_Continue_Btn;

    @AndroidFindBy(id = "dashboard_greeting_msg")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement nectar_Card_Success_Msg;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'cp_item_subtitle')])[5]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Nectar Card\"]")
    public WebElement compltd_nectar_Card_Btn;

    @AndroidFindBy(xpath = "(//android.widget.LinearLayout/android.widget.TextView[@text='Payment Method'])[2]")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText"),
            @iOSXCUITBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Payment Method\"])[2]")})
    public WebElement payment_Methd_Btn;


    //id = "add_payment_method_btn"
    //xpath = "(//android.widget.LinearLayout/android.widget.TextView[@text='Payment Method'])[2]"

    @AndroidFindBy(id = "payment_paypal_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement payment_Mthd_Paypal_Btn;

    @AndroidFindBy(id = "item_edit")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Edit\"]")
    public WebElement payment_Edit_Btn;

    @AndroidFindBy(id = "paypal_signout_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement payment_Edit_Signout_Btn;

    @AndroidFindBy(id = "account_info_layout")
    @iOSXCUITFindBy(id = "account_info_layout")
    public WebElement compltd_Accnt_Featrs;

    @AndroidFindBy(id = "wow_starburst_lyt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    public WebElement enectarpoints;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Profile completion at 30%'")
    public WebElement CompleteYourProfile30;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Profile completion at 40%'")
    public WebElement CompleteYourProfile40;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Profile completion at 50%'")
    public WebElement CompleteYourProfile50;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Profile completion at 60%'")
    public WebElement CompleteYourProfile60;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[5]/XCUIElementTypeImage[1]")
    public WebElement TickMarkMfaCompleteYourProfile;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '30%'")
    public WebElement LIDProgress30;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3][@text='40%']")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '40%'")
    public WebElement LIDProgress40;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3][@text='50%']")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '50%'")
    public WebElement LIDProgress50;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3][@text='60%']")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '60%'")
    public WebElement LIDProgress60;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3][@text='70%']")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == '70%'")
    public WebElement LIDProgress70;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'ecoupon_main_lyt')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther")
    public WebElement enectarpointsThumbnail;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Verification Required'")
    public WebElement VerificationRequiredPopupTitle;

    @AndroidFindBy(id = "dashboard_start_option_inner_img")
    @iOSXCUITFindBy(id = "start_button")
    public WebElement start_Fueling_Icon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"User Profile\"]")
    public WebElement UserProfileTitleProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(id = "Accepted Privacy Policy and Terms and Conditions")
    public static WebElement PpAndTcProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(id = "Email Verified")
    public WebElement EmailVerifiedProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(id = "Set First and Last Name")
    public static WebElement SetFirstnameProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Add Mobile Number'")
    public static WebElement MobileProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Payment Method\"])[1]")
    public WebElement PaymentTitleProfile;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Loyalty Onboarding\"]")
    public WebElement LoyaltyTitleProfile;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"account_user_profile_title\"])[4]")
    public WebElement EmailTitleProfie;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\"Permissions\"]"),
            @iOSXCUITBy(id = "Permissions")})
    public WebElement PermissionsTitle;

    //@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]/android.widget.LinearLayout/android.widget.TextView")
    @AndroidFindBy(xpath = "//*[@text='Location Services']")
    @iOSXCUITFindBy(id = "Location Services")
    public WebElement LocationServicesProfile;

    @AndroidFindBy(xpath = "//*[@text='Notifications']")
    @iOSXCUITFindBy(id = "Notifications")
    public static WebElement NotificationsProfile;

    @AndroidFindBy(id = "account_add_card")
    @iOSXCUITFindBy(iOSNsPredicate = "//XCUIElementTypeButton[@name=\"Add Payment Method\"]")
    public WebElement add_card_button;

    @AndroidFindBy(id = "no_esso_email_checkBox")
    @iOSXCUITFindBy(id = "no_esso_email_checkBox")
    public static WebElement NectarCardSectionAccount;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Continue'")
    public WebElement payment_Pin_Continue_Btn;

    @AndroidFindBy(id = "edit_payment_delete_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Delete Card'")
    public WebElement deleteButtonEditPaymentMethod;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.firstdata.mpl.qa:id/item_edit\" and @text=\"Edit\"]")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Delete Card'")
    public WebElement EditPaymentMethod;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'"),
            @iOSXCUITBy(id = "OK"),
            @iOSXCUITBy(id = "button1")})
    public WebElement pin_Confirm_Ok_Btn;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name == 'Delete'")
    public WebElement DeletePopupButtonDebitCard;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='Fuel']")
    @iOSXCUITFindBy(id = "Fuel")
    public WebElement fuel;

    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(id = "OK")
    public static WebElement LidOkButtonCardExpiry;

    @AndroidFindBy(id = "alertTitle")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Message\"]")
    public WebElement LidTitleCardExpiry;

    @AndroidFindBy(id = "complete_profile_txt")
    @iOSXCUITFindBy(id = "Fuel")
    public WebElement Profile40completion;

    @AndroidFindBy(id = "offers_checkBox")
    @iOSXCUITFindBy(id = "offers_checkBox")
    public WebElement EmailPreferencesOffersAcceptCheckbox;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='successImage']")
    public WebElement emailpreference_success_image;

    @iOSXCUITFindBy(id = "email_pref_title")
    @AndroidFindBy(id = "email_pref_title")
    public WebElement emailPreference_tellustext;

    @iOSXCUITFindBy(id = "preference_continue_btn")
    @AndroidFindBy(id = "preference_continue_btn")
    public WebElement emailcontinue;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Email Preferences\"))")
    public WebElement EmailPreferences;

    @iOSXCUITFindBy(id = "offers_msg")
    @AndroidFindBy(id = "offers_msg")
    public WebElement emailpreferencesCheckbox1;

    @iOSXCUITFindBy(id = "no_esso_email_msg")
    @AndroidFindBy(id = "no_esso_email_msg")
    public WebElement emailpreferencesCheckbox2;

    @iOSXCUITFindBy(id = "dashboard_greeting_msg")
    @AndroidFindBy(id = "dashboard_greeting_msg")
    public WebElement emailpreferenceSuccessMessage;

    @iOSXCUITFindBy(id = "dashboard_help_msg_social")
    @AndroidFindBy(id = "dashboard_help_msg_social")
    public WebElement emailpreferenceSuccessDesc;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Accepted Privacy Policy and Terms and Conditions\"))")
    public WebElement AcceptedPPAndTC;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Location Services\"))")
    public WebElement Location_Services;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Back']")
    @iOSXCUITFindBy(id = "NavBack")
    public static WebElement CompleteYourProfielBack;

    @AndroidFindBy(id = "dashboard_progress_text")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement sixty_percent_Indicator;

    @AndroidFindBy(id = "dashboard_progress_text")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement seventy_percent_Indicator;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"Complete your profile\"])[8]")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement add_nectar_card;

    @AndroidFindBy(id = "get_started_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "NEEDED")
    public WebElement get_started_button;

    @AndroidFindBy(id = "item_edit")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Edit\"]")
    public WebElement payment_Edit_Btn_No_Mobile;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Skip'"),
            @iOSXCUITBy(id = "Cancel")})
    public WebElement CancelAddNectarCardLaunch;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(id = "header_left_txt")
    public WebElement CancelAddNectarCardNumberScreeen;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.ImageView")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Debit Card')]"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\"Credit/Debit Card\"]"),
            @iOSXCUITBy(id = "Credit/Debit Card")})
    public WebElement CreditDebitCardAddPaymentMethodScreen;

    @AndroidFindBy(id = "header_station_name_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Add Payment ')]")
    public WebElement AddPaymentMethodScreenTitle;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(id = "Cancel")
    public WebElement AddPaymentMethodScreenCancel;

    @AndroidFindBy(id = "NoNeed")
    @iOSXCUITFindBy(id = "Apple Pay")
    public WebElement AddPaymentMethodScreenApplePay;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")
    @iOSXCUITFindBy(id = "PayPal")
    public WebElement AddPaymentMethodScreenPayPal;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'cp_item_subtitle')])[2]")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email Verified\"]"),
            @iOSXCUITBy(id = "Email Verified")})
    public WebElement Compltd_Email_Btn;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Allow Location'")
    public static WebElement FFheadertext;

    @AndroidFindBy(id = "location_setting_title")
    @iOSXCUITFindBy(id = "location_setting_title")
    public WebElement FFCopytext;

    @AndroidFindBy(id = "location_subtitle_tv")
    @iOSXCUITFindBy(id = "location_subtitle_tv")
    public WebElement FFdirectiontext;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(id = "OK"),
            @iOSXCUITBy(id = "button1")})
    public WebElement OkButtonEmailPreferencesPopup;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'Please select any of the'"),
            @iOSXCUITBy(id = "message")})
    public WebElement EmailPreferencesPopupCt;

    @AndroidFindBy(id = "offers_msg")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND label BEGINSWITH 'Personalised offers'")
    public WebElement EmailPreferencesCheckbox1Ct;

    @AndroidFindBy(id = "no_esso_email_msg")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND label BEGINSWITH 'I would not'")
    public WebElement EmailPreferencesCheckbox2Ct;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[@text='Maximum Fuelling Amount']")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Maximum Fuelling Amount'")
    public List<WebElement> maximum_Fueling_Btn1;

    @AndroidFindBy(id = "header_station_name_text")
    @iOSXCUITFindBy(iOSNsPredicate = "Locator Needed")
    public WebElement CompleteYourProfile;

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

    @AndroidFindBy(id = "login_Btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'Login'")
    public WebElement login_Button_Login;

    @AndroidFindBy(id = "email_EditText")
    @iOSXCUITFindBy(id = "email_EditText")
    public static WebElement RegstrEmail;

    @AndroidFindBy(id = "btnClose")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Close Icon'")
    public WebElement completed_Popup;

    @AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public WebElement Continue_BTN;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Google Pay']")
    @iOSXCUITFindBy(id = "needed")
    public WebElement GooglePayTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='You can modify this payment method in your Account settings.']")
    @iOSXCUITFindBy(id = "needed")
    public WebElement GooglePayAddedPopUpText;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    @iOSXCUITFindBy(id = "needed")
    public WebElement GooglePayAddedPopUpTextBtn;



}