package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	 WebDriver driver = new FirefoxDriver();

		  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		  driver.manage().window().maximize();

		  WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));

		  WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));

		  Actions oaction = new Actions(driver);
 
		  oaction.dragAndDrop(draggable, droppable).build().perform();

		  String dropped_text= driver.findElement(By.xpath(".//*[@id='droppable']/p")).getText();
		  System.out.println(dropped_text);

		  if(dropped_text.equals("Dropped!"))
		  {
			  System.out.println("Drag And Drop Operation is Verified Successfully");
		  }else
		  {
			  System.out.println("Dropped! Text is Not Verified Successfully");
		  }
		  
		  driver.close();
	}

}
