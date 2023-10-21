package dropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eliminateoption {

	public static void main(String[] args) {
			
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("file:///D:/ff/HTML/multidropdown.html");
			//identify dropdown and stor it in reference vairable
			WebElement menudropdown= driver.findElement(By.id("idddd"));
			//get all the options of menu dropdown
			Select sel =new Select(menudropdown);
			List<WebElement> allops =sel.getOptions();
			//to eliminate duplicate we use hashset
			new HashSet <String>=new HashSet<String>();
			
			
			
			

	}

}
