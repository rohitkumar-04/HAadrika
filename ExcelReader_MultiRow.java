package utils;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader_MultiRow {

	public static List<String[]> getExcelData(String filePath) {

		List<String[]> dataList = new ArrayList<>();

		try (FileInputStream fis = new FileInputStream(filePath);
				Workbook wk = WorkbookFactory.create(fis)) {

			Sheet sh = wk.getSheetAt(0);
			int totalRows = sh.getPhysicalNumberOfRows();

			for (int r = 1; r < totalRows; r++) { // Skip header row (start from 1)
				Row row = sh.getRow(r);
				if (row == null)
					continue;

				int totalCols = row.getLastCellNum();
				String[] data = new String[totalCols];

				for (int c = 0; c < data.length; c++) {
					Cell cell = row.getCell(c, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
					cell.setCellType(CellType.STRING);
					data[c] = cell.getStringCellValue().trim();
				}

				dataList.add(data);
				wk.close();
				fis.close();

			}

		} catch (Exception e) {
			System.out.println("Data is blank kindly check");
			e.printStackTrace();
		}

		return dataList;
	}
}
