package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Action_class {
    public WebDriver driver = null;

    // This method is used to create driver instance
    public WebDriver getDriver() {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--headless");

        // execute in headless
       // driver= new ChromeDriver(opt);

        // execute non - headless
        driver = new ChromeDriver();

        return driver;
    }

    // This method is used to type in a text box
    public boolean typeInTextBox(By by, String stringInput)
    {
        boolean flag = false;

        try
        {
           driver.findElement(by).sendKeys(stringInput);
            flag=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return  flag;
    }

    //method to click ButtonandImplicitwait

    public boolean clickbuttonandImplicitwait(By by)
    {
        boolean flag = false;

        try
        {
            driver.findElement(by).click();
            Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  //          wait.until(d -> revealed.isDisplayed());
            flag = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return  flag;
    }

    public boolean clickButtonsandExplicitWait(By by, int time)
    {
        boolean flag = false;
        try{
            driver.findElement(by).click();
            Thread.sleep(time);
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public boolean mousehover(By by)
    {
        boolean flag = false;

        try
        {
         Actions action = new Actions(driver);
         WebElement ele= driver.findElement(by);
         action.moveToElement(ele);
         action.perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

// To validate an element present or not
    public boolean checkforelementpresent(By by)
    {
        boolean flag = false;

        try
        {
            driver.findElement(by).isDisplayed();
            flag=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return  flag;
    }


}
