package webElement;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
	@Test
	 public void defaults() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Slider']")).click();
	WebElement el=	driver.findElement(By.xpath("//input[@class=' rangeInputSlidebar']"));
		Actions act=new Actions(driver);
		/*
		 * act.doubleClick(el).clickAndHold();
		 * 
		 * act.release(el);
		 */
		act.dragAndDropBy(el, 0, 75);
	 }

}
