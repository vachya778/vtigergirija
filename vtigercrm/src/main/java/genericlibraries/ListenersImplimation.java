package genericlibraries;

import java.io.IOException;

import org.openqa.selenium.remote.ProtocolHandshake.Result;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenersImplimation implements ITestListener {
	ExtentReports report=new ExtentReports();
	ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/suite.html");
	public static ExtentTest logger;
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		logger=report.createTest(result.getMethod().getMethodName());		
	}
			
	
	@Override
	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL,"This test is failed"+result.getMethod().getMethodName());
		try {
			logger.addScreenCaptureFromPath(ScreenShotUtility.takingScreenshot(result.getMethod().getMethodName()));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
				
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		logger.log(Status.SKIP,"This test is skiped"+result.getMethod().getMethodName());
		
	}
			
	
	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS,"This test is passed"+result.getMethod().getMethodName());
		
	}
	@Override
	public void onStart(ITestContext Contaxt) {
		report.attachReporter(reporter);
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	System.out.println("done");		
	}
}
