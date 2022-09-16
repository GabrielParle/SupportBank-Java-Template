package training.supportbank;

import java.util.List;
import java.util.Objects;

public class CalcualateBalances {

        public static void calcBalance(List<Transaction> transactionList, List<User> userList){
            transactionList.forEach((transaction) -> {
                userList.forEach((user -> {
                    if (Objects.equals(user.userName, transaction.toUser)){
                        user.setBalanceAdd(transaction.amount);
                    }
                    if (Objects.equals(user.userName, transaction.fromUser)){
                        user.setBalanceMinus((transaction.amount));
                    }
                }));
            });
            userList.forEach(user -> System.out.println(user.userName + ' '+ user.getBalance()));
        }

}
