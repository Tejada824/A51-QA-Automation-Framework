import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
        //constant variables used by helper methods
        public WebDriver driver;
        public WebDriverWait wait;
        public Actions action;
        public String url;
    }
}