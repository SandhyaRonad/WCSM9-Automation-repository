package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
			Dimension targetsize = new Dimension(350,450);
				driver.manage().window().setSize(targetsize);
				Point targetposition =new Point(400,250);
				driver.manage().window().setPosition(targetposition);
	}

}
