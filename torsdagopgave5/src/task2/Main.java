package task2;

import task3.Room;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();
        System.out.println(cafe.coffeeMenu);
    }


}
