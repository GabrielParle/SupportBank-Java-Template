package training.supportbank;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class Userinput {

    private Scanner sc = new Scanner(System.in);
    public boolean running = true;
    public boolean requestUserInput () throws IOException, ParseException {
        CsvReader csv = new CsvReader();
        csv.test();


             //System.in is a standard input stream
            System.out.print("Do you want to (A)List All names of people or (B)List all transactions - Press a or b:");
            //reads string
            String str = sc.nextLine();
            ArrayList<Transaction> allTransactions =  csv.getTransactionsList();
            ArrayList<User> allUsers =  csv.getAllUsers();
            //if user types a in console system to display all names
            if (str.equals("a")) {

                CalcualateBalances.calcBalance(allTransactions, allUsers);
                runAgain();
            } else if (str.equals("b")) {
                System.out.println("Please enter name of User?");
                String nameLookUp = sc.nextLine();
                ListAccount.listingPrint(allTransactions, allUsers, nameLookUp);
                runAgain();
            }
            return running;


    }

    public void runAgain(){
        System.out.println("do you want to run another command y or n?");
        String yesNo = sc.nextLine();
        if(yesNo.equals("y") ){
            running = true;
        } else {
            running = false;
        }


    }
}
