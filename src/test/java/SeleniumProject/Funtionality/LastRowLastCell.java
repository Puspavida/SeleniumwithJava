package SeleniumProject.Funtionality;

import java.io.*;
import org.testng.annotations.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class LastRowLastCell {
	
	@Test
	public void ExcelDemo2() throws IOException,InvalidFormatException{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\TestData\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rc = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(rc);
		int cc = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(cc);
		
	}

}
