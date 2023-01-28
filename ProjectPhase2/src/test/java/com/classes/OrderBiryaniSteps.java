package com.classes;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class OrderBiryaniSteps {
    ExtentReports extent;
    ExtentTest test;

    @Before
    public void setup() {
        // configure the report
        extent = new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        extent.attachReporter(htmlReporter);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // take screenshot and add it to the report
            test.fail("Scenario failed");
        } else {
            test.pass("Scenario passed");
        }
        extent.flush();
    }
}
