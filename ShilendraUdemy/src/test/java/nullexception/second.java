package nullexception;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class second extends first {

	@Test
	public void tey() {

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("hello");
	}

}
