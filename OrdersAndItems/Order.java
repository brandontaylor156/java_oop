import java.util.ArrayList;
public class Order{
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order(String name, double total, boolean ready){
        this.name = name;
        this.total = total;
        this.ready = ready;
    }

    public void addItem(Item item){
        System.out.println("hi");
        items.add(item);
        this.total += item.getPrice();
    }

    public double getTotal(){
        return total;
    }

    public String getName(){
        return name;
    }

    public boolean getStatus(){
        return ready;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setStatus(boolean status){
        ready = status;
    }

}