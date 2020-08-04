package com.TestNGDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {
	static Workbook book;
	static Sheet sheet;
	public static String testData_Sheet_Path = "C:\\Users\\Nayeem\\Desktop\\Selenium With Java"
			+ "\\MavenProject_TestNG_DataProvider\\TestData\\LoginTestData.xlsx";

	public static Object[][] getTestData(String sheetName) {

		FileInputStream file = null;
		try {
			file = new FileInputStream(testData_Sheet_Path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i<sheet.getFirstRowNum(); i++) {
			for (int j = 0; j<sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return data;

	}

}

