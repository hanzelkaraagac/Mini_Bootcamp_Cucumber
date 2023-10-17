package mini_bootcamp_cucumber.stepdefinitions;

import io.cucumber.java.en.*;
import mini_bootcamp_cucumber.pages.Day06Excell_Page;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ExcelUtils;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.junit.Assert;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Day06Excell_StepDef {

    Day06Excell_Page page= new Day06Excell_Page();
    String firstUrl="";

    @Given("kullanici exceldeki {string} sayfasindaki kullanici bilgileri ile login olur")
    public void kullanici_exceldeki_sayfasindaki_kullanici_bilgileri_ile_login_olur(String string) {
        firstUrl= Driver.getDriver().getCurrentUrl();
        ExcelUtils excellUtils=new ExcelUtils("src/test/resources/userData.xlsx", string);

        for (int i = 1; i <= excellUtils.rowCount(); i++) {
            String email= excellUtils.getCellData(i, 0);
            String password= excellUtils.getCellData(i, 1);
            page.email.sendKeys(email);
            ReusableMethods.wait(2);
            page.password.sendKeys(password);
            ReusableMethods.wait(2);
            page.submit.click();

            ReusableMethods.waitForVisibility(page.addContact, 15);
            String secondUrl=Driver.getDriver().getCurrentUrl();
            System.out.println("firstUrl = " + firstUrl);
            System.out.println("secondUrl = " + secondUrl);
            assertFalse(firstUrl.equals(secondUrl));
            assertTrue(page.addContact.isDisplayed());
            page.logout.click();
            
        }
        

    }
    @Then("kullanici login oldugunu dogrular")
    public void kullanici_login_oldugunu_dogrular() {


    }


    @Then("kullanici exceldeki {string} sayfasindaki kullanici bilgileri ile login olamadigini dogrular")
    public void kullaniciExceldekiSayfasindakiKullaniciBilgileriIleLoginOlamadiginiDogrular(String string) {

        ExcelUtils excellUtils=new ExcelUtils("src/test/resources/userData.xlsx", string);
        String email= excellUtils.getCellData(1, 0);
        String password= excellUtils.getCellData(1, 1);
        page.email.sendKeys(email);
        ReusableMethods.wait(2);
        page.password.sendKeys(password);
        ReusableMethods.wait(2);
        page.submit.click();
        Assert.assertTrue(page.error.isDisplayed());






    }


}
