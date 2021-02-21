
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class TestPlan {
    //private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        //ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("debuggerAddress", "localhost:58223");
        ChromeDriver driver = new ChromeDriver();

        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.SelecSize();
        webForm.AddToCart();
        //webForm.enterEinsatz();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         webForm.Comprar();
         //webForm.CheckBox();
        // webForm.SendOrder();
    }


    @Test(testName = "J1")
    public static void submitEinsatz() {
        //ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("debuggerAddress", "localhost:51277");
        ChromeDriver driver = new ChromeDriver();

        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.SelecSize();
        webForm.AddToCart();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webForm.Comprar();
        //webForm.CheckBox();
        //webForm.SendOrder();


    }



    @AfterSuite
    public static void cleanUp(){
        //driver.manage().deleteAllCookies();


    }
}
