import driver.WebDriverSettings;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.ListPage;
import pom.MainScreen;
import pom.ResultPage;

import java.util.concurrent.TimeUnit;

public class anyTest extends WebDriverSettings {
    MainScreen mainScreen;
    ListPage listPage;
    ResultPage resultPage;

    @BeforeMethod
    public void setUp() {
        mainScreen = new MainScreen(webDriver);
        listPage = new ListPage(webDriver);
        resultPage = new ResultPage(webDriver);
    }


    /*Test case.ID 7
    Verify that filter "Hotels" works properly
     */
    @Test
    public void filteredOnlyHotels() throws InterruptedException {
        mainScreen.inputPlace("Yerevan")
                .clickSearchButton()
                .clickPopularFilterHotels();
        Thread.sleep(5000);
    }
    /*Test case.ID 8
    Verify that after searching user can change search parameters
    */
    @Test
    public void changeSearchParameters(){
        try {
            mainScreen.inputPlace("Yerevan")
                    .clickSearchButton()
                    .changeNumberOfAdults()
                    .changeNumberOfChild()
                    .changeNumberOfRooms();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void oneStarCheckBox () throws InterruptedException {
        mainScreen.sendKeysToInputField()
                .clickSearchButton();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        mainScreen.clickCheckbox();
        Thread.sleep(3000);
        listPage.starLabelInfo();

    }
    /*Test case ID 10
    Verification of Filter by "Property type" */

    @Test
    public void verifyPropertyYype() throws InterruptedException{
        mainScreen.inputPlace("New York" )
                .clickSearchButton().verifyPropertyHostel();
        Thread.sleep(3000);
        Assert.assertEquals("Hostel", resultPage.verifyPropertyHostel());
    }

}
