package test;

import org.testng.annotations.Test;

public class Day5 {


		@Test
		public void Homecarloan() {
			System.out.println("homeloan");
			
		}

		@Test
		public void amazoncarloan() {
			System.out.println("amazoncarloan");
			
		}

		@Test
		public void carloan() {
			System.out.println("carloan");
			
		}

		@Test(dependsOnMethods= {"Homecarloan"})
		public void xcarloan() {
			System.out.println("xacarloan");
			
		}

	}


