package labs.ppt5.lab3;

// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import labs.ppt5.lab2.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<Item>();

        Item item;
        String itemName;
        double itemPrice;
        int quantity;

        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();

            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();

            // *** create a new item and add it to the cart
            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);

            // *** print the contents of the cart object using println
            for (Item item1 : cart) {
                System.out.println(item1);
            }

            System.out.print("Continue shopping (y/n)? \n\n");
            keepShopping = scan.next();
        }
        while (keepShopping.equals("y"));

        int totalPrice = 0;
        for (Item item1 : cart) {
            totalPrice += item1.getQuantity() * item1.getPrice();
        }
        System.out.println("Total price: " + totalPrice);


    }
}
