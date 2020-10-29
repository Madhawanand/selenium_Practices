package TestNg;

import org.testng.annotations.Test;

public class Insurances
{
	@Test
	public void insurancePersonal()
		{
		System.out.println("personal insurance");
		}
	
	@Test
	public void insuranceVehicle()
	{
		System.out.println("vehicle insurance");
	}
	
	@Test
	public void insuranceHealth() 
	{
		System.out.println("Health insurance");
	}

}
