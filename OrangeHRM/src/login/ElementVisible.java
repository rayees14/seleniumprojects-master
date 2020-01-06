package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		 driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Title verified successfully");
		}else
		{
			System.out.println("Title not verified successfully");
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		if(driver.findElement(By.name("Submit")).isDisplayed())
				{

			    driver.findElement(By.name("Submit")).click();
			    System.out.println("Element is Visible");
				}else
				{
					 System.out.println("Element is InVisible");
				}
		
	   driver.close();

	}

}
