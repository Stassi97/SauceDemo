package sauceDemo.pageObject;

import framework.BasePage;
import framework.elements.Button;
import org.openqa.selenium.By;

public class CheckOut extends BasePage {

    private static final Button checkOut= new Button(By.xpath("//button[@id='checkout']"));

    public CheckOut() {
        super(By.xpath("//div[@class='cart_footer']"), "CheckOut Button");
    }

    public void check () {
        checkOut.click();
    }
}