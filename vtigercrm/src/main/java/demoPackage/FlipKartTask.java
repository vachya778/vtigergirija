package demoPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverCreator;

public class FlipKartTask {
	public static WebDriver driver;
	public static void switchToChiledWindow(Set<String> allID,String ParentId) {
allID.remove(ParentId);
for(String id:allID) {
	driver.switchTo().window(id);
}
}
	public static void switchBackToParent(String parentId) {
		driver .switchTo().window(parentId);
		
	}
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/laptops/pr?sid=6bo,b5g&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_49d69c71-761f-4f49-852d-80babbc2b0d5_1_372UD5BXDFYS_MC");
		String ParentWindowId=driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()='Infinix X2 Slim Intel Core i3 11th Gen - (8 GB/256 GB SSD/Windows 11 Home) XL23 Thin and Light Laptop'])[2]"));
		switchToChiledWindow(driver.getWindowHandles(),ParentWindowId);
		
		driver.findElement(By.xpath("//button[text()= 'Add to cart']")).click();
		switchBackToParent(ParentWindowId);
		driver.findElement(By.xpath("//div[text()='HP 14s Intel Core i3 11th Gen - (8 GB/256 GB SSD/Windows 11 Home) 14s - dy2507TU Thin and Light Laptop']"));
		switchToChiledWindow(driver.getWindowHandles(),ParentWindowId);

		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();


		driver.findElement(By.xpath("//div[text()='HP 15s Intel Core i5 12th Gen - (8 GB/512 GB SSD/Windows 11 Home) 15s-fq5111TU Thin and Light Laptop']"));
		switchToChiledWindow(driver.getWindowHandles(),ParentWindowId);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		switchBackToParent(ParentWindowId);

		driver.findElement(By.xpath("//div[text()='HP 247 G8 Athlon Dual Core - (8 GB/1 TB HDD/Windows 11 Home) 247 G8 Notebook Notebook']"));
		switchToChiledWindow(driver.getWindowHandles(),ParentWindowId);
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

		

		
	}
}
