package webElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {
	@Test
	 public void defaults() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		driver.findElement(By.xpath("//input[@id='domain1']")).click();
		//driver.findElement(By.xpath(""))
		
		driver.findElement(By.xpath("//input[@id='domain1']")).click();
//	List<WebElement> s=driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).;
//	int numberOfBoxes = s.length();
	System.out.println(
		    driver.findElements(By.cssSelector("input[type='checkbox']")).size()); 
	 }
	 @Test
	 public void selected() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		driver.findElement(By.xpath("//input[@id='domain1']")).click();
		driver.findElement(By.xpath("//input[@id='mode1']")).click();
		driver.findElement(By.xpath("//input[@id='mode5']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		 
	 }
	 @Test
	 public void disabled() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
	 }
}
