package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	     WebDriver driver = new FirefoxDriver();
	     driver.navigate().to("https://www.google.com/");
		 driver.manage().window().maximize();

		String googlesearch = driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println("Label of the Button :"+googlesearch);
		
		if(googlesearch.equals("Google Search"))
		{
			System.out.println("Label of the Button is verified");
		}else
		{
			System.out.println("Label of the Button is not verified");
		}
		
		driver.close();
	}

}
