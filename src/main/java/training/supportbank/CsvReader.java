package training.supportbank;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CsvReader {
    //test
    public void test() throws IOException {
        CSVReader reader = new CSVReader(new FileReader("src/main/Transactions2014.csv"), ',');

        String[] nextLine;
        //creates a list of transaction objects.
        List<Transaction> allTransactions = new ArrayList<>();
        //reads one line at a time

        while ((nextLine = reader.readNext()) != null) {
// test

            //System.out.println(nextLine[1]);
            // creates transaction objects from nextline and saves to current obj
            Transaction current = new Transaction(nextLine[2],nextLine[1],nextLine[4],nextLine[3],nextLine[0]);
            // saves current obj to alltransactions list.
            allTransactions.add(current);
//            for (String token : nextLine) {
//                System.out.print(token+ "@");
//            }
            System.out.print("\n");

        }

        System.out.println(allTransactions.get(10).toUser + "last");

    }




}
