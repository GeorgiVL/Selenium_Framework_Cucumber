package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporterNG {
    static ExtentReports extent;

    public static ExtentReports getReportObject() {
        // ExtentReports, ExtentSparkReporter
        String path = System.getProperty("user.dir") + "//reports//index.html";
        ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Georgi Valkanov");
        return extent;
    }
}
