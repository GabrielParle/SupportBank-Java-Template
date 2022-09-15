package training.supportbank;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class CsvReader {
    //test
    public void test() throws IOException, ParseException {
        CSVReader reader = new CSVReader(new FileReader("src/main/Transactions2014.csv"), ',','\'',1);

        String[] nextLine;
        //creates a list of transaction objects.
        ArrayList<Transaction> allTransactions = new ArrayList<>();
        //reads one line at a time
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while ((nextLine = reader.readNext()) != null) {

            // test

            //System.out.println(nextLine[1]);
            // creates transaction objects from nextline and saves to current obj
            Transaction current = new Transaction(nextLine[2],nextLine[1],(Double.parseDouble(nextLine[4])),nextLine[3], sdf.parse(nextLine[0]));
            // saves current obj to alltransactions list.
            System.out.println(current.amount);

            allTransactions.add(current);
            //using the forEach loop to loop through the file
//            for (String token : nextLine) {
//                System.out.print(token);
//            }
            System.out.print("\n");
        }
        //ss
//        System.out.println(allTransactions.get(10).toUser);
//        System.out.println(allTransactions.get(10).fromUser);
//        System.out.println(allTransactions.get(10).date);

        //create an arraylist of users
        ArrayList<User> allUsers = new ArrayList<>();

        //
         allTransactions.stream().forEach((transaction)-> {

               List<String> userNameList = allUsers.stream().map((user) -> user.userName).collect(Collectors.toList());
                    if (!userNameList.contains(transaction.toUser)){
                        allUsers.add(new User(transaction.toUser));
                }
             if (!userNameList.contains(transaction.fromUser)){
                 allUsers.add(new User(transaction.fromUser));
             };
             //lets create a boolean check from the alltransactions toUser field and check against allUser ArrayList

                 });
            // System.out.println(allUsers.forEach(user -> user.userName));

    }
}
