import net.bytebuddy.asm.Advice;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomActions {
    static WebDriverWait  wait;
    static JavascriptExecutor js ;

    public static void WaitConf(Duration TimeOut){

        wait = new WebDriverWait(App.driver,TimeOut);
        wait.ignoring(NoSuchElementException.class);
        js = (JavascriptExecutor) App.driver;

    }

    public static void WaitForElement(WebElement element){

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void WaitForElementToHide(WebElement element){

        wait.until(ExpectedConditions.invisibilityOf(element));
    }
    public  static  void ScrollToBotton()
    {

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

    public  static  void ScrollToElement(WebElement element) {
        for (int i=0; i < 10; i++) {

                if (element.isDisplayed()) {

                    break;
                }

else     {
                    js.executeScript("window.scrollTo(0,"+(i*100)+")");
                }
        }



    }


    public  static  boolean ElementIsPresent(WebElement element){

        try{
           return element.isDisplayed();
        }
        catch (NoSuchElementException e){
            return false;
        }
    }

}
