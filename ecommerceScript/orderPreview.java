package com.ecommerceScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderPreview extends BaseClass
{
    public orderPreview()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css=".button.btn-checkout")
    WebElement placeOrder;
    public void placeorderMethod() throws InterruptedException {
        Thread.sleep(1000);
        placeOrder.click();
    }
}
