package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Downloads {
	@Test
	 public void defaults() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 driver.findElement(By.xpath("//section[text()='Download ']")).click();
		 driver.findElement(By.xpath("//textarea[@placeholder='Enter text here']")).sendKeys("HIIIIIII");
		 driver.findElement(By.xpath("//button[text()='Download']")).click();
		
	 }
}
