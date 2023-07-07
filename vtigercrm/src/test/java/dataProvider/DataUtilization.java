package dataProvider;

import org.testng.annotations.Test;

public class DataUtilization {
	@Test(dataProvider="urname",dataProviderClass=Methods.class)
	public void  demo(String s) {
		System.out.println(s);
	}
	

}
