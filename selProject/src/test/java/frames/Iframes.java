package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframes {
	@Test
	 public void defaults() {
				WebDriver driver=new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 driver.get("https://demoapps.qspiders.com/ui");
				 driver.findElement(By.xpath("//section[text()='Frames']")).click();
				 driver.findElement(By.xpath("//section[text()='iframes']")).click();
				 //driver.switchTo().frame(0);
				 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("HIIIIIIII");
	 }
	@Test
	 public void nestedIframe() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Frames']")).click();
		 driver.findElement(By.xpath("//section[text()='iframes']")).click();
		 driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		driver.switchTo().frame(1);
	 }
	 @Test 
	 public void multipleIframe() throws Exception {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Frames']")).click();
		 driver.findElement(By.xpath("//section[text()='iframes']")).click();
		 driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
			driver.switchTo().frame(0);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			
			
			Thread.sleep(3000);
			 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("HIIIIIIII");

	 }
	 @Test
	 public void nestedWithMultipleIframe() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Frames']")).click();
		 driver.findElement(By.xpath("//section[text()='iframes']")).click();
		 driver.findElement(By.xpath("//a[text()='Nested with Multiple iframe']")).click();
			driver.switchTo().frame(0);
			
	 }
}
