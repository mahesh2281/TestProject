package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPaymentMethodPage extends PageObjectBase {

    @FindBy(how = How.CLASS_NAME, using = "bankwire")
    private WebElement linkPayByBankWire;

    public ShoppingCartOrderSummaryPage SelectPayByBankWire(){
        linkPayByBankWire.click();
        return new ShoppingCartOrderSummaryPage();
    }

    @FindBy(how = How.ID, using = "total_price")
    private WebElement orderTotal;

    public String GetOrderTotal(){
        return orderTotal.getText();
    }
}
