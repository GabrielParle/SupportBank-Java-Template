package training.supportbank;
import java.util.*;

public class Userinput {
    public static void requestUserInput () {
        boolean running = true;
            Scanner sc = new Scanner(System.in); //System.in is a standard input stream
            System.out.print("Do you want to (A)List All names of people or (B)List all transactions - Press a or b:");
            //reads string
            String str = sc.nextLine();
            //if user types a in console system to display all names
            if (str.equals("a")) {
                System.out.println("names of users and bal");
            } else if (str.equals("b")) {
                System.out.println("list of trnxs");
            }
    }
}
