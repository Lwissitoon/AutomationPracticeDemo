import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Hooks {

@BeforeSuite
public void BaseSetup(){
    System.setProperty("webdriver.chrome.driver", "src//main//resources//driver//chromedriver.exe");
    App.driver= new ChromeDriver();
    App.driver.manage().window().maximize();
    App.WaitConf(Duration.ofSeconds(20));
    App.InitObjects();

}

@BeforeTest
public void TestSetup(){
    App.driver.navigate().to("http://automationpractice.com/");
}
@AfterTest
public  void Cleanup(){
    App.driver.quit();
}
}
