package com.Bitrix24.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtilities {
    public static void explicitWait(WebElement element, long time){

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);

        wait.until(ExpectedConditions.visibilityOf(element));



    }
    public static void explicitWaitClickAbility(WebElement element, long time){

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);

        wait.until(ExpectedConditions.elementToBeClickable(element));



    }
    public static void wait(int seconds)  {
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
