package assignments;

import java.sql.Driver;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DriverCommand;

public class Amazon {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter browser of ur choice");

		 String value =sc.next();
		if(value.equalsIgnoreCase("chrome"))
		{
			WebDriver  =new ChromeDriver();
		}
		
	
		 
	}
	

}