import driver.WebDriverSettings;
import org.testng.Assert;
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

}
