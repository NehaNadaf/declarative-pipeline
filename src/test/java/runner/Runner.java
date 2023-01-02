package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 

 

 

@RunWith(Cucumber.class)

@CucumberOptions(

glue="StepDefinations",

features="src/test/java/Features", 

plugin={"html:target/cucumber-html-report.html", "json:target/cucumber.json",

 

"pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json", 

"junit:target/cucumber-results.xml"},

 

dryRun = false,

monochrome = true

)

public class Runner {

 

}
