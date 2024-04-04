package log4jDemo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jTest {

	@Test
	public void login() {
		
		Logger log = Logger.getLogger(Log4jTest.class);
		
		System.out.println("****** start of the browser *****");
		
		log.info("setup browser ");
		log.info("open url ");
		log.info("navigate to login page ");
		log.info("enter username");
		log.info("enter password");
		log.info("click on login button ");
		log.info("verify login successful ");
		
		System.out.println("*****end of the browser*******");
	}
}
