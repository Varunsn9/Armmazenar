package com.Armazenar.Generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_Data extends BaseClass{
	//@Test
	public Object[][] excel_Data(String sheetName) throws Exception {
		FileInputStream fis=new FileInputStream("./src/main/resources/ExcelData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int lastRow = sh.getLastRowNum()+1;
		short lastCell = sh.getRow(0).getLastCellNum();
	Object[][] obj=new Object[lastRow][lastCell];
		for(int i=0 ; i<lastRow ;i++) {
			for(int j=0;j<lastCell ; j++) {
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
	return obj;
	}
}
