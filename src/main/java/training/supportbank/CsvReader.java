package training.supportbank;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;



public class CsvReader {
//test
    public void test(){
        CSVReader reader = new CSVReader(new FileReader("emps.csv"), ',');
    }

}
