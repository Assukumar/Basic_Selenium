package keyboardActions;

import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VirtualKeyboard {
	@Test
	 public void defaults() throws Exception {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();
		 driver.findElement(By.xpath("//section[.='Keyboard']")).click();
		 Thread.sleep(3000);
		 Robot r=new Robot();
	 }
}
