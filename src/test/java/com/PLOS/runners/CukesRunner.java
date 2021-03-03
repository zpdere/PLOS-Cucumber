package com.PLOS.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        features = "src/test/java/resources/features",
        glue = "com/PLOS/step_definitions",
        dryRun = false,
        tags = "@WIP"
)



public class CukesRunner {
}
