package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyPlaceHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.kosmiktechnologies.com/seleniumLiveProject/eKart/admin/");
		driver.manage().window().maximize();

		String placeholdertext = driver.findElement(By.name("username")).getAttribute("placeholder");
		System.out.println("PlaceHolder of the UserName="+placeholdertext);
		
		if(placeholdertext.equals("Username"))
		{
			System.out.println("PlaceHolder of the UserName verified successfully");
		}else
		{
			System.out.println("PlaceHolder of the UserName not verified successfully");
		}
		
		driver.close();
		
	}

}
