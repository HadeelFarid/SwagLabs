package StepDef.D01;

import Pages.AddToCartPage;
import Pages.CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class D03_CheckOutStepDef {


    SoftAssert soft = new SoftAssert();

    WebDriver driver ;

    AddToCartPage addToCartPage = new AddToCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();



@Given("user click on checkout Button")
    public void UserClickOnCheckButton() throws InterruptedException
{
    Thread.sleep(5000);
    addToCartPage.checkout_Button().click();
}



    @When("user fill in firstname")
    public void userFillInFirstname() throws InterruptedException {
        Thread.sleep(5000);
        addToCartPage.firstname_TextBox().sendKeys("Hadeel");
    }



    @And("user fill in lastname")
    public void userFillInLastname() throws InterruptedException {
        Thread.sleep(5000);
        addToCartPage.lastname_TextBox().sendKeys("Farid");

    }


    @And("user fill in  postal code")
    public void userFillInPostalCode() throws InterruptedException {
        Thread.sleep(5000);

        addToCartPage.postalCode_TextBox().sendKeys("53726");
    }



    @Then("user click on continue Button")
    public void userClickOnContinueButton() throws InterruptedException {
        Thread.sleep(5000);

        addToCartPage.Continue_Button().click();
    }


   @Given("user check the Product name")
    public void userCheckTheProductName() throws InterruptedException
    {
        Thread.sleep(5000);
        checkOutPage.product_Name().getText();

    }


    @When("user check the Payment Information")
    public void userCheckThePaymentInformation() throws InterruptedException
    {
        Thread.sleep(5000);

        checkOutPage.payment_Information().getText();
    }

    @And("user check the Shipping Information")
    public void userCheckTheShippingInformation() throws InterruptedException

    {
        Thread.sleep(5000);
        checkOutPage.shipping_Information().getText();


    }

    @And("user check the Price Total")
    public void userCheckThePriceTotal() throws InterruptedException

    {
        Thread.sleep(5000);
        checkOutPage.price_Total().getText();
        checkOutPage.price_Total2().getText();

    }

    @And("user check the Total")
    public void userCheckTheTotal() throws InterruptedException

    {
        Thread.sleep(5000);
        checkOutPage.Total().getText();

    }

    @And("user click on Finish Button")
    public void userClickOnFinishButton() throws InterruptedException

    {
        Thread.sleep(5000);
        checkOutPage.Finish().click();

    }

    @Then("A success message should be displayed {string}")
    public void aSuccessMessageShouldBeDisplayed(String arg0) throws InterruptedException
    {
        Thread.sleep(5000);
        checkOutPage.successMessage_Label().getText();
        soft.assertTrue(checkOutPage.successMessage_Label().isDisplayed());
        Label successMessage = new Label();
        String actualMessage = successMessage.getText();

        soft.assertTrue(checkOutPage.successMessage_Label().getText().contains("Thank you for your order!"));

        soft.assertEquals(checkOutPage.successMessage_Label().getText(),"Thank you for your order!","Thank you for your order!");


    }
}

