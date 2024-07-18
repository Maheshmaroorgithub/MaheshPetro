package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class OffersPage extends GenericWrappers {
	public OffersPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	@AndroidFindBy(id = "edtSearch")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Enter Postcode or City\"]")
	public WebElement StationSearch;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Birmingham, UK\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Birmingham, UK\"]")
	public WebElement StationSelect;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Birmingham, UK\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Porthgain, Haverfordwest, UK\"]")
	public WebElement StationSelectCommon;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Chesterfield, UK\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,\"Chesterfield, UK\")]")
	public WebElement StationSelectNonMobilePay;

	@AndroidFindBy(id = "account_add_nectarcard")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
	public static WebElement AccountAddNectarCardButton;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.Button[starts-with(@text, 'A')]")
	@iOSXCUITFindBy(id = "Allow Once")
	public WebElement StationAllow;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
	public static WebElement DontallowCancel;

	@AndroidFindBy(id = "txtMileAndLoc")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell")
	public List<WebElement> address_Station_List;

	@AndroidFindBy(id = "header_back_btn")
	@iOSXCUITFindBy(id = "NavBack")
	public WebElement NavBack;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell")
	public List<WebElement> StationCluster;

//	@AndroidFindBy(id = "Locator Need")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"View Details\"]" )
//	public List<WebElement> ViewDetailsBtn;

	@AndroidFindBy(xpath = "//*[contains(@text,'View Details')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"View Details\"]")
	public WebElement ViewDetailsBtn;
	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Close Icon")
	public List<WebElement> CloseButtonModalPopupLid1;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='More']")
	@iOSXCUITFindBy(id = "More")
	public WebElement AccountMore;

	@AndroidFindBy(xpath = "//*[contains(@text,'Fuel')]")
	@iOSXCUITFindBy(id = "Fuel")
	public WebElement FuelTab;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(id = "Banner close" )
	public WebElement GotItClose;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Got It\"]" )
	public WebElement GotItBtn;


	@AndroidFindBy(id = "pop_up_imageview")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"promotional_banner\"]")
	public WebElement StationOfferImg;

	@AndroidFindBy(id = "dashboard_start_option_outer_img")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement LIDCMPLTDASH;

	@AndroidFindBy(id = "title_text_view")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Fuel at'")
	public WebElement StationOfferTtl;

	@AndroidFindBy(id = "description_text_view")
	@iOSXCUITFindBy(id = "See current promotions and rewards when you log into the app!")
	public WebElement StationOfferDes;

	@AndroidFindBy(id = "description_text_view")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
	public WebElement ModalPopupCt;

	@AndroidFindBy(id = "description_text_view")
	@iOSXCUITFindBy(id = "Verify your Nectar card to see exclusive offers!")
	public WebElement StationOfferDes1;

	@AndroidFindBy(id = "description_text_view")
	@iOSXCUITFindBy(id = "Add your Nectar card to see exclusive offers and collect points with every fill!")
	public WebElement StationOfferDes2;

	@AndroidFindBy(id = "dismiss_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Got It\"]")
	public WebElement StationOfferGotIt;

	@AndroidFindBy(id = "dismiss_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Got It\"]")
	public List<WebElement> StationOfferGotItButton;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Banner close")
	public WebElement StationOfferClose;

	@AndroidFindBy(id = "cancel")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement NoneLogin;

	@AndroidFindBy(id = "dc_logo_white")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement NectarLogo;

	@AndroidFindBy(id = "txtoffer")
	@iOSXCUITFindBy(id = "txtoffer")
	public WebElement OfferLink;

	@AndroidFindBy(id = "okay_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'OK'")
	public WebElement StartFuelingPopUpOk;

	@AndroidFindBy(id = "how_it_work")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"HOW IT WORKS\"]")
	public WebElement HIW;

	@AndroidFindBy(id = "title_text_view")
	@iOSXCUITFindBy(id = "title_text_view")
	public WebElement PointsSec;

	@AndroidFindBy(id = "pay_points_lyt")
	@iOSXCUITFindBy(id = "Rewards")
	public WebElement RewardsSec;

	@AndroidFindBy(id = "pay_points_lyt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify your Nectar card to\"]")
	public WebElement VerifyNectarCard;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Collect points\"]")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Collect points\"]")
	public WebElement CollectPtsLnk;

	@AndroidFindBy(id = "see_all_partnr")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Find out more about Nectar\"]")
	public WebElement FindOutMoreNectar;


	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Get exclusive offers\"]")
	@iOSXCUITFindBy(id = "Get exclusive offers")
	public WebElement GetExclusiveOffers;

	@AndroidFindBy(id = "list_item_earning_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"More about collecting points\"]")
	public WebElement MoreCollectpoints;

	@AndroidFindBy(id = "earn_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"COLLECT MORE NECTAR POINTS\"]")
	public WebElement CollectMoreHead;

	@AndroidFindBy(id = "esso_logo_tm")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeNavigationBar[@name=\"ClientSDK.PLOffersVC\"]/XCUIElementTypeImage")
	public WebElement EssoTM;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"Find out more\"))")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Find out more about Nectar\"]")
	public WebElement FindMoreLnk;

	@AndroidFindBy(id = "login_dc_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
	public WebElement AddNectarBtn;

	@AndroidFindBy(id = "login_dc_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
	public WebElement AddNectarCardBtn;

	@AndroidFindBy(id = "btnClose")
	@iOSXCUITFindBy(id = "Close Icon")
	public static WebElement CloseButtonModalPopupLid;

	@AndroidFindBy(id = "learn_more_nector")
	@iOSXCUITFindBy(id = "Learn more")
	public WebElement LIDLearnMore;

	@AndroidFindBy(id = "add_loyalty_entry_edit")
	@iOSXCUITFindBy(id = "add_loyalty_entry_edit")
	public WebElement NectarEnter;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Card added'")
	public WebElement NectarCardAddedSuccessPopup;

	@AndroidFindBy(id = "verify_now_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "Needed")
	public WebElement AddNowButton;


	@AndroidFindBy(id = "add_loyalty_done_btn")
	@iOSXCUITFindBy(id = "add_loyalty_done_btn")
	public WebElement NectarNxt;

	@AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Continue'")
	public WebElement Continue;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Continue'")
	public WebElement ContinueNectarPopup;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeButton[@name=\"Continue\"])[2]")
	public WebElement ContinueNectarPopuponNectarSuccessScreen;

	@AndroidFindBy(id = "dashboard_greeting_msg")
	@iOSXCUITFindBy(id = "Nectar card added successfully")
	public WebElement NectarAddedSuccessfulTitle;
	
	@AndroidFindBy(id = "android:id/button2")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Verify later'")
	public WebElement VerifyLater;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath="\t\n" +
			"//XCUIElementTypeButton[@name=\"Skip\"]")
	public WebElement skip_BTN;

	@AndroidFindBy(id = "see_all_partnr")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Find out more about Nectar\"]")
	public static WebElement FindMoreHomeLnk;

	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Collect and spend Nectar points with hundreds of brands.\"]")
	public WebElement FindMoreMsgLnk;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nectar card added successfully\"]")
	public WebElement NectarCardSuccess;

	@AndroidFindBy(id = "pay_with_paypal_btn")
	@iOSXCUITFindBy(id = "pay_with_paypal_btn")
	public WebElement PayPalButn;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement ContinueNectarCard;

	@AndroidFindBy(id = "loyalty_cardno_validation_txt")
	@iOSXCUITFindBy(id = "loyalty_cardno_validation_txt")
	public WebElement NectarcardInlineError;


	@AndroidFindBy(id = "top_verify_status_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Verify card\"]")
	public WebElement VerifyCardTTL;

	@AndroidFindBy(id = "verify_now_btn")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"VERIFY NOW\"]")
	public WebElement VerifyNowBtn;

	@AndroidFindBy(id = "tutorial_four_mobile_iv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeImage[2]")
	public WebElement TutorialImg;

	@AndroidFindBy(id = "action_fuel")
	@iOSXCUITFindBy(id = "Fuel")
	public WebElement Fuel;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Start']")
	@iOSXCUITFindBy(id = "start_button")
	public static WebElement payButton;

	@AndroidFindBy(xpath = "//android.view.View/android.view.View[2][@text='Link your account']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Link your account\"]")
	public WebElement LinkAccTxt;

	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Cancel and return to ESSO\"]/android.widget.Button")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"Cancel and return to ESSO\"]")
	public WebElement CancelReturnEssoLink;

	@AndroidFindBy(id = "safe_travel")
	@iOSXCUITFindBy(id = "safe_travel")
	public WebElement SafeTravelsTxt;

	@AndroidFindBy(id = "payment_confirmation_drive_text")
	@iOSXCUITFindBy(id = "payment_confirmation_drive_text")
	public WebElement PaymentSuccessTxt;

	@AndroidFindBy(id = "payment_confirmation_add_club_card_text")
	@iOSXCUITFindBy(id ="Card added successfully, you will start earning points. You need to verify your card to see your exclusive rewards.")
	public WebElement NectarCardTransTxt;

	@AndroidFindBy(id = "payment_confirmation_add_club_card_text")
	@iOSXCUITFindBy(iOSNsPredicate = "type =='XCUIElementTypeStaticText' AND name BEGINSWITH 'Card verified successfully,'")
	public WebElement NectarCardVerifiedTransTxt;

	@AndroidFindBy(id = "payment_confirmation_full_receipt_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transaction Details\"]")
	public WebElement TransDetailsLink;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public WebElement LinkAccOkBtn;

	@AndroidFindBy(id = "Locator Need")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Your card will not be linked and you won’t be able to spend your Nectar points with ESSO\"]")
	public WebElement PopUpTxt;

	@AndroidFindBy(id = "top_verify_status_text")
	@iOSXCUITFindBy(id = "Verify card")
	public WebElement VerifyCardTxt;

	@AndroidFindBy(id = "nectar_number_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Nectar Card: ****6060\"]")
	public WebElement NectarCard;

	@AndroidFindBy(id = "loyalty_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"POINTS\"]")
	public WebElement Nectarpoints;

	@AndroidFindBy(id = "loyalty_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public WebElement Nectarpointsinteger;

	@AndroidFindBy(id = "loyalty_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"-\"]")
	public WebElement NilNectarpoints;

	@AndroidFindBy(id = "account_add_nectarcard")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
	public WebElement AddNectar;

	@AndroidFindBy(id = "nectar_card_details")
	@iOSXCUITFindBy(id = "nectar_card_details")
	public WebElement AccNectarcard;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Terms and Conditions']")
	public static WebElement TermsAndConditionElement;

	@AndroidFindBy(id = "account_nectar_edit")
	@iOSXCUITFindBy(id = "account_nectar_edit")
	public WebElement AccNectardelete;

	@AndroidFindBy(id = "account_user_profile_title")
	@iOSXCUITFindBy(id = "account_user_profile_title")
	public static WebElement UserProfileAccount;

	@AndroidFindBy(id = "account_password_edit")
	@iOSXCUITFindBy(id = "account_pwd_edit")
	public static WebElement PasswordEdit;

	@AndroidFindBy(id = "account_privacy_link")
	@iOSXCUITFindBy(id = "account_privacy_link")
	public WebElement AccountPrivacyPolicy;

	@AndroidFindBy(id = "account_logout")
	@iOSXCUITFindBy(id = "account_logout")
	public static WebElement LogOut;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Delete'"),
			@iOSXCUITBy(id = "button1")})
	public WebElement Deletecnf;

	@AndroidFindBy(id = "android:id/button2")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Verify later'")
	public static WebElement AccountNectarCardVerifyLaterPopup;

	@AndroidFindBy(xpath = "//*[@text='Skip']")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Skip'")
	public static WebElement AccountNectarVerifyLaterSkip;

	@AndroidFindBy(id = "nectar_logo_image")
	@iOSXCUITFindBy(id = "dp2NectatNIcon2")
	public WebElement HCLogo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='How to collect points']")
	@iOSXCUITFindBy(id = "How to collect points")
	public WebElement HCTtl;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.RelativeLayout")
	@iOSXCUITFindBy(id = "1 litre of fuel")
	public WebElement HC1;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[2]/android.widget.RelativeLayout")
	@iOSXCUITFindBy(id = "£1 spent on shop")
	public WebElement HC2;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]/android.widget.RelativeLayout")
	@iOSXCUITFindBy(id = "£1 spent on car wash")
	public WebElement HC3;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[4]/android.widget.RelativeLayout")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH '£1 spent on Mobil'")
	public WebElement HC4;

	@AndroidFindBy(id = "authorising_please_wait_text")
	@iOSXCUITFindBy(id = "authorising_please_wait_text")
	public static WebElement AuthHead;

	@AndroidFindBy(xpath = "//*[contains(@text,'Authorising your')]")
	@iOSXCUITFindBy(id = "authorising_sub_desc_text")
	public static WebElement AuthDes;

	@AndroidFindBy(id = "nectar_copy_txt2_in_tesco_screen")
	@iOSXCUITFindBy(xpath ="(//XCUIElementTypeButton[1])[1]")
	public WebElement VerifyNectarTransdone;

	@AndroidFindBy(id = "nectar_copy_txt2_in_tesco_screen")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Verify your Nectar card to get exclusive Esso rewards.\"]")
	public WebElement VerfiyNectarCardTransdone;

	@AndroidFindBy(id = "nectar_copy_txt2_in_tesco_screen")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' and name BEGINSWITH 'Add your Nectar card to'")
	public WebElement AddNectarCardTransDone;

	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	@iOSXCUITFindBy(id ="Do you have a Nectar card?")
	public WebElement AddNectarCardText;

	@AndroidFindBy(id = "img_close")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"rewardViewClose\"]")
	public WebElement HCclose;

	@AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.widget.Image")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement NowFuelingLoader;

	@AndroidFindBy(id = "fueling_counter_startfueling_text")
	@iOSXCUITFindBy(id = "Start fuelling now")
	public WebElement StartFuelingNow;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Now fuelling']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Now fuelling\"]")
	public WebElement NowFueling;

	@AndroidFindBy(id = "pump_select_paymentdetails_btn")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public static WebElement ChangePayment;

	@AndroidFindBy(id = "pre_transaction_summary_clubcard_icon")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement CPNectarLogo;

	@AndroidFindBy(id = "pre_transaction_summary_clubcard_title")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement CPNectarTtl;

	@AndroidFindBy(id = "account_your_nectar_collect_review_txt")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement CPNectDes;

	@AndroidFindBy(id = "pre_transaction_summary_add_clubcard")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement CPNectAdd;

	@AndroidFindBy(id = "offers_banner_image_view")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement OffImg;

	@AndroidFindBy(id = "offer_points_tv")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+500 Points Points Points Points Points Points Points Points Points PointsPoints Points PointsPoints\"]")
	public WebElement OffTTL;

	@AndroidFindBy(xpath = "//*[contains(@text,'View Offer')]")
	@iOSXCUITFindBy(id = "View Offer")
	public WebElement OffDes;

	@AndroidFindBy(id = "active_coupon_btn")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"View Offer\"])[2]")
	public WebElement OffLoadBtn;

	@AndroidFindBy(id = "card_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"+500 points\"]")
	public WebElement OffOTTL;

	@AndroidFindBy(id = "offer_desc")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"when you fuel at Esso (test)\"]")
	public WebElement OffODes;

	@AndroidFindBy(id = "terms_and_conditions_txt")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]")
	public WebElement OffOTC;

	@AndroidFindBy(xpath = "//*[contains(@text,'View Offer')]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"View Offer\"])[1]")
	public WebElement ViewOffer;

	@AndroidFindBy(id = "note_header")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Banner close\"]")
	public WebElement ViewOfferClose;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Mobile Payment Enabled')]")
	public WebElement MobilePaymentEnabledService;

	@AndroidFindBy(id = "note_header")
	@iOSXCUITFindBy(id = "How to get this offer")
	public WebElement OffNoteTTl;

	@AndroidFindBy(id = "offer_no_1")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement OffNoteDes;

	@AndroidFindBy(id = "load_btn")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public WebElement OffOLoadBtn;

	@AndroidFindBy(id = "load_btn")
	@iOSXCUITFindBy(id = "Your Nectar card")
	public WebElement YourNectarCard;

	@AndroidFindBy(id = "load_btn")
	@iOSXCUITFindBy(id = "Tap here to scan")
	public WebElement TapHere;

	@AndroidFindBy(id = "loyalty_points_lbl")
	@iOSXCUITFindBy(id = "POINTS")
	public WebElement PointsTxt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms and Conditions']")
	@iOSXCUITFindBy(id = "Terms and Conditions")
	public WebElement OffTCTTL;

	@AndroidFindBy(id = "terms_and_conditions_txt")
	@iOSXCUITFindBy(id = "1. Offer valid on the first qualifying transaction after Loading to card 2. Bonus points will only be awarded to the registered account holder of the Nectar card presented at the time of the Qualifying Purchase. 3. Bonus points are non-transferable and there are no cash or prize alternatives available. Your statutory rights are not affected. 4. Points will be awarded within 28 days of offer expiry.")
	public WebElement OffTCdes;

	@AndroidFindBy(id = "close_img")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"closeWhiteSmall\"]")
	public WebElement OffTCClose;

	@AndroidFindBy(xpath = "//*[contains(@text,'Save on fuel')]")
	@iOSXCUITFindBy(id = "Save on fuel with points")
	public WebElement RedemptionSaveTxt;

	@AndroidFindBy(id = "cross_img_daisy")
	@iOSXCUITFindBy(id = "rewardViewClose")
	public WebElement RedemptionViewClose;

	@AndroidFindBy(xpath = "//*[contains(@text,'CHOOSE AN OPTION')]")
	@iOSXCUITFindBy(id = "CHOOSE AN OPTION OR CONTINUE")
	public WebElement RedemptionChooseOption;

	@AndroidFindBy(xpath = "//*[contains(@text,'5p/litre Off')]")
	@iOSXCUITFindBy(id = "5p/litre Off")
	public static WebElement RedemptionOption1;

	@AndroidFindBy(xpath = "//*[contains(@text,'10p/litre Off')]")
	@iOSXCUITFindBy(id = "10p/litre Off")
	public WebElement RedemptionOption2;

	@AndroidFindBy(id = "locator need")
	@iOSXCUITFindBy(id = "rewardCellClose")
	public WebElement RedemptionRewardCellClose;

	@AndroidFindBy(id = "loyalty_edit")
	@iOSXCUITFindBy(id = "loyalty_edit")
	public static WebElement RewardEdit;

	@AndroidFindBy(id = "reward_title")
	@iOSXCUITFindBy(id = "Reward")
	public WebElement RedemptionReward;

	@AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
	public WebElement RedemptionContinue;

	@AndroidFindBy(id = "confirm_payment")
	@iOSXCUITFindBy(id = "confirm_payment")
	public WebElement ConfirmPayment;

	@AndroidFindBy(id = "verify_nectar_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Your Nectar card\"]")
	public WebElement ViewNectarCrd;

	@AndroidFindBy(id = "card_number_header")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Card number\"]")
	public WebElement DigiCardHead;

	@AndroidFindBy(id = "card_number")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"****6060\"]")
	public WebElement DigiCardNum;

	@AndroidFindBy(id = "barcode_img")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage")
	public WebElement DigiBarcode;

	@AndroidFindBy(id = "note_header")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Never miss out on points again\"]")
	public WebElement DigiNoteHead;

	@AndroidFindBy(id = "note_desc")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"This digital card can be used instead of your plastic card.\"]")
	public WebElement DigiNoteTtl;

	@AndroidFindBy(id = "clubcard_img")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"boxIcon\"]")
	public WebElement DigiLogo;

	@AndroidFindBy(id = "cross_img")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"closeWhite\"]")
	public WebElement DigiClose;

//	@AndroidFindBy(id = "card_holder_name")
//	@iOSXCUITFindBy(xpath = "\t\n" +
//			"//XCUIElementTypeStaticText[@name=\"Sujitha\"]")
//	public WebElement DigiFName;
//
//	@AndroidFindBy(id = "card_holder_last_name")
//	@iOSXCUITFindBy(xpath = "\t\n" +
//			"//XCUIElementTypeStaticText[@name=\"Sujitha\"]")
//	public WebElement DigiLName;

	@AndroidFindBy(id = "childItemLayout")
	@iOSXCUITFindBy(xpath = "NeedLocator")
	public List<WebElement> FilterOption;

	@AndroidFindBy(id = "serv_fac_apply_filter_btn")
	@iOSXCUITFindBy(id = "serv_fac_apply_filter_btn")
	public WebElement FilterApplyBtn;

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[5]/android.widget.Button"),
			@AndroidBy(xpath = "//*[@text='Continue']"),
			@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]/android.widget.Button")})
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement VerifyNectarCont;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
	public WebElement OpenHours;

	@AndroidFindAll({
			@AndroidBy( xpath = "//android.view.View[1]/android.view.View[2]/android.widget.EditText"),
			@AndroidBy( xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText")})
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Nectar Login\"]/XCUIElementTypeTextField")
	public WebElement VerifyNectarnum;

	@AndroidFindBy(xpath = "//android.view.View[1]/android.view.View[2]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell")
	public List<WebElement> FilterFacilities;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Nectar Login\"]/XCUIElementTypeSecureTextField")
	public WebElement VerifyNectarPass;

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.view.View[2]/android.widget.EditText[@resource-id='VERIFICATIONCODE']"),
			@AndroidBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText")})
	@iOSXCUITFindAll(value = {
			@iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"Nectar Login\"]/XCUIElementTypeSecureTextField"),
			@iOSXCUITBy(id = "Link account")})
	public WebElement OTP;

	@AndroidFindBy(id = "load_img3")
	public static WebElement AuthLoad;

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.Button[@text='Link account']"),
			@AndroidBy(xpath = "//*[@text='Link account']")})
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Link account\"]")
	public WebElement OTPDone;

	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeOther[@name=\"OFFERS\"]")
	public WebElement OffersNect;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Payment method : Visa']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Payment method: Visa\"]")
	public WebElement PaymentMethodLinkVisa;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Payment method : PayPal']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Payment method: Paypal\"]")
	public WebElement PaymentMethodLinkPaypal;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Payment Method']")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"Payment Method\"]")
	public WebElement PaymentMethodTxt;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso Nectar']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Esso Nectar\"]")
	public WebElement EssoNectarTxt;

	@AndroidFindBy(id = "payment_details_update_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	public WebElement PaymentContinueBtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='+Add Nectar Card']")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"+ Add Nectar Card\"]")
	public WebElement PaymentAddNectarCard;

	@AndroidFindBy(id = "dashboard_nectar_balance")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"See your Nectar balance.\"]")
	public WebElement SeeYourNectBalink;

	@AndroidFindBy(id = "learn_more_nector")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Learn more\"]")
	public WebElement LearnMoreLink;

	@AndroidFindBy(id = "get_started_btn")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"Get Started\"]")
	public WebElement GetStartedBtn;

	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeStaticText[@name=\"Bonus Points\"]")
	public WebElement BonusPoints;

	@AndroidFindBy(id = "verify_now_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"YES, ADD NOW\"]")
	public WebElement YesAddNow;

	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Nectar Card\"]")
	public WebElement AddNectarCardheaderLearnmore;

	@AndroidFindBy(id = "signup_textview")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"No, sign up\"]")
	public WebElement NoSignUpBtn;

	@AndroidFindBy(id = "login_dc_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Verify Nectar Card\"]")
	public WebElement VerifyNectarCardBtn;

	@AndroidFindBy(id = "learn_more")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"What is Nectar?\"]")
	public WebElement WhatisNectarTxt;

	@AndroidFindBy(id = "com.google.android.gms:id/cancel")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NONE OF THE ABOVE\"]")
	public static WebElement NONEOFTHEABOVE;

	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Email Settings\"))")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Email Settings\"]")
	public static WebElement EmailSettings;
//
//	@AndroidFindBy(id = "payment_confirmation_done_btn")
//	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'DONE'")
//	public WebElement DoneBtn;

	@AndroidFindBy(id = "loyalty_points")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"POINTS\"]/preceding-sibling::XCUIElementTypeStaticText")
	public WebElement PointsBalanceOffersScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'nectar_points')]//*")
	public List<WebElement> nectarPointsonLID;

	@AndroidFindBy(xpath = "//*[contains(@text,'You have')]")
	public WebElement nectarPointsonRedemptionScreen;

	@AndroidFindBy(xpath = "//*[contains(@text,'You have')]")
	public WebElement youHavetxtLID;

	@AndroidFindBy(xpath ="//*[contains(@text,'Nectar points')]" )
	public WebElement nectarPointstxtLID;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'rewards_descrip')]//*[contains(@resource-id,'image')]")
	public WebElement redemptionInfoIcon;

	@AndroidFindBy(xpath = "//*[contains(@text,'applies')]")
	public WebElement discountMessage;

	@AndroidFindBy(xpath = "//*[contains(@text,'GOT IT')]")
	public WebElement gotItButRedemption;

	@AndroidFindBy(id = "Needed")
	@iOSXCUITFindBy(id = "successImage")
	public WebElement NectarAddedSuccessfullyScreenImage;

	@AndroidFindAll({
			@AndroidBy(xpath = "//android.widget.ImageButton[@content-desc='Cancel']"),
			@AndroidBy(id = "header_left_txt")
	})
	@iOSXCUITFindBy(id = "header_left_txt")
	public WebElement CancelButtonDoYouHaveANectarCardScreen;

	@AndroidFindBy(id = "dashboard_help_msg_social")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"After adding your card, you will have to verify your account to see your bonus offers.\"]")
	public WebElement NectarAddedSuccessfullyScreenSubtitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Account']")
	@iOSXCUITFindBy(id = "account_text")
	public WebElement AccountBtn;

	@AndroidFindBy(id = "android:id/button1")
	@iOSXCUITFindBy(id = "OK")
	public WebElement PopUpOK;

	@AndroidFindBy(id = "cancel_btn")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
	public WebElement CancelSelectYourPumpScreen;

	@AndroidFindBy(id = "header_right_txt")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
	public WebElement AccountSkip;

	@AndroidFindBy(id = "android:id/message")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert//XCUIElementTypeStaticText~xpath")
	public WebElement AccountMessage;

	@iOSXCUITFindBy(id = "header_filter")
	@AndroidFindBy(id = "header_filter")
	public WebElement StationFilter;

	@AndroidFindBy(id = "continue_btn")
	@iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name == 'Continue'")
	public WebElement ContinueButtonRedemptionScreen;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
	@AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
	public static WebElement nectarCardContinueBtn;

	@AndroidFindBy(id = "account_nectar_title")
	@iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Push Notifications'")
	public WebElement AccountNectarCardSection;

	@AndroidFindBy(id = "header_left_txt")
	@iOSXCUITFindBy(xpath = "\t\n" +
			"//XCUIElementTypeButton[@name=\"Cancel and return to ESSO\"]")
	public WebElement PrivacyCloseBtn;

	@AndroidFindBy(id = "tutorial_page_title")
	@iOSXCUITFindBy(id = "tutorial_page_title")
	public WebElement WelcomTtl;

	@AndroidFindBy(id = "tutorial_page_sub_title")
	@iOSXCUITFindBy(id = "tutorial_page_sub_title")
	public WebElement SubtitleSecondScreen;

	@AndroidFindBy(id = "done_btn")
	@iOSXCUITFindBy(id = "done_btn")
	public WebElement exxon_Help_Tutorial_GetStartedBtn;
}
