package testng.Features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	@Test
	@Parameters({"Pawan", "Kataria"})
	public void DataPrint(String Pawan,String Kataria) {
		System.out.println("Name is : "+Pawan+ " and "+Kataria);
	}

}
