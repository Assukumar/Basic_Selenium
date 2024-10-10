package selProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xxx {
	public void setData(String sh,int r,int c,String data) throws Exception {
	 FileInputStream fis2 =new FileInputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Wrokbook.xlsx");
	   Workbook wb=WorkbookFactory.create(fis2);
	   Sheet sh1=wb.getSheet("practise");//getRow(2).createCell(2).setCellValue(data);
	  Row r1=sh1.getRow(1);
	  Cell c2=r1.createCell(4);
	  
	  //c.setCellType(CellType.STRING);
	  c2.setCellValue(data);
		  
		  FileOutputStream fish =new FileOutputStream("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Wrokbook.xlsx");
		  wb.write(fish);
		  wb.close();
		//return data;
		
}
}