package login;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginHRM {
	
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
		driver.findElement(By.name("Submit")).click();
		
		String webtext = driver.findElement(By.xpath(".//*[@id='option-menu']/li[1]")).getText();
		System.out.println(webtext);
		if(webtext.equals("Welcome selenium"))
		{
			System.out.println("Webpage opened successfully");
		}else
		{
			System.out.println("Webpage not opened successfully");
		}
		
		driver.findElement(By.linkText("Logout")).click();;
		driver.close();
	}

}
