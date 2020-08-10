package com.Bitrix24.pages;

import com.Bitrix24.utilities.BrowserUtilities;
import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Type_Box_Page extends BasePage {
    @FindBy(xpath = "//*[text()='Type']/following-sibling::div[1]")
    public WebElement typeBox;

    // @FindBy(xpath = "//*[@id='popup-window-content-main-filter-control-popup']//div[text()='+ Type + ']")
    // public  WebElement typeBoxPostOption;

    @FindBy(xpath = "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[3]/div[2]/div/button")
    public WebElement searchButton;

    public void selectType(String type) {
        try {
            Thread.sleep(5000);
            BrowserUtilities.explicitWaitClickAbility(typeBox, 10);
            typeBox.click();
            Thread.sleep(5000);
            String typeBoxOptions =
                    "//*[@id='popup-window-content-main-filter-control-popup']//div[text()='" + type + "']";
            BrowserUtilities.explicitWaitClickAbility(Driver.getDriver().findElement(By.xpath(typeBoxOptions)), 10);
            Driver.getDriver().findElement(By.xpath(typeBoxOptions)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
