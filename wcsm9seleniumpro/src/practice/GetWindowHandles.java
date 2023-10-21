package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		String parenthandle = driver.getWindowHandle();
		System.out.println(" parent handle id: " +parenthandle);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		 
		 
		 for(String wh:allHandles)
		 {
			 if(!parenthandle.equals(wh))
			 {
				 System.out.println("child handle: " +wh); 
			 }
			 else 
			 {
				 System.out.println("parent handle: " +wh); 
			 }
		 } 
		

	}

}
