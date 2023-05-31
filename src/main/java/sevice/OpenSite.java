package sevice;

import Pages.GitPage;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.switchTo;

public class OpenSite {
    static GitPage gitPage = new GitPage();

    public static void openMessenger() {
        Selenide.open("https://github.com/MrArtga03/Messenger");
        gitPage.LinkSite.click();
        switchTo().window(1);
    }
}
