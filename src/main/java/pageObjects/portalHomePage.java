package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class portalHomePage {

    public WebDriver driver;

    public portalHomePage(WebDriver driver) {
        this.driver = driver;
    }
    By searchBox = By.cssSelector("[data-list='.list']");

    public WebElement getSearchBox() {
        return driver.findElement(searchBox);
    }
}



