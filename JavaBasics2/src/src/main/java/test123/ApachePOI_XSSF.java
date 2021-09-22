package test123;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ApachePOI_XSSF {
  @Test
  public void f() {
	  
	  
	  File src = new File("F:\\Selenium\\TestData.xlsx");
      
      FileInputStream fis = new FileInputStream(src);
     
      XSSFWorkbook wb = new XSSFWorkbook(fis);
     
      XSSFSheet sheet = wb.getSheetAt(0);
     
      System.out.println(sheet.getLastRowNum());
             
      System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
     
      System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
     
      System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
             
      sheet.getRow(5).createCell(2).setCellValue("FAIL");
     
      FileOutputStream fout = new FileOutputStream(src);
     
      wb.write(fout);
     
      wb.close();
     
  }
  }
}
