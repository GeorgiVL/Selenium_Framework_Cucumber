package Academy.cucumberOptions;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // that will run it with junit
@CucumberOptions(
        features = "src/test/java/Academy/features",
        glue = "Academy.stepDefinations"
)
public class TestRunner  { // that will run it with testng

}
