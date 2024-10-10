package dateTimePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimePicker {
	@Test
	 public void defaults() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
			
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Time Picker']")).click();
		 
		driver.findElement(By.xpath("//input[@placeholder='hh:mm aa']")).sendKeys("11:01:PM");
	 }
	@Test
	 public void timePickerClock() {
		 
	 }
}
