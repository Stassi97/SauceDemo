package sauceDemo.pageObject;

import framework.BasePage;
import framework.elements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static framework.Browser.getDriver;

public class ProductsPage extends BasePage { //все товары

    private static final String PAGE_LOCATOR = "//span[@class='title' and text()='Products']";
    private static final List<String> PRODUCTS_LIST = getDriver().findElements(By.xpath("//div[@class='inventory_item_name ']"))
            .stream().map(e-> e.getText()).collect(Collectors.toList());

    private static final String ITEM = "//div[@class='inventory_item_name ' and text()= '%s']";
    private static final String PRICE = "//a/div[text()='%s']/../../..//div[@class='inventory_item_price']";
    private WebElement productItem;
    public static String productName;
    public static double price;

     public static TextBox productPrice = new TextBox (By.xpath(String.format(PRICE, productName)));


    public ProductsPage() {
        super(By.xpath(PAGE_LOCATOR),"'Products' Page"); //Информация для отчетов (информационный параметр)
    }

    public WebElement productSelection() { //метод, который ищет элемент на странице
        Random random = new Random();
        int i = random.nextInt(1, PRODUCTS_LIST.size()) - 1; //-1 для того, чтобы НЕ ВЫЙТИ за пределы массива. i-индекс
        productName = PRODUCTS_LIST.get(i);
        System.out.println("ProductName of Products"+productName);
        return productItem = getDriver().findElement(By.xpath(String.format(ITEM, productName))); //любой продукт из списка продуктов (В Item вставляет productName)
    }

    public double getProductPrice() { //цена зависит от наименования товара
        //public static TextBox productPrice = new TextBox (By.xpath(String.format(PRICE, productName)));
        WebElement productPrice = getDriver().findElement(By.xpath(String.format(PRICE, productName)));
        String textPrice = productPrice.getText();
        String partPriceText = textPrice.replace("$", "");
        System.out.println(Double.parseDouble(partPriceText));
        return price = Double.parseDouble(partPriceText); //преобразовали string в double
    }

    public void clickOnProductItem() {
        productItem.click();
    }
}