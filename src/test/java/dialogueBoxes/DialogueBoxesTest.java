package dialogueBoxes;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DialogueBoxesTest extends BaseTest {

    @Test
    public void launchAlertTest(){
        var alert = homePage.clickDialogue();
        alert.showAlert("my-alert");
        assertEquals(alert.getAlertText(),"Hello world!", "Alert text incorrect");
        alert.acceptAlert();

    }

    @Test
    public void launchConfirmTest(){
        var confirm = homePage.clickDialogue();
        confirm.showAlert("my-confirm");
        assertEquals(confirm.getAlertText(), "Is this correct?"," Confirm text incorrect");
        confirm.closeAlert();
    }

//    @Test
//    public void launchPromptTest(){
//        var prompt = homePage.clickDialogue();
//        prompt.showAlert("my-prompt");
//        prompt.writeToAlert("Mama mia");
//        prompt.acceptAlert();
//        prompt.readAlertText();
//        assertEquals(prompt.getAlertText(),"You typed: Mama mia", "Prompt text incorrect");
//        prompt.closeAlert();
//    }

    @Test
    public void clickDialogues(){
        var dialogPage = homePage.clickDialogue();
        dialogPage.launchModal();
        assertEquals(dialogPage.savedChanges(),"You chose: Save changes", "Incorrect dialogue result");
        dialogPage.clickSaved("iis");
    }
}
