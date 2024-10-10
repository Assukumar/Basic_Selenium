package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Authentication {
	@Test
	 public void defauls() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/login");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/ui/auth']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@href='https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/']")).click();
		Thread.sleep(3000);
		String s=driver.getWindowHandle();
        
		Set<String> c =driver.getWindowHandles();
		for(String a:c) {
			if(!s.equals(a)) {
				driver.switchTo().window(a);
		driver.get("https://admin:admin@demoapps.qspiders.com/ui/login");
			}}
	}
}
