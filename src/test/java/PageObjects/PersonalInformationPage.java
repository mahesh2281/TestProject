package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PersonalInformationPage extends PageObjectBase {

    @FindBy(how = How.ID, using = "firstname")
    private WebElement txtFirstName;

    public PersonalInformationPage EnterFirstName(String firstName){
        ClearAndSendKeys(txtFirstName, firstName);
        return new PersonalInformationPage();
    }

    @FindBy(how = How.ID, using = "old_passwd")
    private WebElement txtOldPassword;

    public PersonalInformationPage EnterOldPassword(String oldPassword){
        ClearAndSendKeys(txtOldPassword, oldPassword);
        return new PersonalInformationPage();
    }

    @FindBy(how = How.CSS, using = "button[name='submitIdentity']")
    private WebElement btnSave;

    public PersonalInfoSavedSuccessPage SavePersonInfo(){
        btnSave.click();
        return new PersonalInfoSavedSuccessPage();
    }
}
