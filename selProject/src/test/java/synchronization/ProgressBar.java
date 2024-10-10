package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProgressBar {
	@Test
	 public void defaults() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		 driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		 driver.findElement(By.xpath("//button[.='Start']")).click();
	 }
	 @Test
	 public void withTimer() {
		 
	 }
	 @Test
	 public void withElement() {
		 
	 }
	 @Test
	 public void withElementDisapper() {
		 
	 }
	 @Test
	 public void disabledElement() {
		 
	 }
	 @Test
	 public void hiddernElement() {
		 
	 }
}
