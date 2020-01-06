package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  
		  WebDriver driver=new FirefoxDriver();
	      driver.navigate().to("file:///C:/Users/RAYEES/Downloads/Previous/Selenium%20Course%20Material/doubleClickMe%20%282%29.html");
	       
	      WebElement element = driver.findElement(By.xpath("html/body/button"));
		
		  element.click();
		  System.out.println("For Single Click on Button, Text will Not Load in Field2 from Field1");
		  
		  Thread.sleep(3000);
			
		  Actions action = new Actions(driver);
			 
		  action.doubleClick(element).build().perform();
	
		  System.out.println("After Performing Double click on Button, Text will Load in Field2 from Field1");
		  
		  String entered_text=driver.findElement(By.id("field2")).getAttribute("value");
	
		if(entered_text.equals("Hello World!"))
		{
			System.out.println("Entered Text is Verified Successfully");
		}else
		{
			System.out.println("Entered Text is Not Verified Successfully");
		}
		
		driver.close();
		 }

	}
