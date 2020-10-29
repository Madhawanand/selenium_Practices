package TestNg;

import org.testng.annotations.Test;

public class loans 
{
	@Test
	public void personal_loan()
	{
		System.out.println("personal loan");
	}
	@Test(dependsOnMethods= {"personal_loan"})
	public void home_loan()
	{
		System.out.println("home loan ");
	}
	@Test(enabled=false)//used for skipping the test case
	public void mortgae_loan()
	{
		System.out.println("mortgaze loan");
	}

}
