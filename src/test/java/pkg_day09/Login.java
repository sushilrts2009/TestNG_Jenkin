package pkg_day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Login {

    WebDriver driver = null;


    @BeforeClass
    @Parameters("devlab_url")
    public void lanch_browser(String devlab_url) throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(devlab_url);
        Thread.sleep(10000);
    }

    @AfterClass
    public void close_browser() {
        driver.quit();
    }

    @Test
    public void login_page_validation() throws Exception {
        System.out.println("Validating Login page elements: ");
        //click on Login button
        driver.findElement(By.xpath("//button[@id='header_Button']")).click();
        Thread.sleep(3000);

        //Validate Login Page

        if (driver.findElement(By.xpath("//span[text()='DevLabs Alliance']")).isDisplayed()) {
            System.out.println("DevLabs Alliance is present at Login page header");
        }

    }
}
