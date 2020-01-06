package frame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class ListBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://apps.fas.usda.gov/esrquery/esrq.aspx");
		driver.manage().window().maximize();
		
		WebElement listbox = driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_lbCountry']"));
		
		Select s = new Select(listbox);
		s.selectByIndex(5);
		s.selectByVisibleText("ARGENTINA");
		
		if(s.isMultiple())
		{
			System.out.println("Multiple selections are allowed");
		}else
		{
			System.out.println("Multiple selections are not allowed");
		}
		
       driver.close();
	}

}
