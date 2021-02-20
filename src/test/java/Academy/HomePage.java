package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import java.io.IOException;

public class HomePage extends base {
    public WebDriver driver;
    public static Logger Log = LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initalized() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }

    @Test(dataProvider = "getData")
    public void basePageNavigation(String username, String password, String text) throws IOException {

        driver.get(prop.getProperty("url"));
        LandingPage l = new LandingPage(driver);
        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(username);
        lp.getPassword().sendKeys(password);
        Log.info(text);
        l.getLogin().click();

        /*
        ForgotPassword fp = lp.forgotPassword();
        fp.getEmail().sendKeys("xxx");
        fp.sendMeInstructions().click();
        */

    }

    @DataProvider
    public Object[] getData() {
        // Row stands for how many different data types should run
        // columns stands for how many values per each test
        Object[][] data = new Object[2][3];
        // 0th row
        data[0][0] = "nonrestricteduser@qw.com";
        data[0][1] = "123456";
        data[0][2] = "Restricted User";


        data[1][0] = "resticteduser@qw.com";
        data[1][1] = "456788";
        data[1][2] = "Non resticted user";

        return data;
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }

}
