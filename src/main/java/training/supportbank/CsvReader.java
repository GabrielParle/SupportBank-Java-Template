package training.supportbank;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CsvReader {
    //test
    public void test() throws IOException {
        CSVReader reader = new CSVReader(new FileReader("src/main/Transactions2014.csv"), ',');

        String[] nextLine;
        //creates a list of transaction objects.
        ArrayList<Transaction> allTransactions = new ArrayList<>();
        //reads one line at a time

        while ((nextLine = reader.readNext()) != null) {

            // test
            //System.out.println(nextLine[1]);
            // creates transaction objects from nextline and saves to current obj
            Transaction current = new Transaction(nextLine[2],nextLine[1],nextLine[4],nextLine[3],nextLine[0]);
            // saves current obj to alltransactions list.
            allTransactions.add(current);
            //using the forEach loop to loop through the file
//            for (String token : nextLine) {
//                System.out.print(token);
//            }
            System.out.print("\n");
        }
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
                };
             //lets create a boolean check from the alltransactions toUser field and check against allUser ArrayList

                 });
             //System.out.println(allUsers.get(2).userName);

    }
}
