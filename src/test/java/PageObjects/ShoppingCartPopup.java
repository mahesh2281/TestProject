package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPopup extends PageObjectBase {

    By shoppingCartSectionIdentifier = By.className("layer_cart_cart");

    @FindBy(how = How.CLASS_NAME, using = "layer_cart_cart")
    private WebElement shoppingCartSection;

    private WebElement btnProceedToCheckout(){
        WebElement btnContainer = shoppingCartSection.findElement(By.className("button-container"));
        return btnContainer.findElement(By.tagName("a"));
    }

    public ShoppingCartSummaryPage ProceedToCheckout(){
        btnProceedToCheckout().click();
        return new ShoppingCartSummaryPage();
    }
}
