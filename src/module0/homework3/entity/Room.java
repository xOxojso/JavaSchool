package module0.homework3.entity;

public class Room {
    private int countOfPeople;
    private int price;
    private boolean isFree;

    public Room(int countOfPeople, int price, boolean isFree) {
        this.countOfPeople = countOfPeople;
        this.price = price;
        this.isFree = isFree;
    }

    public void addPersonToRoom() {
        countOfPeople++;
    }

    public int getCountOfPeople() {
        return countOfPeople;
    }

    public void setCountOfPeople(int countOfPeople) {
        this.countOfPeople = countOfPeople;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
