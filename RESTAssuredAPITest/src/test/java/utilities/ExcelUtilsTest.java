package utilities;

public class ExcelUtilsTest {
	
	public static void main(String[] args) {
		
		
		//String projDir = System."user.dir")getProperty(
		String excelpath = "./test-data/testdata/xlsx";
		String sheetName = "sheet1";
		ExcelUtils excel = new ExcelUtils(excelpath, sheetName);
		
		excel.getRowCount();
		excel.getCellData(1, 0);
		
		
	}

}
