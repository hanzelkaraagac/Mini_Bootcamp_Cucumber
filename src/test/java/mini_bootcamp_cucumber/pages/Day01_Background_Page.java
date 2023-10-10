package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day01_Background_Page {

    public Day01_Background_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[@class='dropbtn nothidden']")
    public WebElement login;
    @FindBy (xpath = "//button[@data-target='#modalSignIn']")
    public WebElement giris;
    @FindBy (id = "tb-contactEmailSignIn")
    public WebElement email;
    @FindBy (id = "showPass_2")
    public WebElement password;
    @FindBy (id = "btn-signin")
    public WebElement girisYap;
    @FindBy (xpath = "//button[@data-target='#modalSignUp']")
    public WebElement uyeOl;
    @FindBy (id = "tb-signUp-firstName")
    public WebElement ad;
    @FindBy (id = "tb-signUp-lastName")
    public WebElement soyad;
    @FindBy (id = "tb-contactEmailSignUp")
    public WebElement eposta;
    @FindBy (id = "contactFormPhoneNumber")
    public WebElement ceptel;
    @FindBy (id = "showPass_0")
    public WebElement sifre1;
    @FindBy (id = "showPass_1")
    public WebElement sifre2;
    @FindBy (xpath = "//a[@class='agreement-usage']/preceding-sibling::span[@class='span-for-checkbox']")
    public WebElement kullanim;
    @FindBy (xpath = "//label[@for='cb-dealCampaign']")
    public WebElement firsat;
    @FindBy (id = "btn-signup")
    public WebElement uyelikUyeOl;
}
