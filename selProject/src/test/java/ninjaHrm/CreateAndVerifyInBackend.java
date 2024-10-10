package ninjaHrm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAndVerifyInBackend {
	@Test
     public void createAndVerify() throws Exception {
    	 String projName="BooB0001";
    	 //create project in frontEnd
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("http://106.51.90.215:8084/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.findElement(By.name("username")).sendKeys("rmgyantra");
         driver.findElement(By.name("password")).sendKeys("rmgy@9999");
         driver.findElement(By.xpath("//button[.='Sign in']")).click();

         driver.findElement(By.xpath("//a[.='Projects']")).click();
         driver.findElement(By.xpath("//span[.='Create Project']")).click();
         driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(projName);
         driver.findElement(By.xpath("//input[@value='Add Project']")).click();
         
         //Verify the project in Backend DB
          boolean flag=false;
        Connection conn = DriverManager.getConnection("jdbc:mysql://106.51.90.215:3333/projects", "root@%", "root");
         Statement stat = conn.createStatement();
          
         ResultSet resultSet = stat.executeQuery("select * from project;");
         while (resultSet.next()) {
             String actProjName= resultSet.getString(4);// + " " + resultSet.getString(2));
         if(projName.equals(actProjName)) {
        	 flag=true;
        	 System.out.println(projName+"is present");
         }
       } 
        if(flag=false) {
        	System.out.println(projName+"Not present");
        	Assert.fail();
        }
         conn.close();
         
     }
}
