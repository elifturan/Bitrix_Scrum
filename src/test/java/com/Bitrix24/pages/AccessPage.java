package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessPage {

    public void AccessPage(){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath="//*[@id='blog-post-addc-add-685']")
    public WebElement commentButton;

    @FindBy (xpath="/html/body")
    public WebElement getCommentButton;

    @FindBy(xpath = "//*[@id=\"bx-ilike-button-BLOG_POST_686-1596954653\"]/span/a")
    public WebElement likeButton;

    @FindBy(xpath="//*[@id=\"log_entry_follow_2136\"]/a")
    public WebElement unfollowButton;

}
