package com.ecommerceScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CameraPage extends BaseClass {
    public CameraPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#bundle-option-20")
    WebElement cameraDropdown;

    @FindBy(css = "#bundle-option-18")
    WebElement ddown;

    @FindBy(css = "#bundle-option-20-qty-input")
    WebElement cameraQuantity;

    @FindBy(css = "#bundle-option-18")
    WebElement caseName;

    @FindBy(css = "#bundle-option-18-qty-input")
    WebElement caseQuantity;

    @FindBy(css = "#bundle-option-19")
    WebElement memoryStorage;

    @FindBy(xpath = "//select[@id='bundle-option-19']/option[@value='80']")
    WebElement memoryType;

    @FindBy(css = "#bundle-option-19-qty-input")
    WebElement memoryQuantity;

    @FindBy(css = "#bundle-option-17")
    WebElement warranty;

    @FindBy(css = "#bundle-option-17-qty-input")
    WebElement warrantyTenure;

    @FindBy(xpath = "//div[@class='add-to-cart-buttons']")
    WebElement cartButton;

    public void cdown() throws InterruptedException {
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", caseName);
        cameraDropdown.click();
        Select select = new Select(cameraDropdown);
        select.selectByIndex(2);
    }
    public void camQuantity(String cameraQuantityValue) throws InterruptedException {
        cameraQuantity.click();
        Thread.sleep(2000);
       cameraQuantity.sendKeys(Keys.ARROW_RIGHT);
       cameraQuantity.sendKeys(Keys.BACK_SPACE);
       cameraQuantity.sendKeys(cameraQuantityValue);
    }
    public void caseMethod() throws InterruptedException {
        caseName.click();
        Select select = new Select(ddown);
        select.selectByIndex(1);
        Thread.sleep(2000);
        String dropvalue = select.getFirstSelectedOption().getText();
        System.out.println("Dropdown Value :"+dropvalue);
        //case quantity
      //  caseQuantity.click();
//        Thread.sleep(2000);
    }
    public void caseMethod1(String caseQuantityValue) throws InterruptedException {
        Thread.sleep(2000);
        caseQuantity.sendKeys(Keys.ARROW_RIGHT);
        caseQuantity.sendKeys(Keys.BACK_SPACE);
        caseQuantity.sendKeys(caseQuantityValue);
    }
    public void memorydropMethod(String memoryQuantityValue)
    {
        memoryStorage.click();
        Select select = new Select(memoryStorage);
        select.selectByIndex(1);
        //Quantity
        memoryQuantity.sendKeys(Keys.ARROW_RIGHT);
        memoryQuantity.sendKeys(Keys.BACK_SPACE);
        memoryQuantity.sendKeys(memoryQuantityValue);
    }
    public void warrantyMethod(String warrantyValue)
    {
        warranty.click();
        Select select = new Select(warranty);
        select.selectByIndex(2);
        //Quantity
        warrantyTenure.sendKeys(Keys.ARROW_RIGHT);
        warrantyTenure.sendKeys(Keys.BACK_SPACE);
        warrantyTenure.sendKeys(warrantyValue);
    }
    public void addingToCartMethod() throws InterruptedException {
        Thread.sleep(2000);
        cartButton.click();
    }
}






