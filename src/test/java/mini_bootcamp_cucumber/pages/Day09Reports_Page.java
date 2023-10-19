package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day09Reports_Page {

    public Day09Reports_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css= "button[aria-label='Tümünü Kabul Et']")
    public WebElement cerez;
}
