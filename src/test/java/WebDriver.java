import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import java.util.HashMap;
import java.util.Map;

public class WebDriver extends Contains {

    @BeforeClass
    public void openBrowser() {
        WebDriver.setUpDriver(Contains.SELENOID_START, Contains.SELENOID_URL);
    }

    @AfterMethod
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }

    /**
     * @param start   - если вернется "true" запуск тестов пойдет через Selenoid
     * @param hub     - хаб ссылка
     */
    public static void setUpDriver(String start, String hub) {
        if ("true".equals(start)) setRemoteBrowser(hub);
        else setLocalBrowser();
    }

    private static void setLocalBrowser() {
        baseSetUp();
    }

    private static void setRemoteBrowser(String hub) {
        baseSetUp();
        Configuration.remote = hub;
    }
    private static void baseSetUp() {
        ChromeOptions chromeOptions = new ChromeOptions();

        Map<String, Object> selenoid = new HashMap<>();
        selenoid.put("enableVNC", true);
        chromeOptions.setCapability("selenoid:options", selenoid);

        Configuration.browser = "chrome";
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "normal";
        Configuration.baseUrl = SITE_URL;
        Configuration.browserCapabilities = chromeOptions;
    }
}
