package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public abstract class ABaseTest {
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            Configuration.browser = "chrome";
            Configuration.browserSize = "1920x1080";
            Configuration.headless = true;
            Configuration.driverManagerEnabled = true;
        }
        @BeforeMethod
        public void init() {
            setUp();
        }

        @AfterMethod
        public void tearDown() {
            Selenide.closeWebDriver();
        }
}
