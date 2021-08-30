package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ActionsClass {
    static WebDriverWait wait;

    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","C://Drivers/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C://Drivers/geckodriver.exe");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities = DesiredCapabilities.firefox();
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("your firefox version");
        capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setCapability("marionette", false);

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.softwaretestinghelp.com/geckodriver-selenium-tutorial/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//a[text()='Tutorials']"));
        actions.moveToElement(element).build().perform();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);



        driver.quit();
    }
    }
