package docker_day09_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignIn_Page {

    WebDriver driver = null;


    @BeforeClass
    @Parameters("docker_url")
    public void lanch_browser(String docker_url) throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(docker_url);
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
        driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
        Thread.sleep(3000);

        //Validate Login Page

        if (driver.findElement(By.xpath("//button[@name='action']")).isDisplayed()) {
            System.out.println("Continue button is present at Login page");
        }

    }
}
