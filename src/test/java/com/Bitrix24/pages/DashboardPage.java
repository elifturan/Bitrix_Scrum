package com.Bitrix24.pages;

import com.Bitrix24.utilities.BrowserUtilities;
import com.Bitrix24.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends  BasePage {
    @FindBy(className = "main-ui-filter-search-filter")
    public WebElement filterAndSearch;
    @FindBy(xpath = "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[1]/div[1]/h5")
    public WebElement filtersText;
    @FindBy(xpath = "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[1]/div[2]/div[2]")
    public WebElement workButton;

    @FindBy(xpath = "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[1]/div[2]/div[4]")
    public WebElement favoritesButton;

    @FindBy(xpath = "//*[@id='LIVEFEED_filter_container_max']/div/div/div[1]")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[1]/div[2]/div[5]")
    public WebElement myActivityButton;

    @FindBy(xpath = "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[1]/div[2]/div[6]")
    public WebElement announcementButton;

    @FindBy(xpath = "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[1]/div[2]/div[7]")
    public WebElement workFlowsButton;

    @FindBy(xpath = "//*[text()='Date']/following-sibling::div[1] ")
    public WebElement locatorForDate;


    public void filterOption(String filterOption) {
        switch (filterOption) {
            case "WORK":
                workButton.click();
                BrowserUtilities.wait(2000);
                break;
            case "FAVORITES":
                favoritesButton.click();
                break;
            case "MY ACTIVITY":
                myActivityButton.click();
                break;
            case "ANNOUNCEMENTS":
                announcementButton.click();
                break;
            case "WORKFLOWS":
                workFlowsButton.click();
                break;


        }
    }

    public void displayed(String expectedBoxText) {

        String actual = searchBox.getText();
        Assert.assertEquals(expectedBoxText, actual);

    }

    public void selectDate(String date) {
        try {
            BrowserUtilities.explicitWaitClickAbility(locatorForDate, 10);
            locatorForDate.click();
            String locatorForOption =
                    "//*[@id='popup-window-content-main-filter-control-popup']//div[text()='" + date + "']";
            BrowserUtilities.explicitWaitClickAbility(Driver.getDriver().findElement(By.xpath(locatorForOption)), 10);
            Driver.getDriver().findElement(By.xpath(locatorForOption)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}



