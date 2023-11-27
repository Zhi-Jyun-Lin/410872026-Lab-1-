public class Product {
    private String PName;
    private int Price;

    // Default constructor
    public Product() {
    }

    // Constructor with parameters
    public Product(String pname, int price) {
        this.PName = pname;
        this.Price = price;
    }

    // Getter methods
    public String getName() {
        return PName;
    }

    public int getPrice() {
        return Price;
    }
}