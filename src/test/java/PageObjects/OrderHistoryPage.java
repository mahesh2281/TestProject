package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderHistoryPage extends PageObjectBase {

    @FindBy(how = How.TAG_NAME, using = "tbody")
    private WebElement tblBody;

    private WebElement GetFirstRow(){
        return tblBody.findElement(By.className("first_item"));
    }

    public String GetOrderReferenceOfFirstRow(){
        return GetFirstRow().findElement(By.className("history_link")).getText();
    }

    public String GetOrderDateOfFirstRow(){
        return GetFirstRow().findElement(By.className("history_date")).getText();
    }

    public String GetOrderTotalOfFirstRow(){
        return GetFirstRow().findElement(By.className("history_price")).getText();
    }

    public String GetPaymentMethodOfFirstRow(){
        return GetFirstRow().findElement(By.className("history_method")).getText();
    }
}
