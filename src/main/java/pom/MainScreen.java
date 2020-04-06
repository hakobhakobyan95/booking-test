package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class MainScreen extends Screen {
    WebDriver driver;
    //******* This is for "Where are you going" input field **************
    By directionInputField = By.xpath(" //input[@id='ss']");

    //*******         Search button        *******************************
    By searchButton = By.xpath("//button[contains(@class,'sb-searchbox__button')]");

    //*******          Sign In button     ********************************
    By sighIn = By.xpath("//span[contains(text(),'Sign in')]");

    //*******          Email field        ********************************
    By emailField = By.id("username");

    //*******          Next Button        ********************************
    By nextButton = By.xpath("//span[@class='bui-button__text']");

    //*******        Password field       ********************************
    By passwordField = By.id("password");

    //*******  Sign In button(Last one before sign-in account)   *********
    By secondSignIn = By.xpath("//span[@class='bui-button__text']");

    //*******  Username field, on the right-top side of the page  ********
    By nameVerify = By.xpath("//span[@class='header_name user_firstname ge-no-yellow-bg']");

    //******            DropDown table for Settings               ********
    By dropDownSetting = By.xpath("//span[@id='profile-menu-trigger--content']");

    //******            Settings Button        ***************************
    By settingsButton = By.xpath("//a[contains(text(),'Settings')]");


    public MainScreen(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public MainScreen inputPlace(String city) throws InterruptedException {
        utils.sendKeys(directionInputField, city);
        return this;
    }

    public ResultPage clickSearchButton() throws InterruptedException {
        utils.click(searchButton);
        ResultPage resultPage = new ResultPage(driver);
        return resultPage;
    }

    public MainScreen clickSignInButton() {
        utils.click(sighIn);
        return this;
    }

    public MainScreen signInMethod() throws InterruptedException {
        utils.sendKeys(emailField, "shoushan007@gmail.com");
        utils.click(nextButton);
        wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        utils.sendKeys(passwordField, "AutomationCourse");
        utils.click(secondSignIn);
        return this;
    }

    public String getNameVerify() {
        return driver.findElement(nameVerify).getText();
    }

    public MainScreen settingDropDown() {
        wait.until(ExpectedConditions.elementToBeClickable(dropDownSetting));
        utils.click(dropDownSetting);
        return this;
    }

    public SettingListPage clickSettingsButton() {
        wait.until(ExpectedConditions.elementToBeClickable(settingsButton));
        utils.click(settingsButton);
        SettingListPage settingListPage = new SettingListPage(driver);
        return settingListPage;
    }

   // By inputField = By.id("ss");
   // By searchButton = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[2]/button[1]/span[1]");
    By checkBox = By.className("filterbox_options_content");
    By starLabel = By.className("bk-icon -sprite-ratings_stars_1");


    public MainScreen sendKeysToInputField() throws InterruptedException{
        utils.sendKeys(directionInputField, "New York");
        return this;
    }

//    public void clickSearchButton() throws InterruptedException{
//        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
//        utils.click(searchButton);
//
//    }

    public void clickCheckbox(){
        wait.until(ExpectedConditions.elementToBeClickable(checkBox));
        utils.click(checkBox);
    }



}
