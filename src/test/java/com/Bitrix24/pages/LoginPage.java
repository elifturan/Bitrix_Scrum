package com.Bitrix24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "USER_LOGIN")
    public WebElement email;
    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement warningMessage;




}
