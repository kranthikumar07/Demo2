package AutomationPractice;

import AutomationPractice.Utils.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {
    @BeforeClass
    //open Browser
    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //Open URL
        driver.get(baseURL);
        //Maximise the browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void closeBrowser(){
        //close the browser
        driver.quit();
    }
}