package AutomationPractice.Pages;

import AutomationPractice.Utils.BasePage;
import AutomationPractice.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    //Pagefactory POM
    @FindBy(css = "#email")
    WebElement emailAddressField;

    @FindBy(css = "#passwd")
    WebElement passwordField;

    @FindBy(css = "#SubmitLogin")
    WebElement signInButton;

    @FindBy(css = ".info-account")
    WebElement myAccountWelcomeText;

    //Constructor method
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void enterEmailAddress(){
        //Enter the email address
        emailAddressField.sendKeys(username);
    }
    public void enterPassword(){
        passwordField.sendKeys(password);
    }
    public void clickSignIn(){
        signInButton.click();

    }
    public boolean isWelcomeToAccountTextPresent(){
        return Utils.isElementDisplayed(myAccountWelcomeText);
    }

}
