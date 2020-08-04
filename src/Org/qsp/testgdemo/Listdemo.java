package Org.qsp.testgdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listdemo implements ITestListener
{

	@Override
	public void onTestStart(ITestResult context) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println();
		System.out.println();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println();
		System.out.println();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println();
		System.out.println();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println();
		System.out.println();
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println();
		System.out.println();
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getEndDate()+"FC");
		System.out.println(context.getPassedTests()+"FC");
		System.out.println(context.getFailedTests()+"FC");
		System.out.println(context.getSkippedTests()+"FC");

		
	}
	
	
	
	
	
}
