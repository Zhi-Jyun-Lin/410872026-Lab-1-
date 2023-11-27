public class Book {

    private String bname;
    private String isbn;
    private int price;

    // Constructor
    public Book(String bname, String isbn, int price) {
        this.bname = bname;
        this.isbn = isbn;
        this.price = price;
    }

    // Getter methods
    public String get_bname() {
        return bname;
    }

    public String get_isbn() {
        return isbn;
    }

    public int get_price() {
        return price;
    }

    // Calculate and return shipping cost
    public int get_shipping() {
    	if (price > 100) {
    	    return 50;
    	} else {
    	    return 20;
    	}
    }
}
