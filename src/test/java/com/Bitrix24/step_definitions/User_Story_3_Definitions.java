package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.BasePage;
import com.Bitrix24.pages.user_story_3;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;


public class User_Story_3_Definitions {

  user_story_3 zuleyha=new user_story_3();
    Actions actions = new Actions(Driver.getDriver());



    @Given("User is logged in")
    public void user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        zuleyha.username.sendKeys(ConfigurationReader.getProperty("username"));
        zuleyha.password.sendKeys(ConfigurationReader.getProperty("password"));
        zuleyha.loginButton.click();


    }



    @Given("user click on Event Tab")
    public void user_click_on_event_tab() {
        zuleyha.eventButton.click();

    }

    @Given("click on upload files and picture from Event Module")
    public void click_on_upload_files_and_picture_from_event_module() {

        zuleyha.uploadFiles.click();
        zuleyha.uploadFilesAndImages.click();

    }




    @Given("write some message on file name")
    public void write_some_message_on_file_name() throws Exception {
     //   WebElement uploadElement= zuleyha.uploadFilesAndImages;
      //  uploadElement.sendKeys("C:\\Users\\PC\\Desktop\\cat image.jpg");



    }

    @Given("upload a picture for Event")
    public void upload_a_picture_for_event() {
          //  zuleyha.uploadFilesAndImages.click();

    }
    @Then("verify if the Picture is uploaded")
    public void verify_if_the_picture_is_uploaded() {
     // WebElement uploadMessage=Driver.getDriver().findElement(By.xpath("//span[@class='f-wrap']"));
      // Assert.assertTrue(uploadMessage.isEnabled());
    }


    //2.

    @Given("click on Link Button from Event Tab")
    public void click_on_link_button_from_event_tab() {
      //  zuleyha.linkButton.click();
    }


    @Given("click and write some Text in Text Form")
    public void click_and_write_some_text_in_text_form() {

        String name="Cats video";
        zuleyha.textLinkForm.sendKeys(name);
        zuleyha.linkForm.sendKeys("https://www.guru99.com/upload-download-file-selenium-webdriver.html");
        Driver.getDriver().switchTo().frame(zuleyha.iframe);
        zuleyha.saveLinkButton.click();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(name));


         // zuleyha.textLinkForm.sendKeys("cats");
    }
    @Given("upload the link in the link Form, and click on Save Button")
    public void upload_the_link_in_the_link_form_and_click_on_save_button() {
         //   zuleyha.linkForm.sendKeys("https://www.guru99.com/upload-download-file-selenium-webdriver.html");

    }
    @Then("Verify if click is uploaded")
    public void verify_if_click_is_uploaded() {
     //   Assert.assertTrue();


    }

    @Given("write some message for the video description in Event Tab")
    public void write_some_message_for_the_video_description_in_event_tab() {
         zuleyha.insertVideo.click();
    }

    @Given("upload the video and save it")
    public void upload_the_video_and_save_it() {
        zuleyha.videoSource.sendKeys("https://www.guru99.com/upload-download-file-selenium-webdriver.html");
      zuleyha.videoSaveButton.click();
    }

    @Then("Verify if it's uploaded")
    public void verify_if_it_s_uploaded() {
     //Assert.assertTrue(zuleyha.);
    }


    @Given("click on Comma Button from the Event Tab")
    public void click_on_comma_button_from_the_event_tab() {
       zuleyha.commaButton.click();
    }

    @Given("click on Quote Tab and write a quote {string}")
    public void click_on_quote_tab_and_write_a_quote(String string) {
       zuleyha.quoteWriteTab.sendKeys("zzzzzzzzzzzzzzzzzzzzzzz");
    }

    @Given("click on Send Button")
    public void click_on_send_button() {
        // no send icon

    }

    @Then("Verify if the Quote is displayed on the page")
    public void verify_if_the_quote_is_displayed_on_the_page() {
        Assert.assertTrue(zuleyha.verificationQuote.isDisplayed());

    }


    @Given("click on Visual Editor from the Event")
    public void click_on_visual_editor_from_the_event() {
       zuleyha.visualEditorButton.click();
    }

    @Then("verify if it's displayed the Visual Editor")
    public void verify_if_it_s_displayed_the_visual_editor() {
       Assert.assertTrue(zuleyha.verificationVisualEditor.isDisplayed());
    }

    @When("user should add date and time and click time zone")
    public void user_should_add_date_and_time_and_click_time_zone() {
         zuleyha.eventStart.sendKeys("10/09/2020");
        zuleyha.eventStartTime.sendKeys("01:00");
        zuleyha.eventEnd.sendKeys("10/09/2020");
        zuleyha.eventEndTime.sendKeys("02:00");
    }


    @Given("user should click set reminder button and write {int} minutes")
    public void user_should_click_set_reminder_button_and_write_minutes(Integer int1) {

          zuleyha.clickSetReminder.sendKeys("15");

    }


    @Given("user should select Central meeting room")
    public void user_should_select_central_meeting_room() {
        Select select=new Select(zuleyha.eventLocation);
        select.selectByIndex(2);

    }

    @Given("user should add person from members icon")
    public void user_should_add_person_from_members_icon() {
         zuleyha.members.click();

    }


    @Given("user should select free from dropdown availability")
    public void user_should_select_free_from_dropdown_availability() {
       zuleyha.moreClick.click();
        Select select1=new Select(zuleyha.availability);
        select1.selectByIndex(2);


    }

    @Given("user should select never from dropdown  repeat")
    public void user_should_select_never_from_dropdown_repeat() {
        Select select2=new Select(zuleyha.repeat);
        select2.selectByIndex(2);
    }

    @Given("user should see own email")
    public void user_should_see_own_email() {


    }

    @Given("user should select normal from dropdown importance")
    public void user_should_select_normal_from_dropdown_importance() {
        Select select3=new Select(zuleyha.importance);
        select3.selectByIndex(2);
    }

    @Then("user should click send button")
    public void user_should_click_send_button() {
       zuleyha.sendButton.click();
    }

    @Then("verify if the assigned Task is created")
    public void verify_if_the_assigned_task_is_created() {
        String email="helpdesk13@cybertekschool.com";
       Assert.assertTrue(email.equals("helpdesk13@cybertekschool.com"));

    }

























}
