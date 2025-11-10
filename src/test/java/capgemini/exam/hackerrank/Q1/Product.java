package capgemini.exam.hackerrank.Q1;

public class Product {
    private String item;
    private int price;
    private int available;
    private int discount;
    private String category;
    private String barcode;

    // Constructors
    public Product() {}

    public Product(String item, int price, int available, int discount, String category, String barcode) {
        this.item = item;
        this.price = price;
        this.available = available;
        this.discount = discount;
        this.category = category;
        this.barcode = barcode;
    }

    // Getters and Setters
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return "Product{" +
                "item='" + item + '\'' +
                ", price=" + price +
                ", available=" + available +
                ", discount=" + discount +
                ", category='" + category + '\'' +
                ", barcode='" + barcode + '\'' +
                '}';
    }
}
