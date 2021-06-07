package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header extends PageObjectBase {

    @FindBy(how = How.CSS, using = "a[title='View my customer account']")
    private WebElement btnViewMyAccount;

    public MyAccountPage GoToMyAccount(){
        btnViewMyAccount.click();
        return new MyAccountPage();
    }
}
