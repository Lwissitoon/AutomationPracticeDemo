package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage {

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//span[.='Add to cart']/..")
    public WebElement addCartBtn;
    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    public WebElement GotoCheckoutBtn;

    @FindBy(xpath = "//div[@class='product-container']")
    public List<WebElement> ProductsList;

}
