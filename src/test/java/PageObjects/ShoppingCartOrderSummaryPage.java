package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartOrderSummaryPage extends PageObjectBase {

    @FindBy(how = How.ID, using = "cart_navigation")
    private WebElement cartNavigationSection;

    public ShoppingCartOrderConfirmationPage ConfirmMyOrder(){
        cartNavigationSection.findElement(By.cssSelector("button[type='submit']")).click();
        return new ShoppingCartOrderConfirmationPage();
    }
}
