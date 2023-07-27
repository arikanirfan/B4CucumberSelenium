package com.kraftech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/kraftech/stepDefinitions",
        dryRun = false, //prova (false olursa java kodları true olursa çalışmaz.)
        tags = "@mikeParameter"

)
public class CukesRunner {

}
