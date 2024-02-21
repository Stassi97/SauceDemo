package sauceDemo.tests;

import framework.BaseTest;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import sauceDemo.pageObject.*;

public class E2ETest extends BaseTest {

    @Test
    @Description("test desc")
    public void loginWithCorrectUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.setUsername();
        loginPage.setPassword();
        loginPage.clickOnLoginButton();


        Item item = new Item();
        item.chooseItem(); //кликнуть на товар

        AddToCart cart = new AddToCart();
        cart.addToCart(); //добавили в корзину
        cart.cart(); //перешли в корзину

        CheckOut checkOut = new CheckOut();
        checkOut.check();

        YourInformation information = new YourInformation();
        information.firstName();
        information.lastName();
        information.zip();
        information.contin();

        Finish finish = new Finish();
        finish.finish();
    }
}