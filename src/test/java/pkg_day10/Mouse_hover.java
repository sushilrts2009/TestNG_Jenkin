package pkg_day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {
    WebDriver driver = null;

    public void validate_click_functionality() {
        WebElement ele = driver.findElement(By.xpath("//button[@id='header_Button']"));

        if (ele.isDisplayed()) {
            System.out.println("The DevLab Login button is present ......");
            ele.click();
        }
    }

    public void launce_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.devlabsalliance.com/");
    }

    public void check_for_mouse_hover() throws Exception {

        {
            WebElement ele = null;
            Actions action = new Actions(driver);
            ele = driver.findElement(By.xpath("//span[text()='Courses']"));

            // Mouse Hover into Courses Menu bar ...
            if (ele.isDisplayed()) {
                System.out.println("The DevLab Courses Menu Bar is present ......");
                action.moveToElement(ele).perform();
                Thread.sleep(3000);
            }
            // Mouse Hover into Consulting Menu bar ...
            ele = driver.findElement(By.xpath("//button[text()='Consulting']"));
            if (ele.isDisplayed()) {
                System.out.println("The DevLab Consulting Menu Bar is present ......");
                action.moveToElement(ele).perform();
                Thread.sleep(3000);
            }

            // Mouse Hover into Enterprises Menu bar ...
            ele = driver.findElement(By.xpath("//button[text()='Enterprises']"));
            if(ele.isDisplayed()){
                System.out.println("The DevLab Enterprises Menu Bar is present ......");
                action.moveToElement(ele).perform();
                Thread.sleep(3000);
            }


            // Mouse Hover into Certification Menu bar ...
            ele = driver.findElement(By.xpath("//button[text()='Certification']"));
            if(ele.isDisplayed()){
                System.out.println("The DevLab Certification Menu Bar is present ......");
                action.moveToElement(ele).perform();
                Thread.sleep(3000);
            }


            // Mouse Hover into Resources Menu bar ...
            ele = driver.findElement(By.xpath("//button[text()='Resources']"));
            if(ele.isDisplayed()){
                System.out.println("The DevLab Resources Menu Bar is present ......");
                action.moveToElement(ele).perform();
                Thread.sleep(3000);
            }


        }

    }

    public void close_browser()
    {
        driver.quit();
    }
}
