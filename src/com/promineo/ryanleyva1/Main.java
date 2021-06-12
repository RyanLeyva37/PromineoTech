package com.promineo.ryanleyva1;

public class Main {

    public static void main(String[] args) {
        int availablePlaneSeats = 5;

        double costOfGroceries = 23.64;

        char customerMiddleInitial = 'C';

        boolean isHotOutside = false;

        String customerFirstName = "John";

        String streetAddress = "12321 W Dirt Ave";

        System.out.println("Available plain seats: " + availablePlaneSeats);
        System.out.println("Cost of groceries: " + costOfGroceries);
        System.out.println("Middle initial: " + customerMiddleInitial);
        System.out.println("isHotOutside: " + isHotOutside);
        System.out.println("Customer first name: " + customerFirstName);
        System.out.println("Street Address: " + streetAddress);

        availablePlaneSeats -= 2;
        costOfGroceries += 2.15;
        customerMiddleInitial = 'J';
        isHotOutside = !isHotOutside;
        String customerFullName = customerFirstName +" "+ customerMiddleInitial + " Doe";

        System.out.println("Available Plane Seats: " + availablePlaneSeats);
        System.out.println("Cost of Groceries: " + costOfGroceries);
        System.out.println("Middle Initial: " + customerMiddleInitial);
        System.out.println("Is it hot outside: " + isHotOutside);
        System.out.println("Customer Full Name: " + customerFullName);
        System.out.println("This is " + customerFullName + "and he lives on " + streetAddress);
    }
}
