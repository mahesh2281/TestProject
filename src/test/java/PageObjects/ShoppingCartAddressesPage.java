package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartAddressesPage extends PageObjectBase {

    @FindBy(how = How.CSS, using = "button[name='processAddress']")
    private WebElement btnProceedToCheckout;

    public ShoppingCartShippingPage ProceedToCheckout(){
        btnProceedToCheckout.click();
        return new ShoppingCartShippingPage();
    }
}
