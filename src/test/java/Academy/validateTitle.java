package Academy;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import java.io.IOException;


public class validateTitle extends base {
    public WebDriver driver;
    public static Logger Log = LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initalized() throws IOException {

        driver = initializeDriver();
        Log.info("Driver is initialized");

        driver.get(prop.getProperty("url"));
        Log.info("Navigate to Home page");

    }
    @Test
    public void validateAppNavTitle() {
        driver.get(prop.getProperty("url"));
        LandingPage l = new LandingPage(driver);
        String title = l.getTitle().getText();
        Assert.assertEquals(title, "FEATURED COURSES");
        Log.info("Successfully validated Test message");

    }
    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
