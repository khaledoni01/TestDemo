package testingDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.dev.XSSFSave;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static Object[][] readExcel() throws IOException{
				
		String filePath = "C:\\Users\\khale\\OneDrive\\Desktop\\Misc\\NK TECH Solutions\\Automation\\pdf\\testing.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(0).getLastCellNum();
				
		String[][] data = new String[rows][cells];
				
		for(int r=1; r<=rows; r++) {
			
			for(int c=0; c<cells; c++) {
				
				data[r-1][c] = sheet.getRow(r).getCell(c, MissingCellPolicy.CREATE_NULL_AS_BLANK).getStringCellValue();
			}
		}
		
		return data;
		

	}

}
