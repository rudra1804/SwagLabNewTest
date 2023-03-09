package org.example.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    static
    WebElementFacade userName;

    @FindBy(id = "password")
    static
    WebElementFacade password;

    @FindBy(id = "login-button")
    static
    WebElementFacade loginInButton;

    public static void signIn() {
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginInButton.click();
    }
}