package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getloc_size_rect {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-8jd4rpv/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		
		//verifying logout link in homepage displayed or not
		
		WebElement logoutlink = driver.findElement(By.xpath("//a[@class='logout']"));
		System.out.println(	logoutlink.isDisplayed());

				
	}
	
	

}
