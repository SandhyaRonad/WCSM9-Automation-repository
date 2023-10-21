package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodSourceCode {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/login.do;jsessionid=xei2kjvu0pv4");
		
		 String sourcecode = driver.getPageSource();
		 System.out.println(sourcecode);
	}

}
