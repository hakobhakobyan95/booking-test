package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SettingListPage extends Screen {
    WebDriver driver;
    Select selectLevel;


    public SettingListPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
//
    By birthDate = By.id("bday");
//
    By birthMonth = By.id("bmonth");
//
    By birthYear = By.id("byear");

    public void birthDayFields(){
        wait.until(ExpectedConditions.elementToBeClickable(birthDate));
        utils.select(birthDate,"10");
        utils.select(birthMonth,"7");
        utils.select(birthYear,"2000");
    }

    public String getBirthDate() {
        selectLevel = new Select(driver.findElement(birthDate));
        selectLevel.selectByValue("10");
        return driver.findElement(birthDate).getText();

    }

    public String getBirthMonth() {
        return driver.findElement(birthMonth).getText();
    }

    public String getBirthYear() {
        return driver.findElement(birthYear).getText();
    }
}
