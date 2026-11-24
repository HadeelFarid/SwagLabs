package StepDef.D01;

import Pages.AddToCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class D02_AddProductToCartStepDef {

    SoftAssert soft = new SoftAssert();

    WebDriver driver ;

    AddToCartPage addToCartPage = new AddToCartPage();


@Given("user choose product1")
public void userChooseProduct1() throws InterruptedException
{
    Thread.sleep(5000);

    addToCartPage.product1_Title().click();

}

    @When("user click on Add to cart Button")
    public void userClickOnAddToCartButton() throws InterruptedException
    {
        Thread.sleep(5000);

        addToCartPage.addTo_Cart_Button().click();


    }



    @And("user click on cart Icon")
    public void userClickOnCartIcon() throws InterruptedException
    {
        Thread.sleep(5000);

        addToCartPage.cart_Icon().click();
    }




    @Then("the product should appear in the cart list")
    public void theProductShouldAppearInTheCartList()
    {

        soft.assertTrue(addToCartPage.product1_Title().isDisplayed());

        soft.assertTrue(addToCartPage.cart_Item_Name().isDisplayed(),"Product tittle is displayed");

        soft.assertEquals(addToCartPage.cart_Item_Name().getText(),addToCartPage.product1_Title().getText());

       soft.assertAll();
    }



}
