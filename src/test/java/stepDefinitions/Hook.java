package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import stepLibrary.GenericWrappers;

public class Hook extends GenericWrappers {

	@Before
	public void before(Scenario scenario) throws Exception {
		appiumStart();
		System.out.println("Get In To Invoke app");
		new GenericWrappers().initiateNativeAPP();
	}


	@After
	public void afterClass(Scenario scenario) throws Exception {
//		if (scenario.isFailed()) {
//			System.out.println("Scenario Failed...Taking screenshot....");
////			captureScreenshot();
//			takeScreenShotonFailure(scenario);
//		}
		appiumStop();
	}

	@AfterStep
	public void afterEachStep(Scenario scenario) {
		if (scenario.isFailed()) {
			System.out.println("Scenario Failed...Taking screenshot....");
			byte[] screenshot = driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getId());
		}
	}

}