package testscript;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibraries.baseClass;
@Listeners(genericlibraries.ListenersImplimation.class)



public class Tc1Test extends baseClass{
	@Test
public void createContactWithMandField() {
		Random random=new Random();
				
		int randomNum=random.nextInt(100);
		
		home.getContacLink().click();
		
		contact.getCreatecontactlink().click();
		
		String LastName="bv"+randomNum;
		contact.getLastname().sendKeys(LastName);
		
		contact.getSavebutton().click();
	}

	
}
