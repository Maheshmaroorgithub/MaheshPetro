package stepDefinitions;

import contants.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;
import io.cucumber.datatable.DataTable;
import io.appium.java_client.AppiumDriver;

public class NectarPointinFilteSteps extends Nectar_PointsinFilterPage{

	@When("^Stations accepting Mobile pay should have Nectar points in the filter options$")
	public void stations_accepting_Mobile_pay_should_have_Nectar_points_in_the_filter_options() throws Throwable {
		waitFor(2000);
		clickButtonWithOutScroll(stations);
		waitFor(2000);
		//clickButtonWithOutScroll(continueButton);
		//clickButtonWithOutScroll(locationPermission);
//		clickButtonWithOutScroll(filterButton);
		waitFor(2000);
		NectarPointScroll();
		//ScrollTo(StationFinderConstants.nectarPoint, AccountConstants.IOSSCROLLUP, stationfinder.nectarPointlink);
		nectarPointsLinkVarification();
	}
	
	@Then("^From LID screen reach Station finder$")
	public void from_LID_screen_reach_Station_finder() throws Throwable {
		nectarPointlink.click();
		applyFilter.click();
		searchBox.sendKeys(StationFinderConstants.citySeacrch, Keys.ENTER);
//		clickButtonWithOutScroll(filterButton);
		waitFor(2000);

		nectarPointsLinkClick();


	}
}
