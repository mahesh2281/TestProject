package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage extends PageObjectBase {

    @FindBy(how = How.CSS, using = "a[title='Orders']")
    private WebElement btnOrderHistory;

    public OrderHistoryPage ViewOrderHistory(){
        btnOrderHistory.click();
        return new OrderHistoryPage();
    }

    @FindBy(how = How.CSS, using = "a[title='Information']")
    private WebElement btnPersonalInformation;

    public PersonalInformationPage ViewPersonalInfoPage(){
        btnPersonalInformation.click();
        return new PersonalInformationPage();
    }
}
