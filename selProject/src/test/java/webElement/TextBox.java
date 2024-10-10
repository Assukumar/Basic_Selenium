package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBox {
 @Test
 public void withPlaceHolder() throws Exception {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://demoapps.qspiders.com/ui");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//section[text()='Text Box']")).click();
	 driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Someone");
	 driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("s@gmail.com");
	 driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("123");
	 }
 @Test
 public void withoutPlaceHolder() throws Exception {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 driver.get("https://demoapps.qspiders.com/ui"); 
	 driver.findElement(By.xpath("//section[text()='Text Box']")).click();
	 driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Someone");
	 driver.findElement(By.xpath("//input[@placeholder='Enter Your Email']")).sendKeys("s@gmail.com");
	 driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("123");
	 }
 @Test
 public void withToolTip() {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoapps.qspiders.com/ui");
 }
 @Test
 public void multilineTextArea() {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoapps.qspiders.com/ui");
 }
 @Test
 public void disabled() {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demoapps.qspiders.com/ui");
 }
}