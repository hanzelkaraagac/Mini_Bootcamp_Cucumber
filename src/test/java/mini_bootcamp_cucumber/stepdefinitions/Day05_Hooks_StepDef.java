package mini_bootcamp_cucumber.stepdefinitions;

import io.cucumber.java.en.*;
import mini_bootcamp_cucumber.pages.Day05_Hooks_Page;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Day05_Hooks_StepDef {

    Day05_Hooks_Page page=new Day05_Hooks_Page();
    String sonuc="";

    @Given("arama kutusuna {string} yazilir")
    public void arama_kutusuna_yazilir(String string) {
        ReusableMethods.waitForVisibility(page.reklam, 7);
        page.reklam.click();
        ReusableMethods.wait(2);
        page.cookies.click();
        ReusableMethods.wait(2);
        page.aramaKutusu.sendKeys(string, Keys.ENTER);
    }
    @Then("sonuc sayfasinda {string} oldugu dogrulanir")
    public void sonuc_sayfasinda_oldugu_dogrulanir(String string) {
        if(string.contains("iran yapıştırıcısı")){
            assertFalse(page.sonucText.getText().contains(string));
        }else
        assertTrue(page.sonucText.getText().contains(string));
    }
    @When("sonuc sayfasindaki arama sonuc sayisi alinir")
    public void sonuc_sayfasindaki_arama_sonuc_sayisi_alinir() {
        sonuc= page.sonucText.getText().replaceAll("\\D", "");
        System.out.println("sonuc = " + sonuc);
    }
    @Then("{int} den az urunun ekranda goruntulendigi dogrulanir")
    public void denAzUrununEkrandaGoruntulendigiDogrulanir(Integer int1) {
        int sonucSayisi= Integer.parseInt(sonuc);
       int expected=int1;
        System.out.println("expected = " + expected);
        assertTrue(sonucSayisi==int1);


    }


}
