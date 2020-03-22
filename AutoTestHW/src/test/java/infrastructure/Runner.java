package infrastructure;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = {"@homework"},
        glue={"infrastructure", "glue/steps"},
        monochrome = true
)
public class Runner
{

}
