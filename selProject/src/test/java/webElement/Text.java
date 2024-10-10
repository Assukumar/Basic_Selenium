package webElement;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Text {
	@Test
	public void withplaceholder() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/login");
		driver.findElement(By.xpath("//section[text()='Text Box']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Someone");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anyone@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("who123@@");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
	}
		@Test
		public void withoutplaceholder() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapps.qspiders.com/ui/login");
			driver.findElement(By.xpath("//section[text()='Text Box']")).click();
			driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Someone");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anyone@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("who123@@");
			driver.findElement(By.xpath("//button[text()='Register']")).click();
		}
		@Test
		public void withtooltip() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapps.qspiders.com/ui/login");
			driver.findElement(By.xpath("//section[text()='Text Box']")).click();
			driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Someone");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anyone@gmail.com");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("who123@@");
			driver.findElement(By.xpath("//button[@type='submit']")).submit();
		}
		@Test
		public void multilinetextarea()
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapps.qspiders.com/ui/login");
			driver.findElement(By.xpath("//section[text()='Text Box']")).click();
			driver.findElement(By.xpath("//li[text()='Multiline Text Area']")).click();
			driver.findElement(By.xpath("//textarea[@id='name']")).sendKeys("Someone");
		    driver.findElement(By.xpath("//textarea[@type='email']")).sendKeys("anyone@gmail.com");
			driver.findElement(By.xpath("//textarea[@name='password']")).sendKeys("who123@@");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		@Test
		public void disabled() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapps.qspiders.com/ui/login");
			driver.findElement(By.xpath("//section[text()='Text Box']")).click();
			driver.findElement(By.xpath("//li[text()='Disabled']")).click();
			
		}
		}

