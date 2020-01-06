package frame;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyMultipleCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		WebDriver driver = new FirefoxDriver();
        driver.get("https://apps.fas.usda.gov/esrquery/esrq.aspx");
		driver.manage().window().maximize();

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Number of CheckBoxes ="+checkboxes.size());
        
        for(int i=0; i<checkboxes.size(); i++)
        {
            checkboxes.get(i).click();
            
             if(checkboxes.get(i).isSelected()){
            	
            	 System.out.println("CheckBoxes are Selected ");
                 
            }else{
           	 	System.out.println("CheckBoxes are not Selected "); 
                 
            } 
            
        }    
            
      driver.close();
    
    }
}
