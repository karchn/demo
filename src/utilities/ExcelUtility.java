package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell celldata;
	
	
	public XSSFSheet SetWorkbook() throws IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\91877\\eclipse-workspace\\AirtelPortalApp\\src\\testData\\PrepaidData.xlsx");
	
		
		workbook = new XSSFWorkbook(fs);

		
		sheet = workbook.getSheet("Sheet1");
	
		return sheet;
		
	}
	
	
	public XSSFCell GetData(int rownum, int colnum) throws IOException {
		

		sheet = SetWorkbook();
		celldata = sheet.getRow(rownum).getCell(colnum);
		
		return celldata;
	}
	
	
}
