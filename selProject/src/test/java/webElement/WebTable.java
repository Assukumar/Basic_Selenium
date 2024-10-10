package webElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	@Test
	 public void staticWebTable() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		System.out.println(driver.findElement(By.xpath("//th[.='Levis Shirt']")).getText());
		List<WebElement>el=driver.findElements(By.tagName("td"));
		for(WebElement e:el) {
		   String s=e.getText();
		   System.out.println(s);
		}
	 }
	 @Test
	 public void dynamicWebTable() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		driver.findElement(By.xpath("//a[text()='Dynamic Web Table']")).click();
		//System.out.println(driver.findElement(By.xpath("//th[.='Levis Shirt']")).getText());
		List<WebElement>el=driver.findElements(By.xpath("//td"));//BY.xpath(//td)
		for(WebElement e:el) {
		   String s=e.getText();
		   System.out.println(s);
		}
	 }
	 @Test
	 public void tableWithSort() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		driver.findElement(By.xpath("//a[text()='Table With Sort']")).click();
		System.out.println(driver.findElement(By.xpath("//th[.='Levis Shirt']")).getText());
		List<WebElement>el=driver.findElements(By.xpath("td"));
		for(WebElement e:el) {
		   String s=e.getText();
		   System.out.println(s);
		}
	 }
	 @Test
	 public void tablePagination() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		driver.findElement(By.xpath("//a[text()='Table Pagination']")).click();
		//System.out.println(driver.findElement(By.xpath("//th[.='Levis Shirt']")).getText());
		List<WebElement>el=driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement e:el) {
		   String s=e.getText();
		   System.out.println(s);
		}
	 }
	 @Test
	 public void tableWithCheckBox() {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		driver.findElement(By.xpath("//a[text()='Table With Checkbox']")).click();
		System.out.println(driver.findElement(By.xpath("//th[.='Levis Shirt']")).getText());
		List<WebElement>el=driver.findElements(By.tagName("td"));
		for(WebElement e:el) {
		   String s=e.getText();
		   System.out.println(s);
		}
	 }
}
