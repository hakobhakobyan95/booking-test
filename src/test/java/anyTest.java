import driver.WebDriverSettings;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.MainScreen;
import pom.ResultPage;

public class anyTest extends WebDriverSettings {
    MainScreen mainScreen;
//    ResultPage resultPage;

    @BeforeMethod
    public void setUp() {
        mainScreen = new MainScreen(webDriver);
//        this.resultPage = new ResultPage(webDriver);
    }

    @Test
    public void foo() throws InterruptedException {
        mainScreen.inputPlace()
                .clickSearchButton();
//        resultPage.foo();
        Thread.sleep(5000);
    }



}
