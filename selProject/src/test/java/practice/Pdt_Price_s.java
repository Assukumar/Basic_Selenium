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
 * Go to amazon search phone are push all mobile phone and price in on excel sheet 
 */
public class Pdt_Price_s {
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
		Sheet sh = wb.createSheet("amazon40");
		Sheet sh1 = wb.createSheet("amazon41");
		List<WebElement> productNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (int i = 0; i < productNames.size(); i++) 
	{
		sh.createRow(i).createCell(0).setCellValue(productNames.get(i).getText());
			System.out.println(productNames.get(i).getText()+"\t"+prices.get(i).getText());
		sh.getRow(i).createCell(1).setCellValue(prices.get(i).getText());

		}
		int rowIndex = 0;

        for (int i = 0; i < productNames.size(); i++) {
            String priceText = prices.get(i).getText();
            int intValue = Integer.parseInt(priceText.replace(",", ""));

            if (intValue >= 15000) {
                Row row = sh1.createRow(rowIndex++);
                row.createCell(0).setCellValue(productNames.get(i).getText());
                row.createCell(1).setCellValue(prices.get(i).getText());
            }
        }
		
		FileOutputStream fos =new FileOutputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Practice.xlsx");
		wb.write(fos);
		wb.close();
}
}