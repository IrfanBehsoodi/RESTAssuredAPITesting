package datadriventestcases;

import org.testng.annotations.DataProvider;

public class TestData {
	
	
	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost(){
		
		// Static data 
		Object[][] data = new Object[2][6];
		
		data[0][0] = 0;
		data[0][1] = "0";
		data[0][2] = "10";
		data[0][3] = "2020-07-28T09:02:39.482Z";
		data[0][4] = "placed";
		data[0][5] = "true";
		
		data[1][0] = 0;
		data[1][1] = "0";
		data[1][2] = "11";
		data[1][3] = "2020-07-29T09:02:39.482Z";
		data[1][4] = "placed";
		data[1][5] = "false";
		
		return data;
		
//		Or Dynamic data
//		return new Object [][] {
//			{0, "0", "10", "2020-07-28T09:02:39.482Z", "placed", "true"},
//			{0, "0", "11", "2020-07-29T09:02:39.482Z", "placed", "false"}
//			};
	}
	

	@DataProvider(name = "DeleteData")
	public Object[] dataForDelete(){
		 
		return new Object[] {
				12323, 23422, 22321
		};
			
	}
	
		

}
