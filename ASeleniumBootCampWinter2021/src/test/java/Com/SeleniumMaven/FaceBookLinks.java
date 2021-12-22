package Com.SeleniumMaven;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class FaceBookLinks {
	public static WebDriver driver;
	 @BeforeTest
	  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\atdid\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com"); 
	  Thread.sleep(3000); 
	  }	 
		
      @Test
     public void findlinks() {
     List<WebElement> listoflinks  =driver.findElements(By.tagName("a"));
     System.out.println("Total of Links are:"+listoflinks.size() );
			 
	 for (int i=0;i<listoflinks.size();i++) {
	 System.out.println(listoflinks.get(i).getAttribute("href"));
	 }  
     }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
