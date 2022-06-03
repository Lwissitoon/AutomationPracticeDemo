package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

    WebDriver driver;

    public Dashboard(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[@title='T-shirts'])[2]")
    public WebElement tshirtsBtn;

    @FindBy(name = "search_query")
    public  WebElement SearchInput;

    @FindBy(name = "submit_search")
    public  WebElement SearchBtn;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    public  WebElement AlertLabel;

    @FindBy(xpath = "//i[@class='icon-map-marker']/..")
    public  WebElement LocationLabel;

    @FindBy(xpath = "//section//i[@class='icon-phone']/..")
    public  WebElement PhoneNumberLabel;

    @FindBy(xpath = "//i[@class='icon-envelope-alt']/..")
    public  WebElement EmailLabel;
}