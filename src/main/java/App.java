import PageObjects.CartPage;
import PageObjects.Dashboard;
import PageObjects.Dashboard;
import PageObjects.ProductsPage;
import org.openqa.selenium.WebDriver;

public  class App extends CustomActions {
    public  static Dashboard dashboard;
    public  static ProductsPage productsPage;
    public  static CartPage cartPage;
    public static WebDriver driver;


    public static void InitObjects(){
        dashboard= new Dashboard(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
    }
}
