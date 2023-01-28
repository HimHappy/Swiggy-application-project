package com.classes;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OrderBiryaniExtent {
    
   public static void main(String[] args) {
	   String ptReport = System.getProperty("user.dir")+"\\Reports\\";
		String rname = "FirstExecution.html";
		String fname = ptReport+rname;
		System.out.println(fname);
		
		ExtentHtmlReporter html = new ExtentHtmlReporter(fname);

		ExtentReports extentReports = new ExtentReports();
		
		extentReports.attachReporter(html);
		
		ExtentTest test = extentReports.createTest("TestFile1","Testing Login");
		test.log(Status.PASS, "login has passed");
		
		extentReports.flush();
}

}
