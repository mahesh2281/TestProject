package webautoexercise;

import PageObjects.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class PurchaseOrderSteps {
    private LoginPage loginPage = new LoginPage();
    private MyAccountPage myAccountPage;
    private ShoppingCartPopup shoppingCartPopup;
    private ShoppingCartOrderConfirmationPage shoppingCartOrderConfirmationPage;
    public static String orderReference;
    public static String orderTotal;

    @Given("^I have signed in$")
    public void i_have_signed_in() throws Exception {
        loginPage.Navigate();
        myAccountPage = loginPage.SignIn(TestBase.UserName, TestBase.Password);
    }

    @Given("^I have added a t-shirt to my shopping cart$")
    public void i_have_added_a_t_shirt_to_my_shopping_cart() throws Exception {
        TShirtsPage tShirtsPage = myAccountPage.GoToTShirtsSection();
        tShirtsPage.ViewProductsAsList();
        shoppingCartPopup = tShirtsPage.AddItemToCart();
    }

    @When("^I confirm payment for my order$")
    public void i_confirm_payment_for_my_order() throws Exception {
        ShoppingCartSummaryPage shoppingCartSummaryPage = shoppingCartPopup.ProceedToCheckout();
        ShoppingCartAddressesPage shoppingCartAddressesPage = shoppingCartSummaryPage.ProceedToCheckoutWhenSignedIn();
        ShoppingCartShippingPage shoppingCartShippingPage = shoppingCartAddressesPage.ProceedToCheckout();
        ShoppingCartPaymentMethodPage shoppingCartPaymentMethodPage = shoppingCartShippingPage.SelectTermsOfService().ProceedToCheckout();
        orderTotal = shoppingCartPaymentMethodPage.GetOrderTotal();
        ShoppingCartOrderSummaryPage shoppingCartOrderSummaryPage = shoppingCartPaymentMethodPage.SelectPayByBankWire();
        shoppingCartOrderConfirmationPage = shoppingCartOrderSummaryPage.ConfirmMyOrder();
    }

    @Then("^the purchase is successful$")
    public void the_purchase_is_successful() throws Exception {
        Assert.assertEquals("ORDER CONFIRMATION", shoppingCartOrderConfirmationPage.GetPageHeadingText().toUpperCase());
        orderReference = shoppingCartOrderConfirmationPage.GetOrderReference();
        Assert.assertNotNull(orderReference);
    }

}