package training.supportbank;

public class User {

    public String userName;
    private float balance = 0;

    //constructor function for username
    public User (String userName){
        this.userName = userName;
    }


    public float getBalance() {
        return balance;
    }

    public void setBalance(float updateBalance){
        balance += updateBalance;
    }
}
