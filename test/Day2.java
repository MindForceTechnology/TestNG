package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@AfterTest
	public void account()
	{
		System.out.println("Account created");
	}
	@Test(groups= {"smoke"})
	public void loan()
	{
		System.out.println("good");
	}
	@BeforeTest
	public void login()
	{
		System.out.println("login will be created");
	}

}
