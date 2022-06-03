import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases extends Hooks {

    @Test
    public  void AddItemToCart(){

        App.WaitForElement( App.dashboard.tshirtsBtn);
        App.dashboard.tshirtsBtn.click();

        App.ScrollToElement(App.productsPage.addCartBtn);
        App.WaitForElement(App.productsPage.addCartBtn);
        App.productsPage.addCartBtn.click();

        App.WaitForElement( App.productsPage.GotoCheckoutBtn);
        App.productsPage.GotoCheckoutBtn.click();

        App.WaitForElement( App.cartPage.RemoveBtn);
        Assert.assertTrue(App.cartPage.RemoveBtn.isDisplayed());

    }

    @Test
    public  void RemoveItemFromCart() {

        App.WaitForElement( App.dashboard.tshirtsBtn);
        App.dashboard.tshirtsBtn.click();

        App.ScrollToElement(App.productsPage.addCartBtn);
        App.WaitForElement(App.productsPage.addCartBtn);
        App.productsPage.addCartBtn.click();

        App.WaitForElement(App.productsPage.GotoCheckoutBtn);
        App.productsPage.GotoCheckoutBtn.click();


        App.WaitForElement(App.cartPage.RemoveBtn);
        App.cartPage.RemoveBtn.click();

        App.WaitForElementToHide(App.cartPage.RemoveBtn);
        Assert.assertFalse(App.ElementIsPresent(App.cartPage.RemoveBtn));
    }

    @Test
    public  void SearchItemExist() {

        App.WaitForElement( App.dashboard.SearchInput);
        App.dashboard.SearchInput.sendKeys("print");
        App.dashboard.SearchBtn.click();

        App.ScrollToElement(App.productsPage.ProductsList.get(0));
        App.WaitForElement(App.productsPage.ProductsList.get(0));


        Assert.assertTrue(App.productsPage.ProductsList.size()>0);
    }

    @Test
    public  void SearchItemNotExist() {

        App.WaitForElement( App.dashboard.SearchInput);
        App.dashboard.SearchInput.sendKeys("pant");
        App.dashboard.SearchBtn.click();

        App.WaitForElement(App.dashboard.AlertLabel);
        Assert.assertTrue(App.dashboard.AlertLabel.getText().contains("No results were found"));
    }

    @Test
    public  void ValidateSiteInformation(){



        App.ScrollToElement(App.dashboard.LocationLabel);
        App.WaitForElement(App.dashboard.LocationLabel);

        System.out.println(App.dashboard.LocationLabel.getText());
        Assert.assertTrue(App.dashboard.LocationLabel.getText().contains("Selenium Framework, Research Triangle Park, North Carolina, USA"));
        Assert.assertTrue(App.dashboard.PhoneNumberLabel.getText().contains("(347) 466-7432"));
        Assert.assertTrue(App.dashboard.EmailLabel.getText().contains("support@seleniumframework.com"));

    }

}
