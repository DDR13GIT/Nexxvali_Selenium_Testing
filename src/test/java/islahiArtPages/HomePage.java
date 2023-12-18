package islahiArtPages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
    private final WebDriver driver;
    private final By accountButtonLocator = By.xpath("//a[@class=\"ast-header-account-link ast-header-account-type-icon ast-account-action-link\"]/span[@class=\"ahfb-svg-iconset ast-inline-flex svg-baseline\"]");

    private static final Logger logger = LogManager.getLogger(HomePage.class);
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAccountButton() {
        WebElement accountButton = driver.findElement(accountButtonLocator);
        Assert.assertTrue(accountButton.isDisplayed());
        logger.info("Clicking on Account Button");
        accountButton.click();
    }

}
