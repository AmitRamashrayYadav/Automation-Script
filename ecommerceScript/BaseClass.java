package com.ecommerceScript;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass
{
    public static WebDriver driver;
    public  static Properties prop;
    //public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    @BeforeSuite
    public static void loadConfig( ) throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Neosoft\\IdeaProjects\\untitled\\src\\test\\java\\com\\ecommerceScript\\Config.Properties");
        prop.load(fis);
    }
    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
//    @AfterClass
//    public void tearDown()
//    {
//
//        driver.close();
//    }
}
