package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends PageObjectBase {

    public void Navigate(){
        Driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Driver.manage().window().maximize();
    }

    @FindBy(how = How.ID, using = "email")
    private WebElement txtUserName;

    public void EnterUserName(String userName){
        txtUserName.sendKeys(userName);
    }

    @FindBy(how = How.ID, using = "passwd")
    private WebElement txtPassword;

    public void EnterPassword(String password){
        txtPassword.sendKeys(password);
    }

    @FindBy(how = How.ID, using = "SubmitLogin")
    private WebElement btnSubmitLogin;

    public void SubmitLogin(){
        btnSubmitLogin.click();
    }

    public MyAccountPage SignIn(String userName, String password){
        EnterUserName(userName);
        EnterPassword(password);
        SubmitLogin();
        return new MyAccountPage();
    }

}
