package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RobotClass {
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

        WebDriver driver = new ChromeDriver();
        List<WebElement> list = driver.findElements(By.xpath("a"));
        driver.manage().window().maximize();
        driver.get("http://spreadsheetpage.com/index.php/");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Downl')]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[starts-with(text(),'Yearly Calendar Workbook')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'yearly-calendar.xls')]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.quit();
    }
    }
