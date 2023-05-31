package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    public SelenideElement imageWelcome = $x("//img[contains(@class, 'HomePage')]");
    public SelenideElement buttonAddChat = $x("//button[@aria-label='Add Item']");
    public SelenideElement buttonRegUser = $x("//a[@href='/reg']");
    public SelenideElement inputChatName = $x("//input[@name='chat-name']");
    public SelenideElement inputChatDescription = $x("//input[@name='description']");
    public SelenideElement inputFileLoad = $x("//input[@type='file']");
    public SelenideElement buttonCreateChat = $x("//button[text()='Создать']");
    public SelenideElement firstChat = $x("//div[contains(@class, 'ChatList_container')]/div/div[1]");
    public SelenideElement inputMessage = $x("//div[contains(@class, 'input')]//div[contains(@class, 'input')]");
    public SelenideElement inputSmile = $x("//div[contains(@class, 'input')]//div[contains(@class, 'input')]");

}
