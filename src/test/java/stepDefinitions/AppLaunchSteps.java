package stepDefinitions;

import contants.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import io.cucumber.datatable.DataTable;

public class AppLaunchSteps extends AppLaunchPage {
    @Then("^verify that Welcome screen screen is displayed$")
    public void verifyThatWelcomeScreenScreenIsDisplayed() {
        if (isElementDisplayedWithoutAssert(CameraAccessOkPopup)) {
            clickButtonWithOutScroll(CameraAccessOkPopup);
        }
        if (isElementDisplayedWithoutAssert(FaceIdAccessOkPopup)) {
            clickButtonWithOutScroll(FaceIdAccessOkPopup);
        }
        waitForElement(acceptAllButtonAppLaunch, 20);
        clickButtonWithOutScroll(acceptAllButtonAppLaunch);

        waitForElement(TutorialSkipButton, 10);
        Assert.assertTrue(TutorialSkipButton.isEnabled());
        Assert.assertTrue(welComeScreen.isDisplayed());
        if (platformName.equalsIgnoreCase("android")) {
            staticTextValidation(welComeScreen, AppLaunchConstants.Tutorial_welComeMessage);
            staticTextValidation(subTitleText, AppLaunchConstants.SubTitleAndroid);
        } else {
            Assert.assertTrue(isTextMatch(welComeScreen.getText().trim().replace("\n", ""), AppLaunchConstants.Tutorial_welComeMessageiOS));
            Assert.assertTrue(isTextMatch(subTitleText.getText().trim().replace("\n", ""), AppLaunchConstants.SubTitle));
        }
    }

    @And("^Verify Pay securely from your car screen displayed$")
    public void verifyPaySecurelyFromYourCarScreenDisplayed() {
//        waitFor(5000);
        clickButtonWithOutScroll(tutorialNextButton);
        waitForElement(TutorialScreen2Title, 5);
        staticTextValidation(TutorialScreen2Title, AppLaunchConstants.Tutorial_PaySecurelyTitle);
        Assert.assertTrue(TutorialSkipButton.isEnabled());
        Assert.assertTrue(WelcomSUBTtl_2.isDisplayed());
//        Assert.assertTrue(AppInstallAndLaunchPage.WelcomSUBTtl_2.isDisplayed());
        Assert.assertTrue(tutorialNextButton.isDisplayed());
    }

    @And("^Verify Collect Nectar points on every fill$")
    public void collectNectarPointsOnEveryFill() {
        waitFor(5000);
        clickButtonWithOutScroll(tutorialNextButton);
        staticTextValidation(welComeScreen, AppLaunchConstants.Tutorial_NectarPoint_Title);
        Assert.assertTrue(tutorialGetStartedButton.isDisplayed());
    }

    @Then("^Verify the Start fueling button$")
    public void verifyTheStartFuelingButton() {
        waitFor(4000);
        Assert.assertTrue(nectarPointLID.isDisplayed());
        System.out.println(nectarPointLID.getText());
    }

    @Then("^verify that Welcome screen screen is displayed and Pump in welcome screen$")
    public void verifyThatWelcomeScreenScreenIsDisplayedAndPumpInWelcomeScreen() {
        if (isElementDisplayedWithoutAssert(CameraAccessOkPopup)) {
            clickButtonWithOutScroll(CameraAccessOkPopup);
        }
        if (isElementDisplayedWithoutAssert(FaceIdAccessOkPopup)) {
            clickButtonWithOutScroll(FaceIdAccessOkPopup);
        }
        waitForElement(acceptAllButtonAppLaunch, 20);
        clickButtonWithOutScroll(acceptAllButtonAppLaunch);

        waitForElement(TutorialSkipButton, 10);
//        Assert.assertTrue(subTitleText.isDisplayed());
        Assert.assertTrue(TutorialSkipButton.isEnabled());
        Assert.assertTrue(welComeScreen.isDisplayed());
//        staticTextValidation(welComeScreen, AppLaunchConstants.Tutorial_welComeMessage);
        if (platformName.equalsIgnoreCase("android")) {
            staticTextValidation(subTitleText, AppLaunchConstants.SubTitleAndroid);
        } else {
            Assert.assertTrue(isTextMatch(subTitleText.getText().trim().replace("\n", ""), AppLaunchConstants.SubTitle));
        }
    }

    @When("^Enter the UserName in UN Text field$")
    public void enterTheUserNameInUNTextField() {
        waitFor(5000);
        clickButtonWithOutScroll(userName);
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(NONEOFTHEABOVE)) {
            clickButtonWithOutScroll(NONEOFTHEABOVE);
        }
        enterTextWithoutScroll(userName, AppLaunchConstants.userName);
    }

    @And("^Enter the Password in PW Text field$")
    public void enterThePasswordInPWTextField() {
        waitFor(3000);
        enterTextWithoutScroll(password, AppLaunchConstants.password);
    }

    @And("^Accept all the cookies$")
    public void accept_all_the_cookies() throws Throwable {
        waitForElement(acceptAllButtonAppLaunch, 20);
        clickButtonWithOutScroll(acceptAllButtonAppLaunch);
    }

    @And("^Uninstall the app$")
    public void uninstallTheApp() {
        new GuestCheckOutPage().appUninstallInstall();
    }
}
