package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {


    WebDriver driver;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@title='Delete']")
    public WebElement RemoveBtn;

    @FindBy(xpath = "//a[@title='Delete']")
    public List<WebElement> CartProducts;
}
