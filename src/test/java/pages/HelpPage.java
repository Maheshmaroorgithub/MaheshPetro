package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class HelpPage extends GenericWrappers {

    public HelpPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "//action_more")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'More'")
    public WebElement moreIcon;

    @AndroidFindBy(id = "account_privacy_link")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Privacy Policy'")
    public WebElement AccountPrivacyPolicy;

    @AndroidFindBy(id = "account_privacy_link")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND label BEGINSWITH '****'")
    public WebElement AccountNectarCardWithStars;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(id = "header_left_txt")
    public WebElement exxon_Help_feedback_Close;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Support Centre']")
    @iOSXCUITFindBy(id = "support_centre_text")
    public WebElement supportcentreIcon;

    @AndroidFindBy(id = "account_add_nectarcard")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Add Nectar'")
    public static WebElement AccountAddNectarCardButton;

    @AndroidFindBy(id = "dashboard_greeting_msg")
    @iOSXCUITFindBy(id = "Nectar card added successfully")
    public WebElement NectarAddedSuccessfulTitle;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public WebElement ContinueButtonNectarSuccessful;

    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Verify later'")
    public static WebElement AccountNectarCardVerifyLaterPopup;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Skip'")
    public static WebElement AccountNectarVerifyLaterSkip;

    @AndroidFindBy(id = "add_loyalty_done_btn")
    @iOSXCUITFindBy(id = "add_loyalty_done_btn")
    public static WebElement NextButtonNectarCardAddScreen;

    @AndroidFindBy(id = "account_privacy_link")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeButton' AND name == 'Done'")
    public static WebElement DoneButtonInNectarKeypad;

    @AndroidFindBy(id = "text_help")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"helpAssistanceIcon\"]")
    public WebElement AppAssistantIcon;

    @AndroidFindBy(id = "text_help")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"helpAssistanceIcon\"]")
    public List<WebElement> AppAssistantButton;

    @AndroidFindBy(id = "text_app_assist")
    @iOSXCUITFindBy(id = "App Assistant")
    public WebElement AppAssistantTitle;

    @AndroidFindBy(id = "text_close")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Close\"]")
    public WebElement AppAssistantClose;

    @AndroidFindBy(id = "locator need")
    @iOSXCUITFindBy(id = "botIcon")
    public WebElement AppAssistantRobotIcon;

    @AndroidFindBy(id = "txt_assistant")
    @iOSXCUITFindBy(id = "Hi! I am App Assistant and I am here to help you. Select a popular topic below or search by typing in some key words.")
    public WebElement AppAssistantHeaderTxt;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pre-authorisation: what does it mean to me?\"]")
    public WebElement AppAssistantQuest1;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"What cards or wallets can I use in the Esso App?\"]\n")
    public WebElement AppAssistantQuest2;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.TextView")
        @iOSXCUITFindBy(id = "VAT receipts – what do I do if I don’t receive right away?")
    public WebElement AppAssistantQuest3;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[4]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(id = "Fuel as Guest – how is that different from registering?")
    public WebElement AppAssistantQuest4;

    @AndroidFindBy(id = "text_searchview")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search by keywords\"]")
    public WebElement AppAssistantSearchKeyword;

    @AndroidFindBy(id = "locator need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Got Questions?\"]")
    public WebElement GotQuestions;

    @AndroidFindBy(id = "locator need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CHECK OUT THE APP ASSISTANT\"]")
    public WebElement CheckoutAppAssistant;

    @AndroidFindBy(id = "neutral_func_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    public WebElement Skip;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.TextView")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'App Assistant, tell'")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=“App Assistant,tell me about Pre-authorisation: what does it mean to me?\\\"]")
    public WebElement PreAuthQuest;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.widget.RelativeLayout/android.widget.TextView[1]")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Pre-authorisation, or Maximum'")
    public WebElement PreAuthAns1;

    @AndroidFindBy(id = "txt_more_less")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"MORE\"]")
    public WebElement PreAuthMore;

    @AndroidFindBy(id = "txt_more_less")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"LESS\"]")
    public WebElement PreAuthLess;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.widget.RelativeLayout/android.widget.TextView[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'The bank will put a')]")
//    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\\\"Pre-authorisation, or Maximum Fuelling Amount, is how much your bank will let you spend on this transaction. You can set your budget at £20 to £140 to control how much fuel you purchase as well. • The bank will put a “hold” on the funds reserved as your Max Fuelling Amount or what the bank approves as your pre-authorised funds for each transaction, so keep this in mind if you are using your debit card. • You are only charged the actual fuelling amount which is shown on the dispenser and on your receipt. • If you have set a Max Fuelling Amount, the dispenser will generally stop £1 to £2 before that amount to avoid exceeding the budget. • Lastly, if you fuel less than 30 litres you can earn Nectar points, but you will not be rewarded with bonus Nectar points. \\\"]")
    public WebElement PreAuthFullAns;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[4]/android.widget.RelativeLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Did I answer your question?\"]")
    public WebElement PreAuthQuest2;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Yes, thank you!\"]")
    public WebElement PreAuthAnswer1;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Show me more topics.\"]")
    public WebElement PreAuthAnswer2;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"No, could I have some more help?\"]")
    public WebElement PreAuthAnswer3;

    @AndroidFindBy(id = "autoCompleteTextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"]")
    public WebElement keyboardSearchBtn;

    @AndroidFindBy(id = "image_back")
    @iOSXCUITFindBy(id = "BackButtonSmall")
    public WebElement BackBtn;

    @AndroidFindBy(id = "no_search_result_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sorry, no results found. Please type in different key words and try searching again.\"]")
    public WebElement SearchSorrryTxt;


    @AndroidFindBy(id = "description1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\\\"What’s New\\\"]")
    public WebElement WhatsNew;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Esso App Tutorial']")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND label == 'Esso App Tutorial'")
    public WebElement essoTutorialIcon;

    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(id = "tutorial_page_title")
    public WebElement FirstScreenTitle;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    @iOSXCUITFindBy(id = "tutorial_page_sub_title")
    public WebElement FirstScreenSubtitle;

    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(id = "tutorial_page_title")
    public WebElement SecondScreenTitle;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    @iOSXCUITFindBy(id = "tutorial_page_sub_title")
    public WebElement SecondScreenSubtitle;

    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(id = "tutorial_page_title")
    public WebElement ThirdScreenTitle;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    @iOSXCUITFindBy(id = "tutorial_page_sub_title")
    public WebElement ThirdScreenSubtitle;

    @AndroidFindBy(id = "next_btn")
    @iOSXCUITFindBy(id = "next_btn")
    public WebElement nextIcon;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[3]")
    public WebElement thirtypercent;

    @AndroidFindBy(id = "circular_progress_lid")
    public WebElement circularIndicator;

    @AndroidFindBy(id = "complete_profile_txt")
    public WebElement completeprofileIcon;

    @AndroidFindBy(id = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.LinearLayout")
    public WebElement addNdectarIcon;

    @AndroidFindBy(id = "alertTitle")
    public WebElement nectarAlreadyCompleted;

    @AndroidFindBy(id = "account_logout")
    @iOSXCUITFindBy(id = "account_logout")
    public static WebElement LogOut;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement nectarAlreadycompltdpopup;

    @AndroidFindBy(id = "done_btn")
    @iOSXCUITFindBy(id = "done_btn")
    public WebElement GetStartedThirdTutorial;

    @AndroidFindBy(id = "account_user_profile_title")
    @iOSXCUITFindBy(id = "account_user_profile_title")
    public static WebElement UserProfileAccount;

    @AndroidFindBy(id = "add_loyalty_entry_edit")
    @iOSXCUITFindBy(id = "add_loyalty_entry_edit")
    public WebElement NectarCardnumberEnter;
}
