package mini_bootcamp_cucumber.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import mini_bootcamp_cucumber.pages.Day04DataTable_Page;
import mini_bootcamp_cucumber.utilities.ConfigurationReader;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ReusableMethods;

import java.util.List;

import static org.junit.Assert.*;

public class Day04DataTable_StepDef {

    Day04DataTable_Page page = new Day04DataTable_Page();

    @Given("{string} sitesine gidilir")
    public void sitesine_gidilir(String string) {
        switch (string) {
            case "cicek sepeti":
                Driver.getDriver().get(ConfigurationReader.getProperty("ciceksepeti"));
                break;
            case "trendyol":
                Driver.getDriver().get(ConfigurationReader.getProperty("trendyol"));
                break;
            case "boyner":
                Driver.getDriver().get(ConfigurationReader.getProperty("boyner"));
                break;
            case "madame coco":
                Driver.getDriver().get(ConfigurationReader.getProperty("madameCoco"));
                break;
            case "ets tur":
                Driver.getDriver().get(ConfigurationReader.getProperty("etstur"));
                break;
            default:
                break;
        }
    }

    @When("dogum gunu linki tiklanir")
    public void dogum_gunu_linki_tiklanir() {
        page.hediye.click();
        ReusableMethods.wait(2);

        page.kabulEt.click();
        ReusableMethods.wait(2);

        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"body > div.header__bottom.js-header-bottom.switcher-active > div.container.container--main-menu.js-navigasyon-container > div.responsive-menu.js-responsive-menu > nav > ul > li:nth-child(11) > span > a\")");

        page.izinVer.click();
    }

    @Then("dogum gunu sayfasinda oldugu dogrulanir")
    public void dogum_gunu_sayfasinda_oldugu_dogrulanir() {
        String expectedUrl = "https://www.ciceksepeti.com/dogum-gunu-hediyeleri";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }

    @When("renk drop down tiklanir")
    public void renk_drop_down_tiklanir() {

    }

    @Then("sirasiyla renklerin secildigi dogrulanir")
    public void sirasiyla_renklerin_secildigi_dogrulanir(DataTable dataTable) {

        page.renk.click();

        List<String> bilgiler = dataTable.asList();

        for (int i = 1; i < bilgiler.size(); i++) {
            switch (bilgiler.get(i)) {
                case "bej":
                    page.bej.click();
                    ReusableMethods.wait(2);
                    break;
                case "beyaz":
                    page.beyaz.click();
                    ReusableMethods.wait(2);
                    break;
                case "çok renkli":
                    page.cokRenkli.click();
                    ReusableMethods.wait(2);
                    break;
                case "gri":
                    page.gri.click();
                    assertTrue(page.gri.isSelected());
                    ReusableMethods.wait(2);
                    break;
                default:
                    break;
            }
            Driver.getDriver().get("https://www.ciceksepeti.com/dogum-gunu-hediyeleri");
            ReusableMethods.wait(2);
            page.renk.click();
        }

            Driver.closeDriver();
    }

}
