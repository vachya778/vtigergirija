package dataProvider;

import org.testng.annotations.DataProvider;

public class DataprovideClasss {
	@DataProvider(name="ur name")
	public Object[]demo(){
		Object[]s= {"demo","sample","manual","sql",};
		return s;

	}
}
