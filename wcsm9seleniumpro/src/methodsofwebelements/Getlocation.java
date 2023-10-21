package methodsofwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-8jd4rpv/login.do");
		
	WebElement loginboxx =driver.findElement(By.xpath("//td[@class='i']"));
	
	Point loc =loginboxx.getLocation();
		System.out.println("location of loginbox :" + loc );
		

	}

}
