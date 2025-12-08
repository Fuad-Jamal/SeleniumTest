package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

@BeforeClass
public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
    homePage = new HomePage(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
