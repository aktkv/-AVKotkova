import static com.codeborne.selenide.Selenide.open;

public class Contains {
    public static final String SITE_URL = "https://github.com/MNYudina/";
    public static final String SELENOID_START = PropertyLoader.loadProperty("selenoid");
    public static final String SELENOID_URL = PropertyLoader.loadProperty("selenoid.hub");

    public static void openPageBase(String url) {open(url);}
}
