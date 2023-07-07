package testscript;

import java.util.Random;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibraries.baseClass;
import pomclass.HomePage;
@Listeners(genericlibraries.ListenersImplimation.class)


public class Tc3Test extends baseClass{


	@Test

	public  void LeadDuplicate() throws InterruptedException {
		Random random=new Random();
		int randomNum= random.nextInt(100); 
				
		
				home.getLeadsLink().click();
				lead.getCreateLeadButton().click();
				
				String FirstName="Girija"+randomNum;
				lead.getFirstnameTF().sendKeys(FirstName);
				
				String LastName="Bv"+randomNum;
				lead.getLastnameTF().sendKeys(LastName);
				
				String company="Tcs"+randomNum;
				lead.getCompanynameTF().sendKeys(company);
				
				lead.getSavebutton().click();
				
				lead.getDuplicatebutton().click();
				
				lead.getSavebutton().click();
				
				lead.getDeletebutton().click();
				
				 driver.switchTo().alert().accept();
				 
				 Thread.sleep(2000);
				 
				 driver.navigate().refresh();
				 
				 WebElement CheckBox=driver.findElement(By.xpath("//a[contains(text(),'"+LastName+"')]/../..//input[@name='selected_id']"));
				CheckBox.click();
				lead.getDeleteLeadsbutton().click();
		
		
		driver.switchTo().alert().accept();
	}

}
