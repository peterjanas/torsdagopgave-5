package task3;
import java.util.ArrayList;
public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    Room(int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

}
