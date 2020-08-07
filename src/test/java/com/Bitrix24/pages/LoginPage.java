package com.Bitrix24.pages;

import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usenameInputBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasswordLink;


    public void login() {
String URL= ConfigurationReader.getProperty("url");
Driver.getDriver().get(URL);
Driver.getDriver().manage().window().fullscreen();
Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
wait.until(ExpectedConditions.visibilityOf(usenameInputBox)).sendKeys(ConfigurationReader.getProperty("username"));
Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
wait.until(ExpectedConditions.visibilityOf(passwordInputBox)).sendKeys(ConfigurationReader.getProperty("password"));
loginButton.click();


    }


}
