package training.supportbank;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class Userinput {
    public boolean requestUserInput () throws IOException, ParseException {
        CsvReader csv = new CsvReader();
        csv.test();
        boolean running = true;
            Scanner sc = new Scanner(System.in); //System.in is a standard input stream
            System.out.print("Do you want to (A)List All names of people or (B)List all transactions - Press a or b:");
            //reads string
            String str = sc.nextLine();
            ArrayList<Transaction> allTransactions =  csv.getTransactionsList();
            ArrayList<User> allUsers =  csv.getAllUsers();
            //if user types a in console system to display all names
            if (str.equals("a")) {
                running = false;
                CalcualateBalances.calcBalance(allTransactions, allUsers);
            } else if (str.equals("b")) {
                System.out.println("Please enter name of User?");
                String nameLookUp = sc.nextLine();
                ListAccount.listingPrint(allTransactions, allUsers, nameLookUp);
                running = false;
            }
            return running;
    }
}
