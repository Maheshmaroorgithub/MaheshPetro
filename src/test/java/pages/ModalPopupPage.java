package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class ModalPopupPage extends GenericWrappers {
    public ModalPopupPage()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @AndroidFindBy(xpath = "btnClose")
    @iOSXCUITFindBy(xpath = "btnClose")
    public WebElement NectarCloseButton;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Station\"]")
    @iOSXCUITFindBy(xpath = "//android.widget.TextView[@text=\"Station\"]")
    public WebElement StationTabLID;

    @AndroidFindBy(id = "rvStationInfo")
    @iOSXCUITFindBy(id = "rvStationInfo")
    public WebElement stationInfoLink;

    @AndroidFindBy(id = "dismiss_button")
    @iOSXCUITFindBy(id = "dismiss_button")
    public WebElement viewDetailsPopup;

    @AndroidFindBy(id = "dismiss_button")
    public List<WebElement> enterViewDetailsPopup;

    @AndroidFindBy(id = "header_back_btn")
    public WebElement bcakButtonInStationDetails;

    @AndroidFindBy(id = "terms_and_conditions_txt")
    @iOSXCUITFindBy(id = "terms_and_conditions_txt")
    public WebElement termsConditionLink;

    @AndroidFindBy(id = "terms_and_conditions_txt")
    @iOSXCUITFindBy(id = "terms_and_conditions_txt")
    public WebElement termsConditionText;

    @AndroidFindBy(id = "close_img")
    @iOSXCUITFindBy(id = "close_img")
    public WebElement CloseButton;

    @AndroidFindBy(id = "edtSearch")
    @iOSXCUITFindBy(id = "edtSearch")
    public WebElement stationSearchBox;

    @AndroidFindBy(id = "load_btn")
    @iOSXCUITFindBy(id = "load_btn")
    public WebElement loadToCardButton;

    @AndroidFindBy(id = "title_text_view")
    @iOSXCUITFindBy(id = "title_text_view")
    public WebElement ModalPopupHeader;

    @AndroidFindBy(id = "pop_up_imageview")
    @iOSXCUITFindBy(id = "pop_up_imageview")
    public WebElement modalImagePopup;

    @AndroidFindBy(id = "default_layout")
    public List<WebElement> StationPopupScreen;

    @AndroidFindBy(xpath = "//*[@text='Fuel']")
    @iOSXCUITFindBy(id = "Fuel")
    public WebElement FuelTab;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeImage[1]")
    @AndroidFindBy(id = "tick_mark_image")
    public WebElement OfferAppliedTickMark;

    @AndroidFindBy(id = "btnClose")
    public WebElement closeModalPopup;



}
