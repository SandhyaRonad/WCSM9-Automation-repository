package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://omayo.blogspot.com/"); //open webpage
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		driver.quit();
		
		
		
		

	}

}
