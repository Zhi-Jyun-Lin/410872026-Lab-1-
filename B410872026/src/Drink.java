
 public class Drink extends Product {
    private int Volumn;

    // Default constructor
    public Drink() {
        super(); // Call the constructor of the superclass (Product)
    }

    // Constructor with parameters
    public Drink(String pname, int price, int volumn) {
        super(pname, price); // Call the constructor of the superclass (Product) with pname and price
        this.Volumn = volumn;
    }

    // Getter method specific to Drink class
    public int getVolumn() {
        return Volumn;
    }
}