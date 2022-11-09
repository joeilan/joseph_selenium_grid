package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid_Test {
	public static WebDriver driver;

	public static void main(String[]  args) throws MalformedURLException, InterruptedException{

 		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		String URL = "https://www.amazon.in";
 		String Node = "http://192.168.0.101:4444/wd/hub";
 		DesiredCapabilities capabilities = new DesiredCapabilities();
 		
 		
		capabilities.setBrowserName("chrome");
 				

 		driver = new RemoteWebDriver(new URL(Node), capabilities);

 		driver.navigate().to(URL);
 		Thread.sleep(5000);
 		driver.quit();
 	}		
}

