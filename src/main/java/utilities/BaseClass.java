package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	//Test commit

    // total we are 10 guy, we are going to change in our local machine

    //method to select the browser
	public String initiateBrowser(String browserName) {
		switch(browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			break;
		default:
			System.out.println("choose correct browser name");			
		}
	}
			
	


    //method to open that browser by using WebDriverManager
	

    // method to open the url of tht waaw project
public void openUrl(String url) {
	driver.get(url);
}



    // git branch
    // git branch "branch_name"
    // git branch
    // git checkout "branch_name"


    // git add filenames
    // git commit -m "message_name"
    // create pr from ur git hub
}
