package qsp;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		System.out.println("browser is open!");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();

	}

}
