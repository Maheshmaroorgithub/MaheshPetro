package stepDefinitions;

import contants.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import io.cucumber.datatable.DataTable;
import io.appium.java_client.AppiumDriver;

public class NativePasswordSteps extends NativePasswordPage {

	@And("^validate the OS Native password pop up$")
	public void validate_the_os_native_password_pop_up() throws Throwable {
		waitForElement(LoginSavePwd,20);
		if (platformName.equalsIgnoreCase("android")) {
			isElementDisplayed(LoginSavePwd);
			isElementDisplayed(LoginSave);
			isElementDisplayed(LoginSaveNever);
//			androidBack();
		}
		else{
			isElementDisplayed(LoginSavePwd);
			isElementDisplayed(LoginSaveNever);

		}
	}

	@When("^user clicks the save password button$")
	public void userClicksTheSavePasswordButton() {
		waitFor(3000);
		clickButtonWithOutScroll(LoginSavePwd);
	}

	@When("^user clicks the Not now button$")
	public void userClicksTheNotNowButton() {
		waitFor(5000);
		clickButtonWithOutScroll(LoginSaveNever);
	}

	@And("^user checks the suggestions on the keyboard$")
	public void userChecksTheSuggestionsOnTheKeyboard() {
		waitFor(5000);
		if (isElementDisplayedWithoutAssert(EmailSuggestion)) {
			isElementDisplayed(EmailSuggestion);
		} if (isElementDisplayedWithoutAssert(EmailSuggestionKey)) {
			isElementDisplayed(EmailSuggestionKey);
		}
	}

	@And("^user clicks the mail suggestion from the keyboard$")
	public void userClicksTheMailSuggestionFromTheKeyboard() {
		waitFor(5000);
		if (isElementDisplayedWithoutAssert(EmailSuggestion)) {
			clickButtonWithOutScroll(EmailSuggestion);
		} if (isElementDisplayedWithoutAssert(EmailSuggestionKey)) {
			clickButtonWithOutScroll(EmailSuggestionKey);
			clickButtonWithOutScroll(EmailSuggestionList);
		}
	}

	@Then("^user validates the password getting displayed$")
	public void userValidatesThePasswordGettingDisplayed() {
		waitFor(3000);
		if (isElementDisplayedWithoutAssert(PasswordPrompt)) {
			isElementDisplayed(PasswordPrompt);
		} if (isElementDisplayedWithoutAssert(AccountPassword)) {
			isElementDisplayed(AccountPassword);
			Assert.assertTrue(!AccountPassword.getAttribute("text").isEmpty());
		}
	}

//	@Then("^user validates the password not getting displayed$")
//	public void userValidatesThePasswordNotGettingDisplayed() {
//		waitFor(3000);
//		isElementDisplayed(PasswordPrompt);
//	}
}