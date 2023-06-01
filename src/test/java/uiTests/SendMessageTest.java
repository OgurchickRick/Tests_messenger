package uiTests;

import com.codeborne.selenide.Condition;
import methods.Authorization;
import methods.Chat;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

public class SendMessageTest extends BaseTest{

    @Test
    public void sendMessage() {
        Authorization.auth();
        Chat.createAndOpenChat();
        homePage.inputMessage.setValue("HelloWorld").pressEnter();
        homePage.lastMessage.shouldBe(text("HelloWorld"));
    }

}
