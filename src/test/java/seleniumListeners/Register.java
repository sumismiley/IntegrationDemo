package seleniumListeners;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBase;

public class Register extends TestBase{

	Logger log = Logger.getLogger( Register.class);
	
	@Test
	public void register() {
		
		log.info("navigate to https://demo.automationtesting.in/Register.html");
		evd.get("https://demo.automationtesting.in/Register.html");
		
		log.info("enter first name");
		WebElement fName = evd.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		fName.clear();
		fName.sendKeys("sumi");
		
		log.info("enter last name");
		WebElement lName = evd.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lName.clear();
		lName.sendKeys("sumithra");
		
		log.info("enter address");
		WebElement adress = evd.findElement(By.xpath("//textarea"));
		adress.clear();
		adress.sendKeys("hyd");
		
		log.info("enter email");
		WebElement email = evd.findElement(By.xpath("//input[@type=\"email\"]"));
		email.clear();
		email.sendKeys("sumi.123@gmail.com");
		
		log.info("enter ph number");
		WebElement ph = evd.findElement(By.xpath("//input[@type=\"tel\"]"));
		ph.clear();
		ph.sendKeys("8765432190");
		
		log.info("click on male btn");
		WebElement gender = evd.findElement(By.xpath("//input[@value=\"Male\"]"));
		gender.click();
		
		log.info("click on hobby");
		WebElement hobby = evd.findElement(By.xpath("//input[@value=\"Cricket\"]"));
		hobby.click();
		
		

		
	}
}
