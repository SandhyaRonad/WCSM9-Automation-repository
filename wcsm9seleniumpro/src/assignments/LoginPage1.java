package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		driver.findElement(By.id("id_userLoginId")).sendKeys("sandhya@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("manager");
		 driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
		
		
	// 	driver.findElement(By.className("btn login-button btn-submit btn-small")).click();   not possible confusion
		//*[@id="appMountPoint"]/div/div[3]/div/div/div[1]/form/button
		
		
		
	}

}
