package com.ecommerceScript;

import org.testng.annotations.Test;

public class MainClass extends BaseClass {
    @Test
    public void mainMethod() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        //Landing page
        LandingPage lp = new LandingPage();
        lp.search(prop.getProperty("productName"));
        ProductPage p = new ProductPage();
        p.productMethod();
        //camerapage
        CameraPage c = new CameraPage();
        c.cdown();
        c.camQuantity(prop.getProperty("cameraQuantityValue"));
        c.caseMethod();
        c.caseMethod1(prop.getProperty("caseQuantityValue"));
        c.memorydropMethod(prop.getProperty("memoryQuantityValue"));
        c.warrantyMethod(prop.getProperty("warrantyValue"));
        c.addingToCartMethod();
        //checkout page
        checkOutPage ck  = new checkOutPage();
        ck.checkOutQuantityMethod(prop.getProperty("checkOutQuantityValue"));
        ck.editMethod();
        ck.editWarrantyTennure(prop.getProperty("editWarrantyTennureValue"));
        ck.updatingCart();
        ck.countryDropDownMethod(prop.getProperty("countryDropddownValue"));
        ck.regionMethod(prop.getProperty("regionValue"));
        ck.postalCode(prop.getProperty("zipValue"));
        ck.estimateButton();
        ck.otherEstimateRates();
        ck.updateTotalMethod();
        ck.checkOutButtonMethod();
        //customer details
        CustomerDetails cd = new CustomerDetails();
        cd.continueMethod();
        cd.firstNameMethod(prop.getProperty("firstNameValue"));
        cd.middleNameMethod(prop.getProperty("middleNameValue"));
        cd.lastNameMethod(prop.getProperty("lastNameValue"));
        cd.companyMethod(prop.getProperty("companyValue"));
        cd.emailMethod(prop.getProperty("emailValue"));
        cd.addressMethod(prop.getProperty("addressValue"));
        cd.streetAddressMethod(prop.getProperty("streetAddressValue"));
        cd.cityMethod(prop.getProperty("cityValue"));
        cd.stateMethod(prop.getProperty("stateValue"));
        cd.postalCodeMethod(prop.getProperty("postalCodeValue"));
        cd.countryMethod(prop.getProperty("countryValue"));
        cd.telephoneMethod(prop.getProperty("telephoneValue"));
        cd.faxMethod(prop.getProperty("faxValue"));
        cd.continueBtnMethod();
        //shipping
        ShippingMethod sm = new ShippingMethod();
        sm.shippingMethod();
        sm.shippingContinueMethod();
        //payment info
        PaymentInformation pi=new PaymentInformation();
        pi.paymentinfoMethod();
        //palce order
        orderPreview op = new orderPreview();
        op.placeorderMethod();






    }
}
