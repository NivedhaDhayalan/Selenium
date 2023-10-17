package ListenersTestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public  class TestNgListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("*****TestStarted*****"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("*****TestSuccess*****"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("*****TestFailed*****"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("*****TestSkipped*****"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*****onTestFailedButWithinSuccessPercentage*****"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("*****onTestFailedWithTimeout*****"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("*****Testfinished*****"+context.getName());
	}

		
	}

