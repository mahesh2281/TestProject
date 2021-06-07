package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartSummaryPage extends PageObjectBase {

    @FindBy(how = How.CLASS_NAME, using = "standard-checkout")
    private WebElement btnProceedToCheckout;

    public ShoppingCartAddressesPage ProceedToCheckoutWhenSignedIn(){
        btnProceedToCheckout.click();
        return new ShoppingCartAddressesPage();
    }
}
