package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartnew {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.flipkart.com/");
		//click on cancel button
		driver.findElement(By.xpath("//span[@role='button']")).click();
		// go to search tab and type laptop
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		// click on brand
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao']")).click();
		// click on hp
		driver.findElement(By.xpath("//div[@class='_3879cV']")).click();
		//click on processor
		driver.findElement(By.linkText("Processor")).click();
		
		
	}

}
