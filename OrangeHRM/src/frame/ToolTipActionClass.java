package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
         WebDriver driver=new FirefoxDriver();
		 
		 driver.navigate().to("https://www.ebay.in/sch/i.html?_from=R40&_trksid=p2050601.m570.l1313.TR12.TRC2.A0.H0.Xwatches.TRS0&_nkw=watches&_sacat=0");
		 driver.manage().window().maximize();
	      
		 WebElement casio_watches = driver.findElement(By.xpath(".//*[@id='RelatedSearchesContainer']/span[2]/a[1]"));
		
		 Actions act=new Actions(driver);
		 act.moveToElement(casio_watches).build().perform();
		 
		 String tooltip=casio_watches.getAttribute("title");
		 System.out.println(tooltip);
		 
		  if(tooltip.equals("watches for men"))
		 {
			 System.out.println("Tooltip Verified Successfully");
		 }else
		 {
			 System.out.println("Tooltip Not Verified Successfully");
		 }
		 
		driver.close();
		 }

	}


