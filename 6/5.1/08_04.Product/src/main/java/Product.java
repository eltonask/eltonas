public class Product {
   private String name;
   private int quantity;
   private double price;

    public Product (String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.quantity = initialQuantity;
        this.price = initialPrice;
    }
    public String getName(){
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void printProduct(){
        System.out.println(name + ", price " + price + ", " + quantity +" pcs");
    }

}
