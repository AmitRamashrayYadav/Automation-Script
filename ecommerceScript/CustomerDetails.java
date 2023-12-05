package com.ecommerceScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerDetails extends BaseClass
{
    public CustomerDetails()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#onepage-guest-register-button")
    WebElement continueButton;
    @FindBy(xpath = "//input[@id='billing:firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='billing:middlename']")
    WebElement middleName;
    @FindBy(xpath = "//input[@id='billing:lastname']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='billing:company']")
    WebElement company;
    @FindBy(xpath = "//input[@id='billing:email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='billing:street1']")
    WebElement address;
    @FindBy(xpath = "//input[@id='billing:street2']")
    WebElement streetAddress;
    @FindBy(xpath = "//input[@id='billing:city']")
    WebElement city;
    @FindBy(xpath = "//select[@id='billing:region_id']")
    WebElement state;
    @FindBy(xpath = "//input[@id='billing:postcode']")
    WebElement postalCode;
    @FindBy(xpath = "//select[@id='billing:country_id']")
    WebElement country;
    @FindBy(xpath = "//input[@id='billing:telephone']")
    WebElement telephone;
    @FindBy(xpath = "//input[@id='billing:fax']")
    WebElement fax;
    @FindBy(xpath = "//div[@id='billing-buttons-container']//button[@title='Continue']")
    WebElement continueBtn;
    public void continueMethod()
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueButton);
        continueButton.click();
    }
    public void firstNameMethod(String firstNameValue)
    {
        firstName.sendKeys(firstNameValue);
    }
    public void middleNameMethod(String middleNameValue)
    {
        middleName.sendKeys(middleNameValue);
    }
    public void lastNameMethod(String lastNameValue)
    {
        lastName.sendKeys(lastNameValue);
    }
    public void companyMethod(String companyValue)
    {
        company.sendKeys(companyValue);
    }
    public void emailMethod(String emailValue)
    {
        email.sendKeys(emailValue);
    }
    public void addressMethod(String addressValue)
    {
        address.sendKeys(addressValue);
    }
    public void streetAddressMethod(String streetAddressValue)
    {
        streetAddress.sendKeys(streetAddressValue);
    }
    public void cityMethod(String cityValue)
    {
        city.sendKeys(cityValue);
    }
    public void stateMethod(String stateValue)
    {
        state.sendKeys(stateValue);
    }
    public void postalCodeMethod(String postalCodeValue)
    {
        postalCode.sendKeys(postalCodeValue);
    }
    public void countryMethod(String countryValue)
    {
        country.sendKeys(countryValue);
        Select select=new Select(country);
        select.selectByValue("IN");
    }
public void telephoneMethod(String telephoneValue)
{
    telephone.sendKeys(telephoneValue);
}
  public void faxMethod(String faxValue)
{
  fax.sendKeys(faxValue);
}
public void continueBtnMethod()
{
    continueBtn.click();
}
}
