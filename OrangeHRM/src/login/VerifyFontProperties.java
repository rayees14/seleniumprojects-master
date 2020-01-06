package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class VerifyFontProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");  
		driver.manage().window().maximize();

	     String  font_name = driver.findElement(By.linkText("Gmail")).getCssValue("font-family");  
	     System.out.println("Font-Family: " + font_name);  
	     Assert.assertEquals("arial,sans-serif", font_name);
	     System.out.println("Font_name is Verified");
	   
	     String  font_size = driver.findElement(By.linkText("Gmail")).getCssValue("font-size");  
	     System.out.println("Font-Size: " + font_size);  
	     Assert.assertEquals("13px", font_size);
	     System.out.println("Font_Size is Verified");
	    
	     String font_color = driver.findElement(By.linkText("Gmail")).getCssValue("color");  
	     System.out.println("Font-Color: " + font_color);  
	     Assert.assertEquals("rgba(0, 0, 0, 0.87)", font_color);
		 System.out.println("Font_Color is Verified");
	     
		 driver.close();  
	}

}
