package scroll;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

public class Scroll {
	@Test
	 public void inNewTabVertically() throws Exception {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[15px]']")).click();
		 driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[14px]']")).click();
         driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
         String s=driver.getWindowHandle();
			Set<String>c=driver.getWindowHandles();
			for(String a:c) {
				if(!s.equals(a)) {
					driver.switchTo().window(a);
//				WebElement el=	driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
//				Robot r=new Robot();
//				r.keyPress(KeyEvent.VK_PAGE_DOWN);
//				r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//				r.keyPress(KeyEvent.VK_PAGE_DOWN);
//				r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//				r.keyPress(KeyEvent.VK_PAGE_DOWN);
//				r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//				r.keyPress(KeyEvent.VK_PAGE_DOWN);
//				r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//				r.keyPress(KeyEvent.VK_PAGE_DOWN);
//				r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//				r.keyPress(KeyEvent.VK_PAGE_DOWN);
//				r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//				Actions act=new Actions(driver); 
//				act.moveToElement(el).click();
					JavascriptExecutor js = (JavascriptExecutor)driver;
					 //For Scroll till the buttom of the page
					 js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	 
			}}
				
	 }
	 @Test
	 public void inaNewTabHorizontal() throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[15px]']")).click();
		 driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[14px]']")).click();
		 driver.findElement(By.xpath("//a[text()='Horizontal']")).click();
		 Thread.sleep(4000);
       driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
         String s=driver.getWindowHandle();
         
			Set<String>c=driver.getWindowHandles();
			for(String a:c) {
				if(!s.equals(a)) {
					driver.switchTo().window(a);
					Thread.sleep(4000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(250,0)", "");
	 }}
	 }
	 @Test
	 public void withTheFrameVertical() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 //driver.manage().
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[15px]']")).click();
		 driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[14px]']")).click();
		 driver.findElement(By.xpath("//section[text()='Within The Frame']")).click();
		 
		 driver.findElement(By.xpath("//a[text()='Vertical']")).click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 //For Scroll till the buttom of the page
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight);");	 }
	 
	 
	 
	
@Test
public void withTheFrameHorizontal() {
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://demoapps.qspiders.com/ui");
	 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
	 driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[15px]']")).click();
	 driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[14px]']")).click();
	 driver.findElement(By.xpath("//section[text()='Within The Frame']")).click();
	 
	 driver.findElement(By.xpath("//a[text()='Horizontal']")).click();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	//For Scroll till the left to right corner of the page
	 //js.executeScript("window.scrollBy(0, document.body.scrollWidth);");
	    js.executeScript("window.scrollBy(250,0)", "");

}
}
