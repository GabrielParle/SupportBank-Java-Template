package training.supportbank;

import java.math.BigDecimal;

public class User {

    public String userName;
    private BigDecimal balance = BigDecimal.valueOf(0);

    public User (String userName){
        this.userName = userName;
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalanceAdd(BigDecimal updateBalance){
        balance = (balance.add(updateBalance));
    }
    public void setBalanceMinus(BigDecimal updateBalance){
        balance = (balance.subtract(updateBalance));
    }
}
