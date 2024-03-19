package seleniumpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		/*
		 * screenshot
		 */

		TakesScreenshot opl = ((TakesScreenshot) driver);
		File po = opl.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(po, new File("C:\\Users\\DELL\\eclipse-workspace\\ShilendraUdemy\\ujjwal.png"));
		System.out.println("This is an file takes it");

	}

}
