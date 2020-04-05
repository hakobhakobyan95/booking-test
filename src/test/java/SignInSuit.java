import driver.WebDriverSettings;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.MainScreen;
import pom.SettingListPage;
import pom.SignInForCookie;

public class SignInSuit extends WebDriverSettings {
    MainScreen mainScreen;
    SettingListPage settingListPage;


    @BeforeMethod
    public void setUp() {
        mainScreen = new MainScreen(webDriver);
        settingListPage = new SettingListPage(webDriver);
    }

    @Test
    public void signIn() throws InterruptedException {
//        mainScreen.clickSignInButton()
//                .signInMethod();
//        Thread.sleep(5000);
//        mainScreen.getCookie();
        Assert.assertEquals("Shushan", mainScreen.getNameVerify());
    }

    @Test
    public void birthDatePositive() throws InterruptedException {
        mainScreen.clickSignInButton()
                .signInMethod()
                .settingDropDown()
                .clickSettingsButton()
                .birthDayFields();
        Thread.sleep(5000);

        Assert.assertEquals("10",settingListPage.getBirthDate());
        Assert.assertEquals("7",settingListPage.getBirthMonth());
        Assert.assertEquals("2000",settingListPage.getBirthYear());
    }
}
