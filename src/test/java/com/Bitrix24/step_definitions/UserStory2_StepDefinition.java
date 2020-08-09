package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.BasePage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.pages.UserStory2Page;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UserStory2_StepDefinition extends BasePage {
    UserStory2Page userStory2Page =new UserStory2Page();
    LoginPage loginPage=new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User enters correct username")
    public void user_enters_correct_username() throws Exception{
        loginPage.loginUsername.sendKeys(ConfigurationReader.getProperty("username"));
        Thread.sleep(2000);
    }
    @When("User enters correct password")
    public void user_enters_correct_password() throws Exception {
        loginPage.loginPassword.sendKeys(ConfigurationReader.getProperty("password"));
        Thread.sleep(2000);
    }
    @When("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }
    @And("User click on the tasks tab plus symbol")
    public void user_click_on_the_tasks_tab_plus_symbol() throws Exception {
    userStory2Page.taskButton.click();
    Thread.sleep(3000);
    }
    @Given("click on High Priority checkbox")
    public void click_on_high_priority_checkbox() {
        userStory2Page.highPriorityCheckBox.click();
    }
    @Then("set the current task  to a top Priority task")
    public void set_the_current_task_to_a_top_priority_task() {
        Assert.assertTrue("Nurefsan",userStory2Page.highPriorityCheckBox.isSelected());
    }
    @And("click on Visual Editor")
    public void click_on_visual_editor() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userStory2Page.visualEditorButton.click();
    }
    @Then("verify if it's showed up")
    public void verify_if_it_s_showed_up() throws Exception {
        Thread.sleep(3000);
        userStory2Page.visualEditorVerification.isDisplayed();
    }
    @Then("click on upload files icon")
    public void click_on_upload_files_icon() throws Exception{
        Thread.sleep(4000);
        userStory2Page.taskName.sendKeys("Screenshot from the last error!");
        Thread.sleep(4000);
        userStory2Page.uploadButton.click();
    }
    @Then("Upload files and picture")
    public void upload_files_and_picture() throws Exception {
    userStory2Page.uploadPicture.sendKeys("C:\\Users\\nuref\\OneDrive\\Pictures\\Screenshots");
    Thread.sleep(3000);
    }
    @Then("Verify if picture it's uploaded")
    public void verify_if_picture_it_s_uploaded() {
    userStory2Page.uploadPictureVerification.isDisplayed();

    }
    @Then("Click on Select Document from Bitrix")
    public void click_on_select_document_from_bitrix() throws Exception{
    userStory2Page.selectDocumentFromBitrix.click();
    Thread.sleep(2000);
    }
    @Then("Select documents from bitrix")
    public void select_documents_from_bitrix() throws Exception {
        Thread.sleep(3000);
        userStory2Page.selectFirstDocument.click();
        Thread.sleep(3000);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", userStory2Page.selectDocumentSubmitButton);
        Thread.sleep(2000);

        Thread.sleep(3000);
        userStory2Page.sendButton.click();
        Thread.sleep(5000);
    }

    @Then("verify if the document  it's uploaded")
    public void verify_if_the_document_it_s_uploaded() {
        Assert.assertTrue(userStory2Page.selectDocumentVerification.isDisplayed());
    }
    @When("Click on Comma Icon")
    public void click_on_comma_icon() {
    userStory2Page.commaButton.click();
    }
    @Then("Create a quote")
    public void create_a_quote() throws Exception{
        WebElement frame = Driver.getDriver().findElement(By.xpath("(//iframe[@class='bx-editor-iframe'])[2]"));
        Driver.getDriver().switchTo().frame(frame);
        Thread.sleep(3000);
        userStory2Page.createQuote.sendKeys("quote");
    }
    @Then("verify if it's displayed")
    public void verify_if_it_s_displayed()throws Exception {
        String actualTextQuote = userStory2Page.verificationTextQuote.getText();
        String expected = "quote";
        Thread.sleep(3000);
        Assert.assertEquals(actualTextQuote, expected);

    }
    @Given("Click on the Add mention icon")
    public void click_on_the_add_mention_icon()throws Exception {
        Thread.sleep(4000);
    userStory2Page.addMentionButton.click();
    }
    @And("select contacts from the lists provided in dropdown")
    public void select_contacts_from_the_lists_provided_in_dropdown() throws Exception {
        userStory2Page.addPersonEmail1.click();
        Thread.sleep(3000);
        userStory2Page.addMentionButton.click();
        Thread.sleep(3000);
        userStory2Page.addPersonEmail2.click();
        Thread.sleep(3000);
    }
    @Then("Verify if the addMention emails are added.")
    public void verify_if_the_add_mention_emails_are_added() throws Exception{
        WebElement frame = Driver.getDriver().findElement(By.xpath("(//iframe[@class='bx-editor-iframe'])[2]"));
        Driver.getDriver().switchTo().frame(frame);
        Thread.sleep(3000);
        Assert.assertTrue(userStory2Page.verifyEmailAddMention.isDisplayed());
    }
    @When("click on the link icon")
    public void click_on_the_link_icon() {
    userStory2Page.linkButton.click();
    }
    @When("atach link")
    public void atach_link() throws Exception{
        Thread.sleep(3000);
        userStory2Page.textLinkForm.sendKeys("Link");
        Thread.sleep(3000);
        userStory2Page.addLinkForm.sendKeys("https://www.youtube.com/watch?v=xCfOPHc-9sQ&list=RDxCfOPHc-9sQ&start_radio=1");
        Thread.sleep(3000);
        userStory2Page.saveLinkButton.click();
        Thread.sleep(5000);
    }
    @Then("verify is the link it's uploaded")
    public void verify_is_the_link_it_s_uploaded() {
        Driver.getDriver().switchTo().frame(userStory2Page.frameMessage);
        String actual = userStory2Page.verifyLink.getText();
        String expected = "Link";
        Assert.assertEquals(actual, expected);
    }
    @When("click on Add More")
    public void click_on_add_more() {
    userStory2Page.addMoreButton.click();
    }
    @And("select contact from E-mail User, Employees and Departments and Recent Contact List")
    public void select_contact_from_e_mail_user_employees_and_departments_and_recent_contact_list()throws Exception{
        Thread.sleep(3000);
        userStory2Page.recentAddMoreButton.click();
        Thread.sleep(3000);
        userStory2Page.addMoreEmployeesAndDepartments.click();
        Thread.sleep(3000);
        userStory2Page.addMoreEmployeesAndDepartmentsAddEmail.click();
        Thread.sleep(3000);
    }
    @Then("verify if Add More selecting contact from  E-mail user, Employees and Departments and Recent contact lists works.")
    public void verify_if_add_more_selecting_contact_from_e_mail_user_employees_and_departments_and_recent_contact_lists_works() {
        Assert.assertTrue(userStory2Page.addMoreEmployeesAndDepartmentsAddEmail.isDisplayed());
    }

    @When("click on created by")
    public void click_on_created_by() {
    userStory2Page.createdByButton.click();
    }
    @When("click participants and people")
    public void click_participants_and_people()throws Exception {
        Thread.sleep(3000);
        userStory2Page.participantsButton.click();
        Thread.sleep(3000);
        userStory2Page.participantsButtonAddButton.click();
        Thread.sleep(3000);
        WebElement addEmail = Driver.getDriver().findElement(By.xpath("(//div[@class='bx-finder-box-item-t7-name'])[1]"));
        addEmail.click();
        Thread.sleep(3000);
        userStory2Page.popupClose.click();
    }
    @And("click on Observers and add people")
    public void click_on_observers_and_add_people()throws Exception {
        Thread.sleep(3000);
        userStory2Page.observersButton.click();
        Thread.sleep(3000);
        userStory2Page.observersButtonAddButton.click();
        WebElement addEmail = Driver.getDriver().findElement(By.xpath("(//div[@class='bx-finder-box-item-t7-name'])[1]"));
        addEmail.click();
        userStory2Page.popupClose.click();
        Thread.sleep(3000);

    }
    @Then("verify if Employees can be added in different assignment categories: Created By, Participants and Observer.")
    public void verify_if_employees_can_be_added_in_different_assignment_categories_created_by_participants_and_observer()throws Exception {
        Assert.assertTrue(userStory2Page.verifyCreatedBy.isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(userStory2Page.verifyParticipants.isDisplayed());
        Thread.sleep(3000);
        Assert.assertTrue(userStory2Page.verifyObservers.isDisplayed());
        Thread.sleep(3000);
    }
    @Given("Click on Deadline")
    public void click_on_deadline() {
    userStory2Page.Deadline.click();
    }
    @Given("select date and time")
    public void select_date_and_time()throws Exception {
        userStory2Page.dateNumber.click();
        userStory2Page.hour.sendKeys("9");
        Thread.sleep(2000);
        userStory2Page.minutes.sendKeys("30");
        Thread.sleep(3000);
        userStory2Page.deadlineSelect.click();
    }
    @Then("verify is the Deadline is saved")
    public void verify_is_the_deadline_is_saved() {
        String actualResult = userStory2Page.verifyDeadline.getAttribute("value");
        String text = "07/01/2020 07:30:00 pm";
        Assert.assertEquals(actualResult, text);
    }
    @When("Click on More")
    public void click_on_more() {
    userStory2Page.moreButton.click();

    }



}





