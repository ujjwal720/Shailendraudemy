package seleniumpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extre {

	public ExtentReports extentreports;
	public File files;
	public FileInputStream streamss;
	public ExtentSparkReporter reporter;
	public WebDriver driver;
	public String path;
	
	@BeforeTest
	public void test1() throws FileNotFoundException {

		path="C:\\Users\\DELL\\git\\Shailendraudemy\\ShilendraUdemy\\k1.html";
		//streamss = new FileInputStream(files);
		reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Demo of shailendra");
		reporter.config().setReportName("Demo reproter");
		reporter.config().setTheme(Theme.DARK);
		extentreports = new ExtentReports();
		extentreports.attachReporter(reporter);
		extentreports.createTest("lam");
		 driver=new ChromeDriver();

	}

	@Test
	public void openbrowser() {
       
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void aftert() {

		extentreports.flush();

	}

}
