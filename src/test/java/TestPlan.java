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

        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);


    }


    @Test(testName = "Footlocker")
    public static void submitEinsatz() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:");
        ChromeDriver driver = new ChromeDriver();

        driver.get(Utils.FL_URL);
        WebForm webForm = new WebForm(driver);
        webForm.SelecSize();
        webForm.AddToCart();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webForm.Comprar();
    }

    @Test(testName = "Supreme")
    public static void SupremeBot(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "localhost:");
        ChromeDriver driver = new ChromeDriver();


        driver.get(Utils.SUP_URL);
        WebForm webForm = new WebForm(driver);
        webForm.SelectProduct();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        webForm.AddProduct();
        webForm.BuyProduct();

        //wait for pay page to load
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        //Autofill
        webForm.enterName();
        webForm.enterEmail();
        webForm.enterPhone();
        webForm.enterStreet();
        webForm.enterCity();
        webForm.enterZip();
        webForm.enterCountry();
        webForm.enterCardNr();
        webForm.enterCardMonth();
        webForm.enterCardYear();
        webForm.enterCardCode();
        webForm.AcceptAGBS();
        webForm.ConfirmPurchase();


        // driver.close();

    }


    @AfterSuite
    public static void cleanUp(){

        ChromeDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

    }
}
