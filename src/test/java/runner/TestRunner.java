package runner;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.cucumber.listener.Reporter;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import stepLibrary.GenericWrappers;

import java.io.File;

@RunWith(Cucumber.class)
/*
 * @ExtendedCucumberOptions(jsonReport = "target/cucumber.json", retryCount = 0,
 * //To rerun the scenario , if the scenario fails detailedReport = true,
 * detailedAggregatedReport = true, overviewReport = true, //coverageReport =
 * true, screenShotLocation="ScreenShots/", screenShotSize="100px",
 * jsonUsageReport = "target/cucumber-usage.json", usageReport = true, toPDF =
 * true, excludeCoverageTags = {"@flaky" }, includeCoverageTags = {"@passed" },
 * outputFolder = "target/")
 */


@CucumberOptions(features = {"src/test/java/features"},
		plugin = {//"json:target/cucumber.json",
				//"html:target/site/cucumber-pretty", "usage:target/cucumber/cucumber.json",
//				"html:com.cucumber.listener.ExtentCucumberFormatter:target/extent-report/report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		glue = {"stepDefinitions","helpers"}, monochrome = true, tags = "@COFChallengeFlow")

public class TestRunner {

	//@AfterClass
//	public static void reportGeneration() {
////		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
//		Reporter.loadXMLConfig(new File(GenericWrappers.userDir + "/extent-report-config.xml"));
//		Reporter.setSystemInfo("user", System.getProperty("user.name"));
//		Reporter.setSystemInfo("os", GenericWrappers.osName);
//		Reporter.setSystemInfo("platform", GenericWrappers.platformName);
//	}

}