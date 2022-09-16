package training.supportbank;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Transaction {
    String toUser;
    String fromUser;
    BigDecimal amount;
    String narrative;
    Date date;

    public Transaction(String toUser, String fromUser, BigDecimal amount, String narrative, Date date){
        this.toUser = toUser;
        this.fromUser = fromUser;
        this.amount = amount;
        this.narrative = narrative;
        this.date = date;

    }

}
