package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("aaa");
		// driver.findElement(By.cssSelector("#email")).sendKeys("aaa");
		//	driver.findElement(By.cssSelector("input#pass")).sendKeys("bbbb");
		// driver.findElement(By.cssSelector("#pass")).sendKeys("bbbb");
		
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("SSSs");
		driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("ssssss");
		
		
		
	// 	driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("sandhya@gmail.com");
		// driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("jjjj");
		
		
	}

}
