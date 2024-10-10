package shadowRootElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowRootElements {
	@Test
	 public void openShadowRoot() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
		 driver.findElement(By.xpath("//section[text()='Shadow Root Elements']")).click();
		 driver.findElement(By.xpath("//section[.='Shadow Root']")).click();

	 }
	@Test
	 public void closeShadowRoot() {
		 
	 }
	@Test
	 public void nestedShadowRoot() {
		 
	 }
}
