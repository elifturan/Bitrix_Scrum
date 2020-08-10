package com.Bitrix24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class user_story_3 extends BasePage {

    @FindBy(name ="USER_LOGIN")
    public WebElement username;
    @FindBy(name ="USER_PASSWORD")
    public WebElement password;
    @FindBy(xpath="//input[@class='login-btn']")
    public WebElement loginButton;


    @FindBy(xpath = "//span[@class='feed-add-post-form-link feed-add-post-form-link-active']")
    public WebElement eventButton;


    @FindBy(id = "bx-b-uploadfile-blogPostForm_calendar")
    public WebElement uploadFiles;
    @FindBy(xpath = "//input[@class='diskuf-fileUploader wd-test-file-light-inp ']//tbody//tr[1]//td[1])[1]")
   // @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[2]/div[4]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]/div/input")
    public WebElement uploadFilesAndImages;


/*
   // @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
   // public WebElement linkButton;
    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkButton;
    @FindBy(xpath = "//input[@type='text' and @placeholder='Link text']")
    public WebElement textLinkForm;
    @FindBy(xpath = "//input[@type='text' and @placeholder='Link URL']")
    public WebElement linkForm;
    @FindBy(className = "adm-btn-save")
    public WebElement saveLinkButton;
    @FindBy(xpath = "//div[@class='feed-post-cont-wrap sonet-log-item-createdby-503 sonet-log-item-where-U-503-all sonet-log-item-where-U-503-blog-post sonet-log-item-where-U-503-blog']")
    public WebElement verificationLink;
*/

    @FindBy(xpath = "//*[@id='bx-b-link-blogPostForm_calendar']/span")
    public WebElement linkButton;

    @FindBy(xpath = "//input[@type='text' and @placeholder='Link text']")
    public WebElement textLinkForm;

    @FindBy(xpath = "//input[@type='text' and @placeholder='Link URL']")
    public WebElement linkForm;

    @FindBy(className = "adm-btn-save")
    public WebElement saveLinkButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//div[@class='feed-post-cont-wrap sonet-log-item-createdby-503 sonet-log-item-where-U-503-all sonet-log-item-where-U-503-blog-post sonet-log-item-where-U-503-blog']")
    public WebElement verificationLink;










    @FindBy(xpath = "//*[@id='bx-b-video-blogPostForm_calendar']/span")
    public WebElement insertVideo;
    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement videoSource;
    @FindBy(className = "adm-btn-save")
    public WebElement videoSaveButton;


    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement commaButton;
    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteWriteTab;
    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement verificationQuote;


    @FindBy(xpath = "//span[@id='lhe_button_editor_blogPostForm']")
    public WebElement visualEditorButton;
    @FindBy(id = "bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement verificationVisualEditor;

    @FindBy(id="feed-cal-event-fromcal_3Jcl")
    public WebElement eventStart;
    @FindBy(id="feed_cal_event_from_timecal_3Jcl")
    public WebElement eventStartTime;
    @FindBy(id="feed-cal-event-tocal_3Jcl")
    public WebElement eventEnd;
    @FindBy(id="feed_cal_event_to_timecal_3Jcl")
    public WebElement eventEndTime;


    @FindBy(id="event-remindercal_3Jcl")
    public WebElement clickSetReminder;

    @FindBy(id="event-locationcal_3Jcl")
    public WebElement eventLocation;

    @FindBy(id="feed-event-dest-add-link")
    public WebElement members;


    @FindBy(xpath = "//span[@class='feed-event-more-link-text']")
    public WebElement moreClick;
    @FindBy(id="event-accessibilitycal_3Jcl")
    public WebElement availability;
    @FindBy(id="event-repeatcal_3Jcl")
    public WebElement repeat;
    @FindBy(id="event-sectioncal_3Jcl")
    public WebElement calendar;
    @FindBy(id="event-importancecal_3Jcl")
    public WebElement importance;



    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;











}
