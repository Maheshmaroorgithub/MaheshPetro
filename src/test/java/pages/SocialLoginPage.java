package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class SocialLoginPage extends GenericWrappers {
        public SocialLoginPage()
        {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);

        }
    @AndroidFindBy(xpath = "locator need")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"fbNew\"]")
    public WebElement FbIcon;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeTextField")
    public WebElement FbUserName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeSecureTextField")
    public WebElement FbPassword;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'u_0_4')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Log In\"]")
    public WebElement FbLoginBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name=\"In order to reset your Esso PIN, an email will be sent to your address: essotesting234@gmail.com\"]")
    public WebElement ForgotPinText;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SEND\"]")
    public WebElement ForgotPinSendBtn;

    @AndroidFindBy(xpath = "locator need")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeButton[@name=\"twitterNew\"]")
    public WebElement TwitterIcon;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "iOSNsPredicate = \"type== 'XCUIElementTypeStaticText\n" +
            "' AND name == ‘Forgot PIN’")
    public WebElement ForgotPinTitle;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "iOSNsPredicate = \"type== 'XCUIElementTypeStaticText\n" +
            "' AND name == ‘Cancel’")
    public WebElement ForgotPinCancelBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "iOSNsPredicate = \"type== 'XCUIElementTypeStaticText\n" +
            "' name BEGINSWITH ‘We have sent you instructions’")
    public WebElement ForgotPinPopUpText;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    public WebElement TwitterUserName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Email\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField")
    public WebElement TwitterPwd;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'u_0_4')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign In\"]")
    public WebElement TwitterLoginBtn;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[1]")
    public WebElement Facebook_Privacy_policy_tc_checkbox;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"circleUnCheck\"])[2]")
    public WebElement Facebook_Receive_emails_tc_checkbox;

    @iOSXCUITFindBy(id = "I accept the Privacy Policy and Terms and Conditions.")
    public WebElement Facebook_Privacy_policy_tc_txt;

    @iOSXCUITFindBy(id = "I’d like to receive emails from Esso about topics that may interest me, promotions and Nectar offers.")
    public WebElement Facebook_Receive_emails_tc_txt;

}
