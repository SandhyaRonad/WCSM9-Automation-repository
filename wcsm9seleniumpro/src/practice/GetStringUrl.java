package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetStringUrl {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();

	}

}
