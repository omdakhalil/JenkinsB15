package class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

//        username Text Box
                WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test");
        //        password field

//        take screenshot
        TakesScreenshot ss = (TakesScreenshot) driver;
//        take the scrren shot as file
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
        System.out.println(sourceFile);
//        save the file in computer
        FileUtils.copyFile(sourceFile,new File("C:/Users/emad_/IdeaProjects/demo/SeliniumBatch10/src/screen/iou.png"));




    }
}