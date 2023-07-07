package testscript;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibraries.baseClass;
@Listeners(genericlibraries.ListenersImplimation.class)

public class Tc5Test extends baseClass {
	@Test
	public void leadWithMandatoryFiled() {
		Random random=new Random();
		int randomNum=random.nextInt(100);

		home.getLeadsLink().click();
		lead.getCreateLeadButton().click();

		String lastName="va"+randomNum;
		lead.getLastnameTF().sendKeys(lastName);
		
		String companyName="cong"+randomNum;
		lead.getCompanynameTF().sendKeys(companyName);
		
		lead.getSavebutton();
	}

}
