package com.Bitrix24.pages;

import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{
    //@FindBy(xpath = "(//input[@class='login-inp'])[1]")
    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy(xpath = "(//input[@class='login-inp'])[2]")
    //@FindBy(xpath = "input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(id = "USER_REMEMBER")
    public WebElement remember;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement LoginButton;


    public void login(){
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        Driver.getDriver().manage().window().getSize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(ConfigurationReader.getProperty("username"));
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(ConfigurationReader.getProperty("password"));
        LoginButton.click();

    }


}


