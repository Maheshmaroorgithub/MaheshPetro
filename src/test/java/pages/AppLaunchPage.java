package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class AppLaunchPage extends GenericWrappers {
    public AppLaunchPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
    public WebElement userName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
    @iOSXCUITFindBy(xpath = "///XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
    public WebElement password;

    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(id = "tutorial_page_title")
    public static WebElement welComeScreen;

    @AndroidFindBy(id = "tutorial_page_title")
    @iOSXCUITFindBy(id = "tutorial_page_title")
    public WebElement TutorialScreen2Title;

    @AndroidFindBy(id = "header_right_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Skip\"]")
    public static WebElement TutorialSkipButton;

    @AndroidFindBy(id = "button_accept_all")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Accept All\"]")
    public WebElement acceptAllButtonAppLaunch;

    @AndroidFindBy(id = "next_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Next\"]")
    public WebElement tutorialNextButton;

    @AndroidFindBy(id = "done_btn")
    @iOSXCUITFindBy(id = "done_btn")
    public WebElement tutorialGetStartedButton;

    @AndroidFindBy(id = "nectar_points_lyt")
    public WebElement nectarPointLID;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    @iOSXCUITFindBy(id = "tutorial_page_sub_title")
//    @iOSXCUITFindBy(id = "Use the Esso App to pay from your car and earn fuel rewards.")
    public WebElement subTitleText;

    @AndroidFindBy(id = "tutorial_page_sub_title")
    @iOSXCUITFindBy(id = "tutorial_page_sub_title")
    public static WebElement WelcomSUBTtl_2;

    @AndroidFindBy(id = "no need")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]"),
            @iOSXCUITBy(id = "button1")})
    public WebElement CameraAccessOkPopup;

    @AndroidFindBy(id = "no need")
    @iOSXCUITFindBy(id = "OK")
    public WebElement FaceIdAccessOkPopup;

    @AndroidFindBy(id = "com.google.android.gms:id/cancel")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"NONE OF THE ABOVE\"]")
    public WebElement NONEOFTHEABOVE;
}
