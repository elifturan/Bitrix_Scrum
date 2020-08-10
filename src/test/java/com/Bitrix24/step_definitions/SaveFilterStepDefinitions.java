package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.SaveFilterPage;
import com.Bitrix24.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SaveFilterStepDefinitions {
    SaveFilterPage saveFilterPage=new SaveFilterPage();

    @And("User clicks SAVE FILTER")
    public void userClicksSAVEFILTER() {
        BrowserUtilities.explicitWaitClickAbility(saveFilterPage.saveFilter,10);
        saveFilterPage.saveFilter.click();
        BrowserUtilities.explicitWait(saveFilterPage.resetToDefault,10);

        Assert.assertTrue(saveFilterPage.resetToDefault.isDisplayed());

    }

    @Then("User  should be add new filter name")
    public void userShouldBeAddNewFilterName() {
        BrowserUtilities.explicitWaitClickAbility(saveFilterPage.filterName,10);

        saveFilterPage.filterName.sendKeys("NEW");
        saveFilterPage.filterName.click();

    }

    @And("User should be save new filter")
    public void userShouldBeSaveNewFilter() {
        saveFilterPage.save.click();
        BrowserUtilities.wait(3);

    }
}
