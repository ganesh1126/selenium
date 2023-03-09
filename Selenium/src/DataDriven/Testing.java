package DataDriven;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Library_package.ReadFile;


public class Testing {
	
	@Test
	public void imTesting() throws EncryptedDocumentException, IOException {
		ReadFile r1 = new ReadFile();
		System.out.println(r1.readFileInExcel("./TestData/Agonda.xlsx", "Sheet1", 0, 2));
	}
}
