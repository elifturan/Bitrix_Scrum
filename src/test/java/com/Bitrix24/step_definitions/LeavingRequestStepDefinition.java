package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.LeavingRequestPages;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class LeavingRequestStepDefinition {
    LoginPage loginpage = new LoginPage();
    LeavingRequestPages leavingRequest = new LeavingRequestPages();
    Actions actions =new Actions(Driver.getDriver());

    @ Given ("user test with {string} browser")
    public void user_test_with_browser(String brs){
        if(brs.equals("chrome")){
            ConfigurationReader.getProperty("browser");
            System.setProperty("browser","chrome");
        }else
            ConfigurationReader.getProperty("browserfx");
            System.setProperty("browser","firefox");
    }
    /**
     * Scenario 1 starting.
     */

    @Given("User login to account succesfully")
    public void user_login_to_account_succesfully() {
        try {
            Thread.sleep(3000);
            loginpage.login();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("User should be able got to More Tab and click")
    public void user_should_be_able_got_to_more_tab_and_click() {
        actions.moveToElement(leavingRequest.moreButton).perform();
        leavingRequest.moreButton.click();
    }
    @Then("User should click WorkFollow option")
    public void user_should_click_workfollow_option() {
        try {
            Thread.sleep(3000);
            leavingRequest.workflowButton.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("User is on the workflow module to create and send workflows")
    public void userIsOnTheWorkflowModuleToCreateAndSendWorkflows() {
          leavingRequest.MoreButton_WorkFlow();
    }
    @Given("User should be able to request a Leave Approval")
    public void userShouldBeAbleToRequestALeaveApproval() {
          leavingRequest.PermissionFromStaff();
    }

    @Then("User assigning approvers and processors; selecting start")
    public void userAssigningApproversAndProcessorsSelectingStart() {
         leavingRequest.StartDateF_L_Request();
    }

    @And("User ending date from date picker")
    public void userEndingDateFromDatePicker() {
        leavingRequest.EndDateF_L_Request();

    }
    @Then("User select Absence type from dropdown;")
    public void userSelectAbsenceTypeFromDropdown() {
       leavingRequest.AbsenceNotes();

    }
    @And("User entering reason for leave information.")
    public void userEnteringReasonForLeaveInformation() {
       leavingRequest.Complete();

    }
}
