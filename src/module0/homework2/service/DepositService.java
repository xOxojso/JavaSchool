package module0.homework2.service;

import module0.homework2.Account;
import module0.homework2.Deposit;

public class DepositService {
    public static void addMoney(Account account , int amount) {
        account.getBill().setAmount(account.getBill().getAmount() + amount);
        System.out.println("Операция выполнена, текущее значение счета: " + account.getBill().getAmount());
    }
}
