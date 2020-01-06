package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowBasedSinglePopUp {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rcreddyiasstudycircle.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(driver.getWindowHandle());
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div")).click();
		Thread.sleep(5000);
	
		driver.close();
	
	}

}
