package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.TestBase;


public class TestNgListener extends TestBase implements ITestListener {
         
	Logger log = Logger.getLogger(ITestListener.class);
	
	//this configuration works in txt.xml file
	
	@Override
	public void onTestStart(ITestResult result) {
		
	    log.info("Test is started:"+result.getName());
	  }

	@Override
	public void onTestSuccess(ITestResult result) {
		
		log.info("Test is success:"+result.getName());
	  }
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String filename = result.getName();
		log.info("Test is failed:"+result.getName());
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("screenshots",filename +".png");
		
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onStart(ITestContext context) {
	    
     log.info("Test is start running:"+context.getName());
	  }


	 @Override
	 public void onFinish(ITestContext context) {
		  
		 log.info("Test is finished:"+context.getName());
		  }
}
