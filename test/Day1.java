package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day1 {
	@AfterSuite
	public void bike()
	{
		System.out.println("bike account deleted");
	}
 @Test
	public void Demo()
	{	
System.out.println("hello");
Assert.assertTrue(false);
	}
 @BeforeSuite
 public void Bikeloan()
 {
	 System.out.println("bikeloan debited");
 }
 
@Test(dataProvider="getData") // insert the dataprovider in test
public void Demo1(String username,String password) // getdata contains two values
{
	System.out.println("bye");
	System.out.println(username);
	System.out.println(password);
}
@Test(groups= {"smoke"})
public void carloan()

{
	System.out.println("carloan");
	
	
}
// without writing three times we write only once to run test in thrice with three different data with the help of dataprovider
                     
@DataProvider
public Object[][] getData()        // to test multiple data with different combination in loan department
{
	// Three combination of test
	//1st combination = username  password - good credit history
    // 2nd = username password	- no credit history
	// 3rd - fraudelent credit history
	Object [][]data = new Object[3][2];  // 3 combination and 2 columns
	//1st set
	data[0][0]= "first username";
	data[0][1]= "first password";
	// 2 set
	data[1][0] = "second username";
	data[1][1] = "second password";
	// 3 set
	data[2][0]= "third username";
	data[2][1] = "third password";
	return data; // change return to object method by moving the cursor
	
}
}
