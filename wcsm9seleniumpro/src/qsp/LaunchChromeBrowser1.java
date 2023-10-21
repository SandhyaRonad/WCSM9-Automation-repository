package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is open!");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

	}

}
