package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploads {
	@Test
	 public void defaults() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		WebElement el= driver.findElement(By.xpath("//input[@id='fileInput']"));
		el.sendKeys("E:\\Books\\Interview questions - 2.pdf");
	 }
	 @Test
	 public void customButton() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		 driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
		WebElement el= driver.findElement(By.xpath("//section[@id='customButton']/div[text()='Upload File']"));
		el.sendKeys("E:\\Books\\Interview questions - 2.pdf");
	 }
	 @Test
	 public void dragAndDrop() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Popups']")).click();
		 driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		 driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
		WebElement el= driver.findElement(By.xpath("//div[@class='drop-container loading']"));
		el.sendKeys("E:\\Books\\Interview questions - 2.pdf");
	 }
	 @Test
	 public void multipleSelect() {
		 
	 }
}
