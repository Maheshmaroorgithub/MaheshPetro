package stepLibrary;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.Reporter;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.remote.SupportsContextSwitching;
import io.cucumber.java.Scenario;
import contants.AccountConstants;
import io.appium.java_client.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContextualRegistrationPage;

import java.io.*;
import java.lang.reflect.Field;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class GenericWrappers {

	public static URL url;
	public static AppiumDriverLocalService appiumService;
	public static String appiumServiceUrl;
	public static String platform;
	public static String applicationURL;
	//	public static Configuration config = null;
	public static boolean AUTOEXECTIONSTATUS = true;
	public static RemoteWebDriver driver;
	public static String fileName;
	public static String sheetName;
	public static String userDir = System.getProperty("user.dir");
	public static String adtSDKPath = null;
	public static String osName = System.getProperty("os.name").trim();
	public static BufferedWriter customReportOutput = null;
	public static String customReportPath = null;
	public static int implicitWaitInSeconds;
	public static String breakPoint = null;
	public static String targetOperatingSystem = null;
	public static String appType = null;
	public static String appUrl = null;
	public static String browser = null;
	public static String platformName = null;
	public static String bundleID = null;
	public static String appPath = null;
	public static String UDID = null;
	public static String PlatformVersion = null;
	public static String deviceName = null;
	public static String deviceId = null;
	public static String appPackage = null;
	public static String appActivity = null;
	public static String appiumHost = null;
	public static String appiumPort = null;
	public static int elementWaitInSeconds = 0;
	public static String newCommandTimeout = null;
	public static int elementWaitInSecondsforLoader = 0;
	public static ArrayList<String> AndroidDevices = new ArrayList<String>();
	public static int deviceAssingmentCounter = 0;
	public static boolean openExcelSheet = true;
	public static String extendreportFilePath;
	public static int timeOut = 0;
	public static ExtentTest scenarioDef;
	public static ExtentTest features;
	public static boolean initilizestatus = false;
	public static int xcordi;
	public static int ycordi;
	public int retryattempts = 1;
	public ExtentReports extent;
	Logger Log = Logger.getLogger(this.getClass().getSimpleName());
	public Logger logger = Logger.getLogger(String.valueOf(GenericWrappers.class));
	private Select select;
	public static String loginclass_path;
	public static String passwordclass_path;
	public int deviceTime;
	AppiumDriver webViewDriv=null;
	public static Properties prop;
	public GenericWrappers() {
		try {
//			ConfigurationFactory factory = new ConfigurationFactory("config/config.xml");
//			config = factory.getConfiguration();
//			System.setProperty("currentDir", userDir);
//			PropertyConfigurator.configure("log4j.properties");

			prop = new Properties();
			prop.load(new FileInputStream(System.getProperty("user.dir")+"/config/application.properties"));


		} catch (Exception e) {
			// TODO: handle exception
		}
		if (!initilizestatus) {
			try {
				implicitWaitInSeconds = Integer.parseInt(prop.getProperty("implicitWaitInSeconds"));
				breakPoint = prop.getProperty("breakPoint");
				targetOperatingSystem = prop.getProperty("targetOperatingSystem");
				extendreportFilePath = userDir + prop.getProperty("extendreportFilePath");
				elementWaitInSeconds = Integer.parseInt(prop.getProperty("elementWaitInSeconds"));
				elementWaitInSecondsforLoader = Integer.parseInt(prop.getProperty("elementWaitInSecondsforLoader"));
				platformName = prop.getProperty("platform");
				PlatformVersion = prop.getProperty("Version");
				deviceName = prop.getProperty("deviceName");
				deviceId = prop.getProperty("deviceId");
				appPackage = prop.getProperty("package");
				appActivity = prop.getProperty("activity");
				appiumHost = prop.getProperty("appiumHost");
				appiumPort = prop.getProperty("appiumPort");
				bundleID = prop.getProperty("bundleId");
				appPath = prop.getProperty("appPath");
				UDID = prop.getProperty("udid");
				loginclass_path = "testdata" + ".LoginTestData";
				passwordclass_path = "testdata" + ".PasswordTestData";
				newCommandTimeout = prop.getProperty("newCommandTimeout");
			} catch (Exception e) {
				AUTOEXECTIONSTATUS = false;
				e.printStackTrace();
			}
		}
		initilizestatus = true;
	}

	public static void appiumStart() throws IOException, InterruptedException {


		AppiumServiceBuilder builder;
		builder = new AppiumServiceBuilder().withArgument(() -> "--base-path", "/wd/hub").withArgument(() -> "--session-override");
		builder.usingAnyFreePort();
//		builder.usingDriverExecutable(new File("C:/Trusted/node.exe"));
//		builder.withAppiumJS(new File("C:\\Users\\<user_name\\AppData\\Roaming\\npm\\node_modules\\appium"));
		HashMap<String, String> environment = new HashMap();
		environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
		builder.withEnvironment(environment);
		appiumService = AppiumDriverLocalService.buildService(builder);
		appiumService.start();

		// appiumService = AppiumDriverLocalService.buildService(new
		// AppiumServiceBuilder().usingAnyFreePort().usingDriverExecutable(new
		// File(PathConfig.nodePath)).withAppiumJS(new File(PathConfig.appiumJSPath)));
		// appiumService=AppiumDriverLocalService.buildDefaultService();;

//		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
//		serviceBuilder.usingAnyFreePort();
//		HashMap<String, String> environment = new HashMap();
//
//		serviceBuilder.usingDriverExecutable(new File("C:/Trusted/node.exe"));
//		serviceBuilder.withAppiumJS(new File("C:/Program Files/Appium/resources/app/node_modules/appium/build/lib/main.js"));

//		environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
//		serviceBuilder.withEnvironment(environment);

//		url = new URL("http://127.0.0.1:4723/wd/hub");

//		appiumService = AppiumDriverLocalService.buildService(serviceBuilder);
//		appiumService.start();
		appiumServiceUrl = appiumService.getUrl().toString();
		System.out.println("Appium Service Address : - " + appiumServiceUrl);
		url = new URL(appiumServiceUrl);
	}

	// This method Is responsible for stopping appium server.
	public static void appiumStop() throws IOException, InterruptedException {
		System.out.println("Stopping app");
		driver.quit();
		appiumService.stop();
		Thread.sleep(5000);
	}

	public static void initiateNativeAPP() throws IOException, InterruptedException {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			if ("ANDROID".equalsIgnoreCase(platformName)) {
				System.out.println("Initialising the Android Application");
				capabilities.setCapability("platformName", prop.getProperty("platform"));
				capabilities.setCapability("platformVersion", prop.getProperty("Version"));
				capabilities.setCapability("noReset", true);
				capabilities.setCapability("deviceName", prop.getProperty("deviceId"));
				capabilities.setCapability("appPackage", prop.getProperty("package"));
				capabilities.setCapability("automationName", prop.getProperty("automationName"));
				capabilities.setCapability("appActivity", prop.getProperty("activity"));
				capabilities.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
				capabilities.setCapability("newCommandTimeout", prop.getProperty("newCommandTimeout"));
//				capabilities.setCapability(MobileCapabilityType.APP, "/Users/chibisakkrava_d/Downloads/Esso_UK_R5_QA_2.6.0.5.apk");
				capabilities.setCapability("appium:forceAppLaunch",true);

				driver = new AndroidDriver(url, capabilities);
			} else if ("IOS".equalsIgnoreCase(platformName)) {
				System.out.println("Initialising the IOS Application");
				capabilities.setCapability("platformName", prop.getProperty("platform"));
				capabilities.setCapability("platformVersion", prop.getProperty("Version"));
				capabilities.setCapability("noReset", true);
				capabilities.setCapability("deviceName", prop.getProperty("deviceName"));
				capabilities.setCapability("automationName", prop.getProperty("automationName"));
				capabilities.setCapability("udid", prop.getProperty("udid"));
				capabilities.setCapability("bundleId", prop.getProperty("bundleId"));
				capabilities.setCapability("app", prop.getProperty("iosAppPath"));
				capabilities.setCapability("appium:forceAppLaunch",true);
				//capabilities.setCapability("fullReset", true);
				capabilities.setCapability("newCommandTimeout", 40000);
				driver = new IOSDriver(new URL(appiumServiceUrl), capabilities);
			} else if ("MOBILE_BROWSER-ANDROID".equalsIgnoreCase(platformName)) {
				System.out.println("Initializing the Android Mobile Browser app");
				capabilities.setCapability("platformName", "Android");
				capabilities.setCapability("deviceName", prop.getProperty("deviceId"));
				capabilities.setCapability("browserName", prop.getProperty("browser"));
				driver = new AndroidDriver(new URL(appiumServiceUrl), capabilities);
				driver.get(prop.getProperty("url"));
			} else if ("MOBILE_BROWSER-IOS".equalsIgnoreCase(platformName)) {
				System.out.println("Initializing the IOS Mobile Browser app");
				capabilities.setCapability("platformName", "iOS");
				capabilities.setCapability("platformVersion", prop.getProperty("Version"));
				capabilities.setCapability("deviceName", prop.getProperty("deviceName"));
				capabilities.setCapability("browserName", prop.getProperty("browser"));
				capabilities.setCapability("udid", prop.getProperty("udid"));
				capabilities.setCapability("startIWDP", true);
				capabilities.setCapability("automationName", prop.getProperty("automationName"));
				capabilities.setCapability("noReset", true);
				driver = new IOSDriver(new URL(appiumServiceUrl), capabilities);
				driver.get(prop.getProperty("url"));
			} else if("DESKTOP".equalsIgnoreCase(platformName)){
				System.out.println("Initializing the desktop web browser");
				System.setProperty("webdriver.chrome.driver",prop.getProperty("chrome_path"));
//				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("url"));
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitInSeconds));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getCurrentDir() {
		String currentDir = System.getProperty("user.dir");
		currentDir = currentDir.replace('\\', '/');
		return currentDir;
	}

	public void setImplicit(int timeOut) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
	}

	public WebDriverWait webDriverWait() {
		return new WebDriverWait(driver, Duration.ofSeconds(elementWaitInSeconds));
	}

	public WebDriverWait webDriverWaitForElement(long waitSeconds) {
		return new WebDriverWait(driver, Duration.ofSeconds(waitSeconds));
	}

	public WebDriverWait webDriverWaitForLoader() {
		return new WebDriverWait(driver, Duration.ofSeconds(elementWaitInSecondsforLoader));
	}


	public void waitElementToBeClickable(WebElement element) {
		AndroidLoader();
		if (!element.isDisplayed()) {
			webDriverWait().until(ExpectedConditions.elementToBeClickable(element));
		}
	}

	public void AndroidLoader() {
		if (isElementDisplayedWithoutAssert(ContextualRegistrationPage.Loader)) {
			for (int i = 0; i < 10;) {
				waitFor(500);
				i++;
				logger.info("###################Common Loader is displayed#########################");
				if (!isElementDisplayedWithoutAssert(ContextualRegistrationPage.Loader)) {
					logger.info("###################Common Loader disappeared#########################");
					break;
				}
			}
		}
	}

//	public void waitElementToBeClickable(WebElement element) {
//
//		webDriverWait().until(ExpectedConditions.elementToBeClickable(element));
//	}

	public void waitForElement(WebElement element, long seconds) {
		try {
			webDriverWaitForElement(seconds).until(ExpectedConditions.elementToBeClickable(element));
		}catch(Exception e) {}
	}
//	public void clickButtonWithOutScroll(WebElement element) {
//		try {
//			waitVisibilityOfElement(element);
//			waitElementToBeClickable(element);
//			element.click();
//			logger.info("Element Clicked" + element);
//		} catch (Exception e) {
//			element = null;
//			Assert.fail("Element not present" + element);
//			logger.info("Element not verified" + element);
//
//		}
//	}

	public void clickButtonWithOutScroll(WebElement element, boolean checkAssert) {
		try {
			element.click();
		}catch (Exception e){
			if(checkAssert){
				Assert.fail("Element not present" + element);}
			logger.info("Element not verified" + element);
		}
	}

	public void clickButtonWithOutScroll(WebElement element) {
//		waitVisibilityOfElement(element);
//		waitElementToBeClickable(element);
//		waitFor(2000);
//		if (element.isDisplayed()) {
//			element.click();
//		} else {
//			element = null;
//			Assert.fail("Element not present" + element);
//			logger.info("Element not verified" + element);
//		}
		clickButtonWithOutScroll(element,true);
	}

	public void clickButtonWithRetry(WebElement element){
		int retry;
		for ( retry=0;retry<=3;retry++){
			clickButtonWithOutScroll(element);
			waitFor(3000);
			if(!isElementDisplayedWithoutAssert(element))
				return;
		}
	}

//	public void waitVisibilityOfElement(WebElement element) {
//		webDriverWait().until(ExpectedConditions.visibilityOf(element));
//	}

	public boolean staleRetryingElementIsDisplayed(WebElement element) {

		boolean result = false;
		int attempts = 0;
		while (attempts < retryattempts) {
			try {

				waitVisibilityOfElement(element);
				element.isDisplayed();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {

				waitFor(2000);
			}
			attempts++;
		}
		return result;
	}

	public boolean isElementDisplayed(WebElement element) {

		boolean flag = false;
		try {
			waitVisibilityOfElement(element);
			if (element != null) {
				flag = true;
				logger.info("Element verified" + element);
			} else {
				logger.info("Object Couldn't be retrieved and verified" + element);
			}
		} catch (Exception e) {
			element = null;
			Assert.fail("Element not present" + element);
			logger.info("Element not verified" + element);

		}
		return flag;
	}

	public boolean isElementDisplayedWithoutAssert(WebElement element) {
		boolean flag = false;
		try {
			flag = element.isDisplayed();
		} catch (StaleElementReferenceException stale) {
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	public boolean isElementDisplayedWithoutScroll(WebElement element) {

		boolean flag;
		try {
			// waitFor(1000);
			setImplicit(elementWaitInSeconds);
			flag = isElementDisplayed(element);
		} catch (Exception e) {
			setImplicit(timeOut);
			flag = false;
		}
		logger.info("Is element " + element + " displayed - " + flag);
		return flag;
	}

//	public boolean isElementDisplayedWithoutScroll(WebElement element) {
//
//		boolean flag;
//		try {
//
//			// waitFor(1000);
//			setImplicit(elementWaitInSeconds);
//			highLighterMethod(driver, element);
//			element.isDisplayed();
//			flag = true;
//		} catch (Exception e) {
//
//			setImplicit(timeOut);
//			flag = false;
//		}
//		logger.info("Is element " + element + " displayed - " + flag);
//		return flag;
//	}

	public boolean isElementEnabled(WebElement element) {

		boolean flag = false;
		try {
			// waitVisibilityOfElement(element);
			flag = element.isEnabled();
		} catch (StaleElementReferenceException stale) {
			// flag = staleRetryingElementIsDisplayed(element);
		} catch (Exception e) {
			flag = false;
		}
		// logger.info("Is element " + element + " displayed - " + flag);
		return flag;
	}

	public void ScrollTo(String Scroll, String direction, WebElement element) {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			driver.findElement(AppiumBy.androidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + Scroll
							+ "\").instance(0))"));
			waitFor(1000);
			setImplicit(elementWaitInSeconds);
		} else if ("IOS".equalsIgnoreCase(platformName)) {
			for (int i = 0; i < 5; i++) {
				boolean isElementPresent = element.isDisplayed();
				if (!isElementPresent) {
					/*
					 * JavascriptExecutor js = (JavascriptExecutor) driver; HashMap<String, String>
					 * scrollObject = new HashMap<String, String>(); scrollObject.put("direction",
					 * direction); js.executeScript("mobile: scroll", scrollObject);
					 */
					Map<String, Object> args = new HashMap<>();
					args.put("direction", direction);
					driver.executeScript("mobile: swipe", args);
				} else {
					break;
				}
			}
		}
	}

	public boolean isTextMatch(String actual, String expected) {

		logger.info("Actual Value - " + actual + "\n" + "Expected Value - " + expected);
		return actual.equalsIgnoreCase(expected);
	}

	public boolean isTextContain(String actual, String expected) {

		logger.info("Actual text - " + actual + "\n" + "Expected text - " + expected);
		return actual.contains(expected);
	}

	public void waitFor(int sleepTime) {

		try {

			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void loaderDisappear() {
		List<WebElement> loader = driver.findElements(By.xpath("//div[@class='modal-backdrop fade in']/span"));
		if (!loader.isEmpty()) {

			webDriverWait().until(ExpectedConditions
					.invisibilityOfElementLocated((By.xpath("//div[@class='modal-backdrop fade in']/span"))));
			waitFor(2000);
		}
	}

	public void switchToParentWindow() {

		Set<String> winHandles = driver.getWindowHandles();
		for (String wHandle : winHandles) {
			driver.switchTo().window(wHandle);
			break;
		}
	}

	public void switchToLastWindow() {

		Set<String> winHandles = driver.getWindowHandles();
		for (String wHandle : winHandles) {

			driver.switchTo().window(wHandle);
		}
	}

	public void highLighterMethod(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: ; border: 2px solid blue;');", element);
	}

	public boolean isElementDisplayed(List<WebElement> elements) {

		return !elements.isEmpty();
	}

	public void takeScreenShotonFailure(Scenario scenario) {
		String encodedBase64 = null;
		FileInputStream fileInputStreamReader = null;
//		if (scenario.getStatus().equals("failed")) {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			fileInputStreamReader = new FileInputStream(scrFile);
			byte[] bytes = new byte[(int) scrFile.length()];
			fileInputStreamReader.read(bytes);
			encodedBase64 = new String(Base64.getEncoder().encodeToString(bytes));
			scenario.attach(bytes, "image/png", "Failed Screen");
			Reporter.addScreenCaptureFromPath("data:image/png;base64," + encodedBase64);
			System.out.println("Scenario Failed...Taking screenshot....");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Log.info("Screen Shot taken");
//		}
	}

	public void scrollToElement(WebElement element) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public Select selectDropdown(WebElement element) {

		select = new Select(element);
		return select;
	}

	public void selectByIndex(WebElement element, int index) {

		selectDropdown(element).selectByIndex(index);
	}

	public void SelectByValue(WebElement element, String value) {
		waitFor(1000);
		selectDropdown(element).selectByValue(value);
	}

	public void SelectByVisibleText(WebElement element, String text) {
		waitFor(1000);
		selectDropdown(element).selectByVisibleText(text);
	}

	public void waitForLoadIconDisappear(WebElement element) {
		webDriverWaitForLoader().until(ExpectedConditions.invisibilityOf(element));
	}

	public String getPageTitle() {

		return driver.getTitle();
	}

	/****
	 * swipe element right or left by co-ordinated
	 *
	 * @param element
	 * @param offSet  - (-1 swipe left or +1 swipe right)
	 */
	public void swipeByX(WebElement element, int offSet) {

		Point point = element.getLocation();
		Actions actions = new Actions(driver);
		System.out.println("val: " + point.getX());
		actions.dragAndDropBy(element, point.getX() - offSet, point.getY()).build().perform();
	}

	public void swipeByXCoordinates(WebElement element, int offSet) {

		Point point = element.getLocation();
		Actions actions = new Actions(driver);
		System.out.println("val: " + point.getX());
		actions.dragAndDropBy(element, offSet, point.getY()).build().perform();
	}

	public WebElement getXpathElement(String xpath) {

		return driver.findElement(By.xpath(xpath));
	}

	@SuppressWarnings("unused")
	public void switchToFirstFrame() {

		List<WebElement> frames = driver.findElements(By.xpath("//iframe"));
		for (int i = 0; i < frames.size(); i++) {
			driver.switchTo().frame(i);
			break;
		}
	}

	public void clickAcceptInBrowserAlertPopUp() {

		try {
			webDriverWait().until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String removingWhiteSpaces(String data) {

		String csvReqID = data.trim();
		String finalReqID = "";
		char[] value = csvReqID.toCharArray();
		for (int i = 0; i < value.length; i++) {
			if ((i % 2) == 0) {
				finalReqID = finalReqID + value[i];
			}
		}
		return finalReqID;
	}

	public void deleteAFile(String filePath) {
		File file = new File(filePath);
		file.delete();
	}

//	public ArrayList<String> storingDataFromCSVFileToArray(String CSVPath) throws IOException {
//
//		@SuppressWarnings("resource")
//		CSVReader reader = new CSVReader(new FileReader(CSVPath));
//		String[] cell;
//		ArrayList<String> records = new ArrayList<String>();
//		while ((cell = reader.readNext()) != null) {
//			for (String record : cell) {
//				records.add(record);
//			}
//		}
//		return records;
//	}

	public String gettingTextMessageFromAlertPopUp() {

		return (driver.switchTo().alert().getText());
	}

	public void closingTheAlertPopUp() {

		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public Map<String, List<String>> getHorizontalData(DataTable dataTable) {
		Map<String, List<String>> dataMap = null;
//		try {
//			dataMap = new HashMap<String, List<String>>();
//			List<String> headingRow = dataTable.raw().get(0);
//			int dataTableRowsCount = dataTable.getGherkinRows().size() - 1;
//			ArrayList<String> totalRowCount = new ArrayList<String>();
//			totalRowCount.add(Integer.toString(dataTableRowsCount));
//			dataMap.put("totalRowCount", totalRowCount);
//			for (int i = 0; i < headingRow.size(); i++) {
//				List<String> dataList = new ArrayList<String>();
//				dataMap.put(headingRow.get(i), dataList);
//				for (int j = 1; j <= dataTableRowsCount; j++) {
//					List<String> dataRow = dataTable.raw().get(j);
//					dataList.add(dataRow.get(i));
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return dataMap;
	}

	public String getTestDataValue(String classPath, String fieldName) {
		String expectedPageName = null;
		try {
			Class<?> classObj = Class.forName(classPath);
			Object obj = classObj.newInstance();
			Field fieldValue = classObj.getDeclaredField(fieldName);
			expectedPageName = (String) fieldValue.get(obj);
		} catch (Exception e) {
			System.out.println(e);
		}
		return expectedPageName;
	}

	public String[] getTestDataValues(String classPath, String fieldName) {
		String[] expectedPageName = null;
		try {
			Class<?> classObj = Class.forName(classPath);
			Object obj = classObj.newInstance();
			Field fieldValue = classObj.getDeclaredField(fieldName);
			expectedPageName = (String[]) fieldValue.get(obj);
		} catch (Exception e) {
			System.out.println(e);
		}
		return expectedPageName;
	}

	public void swipeHorizontal(int duration, WebElement element) throws Exception {
		new TouchAction((PerformsTouchActions) driver)
				.press(PointOption.point(element.getLocation().getX() + (element.getSize().width - 20),
						element.getLocation().getY() + (element.getSize().height / 2)))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
				.moveTo(PointOption.point(element.getLocation().getX(),
						element.getLocation().getY() + (element.getSize().height / 2)))
				.release().perform();
	}

	public void actionClick(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.click();
		action.perform();
	}

	public void switchToNativeAppContext(AppiumDriver app) {
		try {
			Set<String> contextHandles = ((SupportsContextSwitching) app).getContextHandles();
			for (String context : contextHandles) {
				if (context.contains("NATIVE")) {
					((SupportsContextSwitching) app).context(context);
					// Thread.sleep(200L);
					System.out.println("**********************Successfully switching to Native context***************");
				}
			}
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
	}

	public boolean switchToWebAppContext(AppiumDriver app) throws InterruptedException {
		boolean flag = true;
		try {
			System.out.println("**********************Started switching to web context********************");
			Set<String> contextHandles = ((SupportsContextSwitching) app).getContextHandles();
			for (String context : contextHandles) {
				if (context.contains("WEBVIEW")) {
					((SupportsContextSwitching) app).context(context);
					// Thread.sleep(200L);
				}
			}
			flag = false;
			System.out.println("**********************Successfully switching to web context***************");
		} catch (Exception e) {
			System.err.println("********************Not able to switching to web context******************");
			logger.info(e.getMessage());
		} finally {
			System.out.println("flag Value : " + flag);
			if (flag) {
				System.out.println("Finally Block Executed : Switch to Native App Method Called ");
				switchToNativeAppContext(app);
				System.out.println("********************** switching back to Native App context***************");
			}
		}
		return flag;
	}

	public boolean hidemobileKeyboard(AndroidDriver app) {
		boolean isKeyboardHideResult = false;
		try {
			app.hideKeyboard();
			isKeyboardHideResult = true;
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
		return isKeyboardHideResult;
	}

	public void clickdeviceBackButton(AndroidDriver app) {
		try {
			app.navigate().back();
		}
		catch (Exception e) {
			logger.info(e.getMessage());
		}
	}

	public void waitForElement(WebElement locator) {
		try {
			logger.info("Checking the " + locator);
			webDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
		} catch (TimeoutException | NoSuchElementException e) {
			logger.info("The " + locator + " isn't clickable after timeout");
		}
	}

//	public void enterTextWithoutScroll(WebElement element, String textValue) {
//		waitVisibilityOfElement(element);
//		element.clear();
//		waitFor(1000);
//		logger.info("Entered Text - " + textValue);
//		element.sendKeys(textValue);
//	}

	public void enterTextWithoutScroll(WebElement element, String textValue) {
//		waitVisibilityOfElement(element);
		element.clear();
//		element.click();

		/*
		 * if (platformName.equalsIgnoreCase("android")) { element.clear(); } else {
		 * clearTextFields(element); }
		 */
//		waitFor(1000);
		logger.info("Entered Text - " + textValue);
		element.sendKeys(textValue);
	}

	public void enterTextWithoutClick(WebElement element, String textValue) {
		AndroidLoader();
		waitForElement(element);
		element.clear();
		waitFor(1000);
		logger.info("Entered Text - " + textValue);
		element.sendKeys(textValue);
	}

	public void clearTextFields(WebElement element) {
		int isCount = element.getText().length();
		for (int i = 0; i <= isCount; i++) {
			driver.findElement(By.id("delete")).click();
		}
	}

	public void hideMobileKeyboard() {
		if (platformName.equalsIgnoreCase("android")) {
			hidemobileKeyboard((AndroidDriver) driver);
		} else {
			int isPresent = driver.findElements(By.xpath("//XCUIElementTypeButton[@name='Done']")).size();
			if (isPresent == 1) {
				driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Done']")).click();
			}
		}
	}

	public String getSaltNumber() {
		String SALTCHARS = "1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 6) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}

	public void killAndRelaunch() throws Throwable {
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		Activity activity = new Activity(appPackage, appActivity);
		//((StartsActivity) driver).startActivity(activity);
		waitFor(10000);
	}

	public void androidHome() throws Throwable {
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.HOME));
	}

	public void androidBackgroundandLaunch() throws Throwable {
		((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(20));
		((AndroidDriver) driver).currentActivity();
	}

	public void waitVisibilityOfElement(WebElement element) {
		AndroidLoader();
		if (!element.isDisplayed()) {
			webDriverWait().until(ExpectedConditions.visibilityOf(element));
		}
	}

	public void staticTextValidation(WebElement element, String text) {
		try {
//			waitVisibilityOfElement(element);
			String staticText = element.getText();
			if (staticText.equalsIgnoreCase(text)) {
				logger.info("Expected text and actual text are same: " + staticText);
				System.out.println("Expected text and actual text are same: " + staticText);
//				Assert.assertTrue(true);
			} else {
				//System.out.println("Expected text and actual text are same: " + staticText);
				System.out.println("Static Text - Actual: " + staticText);
				System.out.println("Static Text - Expected: " + text);
				logger.info("Exopected text and actual text are not same");
				logger.info("Static Text - Actual: " + staticText);
				logger.info("Static Text - Expected: " + text);
				Assert.fail();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			Assert.fail();
		}
	}

	public void staticTextValidation(WebElement ele,String expected1,String expected2) {
		try {
//			webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(ele));
			if (ele.getText().equalsIgnoreCase(expected1)) {
				Assert.assertTrue(true);
			} else {
				throw new Exception();
			}
		} catch (Exception E) {
			if (ele.getText().equalsIgnoreCase(expected2)) {
				Assert.assertTrue(true);
			} else {
				Assert.fail();
			}
		}
	}

	public void staticTextValidation(String Actual, String Expected) {
		try {

			String staticText = Actual;
			if (staticText.equalsIgnoreCase(Expected)) {
				logger.info("Expected text and actual text are same: " + staticText);
				System.out.println("Expected text and actual text are same: " + staticText);
			} else {
				//System.out.println("Expected text and actual text are same: " + staticText);
				System.out.println("Static Text - Actual: " + staticText);
				System.out.println("Static Text - Expected: " + Expected);
				logger.info("Exopected text and actual text are not same");
				logger.info("Static Text - Actual: " + staticText);
				logger.info("Static Text - Expected: " + Expected);
				Assert.fail();
			}
		} catch (Exception e) {

		}
	}
	public void staticTextNotSame(WebElement element, String text) {
		try {
			waitVisibilityOfElement(element);
			String staticText = element.getText();
			if (!staticText.equalsIgnoreCase(text)) {
				logger.info("Expected text and actual text are same: " + staticText);
			} else {
				logger.info("Exopected text and actual text are not same");
				logger.info("Static Text - Actual: " + staticText);
				logger.info("Static Text - Expected: " + text);
				Assert.fail();
			}
		} catch (Exception e) {

		}
	}

//	public String GeneratePassword(int length) {
//		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
//		String pwd = RandomStringUtils.random(length, characters);
//		System.out.println("pwd:=" + pwd);
//		return pwd;
//	}
//
//	public String GenerateAlphanumericString(int length) {
//		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//		String str = RandomStringUtils.random(length, characters);
//		System.out.println("pwd:=" + str);
//		return str;
//	}

	public void wifiOff() throws InterruptedException {
		((AndroidDriver) driver).toggleWifi();
	}

	public void androidBack() {
		if (isElementDisplayedWithoutAssert(ContextualRegistrationPage.Loader)) {
			By loadingImage = By.xpath(AccountConstants.LOADERA);
			webDriverWait().until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		}
		((AndroidDriver) driver).pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		logger.info("Navigated back");
		waitFor(2000);
	}

	public void time() throws InterruptedException {
		String dateTime = ((AndroidDriver) driver).getDeviceTime("HH:mm");
		String[] time = dateTime.split("T");
		String timeValue = time[1];
		String[] time1 = timeValue.split(":");
		String timeV = time1[0];
		deviceTime = Integer.parseInt(timeV);
		logger.info("Time to validate " + timeV);
	}

	public void pressAndroidDeleteKey() {
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
	}

	public void pressAndroidEnter() {
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	}

	public void getCoordinates(WebElement element) throws Exception {
		// Locate element for which you wants to retrieve x y coordinates.
		// Used points class to get x and y coordinates of element.
		waitVisibilityOfElement(element);
		Point classname = element.getLocation();
		xcordi = classname.getX();
		System.out.println("Element's Position from left side " + xcordi + " pixels.");
		ycordi = classname.getY();
		System.out.println("Element's Position from top " + ycordi + " pixels.");
	}

	public void androidTap() {
		waitFor(3000);
		int X = xcordi + 280;
		int Y = xcordi + 420;
		new TouchAction((PerformsTouchActions) driver).tap(PointOption.point(X, Y)).perform();

	}

	public void AuthLoader(WebElement element) {
		if (isElementDisplayedWithoutAssert(element)) {
			for (int i = 0; i < 10;) {
				waitFor(1000);
				i++;
				logger.info("################### Fueling Loader is still displayed#########################");
				if (!isElementDisplayedWithoutAssert(element)) {
					logger.info("###################Fueling Loader disappeared#########################");
					break;
				}
			}
		}
	}
	public void iOSBack(){
		if (isElementDisplayedWithoutAssert(ContextualRegistrationPage.Loader)) {
			By loadingImage1 = By.xpath(AccountConstants.LOADER);
			webDriverWait().until(ExpectedConditions.invisibilityOfElementLocated(loadingImage1));
		}
		((IOSDriver)driver).navigate().back();
		logger.info("Navigated back");
		waitFor(2000);
	}

	public void launchiOSApp() {
		((IOSDriver) driver).activateApp("com.exxonmobil.esso-uk-qa");
	}

	public void backgroundiOSApp() {
		((IOSDriver) driver).runAppInBackground(Duration.ofSeconds(10));
	}

	public void closeIOSApp() {
		driver.close();
	}

	public boolean isAlertPresent() {
		boolean flag = false;
		try {
			webDriverWait().until(ExpectedConditions.alertIsPresent());
			flag = true;
		} catch (StaleElementReferenceException stale) {
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	public void ScrollToDown(String Scroll, String direction, WebElement element) {
		if ("ANDROID".equalsIgnoreCase(platformName)) {
			driver.findElement(AppiumBy.androidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(" + Scroll
							+ ").instance(0))"));
			waitFor(1000);
			setImplicit(elementWaitInSeconds);
		} else if ("IOS".equalsIgnoreCase(platformName)) {
			for (int i = 0; i < 5; i++) {
				boolean isElementPresent = element.isDisplayed();
				if (!isElementPresent) {
					/*
					 * JavascriptExecutor js = (JavascriptExecutor) driver; HashMap<String, String>
					 * scrollObject = new HashMap<String, String>(); scrollObject.put("direction",
					 * direction); js.executeScript("mobile: scroll", scrollObject);
					 */
					Map<String, Object> args = new HashMap<>();
					args.put("direction", "down");
					driver.executeScript("mobile: swipe", args);
				} else {
					break;
				}
			}
		}
	}
	String btniOSElement ="//XCUIElementTypeButton[@name='%s']";
	String btnAndroidElement= "//android.widget.Button[@text='%s']";
	public WebElement getButtonElement(String label){
		WebElement element;
		if(platformName.equalsIgnoreCase("iOS")) {
			element = (WebElement) driver.findElement(By.xpath(String.format(btniOSElement,label)));
		} else {
			element = (WebElement) driver.findElement(By.xpath(String.format(btnAndroidElement,label)));
		}
		return element;
	}
	String txtiOSElement ="//XCUIElementTypeStaticText[@name='%s']";
	public WebElement getTextElement(String label){
		WebElement element;
		if(platformName.equalsIgnoreCase("iOS")) {
			element= (WebElement) driver.findElement(By.xpath(String.format(txtiOSElement, label)));
		} else {
			element= (WebElement) driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(" + label + ").instance(0))"));
		}
		return element;
	}
	String txtContainsElement ="//XCUIElementTypeStaticText[contains(@name,'%s')]";
	public WebElement getTextContainsElement(String label) {
		WebElement element;
		if (platformName.equalsIgnoreCase("iOS")) {
			element= (WebElement) driver.findElement(By.xpath(String.format(txtContainsElement, label)));
		} else {
			element =(WebElement) driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(" + label + ").instance(0))"));
		}
		return element;
	}

	String txtAndroidEditElement ="//android.widget.EditText[@text='%s']";
	public WebElement getAndroidEditTextElement(String label){
		return (WebElement) driver.findElement(By.xpath(String.format(txtAndroidEditElement,label)));
//		return (WebElement) driver.findElement(By.xpath(String.format(txtAndroidEditElement,label)));
	}
	String txtAndroidIDContainsElement ="//android.widget.TextView[contains(@id,'%s')]";
	public WebElement getAndroidContainsIDElement(String label){
		return (WebElement) driver.findElement(By.xpath(String.format(txtAndroidIDContainsElement,label)));
	}
	String txtAndroidElementAnything ="//*[@text='%s']";
	public WebElement getAndroidElementText(String label){
		return (WebElement) driver.findElement(By.xpath(String.format(txtAndroidElementAnything,label)));
	}

	public void appUninstallInstall(){
		Map<String, Object> params = new HashMap<>();
		params.put("bundleId", "com.exxonmobil.esso-uk-qa");
		driver.executeScript("mobile: removeApp", params);
	}

	public void appInstall(){
		Map<String, Object> params = new HashMap<>();
		params.put("app", prop.getProperty("iosAppPath"));
		driver.executeScript("mobile: installApp", params);
		launchiOSApp();
	}

//	public void selectMonthYearPrickerValue(List<WebElement> el,String firstPickerValue, String secondPickerValue){
//		el.get(0).setValue(firstPickerValue);
//		waitFor(1500);
//		el.get(1).setValue(secondPickerValue);
//	}

	public void selectSinglePickerValue(WebElement el) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("order", "next");
		params.put("offset", 0.15);
		params.put("element", ((RemoteWebElement) el).getId());
		driver.executeScript("mobile: selectPickerWheelValue", params);

	}
	//	public void selectNextPickerValue(WebElement el,String firstPickerValue) {
//		el.setValue(firstPickerValue);
//	}
	public void selectPreviousPickerValue(WebElement el) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("order", "previous");
		params.put("offset", 0.15);
		params.put("element", ((RemoteWebElement) el).getId());
		driver.executeScript("mobile: selectPickerWheelValue", params);
	}

//	public boolean checkIfCardLogoisGreyedOut(WebElement ele){

//		webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(ele));
//		Point point = ele.getCenter();
//		int x = point.getX();
//		int y = point.getY();
//		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		int grey=0;
//		try {
//			BufferedImage img = ImageIO.read(scr);
//			int clr = img.getRGB(x, y);
//			Color col = new Color(clr, true);
//
//			System.out.println(clr + "color- rgb");
//			int red = col.getRed();
//			int green = col.getGreen();
//			int blue = col.getBlue();
//			grey= (red + green + blue) / 3;
//
//
//			System.out.println("Red " + red + " Green " + green + " Blue" + blue);
//			System.out.println("Grey " + grey);
//
//		} catch (Exception E) {
//			logger.info("Failed to get logo grey out status");
//		}
//		if(grey>200){
//			return true;
//		}
//		else{
//			return false;
//		}

//	}

	public void tapElementAt(WebElement ele,double x,double y){

		Rectangle rectangle=ele.getRect();
		int topLeftX=rectangle.getX();
		int topLeftY=rectangle.getY();
		int height=rectangle.getHeight();
		int width=rectangle.getWidth();

		Point point=new Point(topLeftX+(int)(width*x),topLeftY+(int)(height*y));

		TouchAction touchAction=new TouchAction((PerformsTouchActions) driver);
		touchAction.tap(PointOption.point(point)).perform();

	}

	public AppiumDriver getWebViewDriver() throws Exception {

		if (webViewDriv==null) {
			webViewDriv = (AppiumDriver) driver;

			try {

				logger.info("Switching to WebView....");
				Thread.sleep(20000);
				switchToWebAppContext((webViewDriv));
				Thread.sleep(5000);
				logger.info("Switched to WebView Successfully");
			} catch (InterruptedException e) {
				throw new Exception("Failed to switch to WebContext Window");
			}
		}
		return webViewDriv;
	}


}