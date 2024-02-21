package sauceDemo.pageObject;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage  extends BasePage {

       private static final String PAGE_LOCATOR="//div[@class='login-box']";
       private static final TextBox userName= new TextBox(By.xpath("//input[@id='user-name']"));
       private static final TextBox password = new TextBox(By.xpath("//input[@id='password']"));
       private static final Button loginButton = new Button(By.xpath("//input[@id='login-button']"));

    public LoginPage() {
        super(By.xpath(PAGE_LOCATOR),"Login Page");
    }


    @Step("Fill in Login with userName")
        public void setUsername () {
        userName.sendKeys("standard_user");
        }

    @Step("Fill in Login with password")
    public void setPassword () {
        password.sendKeys("secret_sauce");
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}