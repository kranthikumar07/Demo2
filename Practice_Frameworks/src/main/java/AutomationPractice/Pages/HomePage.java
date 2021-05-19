package AutomationPractice.Pages;

import AutomationPractice.Utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    //PageFactory POM
    @FindBy (css = "#block_top_menu")
    WebElement homePageMenuTabs;

   //Constructor method
   public HomePage(){
       PageFactory.initElements(driver,this);
   }

   public boolean isUserOnHomePage(){
       return homePageMenuTabs.isDisplayed();
   }
}
