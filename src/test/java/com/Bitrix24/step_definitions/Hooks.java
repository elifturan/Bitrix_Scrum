package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.BasePage;
import com.Bitrix24.pages.LoginPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Hooks extends LoginPage {
    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(),28);
    @Before
    public void setUp() {
        System.out.println("#### setup! start d######\n");
        //Driver.getDriver().manage().window().maximize();
        //Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        //Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(ConfigurationReader.getProperty("username"));
        //Driver.getDriver().manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(ConfigurationReader.getProperty("password"));
        //loginButton.click();
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }

}