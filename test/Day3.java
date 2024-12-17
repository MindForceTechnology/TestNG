package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeClass
	public void beforeclass()
	
	{
		System.out.println("before executing the methods");
	}
	@Test(groups= {"smoke"})
	
	public void weblogin()
	{
		System.out.println("weblogincar");
	}
	@BeforeMethod
	public void before()
	{
	System.out.println("I will exceute");	
	}
	@AfterMethod
	public void after()
	{
	System.out.println("I will exceute it and deleted");	
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after executing the class");
	}
	@Test
	public void Mobilelogin()
	{
		System.out.println("mobilelogin");
	
	}
	@Parameters({"URL"})
@Test
public void amazon(String urlname)
{
	System.out.println("added to shopping cart");
	System.out.println(urlname);
}
}
