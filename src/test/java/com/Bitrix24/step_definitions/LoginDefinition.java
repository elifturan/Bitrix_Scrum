package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginDefinition {

    LoginPage loginPage=new LoginPage();
    @When("User logs in as {string} and {string}")
    public void userLogsInAsAnd(String userName ,String passWord) {

        loginPage.login(userName,passWord);
    }

    @Then("User should see dashboard")
    public void userShouldSeeDashboard() {
        String  actual= Driver.getDriver().getTitle();
        String expected= ConfigurationReader.getProperty("titleDashboard");
        Assert.assertTrue(actual.contains(expected));

    }



}
