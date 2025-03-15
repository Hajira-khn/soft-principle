import java.util.List;
import java.util.ArrayList;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
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
            total += item.getPrice();
        }
        return total;
    }
}

public class Withoutprinciple{
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new Item("Laptop", 1000));
        order.addItem(new Item("Mouse", 50));

        System.out.println("Total Price: $" + order.calculateTotalPrice());
    }
}