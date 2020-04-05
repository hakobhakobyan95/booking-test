import driver.WebDriverSettings;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.MainScreen;
import pom.SettingListPage;
import pom.SignInForCookie;


public class dcds extends WebDriverSettings {
    MainScreen mainScreen;
    WebDriver driver;
    static Cookie cookie;
    static SignInForCookie signInForCookie;

    public void aaaa() throws InterruptedException {
        System.out.println("aaaa");
        signInForCookie.signIn();
        cookie = signInForCookie.getCookie();
    }


    @BeforeMethod
    public void jkadkjad() throws InterruptedException {
        System.out.println(cookie == null);
        if (cookie != null) {
            System.out.println("b sanxsnagvxsagvxsagasg");
            signInForCookie.addCookie(cookie);
        } else {
            signInForCookie = new SignInForCookie(webDriver);
            signInForCookie.signIn();
            cookie = signInForCookie.getCookie();
            System.out.println("2nd cookies" + cookie == null);
        }

    }

    @Test
    public void signIn() throws InterruptedException {
//        mainScreen.clickSignInButton()
//                .signInMethod();
//        Thread.sleep(5000);
//        mainScreen.getCookie();
        Thread.sleep(5000);
        Assert.assertEquals("Shushan", mainScreen.getNameVerify());
    }

    @Test
    public void asdsa() throws InterruptedException {
        System.out.println("cddscs");
        Thread.sleep(5000);
    }
}
