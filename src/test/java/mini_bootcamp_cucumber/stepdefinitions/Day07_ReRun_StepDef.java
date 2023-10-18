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
        try { page.kabulEt.click();
        } catch (Exception e) {

        }
        if (ReusableMethods.webelementJavaScript("document.querySelector(\"#taboola-video-reel-close-slider\")").isDisplayed()) {
            ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#taboola-video-reel-close-slider\")");
            //trend videolari kapatmak icin
        }

        //ReusableMethods.waitForVisibility(page.aramaButonu, 10);
        // ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#myGlobalSearchBtn\")");

        try {
            page.aramaButonu.click();

        } catch (Exception e) {

        }
    }

    @And("arama kutusuna {string} yazar")
    public void aramaKutusunaYazar(String arg0) {
//        if(ReusableMethods.webelementJavaScript("document.querySelector(\"#taboola-video-reel-close-slider\")").isDisplayed()){
//            ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#taboola-video-reel-close-slider\")");
//
//        }
        try {
            page.aramaKutusu.sendKeys(arg0);

            //page.aramaButonu.click();
        }catch (Exception e){}
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector('#myGlobalSearchBtn')");
        // ReusableMethods.waitForVisibility(page.aramaKutusu, 10);
        //ReusableMethods.showElementWithFrame("input[id='myGlobalSearchInput");
      //  ReusableMethods.sendKeyWithJavaScript(arg0, page.aramaKutusu);


    }

    @Then("sonuçlar {string} oldugunu dogrular")
    public void sonuclarOldugunuDogrular(String arg0) {

      //  ReusableMethods.waitForVisibility(page.aramaSonucu,25 );
        String actualText= ReusableMethods.getTextWithJavaScript("//h2[@class='h-title mb-0']");
        //System.out.println("normalize space = " + page.aramaSonucu.getText());
        page.aramaSonucu.getText().replaceAll(" ", "");
        System.out.println("replace all = " + page.aramaSonucu);
        System.out.println("actualText = " + actualText);
        assertTrue(actualText.contains(arg0));


    }
}
