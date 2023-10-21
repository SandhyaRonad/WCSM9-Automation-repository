package methodsofwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

		public static void main(String[] args) {
			
			
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://desktop-8jd4rpv/login.do");
			
			//verify checkbox in loginpage selected or not
			WebElement checkbox =driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
			 checkbox.click();
		
		if (checkbox.isSelected())
		{
		System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}	
	}
}
