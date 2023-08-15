package week7.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {
	
	static String[][] data ;;

	public static Object[][] readExcelData(String fileName) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook xBook = new XSSFWorkbook("./data/"+fileName);
		XSSFSheet xSheet = xBook.getSheetAt(0);
		
		int rows = xSheet.getLastRowNum();
		
		System.out.println("No of rows are "+rows);
		
		XSSFRow row = xSheet.getRow(1);
		int colmns = row.getLastCellNum();
		
		System.out.println("No of columns are "+colmns);
		
		XSSFCell cell = xSheet.getRow(2).getCell(1);
		
		data = new String[rows][colmns];
		
		for(int i=1;i<=rows;i++) {
			XSSFRow rowData = xSheet.getRow(i);
			
			for(int j=0;j<colmns;j++) {
				XSSFCell cellData = rowData.getCell(j);
				data[i-1][j]= cellData.getStringCellValue();
				
			}
		}
		
		return data;
	}

}
