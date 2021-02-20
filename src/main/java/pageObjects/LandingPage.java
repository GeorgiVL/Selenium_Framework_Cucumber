package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    By signin = By.cssSelector("a[href*='sign_in']");
    By title = By.cssSelector(".text-center>h2");
    By navBar = By.cssSelector(".nav.navbar-nav.navbar-right");
    By popup = By.xpath("//button[text()='NO THANKS']");

    public WebElement getLogin() {
        return driver.findElement(signin);
    }

    public WebElement getTitle() {
        return driver.findElement(title);
    }

    public WebElement navBar() {
        return driver.findElement(navBar);
    }

    public int getPopUpSize() {
        return driver.findElements(popup).size();
    }
    public WebElement getPopUp() {
        return driver.findElement(popup);
    }
}



