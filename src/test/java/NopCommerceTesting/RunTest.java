package NopCommerceTesting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
//for report
@CucumberOptions(features=".",tags=" @test", plugin={"pretty","html:target/Destination"})

//@CucumberOptions(features=".",plugin={"pretty","html:target/Destination"})

public class RunTest {


}
