package webElement;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Link {
	@Test
	 public void defaultLink() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Link']")).click(); 
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	 }
	 @Test
	 public void LinkInNewTab() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		driver.findElement(By.xpath("//a[text()='Link in New Tab']")).click();
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		String s=driver.getWindowHandle();
		Set<String>c=driver.getWindowHandles();
		for(String a:c) {
			if(!s.equals(a)) {
				driver.switchTo().window(a);
			}
		}
		
	 }
}
