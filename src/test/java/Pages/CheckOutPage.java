package Pages;

import StepDef.D01.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {

    public static WebDriver driver = Hooks.driver;


    public WebElement product_Name()
    {
        return driver.findElement(By.className("inventory_item_name"));

    }


    public WebElement payment_Information()
    {
        return driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[2]"));

    }

    public WebElement shipping_Information()
    {
        return driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[4]"));
    }

    public WebElement price_Total()
    {
        return driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]"));
    }

    public WebElement price_Total2()
    {
        return driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]"));
    }

    public WebElement Total()
    {
        return driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]"));
    }


    public WebElement Finish()
    {
        return driver.findElement(By.id("finish"));
    }

    public WebElement successMessage_Label()
    {
        return driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
    }









}
