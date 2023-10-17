package mini_bootcamp_cucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//raporlarin daha ikunakli olmasi icin
                "html:target/default-cucumber-reports.html",
                "rerun:Failed/failedScenarios.txt" // bu satirdaki kod kosulan testlerden hata verenlerin yeniden ReRunner classi tarafindan kosulmasini saglar
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        features = "@Failed/failedScenarios.txt",//hata veren dosyalarin yolu
        glue = {"mini_bootcamp_cucumber/stepdefinitions","hooks"},   //stepdefinitions path
        dryRun = false
)
public class ReRunner {
}

//Bu sinif Test Caseleri run etmek icin kullanilir

//Runners class, feature file lar ile step definition'i birbirine baglar
