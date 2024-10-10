
package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Complete_Row_OR_Cell_Data {
@Test
public void m1() throws Exception {
////	//For Fetching Complete column data 
//	  FileInputStream fis2 =new FileInputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Wrokbook.xlsx");
//	   Workbook wb=WorkbookFactory.create(fis2);
//	  Sheet sh=wb.getSheet("practise");
//	  
//	  int rcount=sh.getLastRowNum();
//	  DataFormatter format=new DataFormatter();
//	  
//	  for(int i=1;i<=rcount;i++) {
//		  String s1=format.formatCellValue(sh.getRow(i).getCell(1));//Fetch the second column till the end
//		  //String s2=format.formatCellValue(sh.getRow(i).getCell(2));
//  System.out.println(s1);//+"\t"+s2);
//	  }
	//For Fetching Complete column data 
//	  FileInputStream fis2 =new FileInputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Wrokbook.xlsx");
//	   Workbook wb=WorkbookFactory.create(fis2);
//	  Sheet sh=wb.getSheet("practise");
//	  
//	  Row r=sh.getRow(1);
//	  DataFormatter format=new DataFormatter();
//	  int ccount=r.getLastCellNum();
//	  for(int i=1;i<=ccount;i++) {
//		  String s1=format.formatCellValue(sh.getRow(1).getCell(i));//Fetch the second column till the end
//		  //String s2=format.formatCellValue(sh.getRow(i).getCell(2));
//System.out.println(s1);//+"\t"+s2);
//	  }
}
}
