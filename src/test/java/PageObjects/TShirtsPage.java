package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TShirtsPage extends PageObjectBase {

    @FindBy(how = How.CLASS_NAME, using = "icon-th-list")
    private WebElement linkProductListView;

    public void ViewProductsAsList(){
        linkProductListView.click();
    }

    @FindBy(how = How.CLASS_NAME, using = "ajax_add_to_cart_button")
    private WebElement linkAddToCart;

    public ShoppingCartPopup AddItemToCart(){
        linkAddToCart.click();
        ShoppingCartPopup popup = new ShoppingCartPopup();
        WaitUnitlElementIsVisibleByLocator(popup.shoppingCartSectionIdentifier);
        return popup;
    }
}
