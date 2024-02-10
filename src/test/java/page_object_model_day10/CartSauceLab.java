package page_object_model_day10;

import org.openqa.selenium.By;

public class CartSauceLab {

    public By removeItem()
    {
        return By.xpath("//button[@name='remove-sauce-labs-backpack']");
    }

    public By add_to_cardt()
    {
        return By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    }

    public By checkOutButton()
    {
        return By.xpath("//button[@id='checkout']");
    }
}
