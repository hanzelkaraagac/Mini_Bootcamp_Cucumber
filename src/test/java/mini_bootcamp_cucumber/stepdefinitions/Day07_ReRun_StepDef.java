package mini_bootcamp_cucumber.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import mini_bootcamp_cucumber.pages.Day07_ReRun_Page;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Day07_ReRun_StepDef {


    Day07_ReRun_Page page=new Day07_ReRun_Page();



    @And("arama butonuna basar")
    public void aramaButonunaBasar() {

        page.aramaButonu.click();

    }

    @And("arama kutusuna {string} yazar")
    public void aramaKutusunaYazar(String arg0) {
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#taboola-video-reel-close-slider\")");
        //page.aramaKutusu.sendKeys(arg0, Keys.ENTER);
        page.aramaKutusu.sendKeys(arg0);
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#myGlobalSearchBtn\")");
    }

    @Then("sonuçlar {string} oldugunu dogrular")
    public void sonuclarOldugunuDogrular(String arg0) {

        assertTrue(page.aramaSonucu.getText().contains(arg0));


    }
}
