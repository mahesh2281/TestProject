package webautoexercise;

import PageObjects.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyAccountSteps {
    private MyAccountPage myAccountPage = new MyAccountPage();
    private PersonalInformationPage personInfoPage;
    private PersonalInfoSavedSuccessPage personalInfoSavedSuccessPage;
    private Header header = new Header();
    private DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    private Date dateObj = new Date();

    @And("^I am on the my personal information page$")
    public void iAmOnTheMyPersonalInformationPage() throws Throwable {
        personInfoPage = myAccountPage.ViewPersonalInfoPage();
    }

    @When("^I update my first name to \"([^\"]*)\"$")
    public void iUpdateMyFirstNameTo(String firstName) throws Throwable {
        personalInfoSavedSuccessPage = personInfoPage.EnterFirstName(firstName)
                .EnterOldPassword(TestBase.Password)
                .SavePersonInfo();
    }

    @Then("^the my personal information has been updated successfully$")
    public void theMyPersonalInformationHasBeenUpdatedSuccessfully() throws Throwable {
        Assert.assertTrue(personalInfoSavedSuccessPage.IsSuccessMessageDisplayed());
    }

    @Then("^the item is displayed in order history$")
    public void the_item_is_displayed_in_order_history() throws Exception {
        myAccountPage = header.GoToMyAccount();
        OrderHistoryPage orderHistoryPage = myAccountPage.ViewOrderHistory();
        Assert.assertEquals(PurchaseOrderSteps.orderReference, orderHistoryPage.GetOrderReferenceOfFirstRow());
        Assert.assertEquals(df.format(dateObj), orderHistoryPage.GetOrderDateOfFirstRow());
        Assert.assertEquals(PurchaseOrderSteps.orderTotal, orderHistoryPage.GetOrderTotalOfFirstRow());
        Assert.assertEquals("Bank wire", orderHistoryPage.GetPaymentMethodOfFirstRow());
    }
}
