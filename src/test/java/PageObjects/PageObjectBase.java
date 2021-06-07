package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webautoexercise.TestBase;

public abstract class PageObjectBase extends TestBase {

    PageObjectBase(){
        PageFactory.initElements(Driver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = "sf-menu")
    private WebElement topBarCategoryMenu;

    public TShirtsPage GoToTShirtsSection(){
        topBarCategoryMenu.findElement(By.cssSelector("li:last-child a[title='T-shirts']")).click();
        return new TShirtsPage();
    }

    protected void ClearAndSendKeys(WebElement textBox, String textToEnter){
        textBox.clear();
        textBox.sendKeys(textToEnter);
    }

    protected void WaitUnitlElementIsVisibleByLocator(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
