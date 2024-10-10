package webElement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Button {
	@Test
	 public void defaultClick() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//p[text()='1. Are you satisfied with the registration process?']/../button[text()='Yes']")).click();
		WebElement el=driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		el.getText();
	 }
	 @Test
	 public void rightClick() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
	WebElement el=driver.findElement(By.xpath("//p[text()='1. Are you satisfied with the registration process?']/../button[text()='Right Click']"));

		Actions  act=new Actions(driver);
		act.moveToElement(el).contextClick().perform();
	 }
	 @Test
	 public void doubleClick() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement el=	driver.findElement(By.xpath("//p[text()='1. Are you satisfied with the registration process?']/../button[text()='Yes']"));
		Actions  act=new Actions(driver);
		act.moveToElement(el).doubleClick().perform();
	 }
	 @Test
	 public void submitClick() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Submit Click']")).click();
		driver.findElement(By.xpath("//p[text()='1. Are you satisfied with the registration process?']/../form/section/label[text()='Yes']")).click();
		driver.findElement(By.xpath("//p[text()='1. Are you satisfied with the registration process?']/../form/section[3]/button[text()='Submit']")).click();
	 }
	 @Test
	 public void disabled() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		driver.findElement(By.xpath("//button[@id='btn10']")).click();
		driver.findElement(By.xpath("//button[@id='btn12']")).click();
		driver.findElement(By.xpath("//button[@id='btn15']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		
		
	 }
}
