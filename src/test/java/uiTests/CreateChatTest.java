package uiTests;

import com.codeborne.selenide.Condition;
import methods.Authorization;
import org.testng.annotations.Test;

public class CreateChatTest extends BaseTest{

    @Test
    public void createChat() {
        Authorization.auth();
        homePage.buttonAddChat.click();
        homePage.inputChatName.setValue("Чат-просто чат");
        homePage.buttonCreateChat.click();
        homePage.firstChat.shouldBe(Condition.text("Чат-просто чат"));
    }


}
