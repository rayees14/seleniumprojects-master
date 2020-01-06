package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndChooseAnOptionActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
        driver.navigate().to("http://www.google.com");
        driver.manage().window().maximize();
        
        WebElement oWE=driver.findElement(By.linkText("About"));
        
        Actions oaction=new Actions(driver);
        oaction.moveToElement(oWE).build().perform();
        
        oaction.contextClick(oWE).build().perform();
        System.out.println("Right Click Operation performed Successfully");
        
         Thread.sleep(5000);
        
        oaction.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        
         System.out.println("Option is Choosen Successfully");
		 
         driver.close();
      
	}

}
