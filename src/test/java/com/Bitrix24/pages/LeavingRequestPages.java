package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import sun.jvm.hotspot.debugger.Page;

import java.util.concurrent.TimeUnit;

public class LeavingRequestPages extends LoginPage {

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreButton;

    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public WebElement workflowButton;

    @FindBy(xpath = "//div[@class='popup-window popup-window-with-titlebar']//span[@class='popup-window-close-icon popup-window-titlebar-close-icon']")
    public WebElement popUpX;

    @FindBy(name = "PROPERTY_86[n0][VALUE]")
    public WebElement StartDate;

    @FindBy(xpath = "//input[@name='PROPERTY_87[n0][VALUE]']")
    public WebElement EndDate;

    @FindBy(xpath = "//select[@name='PROPERTY_88']")
    public WebElement AbsenceType;

    @FindBy(xpath = "//textarea[@name='PREVIEW_TEXT']")
    public WebElement Reason;

    @FindBy(id = "blog-submit-button-save")
    public WebElement SendClick;


    public void MoreButton_WorkFlow() {
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        moreButton.click();
        workflowButton.click();
    }

    public void PermissionFromStaff() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        popUpX.click();
    }

    public void StartDateF_L_Request() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
            StartDate.sendKeys("08/20/2020" + Keys.ENTER);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void EndDateF_L_Request() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
            EndDate.sendKeys("08/28/2020" + Keys.ENTER);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void AbsenceNotes() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Select select = new Select(AbsenceType);
        select.selectByValue("90");
        Reason.sendKeys("My kids were sick");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Complete() {
        try {
            Thread.sleep(2000);
            SendClick.click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}