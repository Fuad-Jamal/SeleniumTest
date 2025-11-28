package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DialogueBoxesPage {
    private WebDriver driver;

    public DialogueBoxesPage(WebDriver driver){
        this.driver = driver;
    }

    public void launchModal() {
        driver.findElement(By.id("my-modal")).click();
        driver.findElement(By.xpath("//*[@id=\"example-modal\"]/div/div/div[3]/button[2]")).click();

    }
    public String savedChanges(){
        String save = driver.findElement(By.id("modal-text")).getText();
        return save;
    }
    public void clickSaved(){
        driver.findElement(By.xpath("//*[@id=\"example-modal\"]/div/div/div[3]/button[2]")).click();
    }
    public void writeToAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String readAlertText(){
        return driver.findElement(By.id("prompt-text")).getText();
    }
    public void showAlert(String id){
        driver.findElement(By.id(id)).click();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void closeAlert(){
        driver.switchTo().alert().dismiss();
    }

}
