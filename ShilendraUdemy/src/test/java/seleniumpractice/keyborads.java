package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyborads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=10593298875049511270&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9145968&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		String l=Keys.chord(Keys.SHIFT,"fans");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(l);
		Thread.sleep(2000);
		/*
		 * by this way we handel windows
		 */

	}

}
