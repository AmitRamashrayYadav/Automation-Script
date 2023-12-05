package com.ecommerceScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingMethod extends BaseClass
{
    public ShippingMethod()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="#s_method_freeshipping_freeshipping")
    WebElement checkBox;
    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']//button[@class='button']")
    WebElement shippingContinue;
    public void shippingMethod() throws InterruptedException {
        Thread.sleep(2000);
        checkBox.click();
    }
    public void shippingContinueMethod()
    {
        shippingContinue.click();
    }

}
