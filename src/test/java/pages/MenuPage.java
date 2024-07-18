package pages;


import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class MenuPage extends GenericWrappers {
	public MenuPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"There are now over 1,000 First Fuel sites in the US selling high quality First Fuel fuels. We offer products and services for both business and consumer use.\"]")
	public WebElement Product1;

	@AndroidFindBy(id = "account_privacy_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Privacy Policy'")
	public WebElement AccountPrivacyPolicy;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Back']")
	@iOSXCUITFindBy(id = "NavBack")
	public static WebElement Backbutton;

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='Fuel']")
	@iOSXCUITFindBy(id = "Fuel")
	public WebElement fuel;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Close Icon")
	public WebElement CloseButtonModalPopupLid;

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='More']")
	@iOSXCUITFindBy(id = "More")
	public WebElement more;

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='Offers']")
	@iOSXCUITFindBy(id = "Offers")
	public WebElement action_offer;

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='History']")
	@iOSXCUITFindBy(id = "History")
	public WebElement action_history;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[2][@text='PAY INSIDE']")
	@iOSXCUITFindBy(id = "PAY INSIDE")
	public WebElement Payinsidebutton;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[1][@text='PAY OUTSIDE']")
	@iOSXCUITFindBy(id = "PAY OUTSIDE")
	public WebElement Payoutsidebutton;

	@AndroidFindBy(id = "action_fuel")
	@iOSXCUITFindBy(id = "Fuel")
	public WebElement TabFuel;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Station']")
	@iOSXCUITFindBy(id = "Station")
	public WebElement TabStation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Station']")
	@iOSXCUITFindBy(id = "Station")
	public WebElement FFbutton;

	@AndroidFindBy(xpath = "//*[contains(@text,'Offers')]")
	@iOSXCUITFindBy(id = "Offers")
	public WebElement Taboffers;

	@AndroidFindBy(id = "action_more")
	@iOSXCUITFindBy(id = "More")
	public WebElement TabMore;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='History']")
	@iOSXCUITFindBy(id = "History")
	public WebElement TabHistory;

	@AndroidFindBy(id = "paypal_get_started")
	@iOSXCUITFindBy(id = "paypal_get_started")
	public static WebElement AllowLocContinueButton;

	@AndroidFindBy(id = "location_continue_btn")
	@iOSXCUITFindBy(id = "location_continue_btn")
	public static WebElement AllowLocLetsLocateContinueButton;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Allow Once'")
	public WebElement PermissionallowButton;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public WebElement stationFinderScreenTxt;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public WebElement OffersScreenTitle;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Transaction History'")
	public WebElement HistoryScreenTitle;

	@AndroidFindBy(id ="android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public WebElement OkButton;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Allow Location'")
	public static WebElement FFheadertext;

	@AndroidFindBy(id = "location_setting_title")
	@iOSXCUITFindBy(id = "location_setting_title")
	public WebElement FFCopytext;

	@AndroidFindBy(id = "linkEnableGps")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public WebElement FFTurnonLoc;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(id = "location_subtitle_tv")
	public WebElement FFdirectiontext;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tell a Friend']")
	@iOSXCUITFindBy(id = "tell_a_friend_text")
	public WebElement ReferAfriend;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Tell a Friend'")
	public WebElement ReferAfriendtitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Products & Information']")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\"Products & Information\"]"),
			@iOSXCUITBy(id = "products_and_information_text")})
	public WebElement ProductsAndInformation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Support Centre']")
	@iOSXCUITFindBy(id = "support_centre_text")
	public WebElement SupportCentre;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Share Logs']")
	@iOSXCUITFindBy(id = "shareLogsEnabled")
	public WebElement ShareLog;

	@AndroidFindBy(id = "com.google.android.gm:id/peoplekit_autocomplete_bar_to")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@name=\"toField\"]")
	public WebElement ShareLogsEmailField;

	@AndroidFindBy(id = "com.google.android.gm:id/peoplekit_autocomplete_bar_cc")
	public WebElement ShareLogsCcField;
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Return\"]")
	public WebElement ReturnButtonKeypad;

	@AndroidFindBy(id = "com.google.android.gm:id/send")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Mail.sendButton\"]")
	public WebElement ShareLogsSendButton;

	@AndroidFindAll({
			@AndroidBy(xpath="//android.widget.Button[@text='Only this time']"),
			@AndroidBy(id="permission_allow_one_time_button"),
			@AndroidBy(id = "location_subtitle_tv")})
	@iOSXCUITFindBy(id = "Allow Once")
	public static WebElement AllowOncePopup;

	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name BEGINSWITH 'Allow While'")
	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.Button[@text='While using the app']"),
			@AndroidBy(id = "com.android.packageinstaller:id/permission_allow_button"),
			@AndroidBy(xpath = "//*[contains(@text,'While using')]"),
	        @AndroidBy(id="permission_allow_foreground_only_button")})
	public static WebElement AllowWhilePopup;

//	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	@AndroidFindAll({
			@AndroidBy(xpath="//android.widget.Button[@text=\"Don't allow\"]"),
			@AndroidBy(id = "com.android.packageinstaller:id/permission_deny_button"),
			@AndroidBy(xpath = "//*[contains(@text,'Deny')]"),
			@AndroidBy(id = "permission_deny_button")})
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Don’t Allow\"]")
	public static WebElement DontAllowPopup;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
	public static WebElement DontallowCancel;

	@iOSXCUITFindBy(xpath =" \t\n" +
			"//XCUIElementTypeButton[@name=\"Settings\"]" )
	public WebElement DontAllowSettings;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'When you arrive at'")
	public static WebElement AllowPopupHeader;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name== 'Location permission selected'")
	public static WebElement LocationPermissionSuccessScreen;

	@AndroidFindBy(id = "location_subtitle_tv")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name== 'CONTINUE'")
	public static WebElement LocationPermissionContinueButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Get exclusive offers\"]")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Get exclusive offers\"]")
	public WebElement OffersScreenWithoutVerify;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please log into your account to access this feature.\"]")
	public WebElement loginpopop;

	@AndroidFindBy(xpath = "//androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[@text=\"OK\"]")
	@iOSXCUITFindBy(id = "OK")
	public WebElement okbutton;

	@AndroidFindBy(id = "header_station_name_text")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Login\"])[1]")
	public WebElement headerloginpage;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public static WebElement exxon_Help_feedback_Promtmsgok;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso App Tutorial']")
	@iOSXCUITFindBy(id = "help_section_tutorial_text")
	public WebElement Esso_Help_App_Tutorial;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Frequently Asked Questions']")
	@iOSXCUITFindBy(id = "help_section_faq_text")
	public WebElement FDHelp_FAQ;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Call']")
	@iOSXCUITFindBy(id = "help_section_call_title")
	public WebElement FDHelp_Call;

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

	@AndroidFindBy(xpath = "//android.widget.TextView[2][@text='Speak to a customer representative.']")
	@iOSXCUITFindBy(id = "help_section_call_subtitle")
	public WebElement CallText;

	@AndroidFindBy(id = "help_section_subtext")
	@iOSXCUITFindBy(id = "help_section_normalcall_text")
	public WebElement CallTextNormal;

	@AndroidFindBy(xpath = "//android.widget.Button[2][@text='CALL']")
	@iOSXCUITFindBy(id = "Cancel")
	public WebElement Cancelbutton;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Next'")
	public WebElement exxon_Help_Tutorial_NextBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Get Started']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Get Started'")
	public static WebElement exxon_Help_Tutorial_GetStartedBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[2][@text='Send us your questions or thoughts.']")
	@iOSXCUITFindBy(id = "help_section_email_subtitle")
	public WebElement FDHelp_Email_Text;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[@text='customer.care@exxonmobil.com']")
	@iOSXCUITFindBy(id = "help_section_email_text")
	public WebElement FDHelp_Email_Id;

	@AndroidFindBy(xpath = "//android.widget.TextView[1][@text='Email']")
	@iOSXCUITFindBy(id = "help_section_email_title")
	public WebElement FDHelp_Email_Navigation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Compose\"]")
	@iOSXCUITFindBy(id = "toField")
	public WebElement FDHelp_Email_Validation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Frequently Asked Questions']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Frequently Asked Questions']")
	public WebElement FD_FAQ_Header;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='How the app works']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"list_item_text_view\"])[1]")
	public WebElement FDFAQ_How;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Safety and Security']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"list_item_text_view\"])[3]")
	public WebElement FDFAQ_sfty;

	@AndroidFindBy(xpath = "//android.widget.TextView[2][@text='Payments & Billing']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"list_item_text_view\"])[2]")
	public WebElement FDFAQ_pay;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Loyalty Points']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"list_item_text_view\"])[4]")
	public static WebElement FDFAQ_Loyalty;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Benefits of Using the Esso App']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"list_item_text_view\"])[5]")
	public WebElement FDFAQ_Benefitsofusing;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Technical']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"list_item_text_view\"])[6]")
	public WebElement FDFAQ_Technical;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Communications & Data Privacy']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"list_item_text_view\"])[7]")
	public WebElement FDFAQ_Communications;

	@AndroidFindBy(id = "btn_more_feedback")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Give Us More Feedback'")
	public WebElement FDFF_MoreFeedback;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"starDisable\"])[4]")
	public WebElement exxon_Help_feedback_firstAllStars;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"starDisable\"])[3]")
	public WebElement exxon_Help_feedback_SecondAllStars;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"starDisable\"])[2]")
	public WebElement exxon_Help_feedback_ThirdsAllStars;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"starDisable\"])[4]")
	public WebElement exxon_Help_feedback_fourthAllStars;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='SEND FEEDBACK']")
	@iOSXCUITFindBy(id = "SEND FEEDBACK")
	public WebElement exxon_Help_feedback_submit;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	@iOSXCUITFindBy(id = "OK")
	public WebElement exxon_Help_feedback_Ok;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[4]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='starDisable'])[4]")
	public WebElement exxon_Help_feedback_FourthAllStars_Scr2;

	@AndroidFindBy(id = "app_store_survey_msg")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText)[2]")
	public WebElement FD_Help_app_store_survey_msg;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='FirstFuel Logo']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage")
	public WebElement Help_Feedback_Logo;

	@AndroidFindBy(id = "survey_header_tv")
	@iOSXCUITFindBy(id = "Help Us Improve")
	public WebElement Help_Feedback_Improve;

	@AndroidFindBy(id = "survey_msg")
//	@iOSXCUITFindBy(id = "Hey TEST, how well did the Esso App work for you today?")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name ENDSWITH 'App work for you today?'")
	public WebElement Help_Feedback_Screen;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='starDisable'])[3]")
	public WebElement exxon_Help_feedback_ThirdAllStars_Scr2;

	@AndroidFindBy(id= "app_store_survey_msg")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Sorry to hear that TEST. Would you give us some quick feedback so we can try to improve your app experience?']")
	public WebElement exxon_Help_feedback_surveymsg;

	@AndroidFindBy(id= "app_store_survey_msg")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Sorry to here that First1. Would you give us some quick feedback so we can try to improve your app experience?']")
	public WebElement exxon_Help_feedback_surveymsg1;

	@AndroidFindBy(id= "btnNotNow")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Not Now']")
	public WebElement exxon_Help_feedback_Notnow;

	@AndroidFindBy(id = "btnYes")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Yes']")
	public WebElement exxon_Help_feedback_Yes;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Improve the Esso App']")
	public WebElement exxon_Help_feedback_fourthscreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Your customers will be able to rate the app once available in the play store.']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='App Not Available']")
	public WebElement exxon_Help_feedback_Promtmsg;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[2]\r\n")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'SEND FEEDBACK'")
	public WebElement exxon_Help_feedback_SendFeedbacktnx;

	@AndroidFindBy(id = "edit_payment_done_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='SEND FEEDBACK']")
	public WebElement exxon_Help_feedback_SendFeedbackBtn;

	@AndroidFindBy(id = "lbl_comment")
	@iOSXCUITFindBy(id = "What could we do to improve your experience? (optional)")
	public WebElement exxon_Help_feedback_Improve_Your;

	@AndroidFindBy(id = "edit_comment")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[2]/XCUIElementTypeTextView")
	public WebElement exxon_Help_feedback_textbox;

	@AndroidFindBy(id = "edit_comment_count")
	@iOSXCUITFindBy(id = "0/140")
	public WebElement exxon_Help_feedback_Charcter;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(id = "Thanks for your feedback.")
	public WebElement exxon_Help_feedback_Promtmsgtnx;

	@AndroidFindBy(id = "header_station_name_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Improve the Esso App'")
	public WebElement exxon_Help_feedback_title;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Close'")
	public WebElement exxon_Help_feedback_Close;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[@text='Please rate the following statements.']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Please rate the following statements.'")
	public WebElement exxon_Help_feedback_Plsratemsgheader;

	@AndroidFindBy(xpath= "//android.widget.TextView[@text='My fuelling experience was easy']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'My fuelling experience was easy'")
	public WebElement exxon_Help_feedback_Myfuellingexperience;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='It saves me time']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'It saves me time'")
	public WebElement exxon_Help_feedback_savestime;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My digital receipts are helpful']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'My digital receipts are helpful'")
	public WebElement exxon_Help_feedback_Digitalreceipts;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Esso App works well, with no errors']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'My Esso App works well, with no errors'")
	public WebElement exxon_Help_feedback_EssoAppworks;

	@AndroidFindBy(id = "header_back_btn")
	@iOSXCUITFindBy(id = "NavBack")
	public WebElement BackBtn;

	@AndroidFindBy(id = "header_back_image_btn")
	@iOSXCUITFindBy(id = "header_back_image_btn")
	public WebElement tansaction_BackBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Transaction Details')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name == 'Transaction Details'")
	public WebElement TransactionDetailsScreenTitle;

	@AndroidFindBy(id = "transaction_childItemLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public WebElement TransactionHistoryInfo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='History']")
	@iOSXCUITFindBy(id = "History")
	public WebElement historyBtn;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction History\"]")
	public WebElement TransactionHistoryTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Select']")
	@iOSXCUITFindBy(id = "Select")
	public WebElement selectButton;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Email Receipt']")
	@iOSXCUITFindBy(id = "Email Receipt")
	public WebElement emailReceipt;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[contains(@resource-id,'receipt_checkBox')])[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeApplication[@name=\"First Fuel\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage\n")
	public WebElement transactionCheckBox;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(id = "Email Receipt")
	public WebElement emailReceiptButton;

	@AndroidFindBy(xpath = "//*[contains(@text,'Receipt(s)')]")
	@iOSXCUITFindBy(id = "Receipt(s) sent via email.")
	public WebElement emailReceiptMessage;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public WebElement okBtn;

	@AndroidFindBy(id = "transaction_days")
	@iOSXCUITFindBy(id = "transaction_days")
	public WebElement day90s;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	public WebElement TransAmt;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public WebElement TransDate;

	@AndroidFindBy(id = "transaction_childItemLayout")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public WebElement TransDtl;

	@AndroidFindBy(id = "header_station_name_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public WebElement TransHead;

	@AndroidFindBy(id = "imageView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='After making a fuel purchase you can view your transaction history, notes and VAT receipts here.']")
	public WebElement NoHistory;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name='emailSelect.png'])[1]")
	public WebElement SelectCkbx;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView")
	@iOSXCUITFindBy(id = "Receipts sent via email.")
	public WebElement PopMsg;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	@iOSXCUITFindBy(id = "OK")
	public WebElement PopOk;

	@AndroidFindBy(id = "full_receipt_add_note")
	@iOSXCUITFindBy(id = "full_receipt_add_note")
	public WebElement AddNote;

	@AndroidFindBy(id = "vat_receipt_status")
	@iOSXCUITFindBy(id = "vat_receipt_status")
	public WebElement VatView;

	@AndroidFindBy(id = "com.google.android.apps.docs:id/action_add_to_drive")
	@iOSXCUITFindBy(id = "ShareICon")
	public WebElement ShareBTN;

	@AndroidFindBy(id = "add_note_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextView")
	public WebElement Notetxt;

	@AndroidFindBy(id = "add_note_save_btn")
	@iOSXCUITFindBy(id = "add_note_save_btn")
	public WebElement NoteSave;

	@AndroidFindBy(id = "note_details")
	@iOSXCUITFindBy(id = "note_details")
	public WebElement NoteWithEsso;

	@AndroidFindBy(id = "Not Needed")
	@iOSXCUITFindBy(id = "note_subHeader")
	public WebElement NotetitleTransactionDetails;

	@AndroidFindBy(id = "account_email_setting_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Email Settings'")
	public WebElement Account_Emailsetting;

	@AndroidFindBy(id = "account_receipt_checkBox")
	@iOSXCUITFindBy(xpath = "locator needed")
	public WebElement Account_Recipetcheckbox;

	@AndroidFindBy(id = "account_news_checkBox")
	@iOSXCUITFindBy(xpath = "locator needed")
	public WebElement Account_Receiveemailcheckbox;

	@AndroidFindBy(id = "account_receipt_msg")
	@iOSXCUITFindBy(id = "I would like to receive receipts by email.")
	public WebElement Account_Recipetmailmsg;

	@AndroidFindBy(id = "account_newsletter_msg")
	@iOSXCUITFindBy(id = "I’d like to receive emails from Esso about topics that may interest me, promotions and Nectar offers.")
	public WebElement Account_Receivemsg;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Settings\"])[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public WebElement Mobilesetting;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Apps & notifications']")
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

	@AndroidFindBy(id = "com.firstdata.mpl.qa:id/header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Account'")
	public WebElement AccountTitle;

	@AndroidFindBy(id = "account_user_profile_title")
	@iOSXCUITFindBy(id = "account_user_profile_title")
	public WebElement UserProfileAccount;

	@AndroidFindBy(id = "account_user_name")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Full name'")
	public WebElement FullNameAccount;

	@AndroidFindBy(id = "account_user_password")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Password'")
	public WebElement PasswordAccount;

	@AndroidFindBy(id = "account_user_mobile_number")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Mobile number'")
	public WebElement MobileNumberAccount;

	@AndroidFindBy(id = "account_secure_pin")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Esso PIN'")
	public WebElement EssoPinAccount;

	@AndroidFindBy(id = "account_paycard_title")
	@iOSXCUITFindBy(id = "account_paycard_title")
	public static WebElement PaymentMethodAccount;

	@AndroidFindBy(id = "account_preauth_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Maximum Fuelling Amount'")
	public static WebElement MfaTitleAccount;

	@AndroidFindBy(id = "account_nectar_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeOther' AND name == 'Esso Nectar'")
	public WebElement EssoTitleAccount;

	@AndroidFindBy(id = "account_location_service_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Location Services'")
	public WebElement LocationTitleAccount;

	@AndroidFindBy(id = "account_notification_service_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Push Notifications'")
	public static WebElement NotificationsTitleAccount;

	@AndroidFindBy(id = "account_camera_access_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Camera Access'")
	public WebElement CameraTitleAccount;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Touch ID'")
	public WebElement TouchIDTitleAccount;

	@AndroidFindBy(id = "account_email_setting_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Email Settings'")
	public WebElement EmailSettingsTitleAccount;

	@AndroidFindBy(id = "account_terms_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Terms and Conditions'")
	public WebElement TCLinkAccount;

	@AndroidFindBy(id = "account_privacy_link")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Privacy Policy'")
	public WebElement PPLinkAccount;

	@AndroidFindBy(id = "account_logout")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'LOG OUT'")
	public static WebElement LogOut;

	@AndroidFindBy(id = "dashboard_register_btn")
	@iOSXCUITFindBy(id = "dashboard_register_btn")
	public WebElement DashRegstr;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView[@text='sandbox.paypal.com']")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name == 'Cancel'")
	public WebElement CancelPaypaPageButton;

	@AndroidFindBy(id = "account_setup_paypal")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Add PayPal'")
	public WebElement PaypalBtn;

	@AndroidFindBy(id = "account_password")
	@iOSXCUITFindBy(id = "account_pwd")
	public WebElement MaskedPasswordAccountScreen;

	@AndroidFindBy(id = "account_password_edit")
	@iOSXCUITFindBy(id = "account_pwd_edit")
	public WebElement PasswordEdit;

	@AndroidFindBy(id = "header_station_name_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Edit Password'")
	public WebElement EditPasswordTitle;

	@AndroidFindBy(id = "current_password_validation_txt")
	@iOSXCUITFindBy(id = "current_pwd_validation_txt")
	public WebElement CurrentPasswordInlineErrorAccount;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")
	@iOSXCUITFindBy(id = "current_pwd_show_img")
	public WebElement FirstShowButton;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.ImageView")
	@iOSXCUITFindBy(id = "current_pwd_hide_img")
	public WebElement FirstHideButton;

	@iOSXCUITFindBy(id = "new_pwd_hide_img")
	@AndroidFindBy(id = "new_password_hide_img")
	public WebElement hideNewPwdBut;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Current password entered'")
	public WebElement CurrentPasswordErrorPopup;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Not Now'")
	public WebElement UpdatePasswordPopup;

	@AndroidFindBy(id = "current_password_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
	public WebElement CurrentPasswordVisible;

	@AndroidFindBy(id = "account_info_layout")
	@iOSXCUITFindBy(id = "account_info_layout")
	public WebElement InfoIconUser;

	@AndroidFindBy(id = "paypal_account_emailid")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'PayPal'")
	public WebElement PaypalTextAccount;

	@AndroidFindBy(id = "payment_paypal_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Apple Pay'")
	public WebElement ApplePayTextAccount;

	@AndroidFindBy(id = "account_card_number")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '****'")
	public WebElement DebitCardAccount;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	public WebElement HeadTxtAccount;

	@AndroidFindBy(id = "header_left_txt")
	@iOSXCUITFindBy(xpath = "locator needed")
	public WebElement TandCCloseBtn;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(xpath = "locator needed")
	public WebElement TandCTitle;

	@AndroidFindBy(id = "//android.webkit.WebView/android.view.View/android.view.View[1][@text='INFORMATION']")
	@iOSXCUITFindBy(id = "INFORMATION")
	public WebElement ProductInfoInformation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso Nectar']")
	@iOSXCUITFindBy(id = "Esso Nectar")
	public WebElement ProductsAndInfoEssoNectar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='About Esso']")
	@iOSXCUITFindBy(id = "About Esso")
	public WebElement ProductsAndInfoAboutEsso;

//	@AndroidFindBy(xpath = "//*[@text='PRODUCTS']")
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\"PRODUCTS\"))")
	@iOSXCUITFindBy(id = "PRODUCTS")
	public WebElement ProductsAndInfoProducts;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[7]")
	public WebElement ProductAboutEsso;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]")
	public WebElement ProductEssoSynergy;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\"Esso Synergy™ Fuels\"))")
	@iOSXCUITFindBy(id = "Esso Synergy™ Fuels")
	public WebElement ProductsAndInfoEssoSynergy;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textMatches(\"Mobil Motor Oils\"))")
//	@AndroidFindBy(xpath = "//android.view.View/android.view.View[5][@text='Mobil Motor Oils']")
	@iOSXCUITFindBy(id = "Mobil Motor Oils")
	public WebElement ProductsAndInfoMobilMotor;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(id = "confirm_pwd_show_img")
	public WebElement ThirdShowButton;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.ImageView")
	@iOSXCUITFindBy(id = "confirm_pwd_hide_img")
	public WebElement ThirdHideButton;

	@AndroidFindBy(id = "confirm_new_pasword_et")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField	")
	public WebElement ConfirmPasswordVisible;

	@AndroidFindBy(id = "new_password_show_img")
	@iOSXCUITFindBy(id = "new_pwd_show_img")
	public WebElement SecondShowButton;

	@AndroidFindBy(id = "not needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	public WebElement KeypadDone;

	@AndroidFindBy(id = "new_password_EditText")
	@iOSXCUITFindBy(id = "new_pwd_EditText")
	public WebElement NewPasswordVisible;

	@AndroidFindBy(id = "current_password_et")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(id = "current_pwd_et"),
			@iOSXCUITBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")})
	public WebElement CurrentPassword;

	@AndroidFindBy(id = "new_password_EditText")
	@iOSXCUITFindBy(id = "new_pwd_EditText")
	public WebElement NewPassword1;

	@AndroidFindBy(id = "confirm_new_pasword_et")
	@iOSXCUITFindBy(id = "confirm_new_pwd_et")
	public WebElement ConfirmPassword;

	@iOSXCUITFindBy(id = "Done")
	public WebElement KayDone;

	@AndroidFindBy(id = "app_version")
	@iOSXCUITFindBy(id = "app_version")
	public WebElement VersionHelp;

	@AndroidFindBy(id = "locator required")
	@iOSXCUITFindBy(id = "Cancel")
	public WebElement LocationPermissionCancelPopup;

	@AndroidFindBy(id = "validations1")
	@iOSXCUITFindBy(id = "validations1")
	public WebElement PassValidation1EditPassword;

	@AndroidFindBy(id = "validations2")
	@iOSXCUITFindBy(id = "validations2")
	public WebElement PassValidation2EditPassword;

	@AndroidFindBy(id = "validations3")
	@iOSXCUITFindBy(id = "validations3")
	public WebElement PassValidation3EditPassword;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Go To Settings\"])[1]")
	public WebElement LocationGotoSettingsAccount;

	@AndroidFindBy(id = "password_validation_txt")
	@iOSXCUITFindBy(id = "pwd_validation_txt")
	public WebElement PasswordInlineErrorMessageEditPwd;

	@AndroidFindBy(id = "password_validation_txt")
	@iOSXCUITFindBy(id = "pwd_validation_txt")
	public WebElement NewPasswordInlineErrorAccount;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeWindow[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
	public WebElement TellAFriendMessageBodyField;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeOther' AND name BEGINSWITH 'Hey, I've been using'")
	public WebElement TellAFriendMessageBodyFieldWithoutLink;

	@AndroidFindBy(id = "referal_desc_text1")
	@iOSXCUITFindBy(id = "referal_desc_text1")
	public WebElement TellAFriendSubtitle;

	@AndroidFindBy(id = "referal_desc_text2")
	@iOSXCUITFindBy(id = "referal_desc_text2")
	public WebElement TellAFriendBody;

	@AndroidFindBy(id = "referal_btn")
	@iOSXCUITFindBy(id = "referal_btn")
	public WebElement TellAFriendButtonSendButton;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Messages\"]s")
	public WebElement TellAFriendMessageButton;

	@AndroidFindBy(id = "edit_comment_count")
	@iOSXCUITFindBy(id = "140/140")
	public WebElement exxon_Help_feedback_Charcter_Max;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public WebElement SiteIdHistory;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	public WebElement DateAndTransaction;

	@AndroidFindBy(id = "//android.widget.LinearLayout/android.widget.TextView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
	public WebElement TransactionAndDate;

	@AndroidFindBy(id = "locator needed")
	@iOSXCUITFindBy(id = "loyalty_title")
	public WebElement EssoTitleTranscationDetails;

	@AndroidFindBy(id = "note_details")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	public WebElement NoteWithoutEsso;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/preceding::XCUIElementTypeButton[@name='circleCheck']")
	@AndroidFindBy(id = "account_receipt_checkBox")
	public WebElement ReceiptCKbx;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/following::XCUIElementTypeButton[@name='circleCheck']")
	public WebElement promotionsCircleCheck_box;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/preceding::XCUIElementTypeButton[@name='circleUnCheck']")
	public WebElement emailUnCircleCheck_box;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='I would like to receive receipts by email.']/following::XCUIElementTypeButton[@name='circleUnCheck']")
	public WebElement promotionsUnCircleCheck_box;

	@iOSXCUITFindBy(id = "scan_clubcard")
	public WebElement ScanBarCodeNectarOffers;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CANCEL\"]")
	public WebElement CancelButtonCameraScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]")
	public WebElement LocationButtonDeviceSettings;

	@iOSXCUITFindBy(id = "Never")
	public WebElement NeverButtonDeviceSettings;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(id ="Settings")
	public WebElement LocSettingStation;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	@iOSXCUITFindBy(id = "While Using the App")
	public WebElement WhileusingButtonDeviceSettings;

	@AndroidFindBy(xpath = "//*[contains(@text,'Help us')]")
	@iOSXCUITFindBy(id = "help_section_feedback_subtitle")
	public WebElement EssoFeedbackSubtitle;

	@AndroidFindBy(id = "account_preauth_title")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Maximum Fuelling Amount\"]/following::XCUIElementTypeStaticText[1]")
	public WebElement AmountInMfaAccountScreen;

	@AndroidFindBy(id = "header_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"titleLabel\"]")
	public WebElement MaximumFuellingTitlePicker;

	@AndroidFindBy(id = "message")
	@iOSXCUITFindBy(id = "Your default maximum fuelling amount has been updated successfully.")
	public WebElement MfaSetSuccessfullyPopupAccount;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"test_number_picker_view\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypePicker[@name=\"pickerView\"]/XCUIElementTypePickerWheel/XCUIElementTypeOther[28]")
	public WebElement ScrollBar;

	@AndroidFindBy(id = "button_accept_all")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Accept All'")
	public static WebElement AcceptAll;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	@iOSXCUITFindBy(id = "settings_text")
	public WebElement SettingsBtnMore;

	@AndroidFindBy(id = "android:id/button2")
	public WebElement CallcancelButton;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[2][@text='Loyalty Points']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Loyalty Points']")
	public WebElement LP;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Will I still earn Nectar points if I use the app?'])[1]")
	public WebElement LPN;
	
	@AndroidFindBy(id = "list_item_text_child")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name='terms and conditions']")
	public WebElement FAQLink;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Back']")
	@iOSXCUITFindBy(id = "header_back_btn")
	public WebElement BackbuttonHeaderBack;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso App Feedback']")
	@iOSXCUITFindBy(id = "Esso App Feedback")
	public List<WebElement> FDHelp_Feedback1;

	@AndroidFindBy(id = "location_setting_title")
	public WebElement locationtitle;

	@AndroidFindBy(id = "location_continue_btn")
	public WebElement continue_btn;

	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	public WebElement permission_allow;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account']")
	@iOSXCUITFindBy(id = "account_text")
	public WebElement AccountBtn;

	@AndroidFindBy(id = "new_password_EditText")
	@iOSXCUITFindBy(id = "new_pwd_EditText")
	public WebElement NewPassword;

	@AndroidFindBy(xpath = "//*[contains(@text,'Login')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Login'")
	public WebElement AccountLogin;

	@AndroidFindBy(id = "account_nectar_edit")
	@iOSXCUITFindBy(id = "account_nectar_edit")
	public WebElement AccNectardelete;
}