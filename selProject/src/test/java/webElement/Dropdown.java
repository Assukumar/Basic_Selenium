package webElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dropdown {
	@Test
	 public void singleSelect() throws Exception {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	
	WebElement el=	driver.findElement(By.xpath("//select[@id='select2']"));
                  
		Select s=new Select(el);
		Thread.sleep(30000);
		s.selectByVisibleText("Male");
	 }
	 @Test
	 public void multiSelect() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='enter your number']")).sendKeys("9812345670");
		 driver.findElement(By.xpath(null));
	 }
	 @Test
	 public void searchWithSelect() throws Exception {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//input[@placeholder='enter your number']")).sendKeys("9812345670");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[text()='Select Gender']")).sendKeys("male");
	 }
	 @Test
	 public void disabled() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		 WebElement yourButton= driver.findElement(By.xpath("//select[@id=\"selectGen\"]"));

		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].removeAttribute('disabled','disabled')",yourButton); 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(yourButton));

		yourButton.click();
		
	 }
}
