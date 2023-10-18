package mini_bootcamp_cucumber.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import mini_bootcamp_cucumber.pages.Day08_ParalelTest_Page;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.openqa.selenium.Keys;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Day08_ParalelTest_StepDef {

    Day08_ParalelTest_Page page=new Day08_ParalelTest_Page();

    @When("search boxina {string} yazilir")
    public void search_boxina_yazilir(String string) {
        ReusableMethods.flash(page.searchBox, Driver.getDriver());
        page.searchBox.sendKeys(string, Keys.ENTER);
        page.reklam.click();
    }
    @Then("goruntulunen sonuclarda {string} oldugu dogrulanir")
    public void goruntulunenSonuclardaOlduguDogrulanir(String arg0) {

         for (int i = 0; i < page.urunIsmi.size(); i++) {
            assertTrue(page.urunIsmi.get(0).getText().contains(arg0));
        }{

        }

    }

    @When("ilk urun favorilere ekler")
    public void ilkUrunFavorilereEkler() {

        page.ilkUrun.click();
    }

    @And("giris sayfasi acilir")
    public void girisSayfasiAcilir() {
        String expectedUrl="https://giris.pazarama.com/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fprotocol%3Doauth2%26response_type%3Dcode%26access_type%26client_id%3Dpazarama.web.prod.client%26redirect_uri%3Dhttps%253A%252F%252Fwww.pazarama.com%252Fcallback%26scope%3Dopenid%2520profile%2520pazaramaweb.fullaccess%2520offline_access%26state%3DvSjsdmtTwf%26code_challenge_method%3DS256%26guest_id%3D8df7c685-2706-45d1-a04e-3680439a5960%26channel_code%3D2%26code_challenge%3DMhBTBZzGAJOJqFWfUzE5R2Cs_Q_KveHSWt5ETAwSGqM%26response_mode%3Dquery";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        assertTrue(expectedUrl.contains("giris"));
    }

    @And("email ve password kutularina veri girilir")
    public void emailVePasswordKutularinaVeriGirilir(DataTable dataTable) {
        List<String> emailPassword= dataTable.row(0);
        System.out.println("emailPassword = " + emailPassword);
        System.out.println("dataTable.row(1).get(0) = " + dataTable.row(1).get(0));
        for (int i = 1; i < emailPassword.size(); i++) {

            ReusableMethods.flash(page.email, Driver.getDriver());
            page.email.sendKeys(dataTable.row(1).get(i-1));

            ReusableMethods.flash(page.password, Driver.getDriver());
            page.password.sendKeys(dataTable.row(1).get(i));
            page.submitButton.click();
        }


    }

    @Then("giris yapilamadigi dogrulanir")
    public void girisYapilamadigiDogrulanir() {

        assertTrue(page.submitButton.isDisplayed());
    }
}
