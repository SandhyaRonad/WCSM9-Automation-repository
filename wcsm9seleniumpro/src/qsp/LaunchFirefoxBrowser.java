package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		System.out.println("browser is open!");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

	}

}
