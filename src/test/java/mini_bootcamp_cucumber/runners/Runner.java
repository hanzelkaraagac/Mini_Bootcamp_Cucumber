package mini_bootcamp_cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.FindBy;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",  //plugin ekledikten sonra bunu cucumber report için ekle

                "rerun:Failed/failedScenarios.txt" // bu satirdaki kod kosulan testlerden hata verenlerin yeniden ReRunner classi tarafindan kosulmasini saglar
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "src/test/resources/features",//features folder path
        glue = {"mini_bootcamp_cucumber/stepdefinitions","hooks"},   //stepdefinitions path
        tags = "@getir",
        dryRun = false
)
public class Runner {
}

//Bu sinif Test Caseleri run etmek icin kullanilir

//Runners class, feature file lar ile step definition'i birbirine baglar
