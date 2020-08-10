package com.Bitrix24.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//@filesIcon, @E-mail,   @lincIcon,  @videoIcon,  @uploadIcon, @mentionIcon, @dispayMessage,  @topicIcon,    @recordVideo

@RunWith(Cucumber.class)
@CucumberOptions ( plugin = {
        "html:target/cucumber-report.html",
        "json:target/cucumber.json",
        "rerun:target/rerun.txt"
},
        features = "src/test/resources/features" ,
         glue = "com/Bitrix24/step_definitions",
         dryRun=true,
         tags = "@filesIcon"
)

public class CukesRunner {
}
