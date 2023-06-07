package module0.homework3.entity;

import java.util.List;

public class Hotel {
    private String nameOfHotel;
    private List<Room> rooms;

    public Hotel(String nameOfHotel, List<Room> rooms) {
        this.nameOfHotel = nameOfHotel;
        this.rooms = rooms;
    }

    public String getNameOfHotel() {
        return nameOfHotel;
    }

    public void setNameOfHotel(String nameOfHotel) {
        this.nameOfHotel = nameOfHotel;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
