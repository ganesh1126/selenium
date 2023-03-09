package Library_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFile{

	
	public String readFileInExcel(String location,String sheetName,int rowNumber,int colNumber ) throws EncryptedDocumentException, IOException  {
		File pathFile = new File(location);
		FileInputStream fis = new FileInputStream(pathFile);
		Workbook workbook = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);
		String info = sheet.getRow(rowNumber).getCell(colNumber).toString();
		return info;
		
	}


	public String fromPropertyFile(String key) throws IOException {
		FileInputStream fis=null;
		Properties Properties  = null;
		
		try {
			fis=new FileInputStream(new File("./TestData/Agoda.properties"));
			Properties = new Properties();
			Properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return Properties.getProperty(key); 
	}
}
