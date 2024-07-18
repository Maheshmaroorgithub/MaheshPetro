package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class StationFinderPage extends GenericWrappers {
    public StationFinderPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "serv_fac_filter_tv")
    @iOSXCUITFindBy(id = "serv_fac_filter_tv")
    public WebElement FilterByStartText;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[1]")
    public WebElement MobilePaymentEnabledService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
//    @iOSXCUITFindBy(xpath="(//XCUIElementTypeImage[@name=\"services_filter_image\"])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[1]")
    public WebElement MobilePaymentEnabledIcon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Settings\"]")
    public static WebElement DontAllowSettings;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public WebElement DontallowCancel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Open 24 Hours']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[2]")
    public WebElement OpenHoursService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[2]")
    public WebElement OpenHoursIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tesco Express']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[3]")
    public WebElement TescoExpressService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[3]")
    public WebElement TescoExpressIcon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[4]")
    public WebElement FoodServiceService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[4]")
    public WebElement FoodServiceIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[5]")
    public WebElement PremiumCoffeeService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[5]")
    public WebElement PremiumCoffeeIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[6]")
    public WebElement CustomerToiletsService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[6]")
    public WebElement CustomerToiletsIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ATM']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[7]")
    public WebElement AtmService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[7]")
    public WebElement ATMIcon;

    @AndroidFindBy(id = "LOCATOR NEEDED")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[8]")
    public WebElement MotorwayService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[8]")
    public WebElement MotorwayIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[9]")
    public WebElement HGVPumpService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[9]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[9]")
    public WebElement HGVPumpsIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[10]")
    public WebElement SynergyService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[10]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[10]")
    public WebElement SynergyIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[11]")
    public WebElement SynergyUnleadedService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[11]")
    public WebElement SynergyUnleadedIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[12]")
    public WebElement LPGService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[12]")
    public WebElement LPGIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[13]")
    public WebElement AdBlueService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[13]")
    public WebElement AdBlueIcon;

    @AndroidFindBy(id = "//android.widget.TextView[@text='Car Wash']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[14]")
    public WebElement CarWashService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[14]")
    public WebElement CarWashIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[15]")
    public WebElement JetWashService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[15]")
    public WebElement JetWashIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[16]")
    public WebElement AirTowerservice;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[9]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[16]")
    public WebElement AirTowerIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[17]")
    public WebElement MobService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[10]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[17]")
    public WebElement MobIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[18]")
    public WebElement NectarPointsService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[11]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[18]")
    public WebElement NectarPointsIcon;

    @AndroidFindAll({
            @AndroidBy(id = "com.android.packageinstaller:id/permission_allow_button"),
            @AndroidBy(xpath = "//*[contains(@text,'Only this')]"),
            @AndroidBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")})
    @iOSXCUITFindBy(id = "Allow Once")
    public static WebElement AllowOncePopup;

    @AndroidFindBy(id = "permission_allow_foreground_only_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow While Using App\"]")
    public static WebElement AllowLocationWhileUsingTheApp;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\"])[19]")
    public WebElement ClubCardService;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[12]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeImage[@name=\"services_filter_image\"])[19]")
    public WebElement ClubCardIcon;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[11]/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[18]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    public WebElement NectarPoints;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[10]")
    @iOSXCUITFindBy(id = "Clubcard Points on Fuel and Shop")
    public WebElement ClubPoints;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindAll(value = {
            @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\"Allow Esso-QA To Access\"]"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeStaticText[@name=\"ALLOW ESSO-QA TO ACCESS\"]")})
    public WebElement AllowAccessTxt;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"Location, Never\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public WebElement LocSetting;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile Payment Enabled']")
    @iOSXCUITFindBy(id = "Mobile Payment Enabled")
    public WebElement MobPayment;

//    @AndroidFindBy(id = "Locator Need")
//    @iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[11]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
//    public WebElement PostcodeStation;

//    @AndroidFindBy(id = "Locator Need")
//    @iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther\n")
//    public WebElement PostCdStation1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Synergy Supreme+ Unleaded']")
    @iOSXCUITFindBy(id = "Synergy Supreme+ Unleaded")
    public WebElement Synergy;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobil 1']")
    @iOSXCUITFindBy(id = "Mobil 1")
    public WebElement MobOne;

//    @AndroidFindBy(id = "Locator Need")
//    @iOSXCUITFindBy(xpath ="//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther\n")
//    public WebElement MapView;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Synergy Supreme+ Unleaded']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[10]/XCUIElementTypeImage")
    public WebElement SDMobPayIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Synergy Supreme+ Unleaded']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[11]/XCUIElementTypeImage")
    public WebElement SDSynergyIcon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Car Wash']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[11]/XCUIElementTypeImage")
    public WebElement CarWashStationdetails;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Synergy Supreme+ Unleaded']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[12]/XCUIElementTypeImage")
    public WebElement SDMobil1Icon;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mrh Moleside']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MRH SHORTLANDS 202 BROMLEY ROAD, BECKENHAM 4996.7 mi \"]")
    public WebElement MilesStationOne;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mrh Eastcote']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"MRH EDEN PARK LINKS WAY, BECKENHAM 4997.4 mi \"]\n")
    public WebElement MilesStationTwo;

    @AndroidFindBy(id = "txtStationDist")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[4]")
    public WebElement StationOneMiles;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[4]")
    public WebElement StationOneMilesList;

    @AndroidFindBy(id = "txtMobilePayEnabledInfo")
    public WebElement stationFirstMile;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(id = "txtServices")
    public WebElement Servs;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
    public WebElement Open24HrsStationDetails;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
    public WebElement AtmStationDetails;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(id = "ivService")
    public WebElement ServiceFacilityIcon;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
    public WebElement SDMobPayIconStationDetails;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView")
    public WebElement Open24HoursIconStationDetails;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView")
    public WebElement AtmIconStationDetails;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView")
    public WebElement SupremeIconStationDetails;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Car Wash']")
    public WebElement CarWashIconStationDetails;

    @iOSXCUITFindBy(id = "Services & Facilities")
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]/android.widget.ImageView")
    public WebElement Mobi1IconStationDetails;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    public WebElement StationMap;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]")
    public WebElement FirstStation;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    public WebElement SepStationsMap;

    @AndroidFindBy(id = "btnMobilePay")
    @iOSXCUITFindBy(id = "Mobile Pay Stations")
    public WebElement MobPayStationBtn;

    @AndroidFindBy(id = "dismiss_button")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"View Details\"]")
    public List<WebElement> ViewDetailsBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Station']"),
            @AndroidBy(id = "ivWifi")})
    @iOSXCUITFindBy(id = "Maps")
    public WebElement StationIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Got It\"]")
    public List<WebElement> GotItBtn;

    @AndroidFindBy(id = "action_fuel")
    @iOSXCUITFindBy(id = "Fuel")
    public WebElement Fuel;

    @AndroidFindBy(id = "pop_up_imageview")
    @iOSXCUITFindBy(id = "essoLogoTm")
    public static WebElement StationDetailsPopupLogo;

    @AndroidFindBy(id = "Locator needed")
    @iOSXCUITFindBy(id = "Close Icon")
    public static WebElement CloseButtonModalPopupLid;

    @AndroidFindBy(id = "location_continue_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Birmingham, UK\"]")
    public WebElement StationSelect;

    @AndroidFindBy(id = "btnClose")
    @iOSXCUITFindBy(id = "Banner close")
    public WebElement GotItClose;

    @AndroidFindBy(id = "terms_and_conditions_txt")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Terms and Conditions\"]")
    public WebElement TermsAndCondLink;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView")
    @iOSXCUITFindBy(id = "Terms and Conditions")
    public WebElement DetTermsAndCond;

    @AndroidFindBy(id = "close_img")
    @iOSXCUITFindBy(id = "closeWhiteSmall")
    public WebElement CloseTermsAndCond;

    @AndroidFindBy(id = "close_img")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Banner close\"]")
    public WebElement BannerCloseBtn;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(id = "paypal_get_started")
    public WebElement AllowLocContinueButton;
    @AndroidFindBy(id = "action_station")
    @iOSXCUITFindBy(id = "Station")
    public WebElement TabStation;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView")
    public WebElement TermsAndCondTxt;

    @AndroidFindBy(id = "header_text")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Esso Station Finder\"]")
    public WebElement StationHeader;

    @iOSXCUITFindBy(id = "header_filter")
    @AndroidFindBy(id = "header_filter")
    public static WebElement StationFilter;

    @iOSXCUITFindBy(id = "Enter Postcode or City")
    @AndroidFindBy(id = "edtSearch")
    public WebElement StationSearch;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.Button[2][@text='All Esso Stations']")
    @iOSXCUITFindBy(id = "All Esso Stations")
    public WebElement AllEssoStationBtn;

    @AndroidFindBy(id = "btnCurrentLocation")
    @iOSXCUITFindBy(id = "btnCurrentLocation")
    public WebElement MapBtn;

    @AndroidFindBy(id = "favorate_img")
    @iOSXCUITFindBy(id = "favorate_img")
    public WebElement FavBtn;

    @AndroidFindBy(id = "btnClose")
    @iOSXCUITFindBy(id = "UnFavSave")
    public WebElement StationDetailsFavBtn1;

    @AndroidFindBy(id = "favorate_img")
    @iOSXCUITFindBy(id = "UnFavSave")
    public WebElement StationDetailsFavBtn;

    @AndroidFindBy(id = "dashboard_greeting_msg")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Favourite station selected\"]")
    public WebElement StationFav;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.Button[@text='CONTINUE']")
    @iOSXCUITFindBy(id = "Locter need")
    public WebElement Continue1;

    @AndroidFindBy(id = "paypal_get_started")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public WebElement COntinueButtonFavourite;

    @AndroidFindBy(id = "clear_btn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear All\"]")
    public WebElement FilterScreenClearAll;

    @AndroidFindBy(id = "needed")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1\"]")
    public List<WebElement> AppliedFilter;


//    @AndroidFindBy(id = "needed")
//    @iOSXCUITFindBy(id = "serv_fac_apply_filter_btn")
//    public WebElement FilterScreenApply;

    @AndroidFindBy(id = "favorate_img")
    @iOSXCUITFindBy(id = "FavSave")
    public WebElement StationDetailsSaveBtn;

    @AndroidFindBy(id = "NOT AVAILABLE")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"search\"]")
    public WebElement KeyBoardSearch;

    @AndroidFindBy(id = "btnViewStations")
    @iOSXCUITFindBy(id = "btnViewStations")
    public static WebElement listStations;

    @AndroidFindBy(id = "phoneNumberTextView")
    @iOSXCUITFindBy(id = "Normal call rates apply.")
    public WebElement PhoneTxt;

    @AndroidFindBy(id = "txtMobilePayEnabledInfo")
    @iOSXCUITFindBy(id = "This station accepts mobile payments")
    public WebElement MobPayAccept;

    @AndroidFindBy(id = "txtOpeningHours")
    @iOSXCUITFindBy(id = "Opening Hours")
    public WebElement OpeningHours;


    @AndroidFindBy(id = "lblFuelingHours")
    @iOSXCUITFindBy(id = "Fuelling Hours")
    public WebElement FuelHrsTxt;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(id = "Open Now:")
    public WebElement OpenNowTxt;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public WebElement CancelBtn;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Call Back\"]")
    public WebElement CallBackBtn;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeApplication[@name=\"Maps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    public WebElement RouteView;

    @AndroidFindBy(id = "btnGetDirection")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Get Directions\"]")
    public WebElement GetDirections;

    @AndroidFindBy(id = "phoneNumberTextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
    public WebElement PhoneIcon;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    public WebElement StationDetailsMap;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Let us locate your nearest stations\"]")
    public WebElement LocHelpText;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    public WebElement PhoneCallBtn;


    @AndroidFindBy(id = "android:id/button2")
    @iOSXCUITFindBy(id = "Cancel")
    public WebElement PhoneCancelBtn;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeImagev")
    public WebElement OpeningHrsIcon;

    @AndroidFindBy(id = "txtNoStationsMsg")
    @iOSXCUITFindBy(id = "\t\n" +
            "Sorry, no results found in this area. Please adjust your search and try again.")
    public WebElement SorryMsg;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View[1]")
    //todo add android id
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther\n")
    public WebElement CurrentLocMap;

    @AndroidFindBy(id = "rlListHolder")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell")
    public List<WebElement> SearchResults;


//    @AndroidFindBy(id = "Locator Need")
//    @iOSXCUITFindBy(xpath = "\t\n" +
//            "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
//    public WebElement CityMapView;

//    @AndroidFindBy(id = "Locator Need")
//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
//    public WebElement CancelFilterBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ATM']")
    public WebElement atm_Filter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LPG']")
    public WebElement lpg_Filter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nectar Points']")
    public WebElement nectar_Points;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Filter By\"]")
    @AndroidFindBy(id = "header_text")
    public WebElement filter_by_Header;

    @iOSXCUITFindBy(id = "header_left_txt")
    @AndroidFindBy(id = "header_left_txt")
    public WebElement filter_Cancel_Btn;

    @iOSXCUITFindBy(id = "serv_fac_apply_filter_btn")
    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.Button)[2]"),
            @AndroidBy(xpath = "//android.widget.Button")})
    public WebElement filter_Apply_Btn;

    @AndroidFindBy(id = "stationDetailsLyt")
    public WebElement station_Address;

    @AndroidFindBy(id = "call_subtextView")
    public WebElement station_Phno;

    @AndroidFindBy(id = "txtOpeningHours")
    public WebElement open_Hours_Station;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Fuelling Hours\"]")
    @AndroidFindBy(id = "lblFuelingHours")
    public WebElement fuel_Hours_Station;

    @AndroidFindBy(id = "lblShopHours")
    public WebElement shop_Hours_Station;

    @AndroidFindBy(id = "call_layout")
    public WebElement phno_Station;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText")
    public WebElement CallPhoneNumber;

    @AndroidFindBy(id = "com.samsung.android.dialer:id/digits")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public WebElement DeviceLevelPhoneCancel;

    @AndroidFindBy(id = "button2")
    public WebElement phno_Call_Station;

    @AndroidFindBy(id = "button1")
    @iOSXCUITFindBy(xpath = "\t\n" +
            "//XCUIElementTypeButton[@name=\"Cancel\"]")
    public WebElement phno_Cancel_Station;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
    public WebElement CityMapView;

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
//    public WebElement FirstStation;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell")
    @AndroidFindBy(id = "txtMileAndLoc")
    public List<WebElement> address_Station_List;

    @AndroidFindBy(id = "childItemLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell")
    public List<WebElement> FilterServicesList;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[2]/android.widget.ImageView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@name,'checkmark')]")
    public List<WebElement> checkmark;

    @AndroidFindBy(id = "btnGetDirection")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Directions\"])[1]")
    public WebElement DirectionsLink;

    @AndroidFindBy(id = "relativeLayout")
    @iOSXCUITFindBy(id = "direction_btn")
    public List<WebElement> DirectionsLinkList;

    @AndroidFindBy(id = "serv_fac_apply_filter_btn")
    @iOSXCUITFindBy(id = "serv_fac_apply_filter_btn")
    public WebElement ApplyFilter;

    @AndroidFindBy(id = "txtMileAndLoc")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeImage\n")
    public WebElement StationImg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]\n")
    public WebElement map_Station;

    @AndroidFindBy(id = "header_left_txt")
    @iOSXCUITFindBy(id = "header_left_txt")
    public WebElement CancelFilterBtn;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(id = "This station accepts mobile payments")
    public WebElement StationFinderDetScreenTxt;

    @AndroidFindBy(id = "Locattor Need")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"MRH SHORTLANDS\"])[1]")
    public WebElement StationDetailsHeader;


    @AndroidFindBy(id = "header_back_btn")
    @iOSXCUITFindBy(id = "NavBack")
    public WebElement NavBack;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther\n")
    public WebElement PostCdStation1;

    @AndroidFindBy(id = "Locator Need")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell")
    public WebElement PostcodeStation;

    @AndroidFindBy(id = "map")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Esso-QA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther\n")
    public WebElement MapView;

    @AndroidFindBy(id = "linearLayout2")
    @iOSXCUITFindBy(xpath = "Locator need")
    public WebElement CloseListView;

    @AndroidFindBy(id = "btnGetDirection")
    public WebElement get_Direction_Station;

    @AndroidFindBy(id = "message")
    public WebElement location_Off_Msg;

    @AndroidFindBy(id = "android:id/button2")
    public WebElement location_Off_Deny;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement location_Off_Ok;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Directions']")
    @iOSXCUITFindBy(id = "Directions")
    public WebElement direction_Get_Direction;

    @AndroidFindBy(id = "complete_profile_txt")
    public WebElement complete_Profile;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View[6]")
    public WebElement map_Cluster;

    @AndroidFindBy(id = "android:id/button2")
    public WebElement no_Thanks_Button;

    @AndroidFindBy(id = "location_setting_title")
    public WebElement locationtitle;

    @AndroidFindBy(id = "location_continue_btn")
    public WebElement continue_btn;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public WebElement permission_allow;

    @AndroidFindBy(id = "txtStationDist")
    @iOSXCUITFindBy(id = "txtStationDist")
    public WebElement StationOneMilesnotPresent;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Maps']")
    public WebElement GoogleMapsDirectionStationDetails;

    @AndroidFindBy(id = "dashboard_greeting_msg")
    @iOSXCUITFindBy(id = "Welcome to")
    public WebElement WelcomeToLid;

    @AndroidFindBy(id = "dashboard_logged_user")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
    public WebElement StationNameLid;

    @AndroidFindBy(id = "No Need")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Please turn on'")
    public WebElement LocationNotAllowedPopupCt;

    @AndroidFindBy(uiAutomator = "new uiScrollable(UiSelector()).(scrollintoview().(new UiSelector().textContains(\"Club\")")
    public WebElement clubCardService;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'filter_image')]")
    public List<WebElement> serviceImages;

    @AndroidFindBy(accessibility = "182651663668.")
    public WebElement defaultStation;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell")
    public List<WebElement> StationCluster;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Nectar Points')]")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Nectar Points\"))")
    public WebElement nectarPointsFilter;

    @AndroidFindBy(xpath = "//*[contains(@text,'Continue')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    public WebElement Continue_BTN;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Mobile Payment Enabled\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"services_filter_categories_tv\" and @label=\"Mobile Payment Enabled\"]")
    public WebElement MobilePaymentEnabled;

    @AndroidFindBy(id = "filter_count")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1\"]")
    public WebElement filter_count_1;

    @AndroidFindBy(id = "txtNoStationsMsg")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeStaticText' and name BEGINSWITH 'Unfortunately, no results found'")
    public WebElement NoStationMsg;
}

