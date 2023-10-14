package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day05_Hooks_Page {

    public Day05_Hooks_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[placeholder")
    public WebElement aramaKutusu;
    @FindBy(css = "div[class='dscrptn dscrptn-V2")
    public WebElement sonucText;
    @FindBy(css = "div[title='Kapat")
    public WebElement reklam;
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookies;
}
