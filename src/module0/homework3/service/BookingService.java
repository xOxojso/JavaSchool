package module0.homework3.service;

import module0.homework3.entity.Client;
import module0.homework3.entity.Hotel;
import module0.homework3.entity.Room;

import java.util.List;

public class BookingService {
    public static void booking(Hotel hotel, Client client, int numOfPerson) {
        List<Room> rooms = hotel.getRooms();
        boolean isFree = false;
        for (Room room : rooms) {
            if (room.isFree()) {
                isFree = true;
            }
        }

        if (!isFree) {
            System.out.println("Свободных номеров в отеле " + hotel.getNameOfHotel() + " нет");
        }

        bookRoom(client, numOfPerson, rooms);
    }

    private static void bookRoom(Client client, int numOfPerson, List<Room> rooms) {
        boolean success = false;
        for (Room room : rooms) {
            if (room.getCountOfPeople() == numOfPerson) {
                success = true;
                if (client.getBill().getAmount() >= room.getPrice()) {
                    client.getBill().setAmount(client.getBill().getAmount() - room.getPrice());
                    room.setFree(false);
                    System.out.println("Бронь произошла " + client.getName());
                } else {
                    System.out.println("недостаточно денег для бронирования номера " + client.getName());
                }
            }
        }

        if (!success) {
            System.out.println("не нашлось номера для клиента " + client.getName());
        }
    }
}
