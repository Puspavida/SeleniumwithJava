package SeleniumProject.Funtionality;

import java.io.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.*;




public class PrintContentExcel {

	@Test
	public void ExcelDemo() throws IOException,InvalidFormatException{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Funtionality\\TestData\\Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		for(int i=0; i<=1;i++)//Select row
		{
			for(int j = 0; j<=2;j++)//Select cell
			{
				Cell c = wb.getSheet("Sheet1").getRow(i).getCell(j); // get row and cell value and store in c which is cell type
				System.out.print(c+"");
			}
		}
		System.out.println();
		
	}
}
