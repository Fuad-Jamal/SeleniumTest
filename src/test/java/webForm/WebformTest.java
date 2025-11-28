package webForm;

import base.BaseTest;
import org.testng.annotations.Test;

public class WebformTest extends BaseTest {
    @Test
    public void fillForm(){
        var web = homePage.clickWebform();
        web.fillForm("John","Doe");
        web.uploadFile("\"C:\\Users\\User\\Downloads\\Analyze and reflect on factors that commonly lead to the success or failure of a project.docx\"");
    }
}
