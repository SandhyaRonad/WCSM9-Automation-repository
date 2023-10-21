package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); // to maximize the screen
		
		driver.get("https://omayo.blogspot.com/"); // to launch the webpage
		Thread.sleep(2000);  // hold screen for 2 sec
		String title = driver.getTitle();  // to display title of page
		System.out.println(title);			 // to display title of page
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Open a popup window")).click();  // find element in webpage
		Thread.sleep(2000);
		driver.close(); // close parent screen
		driver.quit();  // close all active screen
	}

}
