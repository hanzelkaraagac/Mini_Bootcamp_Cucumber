package mini_bootcamp_cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",  //plugin ekledikten sonra bunu cucumber report için ekle. Paralel test icin dosya adina 1 rakami ekle
                "junit:test-output/htmlReport/cucumber1.xml", //xml report için
                "rerun:Failed/failedScenarios.txt" // bu satirdaki kod kosulan testlerden hata verenlerin yeniden ReRunner classi tarafindan kosulmasini saglar

        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "src/test/resources/features",//features folder path
        glue = {"mini_bootcamp_cucumber/stepdefinitions","hooks"},   //stepdefinitions path
        tags = "@paralel",
        dryRun = false
)
public class OzHakkikiRunnerSpor {
}

//Bu sinif Test Caseleri run etmek icin kullanilir

//Runners class, feature file lar ile step definition'i birbirine baglar
