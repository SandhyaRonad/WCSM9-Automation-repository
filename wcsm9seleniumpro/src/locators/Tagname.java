package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	//	driver.findElement(By.id("email")).sendKeys("abs");  by using ID
	//	driver.findElement(By.name("email")).sendKeys("sandhy");  by using name not possible due to same name
	//	driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("absss"); by using class name not possible due to same name
		// driver.findElement(By.cssSelector("#email")).sendKeys("aaaaaaaaaaa");
		// driver.findElement(By.cssSelector("input#email")).sendKeys("aaaaaaaaaaa");
	// 	driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("jjj");
		// driver.findElement(By.cssSelector("[name=email]")).sendKeys("aaaaddd");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("sandhya@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("jjjj");
		
		
	}

}
