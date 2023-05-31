package methods;

import Pages.LoginPage;

public class Authorization {

    static LoginPage loginPage = new LoginPage();

    public static void auth() {
        loginPage.userNameInput.setValue("ADMIN");
        loginPage.passwordInput.setValue("123456");
        loginPage.buttonAuth.click();
    }
}
