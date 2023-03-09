package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_MultipleData_from_excel {

	public static void main(String[] args) throws IOException {
	
		File multipleData = new File("C:\\Users\\TYSS\\Pictures\\eclipse\\Selenium\\TestData\\MultipleData.xlsx");
		FileInputStream fis = new FileInputStream(multipleData);
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet multipleSheet = workbook.getSheet("Sheet1");
		int rowNum = multipleSheet.getPhysicalNumberOfRows();
		System.out.println(rowNum);
		int colNum =  multipleSheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(colNum);
		
		String [] []  data = new String[rowNum-1][colNum];
		for(int i=0; i<rowNum-1; i++) {
			for( int j=0; j<colNum; j++) {
				data[i][j] = multipleSheet.getRow(i+1).getCell(j).toString();
				
			}
		}
	}

}
