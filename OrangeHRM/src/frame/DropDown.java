package frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown  {
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.manage().window().maximize();
		
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
		
		driver.switchTo().frame("rightMenu");
		WebElement dropdown=driver.findElement(By.id("loc_code"));
		List<WebElement> droplist = dropdown.findElements(By.tagName("option"));
		System.out.println("Size of DropDown =" + droplist.size());
		for(int i=0;i<droplist.size();i++)
		{
			System.out.println(droplist.get(i).getText());
		}
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		//s.selectByValue("0");
		//s.selectByVisibleText("Emp. ID");
		
		String selected_value = s.getFirstSelectedOption().getText();
		System.out.println(selected_value);
		if(selected_value.equals("Emp. ID"))
		{
			System.out.println("Value successfully selected");
		}else
		{
			System.out.println("Value not successfully selected");
		}
		
		driver.switchTo().defaultContent();
		
		driver.close();

	}

}
