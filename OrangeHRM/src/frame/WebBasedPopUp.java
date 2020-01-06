package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBasedPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/v4/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("html/body/div[4]/ol/li[1]/a")).click();
		
		driver.findElement(By.name("emailid")).sendKeys("selenium@gmail.com");
		
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		
		driver.get("http://demo.guru99.com/v4/");
		
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr138950");

		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("majuqyj");

		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("html/body/div[3]/div/ul/li[15]/a")).click();
		
		Thread.sleep(5000);

		String alert_text=driver.switchTo().alert().getText();

		System.out.println("Print Alert Text:"+alert_text);

		if(alert_text.equals("You Have Succesfully Logged Out!!"))
		{
			System.out.println("Alert Text Verified Successfully");
		}else
		{
			System.out.println("Alert Text Not Verified Successfully");
		}


		driver.switchTo().alert().accept();

		//driver.switchTo().alert().dismiss();

		Thread.sleep(5000);
		driver.close();

		}

		}

