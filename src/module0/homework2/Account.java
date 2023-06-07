package module0.homework2;

public class Account {
    private Person person;
    private Bill bill;

    public Account(Person person, Bill bill) {
        this.person = person;
        this.bill = bill;
    }

    public Person getPerson() {
        return person;
    }

    public Bill getBill() {
        return bill;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
