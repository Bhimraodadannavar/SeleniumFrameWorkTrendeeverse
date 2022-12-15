package com.trendeverse.genericUtility;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.IClassListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementationClass implements ITestListener
{
	private ExtentSparkReporter spark;
	private ExtentReports report;
	private ExtentTest test;

		

	@Override
	public void onStart(ITestContext result) {
		//System.out.println("on start"+Thread.currentThread().getId());
		spark= new ExtentSparkReporter("./extentReport/extentHtmlReport.html");
		spark.config().setDocumentTitle("Document Title Test Yantra");
		spark.config().setReportName("Testcase Execution Report");
		spark.config().setTheme(Theme.STANDARD);

		report= new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Operating System","Windows 10 ");
		report.setSystemInfo("Browser name ", "chrome");
		report.setSystemInfo("Browser version", "104");
		report.setSystemInfo("Reporter Name", "Bhimrao");


	}

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("on finish"+ Thread.currentThread().getId());
		report.flush();

	}

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("execution starts from here"+Thread.currentThread().getId());	
		 ExtentTest  test = report.createTest(result.getMethod().getMethodName());
		 ThreadSafe.setExtentTest(test); 
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("TestExecuted successfully"+Thread.currentThread().getId());
		ThreadSafe.getExtentTest().pass(result.getMethod().getMethodName()+"is passed ");

	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case fail"+Thread.currentThread().getId());
		ThreadSafe.getExtentTest().fail(result.getMethod().getMethodName()+"test case failed");
		ThreadSafe.getExtentTest().fail(result.getThrowable());//get the exception information

		//		test1.fail(result.getMethod().getMethodName()+"is failed");
		//		test1.fail(result.getThrowable());

		String screenShot = ThreadSafe.getwebdriverUtility().takesscreenshot2();
		ThreadSafe.getExtentTest().addScreenCaptureFromBase64String(screenShot,result.getMethod().getMethodName());


	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on skipped"+ Thread.currentThread().getId());
		ThreadSafe.getExtentTest().skip(result.getMethod().getMethodName()+"is skipped");
		ThreadSafe.getExtentTest().skip(result.getThrowable());

		String screenshot = null;

		try {
			screenshot = ThreadSafe.getwebdriverUtility().takesScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadSafe.getExtentTest().addScreenCaptureFromPath(screenshot);


	}
}






