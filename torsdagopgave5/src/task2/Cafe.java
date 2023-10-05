package task2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() {
        File file = new File("coffees.txt");

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                //coffeeMenu.add(scan.nextLine());
                String CoffeeList = scan.nextLine();
                coffeeMenu.add(CoffeeList);
            }

        } catch (Exception e) {
            System.out.println("File not found. Check dit shit");
            System.out.println(e.getMessage());
        }
    }


}


