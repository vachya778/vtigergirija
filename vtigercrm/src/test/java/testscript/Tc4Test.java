package testscript;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibraries.baseClass;
@Listeners(genericlibraries.ListenersImplimation.class)

public class Tc4Test extends baseClass {
	@Test
	public void createOrganizationWithTypeAndIndustry() {
		Random random=new Random();
		int randomNum=random.nextInt(100);
		home.getOrganizationLink().click();
		
		createOrganization.getCreateOrganizationTF().click();
		
		String organizationName="LIC"+randomNum;
		createOrganization.getOrganizationNameTF().sendKeys(organizationName);
		
		web.selectReference(createOrganization.getIdustryname()).selectByValue("Banking");
		web.selectReference(createOrganization.getAccountTypeName()).selectByValue("Customer");

		createOrganization.getSavebutton();
	}

}
