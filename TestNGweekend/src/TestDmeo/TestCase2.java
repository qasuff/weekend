package TestDmeo;

import org.testng.annotations.Test;

public class TestCase2 
{
	
	@Test(priority = 3)
	public void methodx()
	{
		
	System.out.println("methodx");
	}
	
	@Test(priority = 2)
	public void methody()
	{
		
		System.out.println("methody");
	}
	
	@Test(priority = 1)
	public void methodz()
	{
		System.out.println("methodz");
	
	}

}
