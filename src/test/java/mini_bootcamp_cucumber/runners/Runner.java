package mini_bootcamp_cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failed_scenarios.txt"
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "./src/test/resources/features",//features folder path
        glue = {"stepdefinitions"},   //stepdefinitions path
        tags = "",
        dryRun = false
)
public class Runner {
}

//Bu sinif Test Caseleri run etmek icin kullanilir

//Runners class, feature file lar ile step definition'i birbirine baglar