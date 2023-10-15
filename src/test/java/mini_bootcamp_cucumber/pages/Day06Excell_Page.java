package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day06Excell_Page {
    public Day06Excell_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id= "email")
    public WebElement email;
    @FindBy(id= "password")
    public WebElement password;
    @FindBy(id= "submit")
    public WebElement submit;
    @FindBy(id= "logout")
    public WebElement logout;
    @FindBy(id= "add-contact")
    public WebElement addContact;
    @FindBy(id= "error")
    public WebElement error;
}
