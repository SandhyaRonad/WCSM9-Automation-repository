package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {
public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		WebElement loginclick =driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("123456789");
		
		//identify login button
		WebElement loginclick1 =driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		
		//verify login button is enable or not
		 loginclick1.click();
		System.out.println(loginclick1.isEnabled());
	}

}



