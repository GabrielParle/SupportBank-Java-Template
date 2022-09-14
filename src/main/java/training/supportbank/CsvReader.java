package training.supportbank;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CsvReader {
    //test
    public void test() throws IOException {
        CSVReader reader = new CSVReader(new FileReader("src/main/Transactions2014.csv"), ',');

        String[] nextLine;
//reads one line at a time
        while ((nextLine = reader.readNext()) != null) {
            for (String token : nextLine) {
                System.out.print(token);
            }
            System.out.print("\n");
        }
    }




}
