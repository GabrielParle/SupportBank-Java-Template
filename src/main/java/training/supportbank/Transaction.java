package training.supportbank;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    String toUser;
    String fromUser;
    String amount;
    String narrative;
    String date;

    public Transaction(String toUser, String fromUser, String amount, String narrative, String date){
        this.toUser = toUser;
        this.fromUser = fromUser;
        this.amount = amount;
        this.narrative = narrative;
        this.date = date;

    }

}
