package testNgListnerdemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class ListnerDemo extends TestBase {

	Logger log = Logger.getLogger(ListnerDemo.class);

	@Test
	public void login() {
		
		log.info("enter username");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		log.info("enter password");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		log.info("click on login btn");
		Assert.assertTrue(false);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
}
