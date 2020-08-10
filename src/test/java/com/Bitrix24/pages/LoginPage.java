package com.Bitrix24.pages;

import com.Bitrix24.utilities.BrowserUtilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends  BasePage{
    @FindBy(xpath = "//*[@id='login-popup']/form/div[1]/div[1]/input")
    public WebElement username;
    @FindBy(xpath = "//*[@id='login-popup']/form/div[1]/div[2]/input")
    public WebElement password;
    @FindBy(className = "login-btn")
    public WebElement loginButton;

    public void login(String userName, String passWord) {
        BrowserUtilities.explicitWait(username, 10);
        username.sendKeys(userName);
        password.sendKeys(passWord);
        loginButton.click();

    }





}
