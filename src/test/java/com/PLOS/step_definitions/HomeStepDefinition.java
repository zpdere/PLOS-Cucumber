package com.PLOS.step_definitions;

import com.PLOS.pages.HomePage;
import com.PLOS.utilities.ConfigurationReader;
import com.PLOS.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HomeStepDefinition {

    HomePage homePage= new HomePage();

    @Given("User on the home page")
    public void user_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("Verify that {string} is present")
    public void verify_that_is_present(String module) {

        Assert.assertTrue(homePage.navigatorModule(module));

    }


}
