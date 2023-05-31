package uiTests;

import Pages.HomePage;
import Pages.LoginPage;
import com.codeborne.selenide.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sevice.Driver;
import sevice.OpenSite;


abstract public class BaseTest {

    Driver driver = new Driver();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @BeforeMethod
    public void initTest() {
        driver.initDriver();
        OpenSite.openMessenger();
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
