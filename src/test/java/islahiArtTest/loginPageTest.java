package islahiArtTest;


import islahiArtPages.AccountPage;
import islahiArtPages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginPageTest {

    public String url = "https://islahiart.com/";
    public String driverPath = "D:\\webdrivers\\chromedriver.exe";
    public WebDriver driver;
    private static final Logger logger = LogManager.getLogger(loginPageTest.class);

    @BeforeTest
    public void setup() {
        logger.info("Opening Browser...");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void verifyLogin() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickAccountButton();

        AccountPage accountPage = new AccountPage(driver);
        accountPage.enterUsername("ddroy13@gmail.com");
        accountPage.enterPassword("777777777");
        accountPage.clickSignInButton();

        Thread.sleep(4000);
        driver.quit();
    }


}
