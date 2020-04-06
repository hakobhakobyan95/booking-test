package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.YourCookie;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    String url = "https://www.booking.com/";
    protected WebDriver webDriver;
    WebDriverWait wait;
    Actions builder;
    static Set<Cookie> cookie;
    static Set<YourCookie> yourCookie;

    /*public static Set<Cookie> getCookieAAAA() {
        return cookie;
    }

    public static void setCookie(Set<Cookie> cookie1) {
        cookie = cookie1;
        yourCookie = Collections.<YourCookie>emptySet();
        Iterator<Cookie> cookieIterator = cookie1.iterator();
        while (cookieIterator.hasNext()){
            System.out.println("eeeeeeeeeee");
            Cookie ck = cookieIterator.next();
            if(ck != null) {
                YourCookie yc = new YourCookie(ck);
                yourCookie.add(yc);
            }
        }
    }
*/
    public ChromeDriver initChromeDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
        /*System.out.println("before");
        if (yourCookie != null) {
            chromeDriver.get("https://www.google.com/\"");
            Iterator<YourCookie> yourCookieIterator = yourCookie.iterator();
            while (yourCookieIterator.hasNext()) {
                YourCookie yc = yourCookieIterator.next();
                if (yc != null) {
                    Cookie cookie = new Cookie(yc.getName(), yc.getValue(), yc.getDomain(), yc.getPath(), yc.getExpiry());
                    chromeDriver.manage().addCookie(cookie);

                }
            }
                Thread.sleep(150000);
        }*/
        System.out.println("Test pass");
        chromeDriver.get(url);
        wait = new WebDriverWait(chromeDriver, 150);
        builder = new Actions(chromeDriver);
        return chromeDriver;
    }

    @BeforeMethod
    public void setUpWebDriver() throws InterruptedException {
        System.out.println("chrome was init");
        webDriver = initChromeDriver();
    }

    @AfterMethod
    public void afterTest() {
        webDriver.quit();
    }
}
