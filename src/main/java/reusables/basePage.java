package reusables;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class basePage {
    static String ssLocation = "D:/webdrivers/ss/";

    protected WebDriver driver;

    public basePage(WebDriver driver) {
        this.driver = driver;
    }

    public void ifTestFails() {
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        try {
            FileUtils.copyFile(screenshot.getScreenshotAs(OutputType.FILE), new File(ssLocation));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
