package assigment;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Tounderstand_CSV_files {

	public static void main(String[] args) throws IOException, CsvException {
		// create FR/FIS
		FileReader fr = new FileReader("./TestData/test1.csv");
		
		//creation  of file type object
		CSVReader reader = new CSVReader(fr);
		
		//apppropriate  read method
		/* String[] firstlinedata = reader.readNext();
		for(String data :firstlinedata ) {
			System.out.println(data);
		}*/
		
		List<String[]> alldata = reader.readAll();
		for(String[] arrdata : alldata) {
			for(String  arr: arrdata) {
				System.out.print(arr);
			}
			System.out.println();
		}
		

	}

}
