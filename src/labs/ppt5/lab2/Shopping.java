package labs.ppt5.lab2;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart(3);
        boolean wantToShop = true;

        do {
            System.out.println("Enter the name, price, and quantity of the item that you want to buy.");
            Item item = new Item(scan.next(), scan.nextDouble(), scan.nextInt());
            cart.addToCart(item);
            System.out.println(cart);
            System.out.println("Enter (quit) to stop shopping or anything to continue: ");
            if (scan.next().equalsIgnoreCase("quit")) {
                wantToShop = false;
            }
        } while (wantToShop);

        System.out.println("\n========== ==========\nThanks for shopping!\n" + "Please pay $" + cart.getTotalPrice() + " for what you shopped! \n========== ==========");

    }
}
