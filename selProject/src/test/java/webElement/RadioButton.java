package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	@Test
	 public void defaults() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		driver.findElement(By.xpath("//span[text()='UPI']")).click();
		driver.findElement(By.xpath("//span[text()='Office delivery']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
	 }
	 @Test
	 public void selected() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
		driver.findElement(By.xpath("//a[text()='Selected']")).click();
		driver.findElement(By.xpath("//span[text()='Wallet']")).click();
	 }
	 @Test
	 public void disabled() {
		    WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.get("https://demoapps.qspiders.com/ui");
			driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
	 }
}
