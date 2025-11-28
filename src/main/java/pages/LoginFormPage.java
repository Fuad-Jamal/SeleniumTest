package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage {
    private WebDriver driver;
    private By loginField = By.id("username");
    private By passwordField = By.id("password");
    private By submitButton = By.cssSelector("body > main > div > div:nth-child(4) > div > form > button");
    private By invalidMessage = By.id("invalid");


    public LoginFormPage(WebDriver driver){
        this.driver = driver;
    }
    public void loginOption(String username, String password){
        driver.findElement(loginField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }
    public String getInvalidMessage(){
        return driver.findElement(invalidMessage).getText();
    }

}
