package Generic;

import java.io.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Excel {
	
	public static String getCellData(String xlspath, String sheet, int row, int cell) {
		String v ="";
		try {
			FileInputStream fis = new FileInputStream(xlspath);
			Workbook wb = WorkbookFactory.create(fis);
			v=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		}catch(Exception e)
		{
			System.out.println("Exception");
		}
		return v;
	
		
		}
		
	public static int getRowData(String xlspath, String sheet) {
		int rc = 0;
		try {
			FileInputStream fis = new FileInputStream(xlspath);
			Workbook wr=WorkbookFactory.create(fis);
			rc=wr.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
		
		return rc;
	}
	

}
