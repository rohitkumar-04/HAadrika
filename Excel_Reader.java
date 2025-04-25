package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reader {
	
	public static String[] readData(String filePath) throws Exception {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook wk = WorkbookFactory.create(fis);
		Sheet sh = wk.getSheetAt(0); // First Sheet

		Row rw = sh.getRow(1); // Read Second row (index 1), first is header
		 int numCl = rw.getLastCellNum(); // Total cells in the row	
		 
		String[] data = new String[numCl];
		
		for (int i = 0; i < data.length; i++) {
			Cell cel = rw.getCell(i);

			if (cel != null) {				
				cel.setCellType(CellType.STRING); // make sure every thing is String
				data[i] = cel.getStringCellValue();
			} else {
				data[i] = "";
			}
		}

		wk.close();
		fis.close();
		return data;
	}

}
