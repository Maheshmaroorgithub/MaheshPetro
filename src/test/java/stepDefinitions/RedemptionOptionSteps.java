package stepDefinitions;

import contants.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;
import io.cucumber.datatable.DataTable;
import io.appium.java_client.AppiumDriver;

public class RedemptionOptionSteps extends RedemptionOptionPage {
    @Given("^click in the login link in present in dashboard$")
    public void clickOnTheLoginLinkInPresentInDashboard() {
        waitFor(4000);
        clickButtonWithOutScroll(Loginlink);

    }

    @When("^Enter the UserName$")
    public void enterTheUserName() throws InterruptedException {
    }

    @And("^Enter the Password$")
    public void enterThePassword() {
        waitFor(1000);
        enterTextWithoutScroll(password, RedemptionOptionConstants.password);
    }

    @Then("^Click on logIn button$")
    public void clickOnLoginButton() throws InterruptedException {
        waitForElement(loginButton,5);
        clickButtonWithOutScroll(loginButton);
        waitFor(4000);
        if(isElementDisplayedWithoutAssert(NectarCloseLIDPopUp)) {
            clickButtonWithOutScroll(NectarCloseLIDPopUp);
        }
    }

    @Then("^Click on Continue button in Select pump screen$")
    public void clickOnContinueButtonInSelectPumpScreen() {
        waitFor(5000);
        clickButtonWithOutScroll(selectPumpContinue);
    }


    @Then("^Verify the Message is displayed$")
    public void verifyTheMessageIsDisplayed() {
        staticTextValidation(RewardPopupMessage, RedemptionOptionConstants.RewardPopupMessage);
    }

    @And("^Click Ok button on Redemption Popup$")
    public void clickRedemptionOnOkButtonOnPopup() {

        clickButtonWithOutScroll(okButton);
    }

//    @Then("^Verify the Reward section in confirm payment screen$")
//    public void verify_reward_section(){
//        webDriverWaitForElement(10).until(ExpectedConditions.visibilityOf(rewardSubtile));
//        Assert.assertTrue(rewardSubtile.isDisplayed());
//        Assert.assertTrue(EditLoyalityCardButton.isDisplayed());
//        Assert.assertTrue(noneTxt.isDisplayed());
//
//    }

//    @Then("^verify if user is able to select any offer and continue$")
//    public void user_select_any_offer(){
//
//        Assert.assertTrue(isElementEnabled(OffersPage.RedemptionOption1));
//        OffersPage.RedemptionOption1.click();
//        Assert.assertTrue(true);
//        continueBtn.click();
//    }

    @Then("^verify if reward is updated in confirm payment screen$")
    public void verify_reward_updated(){

        Assert.assertTrue(driver.findElements(By.xpath("//*[contains(@text,'None')]")).size()==0);
        Assert.assertTrue(updatedRewardTxt.isDisplayed());

    }

    @And("^user deselects the offer and continue$")
    public void deselect_offer(){

            webDriverWait().until(ExpectedConditions.visibilityOf(deselectOffer));
            Assert.assertTrue(deselectOffer.isDisplayed());
            deselectOffer.click();
            continueBtn.click();


    }

}
