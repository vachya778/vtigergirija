package genericlibraries;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class AnnotationsClass  extends baseClass {
	@Test
	public void loginWithValidCredentials() throws InterruptedException {
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.id("username")).sendKeys("hello@123");
    driver.findElement(By.id("loginForm")).sendKeys("demo@123");
    driver.findElement(By.className("keepLoggedIn")).click();
    Thread.sleep(2000);
	}
	@Test
	public void loginWithValidCredentials1() throws InterruptedException {
    driver.get("https://demo.actitime.com/login.do");
    driver.findElement(By.id("username")).sendKeys("@#%^^#@");
    driver.findElement(By.id("loginForm")).sendKeys("@%@@^$^");
    driver.findElement(By.className("keepLoggedIn")).click();
    Thread.sleep(2000);
	}

		
}


