package AutomationPractice.Pages;

import AutomationPractice.Utils.BasePage;
import AutomationPractice.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AunthenticationPage extends BasePage {
    //PageFactory POM
    @FindBy(css = "#login_form")
    WebElement loginForm;

    //Constructor method
    public AunthenticationPage(){
        PageFactory.initElements(driver,this);
    }
    public boolean isUserOnAuthenticationPage(){
      return Utils.isElementDisplayed(loginForm);
    }
}
