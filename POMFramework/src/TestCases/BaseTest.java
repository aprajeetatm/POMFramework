package TestCases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	WebDriver driver;
	public static ExtentReports report=null;
	public static ExtentTest logger; 
	public static String extentReport;
	
	
	public void createTestReport()
	{
		System.out.println("Hello");
		DateFormat format=new SimpleDateFormat("yyyyMMddhhmmss");
		Date date=new Date();
		String datestr=format.format(date);
		report=new ExtentReports(System.getProperty("user.dir")+"\\src\\Reports\\ExtentReport"+datestr+".html");
		//report=new ExtentReports(System.getProperty("user.dir")+"\\src\\Reports\\ExtentReport.html");
	}
	
	
	public void LauchApp()
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Utilities\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.get("http://localhost:100");
	}

}
