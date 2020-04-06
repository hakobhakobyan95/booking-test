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
    static SignInForCookie signInForCookie;

//    public void aaaa() throws InterruptedException {
//        System.out.println("aaaa");
//        signInForCookie.signIn();
//        cookie = signInForCookie.getCookie();
//    }


//    @BeforeMethod
//    public void initCookie() throws InterruptedException {
//        if (getCookieAAAA() == null){
//            signInForCookie = new SignInForCookie(webDriver);
//            signInForCookie.signIn();
//            setCookie(signInForCookie.getAllCookie());
//        }
//    }

    @Test
    public void a1() throws InterruptedException {
//        mainScreen.clickSignInButton()
//                .signInMethod();
//        Thread.sleep(5000);
//        mainScreen.getCookie();

        mainScreen = new MainScreen(webDriver);
        Thread.sleep(5000);
    }

    @Test
    public void b2() throws InterruptedException {
        System.out.println("2nd test");
        Thread.sleep(155000);
        mainScreen = new MainScreen(webDriver);
        //webDriver.navigate().refresh();
        //Assert.assertEquals("Shushan", mainScreen.getNameVerify());
    }
}
