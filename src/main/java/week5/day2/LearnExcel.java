package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook = new XSSFWorkbook("./Data/CreateLead.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		System.out.println(rowNum);
		short cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNum);
		for (int i = 1; i <=rowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j <cellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}
		
	}

}
