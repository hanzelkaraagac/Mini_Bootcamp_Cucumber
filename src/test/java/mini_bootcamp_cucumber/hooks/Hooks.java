package mini_bootcamp_cucumber.hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    /*
    Hooks : Her bir Scenario ya da Scenario Outline dan once ya da sonra calismasini istedigimiz metotlar konur
    @Before ve @After metotlarini icerir
     */
    @Before
    public void setUpScenarios(){
        System.out.println("Before Metotu");
    }
    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Metotu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_" + scenario.getName());

            //  Driver.closeDriver(); ==? Burasi tarayici kapatir
        }
    }
}