package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FileUploadSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		 
		Thread.sleep(3000);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		String text=driver.findElement(By.id("welcome")).getText();
		System.out.println(text);
		
		Assert.assertEquals(text, "Welcome Admin");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']"))).build().perform();
		
		Thread.sleep(5000);
		
		act.moveToElement(driver.findElement(By.xpath("//*[@id='menu_pim_addEmployee']"))).click().build().perform();	
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("firstName")).sendKeys("sai");
		driver.findElement(By.id("lastName")).sendKeys("honey");
		
         //driver.findElement(By.id("photofile")).click();
		
		driver.findElement(By.xpath(".//*[@id='photofile']")).sendKeys("C:\\Users\\RAYEES\\Pictures\\index.jpg");
       
		//Runtime.getRuntime().exec("C:\\Users\\RAYEES\\Eclipse Projects\\AutoitFile.exe");
		Thread.sleep(10000);
			
        driver.findElement(By.id("btnSave")).click();
       
        Thread.sleep(10000);
        
        String uploadfile_text=driver.findElement(By.xpath("//*[@id='profile-pic']/h1")).getText();	
        System.out.println(uploadfile_text);
	
        if(uploadfile_text.equals("sai honey"))
        {
        	 System.out.println("UploadFile_Text is Verified");
        	}else
        	{
        		System.out.println("UploadFile_Text is Not Verified");
        	}
	
        driver.findElement(By.id("welcome")).click();


        driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
	
        Thread.sleep(5000);
        
        driver.close();
	
		}
	}


