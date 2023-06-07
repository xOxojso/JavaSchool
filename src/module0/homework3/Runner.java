package module0.homework3;

import module0.homework3.entity.Bill;
import module0.homework3.entity.Client;
import module0.homework3.entity.Hotel;
import module0.homework3.entity.Room;
import module0.homework3.service.BookingService;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Client client1 = new Client("Ivan", "Ivanov", "+32762", "ivan@gmail.ru", new Bill(10000));
        Client client2 = new Client("Petr", "Petrov", "+23134", "petr@gmail.ru", new Bill(5000));
        Client client3 = new Client("Sergey", "Sergeev", "+67744", "sergey@gmail.ru", new Bill(2000));
        Client client4 = new Client("Oleg", "Olegov", "+675454", "oleg@gmail.ru", new Bill(4000));
        Hotel hotel1 = new Hotel("DE Luna",
                List.of(new Room(4, 5000, true), new Room(1, 500, true),
                        new Room(2, 2000, true), new Room(3, 2500, true)));


        Hotel hotel2 = new Hotel("Cosmos",
                List.of(new Room(1, 5000, true), new Room(1, 3000, true),
                        new Room(2, 6000, true), new Room(3, 7000, true)));


        BookingService.booking(hotel1, client1, 2);
        BookingService.booking(hotel1, client2, 1);
        BookingService.booking(hotel1, client3, 3);
        BookingService.booking(hotel1, client4, 4);

        BookingService.booking(hotel2, client3, 1);
        BookingService.booking(hotel2, client4, 2);
    }
}
