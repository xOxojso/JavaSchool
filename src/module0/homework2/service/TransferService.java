package module0.homework2.service;

import module0.homework2.Account;

public class TransferService {
    public static void transfer(Account from, Account to, int amount) {
        if(from.getBill().getAmount() < amount) {
            System.out.println("невозможно совершить операцию");
        } else {
            int amount1 = from.getBill().getAmount();
            int amount2 = to.getBill().getAmount();
            to.getBill().setAmount(amount2 + (amount1 - amount));
            from.getBill().setAmount(amount1 - amount);
        }
    }
}
