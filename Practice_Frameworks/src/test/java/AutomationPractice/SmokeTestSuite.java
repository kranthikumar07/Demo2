package AutomationPractice;
import AutomationPractice.Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class SmokeTestSuite extends BaseTest {

    //Creating objects for Page classes to use the page class methods.
    AunthenticationPage authenticationPage = new AunthenticationPage();
    CommonPage commonPage = new CommonPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignOutPage signOutPage = new SignOutPage();

    //Test case login to application with valid credentials
    @Test
    public void verifyUserCanLogin(){
        //verify user is on the home page
        Assert.assertTrue(homePage.isUserOnHomePage());
        //select signIn link or navigate to Authentication page
        commonPage.gotoAuthenticationPage();
        // Verify that user is on the Authentication page
        Assert.assertTrue(authenticationPage.isUserOnAuthenticationPage());
        //Enter email address
        loginPage.enterEmailAddress();
        //Enter Password
        loginPage.enterPassword();
        //Click on sign-in button
        loginPage.clickSignIn();
        //Verify Welcome to your account message is displaying or not
        loginPage.isWelcomeToAccountTextPresent();
        //Sign-out from application
        signOutPage.signOut();


    }

}
