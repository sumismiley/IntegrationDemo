package base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import listeners.WebdriverListener;
import testNgListnerdemo.ListnerDemo;

public class TestBase {
     
	 protected Logger log = Logger.getLogger( TestBase.class);
	protected static WebDriver driver;
	public static EventFiringWebDriver evd ;
	WebdriverListener wdriver;
	
	@BeforeMethod
	public void setup() {
		
		    log.info("**********setup browser**********");
			System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		    driver = new ChromeDriver();
		    
		    //create instance of EventFiring WebDriver
		   evd = new EventFiringWebDriver(driver);
		    
		    //create instance of WebDriverListener
		     wdriver = new WebdriverListener();
		     
		   //register the listener
		     evd.register(wdriver);
		     
		     evd.manage().window().maximize();
		     evd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		  
			
	}
	
	@AfterMethod
	public void teardown() {
		log.info("***********close the browser************");
		driver.close();
	}
}
