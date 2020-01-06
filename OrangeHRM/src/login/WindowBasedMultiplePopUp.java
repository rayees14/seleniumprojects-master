package login;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowBasedMultiplePopUp {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();

		ArrayList<String> AllWindowHandles  = new ArrayList<String> (driver.getWindowHandles());
			     
		System.out.println("Number of Pop-Up Windows="+ AllWindowHandles.size());
	
		driver.switchTo().window(AllWindowHandles.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(5000);
		
		driver.switchTo().window(AllWindowHandles.get(2));
		System.out.println(driver.getTitle());
	
		driver.close();
		Thread.sleep(5000);
		
		driver.switchTo().window(AllWindowHandles.get(3));
		System.out.println(driver.getTitle());
			
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(AllWindowHandles .get(0));
		System.out.println(driver.getTitle());
		driver.close();

}
}
