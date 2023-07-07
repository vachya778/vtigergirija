package createorganizationclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromepatchtestbyAkthar {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Reddy\\eclipse-workspace\\vtigercrm\\chromedriverfiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=girijja&rlz=1C1ONGR_enIN1033IN1033&oq=girijja&aqs=chrome..69i57.1454j0j7&sourceid=chrome&ie=UTF-8");
		
		
		
		
//		System.setProperty("webdriver.chrome.driver", "/Users/ssoosaimicheal/Mydocs/Projects/canaportal/softwares/drivers/chromedriver");
//		WebDriver options = new ChromeOptions();
//		options.addArguments("--diable--notifications");
//		WebDriverDetail webDriverDetail = new WebDriverDetail();
//		WebDriver webDriver = new ChromeDriver(options);
	}

}
