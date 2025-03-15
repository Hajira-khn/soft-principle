import java.util.List;
import java.util.ArrayList;

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() 
    {

        return price * quantity;
    }
}
class Order {
    private List<Item> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }
}

public class Withprinciple {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item("Laptop", 1000, 1));
        order.addItem(new Item("Mouse", 50, 2));

        System.out.println("Total Price: $" + order.calculateTotalPrice());
    }
}