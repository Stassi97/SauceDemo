package sauceDemo.pageObject;

import framework.BasePage;
import framework.elements.Button;
import org.openqa.selenium.By;

public class AddToCart extends BasePage {

    private static final Button add= new Button(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
    private static final Button cart= new Button(By.xpath("//a[@class='shopping_cart_link']"));

    public AddToCart() {
        super(By.xpath("//div[@class='inventory_details_desc_container']"), "Item Page");
     }
    public void addToCart () {
        add.click(); //добавить в корзину
    }

    public void cart () {
        cart.click(); //добавить в корзину
    }
}