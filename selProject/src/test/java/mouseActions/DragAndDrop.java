package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	 public void defaults() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		 driver.findElement(By.xpath("//section[.='Drag & Drop']")).click();
	 }
	 @Test
	 public void dragPosition() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		// driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		 driver.findElement(By.xpath("//section[.='Drag & Drop']")).click();
		 driver.findElement(By.xpath("//a[.='Drag Position']")).click();
		 Actions ac1= new Actions(driver);
		WebElement drag1= driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement drag2= driver.findElement(By.xpath("//div[.='Mobile Cover']"));
		WebElement drag3= driver.findElement(By.xpath("//div[.='Laptop Charger']"));

WebElement drop= driver.findElement(By.xpath("//div[.='Mobile Accessories' and @class='drop-column  min-h-[200px] bg-slate-100']"));
WebElement drop2= driver.findElement(By.xpath("//div[.='Laptop Accessories' and @class='column-header bg-white py-2 font-bold']"));

     ac1.dragAndDrop(drag1, drop).perform();
     ac1.dragAndDrop(drag2, drop).perform();
     ac1.dragAndDrop(drag3, drop2).perform();


     
	 }
	 @Test
	 public void dragMultiple() {
		 
	 }
}
