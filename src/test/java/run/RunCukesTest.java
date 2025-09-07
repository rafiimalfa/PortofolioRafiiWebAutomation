package run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"step_definitions", "hooks"},
        plugin = {
                "pretty",
                "json:target/cucumber/cucumber.json",
                "html:target/cucumber/cucumber.html"
        },
        tags = "@Testing",
        monochrome = true
)
public class RunCukesTest { }
