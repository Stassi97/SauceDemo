package sauceDemo.pageObject;

import framework.BasePage;
import framework.elements.Label;
import org.openqa.selenium.By;

public class Item extends BasePage { //класс товара

    private static final Label item= new Label(By.xpath("//a[@id='item_4_title_link']"));

    public Item() {
        super(By.xpath("//div[@class='inventory_list']"), "Inventory List");
    }
    public void chooseItem () {
        item.click();
    }

}
