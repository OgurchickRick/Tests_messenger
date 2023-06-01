package uiTests;

import methods.Authorization;
import methods.Chat;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class CreateChatTest extends BaseTest{

    @Test
    public void createChat() {
        Authorization.auth();
        homePage.buttonAddChat.click();
        homePage.inputChatName.setValue("Чат-просто чат");
        homePage.buttonCreateChat.click();
        homePage.firstChat.shouldBe(text("Чат-просто чат"));
    }


}
