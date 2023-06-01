package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    public SelenideElement userNameInput = $x("//input[@name='username']");
    public SelenideElement passwordInput = $x("//input[@name='password']");
    public SelenideElement buttonAuth = $x("//button[contains(@class, 'enter')]");
    public SelenideElement noPasswordError = $x("//span[text()='Поле обязательно к заполнению!']");

}
