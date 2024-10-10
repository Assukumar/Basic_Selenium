package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowseWindow {
	@Test
	 public void newWindow() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		 driver.findElement(By.xpath("//a[text()='Open in new window']")).click();
		 String s=driver.getWindowHandle();
			Set<String>c=driver.getWindowHandles();
			for(String a:c) {
				if(!s.equals(a)) {
					driver.switchTo().window(a);
	 
			}}}
	 @Test
	 public void newTab() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		 driver.findElement(By.xpath("//a[text()='New Tab']")).click();
		 driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
		 String s=driver.getWindowHandle();
			Set<String>c=driver.getWindowHandles();
			for(String a:c) {
				if(!s.equals(a)) {
					driver.switchTo().window(a);
	 
			}
	 }}
	 @Test
	 public void multipleWindows() {
		 
	 }
	 @Test
	 public void multipleTab() {
		 
	 }

}
