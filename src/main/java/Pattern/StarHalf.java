package Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Set;

public class StarHalf {

    public static void main(String args[]){

        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print("*");

            }
            System.out.println("");
            }
            }

//    public void windows(WebElement element){
//
//        WebDriver driver= null;
//        String parent = driver.getWindowHandle();
//        Set<String> handle = driver.getWindowHandles();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOf(element));
//        element.click();
//        for (String child: handle) {
//            if (!parent.contains(child)){
//                driver.switchTo().window(child);
//                driver.getTitle();
//                WebElement element1= null;
//                element1.click();
//                Set<String> handle2 = driver.getWindowHandles();
//
//                for (String child2: handle2) {
//                    driver.switchTo().window(child2);
//                    driver.getTitle();
//                }
//                driver.switchTo().window(child);
//                driver.close();
//            }
//
//        }
//        driver.switchTo().window(parent);
//
//            }
}



