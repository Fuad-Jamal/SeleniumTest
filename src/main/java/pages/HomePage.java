package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    private By loginButton = By.cssSelector("body > main > div > div:nth-child(5) > div:nth-child(1) > div > div > a:nth-child(2)");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginFormPage clickLoginForm() {
        driver.findElement(By.xpath("/html/body/main/div/div[5]/div[1]/div/div/a[1]")).click();
        return new LoginFormPage(driver);
    }

//    public void clickLink(String link) {
//        try {
////            loginButton.click();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public DropdownPage clickDropdown() {
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div[1]/div/div/a[3]")).click();
        return new DropdownPage(driver);

    }
    public InfiniteScrollPage clickScroll() {
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div[2]/div/div/a[2]")).click();
        return new InfiniteScrollPage(driver);

    }
    public DialogueBoxesPage clickDialogue() {
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div[2]/div/div/a[7]")).click();
        return new DialogueBoxesPage(driver);

    }
    public WebformPage clickWebform(){
        driver.findElement(By.xpath("/html/body/main/div/div[4]/div[1]/div/div/a[1]")).click();
        return new WebformPage(driver);
    }

}
