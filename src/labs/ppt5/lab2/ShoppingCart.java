package labs.ppt5.lab2;

public class ShoppingCart {

    private Item[] cart;
    private int capacity;
    private int itemCount;
    private double totalPrice;

    public ShoppingCart(int capa) {
        capacity = capa;
        cart = new Item[capacity];
        itemCount = 0;
        totalPrice = 0;
    }

    private void increaseSize() {
        Item[] newCart = new Item[cart.length + 3];
        for (int i = 0; i < cart.length; i++) {
            newCart[i] = cart[i];
        }
        cart = newCart;
    }

    public void addToCart(Item item) {
        if (itemCount == cart.length){
            increaseSize();
        }
        cart[itemCount] = item;
        itemCount++;
        totalPrice += item.getPrice() * item.getQuantity();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String toString() {
        String desc = "\n----------------------------------------\n" +
                "\t\t\tShopping Cart" +
                "\nItem" +
                "\tUnit Price" +
                "\tQuantity" +
                "\tTotal\n";
        for (int i = 0; i < itemCount; i++) {
            desc += cart[i].toString() + "\n";
        }
        desc += "\nTotal Price of cart: $" + totalPrice + "\n----------------------------------------\n";
        return desc;
    }
}
