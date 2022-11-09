package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Armazenar.Generic.Excel_Data;

public class ExcelData {

	//@Test(dataProvider = "exceldata")
	public void places(String name, String price) {
		System.out.println(name+"--------"+price);
	}
	
	@DataProvider
	public Object[][] exceldata() throws Exception {
		Excel_Data flib=new Excel_Data();
			Object[][] value = flib.excel_Data("Sheet1");
			return value;
	}
}
