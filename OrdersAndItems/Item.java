public class Item {
    private String name;
    private double price;

    public Item (double price, String name){
        this.price = price;
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}