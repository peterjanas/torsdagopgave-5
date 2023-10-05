package task3;




import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(10,10,10);
        Room room2 = new Room(15,15,15);
        Room room3 = new Room(25,25,25);

        ArrayList<Room> listOfRooms = new ArrayList<>();

        listOfRooms.add(room1);
        listOfRooms.add(room2);
        listOfRooms.add(room3);
        Building building1 = new Building(listOfRooms, 5,10,true);

countLampsInBuilding(building1);
isNormal(building1);
    }
    public static void countLampsInBuilding(Building building) {

        int total = 0;
        for (Room s : building.getRooms()) {
            total = total + s.getNumberOfLamps();
        }
        System.out.println(total);
    }

    public static boolean isNormal(Building building) {

        if (building.getNumberOfFloors() > building.getRooms().size()) {
            System.out.println("is normal");
            return true;
        }
        else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}
