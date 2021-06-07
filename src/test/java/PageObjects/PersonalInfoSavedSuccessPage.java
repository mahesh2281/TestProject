package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalInfoSavedSuccessPage extends PageObjectBase {

    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    private WebElement alertSuccessMessage;

    public boolean IsSuccessMessageDisplayed(){
        return alertSuccessMessage.isDisplayed();
    }
}
