package Pages;

import StepDef.D01.Hooks;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {


    public static WebDriver driver = Hooks.driver;




    //locating Elements
    public WebElement username_TextBox()
    {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement password_TextBox()
    {
        return driver .findElement(By.id("password"));
    }

    public WebElement login_Button()
    {
        return driver .findElement(By.id("login-button"));
    }






}
