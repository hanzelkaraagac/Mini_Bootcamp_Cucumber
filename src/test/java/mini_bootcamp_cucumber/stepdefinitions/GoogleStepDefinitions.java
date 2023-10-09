package mini_bootcamp_cucumber.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini_bootcamp_cucumber.pages.GooglePage;
import mini_bootcamp_cucumber.utilities.ConfigurationReader;
import mini_bootcamp_cucumber.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GooglePage googlePage = new GooglePage();
    @Given("kullanici googlea gider")
    public void kullaniciGoogleaGider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google_url"));
    }

    @When("togg icin arama yapar")
    public void toggIcinAramaYapar() {
        googlePage.searchBox.sendKeys("togg", Keys.ENTER);
    }

    @Then("sonuclarda togg oldugunu dogrular")
    public void sonuclardaToggOldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("togg"));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
