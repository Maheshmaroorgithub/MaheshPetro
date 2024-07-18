package stepDefinitions;

import io.cucumber.java.en.When;
import pages.*;

public class WebSteps extends WebPage {

        @When("^I search with keyword hello$")
        public void isearchwithkeword(){
            System.out.println("hello");
            getSearchBox().sendKeys("hello");
        }


}
