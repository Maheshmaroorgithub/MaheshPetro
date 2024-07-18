package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class SmokeTestPage extends GenericWrappers {

	public SmokeTestPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar//XCUIElementTypeOther")
	public WebElement FirstFuelheader;
	
	@AndroidFindBy(id = "product_image")
	@iOSXCUITFindBy(id = "headerTutorialLogo")
	public WebElement FirstFuelLogo;
	
	@AndroidFindBy(id = "products_title")
	@iOSXCUITFindBy(id = "PRODUCTS")
	public WebElement Products;
	
	@AndroidFindBy(id = "edtSearch")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField")
	public WebElement SearchCity;

	@iOSXCUITFindBy(id = "Search")
	public WebElement SearchBtn;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout/android.widget.RelativeLayout[2]")
	@iOSXCUITFindBy(id = "Search")
	public WebElement FuelFinder_SearchKey;
	
	@AndroidFindBy(xpath = "//android.view.View")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell")
	public List <WebElement> MapMarkerPin;

	@iOSXCUITFindBy(id = "(//XCUIElementTypeCell)[1]/XCUIElementTypeStaticText")
	public  WebElement EssoStations;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='CurrentLocationMap']")
	public  WebElement CurrLocation;
	
	@AndroidFindBy(id = "rvStationInfo")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText")
	public List <WebElement> RV;
	
	@AndroidFindBy(id = "txtMobilePayEnabledInfo")
	@iOSXCUITFindBy(id = "LEARN MORE")
	public WebElement MobilePayStn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[2][@text='Loyalty Points']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Loyalty Points']")
	public WebElement LP;
	
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]/android.widget.RelativeLayout/android.widget.TextView[2]")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Will I still earn Nectar points if I use the app?'])[1]")
	public WebElement LPN;
	
	@AndroidFindBy(id = "list_item_text_child")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name='terms and conditions']")
	public WebElement FAQLink;

	
	@AndroidFindBy(id = "header_text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
	public WebElement HeaderText;
	
	@AndroidFindBy(id = "txtStationName")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeCell)[1]/XCUIElementTypeStaticText")
	public WebElement StationName;
	
	@AndroidFindBy(id = "loyality_desc")
	@iOSXCUITFindBy(id = "For journeys that matter. Wherever you’re going, there’s a First Fuel to help you get there.")
	public WebElement Productsdescr;
	
}
