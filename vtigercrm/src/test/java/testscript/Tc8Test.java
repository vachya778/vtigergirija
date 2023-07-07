package testscript;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibraries.baseClass;
@Listeners(genericlibraries.ListenersImplimation.class)

public class Tc8Test extends baseClass {
	@Test
	public void newEvent() throws InterruptedException {
		Random random=new Random();
		
		int randomNum=random.nextInt(100);

		home.getQuickCreateDropdown().click();
		web.handlingDropDown(home.getQuickCreateDropdown(),"New Event");
		home.getSubjecttextfield().sendKeys("demo");
		
		web.enteringDataintoElement("2023-07-30",home.getDatestartTF());
		Thread.sleep(2000);
		
		web.enteringDataintoElement("2023-07-31",home.getEnddateTF());
		Thread.sleep(2000);
		
		home.getSavebutton().click();

	}

}
