package org.example.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.example.pageobjects.HomePage;
import org.example.pageobjects.LoginPage;

public class AddingHighestPriceToCart extends ScenarioSteps {

    LoginPage signInPage;
    HomePage homePage;

    @Step
    public void openURL() {
        signInPage.open();
    }

    @Step
    public void signIn() {
        LoginPage.signIn();
    }

    @Step
    public void homePage() {
        homePage.homePageVerification();
    }

    public void highestPriceItem() {
        homePage.highestPriceItem();
    }

    public void notificationAlert() {
        homePage.notificationAlert();
    }
}
