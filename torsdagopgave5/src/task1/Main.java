package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        Customer Customer1 = new Customer("Peter ", "Janas ", "Pepandekage");
        Customer Customer2 = new Customer("Bob ", "Bobby ", "BOOBI");
        customers.add(Customer1);
        customers.add(Customer2);
        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer s : customers) {
            System.out.println(s);
        }

    }
}

