package com.PLOS.step_definitions;

import com.PLOS.utilities.ConfigurationReader;
import com.PLOS.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
 /* @Before
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void after(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println(("!!!!Test Failed! check the screenshot!!!!"));
            byte[] screenshot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"images/png","Screenshot");
            //scenario.embed(screenshot,"images/png"); versiyon 4.7.4

        }else {
            System.out.println(("Test Completed"));
        }
        System.out.println(("###### END OF TESTS #####"));

        Driver.getDriver().close();
    }



  */


}
