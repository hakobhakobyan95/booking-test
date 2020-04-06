package pom;

import driver.WebDriverSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class SignInForCookie extends Screen {
    WebDriver driver;

    public SignInForCookie(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By sighIn = By.xpath("//span[contains(text(),'Sign in')]");
    //
    By emailField = By.id("username");
    //
    By nextButton = By.xpath("//span[@class='bui-button__text']");
    //
    By passwordField = By.id("password");
    //
    By secondSignIn = By.xpath("//span[@class='bui-button__text']");

    public void signIn() throws InterruptedException {
        utils.click(sighIn);
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        utils.sendKeys(emailField, "shoushan007@gmail.com");
        utils.click(nextButton);
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        utils.sendKeys(passwordField, "AutomationCourse");
        utils.click(secondSignIn);
    }
    public Cookie getCookie(){
        System.out.println(driver.manage().getCookieNamed("bkng_sso_session"));
        return driver.manage().getCookieNamed("bkng_sso_session");
    }
    public Set<Cookie> getAllCookie(){
        Set<Cookie> cookies = driver.manage().getCookies();
        Set<Cookie> bookingCookie;
        bookingCookie = Collections.<Cookie>emptySet();
        Iterator<Cookie> cookieIterator = cookies.iterator();
        while (cookieIterator.hasNext()){
            System.out.println(cookieIterator.next().getDomain());
            if(cookieIterator.hasNext() && cookieIterator.next().getDomain() == "account.booking.com") {
                bookingCookie.add(cookieIterator.next());
            }
        }
        /*for (Cookie cookie: cookies){
            System.out.println(cookie.getDomain());
            if (cookie.getDomain() == ".booking.com"){
                bookingCookie.add(cookie);
            }
        }*/
        return bookingCookie;
    }

    public void addCookie(Cookie cookie){
        driver.manage().addCookie(cookie);
    }
}
