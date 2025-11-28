package loginPage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginFormPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void logTest(){
        LoginFormPage login = homePage.clickLoginForm();
        login.loginOption("mandem","1234");
        assertTrue(login.getInvalidMessage().contains("Invalid credentials"),"Alert text is incorrect");

    }
}
