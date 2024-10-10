package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClickAndHold {
	@Test
	 public void defaults() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		 driver.findElement(By.xpath("//section[.='Click & Hold']")).click();
		 Actions ac1= new Actions(driver);
			WebElement drag= driver.findElement(By.xpath("//div[@id='circle']"));
			ac1.clickAndHold(drag);
		 
		 }
}
