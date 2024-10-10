package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
	@Test
	 public void icon() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		 driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		 Actions ac1= new Actions(driver);
		WebElement el1= driver.findElement(By.xpath("//img[@src='/assets/hide-nC0Bu9NG.png']"));
		 ac1.moveToElement(el1).click().perform();
	 }
	 @Test
	 public void image() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		 driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		 driver.findElement(By.xpath("//a[.='Image']")).click(); 
		 Actions ac1= new Actions(driver);
			WebElement el1= driver.findElement(By.xpath("//img[@src='/assets/hide-nC0Bu9NG.png']"));
			 ac1.moveToElement(el1).perform();
	 }
	 @Test
	 public void ratings() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		 driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		 driver.findElement(By.xpath("//a[.='Ratings']")).click();
		 Actions ac1= new Actions(driver);
			WebElement el1= driver.findElement(By.xpath("//*[name()='svg' and @stroke='currentColor' and @class=\"Rating cursor-pointer\"]"));
			ac1.moveToElement(el1).perform();
	 }
	 @Test
	 public void tab() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		 driver.findElement(By.xpath("//section[.='Mouse Hover']")).click();
		 driver.findElement(By.xpath("//a[.='Tab']")).click();
		 Actions ac1= new Actions(driver);
			WebElement el1= driver.findElement(By.xpath("//li[text()='Men ']"));
			ac1.moveToElement(el1).perform();
	 }
}
