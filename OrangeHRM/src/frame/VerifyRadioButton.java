package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://openwritings.net/sites/default/files/radio_checkbox.html");
		driver.manage().window().maximize();

		WebElement mondayradio = driver.findElement(By.name("groupName"));
		mondayradio.click();
		
		if(mondayradio.isSelected())
		{

				System.out.println("Radio Button is Selected");
		}else
		{
			 System.out.println("Radio Button is not Selected");
		}
		
		driver.close();
		
	}

}
