// Page URL: https://www.csgoroll.com/en/roll

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WebForm extends PageObject {

    private final String EINSATZ = ".05";

    //@FindBy (id = "mat-input-0")
    //private WebElement input;

    // FOOTLOCKER!!!
    @FindBy(xpath = "//span[contains(.,'41')]")
    private WebElement Size;
    @FindBy(xpath = "//form/ul/li[3]/button")
    private WebElement AddToCart;
    @FindBy(xpath = "//a[contains(text(),'Warenkorb ansehen')]")
    private WebElement Comprar;

    //@FindBy(xpath = "//label[contains(.,'Ja, ich akzeptiere die Allgemeinen Geschäftsbedingungen und bestätige, dass ich die Foot Locker Datenschutzbestimmungen gelesen und verstanden habe.*')]")
    //private WebElement CheckBox;

    //@FindBy(xpath = "//button[@name='sendOrder']")
    //private WebElement SendOrder;



    public WebForm(WebDriver driver) {
        super(driver);
    }

    //public void enterEinsatz(){
       // this.input.sendKeys(EINSATZ);
    //}

    public void SelecSize(){
        this.Size.click();
    }

    public void AddToCart(){
        this.AddToCart.click();
    }

    public void Comprar() { this.Comprar.click();}

    //public void CheckBox() { this.CheckBox.click();}

    //public void SendOrder(){ this.SendOrder.click();}
}
