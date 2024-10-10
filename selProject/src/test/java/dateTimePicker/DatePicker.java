package dateTimePicker;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
	@Test
	 public void simpleDatePicker() {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://demoapps.qspiders.com/ui");
			
			 Calendar cal=Calendar.getInstance(); 
			  java.util.Date d=cal.getTime();
			  SimpleDateFormat sdf =new SimpleDateFormat("MM/dd/YYYY"); 
			  String s=sdf.format(d);
			 
		 driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		 driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).sendKeys(s);
		
	 }
	@Test
	 public void dropDownDatePicker() {
		 
	 }
	@Test
	 public void iconTrigger() {
		 
	 }
}
