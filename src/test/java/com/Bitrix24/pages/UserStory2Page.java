package com.Bitrix24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserStory2Page extends BasePage {
    @FindBy(xpath = "(//iframe[@class='bx-editor-iframe'])[2]")
    public WebElement frameMessage;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']")
    public WebElement taskButton;

    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriorityCheckBox;

    @FindBy(xpath = "(//span[@title='Quote text'])[2]")
    public WebElement commaButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement createQuote;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement verificationTextQuote;

    @FindBy(xpath = "//span[@id='lhe_button_editor_task-form-lifefeed_task_form']")
    public WebElement visualEditorButton;

    @FindBy(xpath = "//span[@id='bx-b-mention-task-form-lifefeed_task_form']")
    public WebElement mentionButton;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-task-form-bitrix_tasks_task_default_1']")
    public WebElement uploadButton;

    @FindBy(xpath = "(//input[@class='diskuf-fileUploader wd-test-file-light-inp diskuf-filemacos'])[1]")
    public WebElement uploadPicture;
    @FindBy(xpath = "//img[@id='bxid739327046']")
    public WebElement uploadPictureVerification;

    @FindBy(xpath = "(//span[@class='bxhtmled-top-bar-wrap'])[1]")
    public WebElement visualEditorVerification;

    @FindBy(id = "bx-b-mention-task-form-lifefeed_task_form")
    public WebElement addMentionButton;

    @FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[1]")
    public WebElement addPersonEmail1;

    @FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[2]")
    public WebElement addPersonEmail2;

    @FindBy(xpath = "(//span[@class='bxhtmled-metion'])[1]")
    public WebElement verifyEmailAddMention;

    @FindBy(xpath = "(//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link'])[2]")
    public WebElement linkButton;

    @FindBy(xpath = "//input[@placeholder='Link text']")
    public WebElement textLinkForm;

    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement addLinkForm;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public WebElement saveLinkButton;

    @FindBy(xpath = "//a[@href='https://www.youtube.com/watch?v=xCfOPHc-9sQ&list=RDxCfOPHc-9sQ&start_radio=1']")
    public WebElement verifyLink;

    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add'])[1]")
    public WebElement addMoreButton;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-last bx-finder-box-tab-selected']")
    public WebElement recentAddMoreButton;

    @FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[1]")
    public WebElement getRecentAddMoreButtonAddEmail;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement addMoreEmployeesAndDepartments;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[2]")
    public WebElement addMoreEmployeesAndDepartmentsAddEmail;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-email']")
    public WebElement addMoreEmailUsers;

    @FindBy(xpath = "(//span[@class='js-id-tdp-mem-sel-is-items tasks-h-invisible'])[1]/span[1]")

    public WebElement addMoreResponsiblepersonDisplayed;

    @FindBy(xpath = "(//span[@class='task-dashed-link-inner'])[1]")
    public WebElement createdByButton;

    @FindBy(xpath = "(//span[@class='task-dashed-link-inner'])[2]")
    public WebElement participantsButton;

    @FindBy(xpath = "(//span[@class='task-dashed-link-inner'])[3]")
    public WebElement observersButton;

    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-empty task-form-field-link add'])[2]")
    public WebElement participantsButtonAddButton;

    @FindBy(xpath = "(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-empty task-form-field-link add'])[3]")
    public WebElement observersButtonAddButton;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement popupClose;

    @FindBy(xpath = "//div[@id='bx-component-scope-lifefeed_task_form-originator']/span[1]")
    public WebElement verifyCreatedBy;

    @FindBy(xpath = "//div[@id='bx-component-scope-lifefeed_task_form-accomplice']/span[1]")
    public WebElement verifyParticipants;

    @FindBy(xpath = "//div[@id='bx-component-scope-lifefeed_task_form-auditor']/span[1]")
    public WebElement verifyObservers;

    @FindBy(xpath = "(//span[@class='task-options-inp-container task-options-date t-empty'])[1]")
    public WebElement Deadline;


    @FindBy(xpath = "//div[@class='bx-calendar-range']/a[4]")
    public WebElement dateNumber;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[1]")
    public WebElement hour;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[2]")
    public WebElement minutes;

    @FindBy(xpath = "(//span[@class='bx-calendar-button-text'])[1]")
    public WebElement deadlineSelect;

    @FindBy(name = "ACTION[0][ARGUMENTS][data][DEADLINE]")
    public WebElement verifyDeadline;

    @FindBy(xpath = "//div[@class='task-additional-alt-more']")
    public WebElement moreButton;

    @FindBy(xpath = "//input[@class='js-id-timeestimate-flag task-options-checkbox']")
    public WebElement taskPlannedTime;

    @FindBy(xpath = "//input[@class='js-id-timeestimate-time js-id-timeestimate-hour task-options-inp']")
    public WebElement planedTimeHours;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]")
    public WebElement sendButton;

    @FindBy(name = "ACTION[0][ARGUMENTS][data][TITLE]")
    public WebElement taskName;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link' and text()='Select document from Bitrix24'])[5]")
    public WebElement selectDocumentFromBitrix;

    @FindBy(xpath = "(//a[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file'])[1]")
    public WebElement selectFirstDocument;

    @FindBy(xpath = "//span[.='Select document']")
    public WebElement selectDocumentSubmitButton;

    @FindBy(xpath = "//span[@class='popup-window-button' and text()='View task']")
    public WebElement selectDocumentVerification;

}
