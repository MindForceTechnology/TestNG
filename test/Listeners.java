package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListners interface which implements the testng listeners
public class Listeners  implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("i succesfully exceuted the code");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("i failed executing the code" +result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}
