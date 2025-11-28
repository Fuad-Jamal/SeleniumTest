package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebformPage {
    private WebDriver driver;
    private By textInput = By.id("my-text-id");
    private By passwordInput = By.xpath("/html/body/main/div/form/div/div[1]/label[2]/input");
    private By chooseFile = By.cssSelector("body > main > div > form > div > div:nth-child(2) > label:nth-child(3) > input");
    public WebformPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillForm(String text, String password){
        driver.findElement(textInput).sendKeys(text);
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void uploadFile(String filePath){
        driver.findElement(chooseFile).sendKeys(filePath);
        submitForm();
    }
    public void submitForm(){
        driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button")).click();
    }

}
