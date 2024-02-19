package testNG_learning;

import org.testng.annotations.DataProvider;

public class DataprivderDifferentFile_Sourceclass {
	@DataProvider(name="Crediential")
	public String[][] getData() {
		String [][] data = new String[2][2];
		data[0][0]="ZAInTestLR@gmail.com";
		data[0][1]="Z@in123456";
		
		data[1][0]="ZAInTestLRY@gmail.com";
		data[1][1]="Z@in1234567";
		
		return data;
	}
	
}
