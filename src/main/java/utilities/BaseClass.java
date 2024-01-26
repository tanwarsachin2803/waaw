package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {

    public static WebDriver selectBrowser(String browserName){
        WebDriver driver;

        switch (browserName.toLowerCase()) {
            case "chrome":
                System.setProperty("webDriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chrome.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webDriver.gecko.driver", "path/to/geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            case "safari":
                driver = new SafariDriver();
                break;

            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserName);

        }
        return driver;

    }


}



    // total we are 10 guy, we are going to change in our local machine

    //method to select the browser


    //method to open that browser by using WebDriverManager

    // method to open the url of tht waaw project




    // git branch
    // git branch "branch_name"
    // git branch
    // git checkout "branch_name"


    // git add filenames
    // git commit -m "message_name"
    // create pr from ur git hub


