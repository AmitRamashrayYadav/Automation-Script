package com.ecommerceScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class checkOutPage extends BaseClass {

    public checkOutPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@class='input-text qty']")
    WebElement checkOutQuantity;

    @FindBy(css=".button.btn-update")
    WebElement updateButton;

    @FindBy(xpath = "//td[@class='product-cart-actions']//ul/li/a")
    WebElement edit;
    @FindBy(css = "#bundle-option-17-qty-input")
    WebElement editMemoryQuantity;
    @FindBy(xpath = "//button[@title='Update Cart']")
    WebElement updateCart;
    @FindBy(css="#country")
    WebElement countryDropDown;

    @FindBy(css="#region")
    WebElement region;
    @FindBy(css="#postcode")
    WebElement zip;
    @FindBy(xpath = "//button[@title='Estimate']")
    WebElement estimate;
    @FindBy(css="#s_method_freeshipping_freeshipping")
    WebElement freeShipping;
    @FindBy(xpath = "//button[@title='Update Total']")
    WebElement updateTotal;
    @FindBy(xpath = "//*[@class='checkout-types top']//*[@class='button btn-proceed-checkout btn-checkout']")
    WebElement checkout;
    public void checkOutQuantityMethod(String checkOutQuantityValue) throws InterruptedException {
        checkOutQuantity.sendKeys(Keys.ARROW_RIGHT);
        checkOutQuantity.sendKeys(Keys.BACK_SPACE);
        checkOutQuantity.sendKeys(checkOutQuantityValue);
        //update button
        updateButton.click();
        Thread.sleep(2000);

    }
    public void editMethod() throws InterruptedException {
        Thread.sleep(2000);
        edit.click();
    }
    public void editWarrantyTennure(String editWarrantytennureValue) throws InterruptedException {
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editMemoryQuantity);
        editMemoryQuantity.sendKeys(Keys.ARROW_RIGHT);
        editMemoryQuantity.sendKeys(Keys.BACK_SPACE);
        editMemoryQuantity.sendKeys(editWarrantytennureValue);
    }
    public void updatingCart() throws InterruptedException {
        Thread.sleep(2000);
        updateCart.click();
    }
    public void countryDropDownMethod(String countryDropddownValue)
    {
        countryDropDown.click();
        countryDropDown.sendKeys(countryDropddownValue);
        Select select = new Select(countryDropDown);
        select.selectByValue("IN");
    }
    public void regionMethod(String regionValueText)
    {
        region.sendKeys(regionValueText);
    }
    public void postalCode(String zipcode)
    {
        zip.sendKeys(zipcode);
    }
    public void estimateButton()
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", estimate);
        estimate.click();
    }
    public void otherEstimateRates()
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", freeShipping);
        freeShipping.click();
    }
    public void updateTotalMethod() throws InterruptedException {
        updateTotal.click();
        Thread.sleep(1000);
    }
    public void checkOutButtonMethod()
    {
        checkout.click();
    }
}


