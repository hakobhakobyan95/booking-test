package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ResultPage extends Screen {
    WebDriver driver;
    // click "Hotels" tick in "Popular Filters"
    By popularFilterHotels = By.xpath("//div[@id='filter_filter-suggestions']//span[@class='filter_label'][contains(text(),'Hotels')]");
    //
    By choseNumberOfAdults = By.id("group_adults");
    //
    By choseChildrenCount = By.id("group_children");
    //
    By choseNumberOfRooms = By.id("no_rooms");

    By propertyFilter = By.xpath("//div[@id='filter_hoteltype']//a[4]//label[1]//div[1]//span[1]");

    public ResultPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


    /*public void foo() throws InterruptedException {
        WebElement navBar = driver.findElement(By.xpath("//div[@id='filter_filter-suggestions']"));
        WebDriverWait wait = new WebDriverWait(driver, 7000);
        List<WebElement> list = navBar.findElements(By.tagName("span"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
        }
        utils.click(popularFilterHotels);
        WebElement hotelCheckbox = driver.findElement(By.xpath("//*[@id=\"filter_filter-suggestions\"]/div[2]/a[1]/label"));
        System.out.println(hotelCheckbox.isEnabled());
    }*/


    public ResultPage clickPopularFilterHotels() {
        utils.click(popularFilterHotels);
        return this;
    }

    public String verifyPropertyHostel(){
        utils.click(propertyFilter);
        WebDriverWait wait = new WebDriverWait(driver, 7000);

        WebElement hostelList = driver.findElement(By.id("hotellist_inner"));
        wait = new WebDriverWait(driver, 7000);
        By list = By.className("sr-hotel__name");
        utils.click(list);
        wait = new WebDriverWait(driver, 7000);

        WebElement hostelLabel = driver.findElement(By.className("hp__hotel-type-badge"));

        return hostelLabel.getText();
    }

    public ResultPage changeNumberOfAdults() {
        utils.select(choseNumberOfAdults, "4");
        return this;
    }

    public ResultPage changeNumberOfChild() {
        utils.select(choseChildrenCount, "2");
        return this;
    }

    public ResultPage changeNumberOfRooms() {
        utils.select(choseNumberOfRooms, "2");
        return this;
    }

}
