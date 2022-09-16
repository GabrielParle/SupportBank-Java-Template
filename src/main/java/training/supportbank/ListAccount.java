package training.supportbank;

import java.util.List;
import java.util.Objects;

public class ListAccount {

    public static void listingPrint(List<Transaction> transactionList, List<User> userList,String userName){
        transactionList.forEach((transaction) -> {

//
                if (Objects.equals(userName, transaction.toUser)){
                    System.out.println("Amount Sent: "+transaction.amount);
                    System.out.println("Sent to: "+transaction.toUser);
                    System.out.println("Narrative: "+transaction.narrative);
                    System.out.println("Date: "+transaction.date);
                    System.out.println("\n");
                }
                if (Objects.equals(userName, transaction.fromUser)){
                    System.out.println("Amount Recived: "+transaction.amount);
                    System.out.println("Sent from: "+transaction.toUser);
                    System.out.println("Narrative: "+transaction.narrative);
                    System.out.println("Date: "+transaction.date);
                    System.out.println("\n");
                }
//
        });
    }
}
