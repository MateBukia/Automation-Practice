package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class Chromerunner {
    @BeforeMethod(description = "Configure browser before tests")
    public void setUp() {
        open("https://officemart.ge/ge");
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));
    }

    @AfterMethod(description = "Close browser and clear cookies")
    public void tearDown() {
        SelenideLogger.removeListener("allure");
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}