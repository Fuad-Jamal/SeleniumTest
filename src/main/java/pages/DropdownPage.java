package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    private WebDriver driver;


    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickOption(){
        Actions option = new Actions(driver);
        option.contextClick(driver.findElement(By.id("my-dropdown-1"))).perform();
        option.contextClick(driver.findElement(By.id("my-dropdown-2"))).perform();
        option.contextClick(driver.findElement(By.id("my-dropdown-3"))).perform();
    }

}
