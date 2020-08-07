package com.Bitrix24.step_definitions;

import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    @Before
    public void setup(){
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }



}
