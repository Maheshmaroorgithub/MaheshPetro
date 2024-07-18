package stepDefinitions;

import contants.*;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.*;
import io.cucumber.datatable.DataTable;
import io.appium.java_client.AppiumDriver;

public class HelpSteps extends HelpPage {

    @Given("^user clicks the more icon$")
    public void user_clicks_the_more_icon() throws Throwable {
        waitFor(5000);
        clickButtonWithOutScroll(moreIcon);
    }

    @And("^user validates the welcome screen for 30% completion$")
    public void user_validates_the_welcome_screen_for_thirty_percent_completion() throws Throwable
    {
        isElementDisplayed(thirtypercent);
        isElementDisplayed(circularIndicator);
    }

    @Given("^user taps the complete profile tab$")
    public void user_taps_the_complete_profile_tab() throws Throwable
    {

        clickButtonWithOutScroll(completeprofileIcon);

    }

//    @And("^user adds the Nectar card details by clicking the Add nectar card$")
//    public void user_adds_the_Nectar_card_details_by_clicking_the_Add_nectar_card() throws Throwable
//    {
//        //scrollToElement(addNdectarIcon);web element
//        waitElementToBeClickable(addNdectarIcon);
//        clickButtonWithOutScroll(addNdectarIcon);
//        clickButtonWithOutScroll(nectarGetStarted);
//
//        isElementDisplayed(nectarCompletionicon);
//        clickButtonWithOutScroll(nectarCompletionicon);
//    }

    @Then("^user check for Add Nectar Task as Completed$")
    public void user_check_for_Add_Nectar_Task_as_Completed() throws Throwable
    {
        isElementDisplayed(completeprofileIcon);
        clickButtonWithOutScroll(completeprofileIcon);
        scrollToElement(addNdectarIcon);
        clickButtonWithOutScroll(addNdectarIcon);
        isElementDisplayed(nectarAlreadyCompleted);
    }

    @And("^user verifies the Already completed pop up$")
    public void user_verifies_the_Already_completed_pop_up() throws Throwable
    {
        isElementDisplayed(nectarAlreadyCompleted);
        clickButtonWithOutScroll(nectarAlreadycompltdpopup);
    }

    @Then("^navigate to the Nectar card section$")
    public void navigate_to_the_nectar_card_section() throws Throwable {
        waitForElement(UserProfileAccount, 30);
        if ("ANDROID".equalsIgnoreCase(platformName)) {
            ScrollTo("Log Out", MenuConstants.IOSSCROLLUP, LogOut);

        } else {
            ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
        }
    }

    @And("^Add the Nectar card$")
    public void add_the_nectar_card() throws Throwable {
        waitForElement(AccountAddNectarCardButton,10);
        ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
        clickButtonWithOutScroll(AccountAddNectarCardButton);
        enterTextWithoutScroll(NectarCardnumberEnter, AccountConstants.NECTARCARDNUMBERNOTVERIFIED);
        if(platformName.equalsIgnoreCase("Android")) {
            hideMobileKeyboard();
        } else {
            clickButtonWithOutScroll(DoneButtonInNectarKeypad);
        }
        clickButtonWithOutScroll(NextButtonNectarCardAddScreen);
        waitFor(2000);
        if (isElementDisplayedWithoutAssert(NectarAddedSuccessfulTitle)) {
            clickButtonWithOutScroll(ContinueButtonNectarSuccessful);
        }
        clickButtonWithOutScroll(AccountNectarCardVerifyLaterPopup);
        waitFor(2000);
        clickButtonWithOutScroll(AccountNectarVerifyLaterSkip);
    }

    @Then("^Verify the nectar card section in the Account screen$")
    public void verify_the_nectar_card_section_in_the_account_screen() throws Throwable {
        ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
        Assert.assertTrue(
                isTextMatch(AccountNectarCardAdded.getText(), AccountConstants.ACCOUNTSCREENDELETENECTARCARDBUTTONCT));
        Assert.assertTrue(isElementEnabled(AccountNectarCardWithStars));
    }

    @And("^user taps on Support Centre icon$")
    public void user_taps_on_support_centre_icon() throws Throwable {
        waitForElement(supportcentreIcon,10);
//        Assert.assertTrue(isElementEnabled(supportcentreIcon));
        clickButtonWithOutScroll(supportcentreIcon);
    }

    @And("^user taps on Tutorial button in Help screen$")
    public void user_taps_on_tutorial_button_in_help_screen() throws Throwable {
        waitFor(5000);
        try {
            if (isElementDisplayedWithoutAssert(essoTutorialIcon)) {
                clickButtonWithOutScroll(essoTutorialIcon);
            } else {
                ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLDOWN, essoTutorialIcon);
                Assert.assertTrue(isElementDisplayedWithoutScroll(essoTutorialIcon));
                clickButtonWithOutScroll(essoTutorialIcon);
            }
        } catch (Exception E) {
            logger.info("ESSO TUTORIAL BUTTON IS NOT SEEN");
            Assert.fail();
        }
    }

    @Then("^user verifies the first screen$")
    public void user_verifies_the_first_screen() throws Throwable {
        waitFor(5000);
        if ("ANDROID".equalsIgnoreCase(platformName)) {
            waitFor(5000);
            Assert.assertTrue(isElementDisplayed(exxon_Help_feedback_Close));
            Assert.assertTrue(isTextMatch(FirstScreenTitle.getText(), HelpConstants.TITLEHELPTUTORIALONE));
            Assert.assertTrue(isTextMatch(FirstScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALONE));
            Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        } else {
            Assert.assertTrue(isElementDisplayedWithoutScroll(exxon_Help_feedback_Close));
            Assert.assertTrue(isTextMatch(FirstScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALONE1));
            Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        }
    }

    @And("^user taps on next button in the Tutorial screen one of the Help screen$")
    public void user_taps_on_next_button_in_the_tutorial_screen_one_of_the_help_screen() throws Throwable {
        waitForElement(nextIcon,10);
        //Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        clickButtonWithOutScroll(nextIcon);
    }

    @Then("^user verifies the second screen$")
    public void user_verifies_the_second_screen() throws Throwable {
        waitForElement(SecondScreenTitle,10);
        if ("ANDROID".equalsIgnoreCase(platformName)) {
            Assert.assertTrue(isTextMatch(SecondScreenTitle.getText(), HelpConstants.TITLEHELPTUTORIALTWO));
            Assert.assertTrue(isTextMatch(SecondScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALTWO));
            Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        } else {
            Assert.assertTrue(isElementDisplayedWithoutScroll(exxon_Help_feedback_Close));
            Assert.assertTrue(isTextMatch(SecondScreenTitle.getText(), HelpConstants.TITLEHELPTUTORIALTWO));
            Assert.assertTrue(isTextMatch(SecondScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALTWO1));
            Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        }
    }

    @Then("^user verifies the third screen$")
    public void user_verifies_the_third_screen() throws Throwable {
        waitForElement(GetStartedThirdTutorial,20);
        if ("ANDROID".equalsIgnoreCase(platformName)) {
            Assert.assertTrue(isTextMatch(ThirdScreenTitle.getText(), HelpConstants.TITLEHELPTUTORIALTHREE));
            Assert.assertTrue(isTextMatch(ThirdScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALTHREE));
            Assert.assertTrue(isElementDisplayedWithoutScroll(GetStartedThirdTutorial));
        } else {
            Assert.assertTrue(isTextMatch(ThirdScreenTitle.getText(), HelpConstants.TITLEHELPTUTORIALTHREE));
            Assert.assertTrue(isTextMatch(ThirdScreenSubtitle.getText(), HelpConstants.SUBTITLEHELPTUTORIALTHREE1));
            Assert.assertTrue(isElementDisplayedWithoutScroll(GetStartedThirdTutorial));
        }
    }

    @And("^user taps on Get started button in the Help screen$")
    public void user_taps_on_get_started_button_in_the_help_screen() throws Throwable {
        //Assert.assertTrue(isElementDisplayedWithoutScroll(GetStartedThirdTutorial));
        clickButtonWithOutScroll(GetStartedThirdTutorial);
    }

    @Then("^user lands on Help screen in NLID$")
    public void user_lands_on_help_screen_in_nlid() throws Throwable {
        Assert.assertTrue(isElementDisplayedWithoutScroll(essoTutorialIcon));
    }

    @And("^user taps on next button in the Tutorial screen two of the Help screen$")
    public void user_taps_on_next_button_in_the_tutorial_screen_two_of_the_help_screen() throws Throwable {
        waitForElement(nextIcon,20);
        Assert.assertTrue(isElementDisplayedWithoutScroll(nextIcon));
        clickButtonWithOutScroll(nextIcon);
    }

    @Then("^verify if the App assistant icon is displayed$")
    public void verifyIfTheAppAssistantIconIsDisplayed() {
        waitForElement(AppAssistantIcon,4);
        Assert.assertTrue(isElementEnabled(AppAssistantIcon));
    }

    @When("^user taps on App assistant icon$")
    public void userTapsOnAppAssistantIcon() {
        clickButtonWithOutScroll(AppAssistantIcon);
    }

    @Then("^verify if the system displays the details of the App Assitant$")
    public void verifyIfTheSystemDisplaysTheDetailsOfTheAppAssitant() {
        waitForElement(AppAssistantHeaderTxt,5);
        Assert.assertTrue(isElementEnabled(AppAssistantClose));
        Assert.assertTrue(isElementDisplayed(AppAssistantHeaderTxt));
        Assert.assertTrue(isElementDisplayed(AppAssistantQuest1));
        Assert.assertTrue(isElementDisplayed(AppAssistantQuest2));
        Assert.assertTrue(isElementDisplayed(AppAssistantQuest3));
        Assert.assertTrue(isElementDisplayed(AppAssistantQuest4));
        // Assert.assertTrue(isElementDisplayed(AppAssistantRobotIcon));
        Assert.assertTrue(isElementDisplayed(AppAssistantSearchKeyword));
    }


    @And("^user taps on close in App assistant screen$")
    public void userTapsOnCloseInAppAssistantScreen() {
        clickButtonWithOutScroll(AppAssistantClose);
    }

    @Then("^verify if the system displays the details of the App Assistant with whats new header and tap on skip$")
    public void verifyIfTheSystemDisplaysTheDetailsOfTheAppAssistantWithWhatsNewHeaderAndTapOnSkip() {
        if(isElementDisplayedWithoutAssert(WhatsNew)) {
            Assert.assertTrue(isElementDisplayed(WhatsNew));
            Assert.assertTrue(isElementDisplayed(GotQuestions));
            Assert.assertTrue(isElementEnabled(CheckoutAppAssistant));
            Assert.assertTrue(isElementEnabled(Skip));
            clickButtonWithOutScroll(Skip);
        }
        else {
            logger.info("No App Assistant Screen");
        }

    }

    @When("^user taps on the first topic of Pre-Authorization$")
    public void userTapsOnTheFirstTopicOfPreAuthorization() {
        clickButtonWithOutScroll(AppAssistantQuest1);
    }

    @Then("^verify if the details related to Pre-Authorization is displayed$")
    public void verifyIfTheDetailsRelatedToPreAuthorizationIsDisplayed() {
        waitForElement(AppAssistantHeaderTxt,5);
        Assert.assertTrue(isElementDisplayed(AppAssistantTitle));
        Assert.assertTrue(isElementDisplayed(AppAssistantHeaderTxt));
        Assert.assertTrue(isTextMatch(PreAuthQuest.getText(),HelpConstants.PREAUTHQUEST));
//        staticTextValidation(PreAuthQuest,HelpConstants.PREAUTHQUEST);
        Assert.assertTrue(PreAuthAns1.isDisplayed());
        Assert.assertTrue(PreAuthQuest2.isDisplayed());
        if ("ANDROID".equalsIgnoreCase(platformName)) {
            ScrollTo(HelpConstants.PREAUTHTHIRDPOINT, AccountConstants.IOSSCROLLUP, PreAuthAnswer3);
        }
        Assert.assertTrue(isElementDisplayed(PreAuthAnswer1));
        Assert.assertTrue(isElementDisplayed(PreAuthAnswer2));
        Assert.assertTrue(isElementDisplayed(PreAuthAnswer3));
        Assert.assertTrue(isElementEnabled(AppAssistantClose));
    }
    @When("^tap on MORE link in the Pre-Authorization details tab$")
    public void tapOnMORELinkInThePreAuthorizationDetailsTab() {
        waitFor(10000);
        clickButtonWithOutScroll(PreAuthMore);
    }

    @Then("^verify if the system expands the blue bubble for content expansiom$")
    public void verifyIfTheSystemExpandsTheBlueBubbleForContentExpansiom() {
        waitForElement(PreAuthFullAns,15);
        Assert.assertTrue(isElementDisplayed(PreAuthFullAns));
    }

    @When("^tap on LESS link in the Pre-Authorization details tab$")
    public void tapOnLESSLinkInThePreAuthorizationDetailsTab() {
        ScrollTo(HelpConstants.LESSASSISTANT, AccountConstants.IOSSCROLLUP, PreAuthLess);
        clickButtonWithOutScroll(PreAuthLess);
    }

    @Then("^verify if the system collapse the blue bubble for content contraction$")
    public void verifyIfTheSystemCollapseTheBlueBubbleForContentContraction() {
        Assert.assertTrue(isElementDisplayed(PreAuthAns1));
    }

    @When("^user taps on 'Search by keywords' field in App Assistant$")
    public void userTapsOnSearchByKeywordsFieldInAppAssistant() {
        clickButtonWithOutScroll(AppAssistantSearchKeyword);
    }

    @Then("^verify the components in the 'Search by keywords' field$")
    public void verifyTheComponentsInTheSearchByKeywordsField() {
        waitForElement(BackBtn,5);
        Assert.assertTrue(isElementEnabled(BackBtn));
        Assert.assertTrue(isElementDisplayed(AppAssistantTitle));
        Assert.assertTrue(isElementEnabled(keyboardSearchBtn));
        Assert.assertTrue(isElementEnabled(AppAssistantClose));
    }

    @When("^user tap on search button in the mobile keyboard without entering any text$")
    public void userTapOnSearchButtonInTheMobileKeyboardWithoutEnteringAnyText() {
        if ("ANDROID".equalsIgnoreCase(platformName)) {
            enterTextWithoutClick(keyboardSearchBtn, ManualRegistrationConstants.OKBUTTON);
        }
        clickButtonWithOutScroll(keyboardSearchBtn);
    }

    @Then("^validate if the system displays an appropriate sorry msg for the user$")
    public void validateIfTheSystemDisplaysAnAppropriateSorryMsgForTheUser() {
        waitForElement(SearchSorrryTxt,5);
        staticTextValidation(SearchSorrryTxt,HelpConstants.SEARCHSORRYTXT);
    }

    @And("^navigate to the Nectar card section from account screen$")
    public void navigateToTheNectarCardSectionFromAccountScreen() {
        waitFor(25000);
        ScrollTo(AccountConstants.PRIVACYTXT, AccountConstants.IOSSCROLLUP, AccountPrivacyPolicy);
    }

    @Then("^user validates that the app assistant is not present$")
    public void userValidatesThatTheAppAssistantIsNotPresent() {
        waitForElement(BackBtn, 20);
        Assert.assertTrue(AppAssistantButton.isEmpty());
    }

    @AndroidFindBy(id = "account_nectar_edit")
    @iOSXCUITFindBy(iOSNsPredicate = "type== 'XCUIElementTypeStaticText' AND name == 'Delete'")
    public WebElement AccountNectarCardAdded;
}