package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SSL_popoup {
	@Test
     public void ssl() {
    	 ChromeOptions op=new ChromeOptions();
    	 op.setAcceptInsecureCerts(true);
    	 WebDriver driver=new ChromeDriver(op);
    	 
    	 driver.get("http://www.cacert.org/");
     }
}
