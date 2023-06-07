package module0.homework2.service;

import module0.homework2.Account;
import module0.homework2.Payment;

public class PaymentService {
    public static void withdrawMoney(Account account, int amount) {
        int amount1 = account.getBill().getAmount();
        if (amount1 < amount) {
            System.out.println("Невозможно произвести платеж");
            return;
        } else {
            account.getBill().setAmount(amount1 - amount);
            System.out.println("Операция прошла успешно, текущее значение счета: " + account.getBill().getAmount());
        }
    }
}
