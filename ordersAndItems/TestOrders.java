import java.util.ArrayList;
import java.text.NumberFormat;

public class TestOrders {
    public static void main(String[] args) {

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
    
        Item item1 = new Item(3.5, "sandwich");
        Item item2 = new Item(4.2, "bacon");
        Item item3 = new Item(3.7, "cappucino");
        Item item4 = new Item(4.5, "latte");

        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Brandon", 12.5, false);
        Order order2 = new Order("Jimmy", 3.5, false);
        Order order3 = new Order("Tyler", 7.8, false);
        Order order4 = new Order("Andy", 5.6, false);

        order2.addItem(item1);
        order3.addItem(item3);
        order4.addItem(item4);
        order2.setStatus(true);

        System.out.println(formatter.format(order2.getTotal()));
        System.out.println((order2.getItems()));
    }
}
