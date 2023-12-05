package com.ecommerceScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformation extends BaseClass
{
    public PaymentInformation()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@id='payment-buttons-container']/button[@class='button']")
    WebElement paymentInfoContinue;
    public void paymentinfoMethod() throws InterruptedException {
        Thread.sleep(2000);
        paymentInfoContinue.click();
    }
}
