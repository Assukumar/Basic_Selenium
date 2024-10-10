package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadLess_Browser {
@Test
public void headless() throws Exception {
	ChromeOptions opt =new ChromeOptions();
	opt.addArguments("--headless");
	WebDriver driver=new ChromeDriver(opt);
	 driver.get("https://demoapps.qspiders.com/ui");
	 Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		System.out.println(driver.findElement(By.xpath("//th[.='Levis Shirt']")).getText());
		List<WebElement>el=driver.findElements(By.tagName("td"));
		for(WebElement e:el) {
		   String s=e.getText();
		   System.out.println(s);
		}
	
}
}
