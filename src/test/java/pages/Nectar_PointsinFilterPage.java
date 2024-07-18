package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class Nectar_PointsinFilterPage extends GenericWrappers {
	
	public Nectar_PointsinFilterPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="action_station")
	public WebElement stations;
	
	@AndroidFindBy(id="edtSearch")
	public WebElement searchBox;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView")
	public WebElement nectarPointlink;
	
	@AndroidFindBy(id="serv_fac_apply_filter_btn")
	public WebElement applyFilter;

	@AndroidFindBy(xpath = "//*[@text=\"Nectar Points\"]")
	public WebElement NectarPoint;

	@AndroidFindBy(xpath = "//*[@text=\"Mobile Payment Enabled\"]")
	public WebElement FromElement;



	public void nectarPointsLinkVarification(){
		WebElement element = (WebElement) driver.findElement(By.xpath(("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView")));
//	WebElement element = (WebElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView"));

		boolean NectorDisplayed = element.isDisplayed();
	}
	public void nectarPointsLinkClick(){
		WebElement element = (WebElement) driver.findElement(By.xpath(("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[8]/android.widget.TextView")));
		boolean NectorDisplayed = element.isDisplayed();
		element.click();
	}
	public void NectarPointScroll(){
		WebElement element = (WebElement) driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"services_filter_categories_tv\")).setMaxSearchSwipes(5).scrollIntoView("
						+ "new UiSelector().descriptionContains(\"Nectar Points\"))"));

		//Perform the action on the element
		System.out.println(element.getText()+"Nectar Point is displayed");
	}

}