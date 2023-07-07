
package genericlibraries;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomclass.ContactPage;
import pomclass.CreateOrganizationPage;
import pomclass.HomePage;
import pomclass.LeadPage;
import pomclass.LoginPage;

public class baseClass {
	public static WebDriver driver;
	public HomePage home;
	public propertiesUtility property;
	public ExcelUtility excel;
	public LeadPage lead;
	public ContactPage contact;
	public CreateOrganizationPage createOrganization;
	public LoginPage login;
	public WebDriverUtility web;
	
        
	propertiesUtility ppt=new propertiesUtility();	
	//WebDriverUtility utility=new WebDriverUtility();
	@BeforeClass(alwaysRun=true)
	public void LanchingBrowser() throws IOException {
		//later delete 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reddy\\eclipse-workspace\\vtigercrm\\chromedriverfiles\\chromedriver.exe");

		web = new WebDriverUtility();
		property = new propertiesUtility();
		WebDriverManager.chromedriver().setup();
		if(property.readingDataFromProprtyFile("browser").equalsIgnoreCase("chrome"))
		       driver=new ChromeDriver();
		       else
			driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get(property.readingDataFromProprtyFile("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}

	
@AfterMethod
public void checkTheTestResult(ITestResult result) {
	
	/*if(result.getStatus()==result.FAILURE) {
		
		String path=utility.takingScreenshot(result.getTestName());
		
	}*/
	
}
@BeforeClass(alwaysRun=true)
public void navigateingToApplication() throws IOException  {
	
	contact=new ContactPage(driver);
	home=new HomePage(driver);
	createOrganization = new CreateOrganizationPage(driver);
	lead = new LeadPage(driver);
	login = new LoginPage(driver);
		login.getUsername().sendKeys(property.readingDataFromProprtyFile("username"));
	login.getUserpassword().sendKeys(property.readingDataFromProprtyFile("password"));
	login.getLoginbutton().click();
}

@AfterSuite(alwaysRun=true)
public void teardownTheBrowser() {
	driver.quit();
	
}
	
	
	
	
	
	
	
	
	

}
