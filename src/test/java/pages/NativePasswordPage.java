package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class NativePasswordPage extends GenericWrappers {

	public NativePasswordPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
	@iOSXCUITFindBy(id = "Save Password")
	public WebElement LoginSavePwd;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_reject")
	@iOSXCUITFindBy(id = "Not Now")
	public WebElement LoginSaveNever;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
	@iOSXCUITFindBy(id = "NeedLocator")
	public WebElement LoginSave;

	@AndroidFindBy(id = "Locator need")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Would you like to save this password in your Keychain to use with apps and websites?\"]")
	public WebElement SavePwdQuest;

	@AndroidFindBy(id = "com.google.android.gms:id/credential_save_confirm")
	@iOSXCUITFindBy(id = "You can view and remove saved passwords in Passwords settings.")
	public WebElement PasswordSettingTxt;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField")
	public WebElement LoginEmailTab;

	@AndroidFindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout[1]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"suggestion\"])[1]")
	public WebElement EmailSuggestion;

	@iOSXCUITFindBy(id = "Password Auto-fill")
	public WebElement EmailSuggestionKey;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement EmailSuggestionList;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	public WebElement PasswordPrompt;

	@AndroidFindBy(id = "login_passWord_editText")
	@iOSXCUITFindBy(id = "login_passWord_editText")
	public WebElement AccountPassword;
}
