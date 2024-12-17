package test;

import org.testng.annotations.Test;

public class Day4 {
	@Test 
	public void homeloan ()
	{
		System.out.println("Home loan will be debited");
	}
@Test (dependsOnMethods= {"signout"})
public void APIcarloan()
{
	System.out.println("APIcarloan");
}
@ Test(enabled=true)
public void signin()
{
	System.out.println("signin");
}
@Test(timeOut=4000)
public void signout()
{
	System.out.println("signout");
}
}
