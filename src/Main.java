import com.danis.oop.Flat;
import com.danis.oop.Floor;
import com.danis.oop.House;
import com.danis.oop.Room;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(false);
        Room room2 = new Room(true);
        Room[] rooms1 = new Room[]{room1, room2};
        Room room3 = new Room(false);
        Room room4 = new Room(true);
        Room room5 = new Room(true);
        Room[] rooms2 = new Room[]{room3, room4, room5};

        Flat flat1 = new Flat(1, rooms1);
        Flat flat2 = new Flat(2, rooms2);
        Flat[] flats1 = new Flat[]{flat1};
        Flat[] flats2 = new Flat[]{flat2};

        Floor floor1 = new Floor(1, flats1);
        Floor floor2 = new Floor(2, flats2);
        Floor[] floors = new Floor[]{floor1, floor2};

        House house = new House(100, floors);

        printAllInformation(house);
    }

    private static void printAllInformation(House house) {
        System.out.println("В доме №" + house.getNumber() + " " + house.getFloors().length + " этажа(ей).");
        for (Floor floor: house.getFloors()
             ) {
            System.out.print(" ");
            floor.print();
            for (Flat flat: floor.getFlats()
                 ) {
                System.out.print("  ");
                flat.print();
                for (Room room: flat.getRooms()
                     ) {
                    System.out.print("   ");
                    room.print();
                }
            }
        }
    }
}
