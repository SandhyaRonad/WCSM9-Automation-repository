package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur choice");
		String browserValue= sc.next();
		
		if (browserValue.equalsIgnoreCase("chrome"))
		{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		}
		else if (browserValue.equalsIgnoreCase("edge"))
		{
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		else {
			System.out.println("invalid input");
		}
	}

}
