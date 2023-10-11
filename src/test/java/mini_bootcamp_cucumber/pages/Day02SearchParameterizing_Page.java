package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Day02SearchParameterizing_Page {

    public Day02SearchParameterizing_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath= "//input[@id='pz-form-input-AutocompleteInput']")
    public WebElement searchBox;

    @FindBy (xpath= "//a[@class='product-item__name']")
    public List<WebElement> login;
    @FindBy (xpath= "(//button[@class='action-menu__button -active'])[1]")
    public WebElement english;
    @FindBy (xpath= "//img[@class='mfp-close wis-mfp-close-244800']")
    public WebElement reklam;
    @FindBy (xpath= "//button[@class='cc-nb-reject']")
    public WebElement coocies;
    @FindBy (xpath= " (//img[@src='https://dbfukofby5ycr.cloudfront.net/m13/1/1657/d2304/1f5ba-c--k--s---konu.png'])[1]")
    public WebElement miniReklam;
    @FindBy (xpath= " //div[@class='searched-text']")
    public WebElement sonuc;

}
