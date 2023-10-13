package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day04DataTable_Page {

    public Day04DataTable_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/dogum-gunu-hediyeleri'])[2]")
    public WebElement dogumGunu;
    @FindBy(xpath = "(//a[@class='dropdown-toggle btn filter__button'])[4]")
    public WebElement renk;
    @FindBy(xpath = "//label[text()='Bej ']")
    public WebElement bej;
    @FindBy(xpath = "//label[text()='Beyaz ']")
    public WebElement beyaz;
    @FindBy(xpath = "//label[text()='Çok Renkli ']")
    public WebElement cokRenkli;
    @FindBy(xpath = "//label[text()='Gri ']")
    public WebElement gri;
    @FindBy(xpath = "//img[@src='https://cdn03.ciceksepeti.com/Themes/Ciceksepeti/Assets/images/homepage-switch/homepage-switch-popup-option-extra-230530.png']")
    public WebElement hediye;
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement kabulEt;
    @FindBy(xpath = "//button[text()='İzin Ver']")
    public WebElement izinVer;

}
