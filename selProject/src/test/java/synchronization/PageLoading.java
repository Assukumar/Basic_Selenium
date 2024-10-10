package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageLoading {
	@Test
	 public void defaults() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		 driver.findElement(By.xpath("//section[text()='Page Loading']")).click();
		 driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();

	 }
}
