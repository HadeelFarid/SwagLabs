package Pages;

import StepDef.D01.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {

    public static WebDriver driver = Hooks.driver;



    public WebElement product1_Title()
    {
        return driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
    }



  public WebElement addTo_Cart_Button()
    {
        return driver.findElement(By.id("add-to-cart"));
    }


    public WebElement cart_Icon()
    {
        return driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
    }

    public WebElement cart_Item_Name()
    {
        return driver.findElement(By.className("inventory_item_name"));
    }

    public WebElement cart_Item_price()
    {
        return driver.findElement(By.className("inventory-item-price"));
    }



    public WebElement checkout_Button()
    {
        return driver.findElement(By.id("checkout"));
    }



    public WebElement firstname_TextBox()
    {
        return driver.findElement(By.id("first-name"));
    }


    public WebElement lastname_TextBox()
    {
        return driver.findElement(By.id("last-name"));
    }


    public WebElement postalCode_TextBox()
    {
        return driver.findElement(By.id("postal-code"));

    }


    public WebElement Continue_Button()
    {
        return driver.findElement(By.id("continue"));
    }









}
