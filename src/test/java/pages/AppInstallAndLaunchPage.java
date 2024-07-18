package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class AppInstallAndLaunchPage extends GenericWrappers {
    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
    public WebElement userName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
    public WebElement password;

    @AndroidFindBy(id = "button_accept_all")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Accept All\"]")
    public WebElement acceptAllButtonAppLaunch;

    @AndroidFindBy(id = "button_reject_all")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Reject All\"]")
    public WebElement rejectAllButtonAppLaunch;

    @AndroidFindBy(id = "text_manage_options")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Manage Options\"]")
    public WebElement manageOptionButtonAppLaunch;

    @AndroidFindBy(id = "text_cookie_settings")
    @iOSXCUITFindBy(xpath = "needed")
    public WebElement CookieSettingsText;

    @AndroidFindBy(id = "text_user_consent")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextView['index=0'])[2]")
    public WebElement CookieSubText1AppLaunch;

    @AndroidFindBy(id = "LocatorNeeded")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeTextView['index=0'])[3]")
    public WebElement CookieSubText2AppLaunch;

    @AndroidFindBy(id = "tutorial_page_one_bg")
    @iOSXCUITFindBy(id = "tutorial_page_one_bg")
    public WebElement WelcomImg;
    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(id = "tutorial_page_title")
    public static WebElement WelcomTtl;
    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[3])[1]")
    public WebElement WelcomImg2;
    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(id = "Fuelling is as easy as 1-2-3")
    public WebElement WelcomTtl_two;
    @AndroidFindBy(id = "tutorial_page_three_pump_iv")
    @iOSXCUITFindBy(id = "tutorial4_handAnim")
    public WebElement WelcomImg3;

    @iOSXCUITFindBy(id = "Collect Nectar points on every fill")
    public WebElement WelcomTtl_3;

    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(id = "Collect Nectar points on every fill")
    public WebElement WelcomTtl_three;
    @AndroidFindBy(id = "tutorial_page_four_bg")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage)[3]")
    public WebElement WelcomImg4;
    @iOSXCUITFindBy(id = "Collect Nectar points on every fill")
    public WebElement WelcomTtl_four;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Points collected will be shown')]")
    public WebElement WelcomSUBTtl_four;

    @iOSXCUITFindBy(id = "Get exclusive Esso rewards when you verify your Nectar card.")
    public WebElement WelcomSUBTtl_fournew;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    @iOSXCUITFindBy(id = "needed")
    public WebElement AllowNotificationContinue;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Allow']")
    @iOSXCUITFindBy(id = "needed")
    public WebElement AllowNotificationAllow;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Fuel']")
    @iOSXCUITFindBy(id = "Fuel")
    public WebElement FuelTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Station']")
    @iOSXCUITFindBy(id = "Station")
    public WebElement StationTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
    @iOSXCUITFindBy(id = "More")
    public WebElement More;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Esso Station Finder\"]")
    public WebElement StationHeaderTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Offers']")
    @iOSXCUITFindBy(id = "Offers")
    public WebElement OffersTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='History']")
    @iOSXCUITFindBy(id = "History")
    public WebElement HistoryTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
    @iOSXCUITFindBy(id = "More")
    public WebElement MoreTab;

    @AndroidFindBy(id = "next_btn")
    @iOSXCUITFindBy(id = "next_btn")
    public static WebElement NextBtn;

    @AndroidFindBy(id = "done_btn")
    @iOSXCUITFindBy(id = "Get Started")
    public static WebElement GetStarted_BTN;

    @AndroidFindBy(id = "get_started_btn")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeButton[@name=\"Get Started\"]")
    public WebElement AddNectarGetStartedBtn;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    public WebElement skip_BTN;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    @iOSXCUITFindBy(id = "tutorial_page_sub_title")
    public static WebElement Subtitle;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    @iOSXCUITFindBy(id = "tutorial_page_sub_title")
    public static WebElement SubtitleSecondScreen;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id = "OK")
    public WebElement AccountOkBtn;

    @iOSXCUITFindBy(id = "Continue")
    public WebElement ContinueBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
    public WebElement AllowPopup;

    @AndroidFindBy(id = "dashboard_circle_progress")
    @iOSXCUITFindBy(id = "OK")
    public WebElement start;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "/XCUIElementTypeOther[@name=\"Allow Notifications\"]")
    public WebElement Allow_Notifications_header;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"pushBackground\"]")
    public WebElement notification_image;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Easy access to your receipts\"]")
    public WebElement notification_middle_message;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"The Esso App can notify you when your receipt is ready for viewing.\"]")
    public WebElement notification_bottom_message;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add Nectar Card\"]")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
    public WebElement add_Nectar_card;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Get exclusive offers\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Get exclusive offers\"]")
    public WebElement get_offers;

    @AndroidFindBy(id = "txtregi_redeem")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add your Nectar card to\"]")
    public WebElement add_nectar_card_to;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Collect points\"]")
    public WebElement collection_points_header;

    @AndroidFindBy(id = "list_item_text_child")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Collect Nectar points for your fuel or shop purchase at participating Esso stations. \"]")
    public WebElement collection_points_message;

    @AndroidFindBy(id = "list_item_earning_points")
    @iOSXCUITFindBy(id = "More about collecting points")
    public WebElement more_about_collecting_point_link;

    @AndroidFindBy(id = "pay_point_img")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
    public WebElement rewards_image;

    @AndroidFindBy(id = "pay_with_points")
    @iOSXCUITFindBy(id = "Rewards")
    public WebElement rewards_header;

    @AndroidFindBy(id = "sub_txt")
    @iOSXCUITFindBy(id = "Enjoy the benefits of Esso Nectar offers exclusive for you when you purchase at Esso.")
    public WebElement rewards_text;

    @AndroidFindBy(id = "earn_points")
    @iOSXCUITFindBy(id = "COLLECT MORE NECTAR POINTS")
    public WebElement collect_more_nectar_points;

    @AndroidFindBy(id = "login_dc_btn")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
    public WebElement add_nectar_card;

    @AndroidFindBy(id = "esso_logo_tm")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
    public WebElement Add_Nectar_card_image;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Collect Nectar points for your fuel or shop purchase at participating Esso stations. \"]")
    public WebElement how_to_collect_points_popup;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
    public WebElement collection_points;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"COLLECT MORE NECTAR POINTS\"]/XCUIElementTypeOther")
    public WebElement collection_points1;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(id = "rewardViewClose")
    public WebElement geRewards_How_to_collect_points_popup_Close;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    public WebElement get_nectar_points_home;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@index=\"0\"])[1]")
    public WebElement CtTextLIDScreen;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
    public WebElement OkButtonCTText;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"]")
    public WebElement NextButtonScreen;

    @AndroidFindBy(id = "loyalty_points_description_first_part")
    @iOSXCUITFindBy(xpath = "locator not available")
    public WebElement NectarPointBalanceLeftText;

    @AndroidFindBy(id = "no need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton")
    public WebElement NectarPointBalance;

    @AndroidFindBy(id = "loyalty_points_description_second_part")
    @iOSXCUITFindBy(xpath = "locator not available")
    public WebElement NectarPointBalanceRightText;

    @AndroidFindBy(id = "nectar_points_lyt")
    @iOSXCUITFindBy(xpath = "locator not available")
    public WebElement NectarPointBalanceValue;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Close Icon\"]")
    public WebElement CloseNectarPopup;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@index=\"1\"])[2]")
    public WebElement OfferAppliedTickMark;

    @AndroidFindBy(id = "Need to add")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell[2]/XCUIElementTypeOther[@index=\"0\"])")
    public WebElement OffersBannerPanen;

    @AndroidFindBy(id = "tutorial_car_iv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"car\"]")
    public WebElement CarImageWelScreen;

    @AndroidFindBy(id = "tutorial_car_iv")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=2'])[5]")
    public WebElement EssoLogo;

    @AndroidFindBy(id = "tutorial_car_iv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
    public WebElement AllowInPopupScreen;

    @AndroidFindBy(id = "tutorial_car_iv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pay securely from your car\"]")
    public WebElement Screen2Tittle;

    @AndroidFindBy(id = "tutorial_car_iv")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Set up your payment method to pay for fuel from your mobile phone.\"]")
    public WebElement Screen2SubTittle;

    @AndroidFindBy(id = "done_btn")
    @iOSXCUITFindBy(id = "done_btn")
    public static WebElement exxon_Help_Tutorial_GetStartedBtn;

    @AndroidFindBy(id = "no need")
    @iOSXCUITFindBy(id = "OK")
    public WebElement CameraAccessOkPopup;

    @AndroidFindBy(id = "no need")
    @iOSXCUITFindBy(id = "OK")
    public WebElement FaceIdAccessOkPopup;

    @iOSXCUITFindBy(id = "We're still rolling out the Esso App across our network. Use \"Station\" below to locate your nearest station with mobile pay.")
    @AndroidFindBy(xpath = "//*[contains(@text,'rolling')]")
    public WebElement welcomePopup;

    @iOSXCUITFindBy(id = "Get Started")
    @AndroidFindBy(xpath = "//*[contains(@text,'Get Started')]")
    public WebElement GETSTARTEDBut;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]")
    public WebElement Allow;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id = "OK")
    public WebElement okBtn;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Skip\"]")
    public WebElement TutorialSkipButton;

	@AndroidFindBy(id = "text_analytics_title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Analytics & Performance\"]")
	public WebElement AnalyticsAndPerformance;

	@AndroidFindBy(id = "checkbox_analytics")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"cookiesCircleUnCheck\"])[1]")
	public WebElement AnalyticsAndPerformanceCheckbox;

    @AndroidFindBy(id = "checkbox_analytics")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"cookiesCircleCheck\"]")
    public WebElement AnalyticsAndPerformanceunCheckbox;

	@AndroidFindBy(id = "text_analytics_details")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextView[@name=\"These technologies tell us how customers use our app and provide information to help us improve performance. The information gathered is aggregated and therefore anonymous. You can turn these off, but we will be unable to monitor how the app performs.\"]")
	public WebElement AnalyticsAndPerformanceSectionCT;

	@AndroidFindBy(id = "text_functional")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Functional\"]")
	public WebElement Functional;
	@AndroidFindBy(id = "checkBox_functional")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"cookiesCircleUnCheck\"])[2]")
	public WebElement FunctionalCheckbox;

	@AndroidFindBy(id = "text_functional_details")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextView[@name=\"These technologies allow us to provide certain functionalities and services within the app, for example refer a friend or usage incentive offers. You can turn them off, however certain features of the app may not be available to you.\"]")
	public WebElement FunctionalSectionCT;

	@AndroidFindBy(id = "button_confirm")
	@iOSXCUITFindBy(xpath = "needed")
	public WebElement ConfirmOnCookieSettings;

    @AndroidFindBy(id = "account_location_service_title")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Location Services'")
    public WebElement LocationTitleAccount;

    @AndroidFindBy(id = "account_notification_service_title")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Push Notifications'")
    public static WebElement NotificationsTitleAccount;

    @AndroidFindBy(id = "account_camera_access_title")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Camera Access'")
    public WebElement CameraTitleAccount;

    @AndroidFindBy(id = "text_analytics_performance")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Analytics & Performance\"]")
    public WebElement SettingsScreenAnalyticsTitle;

    @AndroidFindBy(id = "switch_functional")
    @iOSXCUITFindBy(iOSNsPredicate = "name== 'Functional' AND value == '0'")
    public WebElement FunctionalData;

    @AndroidFindBy(id = "switch_analytics")
    @iOSXCUITFindBy(iOSNsPredicate = "name== 'Analytics & Performance' AND value == '0'")
    public WebElement AnalyticsData;

    public AppInstallAndLaunchPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }



}
