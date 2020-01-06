package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyCheckboxButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://openwritings.net/sites/default/files/radio_checkbox.html");
		driver.manage().window().maximize();

		WebElement orangecheckbox = driver.findElement(By.name("orange"));
		orangecheckbox.click();
	
		if(orangecheckbox.isSelected())
		{

			System.out.println("Checkbox Selected");
		}else
		{
		 System.out.println("Checkbox not Selected");
		}
		
		driver.close();
	}

}
