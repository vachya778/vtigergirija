package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverUtility extends baseClass {


/*
 * this method is used for drug and drop purpose
 */
public void dragAndDrop(WebElement src ,WebElement destination) {
	Actions action=new Actions(driver);

	action.dragAndDrop(src,destination).perform();
}
/*
 * this method is used t+o perform right click action
 */
public void rightClick() {
	Actions action=new Actions(driver);

	action.contextClick().perform();
}
/*
 * this method used for perform right click operations with parameters
 */
public void rightClick(WebElement element) {
	Actions action=new Actions(driver);

	action.contextClick(element).perform();
}
/*
 * this method used to perform double click on element
 */
public void doubleClick() {
	Actions action=new Actions(driver);

	action.doubleClick().perform();
}
/*
 * this method is used to double click with parameters
 */
public void doubleClick(WebElement element) {
	Actions action=new Actions(driver);

	action.doubleClick(element).perform();
}
/*
 * this method used to mouse hover
 */
public void moveToElement(WebElement element) {
	Actions action=new Actions(driver);

	action.moveToElement(element).perform();
}
/*
 * this method used for mouse hover on element with passing an parameter
 */
public void mouseHoverOnElement(WebElement element) {
	Actions action=new Actions(driver);

	action.contextClick().perform();
}
/*
 * return the Dropdown value
 */
public Select selectReference(WebElement dropdown) {
	Select select=new Select(dropdown);
	return select;
}
/*
 * this method is used to handling the dropdown
 * mainly for selectbyVisibleText method
 * &Selectby value method
 */
public void handlingDropDown(WebElement dropdown,String value) {
	Select select=new Select(dropdown);
	try {
		select.selectByVisibleText(value);
	}catch(Exception e) {
		select.selectByValue(value);
	}
}
/*
 * this method is used to handling the dropdown which is having
 * index value in dropdown
 */
public void handlingDropDown1(WebElement dropdown,int index) {
	Select select=new Select(dropdown);
	select.selectByIndex(index);
}
/*
 * scroll the webpage by using scrollBy
 * 
 */
public void scrollingAction(int x,int y) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
}
/**
 * single click by using javascript exeutor
 */
public void clickonElement(WebElement element) {
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("argument[0].click()",element);
}
/*
 * its act like sendkeys
 * basically used to send the data into filed
 */
public void enteringDataintoElement(String data,WebElement element) {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='"+data+"'",element);
}
/*
 * it's similar to clear
 * it's used to clear the text into filed
 */
public void clearingDataFromElement(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("argument[0].value=' '",element);
}
/*
 * it's used to switch control into frame by using integer
 */
public void switchingToFrame(int index) {
driver.switchTo().frame(index);
}
/*
 * it's used to switch control into frame by using element
 */
public void swicthingToFrame(WebElement element) {
	driver.switchTo().frame(element);
}
/*
 * it's used to switch control into frame by using string 
 */
public void switchingToFrame(String data) {
	driver.switchTo().frame(data);
}
/*
 * it's used to switch control to back to webpage(default page)
 * 
 */
public void switchingBackToMain() {
	driver.switchTo().defaultContent();
}
/*
 * switch the control into alertpopup&return the alert
 */
public Alert swicthToAlert() {
	Alert alert=driver.switchTo().alert();
	return alert;
}

//here i changed int into Ducation 
public WebDriverWait explicitWaitingsStatement(WebDriver driver,Duration longtime) {
	WebDriverWait wait=new WebDriverWait(driver,longtime);
	return wait;
}
/*
 * its used to change control into newpage or newtab
 */
public void switchToWindow(Set<String>allWindowID,String targetWindowTitile) {
	for(String id:allWindowID) {
		driver.switchTo().window(id);
		if(targetWindowTitile.equalsIgnoreCase(driver.getTitle())) {
			break;
		}
		}
	}
 public String takingScreenshot (String screenshotName) {
	 TakesScreenshot ss=(TakesScreenshot)driver;
			 File photo=ss.getScreenshotAs(OutputType.FILE); 
			 
			 
	 String idt=LocalDateTime.now().toString().replace(":","-");
	String path=System.getProperty("user.dir")+IAutoContantes.SSPATH+screenshotName+" "+idt+".png";
	 File destination=new File(path);
	 
	 try {
		 FileUtils.copyFile(photo, destination);
	 }catch(IOException e) {
		 e.printStackTrace();
	 }
	 return path;
	 }
	
}






			




 
	
	


 
 


