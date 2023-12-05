package com.ecommerceScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseClass
{
    public LandingPage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#search")
    WebElement searchText;
    public void search(String productName)
    {
       searchText.sendKeys(productName);
       searchText.sendKeys(Keys.ENTER);
    }
}
