package genericlibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnnotationsClass2  extends baseClass{
	@Test
	public void loginWithValidCredentials() throws InterruptedException {
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.id("username")).sendKeys("+++++++");
    driver.findElement(By.id("loginForm")).sendKeys("******");
    driver.findElement(By.className("keepLoggedIn")).click();
    Thread.sleep(2000);
	}
	@Test
	public void loginWithValidCredentials1() throws InterruptedException {
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.id("username")).sendKeys("2222222222");
    driver.findElement(By.id("loginForm")).sendKeys("333333333");
    driver.findElement(By.className("keepLoggedIn")).click();
    Thread.sleep(2000);

}
}