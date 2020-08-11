package com.Bitrix24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessTripPage {

    @FindBy(xpath =  "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public WebElement workflowButton;

    @FindBy(xpath = "//span[@id='bx-lists-notify-success-480']")
    public WebElement permission;

    @FindBy(xpath = "//a[@class='webform-small-button webform-button-cancel']")
    public WebElement close;

    @FindBy(xpath = "//input[@name='NAME']")
    public WebElement title;

    @FindBy(xpath = "//input[@name='PROPERTY_70[n0][VALUE]']")
    public WebElement destination;

    @FindBy(xpath = "//input[@name='PROPERTY_71[n0][VALUE]']" )
    public WebElement StartDate;

    @FindBy(xpath = "//input[@name='PROPERTY_72[n0][VALUE]']" )
    public WebElement EndDate;

    @FindBy(xpath = "//textarea[@name='PREVIEW_TEXT']")
    public WebElement Purpose;

    @FindBy(xpath = "//input[@name='PROPERTY_73[n0][VALUE]']")
    public WebElement PlannedExp;

    @FindBy(xpath = "//select[@name='PROPERTY_74']")
    public WebElement Currency;

    @FindBy(xpath = "//input[@name='PROPERTY_78[n0][VALUE]']")
    public WebElement AttDocuments;

    @FindBy(id = "blog-submit-button-save")
    public WebElement SendButton;

}
