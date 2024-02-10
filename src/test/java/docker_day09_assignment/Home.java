package docker_day09_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Home {
    WebDriver driver = null;


    @BeforeClass
    @Parameters("docker_url")
    public void lanch_browser(String docker_url) throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(docker_url);
        Thread.sleep(8000);
    }

    @AfterClass
    public void close_browser() {
        driver.quit();
    }

    @Test
    public void homepage_validation() throws Exception {

        System.out.println("Validating Docker Home page elements: ");
        //Validate if docker icon is present

        if (driver.findElement(By.xpath("(//ul[@id='top-menu'])[1]//li[@class='logo']")).isDisplayed()) {
            System.out.println("Docker Logo is present");
        }


        //Print menu names
     /*
        int total_menu = driver.findElements(By.xpath("//ul[@id='top-menu'])[1]/li[contains(@class, 'menu-item')")).size();
        System.out.println("Docker Menu count " + total_menu);*/

    }
}


