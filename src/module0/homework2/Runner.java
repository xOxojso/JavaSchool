package module0.homework2;

import module0.homework2.service.DepositService;
import module0.homework2.service.PaymentService;
import module0.homework2.service.TransferService;

public class Runner {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", "Ivanov", "+232313");
        Bill ivanBill = new Bill(4000);
        Account ivanAcc = new Account(ivan, ivanBill);

        Person oleg = new Person("Oleg", "Olegovich", "+8766896");
        Bill olegBill = new Bill(6000);
        Account olegAcc = new Account(oleg, olegBill);

        PaymentService.withdrawMoney(olegAcc, 2000);

        DepositService.addMoney(ivanAcc, 3000);

        TransferService.transfer(ivanAcc, olegAcc, 2000);
        System.out.println(ivanAcc.getBill().getAmount());
        System.out.println(olegAcc.getBill().getAmount());
    }
}
