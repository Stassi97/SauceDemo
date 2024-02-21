package sauceDemo.pageObject;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.TextBox;
import org.openqa.selenium.By;

public class YourInformation extends BasePage {

    private static final TextBox firstN= new TextBox(By.xpath("//input[@id='first-name']"));
    private static final TextBox lastN = new TextBox(By.xpath("//input[@id='last-name']"));
    private static final TextBox zip = new TextBox(By.xpath("//input[@id='postal-code']"));
    private static final Button cont = new Button(By.xpath("//input[@id='continue']"));

    public YourInformation() {
        super(By.xpath("//div[@class='checkout_info_wrapper']//form"), "Your information");
    }
    public void firstName () {
        firstN.sendKeys("Anastasia");
    }

    public void lastName () {
        lastN.sendKeys("Novik");
    }

    public void zip() {
        zip.sendKeys("1111");
    }

    public void contin () {
        cont.click();
    }
}
