import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class WebForm extends PageObject {


    // FOOTLOCKER!!!
    //------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//span[contains(.,'41')]")
    private WebElement Size;
    @FindBy(xpath = "//form/ul/li[3]/button")
    private WebElement AddToCart;
    @FindBy(xpath = "//a[contains(text(),'Warenkorb ansehen')]")
    private WebElement Comprar;


    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void SelecSize(){ this.Size.click(); }
    public void AddToCart(){
        this.AddToCart.click();
    }
    public void Comprar() { this.Comprar.click();}





    //SUPREME
    //------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//img[@alt=' gupy cwrtc']")
    private WebElement Product;
    @FindBy(xpath = "//fieldset[@id='add-remove-buttons']/input")
    private WebElement AddToCarro;
    @FindBy(xpath = "//a[contains(@href, 'https://www.supremenewyork.com/checkout')]")
    private WebElement Buy;

    // Shipping and Card Info

    private final String NAME = "Juan Pablo";
    private final String EMAIL = "juanjo@idk.com";
    private final String PHONE = "01010101010";
    private final String STREET = "Satoshi Str. 0";
    private final String CITY = "Atlantis";
    private final String ZIP = "34543";
    private final String COUNTRY = "ITALY";
    private final String CARDNR = "123456789098765";
    private final String CARDMONTH = "01";
    private final String CARDYEAR = "2026";
    private final String CARDCODE = "000";

    @FindBy (xpath = "//input[@id='order_billing_name']")
    private WebElement Name;
    @FindBy (xpath = "//input[@id='order_email']")
    private WebElement Email;
    @FindBy (xpath = "//input[@id='order_tel']")
    private WebElement Phone;
    @FindBy (xpath = "//input[@id='bo']")
    private WebElement Street;
    @FindBy (xpath = "//input[@id='order_billing_city']")
    private WebElement City;
    @FindBy (xpath = "//input[@id='order_billing_zip']")
    private WebElement Zip;
    @FindBy (xpath = "//select[@id='order_billing_country']")
    private WebElement Country;
    @FindBy (xpath = "//input[@id='cnb']")
    private WebElement CardNr;
    @FindBy (xpath = "//select[@id='credit_card_month']")
    private WebElement CardMonth;
    @FindBy (xpath = "//select[@id='credit_card_year']")
    private WebElement CardYear;
    @FindBy (xpath = "//input[@id='vval']")
    private WebElement CardCode;
    @FindBy (xpath = "//div[@id='cart-cc']/fieldset/p/label/div/ins")
    private WebElement AGBS;
    @FindBy (xpath = "//input[@name='commit']")
    private WebElement Confirm;


    public void SelectProduct(){this.Product.click();}
    public void AddProduct(){this.AddToCarro.click();}
    public void BuyProduct(){this.Buy.click();}

    //Autofill

    public void enterName(){this.Name.sendKeys(NAME);}
    public void enterEmail(){this.Email.sendKeys(EMAIL);}
    public void enterPhone(){this.Phone.sendKeys(PHONE);}
    public void enterStreet(){this.Street.sendKeys(STREET);}
    public void enterCity(){this.City.sendKeys(CITY);}
    public void enterZip(){this.Zip.sendKeys(ZIP);}
    public void enterCountry(){this.Country.sendKeys(COUNTRY);}
    public void enterCardNr(){this.CardNr.sendKeys(CARDNR);}
    public void enterCardMonth(){this.CardMonth.sendKeys(CARDMONTH);}
    public void enterCardYear(){this.CardYear.sendKeys(CARDYEAR);}
    public void enterCardCode(){this.CardCode.sendKeys(CARDCODE);}
    public void AcceptAGBS(){this.AGBS.click();}
    public void ConfirmPurchase(){this.Confirm.click();}


}
