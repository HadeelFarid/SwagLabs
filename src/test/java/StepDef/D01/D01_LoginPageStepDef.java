package StepDef.D01;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class D01_LoginPageStepDef {


LoginPage loginPage = new LoginPage();

WebDriver driver ;





    @Given("user enters valid username")
    public void userEntersValidUsername() throws InterruptedException
    {
        Thread.sleep(5000);
        loginPage.username_TextBox().sendKeys("standard_user");
    }



    @When("user  enters valid password")
    public void userEntersValidPassword() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.password_TextBox().sendKeys("secret_sauce");
    }


    @Then("user click on the login Button")
    public void userClickOnTheLoginButton() throws InterruptedException
    {
        Thread.sleep(5000);
        loginPage.login_Button().click();

    }



}
