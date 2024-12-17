package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mobile {
	@BeforeTest
	public void mobileemi() {
		System.out.println("mobileemi-BeforeTest");
	}
	@Test 
public void mobilewarranty() {
	System.out.println("mobilewarranty-mobile");
}
	@BeforeClass
	public void mobileupdate() {
		System.out.println("mobileupdate-BeforeClass");
	}
	@Test
	public void mobilecase() {
		System.out.println("mobilecase");
		
	}
}

