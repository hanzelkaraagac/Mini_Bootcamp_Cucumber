package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Day08_ParalelTest_Page {

    public Day08_ParalelTest_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css= "input[placeholder='Marka, ürün veya hizmet ara...']")
    public WebElement searchBox;
    @FindBy(xpath= "//div[@class='line-clamp-2 text-gray-600 h-9 text-xs leading-4.5 mb-1.5']")
    public List<WebElement> urunIsmi;
    @FindBy(xpath= "(//span[@name='heart'])[1]")
    public WebElement ilkUrun;
    @FindBy(id= "Username")
    public WebElement email;
    @FindBy(id= "Password")
    public WebElement password;
    @FindBy(id= "submit-button")
    public WebElement submitButton;
    @FindBy(xpath= "(//button[text()='Evet'])[1]")
    public WebElement reklam;
}
