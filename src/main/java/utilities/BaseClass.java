

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static String browser = "edgedriver";
	public static WebDriver driver;

	public static void main(String[] args) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equals("edgedriver")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			
			}
		
		driver.get("https://staging.waaw.ca/");
		
			

		
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

   