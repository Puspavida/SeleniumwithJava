package SeleniumProject.Funtionality;

import java.io.*;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;


public class ExcelData1 {

	@Test
	public void ExcelDataDemo() {
		try {
			//getting the excel file path
			FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\TestData\\Testdata.xlsx");
			//read the excel file by using Workbook class
			Workbook wb = WorkbookFactory.create(fis);
			//reading the rows and cell
			Cell c = wb.getSheet("Sheet1").getRow(0).getCell(0);
			System.out.println(c);
		}catch(EncryptedDocumentException e)
		{
			System.out.println("EncryptedDocumentException");
		}
		catch(IOException e) {
			System.out.println("IOException");
		}catch(InvalidFormatException e) {
			System.out.println("InvalidFormatException");
		}
	}
}
