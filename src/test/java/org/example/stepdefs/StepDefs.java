package org.example.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.AddingHighestPriceToCart;
import org.openqa.selenium.WebDriver;

public class StepDefs {

    @Managed
    WebDriver driver;

    @Steps
    AddingHighestPriceToCart addingHighestPriceToCart;

    @Given("^user is on Swaglab page$")
    public void user_is_on_Swaglab_page() {
        addingHighestPriceToCart.openURL();
    }
    @When("^I enter with valid credentials$")
    public void i_enter_with_valid_credentials() {
        addingHighestPriceToCart.signIn();
    }

    @Then("^I should see home page$")
    public void i_should_see_home_page() {
        addingHighestPriceToCart.homePage();
    }

    @Then("^I select product item with highest price to the cart$")
    public void i_select_product_item_with_highest_price_to_the_cart() throws Throwable{
        addingHighestPriceToCart.highestPriceItem();
    }

    @Then("^I should see notification$")
    public void i_should_see_notification() throws Throwable{
        addingHighestPriceToCart.notificationAlert();
    }
}