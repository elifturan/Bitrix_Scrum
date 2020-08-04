package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(),28);
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
