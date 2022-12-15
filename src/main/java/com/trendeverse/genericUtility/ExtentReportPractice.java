package com.trendeverse.genericUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportPractice 
{
	public static void main(String[] args) 
	{
		ExtentSparkReporter spark= new ExtentSparkReporter("./extentReport/extentHtmlReport.html");
		spark.config().setDocumentTitle("Document Title Test Yantra");
		spark.config().setReportName("Testcase Execution Report");
		spark.config().setTheme(Theme.STANDARD);
		
		ExtentReports report= new ExtentReports();
		report.attachReporter(spark);
		
		report.setSystemInfo("Operating System","Windows 10 ");
		report.setSystemInfo("Browser name ", "chrome");
		report.setSystemInfo("Browser version", "104");
		report.setSystemInfo("Reporter Name", "Bhimrao");
		
		ExtentTest test1 = report.createTest("tet11");
		test1.info("this message coming from script");
		test1.warning("message warning");
		test1.fail("testcase fail");
		test1.pass("pass");
		
		ExtentTest test2 = report.createTest("test12");
		test2.info("this message coming from script");
		test2.warning("message warning");
		test2.fail("testcase fail");
		
		ExtentTest test3 = report.createTest("test13");
		test3.info("this message coming from script");
		test3.warning("message warning");
		test3.fail("testcase fail");
		
		report.flush();
		
	}

}
