package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.pages.Type_Box_Page;
import com.Bitrix24.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TypeStepDefinitions {
    LoginPage loginPage=new LoginPage();
    Type_Box_Page typeBoxPage= new Type_Box_Page();

    @Then("User click {string} input box")
    public void userClickInputBox(String type)  {
        typeBoxPage.selectType(type);

    }

    @And("User click  {string} option and enter {string}")
    public void userClickOptionAndEnter(String TypeOptions, String TypeValues ){
        typeBoxPage.selectType(TypeValues);
    }
    @Then("User clicks search button")
    public void userClicksSearchButton() {
        typeBoxPage.searchButton.click();
        BrowserUtilities.wait(3000);
    }


    @And("User should see {string}is displayed")
    public void userShouldSeeIsDisplayed(String arg0) {

    }

}
