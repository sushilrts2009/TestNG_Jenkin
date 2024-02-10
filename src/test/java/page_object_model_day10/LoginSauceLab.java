package page_object_model_day10;

import org.openqa.selenium.By;

public class LoginSauceLab
{

    public By username()
    {
        return By.xpath("//input[@name='user-name']");
    }

    public  By password()
    {
        return By.xpath("//input[@name='password']");
    }

    public By login_button()
    {
        return By.xpath("//input[@name='login-button']");
    }
}
