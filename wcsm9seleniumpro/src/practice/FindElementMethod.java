package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.partialLinkText("See how Indians use YouTube to realize their dreams, make a living, and thrive")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("this form")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
