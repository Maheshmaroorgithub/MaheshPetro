package pages;

import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepLibrary.GenericWrappers;

import java.util.List;

public class WebPage extends GenericWrappers {
    public WebPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "q")
    private WebElement searchBox;

    public WebElement getSearchBox(){
        return searchBox;
    }


}
