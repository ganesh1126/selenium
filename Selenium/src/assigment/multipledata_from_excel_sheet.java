package assigment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class multipledata_from_excel_sheet {

	public static void main(String[] args) throws IOException {
	File md = new File("C:\\\\Users\\\\TYSS\\\\Pictures\\\\eclipse\\\\Selenium\\\\TestData\\\\MultipleData.xlsx");
	FileInputStream fis = new FileInputStream(md);
	
	Workbook workbook = WorkbookFactory.create(fis);
	
	Sheet ms = workbook.getSheet("Sheet1");
	int rowNum = ms.getPhysicalNumberOfRows();
	System.out.println(rowNum);
	int colNum =  ms.getRow(0).getPhysicalNumberOfCells();
	System.out.println(colNum);
	

	String [] []  data = new String[rowNum-1][colNum];
	for(int i=0; i<rowNum-1; i++) {
		for( int j=0; j<colNum; j++) {
			data[i][j] = ms.getRow(i+1).getCell(j).toString();
			
		}
	}
	}

}
