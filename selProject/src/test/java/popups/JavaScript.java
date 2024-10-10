package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript {
	@Test
	 public void defaultAlert() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		 driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		 Alert alt=driver.switchTo().alert();
		 alt.accept();
	 }
	 @Test
	 public void confirm() throws Exception {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		 driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		 driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		 Thread.sleep(2000);
		 Alert alt=driver.switchTo().alert();
		 alt.getText();
		 alt.dismiss(); 
		 
	 }
	 @Test
	 public void prompt() throws Exception {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		 driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		 driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		 Thread.sleep(2000);
		 Alert alt=driver.switchTo().alert();
		 //alt.getText();
		 alt.sendKeys("Hum Mar Jayenge");
		 
	 }
}
