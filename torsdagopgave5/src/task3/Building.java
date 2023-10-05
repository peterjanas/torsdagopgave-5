package task3;

import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;
    private int numberOfBathroom;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    Building(ArrayList<Room> rooms, int numberOfBathroom, int numberOfFloors, boolean isOfficeBuilding){
        this.rooms = rooms;
        this.numberOfBathroom = numberOfBathroom;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathroom() {
        return numberOfBathroom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean getIsOfficeBuilding() {
        return isOfficeBuilding;
    }
}
