package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.BusinessTripPage;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessTripStepDefinition {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    BusinessTripPage businessTrip = new BusinessTripPage();
    WebDriver driver = Driver.getDriver();

    @Then("User should be able to request a Business Trip")
    public void userShouldBeAbleToRequestABusinessTrip() {
        businessTrip.moreButton.click();
        businessTrip.workflowButton.click();
    }
    @Then("User assigning approvers, processors and entering user instructions")
    public void userAssigningApproversProcessorsAndEnteringUserInstructions() {
        businessTrip.permission.click();
        businessTrip.close.click();
    }
    @Then("User entering trip Title")
    public void userEnteringTripTitle() {
        businessTrip.title.sendKeys("Business Trip for new project");
    }
    @And("User choose Destination")
    public void userChooseDestination() {
        businessTrip.destination.sendKeys("Europe");
    }
    @Then("User entering date from start date")
    public void userEnteringDateFromStartDate() {
        businessTrip.StartDate.sendKeys("09/01/2020");
    }
    @And("User entering planned end date")
    public void userEnteringPlannedEndDate() {
        businessTrip.EndDate.sendKeys("09/10/2020");
    }
    @Then("User writing Purpose")
    public void userWritingPurpose() {
        businessTrip.Purpose.sendKeys("Meet with team for new project");
    }
    @And("User Planned Expenses")
    public void userPlannedExpenses() {
        businessTrip.PlannedExp.sendKeys("$4000");
        businessTrip.Currency.click();
        Select select =new Select(driver.findElement(By.xpath("//select[@name='PROPERTY_74']")));
        select.selectByValue("55");
    }
    @Then("User attach the documents")
    public void userAttachTheDocuments() throws Exception{
        Thread.sleep(3000);
        businessTrip.AttDocuments.sendKeys("/Users/aligumus/Desktop/DAY9-SELENIUM");
        businessTrip.SendButton.click();

    }
}
