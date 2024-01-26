package com.qa.waaw.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

   static  WebDriver driver;
   static Properties prop;
    public BaseClass() throws IOException {
        try {
            FileInputStream fip = new FileInputStream("C:\\Users\\poona\\ISP-Automation\\WaaW_Framework\\src\\main\\java\\com\\qa\\waaw\\Config\\config.properties");
            prop = new Properties();
            prop.load(fip);
        }
        catch (FileNotFoundException e)
        {
e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public  void  initializeBrowser()
    {
        String browserName=prop.getProperty("browser");
        switch(browserName) {
        case ("chrome"):
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
        case("firefox"):
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        break;
            case ("edge"):
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
    }

    driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }
}
