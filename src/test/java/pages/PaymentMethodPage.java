package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class PaymentMethodPage extends GenericWrappers {
    public PaymentMethodPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }



    @AndroidFindBy(id = "dashboard_login")
    @iOSXCUITFindBy(id = "dashboard_login")
    public WebElement Loginlink;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
    public WebElement userName;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"NONE OF THE ABOVE\"]")
    @iOSXCUITFindBy(id = "cancel")
    public WebElement clickOnCancelbutton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
    public WebElement password;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Login\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Login\"]")
    public WebElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public WebElement PassPhrase;

//    @AndroidFindBy(id = "submitButton")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Submit')]")
//    public WebElement PassPhraseSubmit;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[2]")
    public WebElement SelectOtherCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Save Password\"]")
    public WebElement SavePWD;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not Now\"]")
    public WebElement notNowPWD;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Not Now\"]")
    public List<WebElement> notNowPassword;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"More\"]")
    public WebElement moreLink;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.TextView")
    @iOSXCUITFindBy(id = "Account")
    public WebElement accountLink;

    @AndroidFindBy(xpath ="//android.widget.TextView[@text=\"Add Card\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add Payment Method\"]")
    public WebElement addCardLink;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public WebElement pinDigit1;

    @AndroidFindBy(id = "security_pin_entry_code1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")
    public List<WebElement> ListPinDigit1;

    @AndroidFindBy(id = "security_pin_entry_code2")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
    public WebElement pinDigit2;

    @AndroidFindBy(id = "security_pin_entry_code3")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]")
    public WebElement pinDigit3;

    @AndroidFindBy(id = "security_pin_entry_code4")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]")
    public WebElement pinDigit4;

    @AndroidFindBy(id = "security_pin_entry_continue_btn")
    @iOSXCUITFindBy(id = "security_pin_entry_continue_btn")
    public WebElement pinContinueButton;

    @AndroidFindBy(id ="button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeScrollView[2]/XCUIElementTypeOther[1]")
    public WebElement pinOkButton;

    @AndroidFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    public WebElement faceIDSkipButton;

    @AndroidFindBy(id = "visa_icon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[1]")
    public WebElement Visa_Icon;

    @AndroidFindBy(id = "master_icon")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage['index=0'])[2]")
    public WebElement master_Icon;

    @AndroidFindBy(id = "search_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Search\"]")
    public WebElement addressSearchIcon;

    @AndroidFindBy(id = "payment_security_code_et")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeSecureTextField")
    public static WebElement SecurityCode;

    @AndroidFindBy(id = "payment_bill_address_street")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[5]")
    public static WebElement Addrs1;

    @AndroidFindBy(id = "payment_bill_address_locality")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[6]")
    public static WebElement Addrs2;

    @AndroidFindBy(id = "payment_bill_address_city")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[7]")
    public static WebElement City;

    @AndroidFindBy(id = "payment_expdate_et")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[3]")
    public WebElement ExpDate;

    @AndroidFindBy(id = "payment_cardno_et")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[2]")
    public WebElement CardNo;

    @AndroidFindBy(id = "payment_bill_address_postcode")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther/XCUIElementTypeTextField)[4]")
    public static WebElement Postal;

    @AndroidFindBy(xpath="//*[contains(@text,'Cancel')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public WebElement paymentPageCancelButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Scan Your Card\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Scan Your Card\"]")
    public WebElement paymentScanButton;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Use Fingerprint to quickly authorise payments\"))")
    public WebElement ScrollToFingerPrintText;

    @AndroidFindBy(id = "no_search_result_text")
    @iOSXCUITFindBy(xpath = "//*[contains(@name,\"No results were found\")]")
    public WebElement noResultsText;


    @AndroidFindBy(id = "item_edit")
    //@AndroidFindBy(id = "com.firstdata.mpl.qa:id/item_edit")
    @iOSXCUITFindBy(xpath= "(//XCUIElementTypeStaticText[@name=\"Edit\"])[2]")
    public  WebElement CardEditLink;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Delete Card\"))")
    public WebElement ScrollToDeleteCardText;


    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"LOG OUT\"))")
    public WebElement ScrollToLogOutText;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Add Nectar Card\"))")
    public WebElement ScrollToAddNectarCardText;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Add Card\"))")
    public WebElement ScrollToAddCardText;

    @AndroidFindBy(id = "payment_cvv_info_icon")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Info\"]")
    public WebElement iIconInPaymentScreen;

    @AndroidFindBy(id = "info_dialog_gotit_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Got It\"]")
    public WebElement gotItButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Choose Default Method\"]")
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Choose Default Method\"]")
    public WebElement defaultPaymentMethodButton;

    @AndroidFindBy(id="defaultpicket_ok_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"doneButton\"]")
    public WebElement doneButton;

    @AndroidFindBy(id = "account_user_profile_title")
    @iOSXCUITFindBy(id = "account_user_profile_title")
    public static WebElement UserProfileAccount;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Delete Card\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete Card\"]")
    public WebElement deleteCardButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you sure you want to delete this card?\"]")
    public WebElement deleteCardPopupText;

    @AndroidFindBy(id="android:id/button2")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Cancel\"])[1]")
    public WebElement CancelOnDeleteCardPopup;

    @AndroidFindBy(id = "com.google.android.gms:id/cancel")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NONE OF THE ABOVE\"]")
    public WebElement NONEOFTHEABOVE;

    @AndroidFindBy(id = "payment_details_update_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeButton")
    public WebElement UpdateBtn;

    @AndroidFindBy(id="android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Card deleted successfully.\"]")
    public WebElement DeletedCardSuccessMessage;

    @AndroidFindBy(id="android:id/button1")
    @iOSXCUITFindBy(id = "OK")
    public WebElement okButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"DELETE\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete\"]")
    public WebElement confirmDeleteButton;

    @AndroidFindBy(xpath = "//*[contains(@text,'You can only')]")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' AND name BEGINSWITH 'You can only'")
    public  WebElement MaxFiveCardMessage;

    @AndroidFindBy(id = "payment_name_et")
    @iOSXCUITFindBy(xpath="(//XCUIElementTypeOther/XCUIElementTypeTextField)[1]")
    public static WebElement NameOnCard;

    @AndroidFindBy(id = "submitButton")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Submit')]")
    public WebElement PassPhraseSubmit;
}
