package testscript;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibraries.baseClass;
@Listeners(genericlibraries.ListenersImplimation.class)

public class Tc2Test extends baseClass {
	

	@Test
	public void createOrganizationWithMandateryField() {
		Random random=new Random();
		int randomNum=random.nextInt(100);
		
		home.getOrganizationLink().click();
	createOrganization.getCreateOrganizationTF().click();
	
	String OrganizationName="IBM"+randomNum;
	createOrganization.getOrganizationNameTF().sendKeys(OrganizationName);
	
	createOrganization.getSavebutton();
		
		
		
	}

}
