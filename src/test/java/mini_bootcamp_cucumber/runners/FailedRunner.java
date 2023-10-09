package mini_bootcamp_cucumber.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha okunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt"
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "@target/failed_scenario.txt",//.txt dosya path
        glue = {"stepdefinitions","hooks"},   //stepdefinitions path
        dryRun = false
)
public class FailedRunner {
}