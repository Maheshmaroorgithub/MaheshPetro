package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class RedemptionOptionPage extends GenericWrappers {
    public RedemptionOptionPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Login!\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login!\"]")
    public WebElement Loginlink;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField['value=\"Email\"']")
    public WebElement userName;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"NONE OF THE ABOVE\"]")
    @iOSXCUITFindBy(id = "cancel")
    public WebElement clickOnCancelbutton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Password\"]")
    @iOSXCUITFindBy(xpath = "///XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField['value=\"Password\"']")
    public WebElement password;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Login\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Login\"]")
    public WebElement loginButton;

    @AndroidFindBy(id = "btnClose")
    @iOSXCUITFindBy(id = "btnClose")
    public WebElement NectarCloseLIDPopUp;

    @AndroidFindBy(id = "continue_btn")
    @iOSXCUITFindBy(id ="continue_btn")
    public WebElement selectPumpContinue;

    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(id = "Sorry, there are no redemption options available for you at the moment. Keep fuelling to earn exciting rewards!")
    public WebElement RewardPopupMessage;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(id = "OK")
    public WebElement okButton;

    @AndroidFindBy(xpath = "//*[contains(@text,'None')]")
    public WebElement noneTxt;

    @AndroidFindBy(xpath = "//*[contains(@text,'Reward')]")
    public WebElement rewardSubtile;

    @AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
    public WebElement continueBtn;

    @AndroidFindBy(xpath = "//*[contains(@text,'300')]")
    public WebElement updatedRewardTxt;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'close')]")
    public WebElement deselectOffer;

}
