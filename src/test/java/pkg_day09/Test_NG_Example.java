package pkg_day09;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_NG_Example {

    WebDriver driver = null;

    @BeforeClass
    @Parameters("devlab_url")
    public void lanch_browser(String devlab_url) throws Exception
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
  //      driver.get("https://www.devlabsalliance.com/");
        driver.get(devlab_url);
        Thread.sleep(10000);
    }


    @AfterClass
    public void close_browser()
    {
        driver.quit();
    }

    @Test(priority=1)
    public void do_Some_Testing()
    {
        System.out.println("I'm learning Test NG");
    }

    @Test(priority=0)
    public void do_DevLap_Header_menu_Validation() throws Exception
    {
        System.out.println("I'm in header menu validation");

        //span[text()='Courses']

        WebElement ele= null;
        ele = driver.findElement(By.xpath("//span[text()='Courses']"));

        Actions action = new Actions(driver);

        // Mouse Hover into Courses Menu bar ...

        if(ele.isDisplayed())
        {
            System.out.println("The Devlab Courses menu bar is present...");
            action.moveToElement(ele).perform();
            Thread.sleep(2000);
        }


        // Mouse Hover into Consulting Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Consulting']"));
        if (ele.isDisplayed()) {
            System.out.println("The DevLab Consulting Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(2000);
        }

        // Mouse Hover into Enterprises Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Enterprises']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Enterprises Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(2000);
        }


        // Mouse Hover into Certification Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Certification']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Certification Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(2000);
        }


        // Mouse Hover into Resources Menu bar ...
        ele = driver.findElement(By.xpath("//button[text()='Resources']"));
        if(ele.isDisplayed()){
            System.out.println("The DevLab Resources Menu Bar is present ......");
            action.moveToElement(ele).perform();
            Thread.sleep(2000);
        }

    }

    @Test(priority=2)
    public void do_DevLab_Foorter_Validation() throws Exception {
        System.out.println("I'm learning Test NG with Selenium");

        if (driver.findElement(By.xpath("//a[text()='Corporate Training']")).isDisplayed())
        {
            System.out.println("Corporate Training link text is present");
            System.out.println("Page will scroll..");
            WebElement element = driver.findElement(By.xpath("//a[text()='Corporate Training']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Thread.sleep(1000);
        }
    }
}
