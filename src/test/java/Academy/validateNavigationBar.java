package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

import java.io.IOException;

public class validateNavigationBar extends base {
    public WebDriver driver;
    // Adding logs
    public static Logger Log = LogManager.getLogger(base.class.getName());
    // Generating html reports
    // Screenshots on failure
    // Jenkins integration

    @BeforeTest
    public void initalized() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }

    @Test
    public void validateAppNavBar() {
        driver.get(prop.getProperty("url"));
        LandingPage l = new LandingPage(driver);
        Boolean nav = l.navBar().isDisplayed();
        Assert.assertTrue(nav);
        Log.info("Navigation Bar is displayed");
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
