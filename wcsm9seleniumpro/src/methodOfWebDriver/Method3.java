package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/login.do;jsessionid=xei2kjvu0pv4"); //open webpage
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		String UrlOfPage = driver.getCurrentUrl();
		System.out.println(UrlOfPage); 
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		driver.quit();
	}

}
