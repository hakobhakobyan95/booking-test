package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    String url = "https://www.booking.com/";
    protected WebDriver webDriver;
    WebDriverWait wait;
    Actions builder;

    public ChromeDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
        chromeDriver.get(url);
//        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(chromeDriver, 150);
        builder = new Actions(chromeDriver);
//        Set<Cookie> cookies =
        return chromeDriver;
    }

    @BeforeMethod
    public void setUpWebDriver() {
        System.out.println("chrome was init");
        webDriver = initChromeDriver();
    }

    @AfterMethod
    public void afterTest() {
        webDriver.quit();
    }
}
