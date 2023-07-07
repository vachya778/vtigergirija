package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportClass {
	@Test
	public void report() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver. manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	  driver.get("https://www.facebook.com/");
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File photo=ts.getScreenshotAs(OutputType.FILE);
	  String path=System.getProperty("user.dir")+"/Errorshot/demo99.png";
	  File file=new File(path);
	  FileUtils .copyFile(photo, file);
	  
	  ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/demo1.html");
	  ExtentReports report=new ExtentReports();
	  report.attachReporter(reporter);
	  
	  ExtentTest logger1=report.createTest("Testcase1");
	  
	  logger1.log(Status.FAIL,"this step is failed");
	  logger1.log(Status.INFO,"this step is INFO");
	  logger1.log(Status.PASS,"THIS STEP IS PASS");
	  logger1.log(Status.SKIP, "this step is skip");
	  logger1.addScreenCaptureFromPath(path);
	  
	  ExtentTest logger2=report.createTest("Testcase2");
	  
	  logger2.log(Status.FAIL,"this step is failed");
	  logger2.log(Status.INFO,"this step is INFO");
	  logger2.log(Status.PASS,"THIS STEP IS PASS");
	  logger2.log(Status.SKIP, "this step is skip");
	  logger2.addScreenCaptureFromPath(path);
	  

	  
	  report.flush();
	  
	  
	  
		
	}
	
	

}

