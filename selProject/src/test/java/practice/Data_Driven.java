package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;



public class Data_Driven {
	@Test
   public  void m1() throws Exception {
//	   //Syntax for fetch data from properties file
//	   FileInputStream fis1 =new FileInputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\V_tiger.properties");
//	   Properties pobj=new Properties();
//	   pobj.load(fis1);
//	   String Browser=pobj.getProperty("browser");
//	   String Url=pobj.getProperty("url");
//	   String uname=pobj.getProperty("username");
//	   String pwd=pobj.getProperty("password");
	   
	 //Syntax for fetch data from Excel file  
//	   FileInputStream fis2 =new FileInputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Wrokbook.xlsx");
//	   Workbook wb=WorkbookFactory.create(fis2);
//	  Sheet sh=wb.getSheet("practise");
//   	DataFormatter format=new DataFormatter();
//        String cellValue=format.formatCellValue( sh.getRow(1).getCell(3));
//                        //sh.getRow(1).getCell(3).toString();
//        System.out.println(cellValue);
//        wb.close();
		
		 //Syntax for fetch data from multple data from Excel file 
		
//		   FileInputStream fis2 =new FileInputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Wrokbook.xlsx");
//		   Workbook wb=WorkbookFactory.create(fis2);
//		  Sheet sh=wb.getSheet("practise");
//		  
//		  int rcount=sh.getLastRowNum();
//		  DataFormatter format=new DataFormatter();
//		  
//		  for(int i=1;i<=rcount;i++) {
//			  String s1=format.formatCellValue(sh.getRow(i).getCell(1));
//			  //String s2=format.formatCellValue(sh.getRow(i).getCell(2));
//       System.out.println(s1);//+"\t"+s2);
//		  }
//		  
//			 //Syntax for fetch data according user condition from Excel file 
//          String expId="Tc_02";
//          String d1="";
//          String d2="";
//          String d3="";
//		  FileInputStream fis2 =new FileInputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Wrokbook.xlsx");
//		   Workbook wb=WorkbookFactory.create(fis2);
//		  Sheet sh=wb.getSheet("practise");
//		  DataFormatter format=new DataFormatter();
//		  int rcount=sh.getLastRowNum();
//		  for(int i=1;i<=rcount;i++) {
//		  String data="";
//		  try {
//			  data=format.formatCellValue(sh.getRow(i).getCell(0));
//			  if(data.equals(expId)) {
//				d1=format.formatCellValue(sh.getRow(i).getCell(1));
//						d2=format.formatCellValue(sh.getRow(i).getCell(2));
//
//						d1=format.formatCellValue(sh.getRow(i).getCell(3));
//						}
//		  }catch (Exception e) {}
//			System.out.println(d1);
//			System.out.println(d2);
//			System.out.println(d3);
// }
//			 //Syntax for Read data back to Excel file 
//		  
//		  FileInputStream fis2 =new FileInputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Wrokbook.xlsx");
//	   Workbook wb=WorkbookFactory.create(fis2);
//	   wb.getSheet("practise").getRow(2).createCell(2).setCellValue("data");
//	  Row r=sh.getRow(1);
//	  Cell c=r.createCell(4);
//	  //c.setCellType(CellType.STRING);
//	  c.setCellValue(500);
//		  
//		  FileOutputStream fish =new FileOutputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Wrokbook.xlsx");
//		  wb.write(fish);
//		  wb.close();
		  

}}
