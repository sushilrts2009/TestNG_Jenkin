package page_object_model_day10;

import org.openqa.selenium.By;

public class HomeSauceLab {

    public By addBackPack()
    {
        return By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    }
    public By addfleecejacket()
    {
        return By.xpath("//button[@name='add-to-cart-sauce-labs-fleece-jacket']");
    }

    public By shoppingCartLink()
    {
        return By.xpath("//a[@class='shopping_cart_link']");
    }



}
