package assignments;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 System.out.println("enter browser of ur choice");

		 String value =sc.next();
				 
		if(value.equalsIgnoreCase("chrome"))
		{
			
		}
		
		else if(value.equalsIgnoreCase("firefox"))
		{
			
		}
		
		else
		
		  WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.amazon.com/");
		 
	}
	

}
