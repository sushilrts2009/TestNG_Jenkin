package page_object_model_day10;

import org.openqa.selenium.By;

public class CheckoutSauceLab {


    public By firstName()
    {
        return By.xpath("//input[@id='first-name']");
    }

    public By LastName()
    {
        return By.xpath("//input[@id='last-name']");
    }

    public By postalcode()
    {
        return  By.xpath("//input[@id='postal-code']");
    }

    public By continuebutton()
    {
        return By.xpath("//input[@id='continue']");
    }

    public By chckoutbutton_click()
    {
        return By.xpath("//button[@id='checkout']");
    }

    public By finishbutton_click()
    {
        return By.xpath("//button[@id='finish']");
    }



}
