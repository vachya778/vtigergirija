package testscript;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibraries.baseClass;
@Listeners(genericlibraries.ListenersImplimation.class)

public class Tc6Test extends baseClass {
	
	@Test
	public void createContactDuplicate() {

		Random random=new Random();

		int randomNum=random.nextInt(100);
		
		home.getContacLink().click();
		contact.getCreatecontactlink().click();
		
		String LastName="bv"+randomNum;
		contact.getLastname().sendKeys(LastName);
       
		contact.getSavebutton().click();
		
		contact.getDuplicateButton().click();
	}
}
