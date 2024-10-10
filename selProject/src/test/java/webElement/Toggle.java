package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Toggle {
	@Test
	 public void defaults() throws Exception {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Toggle']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span//input[@id='tog']")).click();
	 }
	 @Test
	 public void Disabled() {
		 
	 }
}
