package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListPage extends  Screen {

    WebDriver driver;

    By starLabel = By.className("bk-icon -sprite-ratings_stars_1");


    public ListPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void starLabelInfo(){
        System.out.println("\"Starlabel\" webelement found : " + starLabel);
    }
}
