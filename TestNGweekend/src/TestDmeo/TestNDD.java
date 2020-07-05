package TestDmeo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNDD 
{
	
	
	@Test
	public void welcomeTng()
	{
		System.out.println("welcome TestNG");
	}
	
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void AfterSuite1()
	{
		System.out.println("AfterSuite");
	}
	
	@BeforeTest
	public void BeforeTest1()
	{
		System.out.println("BeforeTest1");
	}

	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	
	@BeforeGroups
	public void BeforeGroups1()
	{
		System.out.println("BeforeGroups");
	}
	
	
	@AfterGroups
	public void AfterGroups1()
	{
		System.out.println("AfterGroups");
	}
	
	
	@BeforeClass
	public void BeforeClass1()
	{
		System.out.println("BeforeClass");
		
		
	}
		
	@AfterClass
	public void AfterClass1()
	{
			System.out.println("AfterClass");
	}
	
	@BeforeMethod
	public void BeforeMethod1()
	{
			System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod1()
	{
			System.out.println("AfterMethod");
	}
	

		
		
	}
	
	
	
	
	
	


