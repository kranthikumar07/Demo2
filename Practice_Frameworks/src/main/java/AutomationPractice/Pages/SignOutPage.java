package AutomationPractice.Pages;

import AutomationPractice.Utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage extends BasePage {
    //Pagefactory POM
    @FindBy(css= ".logout")
    WebElement signOutButton;

    //Constructor method
    public SignOutPage(){
        PageFactory.initElements(driver,this);
    }
    public void signOut(){
        signOutButton.click();
    }
}
