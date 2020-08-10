package com.Bitrix24.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaveFilterPage  extends  BasePage{
    @FindBy(xpath = "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[3]/div[1]/span[1]")
    public WebElement saveFilter;
    @FindBy(xpath = "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[3]/div[1]/span[3]/span")
    public WebElement resetToDefault;
    @FindBy(css = "#popup-window-content-LIVEFEED_search_container > div > div > div.main-ui-filter-sidebar > " +
            "div.main-ui-filter-sidebar-item-container > div.main-ui-filter-sidebar-item.main-ui-filter-new-filter > input")
    // "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[1]/div[2]/div[10]/input")
    public WebElement filterName;
    @FindBy(xpath = "//*[@id='popup-window-content-LIVEFEED_search_container']/div/div/div[3]/div[3]/div/span[1]")
    public WebElement save;

}
