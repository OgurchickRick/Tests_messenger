package uiTests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;

public class LoginTests extends BaseTest{

    @Test
    public void loginValid() {
        loginPage.userNameInput.setValue("ADMIN");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonAuth.click();
        homePage.imageWelcome.shouldBe(visible);
    }

    @Test
    public void loginDontPassword() {
        loginPage.userNameInput.setValue("Temka");
        loginPage.buttonAuth.click();
        loginPage.noPasswordError.shouldBe(visible);
    }

}
