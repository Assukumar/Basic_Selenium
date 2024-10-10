import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon_DropDown_CheckBox {
    @Test
    public void m1() {
    	
    	
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.amazon.in/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	WebElement findElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    	Select s=new Select(findElement);
    	s.selectByVisibleText("Amazon Fashion");
    	driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("shirts",Keys.ENTER);
    	driver.findElement(By.xpath("//span[.='Get It by Tomorrow']/../div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']")).click();
    }
}
