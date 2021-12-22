package Com.SeleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowsers {
public static WebDriver driver;
	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\atdid\\eclipse-workspace\\ASeleniumBootCampWinter2021\\Drivers\\chromedriver.exe");	 
		driver=new ChromeDriver();*/
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\atdid\\eclipse-workspace\\ASeleniumBootCampWinter2021\\Drivers\\geckodriver.exe");	 
		driver=new FirefoxDriver();*/
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\atdid\\eclipse-workspace\\ASeleniumBootCampWinter2021\\Drivers\\msedgedriver.exe");	 
		driver=new EdgeDriver();
	}

}
