package com.ecommerceScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends BaseClass
{
    String cameraName ="CAMERA TRAVEL SET";

         public ProductPage()
        {
            PageFactory.initElements(driver,this);
        }
        @FindBy(css =".product-name")
        List<WebElement> productList;

         @FindBy(id = "product-collection-image-445")
         WebElement button;
public void productMethod() throws InterruptedException {

    for(int i=0;i<productList.size()-1;i++)
    {
        System.out.println(productList);
        Thread.sleep(2000);
         String plist=productList.get(i).getText();
//        System.out.println("plist value are : "+plist);
//        System.out.println(cameraName);
//         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
         if(plist.equals(cameraName))
         {
             ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
             button.click();
             break;
         }else {
             System.out.println("hello");
         }
    }
}


    }

