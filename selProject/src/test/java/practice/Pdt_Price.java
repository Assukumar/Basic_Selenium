package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
 * Go to amazon search phone are push which mobile phone value is greater than 15000
 */
public class Pdt_Price {
    @Test
    public void m1() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
        driver.findElement(By.id("nav-search-submit-button")).click();

        FileInputStream fis = new FileInputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Practice.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.createSheet("amazon8");

        List<WebElement> productNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        int rowIndex = 0;

        for (int i = 0; i < productNames.size(); i++) {
            String priceText = prices.get(i).getText();
            int intValue = Integer.parseInt(priceText.replace(",", ""));

            if (intValue >= 15000) {
                Row row = sh.createRow(rowIndex++);
                row.createCell(0).setCellValue(productNames.get(i).getText());
                row.createCell(1).setCellValue(prices.get(i).getText());
            }
        }

        FileOutputStream fos = new FileOutputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Practice.xlsx");
        wb.write(fos);
        fos.close();
        wb.close();
        driver.quit();  // Close the browser after execution
    }
}
