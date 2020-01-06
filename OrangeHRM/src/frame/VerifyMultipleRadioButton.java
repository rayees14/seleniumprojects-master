package frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyMultipleRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://apps.fas.usda.gov/esrquery/esrq.aspx");
		driver.manage().window().maximize();

		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("Number of Radio Buttons ="+radioButton.size());
        
        for(int i=0; i<radioButton.size(); i++)
        {
        	radioButton.get(i).click();
            
        	if(radioButton.get(i).isSelected()){
            	
            	 System.out.println("Radio Button is Selected ");
                 
            } else
            	{
           	 System.out.println("Radio Button is not Selected "); 
                 
            } 
            
        }    	
    
        driver.close();
    }
}
