package sauceDemo.pageObject;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static framework.Browser.getDriver;

public class SingleProductPage extends BasePage { //выбрали один товар

    private static final String PAGE_LOCATOR = "//div[@class='inventory_details_name large_size' and text()='%s']";
    private static final WebElement PRODUCT_ITEM = getDriver().findElement(By.xpath("//div[@class='inventory_details_name large_size']"));
    private static final String PRICE_ITEM = "//div[@class='inventory_details_price']"; //цена одного товара

    String productItem;
    double priceItem; //переменная для цены

    //private static final String productPrice = getDriver().findElement(By.xpath(String.format(PRICE_ITEM, productItem)));

    public SingleProductPage() {
        super(By.xpath(String.format(PAGE_LOCATOR, ProductsPage.productName)),"Single Product Page: " +ProductsPage.productName);
    }
    public void getProductItem() { //достали текст в переменную (название товара)
        productItem = PRODUCT_ITEM.getText();
    }

    public double getPriceItem() {
        WebElement productPrice = getDriver().findElement(By.xpath(String.format(PRICE_ITEM, productItem)));
        String textPrice = productPrice.getText();
        String partPriceText = textPrice.replace("$", "");
        System.out.println(Double.parseDouble(partPriceText));
        return priceItem = Double.parseDouble(partPriceText); //преобразовали string в double
    }

    public void itemValidation() {
        getProductItem();
        if(productItem.equals(ProductsPage.productName)) {
            System.out.println("Items are equal");
        } else {
            System.out.println("Items are not equal");
        }
    }

    public void priceItemValidation() {
        getPriceItem();
        if (priceItem == ProductsPage.price) {
            System.out.println("Prices are equal");
        }
        else {
            System.out.println("Prices are not equal");
        }
    }
}