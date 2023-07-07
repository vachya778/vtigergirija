package testscript;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibraries.baseClass;
@Listeners(genericlibraries.ListenersImplimation.class)

public class Tc7Test extends baseClass {
	@Test
	public void deleteExistinglead() {
		Random random=new Random();
		int randomNum=random.nextInt(100);
		home.getLeadsLink().click();
		
		lead.getCreateLeadButton().click();
		
		String LastName="Bv"+randomNum;
		lead.getLastnameTF().sendKeys(LastName);
		
		String company="Tcs"+randomNum;
		lead.getCompanynameTF().sendKeys(company);

	lead.getSavebutton().click();
	lead.getDeletebutton().click();
		
	}
	}
