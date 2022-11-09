package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	//@Test(dataProvider="Additional_data")
	public void bookTicket(String src,String dst)
	{
		System.out.println("Book tickets from "+src+" to "+dst+"");
	}
	@DataProvider
	public Object[][] dataProvider_test(){
		Object[][] objArr=new Object[5][2];

		objArr[0][0]="Bengaluru";
		objArr[0][1]="Hubli";

		objArr[1][0]="Bengaluru";
		objArr[1][1]="Mysore";

		objArr[2][0]="Bengaluru";
		objArr[2][1]="Goa";

		objArr[3][0]="Bengaluru";
		objArr[3][1]="Delhi";

		objArr[4][0]="Bengaluru";
		objArr[4][1]="Gadag";

		return objArr;
	}
	@DataProvider
	public Object[][] Additional_data(){
		Object[][] objArray=new Object[3][2];
		objArray[0][0]="Varun";
		objArray[0][1]="Java";
		
		objArray[1][0]="Varun";
		objArray[1][1]="Selenium";
		
		objArray[2][0]="Varun";
		objArray[2][1]="C#";
		
		return objArray;
	}

}
