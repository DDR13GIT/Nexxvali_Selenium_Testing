package reusables;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class testingBase {
    static String chromeDriver = "webdriver.chrome.driver";
    static String driverLocation = "D:\\webdrivers\\chromedriver.exe";
    static String url = "https://islahiart.com/";
    private static final Logger logger = LogManager.getLogger(testingBase.class);
    private WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void testDriver(String browser) throws Exception{

       if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty(chromeDriver, driverLocation);
            driver = new ChromeDriver();
        }
        logger.info("Opening Browser !!!");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get(url);
        Thread.sleep(5000);
    }

    @AfterTest
    public void closeBrowser(){
        logger.info("Closing Browser !!!");
        driver.close();
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
