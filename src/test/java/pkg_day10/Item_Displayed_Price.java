package pkg_day10;

import action.Action_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page_object_model_day10.CartSauceLab;
import page_object_model_day10.CheckoutSauceLab;
import page_object_model_day10.HomeSauceLab;
import page_object_model_day10.LoginSauceLab;
import page_object_model_day10.*;

public class Item_Displayed_Price extends Action_class
{
    private WebDriver driver = null;

    LoginSauceLab obj_LoginSauceLab;
    HomeSauceLab obj_HomeSauceLab;
    CartSauceLab obj_CartSauceLab;
    CheckoutSauceLab obj_CheckoutSauceLab;

    @BeforeClass
    @Parameters("saucedemo_url")
    public void lanch_browser(String saucedemo_url) throws Exception
    {
        obj_LoginSauceLab = new LoginSauceLab();
        obj_HomeSauceLab = new HomeSauceLab();
        obj_CartSauceLab = new CartSauceLab();
        obj_CheckoutSauceLab = new CheckoutSauceLab();

        //    driver = new ChromeDriver();
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get(saucedemo_url);
        Thread.sleep(5000);
    }

    @AfterClass
    public void close_browser()
    {
        driver.quit();
    }

    @Test
    public void login_page_validation() throws Exception {

        System.out.println("Validating Login page elements: ");

        // User Name
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        //Password
        driver.findElement(obj_LoginSauceLab.password()).sendKeys("secret_sauce");

        //Validate Login Page

        if (driver.findElement(obj_LoginSauceLab.login_button()).isDisplayed()) {
            driver.findElement(obj_LoginSauceLab.login_button()).click();
            System.out.println("Login button has been clicked");
        }

        Thread.sleep(5000);

        int totalInventoryCount = driver.findElements(By.xpath("//div[@class='inventory_list']/div")).size();
        for (int i = 1; i <= totalInventoryCount; i++) {
            String productName = driver.findElement(By.xpath("(//div[@class='inventory_list']/div//div[@class='inventory_item_name '])[" + i + "]")).getText();
            String productPrice = driver.findElement(By.xpath("(//div[@class='inventory_list']/div//div[@class='pricebar'])[" + i + "]/div")).getText();
            System.out.println(productName + ":" + productPrice);

        }
    }

}
