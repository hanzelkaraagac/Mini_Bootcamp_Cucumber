package mini_bootcamp_cucumber.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini_bootcamp_cucumber.pages.Day01_Background_Page;
import mini_bootcamp_cucumber.utilities.ConfigurationReader;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class Day01_BackGround_Stepdef {
    Day01_Background_Page page=new Day01_Background_Page();
    String expectedUrl="";
    @Given("ets tur sitesine gidilir")
    public void etsTurSitesineGidilir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etstur"));
        expectedUrl = Driver.getDriver().getCurrentUrl();

    }

    @And("login butonu ustune gidilir")
    public void loginButonuUstuneGidilir() {
        ReusableMethods.hover(page.login);
        ReusableMethods.wait(2);
    }

    @When("giris butonuna basilir")
    public void girisButonunaBasilir() {

        page.giris.click();
        ReusableMethods.wait(2);
    }

    @And("eposta girilir")
    public void epostaGirilir() {
        page.email.sendKeys("hakan@gmail.com");
        ReusableMethods.wait(2);
    }

    @And("password girilri")
    public void passwordGirilri() {
        page.password.sendKeys("524353443");
        ReusableMethods.wait(2);
    }

    @When("giris yap butonuna basilir")
    public void girisYapButonunaBasilir() {
        page.girisYap.click();
        ReusableMethods.wait(2);
    }

    @Then("sayfaya gidilemedigi dogrulanir")
    public void sayfayaGidilemedigiDogrulanir() {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl,actualUrl);
        Driver.closeDriver();

    }

    @And("soyad girilir")
    public void soyadGirilir() {

        page.soyad.sendKeys("gsfdgdfg");
        ReusableMethods.wait(2);
    }

    @And("uye ol butonuna basilir")
    public void uyeOlButonunaBasilir() {
        page.uyeOl.click();
        ReusableMethods.wait(2);
    }

    @And("ad girilir")
    public void adGirilir() {

        page.ad.sendKeys("gdfsdfg");
    }

    @And("uyelik icin eposta girilir")
    public void uyelikIcinEpostaGirilir() {
    page.eposta.sendKeys("haklf@gmail.com");
    }

    @And("ceptelefonu girilir")
    public void ceptelefonuGirilir() {
        page.ceptel.sendKeys("436453647");
        ReusableMethods.wait(2);
    }

    @And("uyelik icin password girilir")
    public void uyelikIcinPasswordGirilir() {
        page.sifre1.sendKeys("4545677788");
    }

    @And("password yeniden girlir")
    public void passwordYenidenGirlir() {
        page.sifre2.sendKeys("4545677788");
    }

    @And("kullanim sartlari checkbox secilir")
    public void kullanimSartlariCheckboxSecilir() {
        page.kullanim.click();
    }

    @And("kampanyalara checkbox secilir")
    public void kampanyalaraCheckboxSecilir() {
        page.firsat.click();
    }

    @When("uyelik sayfasinda uye ol butonuna basilir")
    public void uyelikSayfasindaUyeOlButonunaBasilir() {
        page.uyelikUyeOl.click();

    }
}
