package internet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAYEES\\Eclipse Projects\\Internet_Herokuapp\\lib\\drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAYEES\\Eclipse Projects\\Internet_Herokuapp\\lib\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("The Internet"))
		 {
			 System.out.println("Title verified successfully");
		 }else
		    {
			   System.out.println("Title not verified successfully");
		    }
		
	
		WebElement form_link = driver.findElement(By.linkText("Form Authentication"));
		form_link.click();
		
		boolean login_text_present =driver.getPageSource().contains("Login Page");
		if(login_text_present)
		  {
			 System.out.println("Login Page opened successfully");
		  }else
		      {
			      System.out.println("Login Page not opened successfully");
	       	  }
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		
		
		String login_text = driver.findElement(By.id("flash")).getText();
		
		if(login_text.equals("You logged into a secure area!"+"\n" + 
				"×"))
		 {
		     System.out.println("The user logged in successfully");
		  
		     driver.findElement(By.linkText("Logout")).click();
			
			 String logout_text = driver.findElement(By.id("flash")).getText();
			 System.out.println(logout_text);
			
			 if(logout_text.equals("You logged out of the secure area!"+"\n" + 
					"×"))
			   {
				    System.out.println("Logged out successfully");
			   }else
		           {
				       System.out.println("Not Logged out successfully");
			       }
		 }else
		   {
			  System.out.println("The user not logged in successfully");
			
			System.out.println(login_text);
		}
		
		
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
//		driver.findElement(By.className("radius")).click();
//		
//		boolean error_text =driver.getPageSource().contains("Your password is invalid!");
//		if(error_text)
//		  {
//			 System.out.println("The password entered is invalid");
//		  }else
//		      {
//			      System.out.println("The password entered is valid");
//	       	  }
//		
		
		driver.close();

	}

}
