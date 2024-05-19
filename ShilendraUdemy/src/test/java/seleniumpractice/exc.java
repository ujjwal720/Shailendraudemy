package seleniumpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exc {
	
	
	
	@Test(dataProvider="takedata")
	 public void goggle(String l) throws InterruptedException {
		 
		 
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); driver.get("https://www.google.com/");
		 driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(l);
		 Thread.sleep(2000);
		 driver.close();
	 }
	 

	@DataProvider
	public Object[][] takedata() throws IOException {

		File a = new File("C:\\Users\\DELL\\Desktop\\users.xlsx");
		FileInputStream excels = new FileInputStream(a);
		XSSFWorkbook book = new XSSFWorkbook(excels);
		XSSFSheet yu = book.getSheetAt(0);
		int rows = yu.getLastRowNum() + 1;
		int cols = yu.getRow(0).getLastCellNum();
		System.out.println(rows);
		System.out.println(cols);
		Object[][] io = new Object[rows][cols];

		for (int i = 0; i <= yu.getLastRowNum(); i++) {

			XSSFRow iom = yu.getRow(i);

			for (int j = 0; j <= cols - 1; j++) {

				String words = iom.getCell(j).toString();
				io[i][j] = words;

			}

		}

		return io;

	}

}
