package AutomationPractice.Pages;

import AutomationPractice.Utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends BasePage {
    //PageFactory POM
    @FindBy(css=".login")
    WebElement signInLink;

    //Constructor method
    public CommonPage(){
        PageFactory.initElements(driver,this);
    }
    //navigate to authentication or signIn page
    public void gotoAuthenticationPage(){
        signInLink.click();
    }

}
