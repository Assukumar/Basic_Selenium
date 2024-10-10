package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SSL_Popup {
       @Test
       public void ssl() {
       ChromeOptions op=new ChromeOptions();
//       op.addArguments("--ignore-certificate-error");
//       op.addArguments("--allow-insecure-localhost");
       op.setAcceptInsecureCerts(true);
       WebDriver driver=new ChromeDriver(op);
       driver.get("https://expired.badssl.com/");
}
}