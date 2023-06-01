package methods;

import Pages.HomePage;

import static com.codeborne.selenide.Condition.text;

public class Chat {

    static HomePage homePage = new HomePage();

    static public void createAndOpenChat() {
        homePage.buttonAddChat.click();
        homePage.inputChatName.setValue("Чат-просто чат");
        homePage.buttonCreateChat.click();
        homePage.firstChat.click();
    }


}
