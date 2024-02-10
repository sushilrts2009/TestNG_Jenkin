package pkg_day10;

import action.Action_class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page_object_model_day10.*;

import java.time.Duration;

public class login_Page extends Action_class
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
    public void close_browser() {
        driver.quit();
    }

    @Test
    public void login_page_validation() throws Exception
    {

        WebElement user_name = null;
        System.out.println("Validating Login page elements: ");
        Assert.assertTrue(checkforelementpresent(obj_LoginSauceLab.username()));

        //pass user
        // Using Action Class
        typeInTextBox(obj_LoginSauceLab.username(), "standard_user");

        Assert.assertTrue(checkforelementpresent(obj_LoginSauceLab.password()));
        //Password
        typeInTextBox(obj_LoginSauceLab.password(), "secret_sauce");

        //Validate Login Page

        // Using Page Object Model - Login button click

        /*  if (driver.findElement(obj_LoginSauceLab.login_button()).isDisplayed()) {
            driver.findElement(obj_LoginSauceLab.login_button()).click();
            System.out.println("Login button has been clicked");
        }*/

        // Using Page Object Model - Login button click - Using Action Class
          driver.findElement(obj_LoginSauceLab.login_button()).click();

         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        ////div[@class='inventory_list']/div

        //get the total number of item count

        int item_count= driver.findElements(By.xpath("//div[@class='inventory_list']/div")).size();

        Assert.assertEquals(item_count, 6);


    //    clickButtonsandExplicitWait(obj_LoginSauceLab.login_button(), 30);

        // Home Page
        driver.findElement(obj_HomeSauceLab.addBackPack()).click();
        driver.findElement(obj_HomeSauceLab.addfleecejacket()).click();
        Thread.sleep(2000);
        driver.findElement(obj_HomeSauceLab.shoppingCartLink()).click();

         Thread.sleep(6000);
        //Cart Page

       // driver.findElement(obj_CartSauceLab.removeItem()).click();
        driver.findElement(obj_CheckoutSauceLab.chckoutbutton_click()).click();

        driver.findElement(obj_CheckoutSauceLab.firstName()).sendKeys("Sushil");
        driver.findElement(obj_CheckoutSauceLab.LastName()).sendKeys("Sarma");
        driver.findElement(obj_CheckoutSauceLab.postalcode()).sendKeys("M1h3h3");
        driver.findElement(obj_CheckoutSauceLab.continuebutton()).click();
        driver.findElement(obj_CheckoutSauceLab.finishbutton_click()).click();
        Thread.sleep(5000);

    /*    clickButtonsandExplicitWait(obj_CartSauceLab.add_to_cardt(), 30);
        clickButtonsandExplicitWait(obj_CheckoutSauceLab.cheekoutbutton_click(), 30);

*/

        Thread.sleep(15000);

    }
}
