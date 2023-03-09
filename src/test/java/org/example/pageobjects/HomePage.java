package org.example.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jruby.RubyProcess;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage extends PageObject {

    @FindBy(className = "app_logo")
    static
    WebElementFacade applicationLogo;

    @FindBy(className = "shopping_cart_badge")
    static
    WebElementFacade shoppingCartNotification;

    public void homePageVerification() {
        Assert.assertTrue(applicationLogo.isPresent());
    }

    public void highestPriceItem() {
        List<WebElement> allPrices = getDriver().findElements(By.xpath("//*[@class='inventory_item_price']"));
        WebElement highestProduct = allPrices.get(0);
        double highPrice = Double.parseDouble(highestProduct.getText().replace("$", ""));
        for (WebElement productPrice : allPrices) {
            double price = Double.parseDouble(productPrice.getText().replace("$", ""));
            if (price > highPrice) {
                highPrice = price;
                highestProduct = productPrice;
            }
        }
        WebElement addToCartButton = highestProduct.findElement(By.xpath("../button"));
        addToCartButton.click();
    }

    public void notificationAlert() {
        Assert.assertTrue(shoppingCartNotification.isPresent());
    }
}
