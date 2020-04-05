package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ResultPage extends Screen {
    WebDriver driver;
//
    By popularFilterHotels = By.xpath("//div[@id='filter_filter-suggestions']//span[@class='filter_label'][contains(text(),'Hotels')]");
//

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

    public void clickPopularFilterHotels() {
        utils.click(popularFilterHotels);
    }

}
