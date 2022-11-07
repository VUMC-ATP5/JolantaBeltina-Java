package lekcijaSeptini.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver parluks;


    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.manage().window().maximize();
        parluks.get("https://www.saucedemo.com/");

    }
    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();
    }
}
