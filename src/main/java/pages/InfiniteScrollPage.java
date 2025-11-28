package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }
public void scrollSection(int index){
String script = "window.scrollTo(0,document.body.scrollHeight)";
var jsExecutor = (JavascriptExecutor)driver;
while(numOfParagraphs()<index){
jsExecutor.executeScript(script);
}

}
public int numOfParagraphs(){
return driver.findElements(By.className("lead")).size();
}
}
