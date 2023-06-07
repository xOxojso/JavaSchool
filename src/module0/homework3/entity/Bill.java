package module0.homework3.entity;

public class Bill {
    private int amount;

    public Bill(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
                '}';
    }
}
