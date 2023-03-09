package DataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

// FULL FORM OF CSV IS COMMA SEPERATE VALUE
public class Toread_data_from_CSV {

	public static void main(String[] args) throws IOException, CsvException {
		// create file reader/ file input stream
		FileReader fr = new FileReader("./TestData/testdata.csv");
		
		//creation of file type object
		CSVReader reader = new CSVReader(fr);
		
		//read methods
//		String[] firstLineData = reader.readNext();
//		for(String data :firstLineData ) {
//			System.out.println(data+",");
//		}
		
		 List<String[]> allData = reader.readAll();
		 for(String[] sarr :allData ) {
			 for(String arr : sarr) {
				 System.out.print(arr+",");
			 }
			 System.out.println();
		 }
	}

}
