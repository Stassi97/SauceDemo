package sauceDemo.pageObject;

import framework.BasePage;
import framework.elements.Button;
import org.openqa.selenium.By;

public class Finish extends BasePage {

    private static final Button fin= new Button(By.xpath("//button[@id='finish']"));

    public Finish() {
        super(By.xpath("//div[@class='cart_footer']"), "Finish Button");
    }
    public void finish () {
        fin.click();
    }
}
