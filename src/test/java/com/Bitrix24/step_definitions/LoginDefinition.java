package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {
    LoginPage LoginPage = new LoginPage();

    @When("User is on the log in page")
    public void user_is_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as {string}")
    public void user_logs_in_as(String role) {
        LoginPage.loginButton.sendKeys(role);

    }




}
