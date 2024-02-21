package sauceDemo.tests;

import framework.BaseTest;
import org.testng.annotations.Test;
import sauceDemo.pageObject.LoginPage;
import sauceDemo.pageObject.ProductsPage;
import sauceDemo.pageObject.SingleProductPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithCorrectUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.setUsername();
        loginPage.setPassword();
        loginPage.clickOnLoginButton();

        ProductsPage productPage = new ProductsPage();
        productPage.productSelection();
        productPage.getProductPrice();
        productPage.clickOnProductItem();

        SingleProductPage spp = new SingleProductPage();
        spp.itemValidation();
        spp.priceItemValidation();
    }
}