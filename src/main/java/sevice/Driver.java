package sevice;

import com.codeborne.selenide.Configuration;

public class Driver {

    public void initDriver() {
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        Configuration.screenshots = false;
    }
}
