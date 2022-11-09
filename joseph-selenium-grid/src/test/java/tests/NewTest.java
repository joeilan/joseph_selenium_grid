package tests;


	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.Assert;
	import org.testng.annotations.AfterTest;

	public class NewTest {
		public WebDriver driver;
	  @Test
	  public void f() throws MalformedURLException, InterruptedException {
	//	  driver.get("https://www.edureka.co/");
		//  String title = driver.getTitle();
	//	  Assert.assertTrue(title.contains("Instructor Led"));
		  
		
			String URL = "https://www.amazon.in";
	 		String Node = "http://192.168.62.202:4444/wd/hub";
	 		DesiredCapabilities capabilities = new DesiredCapabilities();
	 		
	 		
			capabilities.setBrowserName("chrome");
	 				

	 		driver = new RemoteWebDriver(new URL(Node), capabilities);

	 		driver.navigate().to(URL);
	 		Thread.sleep(5000);
	 		driver.quit();
		  
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		//  driver = new ChromeDriver();
		  

		  
	  }

	  @AfterTest
	  public void afterTest() {
	
	 	//	driver.quit();
	  }

	}


