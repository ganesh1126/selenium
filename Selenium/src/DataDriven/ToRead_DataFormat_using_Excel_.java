package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToRead_DataFormat_using_Excel_ {

	public static void main(String[] args) throws IOException {
		
		// create object  FR/FIS
		FileInputStream fis = new FileInputStream("./TestData/sheets.xlsx");
		
		//object of file type
		Workbook wb = WorkbookFactory.create(fis);
		
		//read method
		
		String testdata = wb.getSheet("sheet1").getRow(0).getCell(0).toString();
		System.out.println(testdata);
		
		String  testdata1 = wb.getSheet("sheet1").getRow(3).getCell(10).toString();
		System.out.println(testdata1);
		
		

	}

}
