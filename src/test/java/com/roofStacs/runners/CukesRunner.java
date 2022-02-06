package com.roofStacs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/roofStacs/stepDefinitions",
        dryRun = false,
        tags = "@career"
)


public class CukesRunner {



}
