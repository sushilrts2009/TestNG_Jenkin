package docker_day09_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Getstarted_Page {

    WebDriver driver = null;


    @BeforeClass
    @Parameters("docker_url")
    public void lanch_browser(String docker_url) throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(docker_url);
        Thread.sleep(5000);
    }

    @AfterClass
    public void close_browser() {
        driver.quit();
    }

    @Test
    public void getstarted_page_validation() throws Exception {

        System.out.println("Validating Docker Get Started button: ");
        //Validate if docker icon is present

        if (driver.findElement(By.xpath("(//a[text()='Get Started'])[1]")).isDisplayed()) {
            System.out.println("et Started button is present");
        }

    }
}
