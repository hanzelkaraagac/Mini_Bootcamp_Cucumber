package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day03ScenarioOutline_Pages {
    public Day03ScenarioOutline_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@class='sc-fqkvVR byzlMQ icon-account']")
    public WebElement login;
    @FindBy (xpath = "//a[@class='user-cart-active_link__Y0FkN']")
    public WebElement uyeOl;
    @FindBy (xpath = "//div[@class='login-desktop_leftHeaderRegisterTitle__ABHjJ']")
    public WebElement sayfaTitle;
    @FindBy (xpath = "//input[@placeholder='Adın Soyadın']")
    public WebElement ad;
    @FindBy (xpath = "//input[@placeholder='E-posta adresin']")
    public WebElement email;
    @FindBy (xpath = "//input[@placeholder='Şifren']")
    public WebElement sifre;
    @FindBy (xpath = "//input[@placeholder='Cep Telefonun']")
    public WebElement ceptelefonu;
    @FindBy (xpath = "(//div[@class='checkbox_box__1NS2V'])[1]")
    public WebElement uyelikSozlesmesi;
    @FindBy (xpath = "(//div[@class='checkbox_box__1NS2V'])[2]")
    public WebElement rizaMetni;
    @FindBy (xpath = "//button[@class='login-button_box__dnyuU register-form_registerSubmitButton__Aztsg']")
    public WebElement uyeOlButon;
    @FindBy (xpath = "//button[@class='login-button_box__dnyuU login-form_loginSubmitButton__PhqyF']")
    public WebElement girisYap;
    @FindBy (xpath = "//span[normalize-space()='Seni gördüğümüze sevindik ']")
    public WebElement girisText;
}
