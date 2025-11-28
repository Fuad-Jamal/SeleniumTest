package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test
public void dropTest(){
    var dropPage = homePage.clickDropdown();
    dropPage.clickOption();

    }
}
