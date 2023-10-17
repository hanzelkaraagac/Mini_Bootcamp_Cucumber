package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day07_ReRun_Page {

    public Day07_ReRun_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id= "myGlobalSearchBtn")
    public WebElement aramaButonu;
    @FindBy(id= "myGlobalSearchInput")
    public WebElement aramaKutusu;
    @FindBy(css= "h-title mb-0")
    public WebElement aramaSonucu;
}
