package training.supportbank;

import java.util.ArrayList;

public class ListMaker {
    private ArrayList<Transaction> allTransactions = new ArrayList<>();
    private ArrayList<User> allUsers = new ArrayList<>();
    //test

   // public void (){};

    public ArrayList<Transaction> getTransactionsList() {
        return allTransactions;
    }
    public ArrayList<User> getAllUsers(){
        return allUsers;
    }
}
