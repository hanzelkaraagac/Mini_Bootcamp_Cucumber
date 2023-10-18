package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day07_ReRun_Page {

    public Day07_ReRun_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//button[@id='myGlobalSearchBtn']")
    public WebElement aramaButonu;
    @FindBy(xpath= "//span[@id='userToAcceptButton']")
    public WebElement kabulEt;
    @FindBy(xpath= "//div[@class='search-box-new-container']/button[@id='myGlobalSearchBtn']")
    public WebElement aramaKutusu;
    @FindBy(xpath= "h2[normalize-space()='\n" +
            "                        Qa tester Haberleri\n" +
            "                    '")//h1[='iran yapıştırıcısı']
    public WebElement aramaSonucu;
}
