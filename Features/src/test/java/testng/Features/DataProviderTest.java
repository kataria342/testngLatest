package testng.Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider(name="testdata")
	public Object[][] data(){
		return new Object[][] {{"Pawan"}, {"Honey"}};
	}
	
	@Test(dataProvider = "testdata")
	public void printData(String name) {
		System.out.println("Name is : "+name);
	}
}
